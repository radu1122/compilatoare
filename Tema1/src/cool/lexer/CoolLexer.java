// Generated from /Users/radu.dum/Documents/facultate/compilatoare/Tema1/src/cool/lexer/CoolLexer.g4 by ANTLR 4.10.1

    package cool.lexer;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ERROR=1, NEW=2, CLASS=3, INHERITS=4, LET=5, IN=6, NOT=7, AT=8, IF=9, FI=10, 
		THEN=11, ELSE=12, WHILE=13, LOOP=14, POOL=15, CASE=16, OF=17, ESAC=18, 
		RARROW=19, ISVOID=20, BOOL=21, TYPE=22, ID=23, INT=24, STRING=25, SEMI=26, 
		COLON=27, COMMA=28, EQUAL=29, LT=30, LE=31, NEG=32, ASSIGN=33, DOT=34, 
		LPAREN=35, RPAREN=36, LBRACE=37, RBRACE=38, PLUS=39, MINUS=40, MULT=41, 
		DIV=42, LINE_COMMENT=43, BLOCK_COMMENT=44, INCORRECT_COMMENT=45, WS=46, 
		INVALID=47;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NEW", "CLASS", "INHERITS", "LET", "IN", "NOT", "AT", "IF", "FI", "THEN", 
			"ELSE", "WHILE", "LOOP", "POOL", "CASE", "OF", "ESAC", "RARROW", "ISVOID", 
			"BOOL", "LOWERCASE", "UPPERCASE", "NAME", "TYPE", "ID", "DIGIT", "INT", 
			"NEW_LINE", "STRING", "SEMI", "COLON", "COMMA", "EQUAL", "LT", "LE", 
			"NEG", "ASSIGN", "DOT", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "PLUS", 
			"MINUS", "MULT", "DIV", "LINE_COMMENT", "BLOCK_COMMENT", "INCORRECT_COMMENT", 
			"WS", "INVALID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'@'", null, null, null, 
			null, null, null, null, null, null, null, "'=>'", null, null, null, null, 
			null, null, "';'", "':'", "','", "'='", "'<'", "'<='", "'~'", "'<-'", 
			"'.'", "'('", "')'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", null, 
			null, "'*)'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ERROR", "NEW", "CLASS", "INHERITS", "LET", "IN", "NOT", "AT", 
			"IF", "FI", "THEN", "ELSE", "WHILE", "LOOP", "POOL", "CASE", "OF", "ESAC", 
			"RARROW", "ISVOID", "BOOL", "TYPE", "ID", "INT", "STRING", "SEMI", "COLON", 
			"COMMA", "EQUAL", "LT", "LE", "NEG", "ASSIGN", "DOT", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "PLUS", "MINUS", "MULT", "DIV", "LINE_COMMENT", "BLOCK_COMMENT", 
			"INCORRECT_COMMENT", "WS", "INVALID"
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


	    private void raiseError(String msg) {
	        setText(msg);
	        setType(ERROR);
	    }


	public CoolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CoolLexer.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 28:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 47:
			BLOCK_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 48:
			INCORRECT_COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 50:
			INVALID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

					String str = getText();
					if (str.length() > 1024) {
						raiseError("String constant too long");
					} else if (str.contains("\0")) {
						raiseError("String contains null character");
					} else {
						setText(str
			                .substring(1, str.length() - 1)
			                .replace("\\\r\n", "\r\n")
			                .replace("\\\n", "\n")
			                .replace("\\n", "\n")
			                .replace("\\t", "\t")
			                .replaceAll("\\\\(?!\\\\)", ""));
					}
				
			break;
		case 1:
			 raiseError("EOF in string constant"); 
			break;
		case 2:
			 raiseError("Unterminated string constant"); 
			break;
		}
	}
	private void BLOCK_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			 skip(); 
			break;
		case 4:
			 raiseError("EOF in comment"); 
			break;
		}
	}
	private void INCORRECT_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			 raiseError("Unmatched *)"); 
			break;
		}
	}
	private void INVALID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			 raiseError("Invalid character: " + getText()); 
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000/\u014c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00c8\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u00d2\b\u0016\n\u0016\f\u0016\u00d5\t\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0004\u001a\u00e0\b\u001a\u000b\u001a\f\u001a\u00e1\u0001\u001b"+
		"\u0003\u001b\u00e5\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00ef\b\u001c"+
		"\n\u001c\f\u001c\u00f2\t\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u00fb\b\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		" \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		")\u0001)\u0001*\u0001*\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001.\u0005.\u0125\b.\n.\f.\u0128\t.\u0001.\u0001.\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0005/\u0131\b/\n/\f/\u0134\t/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0003/\u013c\b/\u00010\u00010\u00010\u0001"+
		"0\u00010\u00011\u00041\u0144\b1\u000b1\f1\u0145\u00011\u00011\u00012\u0001"+
		"2\u00012\u0002\u00f0\u0132\u00003\u0001\u0002\u0003\u0003\u0005\u0004"+
		"\u0007\u0005\t\u0006\u000b\u0007\r\b\u000f\t\u0011\n\u0013\u000b\u0015"+
		"\f\u0017\r\u0019\u000e\u001b\u000f\u001d\u0010\u001f\u0011!\u0012#\u0013"+
		"%\u0014\'\u0015)\u0000+\u0000-\u0000/\u00161\u00173\u00005\u00187\u0000"+
		"9\u0019;\u001a=\u001b?\u001cA\u001dC\u001eE\u001fG I!K\"M#O$Q%S&U\'W("+
		"Y)[*]+_,a-c.e/\u0001\u0000\u0016\u0002\u0000NNnn\u0002\u0000EEee\u0002"+
		"\u0000WWww\u0002\u0000CCcc\u0002\u0000LLll\u0002\u0000AAaa\u0002\u0000"+
		"SSss\u0002\u0000IIii\u0002\u0000HHhh\u0002\u0000RRrr\u0002\u0000TTtt\u0002"+
		"\u0000OOoo\u0002\u0000FFff\u0002\u0000PPpp\u0002\u0000VVvv\u0002\u0000"+
		"DDdd\u0002\u0000UUuu\u0001\u0000az\u0001\u0000AZ\u0001\u000009\u0002\u0000"+
		"\n\n\r\r\u0003\u0000\t\n\f\r  \u0157\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000\u0000;\u0001"+
		"\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?\u0001\u0000\u0000"+
		"\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000\u0000\u0000\u0000"+
		"E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000\u0000I\u0001"+
		"\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M\u0001\u0000\u0000"+
		"\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000\u0000\u0000\u0000"+
		"S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000\u0000W\u0001"+
		"\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000\u0000[\u0001\u0000\u0000"+
		"\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_\u0001\u0000\u0000\u0000\u0000"+
		"a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000\u0000\u0000\u0000e\u0001"+
		"\u0000\u0000\u0000\u0001g\u0001\u0000\u0000\u0000\u0003k\u0001\u0000\u0000"+
		"\u0000\u0005q\u0001\u0000\u0000\u0000\u0007z\u0001\u0000\u0000\u0000\t"+
		"~\u0001\u0000\u0000\u0000\u000b\u0081\u0001\u0000\u0000\u0000\r\u0085"+
		"\u0001\u0000\u0000\u0000\u000f\u0087\u0001\u0000\u0000\u0000\u0011\u008a"+
		"\u0001\u0000\u0000\u0000\u0013\u008d\u0001\u0000\u0000\u0000\u0015\u0092"+
		"\u0001\u0000\u0000\u0000\u0017\u0097\u0001\u0000\u0000\u0000\u0019\u009d"+
		"\u0001\u0000\u0000\u0000\u001b\u00a2\u0001\u0000\u0000\u0000\u001d\u00a7"+
		"\u0001\u0000\u0000\u0000\u001f\u00ac\u0001\u0000\u0000\u0000!\u00af\u0001"+
		"\u0000\u0000\u0000#\u00b4\u0001\u0000\u0000\u0000%\u00b7\u0001\u0000\u0000"+
		"\u0000\'\u00c7\u0001\u0000\u0000\u0000)\u00c9\u0001\u0000\u0000\u0000"+
		"+\u00cb\u0001\u0000\u0000\u0000-\u00d3\u0001\u0000\u0000\u0000/\u00d6"+
		"\u0001\u0000\u0000\u00001\u00d9\u0001\u0000\u0000\u00003\u00dc\u0001\u0000"+
		"\u0000\u00005\u00df\u0001\u0000\u0000\u00007\u00e4\u0001\u0000\u0000\u0000"+
		"9\u00e8\u0001\u0000\u0000\u0000;\u00fc\u0001\u0000\u0000\u0000=\u00fe"+
		"\u0001\u0000\u0000\u0000?\u0100\u0001\u0000\u0000\u0000A\u0102\u0001\u0000"+
		"\u0000\u0000C\u0104\u0001\u0000\u0000\u0000E\u0106\u0001\u0000\u0000\u0000"+
		"G\u0109\u0001\u0000\u0000\u0000I\u010b\u0001\u0000\u0000\u0000K\u010e"+
		"\u0001\u0000\u0000\u0000M\u0110\u0001\u0000\u0000\u0000O\u0112\u0001\u0000"+
		"\u0000\u0000Q\u0114\u0001\u0000\u0000\u0000S\u0116\u0001\u0000\u0000\u0000"+
		"U\u0118\u0001\u0000\u0000\u0000W\u011a\u0001\u0000\u0000\u0000Y\u011c"+
		"\u0001\u0000\u0000\u0000[\u011e\u0001\u0000\u0000\u0000]\u0120\u0001\u0000"+
		"\u0000\u0000_\u012b\u0001\u0000\u0000\u0000a\u013d\u0001\u0000\u0000\u0000"+
		"c\u0143\u0001\u0000\u0000\u0000e\u0149\u0001\u0000\u0000\u0000gh\u0007"+
		"\u0000\u0000\u0000hi\u0007\u0001\u0000\u0000ij\u0007\u0002\u0000\u0000"+
		"j\u0002\u0001\u0000\u0000\u0000kl\u0007\u0003\u0000\u0000lm\u0007\u0004"+
		"\u0000\u0000mn\u0007\u0005\u0000\u0000no\u0007\u0006\u0000\u0000op\u0007"+
		"\u0006\u0000\u0000p\u0004\u0001\u0000\u0000\u0000qr\u0007\u0007\u0000"+
		"\u0000rs\u0007\u0000\u0000\u0000st\u0007\b\u0000\u0000tu\u0007\u0001\u0000"+
		"\u0000uv\u0007\t\u0000\u0000vw\u0007\u0007\u0000\u0000wx\u0007\n\u0000"+
		"\u0000xy\u0007\u0006\u0000\u0000y\u0006\u0001\u0000\u0000\u0000z{\u0007"+
		"\u0004\u0000\u0000{|\u0007\u0001\u0000\u0000|}\u0007\n\u0000\u0000}\b"+
		"\u0001\u0000\u0000\u0000~\u007f\u0007\u0007\u0000\u0000\u007f\u0080\u0007"+
		"\u0000\u0000\u0000\u0080\n\u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0000"+
		"\u0000\u0000\u0082\u0083\u0007\u000b\u0000\u0000\u0083\u0084\u0007\n\u0000"+
		"\u0000\u0084\f\u0001\u0000\u0000\u0000\u0085\u0086\u0005@\u0000\u0000"+
		"\u0086\u000e\u0001\u0000\u0000\u0000\u0087\u0088\u0007\u0007\u0000\u0000"+
		"\u0088\u0089\u0007\f\u0000\u0000\u0089\u0010\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0007\f\u0000\u0000\u008b\u008c\u0007\u0007\u0000\u0000\u008c\u0012"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0007\n\u0000\u0000\u008e\u008f\u0007"+
		"\b\u0000\u0000\u008f\u0090\u0007\u0001\u0000\u0000\u0090\u0091\u0007\u0000"+
		"\u0000\u0000\u0091\u0014\u0001\u0000\u0000\u0000\u0092\u0093\u0007\u0001"+
		"\u0000\u0000\u0093\u0094\u0007\u0004\u0000\u0000\u0094\u0095\u0007\u0006"+
		"\u0000\u0000\u0095\u0096\u0007\u0001\u0000\u0000\u0096\u0016\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0007\u0002\u0000\u0000\u0098\u0099\u0007\b\u0000"+
		"\u0000\u0099\u009a\u0007\u0007\u0000\u0000\u009a\u009b\u0007\u0004\u0000"+
		"\u0000\u009b\u009c\u0007\u0001\u0000\u0000\u009c\u0018\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0007\u0004\u0000\u0000\u009e\u009f\u0007\u000b\u0000"+
		"\u0000\u009f\u00a0\u0007\u000b\u0000\u0000\u00a0\u00a1\u0007\r\u0000\u0000"+
		"\u00a1\u001a\u0001\u0000\u0000\u0000\u00a2\u00a3\u0007\r\u0000\u0000\u00a3"+
		"\u00a4\u0007\u000b\u0000\u0000\u00a4\u00a5\u0007\u000b\u0000\u0000\u00a5"+
		"\u00a6\u0007\u0004\u0000\u0000\u00a6\u001c\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0007\u0003\u0000\u0000\u00a8\u00a9\u0007\u0005\u0000\u0000\u00a9"+
		"\u00aa\u0007\u0006\u0000\u0000\u00aa\u00ab\u0007\u0001\u0000\u0000\u00ab"+
		"\u001e\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u000b\u0000\u0000\u00ad"+
		"\u00ae\u0007\f\u0000\u0000\u00ae \u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0007\u0001\u0000\u0000\u00b0\u00b1\u0007\u0006\u0000\u0000\u00b1\u00b2"+
		"\u0007\u0005\u0000\u0000\u00b2\u00b3\u0007\u0003\u0000\u0000\u00b3\"\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005=\u0000\u0000\u00b5\u00b6\u0005>\u0000"+
		"\u0000\u00b6$\u0001\u0000\u0000\u0000\u00b7\u00b8\u0007\u0007\u0000\u0000"+
		"\u00b8\u00b9\u0007\u0006\u0000\u0000\u00b9\u00ba\u0007\u000e\u0000\u0000"+
		"\u00ba\u00bb\u0007\u000b\u0000\u0000\u00bb\u00bc\u0007\u0007\u0000\u0000"+
		"\u00bc\u00bd\u0007\u000f\u0000\u0000\u00bd&\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0007\n\u0000\u0000\u00bf\u00c0\u0007\t\u0000\u0000\u00c0\u00c1"+
		"\u0007\u0010\u0000\u0000\u00c1\u00c8\u0007\u0001\u0000\u0000\u00c2\u00c3"+
		"\u0007\f\u0000\u0000\u00c3\u00c4\u0007\u0005\u0000\u0000\u00c4\u00c5\u0007"+
		"\u0004\u0000\u0000\u00c5\u00c6\u0007\u0006\u0000\u0000\u00c6\u00c8\u0007"+
		"\u0001\u0000\u0000\u00c7\u00be\u0001\u0000\u0000\u0000\u00c7\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c8(\u0001\u0000\u0000\u0000\u00c9\u00ca\u0007\u0011"+
		"\u0000\u0000\u00ca*\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007\u0012\u0000"+
		"\u0000\u00cc,\u0001\u0000\u0000\u0000\u00cd\u00d2\u0003)\u0014\u0000\u00ce"+
		"\u00d2\u0003+\u0015\u0000\u00cf\u00d2\u0005_\u0000\u0000\u00d0\u00d2\u0003"+
		"3\u0019\u0000\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d1\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4.\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0003+\u0015\u0000"+
		"\u00d7\u00d8\u0003-\u0016\u0000\u00d80\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0003)\u0014\u0000\u00da\u00db\u0003-\u0016\u0000\u00db2\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0007\u0013\u0000\u0000\u00dd4\u0001\u0000\u0000"+
		"\u0000\u00de\u00e0\u00033\u0019\u0000\u00df\u00de\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e26\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e5\u0005\r\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0005\n\u0000\u0000\u00e78\u0001\u0000\u0000\u0000\u00e8\u00f0\u0005"+
		"\"\u0000\u0000\u00e9\u00ea\u0005\\\u0000\u0000\u00ea\u00ef\u0005\"\u0000"+
		"\u0000\u00eb\u00ec\u0005\\\u0000\u0000\u00ec\u00ef\u00037\u001b\u0000"+
		"\u00ed\u00ef\t\u0000\u0000\u0000\u00ee\u00e9\u0001\u0000\u0000\u0000\u00ee"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f1\u00fa\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\"\u0000\u0000\u00f4\u00fb"+
		"\u0006\u001c\u0000\u0000\u00f5\u00f6\u0005\u0000\u0000\u0001\u00f6\u00fb"+
		"\u0006\u001c\u0001\u0000\u00f7\u00f8\u00037\u001b\u0000\u00f8\u00f9\u0006"+
		"\u001c\u0002\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00f3\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f5\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fb:\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005;\u0000"+
		"\u0000\u00fd<\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005:\u0000\u0000\u00ff"+
		">\u0001\u0000\u0000\u0000\u0100\u0101\u0005,\u0000\u0000\u0101@\u0001"+
		"\u0000\u0000\u0000\u0102\u0103\u0005=\u0000\u0000\u0103B\u0001\u0000\u0000"+
		"\u0000\u0104\u0105\u0005<\u0000\u0000\u0105D\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005<\u0000\u0000\u0107\u0108\u0005=\u0000\u0000\u0108F\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0005~\u0000\u0000\u010aH\u0001\u0000\u0000"+
		"\u0000\u010b\u010c\u0005<\u0000\u0000\u010c\u010d\u0005-\u0000\u0000\u010d"+
		"J\u0001\u0000\u0000\u0000\u010e\u010f\u0005.\u0000\u0000\u010fL\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005(\u0000\u0000\u0111N\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005)\u0000\u0000\u0113P\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005{\u0000\u0000\u0115R\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		"}\u0000\u0000\u0117T\u0001\u0000\u0000\u0000\u0118\u0119\u0005+\u0000"+
		"\u0000\u0119V\u0001\u0000\u0000\u0000\u011a\u011b\u0005-\u0000\u0000\u011b"+
		"X\u0001\u0000\u0000\u0000\u011c\u011d\u0005*\u0000\u0000\u011dZ\u0001"+
		"\u0000\u0000\u0000\u011e\u011f\u0005/\u0000\u0000\u011f\\\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u0005-\u0000\u0000\u0121\u0122\u0005-\u0000\u0000"+
		"\u0122\u0126\u0001\u0000\u0000\u0000\u0123\u0125\b\u0014\u0000\u0000\u0124"+
		"\u0123\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000\u0000\u0000\u0126"+
		"\u0124\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0129\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0006.\u0003\u0000\u012a^\u0001\u0000\u0000\u0000\u012b\u012c\u0005"+
		"(\u0000\u0000\u012c\u012d\u0005*\u0000\u0000\u012d\u0132\u0001\u0000\u0000"+
		"\u0000\u012e\u0131\u0003_/\u0000\u012f\u0131\t\u0000\u0000\u0000\u0130"+
		"\u012e\u0001\u0000\u0000\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131"+
		"\u0134\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0133\u013b\u0001\u0000\u0000\u0000\u0134"+
		"\u0132\u0001\u0000\u0000\u0000\u0135\u0136\u0005*\u0000\u0000\u0136\u0137"+
		"\u0005)\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013c\u0006"+
		"/\u0004\u0000\u0139\u013a\u0005\u0000\u0000\u0001\u013a\u013c\u0006/\u0005"+
		"\u0000\u013b\u0135\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000"+
		"\u0000\u013c`\u0001\u0000\u0000\u0000\u013d\u013e\u0005*\u0000\u0000\u013e"+
		"\u013f\u0005)\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u00060\u0006\u0000\u0141b\u0001\u0000\u0000\u0000\u0142\u0144\u0007\u0015"+
		"\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000"+
		"\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000"+
		"\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u00061\u0003"+
		"\u0000\u0148d\u0001\u0000\u0000\u0000\u0149\u014a\t\u0000\u0000\u0000"+
		"\u014a\u014b\u00062\u0007\u0000\u014bf\u0001\u0000\u0000\u0000\u000e\u0000"+
		"\u00c7\u00d1\u00d3\u00e1\u00e4\u00ee\u00f0\u00fa\u0126\u0130\u0132\u013b"+
		"\u0145\b\u0001\u001c\u0000\u0001\u001c\u0001\u0001\u001c\u0002\u0006\u0000"+
		"\u0000\u0001/\u0003\u0001/\u0004\u00010\u0005\u00012\u0006";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}