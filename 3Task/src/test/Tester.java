package test;
import main.generatedParserLexer.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by Dima on 05.12.2018.
 */
public class Tester {
    public static void main(String[] argv) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String test = reader.readLine();
        Tex2MathMLLexer lexer = new Tex2MathMLLexer(CharStreams.fromString(test));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Tex2MathMLParser parser = new Tex2MathMLParser(tokens);
        String parsed = parser.start().expression.toString();
        System.out.println(parsed);
    }
}
