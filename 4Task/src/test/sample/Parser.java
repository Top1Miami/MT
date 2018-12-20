package test.sample;

import test4task2.*;
import java.text.ParseException;
public class Parser {
	LexicalAnalyzer lex;
	Tree conc() throws ParseException {
		Tree v;
		switch(lex.getToken()) {
			case A :
			case LP :
				Tree smth = smth();
				Tree spConc = spConc();
				v = new Tree("Conc", smth, spConc);
				return v;
			default:
				throw new AssertionError();
		}
	}
	Tree spConc() throws ParseException {
		Tree v;
		switch(lex.getToken()) {
			case A :
			case LP :
				Tree concE = concE();
				v = new Tree("SpConc", concE);
				return v;
			case I:
			case END:
			case RP:
				v = new Tree("SpConc");
				return v;
			default:
				throw new AssertionError();
		}
	}
	Tree concE() throws ParseException {
		Tree v;
		switch(lex.getToken()) {
			case A :
			case LP :
				Tree smth = smth();
				Tree spConc = spConc();
				v = new Tree("Or", smth, spConc);
				return v;
			default:
				throw new AssertionError();
		}
	}
	Tree smth() throws ParseException {
		Tree v;
		switch(lex.getToken()) {
			case A :
			case LP :
				Tree content = content();
				Tree closure = closure();
				v = new Tree("Smth", content, closure);
				return v;
			default:
				throw new AssertionError();
		}
	}
	Tree closure() throws ParseException {
		Tree v;
		switch(lex.getToken()) {
			case S :
				String S = getValueToken(Token.S);
				v = new Tree("Closure", new Tree("*"));
				return v;
			case A:
			case LP:
			case I:
			case END:
			case RP:
				v = new Tree("Closure");
				return v;
			default:
				throw new AssertionError();
		}
	}
	Tree content() throws ParseException {
		Tree v;
		switch(lex.getToken()) {
			case LP :
				String LP = getValueToken(Token.LP);
				Tree or = or();
				String RP = getValueToken(Token.RP);
				v = new Tree("Content", new Tree("("), or, new Tree(")"));
				return v;
			case A :
				String A = getValueToken(Token.A);
				v = new Tree("Content", new Tree(A));
				return v;
			default:
				throw new AssertionError();
		}
	}
	Tree or() throws ParseException {
		Tree v;
		switch(lex.getToken()) {
			case A :
			case LP :
				Tree conc = conc();
				Tree sp = sp();
				v = new Tree("Or", conc, sp);
				return v;
			default:
				throw new AssertionError();
		}
	}
	Tree sp() throws ParseException {
		Tree v;
		switch(lex.getToken()) {
			case I :
				Tree orE = orE();
				v = new Tree("Sp", orE);
				return v;
			case END:
			case RP:
				v = new Tree("Sp");
				return v;
			default:
				throw new AssertionError();
		}
	}
	Tree orE() throws ParseException {
		Tree v;
		switch(lex.getToken()) {
			case I :
				String I = getValueToken(Token.I);
				Tree conc = conc();
				Tree sp = sp();
				v = new Tree("OrE", new Tree("|"), conc, sp);
				return v;
			default:
				throw new AssertionError();
		}
	}
	public Tree parse(String input) throws ParseException { 
		lex = new LexicalAnalyzer(input);
		lex.nextToken();
		Tree start = or();
		if(lex.getToken() != Token.END) throw new AssertionError();
		return start;
	}
	String getValueToken(Token token) throws ParseException {
		if(lex.getToken() != token) throw new ParseException("Wrong token", lex.getPos());
		String text = lex.getCurText();
		lex.nextToken();
		return text;
	}
}
