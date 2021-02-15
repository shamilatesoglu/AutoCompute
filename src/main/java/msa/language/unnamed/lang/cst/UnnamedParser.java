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
		T__0=1, T__1=2, T__2=3, STRING_LITERAL=4, IN=5, OUT=6, ENTITY=7, GIVEN=8, 
		CONSTRAINTS=9, DOT=10, DOTDOT=11, ASSIGN=12, LCURLY=13, RCURLY=14, LBRACKET=15, 
		RBRACKET=16, COMMA=17, COLON=18, BOOLEAN_LITERAL=19, TRUE=20, FALSE=21, 
		OPERATOR_ADD=22, OPERATOR_SUB=23, OPERATOR_MUL=24, OPERATOR_DIV=25, OPERATOR_AND=26, 
		OPERATOR_OR=27, OPERATOR_EQ=28, OPERATOR_NEQ=29, OPERATOR_GT=30, OPERATOR_LT=31, 
		OPERATOR_GTEQ=32, OPERATOR_LTEQ=33, NUM=34, ID=35, WS=36, COMMENT=37, 
		LINE_COMMENT=38;
	public static final int
		RULE_compilationUnit = 0, RULE_entityDefinition = 1, RULE_entityBody = 2, 
		RULE_propertyDefinition = 3, RULE_inputDeclaration = 4, RULE_localVariableDefinition = 5, 
		RULE_outputDefinition = 6, RULE_given = 7, RULE_constraint = 8, RULE_constraintsDefinition = 9, 
		RULE_rangeExpression = 10, RULE_expression = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "entityDefinition", "entityBody", "propertyDefinition", 
			"inputDeclaration", "localVariableDefinition", "outputDefinition", "given", 
			"constraint", "constraintsDefinition", "rangeExpression", "expression"
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
			setState(24);
			entityDefinition();
			setState(25);
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
			setState(27);
			match(ENTITY);
			setState(28);
			((EntityDefinitionContext)_localctx).identifier = match(ID);
			setState(29);
			match(LCURLY);
			setState(30);
			entityBody();
			setState(31);
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
		public List<ConstraintsDefinitionContext> constraintsDefinition() {
			return getRuleContexts(ConstraintsDefinitionContext.class);
		}
		public ConstraintsDefinitionContext constraintsDefinition(int i) {
			return getRuleContext(ConstraintsDefinitionContext.class,i);
		}
		public List<PropertyDefinitionContext> propertyDefinition() {
			return getRuleContexts(PropertyDefinitionContext.class);
		}
		public PropertyDefinitionContext propertyDefinition(int i) {
			return getRuleContext(PropertyDefinitionContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRAINTS) {
				{
				{
				setState(33);
				constraintsDefinition();
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(39);
					propertyDefinition();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN) {
				{
				{
				setState(45);
				inputDeclaration();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(51);
				localVariableDefinition();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTITY) {
				{
				{
				setState(57);
				entityDefinition();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OUT) {
				{
				{
				setState(63);
				outputDefinition();
				}
				}
				setState(68);
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

	public static class PropertyDefinitionContext extends ParserRuleContext {
		public Token identifier;
		public Token value;
		public TerminalNode COLON() { return getToken(UnnamedParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(UnnamedParser.DOT, 0); }
		public TerminalNode ID() { return getToken(UnnamedParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(UnnamedParser.STRING_LITERAL, 0); }
		public TerminalNode NUM() { return getToken(UnnamedParser.NUM, 0); }
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterPropertyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitPropertyDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitPropertyDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyDefinitionContext propertyDefinition() throws RecognitionException {
		PropertyDefinitionContext _localctx = new PropertyDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_propertyDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((PropertyDefinitionContext)_localctx).identifier = match(ID);
			setState(70);
			match(COLON);
			setState(71);
			((PropertyDefinitionContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==NUM) ) {
				((PropertyDefinitionContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
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
		enterRule(_localctx, 8, RULE_inputDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IN);
			setState(75);
			((InputDeclarationContext)_localctx).identifier = match(ID);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(76);
				rangeExpression();
				}
			}

			setState(79);
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
		public GivenContext given() {
			return getRuleContext(GivenContext.class,0);
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
		enterRule(_localctx, 10, RULE_localVariableDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((LocalVariableDefinitionContext)_localctx).identifier = match(ID);
			setState(82);
			match(ASSIGN);
			setState(83);
			expression(0);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GIVEN) {
				{
				setState(84);
				given();
				}
			}

			setState(87);
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
		public GivenContext given() {
			return getRuleContext(GivenContext.class,0);
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
		enterRule(_localctx, 12, RULE_outputDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(OUT);
			setState(90);
			((OutputDefinitionContext)_localctx).identifier = match(ID);
			setState(91);
			match(ASSIGN);
			setState(92);
			expression(0);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GIVEN) {
				{
				setState(93);
				given();
				}
			}

			setState(96);
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

	public static class GivenContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode GIVEN() { return getToken(UnnamedParser.GIVEN, 0); }
		public TerminalNode LCURLY() { return getToken(UnnamedParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(UnnamedParser.RCURLY, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public TerminalNode ID() { return getToken(UnnamedParser.ID, 0); }
		public GivenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_given; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterGiven(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitGiven(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitGiven(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GivenContext given() throws RecognitionException {
		GivenContext _localctx = new GivenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_given);
		int _la;
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(GIVEN);
				setState(99);
				match(LCURLY);
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN_LITERAL) | (1L << OPERATOR_ADD) | (1L << OPERATOR_SUB) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					{
					setState(100);
					constraint();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(GIVEN);
				setState(108);
				((GivenContext)_localctx).identifier = match(ID);
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

	public static class ConstraintContext extends ParserRuleContext {
		public Token rationale;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(UnnamedParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(UnnamedParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(UnnamedParser.STRING_LITERAL, 0); }
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
		enterRule(_localctx, 16, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			expression(0);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(112);
				match(COMMA);
				setState(113);
				((ConstraintContext)_localctx).rationale = match(STRING_LITERAL);
				}
			}

			setState(116);
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

	public static class ConstraintsDefinitionContext extends ParserRuleContext {
		public Token identifier;
		public TerminalNode CONSTRAINTS() { return getToken(UnnamedParser.CONSTRAINTS, 0); }
		public TerminalNode LCURLY() { return getToken(UnnamedParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(UnnamedParser.RCURLY, 0); }
		public TerminalNode DOT() { return getToken(UnnamedParser.DOT, 0); }
		public TerminalNode ID() { return getToken(UnnamedParser.ID, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ConstraintsDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintsDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).enterConstraintsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UnnamedListener ) ((UnnamedListener)listener).exitConstraintsDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UnnamedVisitor ) return ((UnnamedVisitor<? extends T>)visitor).visitConstraintsDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintsDefinitionContext constraintsDefinition() throws RecognitionException {
		ConstraintsDefinitionContext _localctx = new ConstraintsDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constraintsDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(CONSTRAINTS);
			setState(119);
			((ConstraintsDefinitionContext)_localctx).identifier = match(ID);
			setState(120);
			match(LCURLY);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN_LITERAL) | (1L << OPERATOR_ADD) | (1L << OPERATOR_SUB) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(121);
				constraint();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
			match(RCURLY);
			setState(128);
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
		enterRule(_localctx, 20, RULE_rangeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(LBRACKET);
			setState(131);
			expression(0);
			setState(132);
			match(DOTDOT);
			setState(133);
			expression(0);
			setState(134);
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
		public TerminalNode COLON() { return getToken(UnnamedParser.COLON, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(137);
				match(T__0);
				setState(138);
				expression(0);
				setState(139);
				match(T__1);
				}
				break;
			case OPERATOR_ADD:
			case OPERATOR_SUB:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141);
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
				setState(142);
				expression(7);
				}
				break;
			case ID:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143);
				((ReferenceExpressionContext)_localctx).identifier = match(ID);
				}
				break;
			case BOOLEAN_LITERAL:
			case NUM:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
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
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(148);
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
						setState(149);
						((InfixExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(151);
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
						setState(152);
						((InfixExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 3:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(154);
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
						setState(155);
						((InfixExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(157);
						match(T__2);
						setState(158);
						((ConditionalExpressionContext)_localctx).first = expression(0);
						setState(159);
						match(COLON);
						setState(160);
						((ConditionalExpressionContext)_localctx).second = expression(4);
						}
						break;
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		case 11:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u00aa\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4%\n\4\f"+
		"\4\16\4(\13\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\7\4\61\n\4\f\4\16\4\64\13"+
		"\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\7\4=\n\4\f\4\16\4@\13\4\3\4\7\4C"+
		"\n\4\f\4\16\4F\13\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\5\6P\n\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\5\7X\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\ba\n\b\3\b\3\b\3"+
		"\t\3\t\3\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\3\t\5\tp\n\t\3\n\3\n\3\n\5"+
		"\nu\n\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0094\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00a5\n\r\f\r\16\r\u00a8\13\r\3\r\2\3\30\16\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\2\7\4\2\6\6$$\3\2\30\31\4\2\25\25$$\3\2\32\33\3\2\34"+
		"#\2\u00b1\2\32\3\2\2\2\4\35\3\2\2\2\6&\3\2\2\2\bG\3\2\2\2\nL\3\2\2\2\f"+
		"S\3\2\2\2\16[\3\2\2\2\20o\3\2\2\2\22q\3\2\2\2\24x\3\2\2\2\26\u0084\3\2"+
		"\2\2\30\u0093\3\2\2\2\32\33\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35\36\7"+
		"\t\2\2\36\37\7%\2\2\37 \7\17\2\2 !\5\6\4\2!\"\7\20\2\2\"\5\3\2\2\2#%\5"+
		"\24\13\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\',\3\2\2\2(&\3\2\2\2"+
		")+\5\b\5\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\62\3\2\2\2.,\3\2\2"+
		"\2/\61\5\n\6\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63"+
		"8\3\2\2\2\64\62\3\2\2\2\65\67\5\f\7\2\66\65\3\2\2\2\67:\3\2\2\28\66\3"+
		"\2\2\289\3\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\4\3\2<;\3\2\2\2=@\3\2\2\2><\3"+
		"\2\2\2>?\3\2\2\2?D\3\2\2\2@>\3\2\2\2AC\5\16\b\2BA\3\2\2\2CF\3\2\2\2DB"+
		"\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FD\3\2\2\2GH\7%\2\2HI\7\24\2\2IJ\t\2\2\2"+
		"JK\7\f\2\2K\t\3\2\2\2LM\7\7\2\2MO\7%\2\2NP\5\26\f\2ON\3\2\2\2OP\3\2\2"+
		"\2PQ\3\2\2\2QR\7\f\2\2R\13\3\2\2\2ST\7%\2\2TU\7\16\2\2UW\5\30\r\2VX\5"+
		"\20\t\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\f\2\2Z\r\3\2\2\2[\\\7\b\2\2"+
		"\\]\7%\2\2]^\7\16\2\2^`\5\30\r\2_a\5\20\t\2`_\3\2\2\2`a\3\2\2\2ab\3\2"+
		"\2\2bc\7\f\2\2c\17\3\2\2\2de\7\n\2\2ei\7\17\2\2fh\5\22\n\2gf\3\2\2\2h"+
		"k\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lp\7\20\2\2mn\7\n\2\2"+
		"np\7%\2\2od\3\2\2\2om\3\2\2\2p\21\3\2\2\2qt\5\30\r\2rs\7\23\2\2su\7\6"+
		"\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\f\2\2w\23\3\2\2\2xy\7\13\2\2yz"+
		"\7%\2\2z~\7\17\2\2{}\5\22\n\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\20\2\2\u0082\u0083"+
		"\7\f\2\2\u0083\25\3\2\2\2\u0084\u0085\7\21\2\2\u0085\u0086\5\30\r\2\u0086"+
		"\u0087\7\r\2\2\u0087\u0088\5\30\r\2\u0088\u0089\7\22\2\2\u0089\27\3\2"+
		"\2\2\u008a\u008b\b\r\1\2\u008b\u008c\7\3\2\2\u008c\u008d\5\30\r\2\u008d"+
		"\u008e\7\4\2\2\u008e\u0094\3\2\2\2\u008f\u0090\t\3\2\2\u0090\u0094\5\30"+
		"\r\t\u0091\u0094\7%\2\2\u0092\u0094\t\4\2\2\u0093\u008a\3\2\2\2\u0093"+
		"\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\u00a6\3\2"+
		"\2\2\u0095\u0096\f\b\2\2\u0096\u0097\t\5\2\2\u0097\u00a5\5\30\r\t\u0098"+
		"\u0099\f\7\2\2\u0099\u009a\t\3\2\2\u009a\u00a5\5\30\r\b\u009b\u009c\f"+
		"\6\2\2\u009c\u009d\t\6\2\2\u009d\u00a5\5\30\r\7\u009e\u009f\f\5\2\2\u009f"+
		"\u00a0\7\5\2\2\u00a0\u00a1\5\30\r\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\5"+
		"\30\r\6\u00a3\u00a5\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4"+
		"\u009b\3\2\2\2\u00a4\u009e\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a7\31\3\2\2\2\u00a8\u00a6\3\2\2\2\22&,\62"+
		"8>DOW`iot~\u0093\u00a4\u00a6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}