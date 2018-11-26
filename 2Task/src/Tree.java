import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dima on 26.11.2018.
 */
public class Tree {
    String node;
    List<Tree> children;

    public Tree(String node, Tree... children) {
        this.node = node;
        this.children = Arrays.asList(children);
    }

    public Tree(String node) {
        this.node = node;
        children = new ArrayList<>();
    }
    public Tree(int node) {
        this.node = Integer.toString(node);
        children = new ArrayList<>();
    }


    public String getName() {
        return node;
    }
}
