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
		T__0=1, T__1=2, T__2=3, STRING_LITERAL=4, IN=5, OUT=6, ENTITY=7, GIVEN=8, 
		CONSTRAINTS=9, DOT=10, DOTDOT=11, ASSIGN=12, LCURLY=13, RCURLY=14, LBRACKET=15, 
		RBRACKET=16, COMMA=17, COLON=18, BOOLEAN_LITERAL=19, TRUE=20, FALSE=21, 
		OPERATOR_ADD=22, OPERATOR_SUB=23, OPERATOR_MUL=24, OPERATOR_DIV=25, OPERATOR_AND=26, 
		OPERATOR_OR=27, OPERATOR_EQ=28, OPERATOR_NEQ=29, OPERATOR_GT=30, OPERATOR_LT=31, 
		OPERATOR_GTEQ=32, OPERATOR_LTEQ=33, NUM=34, ID=35, WS=36, COMMENT=37, 
		LINE_COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "STRING_LITERAL", "ESC", "IN", "OUT", "ENTITY", 
			"GIVEN", "CONSTRAINTS", "DOT", "DOTDOT", "ASSIGN", "LCURLY", "RCURLY", 
			"LBRACKET", "RBRACKET", "COMMA", "COLON", "BOOLEAN_LITERAL", "TRUE", 
			"FALSE", "OPERATOR_ADD", "OPERATOR_SUB", "OPERATOR_MUL", "OPERATOR_DIV", 
			"OPERATOR_AND", "OPERATOR_OR", "OPERATOR_EQ", "OPERATOR_NEQ", "OPERATOR_GT", 
			"OPERATOR_LT", "OPERATOR_GTEQ", "OPERATOR_LTEQ", "NUM", "ID", "WS", "COMMENT", 
			"LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'?'", null, null, null, null, null, null, "'.'", 
			"'..'", "':='", "'{'", "'}'", "'['", "']'", "','", "':'", null, null, 
			null, "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STRING_LITERAL", "IN", "OUT", "ENTITY", "GIVEN", 
			"CONSTRAINTS", "DOT", "DOTDOT", "ASSIGN", "LCURLY", "RCURLY", "LBRACKET", 
			"RBRACKET", "COMMA", "COLON", "BOOLEAN_LITERAL", "TRUE", "FALSE", "OPERATOR_ADD", 
			"OPERATOR_SUB", "OPERATOR_MUL", "OPERATOR_DIV", "OPERATOR_AND", "OPERATOR_OR", 
			"OPERATOR_EQ", "OPERATOR_NEQ", "OPERATOR_GT", "OPERATOR_LT", "OPERATOR_GTEQ", 
			"OPERATOR_LTEQ", "NUM", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u010d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6f"+
		"\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u009e\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00a8\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u00b4\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\6$\u00d5\n$\r$\16$\u00d6\3$\3$\6$\u00db"+
		"\n$\r$\16$\u00dc\5$\u00df\n$\3$\3$\5$\u00e3\n$\3$\6$\u00e6\n$\r$\16$\u00e7"+
		"\5$\u00ea\n$\3%\6%\u00ed\n%\r%\16%\u00ee\3&\3&\3&\3&\3\'\3\'\3\'\3\'\7"+
		"\'\u00f9\n\'\f\'\16\'\u00fc\13\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\7(\u0107"+
		"\n(\f(\16(\u010a\13(\3(\3(\3\u00fa\2)\3\3\5\4\7\5\t\6\13\2\r\7\17\b\21"+
		"\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27"+
		"/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(\3\2\25\6"+
		"\2\f\f\17\17$$^^\4\2KKkk\4\2PPpp\4\2QQqq\4\2WWww\4\2VVvv\4\2GGgg\4\2["+
		"[{{\4\2IIii\4\2XXxx\4\2EEee\4\2UUuu\4\2TTtt\4\2CCcc\3\2\62;\4\2--//\6"+
		"\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2\u011a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2"+
		"\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2"+
		"A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\tW\3\2\2\2\13e\3\2"+
		"\2\2\rg\3\2\2\2\17j\3\2\2\2\21n\3\2\2\2\23u\3\2\2\2\25{\3\2\2\2\27\u0087"+
		"\3\2\2\2\31\u0089\3\2\2\2\33\u008c\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3"+
		"\2\2\2!\u0093\3\2\2\2#\u0095\3\2\2\2%\u0097\3\2\2\2\'\u0099\3\2\2\2)\u009d"+
		"\3\2\2\2+\u00a7\3\2\2\2-\u00b3\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2"+
		"\63\u00b9\3\2\2\2\65\u00bb\3\2\2\2\67\u00bd\3\2\2\29\u00c0\3\2\2\2;\u00c3"+
		"\3\2\2\2=\u00c6\3\2\2\2?\u00c9\3\2\2\2A\u00cb\3\2\2\2C\u00cd\3\2\2\2E"+
		"\u00d0\3\2\2\2G\u00d4\3\2\2\2I\u00ec\3\2\2\2K\u00f0\3\2\2\2M\u00f4\3\2"+
		"\2\2O\u0102\3\2\2\2QR\7*\2\2R\4\3\2\2\2ST\7+\2\2T\6\3\2\2\2UV\7A\2\2V"+
		"\b\3\2\2\2W\\\7$\2\2X[\5\13\6\2Y[\n\2\2\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7$\2\2`\n\3\2\2\2ab\7"+
		"^\2\2bf\7$\2\2cd\7^\2\2df\7^\2\2ea\3\2\2\2ec\3\2\2\2f\f\3\2\2\2gh\t\3"+
		"\2\2hi\t\4\2\2i\16\3\2\2\2jk\t\5\2\2kl\t\6\2\2lm\t\7\2\2m\20\3\2\2\2n"+
		"o\t\b\2\2op\t\4\2\2pq\t\7\2\2qr\t\3\2\2rs\t\7\2\2st\t\t\2\2t\22\3\2\2"+
		"\2uv\t\n\2\2vw\t\3\2\2wx\t\13\2\2xy\t\b\2\2yz\t\4\2\2z\24\3\2\2\2{|\t"+
		"\f\2\2|}\t\5\2\2}~\t\4\2\2~\177\t\r\2\2\177\u0080\t\7\2\2\u0080\u0081"+
		"\t\16\2\2\u0081\u0082\t\17\2\2\u0082\u0083\t\3\2\2\u0083\u0084\t\4\2\2"+
		"\u0084\u0085\t\7\2\2\u0085\u0086\t\r\2\2\u0086\26\3\2\2\2\u0087\u0088"+
		"\7\60\2\2\u0088\30\3\2\2\2\u0089\u008a\7\60\2\2\u008a\u008b\7\60\2\2\u008b"+
		"\32\3\2\2\2\u008c\u008d\7<\2\2\u008d\u008e\7?\2\2\u008e\34\3\2\2\2\u008f"+
		"\u0090\7}\2\2\u0090\36\3\2\2\2\u0091\u0092\7\177\2\2\u0092 \3\2\2\2\u0093"+
		"\u0094\7]\2\2\u0094\"\3\2\2\2\u0095\u0096\7_\2\2\u0096$\3\2\2\2\u0097"+
		"\u0098\7.\2\2\u0098&\3\2\2\2\u0099\u009a\7<\2\2\u009a(\3\2\2\2\u009b\u009e"+
		"\5+\26\2\u009c\u009e\5-\27\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"*\3\2\2\2\u009f\u00a0\7V\2\2\u00a0\u00a1\7T\2\2\u00a1\u00a2\7W\2\2\u00a2"+
		"\u00a8\7G\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7w\2\2"+
		"\u00a6\u00a8\7g\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8,\3\2"+
		"\2\2\u00a9\u00aa\7H\2\2\u00aa\u00ab\7C\2\2\u00ab\u00ac\7N\2\2\u00ac\u00ad"+
		"\7U\2\2\u00ad\u00b4\7G\2\2\u00ae\u00af\7h\2\2\u00af\u00b0\7c\2\2\u00b0"+
		"\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2\u00b4\7g\2\2\u00b3\u00a9\3\2\2"+
		"\2\u00b3\u00ae\3\2\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6\60\3\2"+
		"\2\2\u00b7\u00b8\7/\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba\64\3"+
		"\2\2\2\u00bb\u00bc\7\61\2\2\u00bc\66\3\2\2\2\u00bd\u00be\7(\2\2\u00be"+
		"\u00bf\7(\2\2\u00bf8\3\2\2\2\u00c0\u00c1\7~\2\2\u00c1\u00c2\7~\2\2\u00c2"+
		":\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4\u00c5\7?\2\2\u00c5<\3\2\2\2\u00c6\u00c7"+
		"\7#\2\2\u00c7\u00c8\7?\2\2\u00c8>\3\2\2\2\u00c9\u00ca\7@\2\2\u00ca@\3"+
		"\2\2\2\u00cb\u00cc\7>\2\2\u00ccB\3\2\2\2\u00cd\u00ce\7@\2\2\u00ce\u00cf"+
		"\7?\2\2\u00cfD\3\2\2\2\u00d0\u00d1\7>\2\2\u00d1\u00d2\7?\2\2\u00d2F\3"+
		"\2\2\2\u00d3\u00d5\t\20\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00de\3\2\2\2\u00d8\u00da\7\60"+
		"\2\2\u00d9\u00db\t\20\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00d8\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e9\3\2\2\2\u00e0\u00e2\t\b\2\2\u00e1"+
		"\u00e3\t\21\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3"+
		"\2\2\2\u00e4\u00e6\t\20\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e0\3\2"+
		"\2\2\u00e9\u00ea\3\2\2\2\u00eaH\3\2\2\2\u00eb\u00ed\t\22\2\2\u00ec\u00eb"+
		"\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef"+
		"J\3\2\2\2\u00f0\u00f1\t\23\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b&\2\2"+
		"\u00f3L\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7,\2\2\u00f6\u00fa\3"+
		"\2\2\2\u00f7\u00f9\13\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fd\u00fe\7,\2\2\u00fe\u00ff\7\61\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0101\b\'\3\2\u0101N\3\2\2\2\u0102\u0103\7\61\2\2\u0103\u0104\7\61\2"+
		"\2\u0104\u0108\3\2\2\2\u0105\u0107\n\24\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\b(\3\2\u010cP\3\2\2\2\22\2Z\\e\u009d"+
		"\u00a7\u00b3\u00d6\u00dc\u00de\u00e2\u00e7\u00e9\u00ee\u00fa\u0108\4\2"+
		"\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}