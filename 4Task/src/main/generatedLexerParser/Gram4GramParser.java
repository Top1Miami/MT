// Generated from Gram4Gram.g4 by ANTLR 4.7.1

package main.generatedLexerParser;
import main.classes4gram.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Gram4GramParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NonTerm=1, Term=2, Delim=3, Arr=4, WS=5, Colon=6, Regexp=7;
	public static final int
		RULE_begin = 0, RULE_lexerParser = 1, RULE_lexemList = 2, RULE_singleLexem = 3, 
		RULE_ruleList = 4, RULE_ruleSet = 5, RULE_subRuleSet = 6, RULE_singleRule = 7, 
		RULE_nonTerm = 8, RULE_term = 9;
	public static final String[] ruleNames = {
		"begin", "lexerParser", "lexemList", "singleLexem", "ruleList", "ruleSet", 
		"subRuleSet", "singleRule", "nonTerm", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'|'", "'->'", null, "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NonTerm", "Term", "Delim", "Arr", "WS", "Colon", "Regexp"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gram4Gram.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Gram4GramParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BeginContext extends ParserRuleContext {
		public Grammar gram;
		public Token NonTerm;
		public TerminalNode NonTerm() { return getToken(Gram4GramParser.NonTerm, 0); }
		public LexerParserContext lexerParser() {
			return getRuleContext(LexerParserContext.class,0);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			((BeginContext)_localctx).NonTerm = match(NonTerm);
			((BeginContext)_localctx).gram =  new Grammar((((BeginContext)_localctx).NonTerm!=null?((BeginContext)_localctx).NonTerm.getText():null));
			setState(22);
			lexerParser(_localctx.gram);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexerParserContext extends ParserRuleContext {
		public Grammar gram;
		public RuleListContext list;
		public LexemListContext list1;
		public RuleListContext ruleList() {
			return getRuleContext(RuleListContext.class,0);
		}
		public LexemListContext lexemList() {
			return getRuleContext(LexemListContext.class,0);
		}
		public LexerParserContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public LexerParserContext(ParserRuleContext parent, int invokingState, Grammar gram) {
			super(parent, invokingState);
			this.gram = gram;
		}
		@Override public int getRuleIndex() { return RULE_lexerParser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterLexerParser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitLexerParser(this);
		}
	}

	public final LexerParserContext lexerParser(Grammar gram) throws RecognitionException {
		LexerParserContext _localctx = new LexerParserContext(_ctx, getState(), gram);
		enterRule(_localctx, 2, RULE_lexerParser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((LexerParserContext)_localctx).list = ruleList();
			gram.setRules(((LexerParserContext)_localctx).list.rsl);
			setState(26);
			((LexerParserContext)_localctx).list1 = lexemList();
			gram.setLexems(((LexerParserContext)_localctx).list1.ll);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexemListContext extends ParserRuleContext {
		public ArrayList<Lexem> ll;
		public SingleLexemContext single1;
		public SingleLexemContext single;
		public LexemListContext other;
		public SingleLexemContext singleLexem() {
			return getRuleContext(SingleLexemContext.class,0);
		}
		public LexemListContext lexemList() {
			return getRuleContext(LexemListContext.class,0);
		}
		public LexemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterLexemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitLexemList(this);
		}
	}

	public final LexemListContext lexemList() throws RecognitionException {
		LexemListContext _localctx = new LexemListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lexemList);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				((LexemListContext)_localctx).single1 = singleLexem();
				((LexemListContext)_localctx).ll =  new ArrayList<>();
				_localctx.ll.add(((LexemListContext)_localctx).single1.l);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				((LexemListContext)_localctx).single = singleLexem();
				setState(34);
				((LexemListContext)_localctx).other = lexemList();
				((LexemListContext)_localctx).ll =  new ArrayList<>();
				_localctx.ll.add(((LexemListContext)_localctx).single.l);
				_localctx.ll.addAll(((LexemListContext)_localctx).other.ll);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleLexemContext extends ParserRuleContext {
		public Lexem l;
		public Token Term;
		public Token Regexp;
		public TerminalNode Term() { return getToken(Gram4GramParser.Term, 0); }
		public TerminalNode Colon() { return getToken(Gram4GramParser.Colon, 0); }
		public TerminalNode Regexp() { return getToken(Gram4GramParser.Regexp, 0); }
		public SingleLexemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleLexem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterSingleLexem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitSingleLexem(this);
		}
	}

	public final SingleLexemContext singleLexem() throws RecognitionException {
		SingleLexemContext _localctx = new SingleLexemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleLexem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			((SingleLexemContext)_localctx).Term = match(Term);
			setState(42);
			match(Colon);
			setState(43);
			((SingleLexemContext)_localctx).Regexp = match(Regexp);
			((SingleLexemContext)_localctx).l =  new Lexem((((SingleLexemContext)_localctx).Term!=null?((SingleLexemContext)_localctx).Term.getText():null), (((SingleLexemContext)_localctx).Regexp!=null?((SingleLexemContext)_localctx).Regexp.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleListContext extends ParserRuleContext {
		public ArrayList<RuleSet> rsl;
		public RuleSetContext first;
		public RuleListContext other;
		public RuleSetContext first1;
		public RuleSetContext ruleSet() {
			return getRuleContext(RuleSetContext.class,0);
		}
		public RuleListContext ruleList() {
			return getRuleContext(RuleListContext.class,0);
		}
		public RuleListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterRuleList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitRuleList(this);
		}
	}

	public final RuleListContext ruleList() throws RecognitionException {
		RuleListContext _localctx = new RuleListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ruleList);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				((RuleListContext)_localctx).first = ruleSet();
				setState(47);
				((RuleListContext)_localctx).other = ruleList();
				((RuleListContext)_localctx).rsl =  new ArrayList<>();
				_localctx.rsl.add(((RuleListContext)_localctx).first.rs);
				_localctx.rsl.addAll(((RuleListContext)_localctx).other.rsl);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				((RuleListContext)_localctx).first1 = ruleSet();
				((RuleListContext)_localctx).rsl =  new ArrayList<>();
				_localctx.rsl.add(((RuleListContext)_localctx).first1.rs);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RuleSetContext extends ParserRuleContext {
		public RuleSet rs;
		public Token NonTerm;
		public SingleRuleContext single;
		public SingleRuleContext single1;
		public SubRuleSetContext set;
		public TerminalNode NonTerm() { return getToken(Gram4GramParser.NonTerm, 0); }
		public TerminalNode Arr() { return getToken(Gram4GramParser.Arr, 0); }
		public SingleRuleContext singleRule() {
			return getRuleContext(SingleRuleContext.class,0);
		}
		public TerminalNode Delim() { return getToken(Gram4GramParser.Delim, 0); }
		public SubRuleSetContext subRuleSet() {
			return getRuleContext(SubRuleSetContext.class,0);
		}
		public RuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitRuleSet(this);
		}
	}

	public final RuleSetContext ruleSet() throws RecognitionException {
		RuleSetContext _localctx = new RuleSetContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ruleSet);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(59);
				match(Arr);
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(62);
				match(Arr);
				setState(63);
				((RuleSetContext)_localctx).single = singleRule();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single.r);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(67);
				match(Arr);
				setState(68);
				((RuleSetContext)_localctx).single1 = singleRule();
				setState(69);
				match(Delim);
				setState(70);
				((RuleSetContext)_localctx).set = subRuleSet();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single1.r, ((RuleSetContext)_localctx).set.lr);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubRuleSetContext extends ParserRuleContext {
		public ArrayList<Rule> lr;
		public SingleRuleContext oRule;
		public SingleRuleContext oRule1;
		public SubRuleSetContext other;
		public SubRuleSetContext other1;
		public SingleRuleContext singleRule() {
			return getRuleContext(SingleRuleContext.class,0);
		}
		public TerminalNode Delim() { return getToken(Gram4GramParser.Delim, 0); }
		public SubRuleSetContext subRuleSet() {
			return getRuleContext(SubRuleSetContext.class,0);
		}
		public SubRuleSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subRuleSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterSubRuleSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitSubRuleSet(this);
		}
	}

	public final SubRuleSetContext subRuleSet() throws RecognitionException {
		SubRuleSetContext _localctx = new SubRuleSetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_subRuleSet);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				((SubRuleSetContext)_localctx).oRule = singleRule();
				((SubRuleSetContext)_localctx).lr =  new ArrayList<>();
				_localctx.lr.add(((SubRuleSetContext)_localctx).oRule.r);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				((SubRuleSetContext)_localctx).oRule1 = singleRule();
				setState(80);
				match(Delim);
				setState(81);
				((SubRuleSetContext)_localctx).other = subRuleSet();
				((SubRuleSetContext)_localctx).lr =  new ArrayList<>();
				_localctx.lr.add(((SubRuleSetContext)_localctx).oRule1.r);
				_localctx.lr.addAll(((SubRuleSetContext)_localctx).other.lr);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				((SubRuleSetContext)_localctx).lr =  new ArrayList<>();
				_localctx.lr.add(new Rule());
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(Delim);
				setState(89);
				((SubRuleSetContext)_localctx).other1 = subRuleSet();
				((SubRuleSetContext)_localctx).lr =  new ArrayList<>();
				_localctx.lr.add(new Rule());
				_localctx.lr.addAll(((SubRuleSetContext)_localctx).other1.lr);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleRuleContext extends ParserRuleContext {
		public Rule r;
		public NonTermContext list;
		public TermContext list1;
		public NonTermContext nonTerm() {
			return getRuleContext(NonTermContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SingleRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterSingleRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitSingleRule(this);
		}
	}

	public final SingleRuleContext singleRule() throws RecognitionException {
		SingleRuleContext _localctx = new SingleRuleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singleRule);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonTerm:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((SingleRuleContext)_localctx).list = nonTerm();
				((SingleRuleContext)_localctx).r =  new Rule(((SingleRuleContext)_localctx).list.lit);
				}
				break;
			case Term:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				((SingleRuleContext)_localctx).list1 = term();
				((SingleRuleContext)_localctx).r =  new Rule(((SingleRuleContext)_localctx).list1.lit);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonTermContext extends ParserRuleContext {
		public ArrayList<String> lit;
		public Token NonTerm;
		public NonTermContext list;
		public TermContext list1;
		public TerminalNode NonTerm() { return getToken(Gram4GramParser.NonTerm, 0); }
		public NonTermContext nonTerm() {
			return getRuleContext(NonTermContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NonTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterNonTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitNonTerm(this);
		}
	}

	public final NonTermContext nonTerm() throws RecognitionException {
		NonTermContext _localctx = new NonTermContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nonTerm);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				((NonTermContext)_localctx).NonTerm = match(NonTerm);
				setState(105);
				((NonTermContext)_localctx).list = nonTerm();
				((NonTermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add((((NonTermContext)_localctx).NonTerm!=null?((NonTermContext)_localctx).NonTerm.getText():null));
				_localctx.lit.addAll(((NonTermContext)_localctx).list.lit);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				((NonTermContext)_localctx).NonTerm = match(NonTerm);
				setState(111);
				((NonTermContext)_localctx).list1 = term();
				((NonTermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add((((NonTermContext)_localctx).NonTerm!=null?((NonTermContext)_localctx).NonTerm.getText():null));
				_localctx.lit.addAll(((NonTermContext)_localctx).list1.lit);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(116);
				((NonTermContext)_localctx).NonTerm = match(NonTerm);
				((NonTermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add((((NonTermContext)_localctx).NonTerm!=null?((NonTermContext)_localctx).NonTerm.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public ArrayList<String> lit;
		public Token Term;
		public TermContext list;
		public NonTermContext list1;
		public TerminalNode Term() { return getToken(Gram4GramParser.Term, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NonTermContext nonTerm() {
			return getRuleContext(NonTermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				((TermContext)_localctx).Term = match(Term);
				setState(122);
				((TermContext)_localctx).list = term();
				((TermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add((((TermContext)_localctx).Term!=null?((TermContext)_localctx).Term.getText():null));
				_localctx.lit.addAll(((TermContext)_localctx).list.lit);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((TermContext)_localctx).Term = match(Term);
				setState(128);
				((TermContext)_localctx).list1 = nonTerm();
				((TermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add((((TermContext)_localctx).Term!=null?((TermContext)_localctx).Term.getText():null));
				_localctx.lit.addAll(((TermContext)_localctx).list1.lit);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				((TermContext)_localctx).Term = match(Term);
				((TermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add((((TermContext)_localctx).Term!=null?((TermContext)_localctx).Term.getText():null));
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\u008d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\ti\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nz\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u008b\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2\u008e\2\26"+
		"\3\2\2\2\4\32\3\2\2\2\6)\3\2\2\2\b+\3\2\2\2\n:\3\2\2\2\fK\3\2\2\2\16`"+
		"\3\2\2\2\20h\3\2\2\2\22y\3\2\2\2\24\u008a\3\2\2\2\26\27\7\3\2\2\27\30"+
		"\b\2\1\2\30\31\5\4\3\2\31\3\3\2\2\2\32\33\5\n\6\2\33\34\b\3\1\2\34\35"+
		"\5\6\4\2\35\36\b\3\1\2\36\5\3\2\2\2\37 \5\b\5\2 !\b\4\1\2!\"\b\4\1\2\""+
		"*\3\2\2\2#$\5\b\5\2$%\5\6\4\2%&\b\4\1\2&\'\b\4\1\2\'(\b\4\1\2(*\3\2\2"+
		"\2)\37\3\2\2\2)#\3\2\2\2*\7\3\2\2\2+,\7\4\2\2,-\7\b\2\2-.\7\t\2\2./\b"+
		"\5\1\2/\t\3\2\2\2\60\61\5\f\7\2\61\62\5\n\6\2\62\63\b\6\1\2\63\64\b\6"+
		"\1\2\64\65\b\6\1\2\65;\3\2\2\2\66\67\5\f\7\2\678\b\6\1\289\b\6\1\29;\3"+
		"\2\2\2:\60\3\2\2\2:\66\3\2\2\2;\13\3\2\2\2<=\7\3\2\2=>\7\6\2\2>L\b\7\1"+
		"\2?@\7\3\2\2@A\7\6\2\2AB\5\20\t\2BC\b\7\1\2CL\3\2\2\2DE\7\3\2\2EF\7\6"+
		"\2\2FG\5\20\t\2GH\7\5\2\2HI\5\16\b\2IJ\b\7\1\2JL\3\2\2\2K<\3\2\2\2K?\3"+
		"\2\2\2KD\3\2\2\2L\r\3\2\2\2MN\5\20\t\2NO\b\b\1\2OP\b\b\1\2Pa\3\2\2\2Q"+
		"R\5\20\t\2RS\7\5\2\2ST\5\16\b\2TU\b\b\1\2UV\b\b\1\2VW\b\b\1\2Wa\3\2\2"+
		"\2XY\b\b\1\2Ya\b\b\1\2Z[\7\5\2\2[\\\5\16\b\2\\]\b\b\1\2]^\b\b\1\2^_\b"+
		"\b\1\2_a\3\2\2\2`M\3\2\2\2`Q\3\2\2\2`X\3\2\2\2`Z\3\2\2\2a\17\3\2\2\2b"+
		"c\5\22\n\2cd\b\t\1\2di\3\2\2\2ef\5\24\13\2fg\b\t\1\2gi\3\2\2\2hb\3\2\2"+
		"\2he\3\2\2\2i\21\3\2\2\2jk\7\3\2\2kl\5\22\n\2lm\b\n\1\2mn\b\n\1\2no\b"+
		"\n\1\2oz\3\2\2\2pq\7\3\2\2qr\5\24\13\2rs\b\n\1\2st\b\n\1\2tu\b\n\1\2u"+
		"z\3\2\2\2vw\7\3\2\2wx\b\n\1\2xz\b\n\1\2yj\3\2\2\2yp\3\2\2\2yv\3\2\2\2"+
		"z\23\3\2\2\2{|\7\4\2\2|}\5\24\13\2}~\b\13\1\2~\177\b\13\1\2\177\u0080"+
		"\b\13\1\2\u0080\u008b\3\2\2\2\u0081\u0082\7\4\2\2\u0082\u0083\5\22\n\2"+
		"\u0083\u0084\b\13\1\2\u0084\u0085\b\13\1\2\u0085\u0086\b\13\1\2\u0086"+
		"\u008b\3\2\2\2\u0087\u0088\7\4\2\2\u0088\u0089\b\13\1\2\u0089\u008b\b"+
		"\13\1\2\u008a{\3\2\2\2\u008a\u0081\3\2\2\2\u008a\u0087\3\2\2\2\u008b\25"+
		"\3\2\2\2\t):K`hy\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}