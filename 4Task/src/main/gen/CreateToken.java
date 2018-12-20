package main.gen;

import main.classes4gram.Grammar;

import java.io.*;

/**
 * Created by Dima on 17.12.2018.
 */
public class CreateToken {
    public CreateToken() {
    }

    public void create(Grammar grammar, String dir) throws IOException{
        String filePath = "src\\" + dir + "\\" + "Token.java";
        File fileC = new File("src\\"+ dir);
        fileC.mkdirs();
        dir = dir.replaceAll("\\\\" ,".");
        System.out.println(dir);
        BufferedWriter bfwriter = new BufferedWriter(new FileWriter(filePath));
        String pack = "package " + dir + ";" + "\n\n";
        bfwriter.write(pack);
        bfwriter.write("public enum " + "Token"+ " { " + "\n");
        bfwriter.write("\t");
        if(grammar.lexemList != null) {
            for(int i = 0; i < grammar.lexemList.size() - 1; i++) {
                bfwriter.write(grammar.lexemList.get(i) + ", ");
            }
            bfwriter.write(grammar.lexemList.get(grammar.lexemList.size() - 1) + ", END\n");
        } else {
            bfwriter.write("END\n");
        }
        bfwriter.write("}\n");
        bfwriter.flush();
    }
}
