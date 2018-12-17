package main.classes4gram;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by Dima on 16.12.2018.
 */
public class Grammar {
    public ArrayList<RuleSet> ruleList;
    public ArrayList<Lexem> lexemList;
    String startNonTerm;
    public Grammar(String start) {
        startNonTerm = start;
    }
    public void setRules(ArrayList<RuleSet> rl) {
        ruleList = rl;
    }
    public void setLexems(ArrayList<Lexem> ll) {
        lexemList = ll;
    }
    public void build() {
        createNonTermList();
        buildFirst();
        buildFollow();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (ruleList.size() > 1) {
            for (int i = 0; i < ruleList.size() - 1; i++) {
                sb.append(ruleList.get(i)).append("\n");
            }
            sb.append(ruleList.get(ruleList.size() - 1));
        } else {
            sb.append(ruleList.get(0));
        }
        return sb.toString();
    }

    HashMap<String, HashSet<String>> first = new HashMap<>();
    HashMap<String, HashSet<String>> follow = new HashMap<>();

//    ArrayList<Pair<String, Rule>> termList = new ArrayList<>();
    ArrayList<Pair<String, Rule>> nonTermList = new ArrayList<>();

    private void createNonTermList() {
        for (int i = 0; i < ruleList.size(); i++) {
            for (int j = 0; j < ruleList.get(i).get().size(); j++) {
                nonTermList.add(ruleList.get(i).get(j));
            }
        }
    }

    private void buildFirst() {
        boolean changed = true;
//        System.out.println(nonTermList.size());
        while (changed) {
            changed = false;
            for (int i = 0; i < nonTermList.size(); i++) {
                String name = nonTermList.get(i).getKey();
                Rule rule = nonTermList.get(i).getValue();
                HashSet<String> temp;
                if (first.containsKey(name)) {
                    temp = first.remove(name);
                } else {
                    temp = new HashSet<>();
                }
//                System.out.println(name + " -> " + rule);
                String firstInRule = rule.lit.get(0);
//                System.out.println(firstInRule);
                if ((checkTerm(firstInRule)) || firstInRule.equals("EPS")) {
                    if (temp.add(firstInRule)) {
                        changed = true;
                    }
                } else {
                    if (first.containsKey(firstInRule)) {
                        if (temp.addAll(first.get(firstInRule))) {
                            changed = true;
                        }
                        for (int j = 0; j < rule.lit.size() - 1; j++) {
                            String nextInRule = rule.lit.get(j);
                            if (first.containsKey(nextInRule)) {
                                if (first.get(nextInRule).contains("EPS")) {
                                    String nextNext = rule.lit.get(j + 1);
                                    if (first.containsKey(nextNext)) {
                                        if (temp.addAll(first.get(nextNext))) {
                                            changed = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                first.put(name, temp);
            }
        }
    }

    private void buildFollow() {
        HashSet<String> template = new HashSet<>();
        template.add("$");
        follow.put(startNonTerm, template);
        boolean changed = true;
        while(changed) {
            changed = false;
            for(int i = 0; i < nonTermList.size();i++) {
                String name = nonTermList.get(i).getKey();
                Rule rule = nonTermList.get(i).getValue();
                for(int j = 0; j < rule.lit.size() - 1;j++) {
                    HashSet<String> temp;
                    String curNode = rule.lit.get(j);
//                    System.out.println(curNode);
                    if(checkTerm(curNode) || curNode.equals("EPS")) continue;
                    if(follow.containsKey(curNode)) {
                        temp = follow.remove(curNode);
                    } else {
                        temp = new HashSet<>();
                    }
                    String nextNode = rule.lit.get(j + 1);
                    boolean hasEps = false;
                    if(checkTerm(nextNode)) {
                        if(temp.add(nextNode)) {
                            changed = true;
                        }
                    } else {
//                        System.out.println(curNode + " " + nextNode);
                        HashSet<String> nextTemp = new HashSet<>(first.get(nextNode));
                        hasEps = nextTemp.remove("EPS");
//                        System.out.println(nextTemp);
                        if(temp.addAll(nextTemp)) {
                            changed = true;
                        }
                    }
                    if(hasEps) {
                        for(int k = j + 1;k < rule.lit.size();k++) {
                            String nextNext = rule.lit.get(k);
                            if(checkTerm(nextNext) || !first.get(nextNext).contains("EPS")) {
                                hasEps = false;
                            }
                        }
                    }
                    if(hasEps) {
                        if(follow.containsKey(name)) {
                            if(temp.addAll(follow.get(name))) {
                                changed = true;
                            }
                        }
                    }
//                    System.out.println(temp);
                    follow.put(curNode,temp);
//                    System.out.println(follow);
                }
                HashSet<String> temp;
                String curNode = rule.lit.get(rule.lit.size() - 1);
                //System.out.println(curNode);
                if(checkTerm(curNode) || curNode.equals("EPS")) continue;
                if(follow.containsKey(curNode)) {
                    temp = follow.remove(curNode);
                } else {
                    temp = new HashSet<>();
                }
                if(follow.containsKey(name)) {
                    if(temp.addAll(follow.get(name))) {
                        changed = true;
                    }
                }
                follow.put(curNode, temp);
            }
        }
    }

    private boolean checkTerm(String input) {
        return (input.charAt(0) >= 'A' && input.charAt(0) <= 'Z');
    }
}
