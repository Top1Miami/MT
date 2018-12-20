package main.classes4gram;

import main.gen.CreateLexer;
import main.gen.CreateParser;
import main.generatedLexerParser.Gram4GramLexer;
import main.generatedLexerParser.Gram4GramParser;
import main.gen.CreateToken;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Dima on 16.12.2018.
 */
public class Main {
    public static void main(String[] argv) throws IOException, GeneratedParserException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader("src\\main\\classes4gram\\test1.text"));
        String test;
        StringBuilder all = new StringBuilder();
        while((test = reader.readLine()) != null) {
            all.append(test);
        }
        System.out.println(all);
        Gram4GramLexer lexer = new Gram4GramLexer(CharStreams.fromString(all.toString()));
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
//        System.out.println(gram.toString());
        CreateToken createToken = new CreateToken();
        CreateLexer createLexer = new CreateLexer();
        CreateParser createParser = new CreateParser();
        createToken.create(gram, "test\\sample");
        createLexer.create(gram, "test\\sample");
        createParser.create(gram, "test\\sample");
    }
}
