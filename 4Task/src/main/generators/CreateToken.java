package main.generators;

import main.classes4gram.Grammar;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Dima on 17.12.2018.
 */
public class CreateToken {
    public CreateToken() {
    }

    public void create(String file, Grammar grammar, String dir) throws IOException{
        String filePath = dir + "\\" + file + "Token.java";
        BufferedWriter bfwriter = new BufferedWriter(new FileWriter(filePath));
        String pack = "package " + dir + ";" + "\n\n";
        bfwriter.write(pack);
        bfwriter.write("public enum Token { " + "\n");
        bfwriter.write("\t");
        for(int i = 0; i < grammar.lexemList.size() - 1; i++) {
            bfwriter.write(grammar.lexemList.get(i) + ",");
        }
        bfwriter.write(grammar.lexemList.get(grammar.lexemList.size() - 1) + ";\n");
        bfwriter.write("}\n");
        bfwriter.flush();
    }
}
