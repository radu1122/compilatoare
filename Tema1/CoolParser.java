// Generated from /Users/radu.dum/Documents/facultate/compilatoare/Tema1/src/cool/parser/CoolParser.g4 by ANTLR 4.10.1

    package cool.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CoolParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_classELem = 1, RULE_feature = 2, RULE_formal = 3, 
		RULE_letDefinition = 4, RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classELem", "feature", "formal", "letDefinition", "expr"
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

	@Override
	public String getGrammarFileName() { return "CoolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CoolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ClassELemContext classELem;
		public List<ClassELemContext> modules = new ArrayList<ClassELemContext>();
		public TerminalNode EOF() { return getToken(CoolParser.EOF, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<ClassELemContext> classELem() {
			return getRuleContexts(ClassELemContext.class);
		}
		public ClassELemContext classELem(int i) {
			return getRuleContext(ClassELemContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(12);
				((ProgramContext)_localctx).classELem = classELem();
				((ProgramContext)_localctx).modules.add(((ProgramContext)_localctx).classELem);
				}
				setState(13);
				match(SEMI);
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
			setState(19);
			match(EOF);
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

	public static class ClassELemContext extends ParserRuleContext {
		public Token type;
		public Token inheritance;
		public FeatureContext feature;
		public List<FeatureContext> features = new ArrayList<FeatureContext>();
		public TerminalNode CLASS() { return getToken(CoolParser.CLASS, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<TerminalNode> TYPE() { return getTokens(CoolParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(CoolParser.TYPE, i);
		}
		public TerminalNode INHERITS() { return getToken(CoolParser.INHERITS, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<FeatureContext> feature() {
			return getRuleContexts(FeatureContext.class);
		}
		public FeatureContext feature(int i) {
			return getRuleContext(FeatureContext.class,i);
		}
		public ClassELemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classELem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClassELem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClassELem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClassELem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassELemContext classELem() throws RecognitionException {
		ClassELemContext _localctx = new ClassELemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classELem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(CLASS);
			setState(22);
			((ClassELemContext)_localctx).type = match(TYPE);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(23);
				match(INHERITS);
				setState(24);
				((ClassELemContext)_localctx).inheritance = match(TYPE);
				}
			}

			setState(27);
			match(LBRACE);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(28);
				((ClassELemContext)_localctx).feature = feature();
				((ClassELemContext)_localctx).features.add(((ClassELemContext)_localctx).feature);
				setState(29);
				match(SEMI);
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			match(RBRACE);
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

	public static class FeatureContext extends ParserRuleContext {
		public FeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_feature; }
	 
		public FeatureContext() { }
		public void copyFrom(FeatureContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDefContext extends FeatureContext {
		public Token id;
		public Token type;
		public ExprContext init;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDefContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDefContext extends FeatureContext {
		public Token fname;
		public FormalContext formal;
		public List<FormalContext> args = new ArrayList<FormalContext>();
		public Token type;
		public ExprContext body;
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public FuncDefContext(FeatureContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureContext feature() throws RecognitionException {
		FeatureContext _localctx = new FeatureContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_feature);
		int _la;
		try {
			int _alt;
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				((FuncDefContext)_localctx).fname = match(ID);
				setState(39);
				match(LPAREN);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(45);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(40);
							((FuncDefContext)_localctx).formal = formal();
							((FuncDefContext)_localctx).args.add(((FuncDefContext)_localctx).formal);
							setState(41);
							match(COMMA);
							}
							} 
						}
						setState(47);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					setState(48);
					((FuncDefContext)_localctx).formal = formal();
					((FuncDefContext)_localctx).args.add(((FuncDefContext)_localctx).formal);
					}
				}

				setState(51);
				match(RPAREN);
				setState(52);
				match(COLON);
				setState(53);
				((FuncDefContext)_localctx).type = match(TYPE);
				setState(54);
				match(LBRACE);
				setState(55);
				((FuncDefContext)_localctx).body = expr(0);
				setState(56);
				match(RBRACE);
				}
				break;
			case 2:
				_localctx = new VarDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				((VarDefContext)_localctx).id = match(ID);
				setState(59);
				match(COLON);
				setState(60);
				((VarDefContext)_localctx).type = match(TYPE);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(61);
					match(ASSIGN);
					setState(62);
					((VarDefContext)_localctx).init = expr(0);
					}
				}

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

	public static class FormalContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((FormalContext)_localctx).name = match(ID);
			setState(68);
			match(COLON);
			setState(69);
			((FormalContext)_localctx).type = match(TYPE);
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

	public static class LetDefinitionContext extends ParserRuleContext {
		public Token name;
		public Token type;
		public ExprContext initializator;
		public TerminalNode COLON() { return getToken(CoolParser.COLON, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LetDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLetDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLetDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLetDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetDefinitionContext letDefinition() throws RecognitionException {
		LetDefinitionContext _localctx = new LetDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_letDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			((LetDefinitionContext)_localctx).name = match(ID);
			setState(72);
			match(COLON);
			setState(73);
			((LetDefinitionContext)_localctx).type = match(TYPE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(74);
				match(ASSIGN);
				setState(75);
				((LetDefinitionContext)_localctx).initializator = expr(0);
				}
			}

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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends ExprContext {
		public ExprContext lop;
		public ExprContext rop;
		public TerminalNode PLUS() { return getToken(CoolParser.PLUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubContext extends ExprContext {
		public ExprContext lop;
		public ExprContext rop;
		public TerminalNode MINUS() { return getToken(CoolParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationContext extends ExprContext {
		public ExprContext op;
		public TerminalNode NEG() { return getToken(CoolParser.NEG, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DispatchContext extends ExprContext {
		public Token fname;
		public ExprContext expr;
		public List<ExprContext> fargs = new ArrayList<ExprContext>();
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public DispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Isvoid_clauseContext extends ExprContext {
		public ExprContext op;
		public TerminalNode ISVOID() { return getToken(CoolParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Isvoid_clauseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIsvoid_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIsvoid_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIsvoid_clause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExprContext {
		public ExprContext lop;
		public ExprContext rop;
		public TerminalNode MULT() { return getToken(CoolParser.MULT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends ExprContext {
		public Token recipient;
		public ExprContext val;
		public TerminalNode ASSIGN() { return getToken(CoolParser.ASSIGN, 0); }
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessthanContext extends ExprContext {
		public ExprContext lop;
		public ExprContext rop;
		public TerminalNode LT() { return getToken(CoolParser.LT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessthanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLessthan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLessthan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLessthan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClassDispatchContext extends ExprContext {
		public ExprContext target;
		public Token supertype;
		public Token method;
		public ExprContext expr;
		public List<ExprContext> args = new ArrayList<ExprContext>();
		public TerminalNode DOT() { return getToken(CoolParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public TerminalNode AT() { return getToken(CoolParser.AT, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public ClassDispatchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterClassDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitClassDispatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitClassDispatch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Case_clauseContext extends ExprContext {
		public ExprContext target;
		public FormalContext formal;
		public List<FormalContext> types = new ArrayList<FormalContext>();
		public ExprContext expr;
		public List<ExprContext> branches = new ArrayList<ExprContext>();
		public TerminalNode CASE() { return getToken(CoolParser.CASE, 0); }
		public TerminalNode OF() { return getToken(CoolParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(CoolParser.ESAC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> RARROW() { return getTokens(CoolParser.RARROW); }
		public TerminalNode RARROW(int i) {
			return getToken(CoolParser.RARROW, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
		}
		public Case_clauseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterCase_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitCase_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitCase_clause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParanthesisContext extends ExprContext {
		public ExprContext body;
		public TerminalNode LPAREN() { return getToken(CoolParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CoolParser.RPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParanthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterParanthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitParanthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitParanthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolvalContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(CoolParser.BOOL, 0); }
		public BoolvalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterBoolval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitBoolval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitBoolval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class While_clauseContext extends ExprContext {
		public ExprContext cond;
		public ExprContext body;
		public TerminalNode WHILE() { return getToken(CoolParser.WHILE, 0); }
		public TerminalNode LOOP() { return getToken(CoolParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(CoolParser.POOL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public While_clauseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterWhile_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitWhile_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitWhile_clause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(CoolParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Let_clauseContext extends ExprContext {
		public LetDefinitionContext letDefinition;
		public List<LetDefinitionContext> definitions = new ArrayList<LetDefinitionContext>();
		public ExprContext body;
		public TerminalNode LET() { return getToken(CoolParser.LET, 0); }
		public TerminalNode IN() { return getToken(CoolParser.IN, 0); }
		public List<LetDefinitionContext> letDefinition() {
			return getRuleContexts(LetDefinitionContext.class);
		}
		public LetDefinitionContext letDefinition(int i) {
			return getRuleContext(LetDefinitionContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(CoolParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CoolParser.COMMA, i);
		}
		public Let_clauseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLet_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLet_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLet_clause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CoolParser.STRING, 0); }
		public StrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitStr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivContext extends ExprContext {
		public ExprContext lop;
		public ExprContext rop;
		public TerminalNode DIV() { return getToken(CoolParser.DIV, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Logical_negationContext extends ExprContext {
		public ExprContext op;
		public TerminalNode NOT() { return getToken(CoolParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Logical_negationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLogical_negation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLogical_negation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLogical_negation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Nested_exprContext extends ExprContext {
		public ExprContext expr;
		public List<ExprContext> expressions = new ArrayList<ExprContext>();
		public TerminalNode LBRACE() { return getToken(CoolParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CoolParser.RBRACE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CoolParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CoolParser.SEMI, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Nested_exprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterNested_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitNested_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitNested_expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesseqContext extends ExprContext {
		public ExprContext lop;
		public ExprContext rop;
		public TerminalNode LE() { return getToken(CoolParser.LE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LesseqContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterLesseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitLesseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitLesseq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualsContext extends ExprContext {
		public ExprContext lop;
		public ExprContext rop;
		public TerminalNode EQUAL() { return getToken(CoolParser.EQUAL, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterEquals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitEquals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitEquals(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_clauseContext extends ExprContext {
		public ExprContext cond;
		public ExprContext thenBranch;
		public ExprContext elseBranch;
		public TerminalNode IF() { return getToken(CoolParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CoolParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(CoolParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(CoolParser.FI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public If_clauseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterIf_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitIf_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitIf_clause(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(CoolParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InstantiationContext extends ExprContext {
		public Token type;
		public TerminalNode NEW() { return getToken(CoolParser.NEW, 0); }
		public TerminalNode TYPE() { return getToken(CoolParser.TYPE, 0); }
		public InstantiationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).enterInstantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CoolParserListener ) ((CoolParserListener)listener).exitInstantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CoolParserVisitor ) return ((CoolParserVisitor<? extends T>)visitor).visitInstantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new DispatchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(79);
				((DispatchContext)_localctx).fname = match(ID);
				setState(80);
				match(LPAREN);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << LET) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << CASE) | (1L << ISVOID) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << NEG) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
					{
					setState(86);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(81);
							((DispatchContext)_localctx).expr = expr(0);
							((DispatchContext)_localctx).fargs.add(((DispatchContext)_localctx).expr);
							setState(82);
							match(COMMA);
							}
							} 
						}
						setState(88);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					}
					setState(89);
					((DispatchContext)_localctx).expr = expr(0);
					((DispatchContext)_localctx).fargs.add(((DispatchContext)_localctx).expr);
					}
				}

				setState(92);
				match(RPAREN);
				}
				break;
			case 2:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(NEG);
				setState(94);
				((NegationContext)_localctx).op = expr(22);
				}
				break;
			case 3:
				{
				_localctx = new If_clauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(IF);
				setState(96);
				((If_clauseContext)_localctx).cond = expr(0);
				setState(97);
				match(THEN);
				setState(98);
				((If_clauseContext)_localctx).thenBranch = expr(0);
				setState(99);
				match(ELSE);
				setState(100);
				((If_clauseContext)_localctx).elseBranch = expr(0);
				setState(101);
				match(FI);
				}
				break;
			case 4:
				{
				_localctx = new While_clauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103);
				match(WHILE);
				setState(104);
				((While_clauseContext)_localctx).cond = expr(0);
				setState(105);
				match(LOOP);
				setState(106);
				((While_clauseContext)_localctx).body = expr(0);
				setState(107);
				match(POOL);
				}
				break;
			case 5:
				{
				_localctx = new Nested_exprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(LBRACE);
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(110);
					((Nested_exprContext)_localctx).expr = expr(0);
					((Nested_exprContext)_localctx).expressions.add(((Nested_exprContext)_localctx).expr);
					setState(111);
					match(SEMI);
					}
					}
					setState(115); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << LET) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << CASE) | (1L << ISVOID) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << NEG) | (1L << LPAREN) | (1L << LBRACE))) != 0) );
				setState(117);
				match(RBRACE);
				}
				break;
			case 6:
				{
				_localctx = new Let_clauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(LET);
				setState(120);
				((Let_clauseContext)_localctx).letDefinition = letDefinition();
				((Let_clauseContext)_localctx).definitions.add(((Let_clauseContext)_localctx).letDefinition);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(121);
					match(COMMA);
					setState(122);
					((Let_clauseContext)_localctx).letDefinition = letDefinition();
					((Let_clauseContext)_localctx).definitions.add(((Let_clauseContext)_localctx).letDefinition);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				match(IN);
				setState(129);
				((Let_clauseContext)_localctx).body = expr(11);
				}
				break;
			case 7:
				{
				_localctx = new Case_clauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(CASE);
				setState(132);
				((Case_clauseContext)_localctx).target = expr(0);
				setState(133);
				match(OF);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(134);
					((Case_clauseContext)_localctx).formal = formal();
					((Case_clauseContext)_localctx).types.add(((Case_clauseContext)_localctx).formal);
					setState(135);
					match(RARROW);
					setState(136);
					((Case_clauseContext)_localctx).expr = expr(0);
					((Case_clauseContext)_localctx).branches.add(((Case_clauseContext)_localctx).expr);
					setState(137);
					match(SEMI);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(143);
				match(ESAC);
				}
				break;
			case 8:
				{
				_localctx = new InstantiationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(NEW);
				setState(146);
				((InstantiationContext)_localctx).type = match(TYPE);
				}
				break;
			case 9:
				{
				_localctx = new Isvoid_clauseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(ISVOID);
				setState(148);
				((Isvoid_clauseContext)_localctx).op = expr(8);
				}
				break;
			case 10:
				{
				_localctx = new Logical_negationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(NOT);
				setState(150);
				((Logical_negationContext)_localctx).op = expr(7);
				}
				break;
			case 11:
				{
				_localctx = new ParanthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(LPAREN);
				setState(152);
				((ParanthesisContext)_localctx).body = expr(0);
				setState(153);
				match(RPAREN);
				}
				break;
			case 12:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(INT);
				}
				break;
			case 14:
				{
				_localctx = new StrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(STRING);
				}
				break;
			case 15:
				{
				_localctx = new BoolvalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(BOOL);
				}
				break;
			case 16:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				((AssignmentContext)_localctx).recipient = match(ID);
				setState(160);
				match(ASSIGN);
				setState(161);
				((AssignmentContext)_localctx).val = expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExprContext(_parentctx, _parentState));
						((MulContext)_localctx).lop = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(165);
						match(MULT);
						setState(166);
						((MulContext)_localctx).rop = expr(22);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExprContext(_parentctx, _parentState));
						((DivContext)_localctx).lop = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(168);
						match(DIV);
						setState(169);
						((DivContext)_localctx).rop = expr(21);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExprContext(_parentctx, _parentState));
						((AddContext)_localctx).lop = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(171);
						match(PLUS);
						setState(172);
						((AddContext)_localctx).rop = expr(20);
						}
						break;
					case 4:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						((SubContext)_localctx).lop = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(174);
						match(MINUS);
						setState(175);
						((SubContext)_localctx).rop = expr(19);
						}
						break;
					case 5:
						{
						_localctx = new LesseqContext(new ExprContext(_parentctx, _parentState));
						((LesseqContext)_localctx).lop = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(177);
						match(LE);
						setState(178);
						((LesseqContext)_localctx).rop = expr(18);
						}
						break;
					case 6:
						{
						_localctx = new LessthanContext(new ExprContext(_parentctx, _parentState));
						((LessthanContext)_localctx).lop = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(180);
						match(LT);
						setState(181);
						((LessthanContext)_localctx).rop = expr(17);
						}
						break;
					case 7:
						{
						_localctx = new EqualsContext(new ExprContext(_parentctx, _parentState));
						((EqualsContext)_localctx).lop = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(183);
						match(EQUAL);
						setState(184);
						((EqualsContext)_localctx).rop = expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ClassDispatchContext(new ExprContext(_parentctx, _parentState));
						((ClassDispatchContext)_localctx).target = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(188);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==AT) {
							{
							setState(186);
							match(AT);
							setState(187);
							((ClassDispatchContext)_localctx).supertype = match(TYPE);
							}
						}

						setState(190);
						match(DOT);
						setState(191);
						((ClassDispatchContext)_localctx).method = match(ID);
						setState(192);
						match(LPAREN);
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << LET) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << CASE) | (1L << ISVOID) | (1L << BOOL) | (1L << ID) | (1L << INT) | (1L << STRING) | (1L << NEG) | (1L << LPAREN) | (1L << LBRACE))) != 0)) {
							{
							setState(198);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
							while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1 ) {
									{
									{
									setState(193);
									((ClassDispatchContext)_localctx).expr = expr(0);
									((ClassDispatchContext)_localctx).args.add(((ClassDispatchContext)_localctx).expr);
									setState(194);
									match(COMMA);
									}
									} 
								}
								setState(200);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
							}
							setState(201);
							((ClassDispatchContext)_localctx).expr = expr(0);
							((ClassDispatchContext)_localctx).args.add(((ClassDispatchContext)_localctx).expr);
							}
						}

						setState(204);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 24);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001/\u00d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001 \b\u0001\n\u0001\f\u0001"+
		"#\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002,\b\u0002\n\u0002\f\u0002/\t\u0002"+
		"\u0001\u0002\u0003\u00022\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002@\b\u0002\u0003\u0002"+
		"B\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004M\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005\u0001\u0005\u0003\u0005"+
		"[\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005r\b\u0005"+
		"\u000b\u0005\f\u0005s\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005|\b\u0005\n\u0005\f\u0005\u007f\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004"+
		"\u0005\u008c\b\u0005\u000b\u0005\f\u0005\u008d\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00a3\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00bd\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00c5\b\u0005\n\u0005"+
		"\f\u0005\u00c8\t\u0005\u0001\u0005\u0003\u0005\u00cb\b\u0005\u0001\u0005"+
		"\u0005\u0005\u00ce\b\u0005\n\u0005\f\u0005\u00d1\t\u0005\u0001\u0005\u0000"+
		"\u0001\n\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0000\u00f3\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004A\u0001"+
		"\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\bG\u0001\u0000\u0000"+
		"\u0000\n\u00a2\u0001\u0000\u0000\u0000\f\r\u0003\u0002\u0001\u0000\r\u000e"+
		"\u0005\u001a\u0000\u0000\u000e\u0010\u0001\u0000\u0000\u0000\u000f\f\u0001"+
		"\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000\u0011\u000f\u0001"+
		"\u0000\u0000\u0000\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0013\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0005\u0003\u0000\u0000\u0016\u0019\u0005"+
		"\u0016\u0000\u0000\u0017\u0018\u0005\u0004\u0000\u0000\u0018\u001a\u0005"+
		"\u0016\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b!\u0005%\u0000"+
		"\u0000\u001c\u001d\u0003\u0004\u0002\u0000\u001d\u001e\u0005\u001a\u0000"+
		"\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001c\u0001\u0000\u0000\u0000"+
		" #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000!\"\u0001\u0000"+
		"\u0000\u0000\"$\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000$%\u0005"+
		"&\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0005\u0017\u0000\u0000"+
		"\'1\u0005#\u0000\u0000()\u0003\u0006\u0003\u0000)*\u0005\u001c\u0000\u0000"+
		"*,\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000"+
		"\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000"+
		"\u0000\u0000/-\u0001\u0000\u0000\u000002\u0003\u0006\u0003\u00001-\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"34\u0005$\u0000\u000045\u0005\u001b\u0000\u000056\u0005\u0016\u0000\u0000"+
		"67\u0005%\u0000\u000078\u0003\n\u0005\u000089\u0005&\u0000\u00009B\u0001"+
		"\u0000\u0000\u0000:;\u0005\u0017\u0000\u0000;<\u0005\u001b\u0000\u0000"+
		"<?\u0005\u0016\u0000\u0000=>\u0005!\u0000\u0000>@\u0003\n\u0005\u0000"+
		"?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000"+
		"\u0000A&\u0001\u0000\u0000\u0000A:\u0001\u0000\u0000\u0000B\u0005\u0001"+
		"\u0000\u0000\u0000CD\u0005\u0017\u0000\u0000DE\u0005\u001b\u0000\u0000"+
		"EF\u0005\u0016\u0000\u0000F\u0007\u0001\u0000\u0000\u0000GH\u0005\u0017"+
		"\u0000\u0000HI\u0005\u001b\u0000\u0000IL\u0005\u0016\u0000\u0000JK\u0005"+
		"!\u0000\u0000KM\u0003\n\u0005\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000M\t\u0001\u0000\u0000\u0000NO\u0006\u0005\uffff\uffff"+
		"\u0000OP\u0005\u0017\u0000\u0000PZ\u0005#\u0000\u0000QR\u0003\n\u0005"+
		"\u0000RS\u0005\u001c\u0000\u0000SU\u0001\u0000\u0000\u0000TQ\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WY\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"Y[\u0003\n\u0005\u0000ZV\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\\u00a3\u0005$\u0000\u0000]^\u0005 \u0000"+
		"\u0000^\u00a3\u0003\n\u0005\u0016_`\u0005\t\u0000\u0000`a\u0003\n\u0005"+
		"\u0000ab\u0005\u000b\u0000\u0000bc\u0003\n\u0005\u0000cd\u0005\f\u0000"+
		"\u0000de\u0003\n\u0005\u0000ef\u0005\n\u0000\u0000f\u00a3\u0001\u0000"+
		"\u0000\u0000gh\u0005\r\u0000\u0000hi\u0003\n\u0005\u0000ij\u0005\u000e"+
		"\u0000\u0000jk\u0003\n\u0005\u0000kl\u0005\u000f\u0000\u0000l\u00a3\u0001"+
		"\u0000\u0000\u0000mq\u0005%\u0000\u0000no\u0003\n\u0005\u0000op\u0005"+
		"\u001a\u0000\u0000pr\u0001\u0000\u0000\u0000qn\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uv\u0005&\u0000\u0000v\u00a3\u0001\u0000"+
		"\u0000\u0000wx\u0005\u0005\u0000\u0000x}\u0003\b\u0004\u0000yz\u0005\u001c"+
		"\u0000\u0000z|\u0003\b\u0004\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0006\u0000\u0000\u0081\u0082\u0003\n\u0005\u000b\u0082\u00a3\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u0010\u0000\u0000\u0084\u0085\u0003"+
		"\n\u0005\u0000\u0085\u008b\u0005\u0011\u0000\u0000\u0086\u0087\u0003\u0006"+
		"\u0003\u0000\u0087\u0088\u0005\u0013\u0000\u0000\u0088\u0089\u0003\n\u0005"+
		"\u0000\u0089\u008a\u0005\u001a\u0000\u0000\u008a\u008c\u0001\u0000\u0000"+
		"\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0012\u0000"+
		"\u0000\u0090\u00a3\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0002\u0000"+
		"\u0000\u0092\u00a3\u0005\u0016\u0000\u0000\u0093\u0094\u0005\u0014\u0000"+
		"\u0000\u0094\u00a3\u0003\n\u0005\b\u0095\u0096\u0005\u0007\u0000\u0000"+
		"\u0096\u00a3\u0003\n\u0005\u0007\u0097\u0098\u0005#\u0000\u0000\u0098"+
		"\u0099\u0003\n\u0005\u0000\u0099\u009a\u0005$\u0000\u0000\u009a\u00a3"+
		"\u0001\u0000\u0000\u0000\u009b\u00a3\u0005\u0017\u0000\u0000\u009c\u00a3"+
		"\u0005\u0018\u0000\u0000\u009d\u00a3\u0005\u0019\u0000\u0000\u009e\u00a3"+
		"\u0005\u0015\u0000\u0000\u009f\u00a0\u0005\u0017\u0000\u0000\u00a0\u00a1"+
		"\u0005!\u0000\u0000\u00a1\u00a3\u0003\n\u0005\u0001\u00a2N\u0001\u0000"+
		"\u0000\u0000\u00a2]\u0001\u0000\u0000\u0000\u00a2_\u0001\u0000\u0000\u0000"+
		"\u00a2g\u0001\u0000\u0000\u0000\u00a2m\u0001\u0000\u0000\u0000\u00a2w"+
		"\u0001\u0000\u0000\u0000\u00a2\u0083\u0001\u0000\u0000\u0000\u00a2\u0091"+
		"\u0001\u0000\u0000\u0000\u00a2\u0093\u0001\u0000\u0000\u0000\u00a2\u0095"+
		"\u0001\u0000\u0000\u0000\u00a2\u0097\u0001\u0000\u0000\u0000\u00a2\u009b"+
		"\u0001\u0000\u0000\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a2\u009d"+
		"\u0001\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f"+
		"\u0001\u0000\u0000\u0000\u00a3\u00cf\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\n\u0015\u0000\u0000\u00a5\u00a6\u0005)\u0000\u0000\u00a6\u00ce\u0003"+
		"\n\u0005\u0016\u00a7\u00a8\n\u0014\u0000\u0000\u00a8\u00a9\u0005*\u0000"+
		"\u0000\u00a9\u00ce\u0003\n\u0005\u0015\u00aa\u00ab\n\u0013\u0000\u0000"+
		"\u00ab\u00ac\u0005\'\u0000\u0000\u00ac\u00ce\u0003\n\u0005\u0014\u00ad"+
		"\u00ae\n\u0012\u0000\u0000\u00ae\u00af\u0005(\u0000\u0000\u00af\u00ce"+
		"\u0003\n\u0005\u0013\u00b0\u00b1\n\u0011\u0000\u0000\u00b1\u00b2\u0005"+
		"\u001f\u0000\u0000\u00b2\u00ce\u0003\n\u0005\u0012\u00b3\u00b4\n\u0010"+
		"\u0000\u0000\u00b4\u00b5\u0005\u001e\u0000\u0000\u00b5\u00ce\u0003\n\u0005"+
		"\u0011\u00b6\u00b7\n\u000f\u0000\u0000\u00b7\u00b8\u0005\u001d\u0000\u0000"+
		"\u00b8\u00ce\u0003\n\u0005\u0010\u00b9\u00bc\n\u0018\u0000\u0000\u00ba"+
		"\u00bb\u0005\b\u0000\u0000\u00bb\u00bd\u0005\u0016\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\"\u0000\u0000\u00bf\u00c0\u0005"+
		"\u0017\u0000\u0000\u00c0\u00ca\u0005#\u0000\u0000\u00c1\u00c2\u0003\n"+
		"\u0005\u0000\u00c2\u00c3\u0005\u001c\u0000\u0000\u00c3\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000"+
		"\u0000\u0000\u00c9\u00cb\u0003\n\u0005\u0000\u00ca\u00c6\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ce\u0005$\u0000\u0000\u00cd\u00a4\u0001\u0000\u0000\u0000"+
		"\u00cd\u00a7\u0001\u0000\u0000\u0000\u00cd\u00aa\u0001\u0000\u0000\u0000"+
		"\u00cd\u00ad\u0001\u0000\u0000\u0000\u00cd\u00b0\u0001\u0000\u0000\u0000"+
		"\u00cd\u00b3\u0001\u0000\u0000\u0000\u00cd\u00b6\u0001\u0000\u0000\u0000"+
		"\u00cd\u00b9\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000"+
		"\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000"+
		"\u00d0\u000b\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u0013\u0011\u0019!-1?ALVZs}\u008d\u00a2\u00bc\u00c6\u00ca\u00cd\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}