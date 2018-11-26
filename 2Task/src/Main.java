import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

/**
 * Created by Dima on 26.11.2018.
 */
public class Main {
    public static void main(String argv[]) throws IOException, ParseException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String text = input.readLine();
        Parser parser = new Parser();
        Tree myTree = parser.parse(text);
        TreeVisualizer treeVisualizer = new TreeVisualizer();
//        System.out.println(myTree.getName());
//        System.out.println(myTree.children.size());
//        System.out.println(myTree.children.get(0).getName());
//        System.out.println(myTree.children.get(1).getName());
//        System.out.println(myTree.children.get(0).children.get(0).getName());
//        System.out.println(myTree.children.get(0).children.get(0).children.get(0).getName());
//        System.out.println(myTree.children.get(0).children.get(0).children.get(0).children.get(0).getName());


        treeVisualizer.buildGraph(myTree, "sample");
    }
}
