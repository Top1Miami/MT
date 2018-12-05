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
		INDICE=1, DOLLAR=2, WS=3, SiNum=4, MuNum=5, Letters=6, PLUS=7, MINUS=8, 
		MULT=9, FRAC=10, CBRLEFT=11, CBRRIGHT=12, POW=13, SQRT=14, BRLEFT=15, 
		BRRIGHT=16, EQUAL=17;
	public static final int
		RULE_begin = 0, RULE_plus = 1, RULE_minus = 2, RULE_mult = 3, RULE_atomic = 4, 
		RULE_num = 5, RULE_frac = 6;
	public static final String[] ruleNames = {
		"begin", "plus", "minus", "mult", "atomic", "num", "frac"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'$'", null, null, null, null, "'+'", "'-'", "'*'", "'\\frac'", 
		"'{'", "'}'", "'^'", "'\\sqrt'", "'('", "')'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INDICE", "DOLLAR", "WS", "SiNum", "MuNum", "Letters", "PLUS", "MINUS", 
		"MULT", "FRAC", "CBRLEFT", "CBRRIGHT", "POW", "SQRT", "BRLEFT", "BRRIGHT", 
		"EQUAL"
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
	public static class BeginContext extends ParserRuleContext {
		public Expression expression;
		public PlusContext left;
		public PlusContext right;
		public MinusContext left1;
		public MinusContext right1;
		public PlusContext nextExpr;
		public MinusContext nextExpr1;
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
		public List<MinusContext> minus() {
			return getRuleContexts(MinusContext.class);
		}
		public MinusContext minus(int i) {
			return getRuleContext(MinusContext.class,i);
		}
		public BeginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).enterBegin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).exitBegin(this);
		}
	}

	public final BeginContext begin() throws RecognitionException {
		BeginContext _localctx = new BeginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_begin);
		try {
			setState(38);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				match(DOLLAR);
				setState(15);
				((BeginContext)_localctx).left = plus(0);
				setState(16);
				match(EQUAL);
				setState(17);
				((BeginContext)_localctx).right = plus(0);
				setState(18);
				match(DOLLAR);
				((BeginContext)_localctx).expression =  new Equal(((BeginContext)_localctx).left.expression, ((BeginContext)_localctx).right.expression);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(DOLLAR);
				setState(22);
				((BeginContext)_localctx).left1 = minus(0);
				setState(23);
				match(EQUAL);
				setState(24);
				((BeginContext)_localctx).right1 = minus(0);
				setState(25);
				match(DOLLAR);
				((BeginContext)_localctx).expression =  new Equal(((BeginContext)_localctx).left1.expression, ((BeginContext)_localctx).right1.expression);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				match(DOLLAR);
				setState(29);
				((BeginContext)_localctx).nextExpr = plus(0);
				setState(30);
				match(DOLLAR);
				((BeginContext)_localctx).expression =  ((BeginContext)_localctx).nextExpr.expression;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				match(DOLLAR);
				setState(34);
				((BeginContext)_localctx).nextExpr1 = minus(0);
				setState(35);
				match(DOLLAR);
				((BeginContext)_localctx).expression =  ((BeginContext)_localctx).nextExpr1.expression;
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
		public FracContext nextExpr1;
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
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FRAC:
				{
				setState(41);
				((PlusContext)_localctx).nextExpr1 = frac();
				((PlusContext)_localctx).expression =  ((PlusContext)_localctx).nextExpr1.expression;
				}
				break;
			case SiNum:
			case MuNum:
			case Letters:
			case MINUS:
			case SQRT:
			case BRLEFT:
				{
				setState(44);
				((PlusContext)_localctx).nextExpr = mult(0);
				((PlusContext)_localctx).expression =  ((PlusContext)_localctx).nextExpr.expression;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(59);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new PlusContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_plus);
						setState(49);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(50);
						match(PLUS);
						setState(51);
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
						setState(54);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(55);
						match(PLUS);
						setState(56);
						((PlusContext)_localctx).right1 = frac();
						((PlusContext)_localctx).expression =  new Plus(((PlusContext)_localctx).left1.expression, ((PlusContext)_localctx).right1.expression);
						}
						break;
					}
					} 
				}
				setState(63);
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

	public static class MinusContext extends ParserRuleContext {
		public Expression expression;
		public MinusContext left;
		public PlusContext left1;
		public FracContext right1;
		public FracContext nextExpr1;
		public MultContext nextExpr;
		public MinusContext right;
		public TerminalNode MINUS() { return getToken(Tex2MathMLParser.MINUS, 0); }
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public FracContext frac() {
			return getRuleContext(FracContext.class,0);
		}
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public List<MinusContext> minus() {
			return getRuleContexts(MinusContext.class);
		}
		public MinusContext minus(int i) {
			return getRuleContext(MinusContext.class,i);
		}
		public MinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Tex2MathMLListener ) ((Tex2MathMLListener)listener).exitMinus(this);
		}
	}

	public final MinusContext minus() throws RecognitionException {
		return minus(0);
	}

	private MinusContext minus(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MinusContext _localctx = new MinusContext(_ctx, _parentState);
		MinusContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_minus, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(65);
				((MinusContext)_localctx).left1 = plus(0);
				setState(66);
				match(MINUS);
				setState(67);
				((MinusContext)_localctx).right1 = frac();
				((MinusContext)_localctx).expression =  new Minus(((MinusContext)_localctx).left1.expression, ((MinusContext)_localctx).right1.expression);
				}
				break;
			case 2:
				{
				setState(70);
				((MinusContext)_localctx).nextExpr1 = frac();
				((MinusContext)_localctx).expression =  ((MinusContext)_localctx).nextExpr1.expression;
				}
				break;
			case 3:
				{
				setState(73);
				((MinusContext)_localctx).nextExpr = mult(0);
				((MinusContext)_localctx).expression =  ((MinusContext)_localctx).nextExpr.expression;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MinusContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_minus);
					setState(78);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(79);
					match(MINUS);
					setState(80);
					((MinusContext)_localctx).right = minus(5);
					((MinusContext)_localctx).expression =  new Minus(((MinusContext)_localctx).left.expression, ((MinusContext)_localctx).right.expression);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_mult, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(89);
			((MultContext)_localctx).nextExpr = atomic(0);
			((MultContext)_localctx).expression =  ((MultContext)_localctx).nextExpr.expression;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
					setState(92);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(93);
					match(MULT);
					setState(94);
					((MultContext)_localctx).right = atomic(0);
					((MultContext)_localctx).expression =  new Mult(((MultContext)_localctx).left.expression, ((MultContext)_localctx).right.expression);
					}
					} 
				}
				setState(101);
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

	public static class AtomicContext extends ParserRuleContext {
		public Expression expression;
		public AtomicContext expr4;
		public AtomicContext expr5;
		public AtomicContext expr6;
		public AtomicContext expr;
		public AtomicContext expr1;
		public AtomicContext expr2;
		public AtomicContext expr3;
		public AtomicContext nextExpr;
		public PlusContext nextExpr1;
		public MinusContext nextExpr5;
		public NumContext nextExpr2;
		public PlusContext nextExpr3;
		public MinusContext nextExpr4;
		public NumContext index1;
		public Token SiNum;
		public NumContext index2;
		public Token MuNum;
		public NumContext index3;
		public Token Letters;
		public NumContext power;
		public NumContext index;
		public TerminalNode MINUS() { return getToken(Tex2MathMLParser.MINUS, 0); }
		public AtomicContext atomic() {
			return getRuleContext(AtomicContext.class,0);
		}
		public TerminalNode BRLEFT() { return getToken(Tex2MathMLParser.BRLEFT, 0); }
		public TerminalNode BRRIGHT() { return getToken(Tex2MathMLParser.BRRIGHT, 0); }
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public MinusContext minus() {
			return getRuleContext(MinusContext.class,0);
		}
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode SQRT() { return getToken(Tex2MathMLParser.SQRT, 0); }
		public TerminalNode CBRLEFT() { return getToken(Tex2MathMLParser.CBRLEFT, 0); }
		public TerminalNode CBRRIGHT() { return getToken(Tex2MathMLParser.CBRRIGHT, 0); }
		public TerminalNode INDICE() { return getToken(Tex2MathMLParser.INDICE, 0); }
		public TerminalNode POW() { return getToken(Tex2MathMLParser.POW, 0); }
		public TerminalNode SiNum() { return getToken(Tex2MathMLParser.SiNum, 0); }
		public TerminalNode MuNum() { return getToken(Tex2MathMLParser.MuNum, 0); }
		public TerminalNode Letters() { return getToken(Tex2MathMLParser.Letters, 0); }
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_atomic, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(103);
				match(MINUS);
				setState(104);
				((AtomicContext)_localctx).nextExpr = atomic(13);
				((AtomicContext)_localctx).expression =  new UnaryMinus(((AtomicContext)_localctx).nextExpr.expression);
				}
				break;
			case 2:
				{
				setState(107);
				match(BRLEFT);
				setState(108);
				((AtomicContext)_localctx).nextExpr1 = plus(0);
				setState(109);
				match(BRRIGHT);
				((AtomicContext)_localctx).expression =  new Parenthesis(((AtomicContext)_localctx).nextExpr1.expression);
				}
				break;
			case 3:
				{
				setState(112);
				match(BRLEFT);
				setState(113);
				((AtomicContext)_localctx).nextExpr5 = minus(0);
				setState(114);
				match(BRRIGHT);
				((AtomicContext)_localctx).expression =  new Parenthesis(((AtomicContext)_localctx).nextExpr5.expression);
				}
				break;
			case 4:
				{
				setState(117);
				((AtomicContext)_localctx).nextExpr2 = num();
				((AtomicContext)_localctx).expression =  ((AtomicContext)_localctx).nextExpr2.expression;
				}
				break;
			case 5:
				{
				setState(120);
				match(SQRT);
				setState(121);
				match(CBRLEFT);
				setState(122);
				((AtomicContext)_localctx).nextExpr3 = plus(0);
				setState(123);
				match(CBRRIGHT);
				((AtomicContext)_localctx).expression =  new Sqrt(((AtomicContext)_localctx).nextExpr3.expression);
				}
				break;
			case 6:
				{
				setState(126);
				match(SQRT);
				setState(127);
				match(CBRLEFT);
				setState(128);
				((AtomicContext)_localctx).nextExpr4 = minus(0);
				setState(129);
				match(CBRRIGHT);
				((AtomicContext)_localctx).expression =  new Sqrt(((AtomicContext)_localctx).nextExpr4.expression);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new AtomicContext(_parentctx, _parentState);
						_localctx.expr4 = _prevctx;
						_localctx.expr4 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_atomic);
						setState(134);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(135);
						match(INDICE);
						setState(136);
						((AtomicContext)_localctx).index1 = num();
						setState(137);
						match(POW);
						setState(138);
						((AtomicContext)_localctx).SiNum = match(SiNum);
						((AtomicContext)_localctx).expression =  new SubSup(((AtomicContext)_localctx).expr4.expression, ((AtomicContext)_localctx).index1.expression, (((AtomicContext)_localctx).SiNum!=null?((AtomicContext)_localctx).SiNum.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new AtomicContext(_parentctx, _parentState);
						_localctx.expr5 = _prevctx;
						_localctx.expr5 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_atomic);
						setState(141);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(142);
						match(INDICE);
						setState(143);
						((AtomicContext)_localctx).index2 = num();
						setState(144);
						match(POW);
						setState(145);
						match(CBRLEFT);
						setState(146);
						((AtomicContext)_localctx).MuNum = match(MuNum);
						setState(147);
						match(CBRRIGHT);
						((AtomicContext)_localctx).expression =  new SubSup(((AtomicContext)_localctx).expr5.expression, ((AtomicContext)_localctx).index2.expression, (((AtomicContext)_localctx).MuNum!=null?((AtomicContext)_localctx).MuNum.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new AtomicContext(_parentctx, _parentState);
						_localctx.expr6 = _prevctx;
						_localctx.expr6 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_atomic);
						setState(150);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(151);
						match(INDICE);
						setState(152);
						((AtomicContext)_localctx).index3 = num();
						setState(153);
						match(POW);
						setState(154);
						((AtomicContext)_localctx).Letters = match(Letters);
						((AtomicContext)_localctx).expression =  new SubSup(((AtomicContext)_localctx).expr6.expression, ((AtomicContext)_localctx).index3.expression, (((AtomicContext)_localctx).Letters!=null?((AtomicContext)_localctx).Letters.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new AtomicContext(_parentctx, _parentState);
						_localctx.expr = _prevctx;
						_localctx.expr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_atomic);
						setState(157);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(158);
						match(POW);
						setState(159);
						match(CBRLEFT);
						setState(160);
						((AtomicContext)_localctx).power = num();
						setState(161);
						match(CBRRIGHT);
						((AtomicContext)_localctx).expression =  new Pow(((AtomicContext)_localctx).expr.expression, ((AtomicContext)_localctx).power.expression);
						}
						break;
					case 5:
						{
						_localctx = new AtomicContext(_parentctx, _parentState);
						_localctx.expr1 = _prevctx;
						_localctx.expr1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_atomic);
						setState(164);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(165);
						match(POW);
						setState(166);
						((AtomicContext)_localctx).SiNum = match(SiNum);
						((AtomicContext)_localctx).expression =  new Pow(((AtomicContext)_localctx).expr1.expression, (((AtomicContext)_localctx).SiNum!=null?((AtomicContext)_localctx).SiNum.getText():null));
						}
						break;
					case 6:
						{
						_localctx = new AtomicContext(_parentctx, _parentState);
						_localctx.expr2 = _prevctx;
						_localctx.expr2 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_atomic);
						setState(168);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(169);
						match(POW);
						setState(170);
						((AtomicContext)_localctx).Letters = match(Letters);
						((AtomicContext)_localctx).expression =  new Pow(((AtomicContext)_localctx).expr2.expression, (((AtomicContext)_localctx).Letters!=null?((AtomicContext)_localctx).Letters.getText():null));
						}
						break;
					case 7:
						{
						_localctx = new AtomicContext(_parentctx, _parentState);
						_localctx.expr3 = _prevctx;
						_localctx.expr3 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_atomic);
						setState(172);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(173);
						match(INDICE);
						setState(174);
						((AtomicContext)_localctx).index = num();
						((AtomicContext)_localctx).expression =  new Sub(((AtomicContext)_localctx).expr3.expression, ((AtomicContext)_localctx).index.expression);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public Token MuNum;
		public Token Letters;
		public TerminalNode SiNum() { return getToken(Tex2MathMLParser.SiNum, 0); }
		public TerminalNode MuNum() { return getToken(Tex2MathMLParser.MuNum, 0); }
		public TerminalNode Letters() { return getToken(Tex2MathMLParser.Letters, 0); }
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
		enterRule(_localctx, 10, RULE_num);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SiNum:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((NumContext)_localctx).SiNum = match(SiNum);
				((NumContext)_localctx).expression =  new MyNumber((((NumContext)_localctx).SiNum!=null?((NumContext)_localctx).SiNum.getText():null));
				}
				break;
			case MuNum:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				((NumContext)_localctx).MuNum = match(MuNum);
				((NumContext)_localctx).expression =  new MyNumber((((NumContext)_localctx).MuNum!=null?((NumContext)_localctx).MuNum.getText():null));
				}
				break;
			case Letters:
				enterOuterAlt(_localctx, 3);
				{
				setState(186);
				((NumContext)_localctx).Letters = match(Letters);
				((NumContext)_localctx).expression =  new MyNumber((((NumContext)_localctx).Letters!=null?((NumContext)_localctx).Letters.getText():null));
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
		public MinusContext left1;
		public MinusContext right1;
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
		public List<MinusContext> minus() {
			return getRuleContexts(MinusContext.class);
		}
		public MinusContext minus(int i) {
			return getRuleContext(MinusContext.class,i);
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
		enterRule(_localctx, 12, RULE_frac);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(FRAC);
				setState(191);
				match(CBRLEFT);
				setState(192);
				((FracContext)_localctx).left = plus(0);
				setState(193);
				match(CBRRIGHT);
				setState(194);
				match(CBRLEFT);
				setState(195);
				((FracContext)_localctx).right = plus(0);
				setState(196);
				match(CBRRIGHT);
				((FracContext)_localctx).expression =  new Frac(((FracContext)_localctx).left.expression, ((FracContext)_localctx).right.expression);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(FRAC);
				setState(200);
				match(CBRLEFT);
				setState(201);
				((FracContext)_localctx).left1 = minus(0);
				setState(202);
				match(CBRRIGHT);
				setState(203);
				match(CBRLEFT);
				setState(204);
				((FracContext)_localctx).right1 = minus(0);
				setState(205);
				match(CBRRIGHT);
				((FracContext)_localctx).expression =  new Frac(((FracContext)_localctx).left1.expression, ((FracContext)_localctx).right1.expression);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return plus_sempred((PlusContext)_localctx, predIndex);
		case 2:
			return minus_sempred((MinusContext)_localctx, predIndex);
		case 3:
			return mult_sempred((MultContext)_localctx, predIndex);
		case 4:
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
	private boolean minus_sempred(MinusContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean mult_sempred(MultContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean atomic_sempred(AtomicContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 6);
		case 6:
			return precpred(_ctx, 5);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23\u00d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\7\3>\n\3\f\3\16\3A\13\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\4\3\4\3\4\3\4\3\4\7\4V\n\4\f\4\16"+
		"\4Y\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5d\n\5\f\5\16\5g\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0087\n\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00b4\n\6\f\6\16\6\u00b7\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u00bf\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d3\n\b\3\b\2\6\4\6\b\n\t\2\4\6\b\n"+
		"\f\16\2\2\2\u00e6\2(\3\2\2\2\4\61\3\2\2\2\6N\3\2\2\2\bZ\3\2\2\2\n\u0086"+
		"\3\2\2\2\f\u00be\3\2\2\2\16\u00d2\3\2\2\2\20\21\7\4\2\2\21\22\5\4\3\2"+
		"\22\23\7\23\2\2\23\24\5\4\3\2\24\25\7\4\2\2\25\26\b\2\1\2\26)\3\2\2\2"+
		"\27\30\7\4\2\2\30\31\5\6\4\2\31\32\7\23\2\2\32\33\5\6\4\2\33\34\7\4\2"+
		"\2\34\35\b\2\1\2\35)\3\2\2\2\36\37\7\4\2\2\37 \5\4\3\2 !\7\4\2\2!\"\b"+
		"\2\1\2\")\3\2\2\2#$\7\4\2\2$%\5\6\4\2%&\7\4\2\2&\'\b\2\1\2\')\3\2\2\2"+
		"(\20\3\2\2\2(\27\3\2\2\2(\36\3\2\2\2(#\3\2\2\2)\3\3\2\2\2*+\b\3\1\2+,"+
		"\5\16\b\2,-\b\3\1\2-\62\3\2\2\2./\5\b\5\2/\60\b\3\1\2\60\62\3\2\2\2\61"+
		"*\3\2\2\2\61.\3\2\2\2\62?\3\2\2\2\63\64\f\6\2\2\64\65\7\t\2\2\65\66\5"+
		"\b\5\2\66\67\b\3\1\2\67>\3\2\2\289\f\5\2\29:\7\t\2\2:;\5\16\b\2;<\b\3"+
		"\1\2<>\3\2\2\2=\63\3\2\2\2=8\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\5"+
		"\3\2\2\2A?\3\2\2\2BC\b\4\1\2CD\5\4\3\2DE\7\n\2\2EF\5\16\b\2FG\b\4\1\2"+
		"GO\3\2\2\2HI\5\16\b\2IJ\b\4\1\2JO\3\2\2\2KL\5\b\5\2LM\b\4\1\2MO\3\2\2"+
		"\2NB\3\2\2\2NH\3\2\2\2NK\3\2\2\2OW\3\2\2\2PQ\f\6\2\2QR\7\n\2\2RS\5\6\4"+
		"\7ST\b\4\1\2TV\3\2\2\2UP\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\7\3\2"+
		"\2\2YW\3\2\2\2Z[\b\5\1\2[\\\5\n\6\2\\]\b\5\1\2]e\3\2\2\2^_\f\4\2\2_`\7"+
		"\13\2\2`a\5\n\6\2ab\b\5\1\2bd\3\2\2\2c^\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef"+
		"\3\2\2\2f\t\3\2\2\2ge\3\2\2\2hi\b\6\1\2ij\7\n\2\2jk\5\n\6\17kl\b\6\1\2"+
		"l\u0087\3\2\2\2mn\7\21\2\2no\5\4\3\2op\7\22\2\2pq\b\6\1\2q\u0087\3\2\2"+
		"\2rs\7\21\2\2st\5\6\4\2tu\7\22\2\2uv\b\6\1\2v\u0087\3\2\2\2wx\5\f\7\2"+
		"xy\b\6\1\2y\u0087\3\2\2\2z{\7\20\2\2{|\7\r\2\2|}\5\4\3\2}~\7\16\2\2~\177"+
		"\b\6\1\2\177\u0087\3\2\2\2\u0080\u0081\7\20\2\2\u0081\u0082\7\r\2\2\u0082"+
		"\u0083\5\6\4\2\u0083\u0084\7\16\2\2\u0084\u0085\b\6\1\2\u0085\u0087\3"+
		"\2\2\2\u0086h\3\2\2\2\u0086m\3\2\2\2\u0086r\3\2\2\2\u0086w\3\2\2\2\u0086"+
		"z\3\2\2\2\u0086\u0080\3\2\2\2\u0087\u00b5\3\2\2\2\u0088\u0089\f\t\2\2"+
		"\u0089\u008a\7\3\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\17\2\2\u008c\u008d"+
		"\7\6\2\2\u008d\u008e\b\6\1\2\u008e\u00b4\3\2\2\2\u008f\u0090\f\b\2\2\u0090"+
		"\u0091\7\3\2\2\u0091\u0092\5\f\7\2\u0092\u0093\7\17\2\2\u0093\u0094\7"+
		"\r\2\2\u0094\u0095\7\7\2\2\u0095\u0096\7\16\2\2\u0096\u0097\b\6\1\2\u0097"+
		"\u00b4\3\2\2\2\u0098\u0099\f\7\2\2\u0099\u009a\7\3\2\2\u009a\u009b\5\f"+
		"\7\2\u009b\u009c\7\17\2\2\u009c\u009d\7\b\2\2\u009d\u009e\b\6\1\2\u009e"+
		"\u00b4\3\2\2\2\u009f\u00a0\f\6\2\2\u00a0\u00a1\7\17\2\2\u00a1\u00a2\7"+
		"\r\2\2\u00a2\u00a3\5\f\7\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\b\6\1\2\u00a5"+
		"\u00b4\3\2\2\2\u00a6\u00a7\f\5\2\2\u00a7\u00a8\7\17\2\2\u00a8\u00a9\7"+
		"\6\2\2\u00a9\u00b4\b\6\1\2\u00aa\u00ab\f\4\2\2\u00ab\u00ac\7\17\2\2\u00ac"+
		"\u00ad\7\b\2\2\u00ad\u00b4\b\6\1\2\u00ae\u00af\f\3\2\2\u00af\u00b0\7\3"+
		"\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\b\6\1\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u0088\3\2\2\2\u00b3\u008f\3\2\2\2\u00b3\u0098\3\2\2\2\u00b3\u009f\3\2"+
		"\2\2\u00b3\u00a6\3\2\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4"+
		"\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\13\3\2\2"+
		"\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00bf\b\7\1\2\u00ba\u00bb"+
		"\7\7\2\2\u00bb\u00bf\b\7\1\2\u00bc\u00bd\7\b\2\2\u00bd\u00bf\b\7\1\2\u00be"+
		"\u00b8\3\2\2\2\u00be\u00ba\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\r\3\2\2\2"+
		"\u00c0\u00c1\7\f\2\2\u00c1\u00c2\7\r\2\2\u00c2\u00c3\5\4\3\2\u00c3\u00c4"+
		"\7\16\2\2\u00c4\u00c5\7\r\2\2\u00c5\u00c6\5\4\3\2\u00c6\u00c7\7\16\2\2"+
		"\u00c7\u00c8\b\b\1\2\u00c8\u00d3\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb"+
		"\7\r\2\2\u00cb\u00cc\5\6\4\2\u00cc\u00cd\7\16\2\2\u00cd\u00ce\7\r\2\2"+
		"\u00ce\u00cf\5\6\4\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\b\b\1\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00c0\3\2\2\2\u00d2\u00c9\3\2\2\2\u00d3\17\3\2\2\2\16("+
		"\61=?NWe\u0086\u00b3\u00b5\u00be\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}