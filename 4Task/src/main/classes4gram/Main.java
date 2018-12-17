package main.classes4gram;

import main.generatedLexerParser.Gram4GramLexer;
import main.generatedLexerParser.Gram4GramParser;
import main.generators.CreateToken;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Dima on 16.12.2018.
 */
public class Main {
    public static void main(String[] argv) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String test = reader.readLine();
        Gram4GramLexer lexer = new Gram4GramLexer(CharStreams.fromString(test));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Gram4GramParser parser = new Gram4GramParser(tokens);
//        String parsed = parser.begin().gram.toString();
//        System.out.println(parsed);

        Grammar gram = parser.begin().gram;
        gram.build();
        System.out.println("Follow");
        System.out.println(gram.follow);
        System.out.println("First");
        System.out.println(gram.first);
        System.out.println(gram.lexemList);
        CreateToken createToken = new CreateToken();

        createToken.create("Sample", gram, "src\\test\\sample");
    }
}
