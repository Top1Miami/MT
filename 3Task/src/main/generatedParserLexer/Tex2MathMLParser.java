// Generated from Tex2MathML.g4 by ANTLR 4.7.1
package main.generatedParserLexer;


import main.expression.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tex2MathMLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=1, WS=2, SiNum=3, MuNum=4, PLUS=5, MINUS=6, MULT=7, FRAC=8, CBRLEFT=9, 
		CBRRIGHT=10, POW=11, SQRT=12, BRLEFT=13, BRRIGHT=14, EQUAL=15;
	public static final int
		RULE_start = 0, RULE_plus = 1, RULE_mult = 2, RULE_atomic = 3, RULE_num = 4, 
		RULE_frac = 5;
	public static final String[] ruleNames = {
		"start", "plus", "mult", "atomic", "num", "frac"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'$'", null, null, null, "'+'", "'-'", "'*'", "'\\frac'", "'{'", 
		"'}'", "'^'", "'\\sqrt'", "'('", "')'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DOLLAR", "WS", "SiNum", "MuNum", "PLUS", "MINUS", "MULT", "FRAC", 
		"CBRLEFT", "CBRRIGHT", "POW", "SQRT", "BRLEFT", "BRRIGHT", "EQUAL"
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
	public String getGrammarFileName() { return "Tex2MathML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Tex2MathMLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Expression expression;
		public PlusContext left;
		public PlusContext right;
		public PlusContext nextExpr;
		public List<TerminalNode> DOLLAR() { return getTokens(Tex2MathMLParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(Tex2MathMLParser.DOLLAR, i);
		}
		public TerminalNode EQUAL() { return getToken(Tex2MathMLParser.EQUAL, 0); }
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(DOLLAR);
				setState(13);
				((StartContext)_localctx).left = plus(0);
				setState(14);
				match(EQUAL);
				setState(15);
				((StartContext)_localctx).right = plus(0);
				setState(16);
				match(DOLLAR);
				((StartContext)_localctx).expression =  new Equal(((StartContext)_localctx).left.expression, ((StartContext)_localctx).right.expression);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				match(DOLLAR);
				setState(20);
				((StartContext)_localctx).nextExpr = plus(0);
				setState(21);
				match(DOLLAR);
				((StartContext)_localctx).expression =  ((StartContext)_localctx).nextExpr.expression;
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

	public static class PlusContext extends ParserRuleContext {
		public Expression expression;
		public PlusContext left;
		public PlusContext left1;
		public FracContext nexrExpr;
		public MultContext nextExpr;
		public MultContext right;
		public FracContext right1;
		public FracContext frac() {
			return getRuleContext(FracContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(Tex2MathMLParser.PLUS, 0); }
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).exitPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		return plus(0);
	}

	private PlusContext plus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PlusContext _localctx = new PlusContext(_ctx, _parentState);
		PlusContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_plus, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FRAC:
				{
				setState(27);
				((PlusContext)_localctx).nexrExpr = frac();
				((PlusContext)_localctx).expression =  ((PlusContext)_localctx).nextExpr.expression;
				}
				break;
			case SiNum:
			case MuNum:
			case MINUS:
			case SQRT:
			case BRLEFT:
				{
				setState(30);
				((PlusContext)_localctx).nextExpr = mult(0);
				((PlusContext)_localctx).expression =  ((PlusContext)_localctx).nextExpr.expression;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(47);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(45);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_plus);
						setState(35);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(36);
						match(PLUS);
						setState(37);
						((PlusContext)_localctx).right = mult(0);
						((PlusContext)_localctx).expression =  new Plus(((PlusContext)_localctx).left.expression, ((PlusContext)_localctx).right.expression);
						}
						break;
					case 2:
						{
						_localctx = new PlusContext(_parentctx, _parentState);
						_localctx.left1 = _prevctx;
						_localctx.left1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_plus);
						setState(40);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(41);
						match(PLUS);
						setState(42);
						((PlusContext)_localctx).right1 = frac();
						((PlusContext)_localctx).expression =  new Plus(((PlusContext)_localctx).left1.expression, ((PlusContext)_localctx).right1.expression);
						}
						break;
					}
					} 
				}
				setState(49);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MultContext extends ParserRuleContext {
		public Expression expression;
		public MultContext left;
		public AtomicContext nextExpr;
		public AtomicContext right;
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TerminalNode MULT() { return getToken(Tex2MathMLParser.MULT, 0); }
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		return mult(0);
	}

	private MultContext mult(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultContext _localctx = new MultContext(_ctx, _parentState);
		MultContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_mult, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(51);
			((MultContext)_localctx).nextExpr = atomic(0);
			((MultContext)_localctx).expression =  ((MultContext)_localctx).nextExpr.expression;
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_mult);
					setState(54);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(55);
					match(MULT);
					setState(56);
					((MultContext)_localctx).right = atomic(0);
					((MultContext)_localctx).expression =  new Mult(((MultContext)_localctx).left.expression, ((MultContext)_localctx).right.expression);
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomicContext extends ParserRuleContext {
		public Expression expression;
		public AtomicContext expr;
		public AtomicContext nextExpr;
		public PlusContext nextExpr1;
		public NumContext nextExpr2;
		public PlusContext nextExpr3;
		public NumContext power;
		public TerminalNode MINUS() { return getToken(Tex2MathMLParser.MINUS, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TerminalNode BRLEFT() { return getToken(Tex2MathMLParser.BRLEFT, 0); }
		public TerminalNode BRRIGHT() { return getToken(Tex2MathMLParser.BRRIGHT, 0); }
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(Tex2MathMLParser.SQRT, 0); }
		public TerminalNode CBRLEFT() { return getToken(Tex2MathMLParser.CBRLEFT, 0); }
		public TerminalNode CBRRIGHT() { return getToken(Tex2MathMLParser.CBRRIGHT, 0); }
		public AtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).enterAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).exitAtomic(this);
		}
	}

	public final AtomicContext atomic() throws RecognitionException {
		return atomic(0);
	}

	private AtomicContext atomic(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AtomicContext _localctx = new AtomicContext(_ctx, _parentState);
		AtomicContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_atomic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(65);
				match(MINUS);
				setState(66);
				((AtomicContext)_localctx).nextExpr = atomic(5);
				((AtomicContext)_localctx).expression =  new UnaryMinus(((AtomicContext)_localctx).nextExpr.expression);
				}
				break;
			case BRLEFT:
				{
				setState(69);
				match(BRLEFT);
				setState(70);
				((AtomicContext)_localctx).nextExpr1 = plus(0);
				setState(71);
				match(BRRIGHT);
				((AtomicContext)_localctx).expression =  new Parenthesis(((AtomicContext)_localctx).nextExpr1.expression);
				}
				break;
			case SiNum:
			case MuNum:
				{
				setState(74);
				((AtomicContext)_localctx).nextExpr2 = num();
				((AtomicContext)_localctx).expression =  ((AtomicContext)_localctx).nextExpr2.expression;
				}
				break;
			case SQRT:
				{
				setState(77);
				match(SQRT);
				setState(78);
				match(CBRLEFT);
				setState(79);
				((AtomicContext)_localctx).nextExpr3 = plus(0);
				setState(80);
				match(CBRRIGHT);
				((AtomicContext)_localctx).expression =  new Sqrt(((AtomicContext)_localctx).nextExpr3.expression);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AtomicContext(_parentctx, _parentState);
					_localctx.expr = _prevctx;
					_localctx.expr = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_atomic);
					setState(85);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(86);
					match(CBRLEFT);
					setState(87);
					((AtomicContext)_localctx).power = num();
					setState(88);
					match(CBRRIGHT);
					((AtomicContext)_localctx).expression =  new Pow(((AtomicContext)_localctx).expr.expression, ((AtomicContext)_localctx).power.expression);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumContext extends ParserRuleContext {
		public Expression expression;
		public Token SiNum;
		public TerminalNode SiNum() { return getToken(Tex2MathMLParser.SiNum, 0); }
		public TerminalNode MuNum() { return getToken(Tex2MathMLParser.MuNum, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_num);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SiNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((NumContext)_localctx).SiNum = match(SiNum);
				((NumContext)_localctx).expression =  new MyNumber((((NumContext)_localctx).SiNum!=null?((NumContext)_localctx).SiNum.getText():null));
				}
				break;
			case MuNum:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(MuNum);
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

	public static class FracContext extends ParserRuleContext {
		public Expression expression;
		public PlusContext left;
		public PlusContext right;
		public TerminalNode FRAC() { return getToken(Tex2MathMLParser.FRAC, 0); }
		public List<TerminalNode> CBRLEFT() { return getTokens(Tex2MathMLParser.CBRLEFT); }
		public TerminalNode CBRLEFT(int i) {
			return getToken(Tex2MathMLParser.CBRLEFT, i);
		}
		public List<TerminalNode> CBRRIGHT() { return getTokens(Tex2MathMLParser.CBRRIGHT); }
		public TerminalNode CBRRIGHT(int i) {
			return getToken(Tex2MathMLParser.CBRRIGHT, i);
		}
		public List<PlusContext> plus() {
			return getRuleContexts(PlusContext.class);
		}
		public PlusContext plus(int i) {
			return getRuleContext(PlusContext.class,i);
		}
		public FracContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frac; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).enterFrac(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).exitFrac(this);
		}
	}

	public final FracContext frac() throws RecognitionException {
		FracContext _localctx = new FracContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_frac);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(FRAC);
			setState(102);
			match(CBRLEFT);
			setState(103);
			((FracContext)_localctx).left = plus(0);
			setState(104);
			match(CBRRIGHT);
			setState(105);
			match(CBRLEFT);
			setState(106);
			((FracContext)_localctx).right = plus(0);
			setState(107);
			match(CBRRIGHT);
			((FracContext)_localctx).expression =  new Frac(((FracContext)_localctx).left.expression, ((FracContext)_localctx).right.expression);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return plus_sempred((PlusContext)_localctx, predIndex);
		case 2:
			return mult_sempred((MultContext)_localctx, predIndex);
		case 3:
			return atomic_sempred((AtomicContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean plus_sempred(PlusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean mult_sempred(MultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean atomic_sempred(AtomicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\5\2\33\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5V\n\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5\3\6\3\6\3\6\5\6f\n\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\2\5\4\6\b\b\2\4\6\b\n\f\2\2\2t\2\32"+
		"\3\2\2\2\4#\3\2\2\2\6\64\3\2\2\2\bU\3\2\2\2\ne\3\2\2\2\fg\3\2\2\2\16\17"+
		"\7\3\2\2\17\20\5\4\3\2\20\21\7\21\2\2\21\22\5\4\3\2\22\23\7\3\2\2\23\24"+
		"\b\2\1\2\24\33\3\2\2\2\25\26\7\3\2\2\26\27\5\4\3\2\27\30\7\3\2\2\30\31"+
		"\b\2\1\2\31\33\3\2\2\2\32\16\3\2\2\2\32\25\3\2\2\2\33\3\3\2\2\2\34\35"+
		"\b\3\1\2\35\36\5\f\7\2\36\37\b\3\1\2\37$\3\2\2\2 !\5\6\4\2!\"\b\3\1\2"+
		"\"$\3\2\2\2#\34\3\2\2\2# \3\2\2\2$\61\3\2\2\2%&\f\6\2\2&\'\7\7\2\2\'("+
		"\5\6\4\2()\b\3\1\2)\60\3\2\2\2*+\f\5\2\2+,\7\7\2\2,-\5\f\7\2-.\b\3\1\2"+
		".\60\3\2\2\2/%\3\2\2\2/*\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2"+
		"\2\62\5\3\2\2\2\63\61\3\2\2\2\64\65\b\4\1\2\65\66\5\b\5\2\66\67\b\4\1"+
		"\2\67?\3\2\2\289\f\4\2\29:\7\t\2\2:;\5\b\5\2;<\b\4\1\2<>\3\2\2\2=8\3\2"+
		"\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\7\3\2\2\2A?\3\2\2\2BC\b\5\1\2CD\7"+
		"\b\2\2DE\5\b\5\7EF\b\5\1\2FV\3\2\2\2GH\7\17\2\2HI\5\4\3\2IJ\7\20\2\2J"+
		"K\b\5\1\2KV\3\2\2\2LM\5\n\6\2MN\b\5\1\2NV\3\2\2\2OP\7\16\2\2PQ\7\13\2"+
		"\2QR\5\4\3\2RS\7\f\2\2ST\b\5\1\2TV\3\2\2\2UB\3\2\2\2UG\3\2\2\2UL\3\2\2"+
		"\2UO\3\2\2\2V_\3\2\2\2WX\f\3\2\2XY\7\13\2\2YZ\5\n\6\2Z[\7\f\2\2[\\\b\5"+
		"\1\2\\^\3\2\2\2]W\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\t\3\2\2\2a_\3"+
		"\2\2\2bc\7\5\2\2cf\b\6\1\2df\7\6\2\2eb\3\2\2\2ed\3\2\2\2f\13\3\2\2\2g"+
		"h\7\n\2\2hi\7\13\2\2ij\5\4\3\2jk\7\f\2\2kl\7\13\2\2lm\5\4\3\2mn\7\f\2"+
		"\2no\b\7\1\2o\r\3\2\2\2\n\32#/\61?U_e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}