import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;

/**
 * Created by Dima on 26.11.2018.
 */
public class Parser {

    LexicalAnalyzer lexer;

    Tree Conc() throws ParseException {
        switch (lexer.getToken()) {
            case LPAREN:
            case LETTER:
                return new Tree("Conc", Smth(), SpConc());
            default:
                throw new ParseException("Unexpected symbol at pos", lexer.getPos());
        }
    }

    Tree Smth() throws ParseException {
        switch (lexer.getToken()) {
            case LPAREN:
            case LETTER:
                return new Tree("Smth", Content(), Closure());
            default:
                throw new ParseException("Unexpected symbol at pos", lexer.getPos());
        }
    }

    Tree SpConc() throws ParseException {
        switch (lexer.getToken()) {
            case LPAREN:
            case LETTER:
                return new Tree("SpConc", ConcDash());
            case OR:
            case RPAREN:
            case END:
                return new Tree("SpConc");
            default:
                throw new ParseException("Unexpected symbol at pos", lexer.getPos());
        }
    }

    Tree Content() throws ParseException {
        switch (lexer.getToken()) {
            case LPAREN:
                lexer.nextToken();
                Tree in = Or();
                if (lexer.getToken() != Token.RPAREN) {
                    throw new ParseException("Closing Parenthesis expected at pos", lexer.getPos());
                }
                lexer.nextToken();
                return new Tree("Content", new Tree("("), in, new Tree(")"));
            case LETTER:
//                System.out.println(Character.toString((char)lexer.getCurChar()));
                Tree curNode = new Tree("Content", new Tree(lexer.getPrevChar()));
                lexer.nextToken();
                return curNode;
            default:
                throw new ParseException("Unexpected symbol at pos", lexer.getPos());
        }
    }

    Tree Closure() throws ParseException {
        switch (lexer.getToken()) {
            case CLOS:
                Tree curNode = new Tree("Closure", new Tree("*"));
                lexer.nextToken();
                return curNode;
            default:
                return new Tree("Closure");
        }
    }

    Tree ConcDash() throws ParseException {
        switch (lexer.getToken()) {
            case LPAREN:
            case LETTER:
                return new Tree("ConcDash", Smth(), SpConc());
            default:
                throw new ParseException("Unexpected symbol at pos", lexer.getPos());
        }
    }

    Tree Or() throws ParseException {
        switch (lexer.getToken()) {
            case LPAREN:
            case LETTER:
                return new Tree("Or", Conc(), Sp());
            default:
                throw new ParseException("Unexpected symbol at pos", lexer.getPos());
        }
    }

    Tree Sp() throws ParseException {
        switch (lexer.getToken()) {
            case OR:
                return new Tree("Sp", OrDash());
            case RPAREN:
            case END:
                return new Tree("Sp");
            default:
                throw new ParseException("Unexpected symbol at pos", lexer.getPos());
        }
    }

    Tree OrDash() throws ParseException {
        switch (lexer.getToken()) {
            case OR:
                lexer.nextToken();
                return new Tree("OrDash", Conc(), Sp());
            default:
                throw new ParseException("Unexpected symbol at pos", lexer.getPos());
        }
    }

    Tree parse(String input) throws ParseException {
        return parse(new ByteArrayInputStream(input.getBytes()));
    }

    Tree parse(InputStream iS) throws ParseException {
        lexer = new LexicalAnalyzer(iS);
//        System.out.println(Character.toString((char)lexer.getCurChar()));
        lexer.nextToken();
//        System.out.println(Character.toString((char)lexer.getCurChar()));

        Tree tree = Or();
        if (lexer.getToken() != Token.END) {
            throw new ParseException("Failed to parse the string to the end", lexer.getPos());
        }
        return tree;
    }
}
