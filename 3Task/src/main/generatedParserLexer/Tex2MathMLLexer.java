// Generated from Tex2MathML.g4 by ANTLR 4.7.1
package main.generatedParserLexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Tex2MathMLLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DOLLAR=1, WS=2, SiNum=3, MuNum=4, PLUS=5, MINUS=6, MULT=7, FRAC=8, CBRLEFT=9, 
		CBRRIGHT=10, POW=11, SQRT=12, BRLEFT=13, BRRIGHT=14, EQUAL=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DOLLAR", "WS", "SiNum", "MuNum", "PLUS", "MINUS", "MULT", "FRAC", "CBRLEFT", 
		"CBRRIGHT", "POW", "SQRT", "BRLEFT", "BRRIGHT", "EQUAL"
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


	public Tex2MathMLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Tex2MathML.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21P\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\6\3%\n\3"+
		"\r\3\16\3&\3\3\3\3\3\4\3\4\3\5\3\5\6\5/\n\5\r\5\16\5\60\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\2\2\21\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\5\5\2\13"+
		"\f\17\17\"\"\3\2\63;\3\2\62;\2Q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\3!\3\2\2\2\5$\3\2\2\2\7*\3\2\2\2\t,\3\2\2\2\13\62\3\2\2"+
		"\2\r\64\3\2\2\2\17\66\3\2\2\2\218\3\2\2\2\23>\3\2\2\2\25@\3\2\2\2\27B"+
		"\3\2\2\2\31D\3\2\2\2\33J\3\2\2\2\35L\3\2\2\2\37N\3\2\2\2!\"\7&\2\2\"\4"+
		"\3\2\2\2#%\t\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2"+
		"()\b\3\2\2)\6\3\2\2\2*+\t\3\2\2+\b\3\2\2\2,.\t\3\2\2-/\t\4\2\2.-\3\2\2"+
		"\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\n\3\2\2\2\62\63\7-\2\2\63"+
		"\f\3\2\2\2\64\65\7/\2\2\65\16\3\2\2\2\66\67\7,\2\2\67\20\3\2\2\289\7^"+
		"\2\29:\7h\2\2:;\7t\2\2;<\7c\2\2<=\7e\2\2=\22\3\2\2\2>?\7}\2\2?\24\3\2"+
		"\2\2@A\7\177\2\2A\26\3\2\2\2BC\7`\2\2C\30\3\2\2\2DE\7^\2\2EF\7u\2\2FG"+
		"\7s\2\2GH\7t\2\2HI\7v\2\2I\32\3\2\2\2JK\7*\2\2K\34\3\2\2\2LM\7+\2\2M\36"+
		"\3\2\2\2NO\7?\2\2O \3\2\2\2\5\2&\60\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}