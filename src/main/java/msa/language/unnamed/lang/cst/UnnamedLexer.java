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
		CONSTRAINTS=9, COMPUTE=10, DOT=11, DOTDOT=12, ASSIGN=13, LCURLY=14, RCURLY=15, 
		LBRACKET=16, RBRACKET=17, COMMA=18, COLON=19, BOOLEAN_LITERAL=20, TRUE=21, 
		FALSE=22, OPERATOR_ADD=23, OPERATOR_SUB=24, OPERATOR_MUL=25, OPERATOR_DIV=26, 
		OPERATOR_AND=27, OPERATOR_OR=28, OPERATOR_EQ=29, OPERATOR_NEQ=30, OPERATOR_GT=31, 
		OPERATOR_LT=32, OPERATOR_GTEQ=33, OPERATOR_LTEQ=34, OPERATOR_SCOPE=35, 
		OPERATOR_IN=36, NUM=37, ID=38, WS=39, COMMENT=40, LINE_COMMENT=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "STRING_LITERAL", "ESC", "IN", "OUT", "ENTITY", 
			"GIVEN", "CONSTRAINTS", "COMPUTE", "DOT", "DOTDOT", "ASSIGN", "LCURLY", 
			"RCURLY", "LBRACKET", "RBRACKET", "COMMA", "COLON", "BOOLEAN_LITERAL", 
			"TRUE", "FALSE", "OPERATOR_ADD", "OPERATOR_SUB", "OPERATOR_MUL", "OPERATOR_DIV", 
			"OPERATOR_AND", "OPERATOR_OR", "OPERATOR_EQ", "OPERATOR_NEQ", "OPERATOR_GT", 
			"OPERATOR_LT", "OPERATOR_GTEQ", "OPERATOR_LTEQ", "OPERATOR_SCOPE", "OPERATOR_IN", 
			"NUM", "ID", "WS", "COMMENT", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'?'", null, null, null, null, null, null, null, 
			"'.'", "'..'", "':='", "'{'", "'}'", "'['", "']'", "','", "':'", null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'::'", "'<<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "STRING_LITERAL", "IN", "OUT", "ENTITY", "GIVEN", 
			"CONSTRAINTS", "COMPUTE", "DOT", "DOTDOT", "ASSIGN", "LCURLY", "RCURLY", 
			"LBRACKET", "RBRACKET", "COMMA", "COLON", "BOOLEAN_LITERAL", "TRUE", 
			"FALSE", "OPERATOR_ADD", "OPERATOR_SUB", "OPERATOR_MUL", "OPERATOR_DIV", 
			"OPERATOR_AND", "OPERATOR_OR", "OPERATOR_EQ", "OPERATOR_NEQ", "OPERATOR_GT", 
			"OPERATOR_LT", "OPERATOR_GTEQ", "OPERATOR_LTEQ", "OPERATOR_SCOPE", "OPERATOR_IN", 
			"NUM", "ID", "WS", "COMMENT", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0121\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6l\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\26\3\26\5\26\u00ac\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00b6\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00c2\n\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3"+
		"$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\6\'\u00e9\n\'\r\'\16\'\u00ea\3\'\3\'\6\'"+
		"\u00ef\n\'\r\'\16\'\u00f0\5\'\u00f3\n\'\3\'\3\'\5\'\u00f7\n\'\3\'\6\'"+
		"\u00fa\n\'\r\'\16\'\u00fb\5\'\u00fe\n\'\3(\6(\u0101\n(\r(\16(\u0102\3"+
		")\3)\3)\3)\3*\3*\3*\3*\7*\u010d\n*\f*\16*\u0110\13*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\7+\u011b\n+\f+\16+\u011e\13+\3+\3+\3\u010e\2,\3\3\5\4\7\5\t"+
		"\6\13\2\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%"+
		"\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#"+
		"G$I%K&M\'O(Q)S*U+\3\2\27\6\2\f\f\17\17$$^^\4\2KKkk\4\2PPpp\4\2QQqq\4\2"+
		"WWww\4\2VVvv\4\2GGgg\4\2[[{{\4\2IIii\4\2XXxx\4\2EEee\4\2UUuu\4\2TTtt\4"+
		"\2CCcc\4\2OOoo\4\2RRrr\3\2\62;\4\2--//\6\2\62;C\\aac|\5\2\13\f\17\17\""+
		"\"\4\2\f\f\17\17\2\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13k\3"+
		"\2\2\2\rm\3\2\2\2\17p\3\2\2\2\21t\3\2\2\2\23{\3\2\2\2\25\u0081\3\2\2\2"+
		"\27\u008d\3\2\2\2\31\u0095\3\2\2\2\33\u0097\3\2\2\2\35\u009a\3\2\2\2\37"+
		"\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a3\3\2\2\2\'\u00a5\3"+
		"\2\2\2)\u00a7\3\2\2\2+\u00ab\3\2\2\2-\u00b5\3\2\2\2/\u00c1\3\2\2\2\61"+
		"\u00c3\3\2\2\2\63\u00c5\3\2\2\2\65\u00c7\3\2\2\2\67\u00c9\3\2\2\29\u00cb"+
		"\3\2\2\2;\u00ce\3\2\2\2=\u00d1\3\2\2\2?\u00d4\3\2\2\2A\u00d7\3\2\2\2C"+
		"\u00d9\3\2\2\2E\u00db\3\2\2\2G\u00de\3\2\2\2I\u00e1\3\2\2\2K\u00e4\3\2"+
		"\2\2M\u00e8\3\2\2\2O\u0100\3\2\2\2Q\u0104\3\2\2\2S\u0108\3\2\2\2U\u0116"+
		"\3\2\2\2WX\7*\2\2X\4\3\2\2\2YZ\7+\2\2Z\6\3\2\2\2[\\\7A\2\2\\\b\3\2\2\2"+
		"]b\7$\2\2^a\5\13\6\2_a\n\2\2\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2"+
		"bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7$\2\2f\n\3\2\2\2gh\7^\2\2hl\7$\2\2i"+
		"j\7^\2\2jl\7^\2\2kg\3\2\2\2ki\3\2\2\2l\f\3\2\2\2mn\t\3\2\2no\t\4\2\2o"+
		"\16\3\2\2\2pq\t\5\2\2qr\t\6\2\2rs\t\7\2\2s\20\3\2\2\2tu\t\b\2\2uv\t\4"+
		"\2\2vw\t\7\2\2wx\t\3\2\2xy\t\7\2\2yz\t\t\2\2z\22\3\2\2\2{|\t\n\2\2|}\t"+
		"\3\2\2}~\t\13\2\2~\177\t\b\2\2\177\u0080\t\4\2\2\u0080\24\3\2\2\2\u0081"+
		"\u0082\t\f\2\2\u0082\u0083\t\5\2\2\u0083\u0084\t\4\2\2\u0084\u0085\t\r"+
		"\2\2\u0085\u0086\t\7\2\2\u0086\u0087\t\16\2\2\u0087\u0088\t\17\2\2\u0088"+
		"\u0089\t\3\2\2\u0089\u008a\t\4\2\2\u008a\u008b\t\7\2\2\u008b\u008c\t\r"+
		"\2\2\u008c\26\3\2\2\2\u008d\u008e\t\f\2\2\u008e\u008f\t\5\2\2\u008f\u0090"+
		"\t\20\2\2\u0090\u0091\t\21\2\2\u0091\u0092\t\6\2\2\u0092\u0093\t\7\2\2"+
		"\u0093\u0094\t\b\2\2\u0094\30\3\2\2\2\u0095\u0096\7\60\2\2\u0096\32\3"+
		"\2\2\2\u0097\u0098\7\60\2\2\u0098\u0099\7\60\2\2\u0099\34\3\2\2\2\u009a"+
		"\u009b\7<\2\2\u009b\u009c\7?\2\2\u009c\36\3\2\2\2\u009d\u009e\7}\2\2\u009e"+
		" \3\2\2\2\u009f\u00a0\7\177\2\2\u00a0\"\3\2\2\2\u00a1\u00a2\7]\2\2\u00a2"+
		"$\3\2\2\2\u00a3\u00a4\7_\2\2\u00a4&\3\2\2\2\u00a5\u00a6\7.\2\2\u00a6("+
		"\3\2\2\2\u00a7\u00a8\7<\2\2\u00a8*\3\2\2\2\u00a9\u00ac\5-\27\2\u00aa\u00ac"+
		"\5/\30\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac,\3\2\2\2\u00ad"+
		"\u00ae\7V\2\2\u00ae\u00af\7T\2\2\u00af\u00b0\7W\2\2\u00b0\u00b6\7G\2\2"+
		"\u00b1\u00b2\7v\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7w\2\2\u00b4\u00b6"+
		"\7g\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6.\3\2\2\2\u00b7\u00b8"+
		"\7H\2\2\u00b8\u00b9\7C\2\2\u00b9\u00ba\7N\2\2\u00ba\u00bb\7U\2\2\u00bb"+
		"\u00c2\7G\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7n\2\2"+
		"\u00bf\u00c0\7u\2\2\u00c0\u00c2\7g\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00bc"+
		"\3\2\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\7-\2\2\u00c4\62\3\2\2\2\u00c5\u00c6"+
		"\7/\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7,\2\2\u00c8\66\3\2\2\2\u00c9\u00ca"+
		"\7\61\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7(\2\2\u00cc\u00cd\7(\2\2\u00cd:"+
		"\3\2\2\2\u00ce\u00cf\7~\2\2\u00cf\u00d0\7~\2\2\u00d0<\3\2\2\2\u00d1\u00d2"+
		"\7?\2\2\u00d2\u00d3\7?\2\2\u00d3>\3\2\2\2\u00d4\u00d5\7#\2\2\u00d5\u00d6"+
		"\7?\2\2\u00d6@\3\2\2\2\u00d7\u00d8\7@\2\2\u00d8B\3\2\2\2\u00d9\u00da\7"+
		">\2\2\u00daD\3\2\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd\7?\2\2\u00ddF\3\2"+
		"\2\2\u00de\u00df\7>\2\2\u00df\u00e0\7?\2\2\u00e0H\3\2\2\2\u00e1\u00e2"+
		"\7<\2\2\u00e2\u00e3\7<\2\2\u00e3J\3\2\2\2\u00e4\u00e5\7>\2\2\u00e5\u00e6"+
		"\7>\2\2\u00e6L\3\2\2\2\u00e7\u00e9\t\22\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00f2\3\2"+
		"\2\2\u00ec\u00ee\7\60\2\2\u00ed\u00ef\t\22\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2"+
		"\2\2\u00f2\u00ec\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00fd\3\2\2\2\u00f4"+
		"\u00f6\t\b\2\2\u00f5\u00f7\t\23\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3"+
		"\2\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00fa\t\22\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2"+
		"\2\2\u00fd\u00f4\3\2\2\2\u00fd\u00fe\3\2\2\2\u00feN\3\2\2\2\u00ff\u0101"+
		"\t\24\2\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2"+
		"\u0102\u0103\3\2\2\2\u0103P\3\2\2\2\u0104\u0105\t\25\2\2\u0105\u0106\3"+
		"\2\2\2\u0106\u0107\b)\2\2\u0107R\3\2\2\2\u0108\u0109\7\61\2\2\u0109\u010a"+
		"\7,\2\2\u010a\u010e\3\2\2\2\u010b\u010d\13\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010f\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u0111\3\2"+
		"\2\2\u0110\u010e\3\2\2\2\u0111\u0112\7,\2\2\u0112\u0113\7\61\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\b*\3\2\u0115T\3\2\2\2\u0116\u0117\7\61\2\2"+
		"\u0117\u0118\7\61\2\2\u0118\u011c\3\2\2\2\u0119\u011b\n\26\2\2\u011a\u0119"+
		"\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\b+\3\2\u0120V\3\2\2\2\22"+
		"\2`bk\u00ab\u00b5\u00c1\u00ea\u00f0\u00f2\u00f6\u00fb\u00fd\u0102\u010e"+
		"\u011c\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}