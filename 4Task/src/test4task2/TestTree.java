package test4task2;

import test.sample.*;
import java.text.ParseException;

public class TestTree {
    void boxing(String testString) throws ParseException{
        Parser parser = new Parser();
        try {
            Tree tree = parser.parse(testString);
            if(tree.toString().equals(testString)) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } catch (Throwable e) {
            System.out.println("Failed");
        }
    }
    void failBoxing(String testString) throws ParseException {
        Parser parser = new Parser();
        try {
            Tree tree = parser.parse(testString);
            System.out.println("Failed");
        } catch (Throwable e) {
            System.out.println("Passed : " + e.getMessage());
        }
    }
    public static void main(String argv[]) throws ParseException{
        TestTree testTree =  new TestTree();
        //conc
        testTree.boxing("a");

        //multipleconc
        testTree.boxing("asdaertert");
        //or
        testTree.boxing("a|b");
        //multipleor
        testTree.boxing("a|b|d|e");
        //clos
        testTree.boxing("a*");
        //mutlipleclos
        testTree.boxing("a*b*c*");
        //bordertest
        testTree.boxing("a|dd");
        //plus
        //testTree.boxing("a+");
        //multipleplus
        //testTree.boxing("a+(a+b)+");
        //quest
        //testTree.boxing("a?");
        //multiplequest
        //testTree.boxing("a?b?(a?c)?");
        //stresstest1
        testTree.boxing("(a|d)*sdddeqwe(a|d)*");
        //failtest1
        testTree.failBoxing("a)");
        //failtest2
        testTree.failBoxing("(a");
        //failtest3
        testTree.failBoxing("a|");
        //failtest4
        testTree.failBoxing("|a");
        //failtest5
        //testTree.failBoxing("?");
        //failtest6
        testTree.failBoxing("+");
    }
}
