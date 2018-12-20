package test.sample;

import test4task2.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.text.ParseException;

public class LexicalAnalyzer {
	String s;
	int curPos = 0;
	Token curToken;
	HashMap<Token, Pattern> regMap = new HashMap<>();
	Matcher matcher;
	public LexicalAnalyzer(String s) {
		this.s = s;
		regMap.put(Token.A, Pattern.compile("[a-z]"));
		regMap.put(Token.I, Pattern.compile("\\|"));
		regMap.put(Token.S, Pattern.compile("\\*"));
		regMap.put(Token.LP, Pattern.compile("\\("));
		regMap.put(Token.RP, Pattern.compile("\\)"));
	}
	public Token nextToken() throws ParseException {
		if(curPos == s.length()) {
			 curToken = Token.END;
			 return Token.END;
		}
		for(Token token : Token.values()) {
			Pattern curPattern = regMap.get(token);
			matcher = curPattern.matcher(s.substring(curPos));
			if(matcher.lookingAt()) {
				curToken = token;
				curPos += matcher.end() - matcher.start();
				return curToken;
			}
		}
		throw new ParseException("Failed to match Token", curPos);
	}
	public Token getToken() { return curToken; }
	public int getPos() { return curPos; }
	public String getCurText() {
		 return matcher.group();
	}
}
