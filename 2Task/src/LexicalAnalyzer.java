import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;

/**
 * Created by Dima on 25.11.2018.
 */
public class LexicalAnalyzer {
    InputStream iS;
    int curChar;
    int curPos;
    Token curToken;
    String prevChar;
    public LexicalAnalyzer(InputStream iS) throws ParseException {
        this.iS = iS;
        curPos = 0;
        nextChar();
    }

    public void nextChar() throws ParseException {
        curPos++;
        try {
            curChar = iS.read();
        } catch (IOException e) {
            throw new ParseException(e.getMessage(), curPos);
        }
    }

    public boolean isBlank(int c) {
        return Character.isWhitespace(c);
    }

    public void nextToken() throws ParseException {
        while (isBlank(curChar)) {
            nextChar();
        }
//        System.out.println(Character.toString((char)curChar));
        switch (curChar) {
            case '(':
                nextChar();
                curToken = Token.LPAREN;
                break;
            case ')':
                nextChar();
                curToken = Token.RPAREN;
                break;
            case '|':
                nextChar();
                curToken = Token.OR;
                break;
            case '*':
                nextChar();
                curToken = Token.CLOS;
                break;
            case -1:
                curToken = Token.END;
                break;
            default:
                if (curChar >= 'a' && curChar <= 'z') {
                    prevChar = Character.toString((char) curChar);
                    nextChar();
                    curToken = Token.LETTER;
                } else {
                    throw new ParseException("Illegal character" + (char) curChar, curPos);
                }
        }
    }
    public String getPrevChar() {
        return prevChar;
    }
    public int getCurChar() {return curChar;}
    public Token getToken() {
        return curToken;
    }
    public int getPos() {
        return curPos;
    }
}
