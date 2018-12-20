package main.gen;

import main.classes4gram.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;

/**
 * Created by Dima on 19.12.2018.
 */
public class CreateParser {
    public CreateParser() {
    }

    public void create(Grammar grammar, String dir) throws IOException, GeneratedParserException {
        String filePath = "src\\" + dir + "\\" + "Parser.java";
        File fileC = new File("src\\" + dir);
        fileC.mkdirs();
        dir = dir.replaceAll("\\\\", ".");
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
        bfwriter.write("import java.text.ParseException;\n");
        //class declaration
        bfwriter.write("public class Parser {\n");
        bfwriter.write("\tLexicalAnalyzer lex;\n");
        checkForNewClasses(bfwriter, grammar);
        for (RuleSet ruleSet : grammar.ruleList) {
            bfwriter.write("\t" + ruleSet.getType() + " " + ruleSet.name);
            if (ruleSet.args != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("( ");
                for (Argument arg : ruleSet.args) {
                    sb.append(arg.type).append(" ").append(arg.value).append(", ");
                }
                sb.deleteCharAt(sb.length());
                sb.append(")");
            } else {
                bfwriter.write("()");
            }
            boolean marker = false;
            bfwriter.write(" throws ParseException {\n");
            if (!ruleSet.getType().equals("void")) {
                if (ruleSet.retArgs.get(0).value.equals("new class")) {
                    bfwriter.write("\t\t" + ruleSet.retArgs.get(0).type + " returnValue = new " + ruleSet.retArgs.get(0).type + "();\n");
                    marker = true;
                } else {
                    String type = ruleSet.retArgs.get(0).type;
                    bfwriter.write("\t\t" + type + " " + ruleSet.retArgs.get(0).value + ";\n");
                }
            }
            bfwriter.write("\t\tswitch(lex.getToken()) {\n");
            printCase(grammar, ruleSet, bfwriter, marker);
            if (ruleSet.getEps()) {
                HashSet<String> temport = grammar.follow.get(ruleSet.name);
                if (!temport.isEmpty()) {
                    for (String str : temport) {
                        bfwriter.write("\t\t\tcase " + str + ":\n");
                    }
                    for (Rule rule : ruleSet.ruleSet) {
                        if (grammar.getFirstByRule.get(rule).contains("EPS")) {
                            if (rule.code != null)
                                bfwriter.write("\t\t\t\t" + rule.code.substring(1, rule.code.length() - 1) + "\n");
                        }
                    }
                    bfwriter.write("\t\t\t\treturn");
                    if (ruleSet.getType().equals("void")) {
                        bfwriter.write(";\n");
                    } else {
                        if (marker) {
                            bfwriter.write(" returnValue;\n");
                        } else {
                            bfwriter.write(" " + ruleSet.retArgs.get(0).value + ";\n");
                        }
                    }
                }
            }
            bfwriter.write("\t\t\tdefault:\n");
            bfwriter.write("\t\t\t\tthrow new AssertionError();\n");
            bfwriter.write("\t\t}\n");
            bfwriter.write("\t}\n");
        }
        String retTYP = "";
        for (RuleSet ruleSet : grammar.ruleList) {
            if (ruleSet.name.equals(grammar.startNonTerm)) {
                retTYP = ruleSet.getType();
            }
        }
        bfwriter.write("\tpublic " + retTYP + " parse(String input) throws ParseException { \n");
        bfwriter.write("\t\tlex = new LexicalAnalyzer(input);\n");
        bfwriter.write("\t\tlex.nextToken();\n");
        if (!retTYP.equals("void")) {
            bfwriter.write("\t\t" + retTYP + " start = " + grammar.startNonTerm + "();\n");
        } else {
            bfwriter.write("\t\t" + grammar.startNonTerm + "();\n");
        }
        bfwriter.write("\t\tif(lex.getToken() != Token.END) throw new AssertionError();\n");
        if (!retTYP.equals("void")) {
            bfwriter.write("\t\treturn start;\n");
        } else {
            bfwriter.write("\t\treturn;\n");
        }
        bfwriter.write("\t}\n");
        bfwriter.write("\tString getValueToken(Token token) throws ParseException {\n");
        bfwriter.write("\t\tif(lex.getToken() != token) throw new ParseException(\"Wrong token\", lex.getPos());\n");
        bfwriter.write("\t\tString text = lex.getCurText();\n");
        bfwriter.write("\t\tlex.nextToken();\n");
        bfwriter.write("\t\treturn text;\n");
        bfwriter.write("\t}\n");
        bfwriter.write("}\n");
        bfwriter.flush();
    }


    public void printCase(Grammar grammar, RuleSet ruleSet, BufferedWriter bfwriter, boolean marker) throws IOException, GeneratedParserException {
        for (Rule rule : ruleSet.ruleSet) {
            boolean eps = false;
            for (String first : grammar.getFirstByRule.get(rule)) {
                if (!first.equals("EPS")) {
                    bfwriter.write("\t\t\tcase " + first + " :\n");
                } else {
                    eps = true;
                }
            }
            if (eps) continue;
            for (Literal lit : rule.lit) {
                if (grammar.checkTerm(lit.name)) {
                    bfwriter.write("\t\t\t\tString " + lit.name + " = getValueToken(Token." + lit.name + ");\n");
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("\t\t\t\t");
                    String retType = grammar.nextRuleSet(lit.name).getType();
                    if (!retType.equals("void")) {
                        sb.append(retType).append(" ").append(lit.name).append(" = ");
                    }
                    sb.append(lit.name).append("(");
                    if (lit.params != null) {
                        for (int i = 0; i < lit.params.size() - 1; i++) {
                            sb.append(lit.params.get(i)).append(", ");
                        }
                        sb.append(lit.params.get(lit.params.size() - 1));
                    }
                    sb.append(");\n");
                    bfwriter.write(sb.toString());
//                    System.out.println(sb);
                }
            }
            if(rule.code != null) {
                bfwriter.write("\t\t\t\t" + rule.code.substring(1, rule.code.length() - 1) + "\n");
            }

            bfwriter.write("\t\t\t\treturn");
            if (ruleSet.getType().equals("void")) {
                bfwriter.write(";\n");
            } else {
                if(!ruleSet.retArgs.get(0).value.equals("new class")) {
                    bfwriter.write(" " + ruleSet.retArgs.get(0).value + ";\n");
                } else {
                    bfwriter.write(" returnValue;\n");
                }
            }
        }
    }


    public void checkForNewClasses(BufferedWriter bfwriter, Grammar grammar) throws IOException {
        for (RuleSet ruleSet : grammar.ruleList) {
            if (ruleSet.retArgs != null) {
                Argument arg0 = ruleSet.retArgs.get(0);
                if (arg0.value.equals("new class")) {
                    bfwriter.write("\tpublic class " + arg0.type + "{\n");
                    for (int i = 1; i < ruleSet.retArgs.size(); i++) {
                        bfwriter.write("\t\t" + ruleSet.retArgs.get(i).type + " " + ruleSet.retArgs.get(i).value + ";\n");
                    }
                }
            }
            if (ruleSet.args != null) {

                Argument arg00 = ruleSet.args.get(0);
                if (arg00.value.equals("new class")) {
                    bfwriter.write("\tpublic class " + arg00.type + "{\n");
                    for (int i = 1; i < ruleSet.args.size(); i++) {
                        bfwriter.write("\t\t" + ruleSet.args.get(i).type + " " + ruleSet.args.get(i).value + ";\n");
                    }
                }
            }
        }
    }
}
