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
		NonTerm=1, Term=2, Delim=3, Arr=4, WS=5, Colon=6, Regexp=7, RP=8, LP=9, 
		COMMA=10, Ret=11, Action=12, Import=13;
	public static final int
		RULE_begin = 0, RULE_importsList = 1, RULE_lexerParser = 2, RULE_lexemList = 3, 
		RULE_singleLexem = 4, RULE_ruleList = 5, RULE_ruleSet = 6, RULE_getArg = 7, 
		RULE_getType = 8, RULE_subRuleSet = 9, RULE_singleRule = 10, RULE_nonTerm = 11, 
		RULE_par = 12, RULE_term = 13;
	public static final String[] ruleNames = {
		"begin", "importsList", "lexerParser", "lexemList", "singleLexem", "ruleList", 
		"ruleSet", "getArg", "getType", "subRuleSet", "singleRule", "nonTerm", 
		"par", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'|'", "'->'", null, "':'", null, "']'", "'['", "','", 
		"'_returns'", null, "'_import'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NonTerm", "Term", "Delim", "Arr", "WS", "Colon", "Regexp", "RP", 
		"LP", "COMMA", "Ret", "Action", "Import"
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
		public ImportsListContext impL;
		public TerminalNode NonTerm() { return getToken(Gram4GramParser.NonTerm, 0); }
		public TerminalNode COMMA() { return getToken(Gram4GramParser.COMMA, 0); }
		public LexerParserContext lexerParser() {
			return getRuleContext(LexerParserContext.class,0);
		}
		public ImportsListContext importsList() {
			return getRuleContext(ImportsListContext.class,0);
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
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NonTerm:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				((BeginContext)_localctx).NonTerm = match(NonTerm);
				setState(29);
				match(COMMA);
				((BeginContext)_localctx).gram =  new Grammar((((BeginContext)_localctx).NonTerm!=null?((BeginContext)_localctx).NonTerm.getText():null));
				setState(31);
				lexerParser(_localctx.gram);
				}
				break;
			case Import:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				((BeginContext)_localctx).impL = importsList();
				setState(33);
				((BeginContext)_localctx).NonTerm = match(NonTerm);
				setState(34);
				match(COMMA);
				((BeginContext)_localctx).gram =  new Grammar((((BeginContext)_localctx).NonTerm!=null?((BeginContext)_localctx).NonTerm.getText():null), ((BeginContext)_localctx).impL.imp);
				setState(36);
				lexerParser(_localctx.gram);
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

	public static class ImportsListContext extends ParserRuleContext {
		public ArrayList<String> imp;
		public Token Regexp;
		public ImportsListContext other;
		public TerminalNode Import() { return getToken(Gram4GramParser.Import, 0); }
		public TerminalNode Regexp() { return getToken(Gram4GramParser.Regexp, 0); }
		public ImportsListContext importsList() {
			return getRuleContext(ImportsListContext.class,0);
		}
		public ImportsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterImportsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitImportsList(this);
		}
	}

	public final ImportsListContext importsList() throws RecognitionException {
		ImportsListContext _localctx = new ImportsListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importsList);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(Import);
				setState(41);
				((ImportsListContext)_localctx).Regexp = match(Regexp);
				((ImportsListContext)_localctx).imp =  new ArrayList<>();
				_localctx.imp.add((((ImportsListContext)_localctx).Regexp!=null?((ImportsListContext)_localctx).Regexp.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(Import);
				setState(45);
				((ImportsListContext)_localctx).Regexp = match(Regexp);
				setState(46);
				((ImportsListContext)_localctx).other = importsList();
				((ImportsListContext)_localctx).imp =  new ArrayList<>();
				_localctx.imp.add((((ImportsListContext)_localctx).Regexp!=null?((ImportsListContext)_localctx).Regexp.getText():null));
				_localctx.imp.addAll(((ImportsListContext)_localctx).other.imp);
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
		enterRule(_localctx, 4, RULE_lexerParser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			((LexerParserContext)_localctx).list = ruleList();
			gram.setRules(((LexerParserContext)_localctx).list.rsl);
			setState(55);
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
		enterRule(_localctx, 6, RULE_lexemList);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((LexemListContext)_localctx).single1 = singleLexem();
				((LexemListContext)_localctx).ll =  new ArrayList<>();
				_localctx.ll.add(((LexemListContext)_localctx).single1.l);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				((LexemListContext)_localctx).single = singleLexem();
				setState(63);
				((LexemListContext)_localctx).other = lexemList();
				((LexemListContext)_localctx).ll =  new ArrayList<>();
				_localctx.ll.add(((LexemListContext)_localctx).single.l);
				_localctx.ll.addAll(((LexemListContext)_localctx).other.ll);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
		enterRule(_localctx, 8, RULE_singleLexem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((SingleLexemContext)_localctx).Term = match(Term);
			setState(72);
			match(Colon);
			setState(73);
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
		enterRule(_localctx, 10, RULE_ruleList);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				((RuleListContext)_localctx).first = ruleSet();
				setState(77);
				((RuleListContext)_localctx).other = ruleList();
				((RuleListContext)_localctx).rsl =  new ArrayList<>();
				_localctx.rsl.add(((RuleListContext)_localctx).first.rs);
				_localctx.rsl.addAll(((RuleListContext)_localctx).other.rsl);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
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
		public Token Action;
		public SingleRuleContext single;
		public SingleRuleContext single1;
		public SubRuleSetContext set;
		public GetArgContext arg1;
		public GetArgContext argAc;
		public GetArgContext arg2;
		public GetArgContext arg3;
		public GetArgContext retarg1;
		public GetArgContext retargAc;
		public GetArgContext retarg2;
		public GetArgContext retarg3;
		public GetArgContext arg4;
		public GetArgContext retarg4;
		public GetArgContext argAc1;
		public GetArgContext retargAc1;
		public GetArgContext arg5;
		public GetArgContext retarg5;
		public GetArgContext arg6;
		public GetArgContext retarg6;
		public TerminalNode NonTerm() { return getToken(Gram4GramParser.NonTerm, 0); }
		public TerminalNode Arr() { return getToken(Gram4GramParser.Arr, 0); }
		public TerminalNode Action() { return getToken(Gram4GramParser.Action, 0); }
		public SingleRuleContext singleRule() {
			return getRuleContext(SingleRuleContext.class,0);
		}
		public TerminalNode Delim() { return getToken(Gram4GramParser.Delim, 0); }
		public SubRuleSetContext subRuleSet() {
			return getRuleContext(SubRuleSetContext.class,0);
		}
		public List<TerminalNode> LP() { return getTokens(Gram4GramParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(Gram4GramParser.LP, i);
		}
		public List<TerminalNode> RP() { return getTokens(Gram4GramParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(Gram4GramParser.RP, i);
		}
		public List<GetArgContext> getArg() {
			return getRuleContexts(GetArgContext.class);
		}
		public GetArgContext getArg(int i) {
			return getRuleContext(GetArgContext.class,i);
		}
		public TerminalNode Ret() { return getToken(Gram4GramParser.Ret, 0); }
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
		enterRule(_localctx, 12, RULE_ruleSet);
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(89);
				match(Arr);
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(92);
				match(Arr);
				setState(93);
				((RuleSetContext)_localctx).Action = match(Action);
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null),(((RuleSetContext)_localctx).Action!=null?((RuleSetContext)_localctx).Action.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(96);
				match(Arr);
				setState(97);
				((RuleSetContext)_localctx).single = singleRule();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single.r);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(101);
				match(Arr);
				setState(102);
				((RuleSetContext)_localctx).single1 = singleRule();
				setState(103);
				match(Delim);
				setState(104);
				((RuleSetContext)_localctx).set = subRuleSet();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single1.r, ((RuleSetContext)_localctx).set.lr);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(107);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(108);
				match(LP);
				setState(109);
				((RuleSetContext)_localctx).arg1 = getArg();
				setState(110);
				match(RP);
				setState(111);
				match(Arr);
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null));
				_localctx.rs.setArgs(((RuleSetContext)_localctx).arg1.argl);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(116);
				match(LP);
				setState(117);
				((RuleSetContext)_localctx).argAc = getArg();
				setState(118);
				match(RP);
				setState(119);
				match(Arr);
				setState(120);
				((RuleSetContext)_localctx).Action = match(Action);
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), (((RuleSetContext)_localctx).Action!=null?((RuleSetContext)_localctx).Action.getText():null));
				_localctx.rs.setArgs(((RuleSetContext)_localctx).argAc.argl);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(124);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(125);
				match(LP);
				setState(126);
				((RuleSetContext)_localctx).arg2 = getArg();
				setState(127);
				match(RP);
				setState(128);
				match(Arr);
				setState(129);
				((RuleSetContext)_localctx).single = singleRule();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single.r);
				_localctx.rs.setArgs(((RuleSetContext)_localctx).arg2.argl);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(133);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(134);
				match(LP);
				setState(135);
				((RuleSetContext)_localctx).arg3 = getArg();
				setState(136);
				match(RP);
				setState(137);
				match(Arr);
				setState(138);
				((RuleSetContext)_localctx).single1 = singleRule();
				setState(139);
				match(Delim);
				setState(140);
				((RuleSetContext)_localctx).set = subRuleSet();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single1.r, ((RuleSetContext)_localctx).set.lr);
				_localctx.rs.setArgs(((RuleSetContext)_localctx).arg3.argl);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(145);
				match(Ret);
				setState(146);
				match(LP);
				setState(147);
				((RuleSetContext)_localctx).retarg1 = getArg();
				setState(148);
				match(RP);
				setState(149);
				match(Arr);
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null));
				_localctx.rs.setRetArgs(((RuleSetContext)_localctx).retarg1.argl);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(153);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(154);
				match(Ret);
				setState(155);
				match(LP);
				setState(156);
				((RuleSetContext)_localctx).retargAc = getArg();
				setState(157);
				match(RP);
				setState(158);
				match(Arr);
				setState(159);
				((RuleSetContext)_localctx).Action = match(Action);
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), (((RuleSetContext)_localctx).Action!=null?((RuleSetContext)_localctx).Action.getText():null));
				_localctx.rs.setRetArgs(((RuleSetContext)_localctx).retargAc.argl);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(163);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(164);
				match(Ret);
				setState(165);
				match(LP);
				setState(166);
				((RuleSetContext)_localctx).retarg2 = getArg();
				setState(167);
				match(RP);
				setState(168);
				match(Arr);
				setState(169);
				((RuleSetContext)_localctx).single = singleRule();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single.r);
				_localctx.rs.setRetArgs(((RuleSetContext)_localctx).retarg2.argl);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(173);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(174);
				match(Ret);
				setState(175);
				match(LP);
				setState(176);
				((RuleSetContext)_localctx).retarg3 = getArg();
				setState(177);
				match(RP);
				setState(178);
				match(Arr);
				setState(179);
				((RuleSetContext)_localctx).single1 = singleRule();
				setState(180);
				match(Delim);
				setState(181);
				((RuleSetContext)_localctx).set = subRuleSet();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single1.r, ((RuleSetContext)_localctx).set.lr);
				_localctx.rs.setRetArgs(((RuleSetContext)_localctx).retarg3.argl);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(185);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(186);
				match(LP);
				setState(187);
				((RuleSetContext)_localctx).arg4 = getArg();
				setState(188);
				match(RP);
				setState(189);
				match(Ret);
				setState(190);
				match(LP);
				setState(191);
				((RuleSetContext)_localctx).retarg4 = getArg();
				setState(192);
				match(RP);
				setState(193);
				match(Arr);
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null));
				_localctx.rs.setArgs(((RuleSetContext)_localctx).arg4.argl);
				_localctx.rs.setRetArgs(((RuleSetContext)_localctx).retarg4.argl);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(198);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(199);
				match(LP);
				setState(200);
				((RuleSetContext)_localctx).argAc1 = getArg();
				setState(201);
				match(RP);
				setState(202);
				match(Ret);
				setState(203);
				match(LP);
				setState(204);
				((RuleSetContext)_localctx).retargAc1 = getArg();
				setState(205);
				match(RP);
				setState(206);
				match(Arr);
				setState(207);
				((RuleSetContext)_localctx).Action = match(Action);
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), (((RuleSetContext)_localctx).Action!=null?((RuleSetContext)_localctx).Action.getText():null));
				_localctx.rs.setArgs(((RuleSetContext)_localctx).argAc1.argl);
				_localctx.rs.setRetArgs(((RuleSetContext)_localctx).retargAc1.argl);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(212);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(213);
				match(LP);
				setState(214);
				((RuleSetContext)_localctx).arg5 = getArg();
				setState(215);
				match(RP);
				setState(216);
				match(Ret);
				setState(217);
				match(LP);
				setState(218);
				((RuleSetContext)_localctx).retarg5 = getArg();
				setState(219);
				match(RP);
				setState(220);
				match(Arr);
				setState(221);
				((RuleSetContext)_localctx).single = singleRule();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single.r);
				_localctx.rs.setArgs(((RuleSetContext)_localctx).arg5.argl);
				_localctx.rs.setRetArgs(((RuleSetContext)_localctx).retarg5.argl);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(226);
				((RuleSetContext)_localctx).NonTerm = match(NonTerm);
				setState(227);
				match(LP);
				setState(228);
				((RuleSetContext)_localctx).arg6 = getArg();
				setState(229);
				match(RP);
				setState(230);
				match(Ret);
				setState(231);
				match(LP);
				setState(232);
				((RuleSetContext)_localctx).retarg6 = getArg();
				setState(233);
				match(RP);
				setState(234);
				match(Arr);
				setState(235);
				((RuleSetContext)_localctx).single1 = singleRule();
				setState(236);
				match(Delim);
				setState(237);
				((RuleSetContext)_localctx).set = subRuleSet();
				((RuleSetContext)_localctx).rs =  new RuleSet((((RuleSetContext)_localctx).NonTerm!=null?((RuleSetContext)_localctx).NonTerm.getText():null), ((RuleSetContext)_localctx).single1.r, ((RuleSetContext)_localctx).set.lr);
				_localctx.rs.setArgs(((RuleSetContext)_localctx).arg6.argl);
				_localctx.rs.setRetArgs(((RuleSetContext)_localctx).retarg6.argl);
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

	public static class GetArgContext extends ParserRuleContext {
		public ArrayList<Argument> argl;
		public Token Term;
		public GetTypeContext case2;
		public Token NonTerm;
		public GetArgContext other1;
		public GetTypeContext case21;
		public GetTypeContext t1;
		public GetArgContext other;
		public GetTypeContext t2;
		public TerminalNode Term() { return getToken(Gram4GramParser.Term, 0); }
		public TerminalNode NonTerm() { return getToken(Gram4GramParser.NonTerm, 0); }
		public GetTypeContext getType() {
			return getRuleContext(GetTypeContext.class,0);
		}
		public GetArgContext getArg() {
			return getRuleContext(GetArgContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Gram4GramParser.COMMA, 0); }
		public GetArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterGetArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitGetArg(this);
		}
	}

	public final GetArgContext getArg() throws RecognitionException {
		GetArgContext _localctx = new GetArgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getArg);
		try {
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				((GetArgContext)_localctx).Term = match(Term);
				setState(245);
				((GetArgContext)_localctx).case2 = getType();
				setState(246);
				((GetArgContext)_localctx).NonTerm = match(NonTerm);
				setState(247);
				((GetArgContext)_localctx).other1 = getArg();
				((GetArgContext)_localctx).argl =  new ArrayList<Argument>();
				_localctx.argl.add(new Argument((((GetArgContext)_localctx).Term!=null?((GetArgContext)_localctx).Term.getText():null), "new class"));
				_localctx.argl.add(new Argument(((GetArgContext)_localctx).case2.type, (((GetArgContext)_localctx).NonTerm!=null?((GetArgContext)_localctx).NonTerm.getText():null)));
				_localctx.argl.addAll(((GetArgContext)_localctx).other1.argl);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				((GetArgContext)_localctx).Term = match(Term);
				setState(254);
				((GetArgContext)_localctx).case21 = getType();
				setState(255);
				((GetArgContext)_localctx).NonTerm = match(NonTerm);
				((GetArgContext)_localctx).argl =  new ArrayList<>();
				_localctx.argl.add(new Argument((((GetArgContext)_localctx).Term!=null?((GetArgContext)_localctx).Term.getText():null), "new class"));
				_localctx.argl.add(new Argument(((GetArgContext)_localctx).case21.type, (((GetArgContext)_localctx).NonTerm!=null?((GetArgContext)_localctx).NonTerm.getText():null)));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				((GetArgContext)_localctx).t1 = getType();
				setState(261);
				((GetArgContext)_localctx).NonTerm = match(NonTerm);
				setState(262);
				match(COMMA);
				setState(263);
				((GetArgContext)_localctx).other = getArg();
				((GetArgContext)_localctx).argl =  new ArrayList<Argument>();
				_localctx.argl.add(new Argument(((GetArgContext)_localctx).t1.type, (((GetArgContext)_localctx).NonTerm!=null?((GetArgContext)_localctx).NonTerm.getText():null)));
				_localctx.argl.addAll(((GetArgContext)_localctx).other.argl);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				((GetArgContext)_localctx).t2 = getType();
				setState(269);
				((GetArgContext)_localctx).NonTerm = match(NonTerm);
				((GetArgContext)_localctx).argl =  new ArrayList<Argument>();
				_localctx.argl.add(new Argument(((GetArgContext)_localctx).t2.type, (((GetArgContext)_localctx).NonTerm!=null?((GetArgContext)_localctx).NonTerm.getText():null)));
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

	public static class GetTypeContext extends ParserRuleContext {
		public String type;
		public Token Term;
		public Token NonTerm;
		public TerminalNode Term() { return getToken(Gram4GramParser.Term, 0); }
		public TerminalNode NonTerm() { return getToken(Gram4GramParser.NonTerm, 0); }
		public GetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterGetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitGetType(this);
		}
	}

	public final GetTypeContext getType() throws RecognitionException {
		GetTypeContext _localctx = new GetTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_getType);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Term:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				((GetTypeContext)_localctx).Term = match(Term);
				((GetTypeContext)_localctx).type =  (((GetTypeContext)_localctx).Term!=null?((GetTypeContext)_localctx).Term.getText():null);
				}
				break;
			case NonTerm:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				((GetTypeContext)_localctx).NonTerm = match(NonTerm);
				((GetTypeContext)_localctx).type =  (((GetTypeContext)_localctx).NonTerm!=null?((GetTypeContext)_localctx).NonTerm.getText():null);
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

	public static class SubRuleSetContext extends ParserRuleContext {
		public ArrayList<Rule> lr;
		public SingleRuleContext oRule;
		public SingleRuleContext oRule1;
		public SubRuleSetContext other;
		public Token Action;
		public SubRuleSetContext other1;
		public SubRuleSetContext other2;
		public SingleRuleContext singleRule() {
			return getRuleContext(SingleRuleContext.class,0);
		}
		public TerminalNode Delim() { return getToken(Gram4GramParser.Delim, 0); }
		public SubRuleSetContext subRuleSet() {
			return getRuleContext(SubRuleSetContext.class,0);
		}
		public TerminalNode Action() { return getToken(Gram4GramParser.Action, 0); }
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
		enterRule(_localctx, 18, RULE_subRuleSet);
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((SubRuleSetContext)_localctx).oRule = singleRule();
				((SubRuleSetContext)_localctx).lr =  new ArrayList<>();
				_localctx.lr.add(((SubRuleSetContext)_localctx).oRule.r);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				((SubRuleSetContext)_localctx).oRule1 = singleRule();
				setState(286);
				match(Delim);
				setState(287);
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
				setState(294);
				((SubRuleSetContext)_localctx).Action = match(Action);
				((SubRuleSetContext)_localctx).lr =  new ArrayList<>();
				_localctx.lr.add(new Rule((((SubRuleSetContext)_localctx).Action!=null?((SubRuleSetContext)_localctx).Action.getText():null)));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(297);
				match(Delim);
				setState(298);
				((SubRuleSetContext)_localctx).other1 = subRuleSet();
				((SubRuleSetContext)_localctx).lr =  new ArrayList<>();
				_localctx.lr.add(new Rule());
				_localctx.lr.addAll(((SubRuleSetContext)_localctx).other1.lr);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(303);
				((SubRuleSetContext)_localctx).Action = match(Action);
				setState(304);
				match(Delim);
				setState(305);
				((SubRuleSetContext)_localctx).other2 = subRuleSet();
				((SubRuleSetContext)_localctx).lr =  new ArrayList<>();
				_localctx.lr.add(new Rule((((SubRuleSetContext)_localctx).Action!=null?((SubRuleSetContext)_localctx).Action.getText():null)));
				_localctx.lr.addAll(((SubRuleSetContext)_localctx).other2.lr);
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
		public NonTermContext list2;
		public Token Action;
		public TermContext list3;
		public NonTermContext nonTerm() {
			return getRuleContext(NonTermContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode Action() { return getToken(Gram4GramParser.Action, 0); }
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
		enterRule(_localctx, 20, RULE_singleRule);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				((SingleRuleContext)_localctx).list = nonTerm();
				((SingleRuleContext)_localctx).r =  new Rule(((SingleRuleContext)_localctx).list.lit);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				((SingleRuleContext)_localctx).list1 = term();
				((SingleRuleContext)_localctx).r =  new Rule(((SingleRuleContext)_localctx).list1.lit);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				((SingleRuleContext)_localctx).list2 = nonTerm();
				setState(319);
				((SingleRuleContext)_localctx).Action = match(Action);
				((SingleRuleContext)_localctx).r =  new Rule(((SingleRuleContext)_localctx).list2.lit);
				_localctx.r.setCode((((SingleRuleContext)_localctx).Action!=null?((SingleRuleContext)_localctx).Action.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				((SingleRuleContext)_localctx).list3 = term();
				setState(324);
				((SingleRuleContext)_localctx).Action = match(Action);
				((SingleRuleContext)_localctx).r =  new Rule(((SingleRuleContext)_localctx).list3.lit);
				_localctx.r.setCode((((SingleRuleContext)_localctx).Action!=null?((SingleRuleContext)_localctx).Action.getText():null));
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

	public static class NonTermContext extends ParserRuleContext {
		public ArrayList<Literal> lit;
		public Token NonTerm;
		public ParContext blo;
		public NonTermContext list2;
		public NonTermContext list;
		public TermContext list1;
		public ParContext blo1;
		public TermContext list3;
		public ParContext blo2;
		public TerminalNode NonTerm() { return getToken(Gram4GramParser.NonTerm, 0); }
		public TerminalNode LP() { return getToken(Gram4GramParser.LP, 0); }
		public TerminalNode RP() { return getToken(Gram4GramParser.RP, 0); }
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_nonTerm);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				((NonTermContext)_localctx).NonTerm = match(NonTerm);
				setState(331);
				match(LP);
				setState(332);
				((NonTermContext)_localctx).blo = par();
				setState(333);
				match(RP);
				setState(334);
				((NonTermContext)_localctx).list2 = nonTerm();
				((NonTermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add(new Literal((((NonTermContext)_localctx).NonTerm!=null?((NonTermContext)_localctx).NonTerm.getText():null), true, ((NonTermContext)_localctx).blo.params));
				_localctx.lit.addAll(((NonTermContext)_localctx).list2.lit);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				((NonTermContext)_localctx).NonTerm = match(NonTerm);
				setState(340);
				((NonTermContext)_localctx).list = nonTerm();
				((NonTermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add(new Literal((((NonTermContext)_localctx).NonTerm!=null?((NonTermContext)_localctx).NonTerm.getText():null), true));
				_localctx.lit.addAll(((NonTermContext)_localctx).list.lit);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				((NonTermContext)_localctx).NonTerm = match(NonTerm);
				setState(346);
				((NonTermContext)_localctx).list1 = term();
				((NonTermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add(new Literal((((NonTermContext)_localctx).NonTerm!=null?((NonTermContext)_localctx).NonTerm.getText():null), true));
				_localctx.lit.addAll(((NonTermContext)_localctx).list1.lit);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				((NonTermContext)_localctx).NonTerm = match(NonTerm);
				setState(352);
				match(LP);
				setState(353);
				((NonTermContext)_localctx).blo1 = par();
				setState(354);
				match(RP);
				setState(355);
				((NonTermContext)_localctx).list3 = term();
				((NonTermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add(new Literal((((NonTermContext)_localctx).NonTerm!=null?((NonTermContext)_localctx).NonTerm.getText():null), true, ((NonTermContext)_localctx).blo1.params));
				_localctx.lit.addAll(((NonTermContext)_localctx).list3.lit);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(360);
				((NonTermContext)_localctx).NonTerm = match(NonTerm);
				((NonTermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add(new Literal((((NonTermContext)_localctx).NonTerm!=null?((NonTermContext)_localctx).NonTerm.getText():null), true));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(363);
				((NonTermContext)_localctx).NonTerm = match(NonTerm);
				setState(364);
				match(LP);
				setState(365);
				((NonTermContext)_localctx).blo2 = par();
				setState(366);
				match(RP);
				((NonTermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add(new Literal((((NonTermContext)_localctx).NonTerm!=null?((NonTermContext)_localctx).NonTerm.getText():null), true, ((NonTermContext)_localctx).blo2.params));
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

	public static class ParContext extends ParserRuleContext {
		public ArrayList<String> params;
		public Token NonTerm;
		public Token Term;
		public ParContext kal;
		public ParContext kal1;
		public TerminalNode NonTerm() { return getToken(Gram4GramParser.NonTerm, 0); }
		public TerminalNode Term() { return getToken(Gram4GramParser.Term, 0); }
		public TerminalNode COMMA() { return getToken(Gram4GramParser.COMMA, 0); }
		public ParContext par() {
			return getRuleContext(ParContext.class,0);
		}
		public ParContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_par; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Gram4GramListener ) ((Gram4GramListener)listener).exitPar(this);
		}
	}

	public final ParContext par() throws RecognitionException {
		ParContext _localctx = new ParContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_par);
		try {
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				((ParContext)_localctx).NonTerm = match(NonTerm);
				((ParContext)_localctx).params =  new ArrayList<>();
				_localctx.params.add((((ParContext)_localctx).NonTerm!=null?((ParContext)_localctx).NonTerm.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(375);
				((ParContext)_localctx).Term = match(Term);
				((ParContext)_localctx).params =  new ArrayList<>();
				_localctx.params.add((((ParContext)_localctx).Term!=null?((ParContext)_localctx).Term.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				((ParContext)_localctx).NonTerm = match(NonTerm);
				setState(379);
				match(COMMA);
				setState(380);
				((ParContext)_localctx).kal = par();
				((ParContext)_localctx).params =  new ArrayList<>();
				_localctx.params.add((((ParContext)_localctx).NonTerm!=null?((ParContext)_localctx).NonTerm.getText():null));
				_localctx.params.addAll(((ParContext)_localctx).kal.params);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(385);
				((ParContext)_localctx).Term = match(Term);
				setState(386);
				match(COMMA);
				setState(387);
				((ParContext)_localctx).kal1 = par();
				((ParContext)_localctx).params =  new ArrayList<>();
				_localctx.params.add((((ParContext)_localctx).Term!=null?((ParContext)_localctx).Term.getText():null));
				_localctx.params.addAll(((ParContext)_localctx).kal1.params);
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
		public ArrayList<Literal> lit;
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
		enterRule(_localctx, 26, RULE_term);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(394);
				((TermContext)_localctx).Term = match(Term);
				setState(395);
				((TermContext)_localctx).list = term();
				((TermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add(new Literal((((TermContext)_localctx).Term!=null?((TermContext)_localctx).Term.getText():null), false));
				_localctx.lit.addAll(((TermContext)_localctx).list.lit);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				((TermContext)_localctx).Term = match(Term);
				setState(401);
				((TermContext)_localctx).list1 = nonTerm();
				((TermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add(new Literal((((TermContext)_localctx).Term!=null?((TermContext)_localctx).Term.getText():null), false));
				_localctx.lit.addAll(((TermContext)_localctx).list1.lit);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(406);
				((TermContext)_localctx).Term = match(Term);
				((TermContext)_localctx).lit =  new ArrayList<>();
				_localctx.lit.add(new Literal((((TermContext)_localctx).Term!=null?((TermContext)_localctx).Term.getText():null), false));
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17\u019e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\66\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5H\n\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7Y\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00f5\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0114\n"+
		"\t\3\n\3\n\3\n\3\n\5\n\u011a\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0139\n\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u014b\n\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u0175\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u018b\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u019c\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\2\2\2\u01b9\2(\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2\bG\3\2\2\2\nI\3\2\2"+
		"\2\fX\3\2\2\2\16\u00f4\3\2\2\2\20\u0113\3\2\2\2\22\u0119\3\2\2\2\24\u0138"+
		"\3\2\2\2\26\u014a\3\2\2\2\30\u0174\3\2\2\2\32\u018a\3\2\2\2\34\u019b\3"+
		"\2\2\2\36\37\7\3\2\2\37 \7\f\2\2 !\b\2\1\2!)\5\6\4\2\"#\5\4\3\2#$\7\3"+
		"\2\2$%\7\f\2\2%&\b\2\1\2&\'\5\6\4\2\')\3\2\2\2(\36\3\2\2\2(\"\3\2\2\2"+
		")\3\3\2\2\2*+\7\17\2\2+,\7\t\2\2,-\b\3\1\2-\66\b\3\1\2./\7\17\2\2/\60"+
		"\7\t\2\2\60\61\5\4\3\2\61\62\b\3\1\2\62\63\b\3\1\2\63\64\b\3\1\2\64\66"+
		"\3\2\2\2\65*\3\2\2\2\65.\3\2\2\2\66\5\3\2\2\2\678\5\f\7\289\b\4\1\29:"+
		"\5\b\5\2:;\b\4\1\2;\7\3\2\2\2<=\5\n\6\2=>\b\5\1\2>?\b\5\1\2?H\3\2\2\2"+
		"@A\5\n\6\2AB\5\b\5\2BC\b\5\1\2CD\b\5\1\2DE\b\5\1\2EH\3\2\2\2FH\3\2\2\2"+
		"G<\3\2\2\2G@\3\2\2\2GF\3\2\2\2H\t\3\2\2\2IJ\7\4\2\2JK\7\b\2\2KL\7\t\2"+
		"\2LM\b\6\1\2M\13\3\2\2\2NO\5\16\b\2OP\5\f\7\2PQ\b\7\1\2QR\b\7\1\2RS\b"+
		"\7\1\2SY\3\2\2\2TU\5\16\b\2UV\b\7\1\2VW\b\7\1\2WY\3\2\2\2XN\3\2\2\2XT"+
		"\3\2\2\2Y\r\3\2\2\2Z[\7\3\2\2[\\\7\6\2\2\\\u00f5\b\b\1\2]^\7\3\2\2^_\7"+
		"\6\2\2_`\7\16\2\2`\u00f5\b\b\1\2ab\7\3\2\2bc\7\6\2\2cd\5\26\f\2de\b\b"+
		"\1\2e\u00f5\3\2\2\2fg\7\3\2\2gh\7\6\2\2hi\5\26\f\2ij\7\5\2\2jk\5\24\13"+
		"\2kl\b\b\1\2l\u00f5\3\2\2\2mn\7\3\2\2no\7\13\2\2op\5\20\t\2pq\7\n\2\2"+
		"qr\7\6\2\2rs\b\b\1\2st\b\b\1\2t\u00f5\3\2\2\2uv\7\3\2\2vw\7\13\2\2wx\5"+
		"\20\t\2xy\7\n\2\2yz\7\6\2\2z{\7\16\2\2{|\b\b\1\2|}\b\b\1\2}\u00f5\3\2"+
		"\2\2~\177\7\3\2\2\177\u0080\7\13\2\2\u0080\u0081\5\20\t\2\u0081\u0082"+
		"\7\n\2\2\u0082\u0083\7\6\2\2\u0083\u0084\5\26\f\2\u0084\u0085\b\b\1\2"+
		"\u0085\u0086\b\b\1\2\u0086\u00f5\3\2\2\2\u0087\u0088\7\3\2\2\u0088\u0089"+
		"\7\13\2\2\u0089\u008a\5\20\t\2\u008a\u008b\7\n\2\2\u008b\u008c\7\6\2\2"+
		"\u008c\u008d\5\26\f\2\u008d\u008e\7\5\2\2\u008e\u008f\5\24\13\2\u008f"+
		"\u0090\b\b\1\2\u0090\u0091\b\b\1\2\u0091\u00f5\3\2\2\2\u0092\u0093\7\3"+
		"\2\2\u0093\u0094\7\r\2\2\u0094\u0095\7\13\2\2\u0095\u0096\5\20\t\2\u0096"+
		"\u0097\7\n\2\2\u0097\u0098\7\6\2\2\u0098\u0099\b\b\1\2\u0099\u009a\b\b"+
		"\1\2\u009a\u00f5\3\2\2\2\u009b\u009c\7\3\2\2\u009c\u009d\7\r\2\2\u009d"+
		"\u009e\7\13\2\2\u009e\u009f\5\20\t\2\u009f\u00a0\7\n\2\2\u00a0\u00a1\7"+
		"\6\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\b\b\1\2\u00a3\u00a4\b\b\1\2\u00a4"+
		"\u00f5\3\2\2\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\7\r\2\2\u00a7\u00a8\7\13"+
		"\2\2\u00a8\u00a9\5\20\t\2\u00a9\u00aa\7\n\2\2\u00aa\u00ab\7\6\2\2\u00ab"+
		"\u00ac\5\26\f\2\u00ac\u00ad\b\b\1\2\u00ad\u00ae\b\b\1\2\u00ae\u00f5\3"+
		"\2\2\2\u00af\u00b0\7\3\2\2\u00b0\u00b1\7\r\2\2\u00b1\u00b2\7\13\2\2\u00b2"+
		"\u00b3\5\20\t\2\u00b3\u00b4\7\n\2\2\u00b4\u00b5\7\6\2\2\u00b5\u00b6\5"+
		"\26\f\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\5\24\13\2\u00b8\u00b9\b\b\1\2"+
		"\u00b9\u00ba\b\b\1\2\u00ba\u00f5\3\2\2\2\u00bb\u00bc\7\3\2\2\u00bc\u00bd"+
		"\7\13\2\2\u00bd\u00be\5\20\t\2\u00be\u00bf\7\n\2\2\u00bf\u00c0\7\r\2\2"+
		"\u00c0\u00c1\7\13\2\2\u00c1\u00c2\5\20\t\2\u00c2\u00c3\7\n\2\2\u00c3\u00c4"+
		"\7\6\2\2\u00c4\u00c5\b\b\1\2\u00c5\u00c6\b\b\1\2\u00c6\u00c7\b\b\1\2\u00c7"+
		"\u00f5\3\2\2\2\u00c8\u00c9\7\3\2\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb\5"+
		"\20\t\2\u00cb\u00cc\7\n\2\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7\13\2\2\u00ce"+
		"\u00cf\5\20\t\2\u00cf\u00d0\7\n\2\2\u00d0\u00d1\7\6\2\2\u00d1\u00d2\7"+
		"\16\2\2\u00d2\u00d3\b\b\1\2\u00d3\u00d4\b\b\1\2\u00d4\u00d5\b\b\1\2\u00d5"+
		"\u00f5\3\2\2\2\u00d6\u00d7\7\3\2\2\u00d7\u00d8\7\13\2\2\u00d8\u00d9\5"+
		"\20\t\2\u00d9\u00da\7\n\2\2\u00da\u00db\7\r\2\2\u00db\u00dc\7\13\2\2\u00dc"+
		"\u00dd\5\20\t\2\u00dd\u00de\7\n\2\2\u00de\u00df\7\6\2\2\u00df\u00e0\5"+
		"\26\f\2\u00e0\u00e1\b\b\1\2\u00e1\u00e2\b\b\1\2\u00e2\u00e3\b\b\1\2\u00e3"+
		"\u00f5\3\2\2\2\u00e4\u00e5\7\3\2\2\u00e5\u00e6\7\13\2\2\u00e6\u00e7\5"+
		"\20\t\2\u00e7\u00e8\7\n\2\2\u00e8\u00e9\7\r\2\2\u00e9\u00ea\7\13\2\2\u00ea"+
		"\u00eb\5\20\t\2\u00eb\u00ec\7\n\2\2\u00ec\u00ed\7\6\2\2\u00ed\u00ee\5"+
		"\26\f\2\u00ee\u00ef\7\5\2\2\u00ef\u00f0\5\24\13\2\u00f0\u00f1\b\b\1\2"+
		"\u00f1\u00f2\b\b\1\2\u00f2\u00f3\b\b\1\2\u00f3\u00f5\3\2\2\2\u00f4Z\3"+
		"\2\2\2\u00f4]\3\2\2\2\u00f4a\3\2\2\2\u00f4f\3\2\2\2\u00f4m\3\2\2\2\u00f4"+
		"u\3\2\2\2\u00f4~\3\2\2\2\u00f4\u0087\3\2\2\2\u00f4\u0092\3\2\2\2\u00f4"+
		"\u009b\3\2\2\2\u00f4\u00a5\3\2\2\2\u00f4\u00af\3\2\2\2\u00f4\u00bb\3\2"+
		"\2\2\u00f4\u00c8\3\2\2\2\u00f4\u00d6\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f5"+
		"\17\3\2\2\2\u00f6\u00f7\7\4\2\2\u00f7\u00f8\5\22\n\2\u00f8\u00f9\7\3\2"+
		"\2\u00f9\u00fa\5\20\t\2\u00fa\u00fb\b\t\1\2\u00fb\u00fc\b\t\1\2\u00fc"+
		"\u00fd\b\t\1\2\u00fd\u00fe\b\t\1\2\u00fe\u0114\3\2\2\2\u00ff\u0100\7\4"+
		"\2\2\u0100\u0101\5\22\n\2\u0101\u0102\7\3\2\2\u0102\u0103\b\t\1\2\u0103"+
		"\u0104\b\t\1\2\u0104\u0105\b\t\1\2\u0105\u0114\3\2\2\2\u0106\u0107\5\22"+
		"\n\2\u0107\u0108\7\3\2\2\u0108\u0109\7\f\2\2\u0109\u010a\5\20\t\2\u010a"+
		"\u010b\b\t\1\2\u010b\u010c\b\t\1\2\u010c\u010d\b\t\1\2\u010d\u0114\3\2"+
		"\2\2\u010e\u010f\5\22\n\2\u010f\u0110\7\3\2\2\u0110\u0111\b\t\1\2\u0111"+
		"\u0112\b\t\1\2\u0112\u0114\3\2\2\2\u0113\u00f6\3\2\2\2\u0113\u00ff\3\2"+
		"\2\2\u0113\u0106\3\2\2\2\u0113\u010e\3\2\2\2\u0114\21\3\2\2\2\u0115\u0116"+
		"\7\4\2\2\u0116\u011a\b\n\1\2\u0117\u0118\7\3\2\2\u0118\u011a\b\n\1\2\u0119"+
		"\u0115\3\2\2\2\u0119\u0117\3\2\2\2\u011a\23\3\2\2\2\u011b\u011c\5\26\f"+
		"\2\u011c\u011d\b\13\1\2\u011d\u011e\b\13\1\2\u011e\u0139\3\2\2\2\u011f"+
		"\u0120\5\26\f\2\u0120\u0121\7\5\2\2\u0121\u0122\5\24\13\2\u0122\u0123"+
		"\b\13\1\2\u0123\u0124\b\13\1\2\u0124\u0125\b\13\1\2\u0125\u0139\3\2\2"+
		"\2\u0126\u0127\b\13\1\2\u0127\u0139\b\13\1\2\u0128\u0129\7\16\2\2\u0129"+
		"\u012a\b\13\1\2\u012a\u0139\b\13\1\2\u012b\u012c\7\5\2\2\u012c\u012d\5"+
		"\24\13\2\u012d\u012e\b\13\1\2\u012e\u012f\b\13\1\2\u012f\u0130\b\13\1"+
		"\2\u0130\u0139\3\2\2\2\u0131\u0132\7\16\2\2\u0132\u0133\7\5\2\2\u0133"+
		"\u0134\5\24\13\2\u0134\u0135\b\13\1\2\u0135\u0136\b\13\1\2\u0136\u0137"+
		"\b\13\1\2\u0137\u0139\3\2\2\2\u0138\u011b\3\2\2\2\u0138\u011f\3\2\2\2"+
		"\u0138\u0126\3\2\2\2\u0138\u0128\3\2\2\2\u0138\u012b\3\2\2\2\u0138\u0131"+
		"\3\2\2\2\u0139\25\3\2\2\2\u013a\u013b\5\30\r\2\u013b\u013c\b\f\1\2\u013c"+
		"\u014b\3\2\2\2\u013d\u013e\5\34\17\2\u013e\u013f\b\f\1\2\u013f\u014b\3"+
		"\2\2\2\u0140\u0141\5\30\r\2\u0141\u0142\7\16\2\2\u0142\u0143\b\f\1\2\u0143"+
		"\u0144\b\f\1\2\u0144\u014b\3\2\2\2\u0145\u0146\5\34\17\2\u0146\u0147\7"+
		"\16\2\2\u0147\u0148\b\f\1\2\u0148\u0149\b\f\1\2\u0149\u014b\3\2\2\2\u014a"+
		"\u013a\3\2\2\2\u014a\u013d\3\2\2\2\u014a\u0140\3\2\2\2\u014a\u0145\3\2"+
		"\2\2\u014b\27\3\2\2\2\u014c\u014d\7\3\2\2\u014d\u014e\7\13\2\2\u014e\u014f"+
		"\5\32\16\2\u014f\u0150\7\n\2\2\u0150\u0151\5\30\r\2\u0151\u0152\b\r\1"+
		"\2\u0152\u0153\b\r\1\2\u0153\u0154\b\r\1\2\u0154\u0175\3\2\2\2\u0155\u0156"+
		"\7\3\2\2\u0156\u0157\5\30\r\2\u0157\u0158\b\r\1\2\u0158\u0159\b\r\1\2"+
		"\u0159\u015a\b\r\1\2\u015a\u0175\3\2\2\2\u015b\u015c\7\3\2\2\u015c\u015d"+
		"\5\34\17\2\u015d\u015e\b\r\1\2\u015e\u015f\b\r\1\2\u015f\u0160\b\r\1\2"+
		"\u0160\u0175\3\2\2\2\u0161\u0162\7\3\2\2\u0162\u0163\7\13\2\2\u0163\u0164"+
		"\5\32\16\2\u0164\u0165\7\n\2\2\u0165\u0166\5\34\17\2\u0166\u0167\b\r\1"+
		"\2\u0167\u0168\b\r\1\2\u0168\u0169\b\r\1\2\u0169\u0175\3\2\2\2\u016a\u016b"+
		"\7\3\2\2\u016b\u016c\b\r\1\2\u016c\u0175\b\r\1\2\u016d\u016e\7\3\2\2\u016e"+
		"\u016f\7\13\2\2\u016f\u0170\5\32\16\2\u0170\u0171\7\n\2\2\u0171\u0172"+
		"\b\r\1\2\u0172\u0173\b\r\1\2\u0173\u0175\3\2\2\2\u0174\u014c\3\2\2\2\u0174"+
		"\u0155\3\2\2\2\u0174\u015b\3\2\2\2\u0174\u0161\3\2\2\2\u0174\u016a\3\2"+
		"\2\2\u0174\u016d\3\2\2\2\u0175\31\3\2\2\2\u0176\u0177\7\3\2\2\u0177\u0178"+
		"\b\16\1\2\u0178\u018b\b\16\1\2\u0179\u017a\7\4\2\2\u017a\u017b\b\16\1"+
		"\2\u017b\u018b\b\16\1\2\u017c\u017d\7\3\2\2\u017d\u017e\7\f\2\2\u017e"+
		"\u017f\5\32\16\2\u017f\u0180\b\16\1\2\u0180\u0181\b\16\1\2\u0181\u0182"+
		"\b\16\1\2\u0182\u018b\3\2\2\2\u0183\u0184\7\4\2\2\u0184\u0185\7\f\2\2"+
		"\u0185\u0186\5\32\16\2\u0186\u0187\b\16\1\2\u0187\u0188\b\16\1\2\u0188"+
		"\u0189\b\16\1\2\u0189\u018b\3\2\2\2\u018a\u0176\3\2\2\2\u018a\u0179\3"+
		"\2\2\2\u018a\u017c\3\2\2\2\u018a\u0183\3\2\2\2\u018b\33\3\2\2\2\u018c"+
		"\u018d\7\4\2\2\u018d\u018e\5\34\17\2\u018e\u018f\b\17\1\2\u018f\u0190"+
		"\b\17\1\2\u0190\u0191\b\17\1\2\u0191\u019c\3\2\2\2\u0192\u0193\7\4\2\2"+
		"\u0193\u0194\5\30\r\2\u0194\u0195\b\17\1\2\u0195\u0196\b\17\1\2\u0196"+
		"\u0197\b\17\1\2\u0197\u019c\3\2\2\2\u0198\u0199\7\4\2\2\u0199\u019a\b"+
		"\17\1\2\u019a\u019c\b\17\1\2\u019b\u018c\3\2\2\2\u019b\u0192\3\2\2\2\u019b"+
		"\u0198\3\2\2\2\u019c\35\3\2\2\2\16(\65GX\u00f4\u0113\u0119\u0138\u014a"+
		"\u0174\u018a\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}