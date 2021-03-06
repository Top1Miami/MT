// Generated from Gram4Gram.g4 by ANTLR 4.7.1

package main.generatedLexerParser;
import main.classes4gram.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Gram4GramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NonTerm=1, Term=2, Delim=3, Arr=4, WS=5, Colon=6, Regexp=7, RP=8, LP=9, 
		COMMA=10, Ret=11, Action=12, Import=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NonTerm", "Term", "Delim", "Arr", "WS", "Colon", "Regexp", "RP", "LP", 
		"COMMA", "Ret", "Action", "Import"
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


	public Gram4GramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gram4Gram.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17b\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\3\3\3"+
		"\7\3\'\n\3\f\3\16\3*\13\3\3\4\3\4\3\5\3\5\3\5\3\6\6\6\62\n\6\r\6\16\6"+
		"\63\3\6\3\6\3\7\3\7\3\b\3\b\7\b<\n\b\f\b\16\b?\13\b\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\rT\n\r"+
		"\f\r\16\rW\13\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\2\2\17"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\b"+
		"\3\2c|\4\2C\\c|\3\2C\\\5\2\13\f\17\17\"\"\4\2>>@@\4\2}}\177\177\2f\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5$\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13"+
		"\61\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2"+
		"\2\27H\3\2\2\2\31Q\3\2\2\2\33Z\3\2\2\2\35!\t\2\2\2\36 \t\3\2\2\37\36\3"+
		"\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\4\3\2\2\2#!\3\2\2\2$(\t\4\2"+
		"\2%\'\t\3\2\2&%\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2)\6\3\2\2\2*(\3"+
		"\2\2\2+,\7~\2\2,\b\3\2\2\2-.\7/\2\2./\7@\2\2/\n\3\2\2\2\60\62\t\5\2\2"+
		"\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\b\6\2\2\66\f\3\2\2\2\678\7<\2\28\16\3\2\2\29=\7>\2\2:<\n\6\2\2"+
		";:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7@\2\2"+
		"A\20\3\2\2\2BC\7_\2\2C\22\3\2\2\2DE\7]\2\2E\24\3\2\2\2FG\7.\2\2G\26\3"+
		"\2\2\2HI\7a\2\2IJ\7t\2\2JK\7g\2\2KL\7v\2\2LM\7w\2\2MN\7t\2\2NO\7p\2\2"+
		"OP\7u\2\2P\30\3\2\2\2QU\7}\2\2RT\n\7\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7\177\2\2Y\32\3\2\2\2Z[\7a\2\2[\\\7k"+
		"\2\2\\]\7o\2\2]^\7r\2\2^_\7q\2\2_`\7t\2\2`a\7v\2\2a\34\3\2\2\2\b\2!(\63"+
		"=U\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}