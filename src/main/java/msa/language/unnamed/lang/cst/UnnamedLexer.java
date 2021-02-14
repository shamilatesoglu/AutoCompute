// Generated from D:/Library/Repos/Unnamed/grammar\Unnamed.g4 by ANTLR 4.9.1
package msa.language.unnamed.lang.cst;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnnamedLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, IN=5, OUT=6, ENTITY=7, GIVEN=8, DOT=9, 
		DOTDOT=10, ASSIGN=11, LCURLY=12, RCURLY=13, LBRACKET=14, RBRACKET=15, 
		BOOLEAN_LITERAL=16, TRUE=17, FALSE=18, OPERATOR_ADD=19, OPERATOR_SUB=20, 
		OPERATOR_MUL=21, OPERATOR_DIV=22, OPERATOR_AND=23, OPERATOR_OR=24, OPERATOR_EQ=25, 
		OPERATOR_NEQ=26, OPERATOR_GT=27, OPERATOR_LT=28, OPERATOR_GTEQ=29, OPERATOR_LTEQ=30, 
		NUM=31, ID=32, WS=33;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "IN", "OUT", "ENTITY", "GIVEN", "DOT", 
			"DOTDOT", "ASSIGN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "BOOLEAN_LITERAL", 
			"TRUE", "FALSE", "OPERATOR_ADD", "OPERATOR_SUB", "OPERATOR_MUL", "OPERATOR_DIV", 
			"OPERATOR_AND", "OPERATOR_OR", "OPERATOR_EQ", "OPERATOR_NEQ", "OPERATOR_GT", 
			"OPERATOR_LT", "OPERATOR_GTEQ", "OPERATOR_LTEQ", "NUM", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'?'", "':'", null, null, null, null, "'.'", "'..'", 
			"':='", "'{'", "'}'", "'['", "']'", null, null, null, "'+'", "'-'", "'*'", 
			"'/'", "'&&'", "'||'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "IN", "OUT", "ENTITY", "GIVEN", "DOT", 
			"DOTDOT", "ASSIGN", "LCURLY", "RCURLY", "LBRACKET", "RBRACKET", "BOOLEAN_LITERAL", 
			"TRUE", "FALSE", "OPERATOR_ADD", "OPERATOR_SUB", "OPERATOR_MUL", "OPERATOR_DIV", 
			"OPERATOR_AND", "OPERATOR_OR", "OPERATOR_EQ", "OPERATOR_NEQ", "OPERATOR_GT", 
			"OPERATOR_LT", "OPERATOR_GTEQ", "OPERATOR_LTEQ", "NUM", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public UnnamedLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Unnamed.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2#\u00ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\5"+
		"\21t\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22~\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u008a\n\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \6"+
		" \u00ab\n \r \16 \u00ac\3 \3 \6 \u00b1\n \r \16 \u00b2\5 \u00b5\n \3 "+
		"\3 \5 \u00b9\n \3 \6 \u00bc\n \r \16 \u00bd\5 \u00c0\n \3!\6!\u00c3\n"+
		"!\r!\16!\u00c4\3\"\3\"\3\"\3\"\2\2#\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#\3\2\17\4\2KKkk\4\2PPpp\4"+
		"\2QQqq\4\2WWww\4\2VVvv\4\2GGgg\4\2[[{{\4\2IIii\4\2XXxx\3\2\62;\4\2--/"+
		"/\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\3E\3\2\2\2\5G\3\2\2\2\7I\3\2\2\2\tK\3\2\2\2\13"+
		"M\3\2\2\2\rP\3\2\2\2\17T\3\2\2\2\21[\3\2\2\2\23a\3\2\2\2\25c\3\2\2\2\27"+
		"f\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35m\3\2\2\2\37o\3\2\2\2!s\3\2\2\2#}"+
		"\3\2\2\2%\u0089\3\2\2\2\'\u008b\3\2\2\2)\u008d\3\2\2\2+\u008f\3\2\2\2"+
		"-\u0091\3\2\2\2/\u0093\3\2\2\2\61\u0096\3\2\2\2\63\u0099\3\2\2\2\65\u009c"+
		"\3\2\2\2\67\u009f\3\2\2\29\u00a1\3\2\2\2;\u00a3\3\2\2\2=\u00a6\3\2\2\2"+
		"?\u00aa\3\2\2\2A\u00c2\3\2\2\2C\u00c6\3\2\2\2EF\7*\2\2F\4\3\2\2\2GH\7"+
		"+\2\2H\6\3\2\2\2IJ\7A\2\2J\b\3\2\2\2KL\7<\2\2L\n\3\2\2\2MN\t\2\2\2NO\t"+
		"\3\2\2O\f\3\2\2\2PQ\t\4\2\2QR\t\5\2\2RS\t\6\2\2S\16\3\2\2\2TU\t\7\2\2"+
		"UV\t\3\2\2VW\t\6\2\2WX\t\2\2\2XY\t\6\2\2YZ\t\b\2\2Z\20\3\2\2\2[\\\t\t"+
		"\2\2\\]\t\2\2\2]^\t\n\2\2^_\t\7\2\2_`\t\3\2\2`\22\3\2\2\2ab\7\60\2\2b"+
		"\24\3\2\2\2cd\7\60\2\2de\7\60\2\2e\26\3\2\2\2fg\7<\2\2gh\7?\2\2h\30\3"+
		"\2\2\2ij\7}\2\2j\32\3\2\2\2kl\7\177\2\2l\34\3\2\2\2mn\7]\2\2n\36\3\2\2"+
		"\2op\7_\2\2p \3\2\2\2qt\5#\22\2rt\5%\23\2sq\3\2\2\2sr\3\2\2\2t\"\3\2\2"+
		"\2uv\7V\2\2vw\7T\2\2wx\7W\2\2x~\7G\2\2yz\7v\2\2z{\7t\2\2{|\7w\2\2|~\7"+
		"g\2\2}u\3\2\2\2}y\3\2\2\2~$\3\2\2\2\177\u0080\7H\2\2\u0080\u0081\7C\2"+
		"\2\u0081\u0082\7N\2\2\u0082\u0083\7U\2\2\u0083\u008a\7G\2\2\u0084\u0085"+
		"\7h\2\2\u0085\u0086\7c\2\2\u0086\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088"+
		"\u008a\7g\2\2\u0089\177\3\2\2\2\u0089\u0084\3\2\2\2\u008a&\3\2\2\2\u008b"+
		"\u008c\7-\2\2\u008c(\3\2\2\2\u008d\u008e\7/\2\2\u008e*\3\2\2\2\u008f\u0090"+
		"\7,\2\2\u0090,\3\2\2\2\u0091\u0092\7\61\2\2\u0092.\3\2\2\2\u0093\u0094"+
		"\7(\2\2\u0094\u0095\7(\2\2\u0095\60\3\2\2\2\u0096\u0097\7~\2\2\u0097\u0098"+
		"\7~\2\2\u0098\62\3\2\2\2\u0099\u009a\7?\2\2\u009a\u009b\7?\2\2\u009b\64"+
		"\3\2\2\2\u009c\u009d\7#\2\2\u009d\u009e\7?\2\2\u009e\66\3\2\2\2\u009f"+
		"\u00a0\7@\2\2\u00a08\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2:\3\2\2\2\u00a3\u00a4"+
		"\7@\2\2\u00a4\u00a5\7?\2\2\u00a5<\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8>\3\2\2\2\u00a9\u00ab\t\13\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\3\2"+
		"\2\2\u00ae\u00b0\7\60\2\2\u00af\u00b1\t\13\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2"+
		"\2\2\u00b4\u00ae\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00bf\3\2\2\2\u00b6"+
		"\u00b8\t\7\2\2\u00b7\u00b9\t\f\2\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00bc\t\13\2\2\u00bb\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2"+
		"\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0@\3\2\2\2\u00c1\u00c3"+
		"\t\r\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5B\3\2\2\2\u00c6\u00c7\t\16\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00c9\b\"\2\2\u00c9D\3\2\2\2\r\2s}\u0089\u00ac\u00b2\u00b4\u00b8"+
		"\u00bd\u00bf\u00c4\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}