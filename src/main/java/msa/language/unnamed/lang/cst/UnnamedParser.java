// Generated from D:/Library/Repos/Unnamed/grammar\Unnamed.g4 by ANTLR 4.9.1
package msa.language.unnamed.lang.cst;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class UnnamedParser extends Parser {
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
	public static final int
		RULE_compilationUnit = 0, RULE_entityDefinition = 1, RULE_entityBody = 2, 
		RULE_inputDeclaration = 3, RULE_localVariableDefinition = 4, RULE_outputDefinition = 5, 
		RULE_constraint = 6, RULE_rangeExpression = 7, RULE_expression = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "entityDefinition", "entityBody", "inputDeclaration", 
			"localVariableDefinition", "outputDefinition", "constraint", "rangeExpression", 
			"expression"
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

	@Override
	public String getGrammarFileName() { return "Unnamed.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UnnamedParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public EntityDefinitionContext entityDefinition() {
			return getRuleContext(EntityDefinitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(UnnamedParser.EOF, 0); }
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			entityDefinition();
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

	public static class EntityDefinitionContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode ENTITY() { return getToken(UnnamedParser.ENTITY, 0); }
		public TerminalNode LCURLY() { return getToken(UnnamedParser.LCURLY, 0); }
		public EntityBodyContext entityBody() {
			return getRuleContext(EntityBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(UnnamedParser.RCURLY, 0); }
		public TerminalNode ID() { return getToken(UnnamedParser.ID, 0); }
		public EntityDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterEntityDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitEntityDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitEntityDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityDefinitionContext entityDefinition() throws RecognitionException {
		EntityDefinitionContext _localctx = new EntityDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entityDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(ENTITY);
			setState(22);
			((EntityDefinitionContext)_localctx).identifier = match(ID);
			setState(23);
			match(LCURLY);
			setState(24);
			entityBody();
			setState(25);
			match(RCURLY);
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

	public static class EntityBodyContext extends ParserRuleContext {
		public List<InputDeclarationContext> inputDeclaration() {
			return getRuleContexts(InputDeclarationContext.class);
		}
		public InputDeclarationContext inputDeclaration(int i) {
			return getRuleContext(InputDeclarationContext.class,i);
		}
		public List<LocalVariableDefinitionContext> localVariableDefinition() {
			return getRuleContexts(LocalVariableDefinitionContext.class);
		}
		public LocalVariableDefinitionContext localVariableDefinition(int i) {
			return getRuleContext(LocalVariableDefinitionContext.class,i);
		}
		public List<EntityDefinitionContext> entityDefinition() {
			return getRuleContexts(EntityDefinitionContext.class);
		}
		public EntityDefinitionContext entityDefinition(int i) {
			return getRuleContext(EntityDefinitionContext.class,i);
		}
		public List<OutputDefinitionContext> outputDefinition() {
			return getRuleContexts(OutputDefinitionContext.class);
		}
		public OutputDefinitionContext outputDefinition(int i) {
			return getRuleContext(OutputDefinitionContext.class,i);
		}
		public EntityBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterEntityBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitEntityBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitEntityBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityBodyContext entityBody() throws RecognitionException {
		EntityBodyContext _localctx = new EntityBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_entityBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN) {
				{
				{
				setState(27);
				inputDeclaration();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(33);
				localVariableDefinition();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTITY) {
				{
				{
				setState(39);
				entityDefinition();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OUT) {
				{
				{
				setState(45);
				outputDefinition();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class InputDeclarationContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode IN() { return getToken(UnnamedParser.IN, 0); }
		public TerminalNode DOT() { return getToken(UnnamedParser.DOT, 0); }
		public TerminalNode ID() { return getToken(UnnamedParser.ID, 0); }
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitInputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitInputDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDeclarationContext inputDeclaration() throws RecognitionException {
		InputDeclarationContext _localctx = new InputDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(IN);
			setState(52);
			((InputDeclarationContext)_localctx).identifier = match(ID);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(53);
				rangeExpression();
				}
			}

			setState(56);
			match(DOT);
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

	public static class LocalVariableDefinitionContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode ASSIGN() { return getToken(UnnamedParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(UnnamedParser.DOT, 0); }
		public TerminalNode ID() { return getToken(UnnamedParser.ID, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public LocalVariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterLocalVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitLocalVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitLocalVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDefinitionContext localVariableDefinition() throws RecognitionException {
		LocalVariableDefinitionContext _localctx = new LocalVariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_localVariableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			((LocalVariableDefinitionContext)_localctx).identifier = match(ID);
			setState(59);
			match(ASSIGN);
			setState(60);
			expression(0);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GIVEN) {
				{
				setState(61);
				constraint();
				}
			}

			setState(64);
			match(DOT);
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

	public static class OutputDefinitionContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode OUT() { return getToken(UnnamedParser.OUT, 0); }
		public TerminalNode ASSIGN() { return getToken(UnnamedParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(UnnamedParser.DOT, 0); }
		public TerminalNode ID() { return getToken(UnnamedParser.ID, 0); }
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public OutputDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterOutputDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitOutputDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitOutputDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputDefinitionContext outputDefinition() throws RecognitionException {
		OutputDefinitionContext _localctx = new OutputDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_outputDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(OUT);
			setState(67);
			((OutputDefinitionContext)_localctx).identifier = match(ID);
			setState(68);
			match(ASSIGN);
			setState(69);
			expression(0);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GIVEN) {
				{
				setState(70);
				constraint();
				}
			}

			setState(73);
			match(DOT);
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

	public static class ConstraintContext extends ParserRuleContext {
		public TerminalNode GIVEN() { return getToken(UnnamedParser.GIVEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(GIVEN);
			setState(76);
			expression(0);
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

	public static class RangeExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(UnnamedParser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(UnnamedParser.DOTDOT, 0); }
		public TerminalNode RBRACKET() { return getToken(UnnamedParser.RBRACKET, 0); }
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rangeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(LBRACKET);
			setState(79);
			expression(0);
			setState(80);
			match(DOTDOT);
			setState(81);
			expression(0);
			setState(82);
			match(RBRACKET);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReferenceExpressionContext extends ExpressionContext {
		public Token identifier;
		public TerminalNode ID() { return getToken(UnnamedParser.ID, 0); }
		public ReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitReferenceExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InfixExpressionContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operation;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR_MUL() { return getToken(UnnamedParser.OPERATOR_MUL, 0); }
		public TerminalNode OPERATOR_DIV() { return getToken(UnnamedParser.OPERATOR_DIV, 0); }
		public TerminalNode OPERATOR_ADD() { return getToken(UnnamedParser.OPERATOR_ADD, 0); }
		public TerminalNode OPERATOR_SUB() { return getToken(UnnamedParser.OPERATOR_SUB, 0); }
		public TerminalNode OPERATOR_EQ() { return getToken(UnnamedParser.OPERATOR_EQ, 0); }
		public TerminalNode OPERATOR_NEQ() { return getToken(UnnamedParser.OPERATOR_NEQ, 0); }
		public TerminalNode OPERATOR_GT() { return getToken(UnnamedParser.OPERATOR_GT, 0); }
		public TerminalNode OPERATOR_LT() { return getToken(UnnamedParser.OPERATOR_LT, 0); }
		public TerminalNode OPERATOR_GTEQ() { return getToken(UnnamedParser.OPERATOR_GTEQ, 0); }
		public TerminalNode OPERATOR_LTEQ() { return getToken(UnnamedParser.OPERATOR_LTEQ, 0); }
		public TerminalNode OPERATOR_AND() { return getToken(UnnamedParser.OPERATOR_AND, 0); }
		public TerminalNode OPERATOR_OR() { return getToken(UnnamedParser.OPERATOR_OR, 0); }
		public InfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterInfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitInfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitInfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public Token value;
		public TerminalNode NUM() { return getToken(UnnamedParser.NUM, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(UnnamedParser.BOOLEAN_LITERAL, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ExpressionContext check;
		public ExpressionContext first;
		public ExpressionContext second;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpressionContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesisExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token operation;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPERATOR_ADD() { return getToken(UnnamedParser.OPERATOR_ADD, 0); }
		public TerminalNode OPERATOR_SUB() { return getToken(UnnamedParser.OPERATOR_SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(85);
				match(T__0);
				setState(86);
				expression(0);
				setState(87);
				match(T__1);
				}
				break;
			case OPERATOR_ADD:
			case OPERATOR_SUB:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				((UnaryExpressionContext)_localctx).operation = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==OPERATOR_ADD || _la==OPERATOR_SUB) ) {
					((UnaryExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(90);
				expression(7);
				}
				break;
			case ID:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				((ReferenceExpressionContext)_localctx).identifier = match(ID);
				}
				break;
			case BOOLEAN_LITERAL:
			case NUM:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				((NumberExpressionContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BOOLEAN_LITERAL || _la==NUM) ) {
					((NumberExpressionContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(96);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_MUL || _la==OPERATOR_DIV) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(97);
						((InfixExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(99);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_ADD || _la==OPERATOR_SUB) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(100);
						((InfixExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(102);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_AND) | (1L << OPERATOR_OR) | (1L << OPERATOR_EQ) | (1L << OPERATOR_NEQ) | (1L << OPERATOR_GT) | (1L << OPERATOR_LT) | (1L << OPERATOR_GTEQ) | (1L << OPERATOR_LTEQ))) != 0)) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(103);
						((InfixExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(105);
						match(T__2);
						setState(106);
						((ConditionalExpressionContext)_localctx).first = expression(0);
						setState(107);
						match(T__3);
						setState(108);
						((ConditionalExpressionContext)_localctx).second = expression(4);
						}
						break;
					}
					} 
				}
				setState(114);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#v\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\4\7\4%\n\4\f\4"+
		"\16\4(\13\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\7\4\61\n\4\f\4\16\4\64\13"+
		"\4\3\5\3\5\3\5\5\59\n\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6A\n\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7J\n\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nq\n\n\f\n\16\nt\13\n\3\n\2\3\22"+
		"\13\2\4\6\b\n\f\16\20\22\2\6\3\2\25\26\4\2\22\22!!\3\2\27\30\3\2\31 \2"+
		"z\2\24\3\2\2\2\4\27\3\2\2\2\6 \3\2\2\2\b\65\3\2\2\2\n<\3\2\2\2\fD\3\2"+
		"\2\2\16M\3\2\2\2\20P\3\2\2\2\22_\3\2\2\2\24\25\5\4\3\2\25\26\7\2\2\3\26"+
		"\3\3\2\2\2\27\30\7\t\2\2\30\31\7\"\2\2\31\32\7\16\2\2\32\33\5\6\4\2\33"+
		"\34\7\17\2\2\34\5\3\2\2\2\35\37\5\b\5\2\36\35\3\2\2\2\37\"\3\2\2\2 \36"+
		"\3\2\2\2 !\3\2\2\2!&\3\2\2\2\" \3\2\2\2#%\5\n\6\2$#\3\2\2\2%(\3\2\2\2"+
		"&$\3\2\2\2&\'\3\2\2\2\',\3\2\2\2(&\3\2\2\2)+\5\4\3\2*)\3\2\2\2+.\3\2\2"+
		"\2,*\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3\2\2\2/\61\5\f\7\2\60/\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64\62\3\2\2\2\65"+
		"\66\7\7\2\2\668\7\"\2\2\679\5\20\t\28\67\3\2\2\289\3\2\2\29:\3\2\2\2:"+
		";\7\13\2\2;\t\3\2\2\2<=\7\"\2\2=>\7\r\2\2>@\5\22\n\2?A\5\16\b\2@?\3\2"+
		"\2\2@A\3\2\2\2AB\3\2\2\2BC\7\13\2\2C\13\3\2\2\2DE\7\b\2\2EF\7\"\2\2FG"+
		"\7\r\2\2GI\5\22\n\2HJ\5\16\b\2IH\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\13\2"+
		"\2L\r\3\2\2\2MN\7\n\2\2NO\5\22\n\2O\17\3\2\2\2PQ\7\20\2\2QR\5\22\n\2R"+
		"S\7\f\2\2ST\5\22\n\2TU\7\21\2\2U\21\3\2\2\2VW\b\n\1\2WX\7\3\2\2XY\5\22"+
		"\n\2YZ\7\4\2\2Z`\3\2\2\2[\\\t\2\2\2\\`\5\22\n\t]`\7\"\2\2^`\t\3\2\2_V"+
		"\3\2\2\2_[\3\2\2\2_]\3\2\2\2_^\3\2\2\2`r\3\2\2\2ab\f\b\2\2bc\t\4\2\2c"+
		"q\5\22\n\tde\f\7\2\2ef\t\2\2\2fq\5\22\n\bgh\f\6\2\2hi\t\5\2\2iq\5\22\n"+
		"\7jk\f\5\2\2kl\7\5\2\2lm\5\22\n\2mn\7\6\2\2no\5\22\n\6oq\3\2\2\2pa\3\2"+
		"\2\2pd\3\2\2\2pg\3\2\2\2pj\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\23\3"+
		"\2\2\2tr\3\2\2\2\f &,\628@I_pr";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}