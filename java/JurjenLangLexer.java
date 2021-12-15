// Generated from JurjenLang.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JurjenLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBERS=1, FUNC_KW=2, FUNC_RET=3, PRINTSCOPE_KW=4, PRINT_KW=5, ASSERT_KW=6, 
		IF_KW=7, ELIF_KW=8, ELSE_KW=9, WHILE_KW=10, TRUE_KW=11, FALSE_KW=12, AND_KW=13, 
		OR_KW=14, NOT_KW=15, EQUALS=16, ISNOT=17, LESSEQUALS=18, MOREEQUALS=19, 
		LESSTHAN=20, MORETHAN=21, SYMB_EXCLM=22, SYMB_HAT=23, SYMB_STAR=24, SYMB_SLASH=25, 
		SYMB_PLUS=26, SYMB_MINUS=27, SYMB_QUOTE=28, SYMB_DQUOTE=29, SYMB_DOT=30, 
		SYMB_COMMA=31, FLOAT_IDENT=32, ASSIGN=33, PAR_OPEN=34, PAR_CLOSE=35, BRACK_OPEN=36, 
		BRACK_CLOSE=37, IDENTIFIER=38, STR_CONTENT=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NUMBERS", "FUNC_KW", "FUNC_RET", "PRINTSCOPE_KW", "PRINT_KW", "ASSERT_KW", 
			"IF_KW", "ELIF_KW", "ELSE_KW", "WHILE_KW", "TRUE_KW", "FALSE_KW", "AND_KW", 
			"OR_KW", "NOT_KW", "EQUALS", "ISNOT", "LESSEQUALS", "MOREEQUALS", "LESSTHAN", 
			"MORETHAN", "SYMB_EXCLM", "SYMB_HAT", "SYMB_STAR", "SYMB_SLASH", "SYMB_PLUS", 
			"SYMB_MINUS", "SYMB_QUOTE", "SYMB_DQUOTE", "SYMB_DOT", "SYMB_COMMA", 
			"FLOAT_IDENT", "ASSIGN", "PAR_OPEN", "PAR_CLOSE", "BRACK_OPEN", "BRACK_CLOSE", 
			"IDENTIFIER", "STR_CONTENT", "WS", "HEX_DIGIT", "ESC_SEQ", "UNICODE_ESC", 
			"DIGIT", "BIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'func'", "'return'", "'printscope'", "'print'", "'assert'", 
			"'if'", "'elif'", "'else'", "'while'", "'true'", "'false'", "'and'", 
			"'or'", "'not'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", 
			"'^'", "'*'", "'/'", "'+'", "'-'", "'''", "'\"'", "'.'", "','", "'f'", 
			"'='", "'('", "')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBERS", "FUNC_KW", "FUNC_RET", "PRINTSCOPE_KW", "PRINT_KW", 
			"ASSERT_KW", "IF_KW", "ELIF_KW", "ELSE_KW", "WHILE_KW", "TRUE_KW", "FALSE_KW", 
			"AND_KW", "OR_KW", "NOT_KW", "EQUALS", "ISNOT", "LESSEQUALS", "MOREEQUALS", 
			"LESSTHAN", "MORETHAN", "SYMB_EXCLM", "SYMB_HAT", "SYMB_STAR", "SYMB_SLASH", 
			"SYMB_PLUS", "SYMB_MINUS", "SYMB_QUOTE", "SYMB_DQUOTE", "SYMB_DOT", "SYMB_COMMA", 
			"FLOAT_IDENT", "ASSIGN", "PAR_OPEN", "PAR_CLOSE", "BRACK_OPEN", "BRACK_CLOSE", 
			"IDENTIFIER", "STR_CONTENT", "WS"
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


	public JurjenLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JurjenLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0109\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\6\2_\n\2\r\2\16\2`\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\7\'\u00e2\n\'\f\'\16\'\u00e5\13\'\3(\3(\3"+
		"(\7(\u00ea\n(\f(\16(\u00ed\13(\3(\3(\3)\6)\u00f2\n)\r)\16)\u00f3\3)\3"+
		")\3*\3*\3+\3+\3+\5+\u00fd\n+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\2\2/\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S\2U\2W\2Y\2[\2\3\2\b\4\2C\\c|\6\2\62;C\\aac|\4\2"+
		"$$^^\5\2\13\f\17\17\"\"\5\2\62;CHch\n\2$$))^^ddhhppttvv\2\u0109\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3^\3\2\2\2\5b\3\2"+
		"\2\2\7g\3\2\2\2\tn\3\2\2\2\13y\3\2\2\2\r\177\3\2\2\2\17\u0086\3\2\2\2"+
		"\21\u0089\3\2\2\2\23\u008e\3\2\2\2\25\u0093\3\2\2\2\27\u0099\3\2\2\2\31"+
		"\u009e\3\2\2\2\33\u00a4\3\2\2\2\35\u00a8\3\2\2\2\37\u00ab\3\2\2\2!\u00af"+
		"\3\2\2\2#\u00b2\3\2\2\2%\u00b5\3\2\2\2\'\u00b8\3\2\2\2)\u00bb\3\2\2\2"+
		"+\u00bd\3\2\2\2-\u00bf\3\2\2\2/\u00c1\3\2\2\2\61\u00c3\3\2\2\2\63\u00c5"+
		"\3\2\2\2\65\u00c7\3\2\2\2\67\u00c9\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2"+
		"\2=\u00cf\3\2\2\2?\u00d1\3\2\2\2A\u00d3\3\2\2\2C\u00d5\3\2\2\2E\u00d7"+
		"\3\2\2\2G\u00d9\3\2\2\2I\u00db\3\2\2\2K\u00dd\3\2\2\2M\u00df\3\2\2\2O"+
		"\u00e6\3\2\2\2Q\u00f1\3\2\2\2S\u00f7\3\2\2\2U\u00fc\3\2\2\2W\u00fe\3\2"+
		"\2\2Y\u0105\3\2\2\2[\u0107\3\2\2\2]_\5Y-\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2"+
		"\2`a\3\2\2\2a\4\3\2\2\2bc\7h\2\2cd\7w\2\2de\7p\2\2ef\7e\2\2f\6\3\2\2\2"+
		"gh\7t\2\2hi\7g\2\2ij\7v\2\2jk\7w\2\2kl\7t\2\2lm\7p\2\2m\b\3\2\2\2no\7"+
		"r\2\2op\7t\2\2pq\7k\2\2qr\7p\2\2rs\7v\2\2st\7u\2\2tu\7e\2\2uv\7q\2\2v"+
		"w\7r\2\2wx\7g\2\2x\n\3\2\2\2yz\7r\2\2z{\7t\2\2{|\7k\2\2|}\7p\2\2}~\7v"+
		"\2\2~\f\3\2\2\2\177\u0080\7c\2\2\u0080\u0081\7u\2\2\u0081\u0082\7u\2\2"+
		"\u0082\u0083\7g\2\2\u0083\u0084\7t\2\2\u0084\u0085\7v\2\2\u0085\16\3\2"+
		"\2\2\u0086\u0087\7k\2\2\u0087\u0088\7h\2\2\u0088\20\3\2\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7n\2\2\u008b\u008c\7k\2\2\u008c\u008d\7h\2\2\u008d"+
		"\22\3\2\2\2\u008e\u008f\7g\2\2\u008f\u0090\7n\2\2\u0090\u0091\7u\2\2\u0091"+
		"\u0092\7g\2\2\u0092\24\3\2\2\2\u0093\u0094\7y\2\2\u0094\u0095\7j\2\2\u0095"+
		"\u0096\7k\2\2\u0096\u0097\7n\2\2\u0097\u0098\7g\2\2\u0098\26\3\2\2\2\u0099"+
		"\u009a\7v\2\2\u009a\u009b\7t\2\2\u009b\u009c\7w\2\2\u009c\u009d\7g\2\2"+
		"\u009d\30\3\2\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7"+
		"n\2\2\u00a1\u00a2\7u\2\2\u00a2\u00a3\7g\2\2\u00a3\32\3\2\2\2\u00a4\u00a5"+
		"\7c\2\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7f\2\2\u00a7\34\3\2\2\2\u00a8\u00a9"+
		"\7q\2\2\u00a9\u00aa\7t\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00ae\7v\2\2\u00ae \3\2\2\2\u00af\u00b0\7?\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1\"\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\7?\2\2\u00b4$\3"+
		"\2\2\2\u00b5\u00b6\7>\2\2\u00b6\u00b7\7?\2\2\u00b7&\3\2\2\2\u00b8\u00b9"+
		"\7@\2\2\u00b9\u00ba\7?\2\2\u00ba(\3\2\2\2\u00bb\u00bc\7>\2\2\u00bc*\3"+
		"\2\2\2\u00bd\u00be\7@\2\2\u00be,\3\2\2\2\u00bf\u00c0\7#\2\2\u00c0.\3\2"+
		"\2\2\u00c1\u00c2\7`\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\62\3"+
		"\2\2\2\u00c5\u00c6\7\61\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8"+
		"\66\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc"+
		":\3\2\2\2\u00cd\u00ce\7$\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7\60\2\2\u00d0"+
		">\3\2\2\2\u00d1\u00d2\7.\2\2\u00d2@\3\2\2\2\u00d3\u00d4\7h\2\2\u00d4B"+
		"\3\2\2\2\u00d5\u00d6\7?\2\2\u00d6D\3\2\2\2\u00d7\u00d8\7*\2\2\u00d8F\3"+
		"\2\2\2\u00d9\u00da\7+\2\2\u00daH\3\2\2\2\u00db\u00dc\7}\2\2\u00dcJ\3\2"+
		"\2\2\u00dd\u00de\7\177\2\2\u00deL\3\2\2\2\u00df\u00e3\t\2\2\2\u00e0\u00e2"+
		"\t\3\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4N\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00eb\7$\2\2\u00e7"+
		"\u00ea\5U+\2\u00e8\u00ea\n\4\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3\2\2"+
		"\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\7$\2\2\u00efP\3\2\2\2\u00f0\u00f2"+
		"\t\5\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b)\2\2\u00f6R\3\2\2\2\u00f7"+
		"\u00f8\t\6\2\2\u00f8T\3\2\2\2\u00f9\u00fa\7^\2\2\u00fa\u00fd\t\7\2\2\u00fb"+
		"\u00fd\5W,\2\u00fc\u00f9\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fdV\3\2\2\2\u00fe"+
		"\u00ff\7^\2\2\u00ff\u0100\7w\2\2\u0100\u0101\5S*\2\u0101\u0102\5S*\2\u0102"+
		"\u0103\5S*\2\u0103\u0104\5S*\2\u0104X\3\2\2\2\u0105\u0106\4\62;\2\u0106"+
		"Z\3\2\2\2\u0107\u0108\4\62\63\2\u0108\\\3\2\2\2\t\2`\u00e3\u00e9\u00eb"+
		"\u00f3\u00fc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}