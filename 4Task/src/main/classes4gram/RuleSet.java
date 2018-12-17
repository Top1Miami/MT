package main.classes4gram;

import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Created by Dima on 16.12.2018.
 */
public class RuleSet {
    ArrayList<Rule> ruleSet = new ArrayList<>();
    String name;

    public RuleSet(String name) {
        ruleSet.add(new Rule());
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

    public ArrayList<Rule> get() {
        return ruleSet;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" -> ");
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
    public Pair<String, Rule> get(int ind) {
        return new Pair(name, ruleSet.get(ind));
    }
}
