package main.gen;

import main.classes4gram.Grammar;
import main.classes4gram.Lexem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Dima on 19.12.2018.
 */
public class CreateLexer {
    public CreateLexer() {
    }

    public void create(Grammar grammar, String dir) throws IOException {
        String filePath = "src\\" + dir + "\\" + "LexicalAnalyzer.java";
        File fileC = new File("src\\"+ dir);
        fileC.mkdirs();
        dir = dir.replaceAll("\\\\" ,".");
        System.out.println(dir);
        BufferedWriter bfwriter = new BufferedWriter(new FileWriter(filePath));
        //package
        String pack = "package " + dir + ";" + "\n\n";
        bfwriter.write(pack);
        //imports
        for(String importStr : grammar.impList) {
            if(importStr != null) {
                bfwriter.write("import " + importStr.substring(1, importStr.length() - 1) + ";\n");
            }
        }
        bfwriter.write("import java.io.IOException;\n");
        bfwriter.write("import java.util.HashMap;\n");
        bfwriter.write("import java.util.regex.Pattern;\n\n");
        bfwriter.write("import java.util.regex.Matcher;\n");
        bfwriter.write("import java.text.ParseException;\n\n");
        //class declaration
        bfwriter.write("public class LexicalAnalyzer {\n");
        //fields declaration
        bfwriter.write("\tString s;\n");
        bfwriter.write("\tint curPos = 0;\n");
        bfwriter.write("\tToken curToken;\n");
        bfwriter.write("\tHashMap<Token, Pattern> regMap = new HashMap<>();\n");
        bfwriter.write("\tMatcher matcher;\n");
        //constructor declaration
        bfwriter.write("\tpublic LexicalAnalyzer(String s) {\n");
        bfwriter.write("\t\tthis.s = s;\n");
        for(Lexem lexem : grammar.lexemList) {
            bfwriter.write("\t\tregMap.put(Token." + lexem.name + ", Pattern.compile(" + lexem.getPattern() + "));\n");
        }
        bfwriter.write("\t}\n");
        //nextToken
        bfwriter.write("\tpublic Token nextToken() throws ParseException {\n");
        bfwriter.write("\t\tif(curPos == s.length()) {\n");
        bfwriter.write("\t\t\t curToken = Token.END;\n");
        bfwriter.write("\t\t\t return Token.END;\n");
        bfwriter.write("\t\t}\n");
        bfwriter.write("\t\tfor(Token token : Token.values()) {\n");
        bfwriter.write("\t\t\tPattern curPattern = regMap.get(token);\n");
        bfwriter.write("\t\t\tmatcher = curPattern.matcher(s.substring(curPos));\n");
        bfwriter.write("\t\t\tif(matcher.lookingAt()) {\n");
        bfwriter.write("\t\t\t\tcurToken = token;\n");
        bfwriter.write("\t\t\t\tcurPos += matcher.end() - matcher.start();\n");
        bfwriter.write("\t\t\t\treturn curToken;\n");
        bfwriter.write("\t\t\t}\n");
        bfwriter.write("\t\t}\n");
        bfwriter.write("\t\tthrow new ParseException(\"Failed to match Token\", curPos);\n");
        bfwriter.write("\t}\n");
        //curToken
        bfwriter.write("\tpublic Token getToken() { return curToken; }\n");
        //curPos
        bfwriter.write("\tpublic int getPos() { return curPos; }\n");

        bfwriter.write("\tpublic String getCurText() {\n");
        bfwriter.write("\t\t return matcher.group();\n");
        bfwriter.write("\t}\n");
        bfwriter.write("}\n");
        bfwriter.flush();
    }
}
