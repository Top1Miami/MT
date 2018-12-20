package main.classes4gram;

import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Created by Dima on 16.12.2018.
 */
public class RuleSet {
    public ArrayList<Rule> ruleSet = new ArrayList<>();
    public String name;
    public ArrayList<Argument> args;
    public ArrayList<Argument> retArgs;


    public RuleSet(String name) {
        ruleSet.add(new Rule());
        this.name = name;
    }
    public RuleSet(String name, String code) {
        Rule rule = new Rule();
        rule.setCode(code);
        ruleSet.add(rule);
        this.name = name;
    }

    public RuleSet(String name, Rule rule) {
        this.name = name;
        ruleSet.add(rule);
    }

    public RuleSet(String name, Rule rule, ArrayList<Rule> ruleSet) {
        this.name = name;
        this.ruleSet.add(rule);
        this.ruleSet.addAll(ruleSet);
    }
    public String getType() {
        if(retArgs == null) {
            return "void";
        }
        return retArgs.get(0).type;
    }
    public void setArgs(ArrayList<Argument> args) {
        this.args = args;
    }
    public void setRetArgs(ArrayList<Argument> retArgs) {
        this.retArgs = retArgs;
    }

    public ArrayList<Rule> get() {
        return ruleSet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if(!args.isEmpty()) {
            sb.append(" [ ");
            for(int i = 0; i < args.size();i++) {
                sb.append(args.get(i).type).append(" ").append(args.get(i).value);
                if(i!= args.size() - 1) {
                    sb.append(" , ");
                }
            }
            sb.append(" ]");
        }
        if(!retArgs.isEmpty()) {
           sb.append(" _returns [ ");
            for(int i = 0; i < retArgs.size();i++) {
                sb.append(retArgs.get(i).type).append(" ").append(retArgs.get(i).value);
                if(i!= retArgs.size() - 1) {
                    sb.append(" , ");
                }
            }
            sb.append(" ]");
        }
        sb.append(" -> ");
        if (ruleSet.size() > 1) {
            for (int i = 0; i < ruleSet.size() - 1; i++) {
                sb.append(ruleSet.get(i)).append(" | ");
            }
            sb.append(ruleSet.get(ruleSet.size() - 1));
        } else {
            sb.append(ruleSet.get(0));
        }
        return sb.toString();
    }
    public boolean getEps() {
        for(Rule rule : ruleSet) {
            if(rule.epsilon) {
                return true;
            }
        }
        return false;
    }
    public Pair<String, Rule> get(int ind) {
        return new Pair(name, ruleSet.get(ind));
    }
}
