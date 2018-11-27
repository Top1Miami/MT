package main;

import guru.nidi.graphviz.attribute.Color;
import guru.nidi.graphviz.attribute.Style;
import guru.nidi.graphviz.engine.Format;
import guru.nidi.graphviz.engine.Graphviz;
import guru.nidi.graphviz.engine.GraphvizJdkEngine;
import guru.nidi.graphviz.model.MutableGraph;
import guru.nidi.graphviz.model.MutableNode;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import static guru.nidi.graphviz.model.Factory.mutGraph;
import static guru.nidi.graphviz.model.Factory.mutNode;

/**
 * Created by Dima on 26.11.2018.
 */
public class TreeVisualizer {
    void buildGraph(Tree root)throws IOException {
        buildGraph(root, "sample");
    }
    void buildGraph(Tree root, String fileName) throws IOException{
        MutableNode graphRoot = mutNode(root.getName());
        for(Tree child : root.children) {
            graphRoot.addLink(recursiveCall(child));
        }
        MutableGraph graph = mutGraph("main.Tree").add(graphRoot);
        StringBuilder file = new StringBuilder(fileName);
        file.append(".png");
        Graphviz.useEngine(Collections.singletonList(new GraphvizJdkEngine()));
        Graphviz.fromGraph(graph).render(Format.PNG).toFile(new File(file.toString()));
    }
    MutableNode recursiveCall(Tree curNode) {
        MutableNode graphNode = mutNode(Integer.toString(curNode.hashCode()));
        graphNode.add("label", curNode.getName());
        if(curNode.children.isEmpty()) {
            setColor(curNode, graphNode);
//            graphNode.add("color", Color.PINK).add("style", Style.FILLED);
        } else {
            for (Tree child : curNode.children) {
                graphNode.addLink(recursiveCall(child));
            }
        }
        return graphNode;
    }
    private void setColor(Tree curNode, MutableNode graphNode) {
        String name = curNode.getName();
        if(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
            graphNode.attrs().add(Color.BLUEVIOLET, Style.BOLD);
        } else {
            graphNode.attrs().add(Color.PINK, Style.FILLED);
        }
    }
}
