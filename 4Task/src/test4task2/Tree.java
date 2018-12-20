package test4task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dima on 26.11.2018.
 */
public class Tree {
    String node;
    List<Tree> children;
    boolean nonTerminal = false;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
        checkForNonTerminal(node);
        children = new ArrayList<>();
    }
    private void checkForNonTerminal(String content) {
        if(content.charAt(0) >= 'A' && content.charAt(0) <= 'Z') {
            nonTerminal = true;
        }
    }
    public Tree(int node) {
        this.node = Integer.toString(node);
        children = new ArrayList<>();
    }


    public String getName() {
        return node;
    }

    public String toString() {
        if(children.isEmpty() && !nonTerminal) {
            return node;
        } else {
            StringBuilder collector = new StringBuilder();
            for(Tree child : children) {
                collector.append(child.toString());
            }
            return collector.toString();
        }
    }
}
