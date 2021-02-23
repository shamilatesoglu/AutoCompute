// Generated from grammar/AutoCompute.g4 by ANTLR 4.9.1

package msa.lang.autocompute.cst;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutoComputeParser extends Parser {
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
		OPERATOR_IN=36, OPERATOR_EXP=37, NUM=38, ID=39, COMMENT=40, LINE_COMMENT=41, 
		WS=42;
	public static final int
		RULE_compilationUnit = 0, RULE_entityDefinition = 1, RULE_entityBody = 2, 
		RULE_propertyDefinition = 3, RULE_inputDeclaration = 4, RULE_localVariableDefinition = 5, 
		RULE_outputDefinition = 6, RULE_given = 7, RULE_constraint = 8, RULE_constraintsDefinition = 9, 
		RULE_rangeExpression = 10, RULE_computeCall = 11, RULE_inputDefinition = 12, 
		RULE_reference = 13, RULE_expression = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "entityDefinition", "entityBody", "propertyDefinition", 
			"inputDeclaration", "localVariableDefinition", "outputDefinition", "given", 
			"constraint", "constraintsDefinition", "rangeExpression", "computeCall", 
			"inputDefinition", "reference", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'?'", null, null, null, null, null, null, null, 
			"'.'", "'..'", "':='", "'{'", "'}'", "'['", "']'", "','", "':'", null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'::'", "'<<'", "'^'"
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
			"OPERATOR_EXP", "NUM", "ID", "COMMENT", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "AutoCompute.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutoComputeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AutoComputeParser.EOF, 0); }
		public List<EntityDefinitionContext> entityDefinition() {
			return getRuleContexts(EntityDefinitionContext.class);
		}
		public EntityDefinitionContext entityDefinition(int i) {
			return getRuleContext(EntityDefinitionContext.class,i);
		}
		public List<ComputeCallContext> computeCall() {
			return getRuleContexts(ComputeCallContext.class);
		}
		public ComputeCallContext computeCall(int i) {
			return getRuleContext(ComputeCallContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					entityDefinition();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMPUTE) {
				{
				{
				setState(36);
				computeCall();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTITY) {
				{
				{
				setState(42);
				entityDefinition();
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
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
		public TerminalNode ENTITY() { return getToken(AutoComputeParser.ENTITY, 0); }
		public TerminalNode LCURLY() { return getToken(AutoComputeParser.LCURLY, 0); }
		public EntityBodyContext entityBody() {
			return getRuleContext(EntityBodyContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(AutoComputeParser.RCURLY, 0); }
		public TerminalNode ID() { return getToken(AutoComputeParser.ID, 0); }
		public EntityDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterEntityDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitEntityDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitEntityDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityDefinitionContext entityDefinition() throws RecognitionException {
		EntityDefinitionContext _localctx = new EntityDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entityDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ENTITY);
			setState(51);
			((EntityDefinitionContext)_localctx).identifier = match(ID);
			setState(52);
			match(LCURLY);
			setState(53);
			entityBody();
			setState(54);
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
		public List<PropertyDefinitionContext> propertyDefinition() {
			return getRuleContexts(PropertyDefinitionContext.class);
		}
		public PropertyDefinitionContext propertyDefinition(int i) {
			return getRuleContext(PropertyDefinitionContext.class,i);
		}
		public List<ConstraintsDefinitionContext> constraintsDefinition() {
			return getRuleContexts(ConstraintsDefinitionContext.class);
		}
		public ConstraintsDefinitionContext constraintsDefinition(int i) {
			return getRuleContext(ConstraintsDefinitionContext.class,i);
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
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterEntityBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitEntityBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitEntityBody(this);
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
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(56);
					propertyDefinition();
					}
					} 
				}
				setState(61);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONSTRAINTS) {
				{
				{
				setState(62);
				constraintsDefinition();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IN) {
				{
				{
				setState(68);
				inputDeclaration();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(74);
				localVariableDefinition();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTITY) {
				{
				{
				setState(80);
				entityDefinition();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OUT) {
				{
				{
				setState(86);
				outputDefinition();
				}
				}
				setState(91);
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
		public TerminalNode COLON() { return getToken(AutoComputeParser.COLON, 0); }
		public TerminalNode DOT() { return getToken(AutoComputeParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AutoComputeParser.ID, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AutoComputeParser.STRING_LITERAL, 0); }
		public TerminalNode NUM() { return getToken(AutoComputeParser.NUM, 0); }
		public PropertyDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterPropertyDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitPropertyDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitPropertyDefinition(this);
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
			setState(92);
			((PropertyDefinitionContext)_localctx).identifier = match(ID);
			setState(93);
			match(COLON);
			setState(94);
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
			setState(95);
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
		public TerminalNode IN() { return getToken(AutoComputeParser.IN, 0); }
		public TerminalNode DOT() { return getToken(AutoComputeParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AutoComputeParser.ID, 0); }
		public RangeExpressionContext rangeExpression() {
			return getRuleContext(RangeExpressionContext.class,0);
		}
		public InputDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterInputDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitInputDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitInputDeclaration(this);
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
			setState(97);
			match(IN);
			setState(98);
			((InputDeclarationContext)_localctx).identifier = match(ID);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACKET) {
				{
				setState(99);
				rangeExpression();
				}
			}

			setState(102);
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
		public TerminalNode ASSIGN() { return getToken(AutoComputeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AutoComputeParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AutoComputeParser.ID, 0); }
		public GivenContext given() {
			return getRuleContext(GivenContext.class,0);
		}
		public LocalVariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterLocalVariableDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitLocalVariableDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitLocalVariableDefinition(this);
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
			setState(104);
			((LocalVariableDefinitionContext)_localctx).identifier = match(ID);
			setState(105);
			match(ASSIGN);
			setState(106);
			expression(0);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GIVEN) {
				{
				setState(107);
				given();
				}
			}

			setState(110);
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
		public TerminalNode OUT() { return getToken(AutoComputeParser.OUT, 0); }
		public TerminalNode ASSIGN() { return getToken(AutoComputeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AutoComputeParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AutoComputeParser.ID, 0); }
		public GivenContext given() {
			return getRuleContext(GivenContext.class,0);
		}
		public OutputDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterOutputDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitOutputDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitOutputDefinition(this);
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
			setState(112);
			match(OUT);
			setState(113);
			((OutputDefinitionContext)_localctx).identifier = match(ID);
			setState(114);
			match(ASSIGN);
			setState(115);
			expression(0);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GIVEN) {
				{
				setState(116);
				given();
				}
			}

			setState(119);
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
		public TerminalNode GIVEN() { return getToken(AutoComputeParser.GIVEN, 0); }
		public TerminalNode LCURLY() { return getToken(AutoComputeParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AutoComputeParser.RCURLY, 0); }
		public List<ConstraintContext> constraint() {
			return getRuleContexts(ConstraintContext.class);
		}
		public ConstraintContext constraint(int i) {
			return getRuleContext(ConstraintContext.class,i);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public GivenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_given; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterGiven(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitGiven(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitGiven(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GivenContext given() throws RecognitionException {
		GivenContext _localctx = new GivenContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_given);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(GIVEN);
				setState(122);
				match(LCURLY);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN_LITERAL) | (1L << OPERATOR_ADD) | (1L << OPERATOR_SUB) | (1L << NUM) | (1L << ID))) != 0)) {
					{
					{
					setState(123);
					constraint();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(RCURLY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(GIVEN);
				setState(131);
				reference();
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
		public TerminalNode DOT() { return getToken(AutoComputeParser.DOT, 0); }
		public TerminalNode COMMA() { return getToken(AutoComputeParser.COMMA, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(AutoComputeParser.STRING_LITERAL, 0); }
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitConstraint(this);
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
			setState(134);
			expression(0);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(135);
				match(COMMA);
				setState(136);
				((ConstraintContext)_localctx).rationale = match(STRING_LITERAL);
				}
			}

			setState(139);
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
		public TerminalNode CONSTRAINTS() { return getToken(AutoComputeParser.CONSTRAINTS, 0); }
		public TerminalNode LCURLY() { return getToken(AutoComputeParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AutoComputeParser.RCURLY, 0); }
		public TerminalNode DOT() { return getToken(AutoComputeParser.DOT, 0); }
		public TerminalNode ID() { return getToken(AutoComputeParser.ID, 0); }
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
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterConstraintsDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitConstraintsDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitConstraintsDefinition(this);
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
			setState(141);
			match(CONSTRAINTS);
			setState(142);
			((ConstraintsDefinitionContext)_localctx).identifier = match(ID);
			setState(143);
			match(LCURLY);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN_LITERAL) | (1L << OPERATOR_ADD) | (1L << OPERATOR_SUB) | (1L << NUM) | (1L << ID))) != 0)) {
				{
				{
				setState(144);
				constraint();
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150);
			match(RCURLY);
			setState(151);
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
		public TerminalNode LBRACKET() { return getToken(AutoComputeParser.LBRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(AutoComputeParser.DOTDOT, 0); }
		public TerminalNode RBRACKET() { return getToken(AutoComputeParser.RBRACKET, 0); }
		public RangeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterRangeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitRangeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitRangeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeExpressionContext rangeExpression() throws RecognitionException {
		RangeExpressionContext _localctx = new RangeExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_rangeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(LBRACKET);
			setState(154);
			expression(0);
			setState(155);
			match(DOTDOT);
			setState(156);
			expression(0);
			setState(157);
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

	public static class ComputeCallContext extends ParserRuleContext {
		public TerminalNode COMPUTE() { return getToken(AutoComputeParser.COMPUTE, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode LCURLY() { return getToken(AutoComputeParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(AutoComputeParser.RCURLY, 0); }
		public TerminalNode DOT() { return getToken(AutoComputeParser.DOT, 0); }
		public List<InputDefinitionContext> inputDefinition() {
			return getRuleContexts(InputDefinitionContext.class);
		}
		public InputDefinitionContext inputDefinition(int i) {
			return getRuleContext(InputDefinitionContext.class,i);
		}
		public ComputeCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_computeCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterComputeCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitComputeCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitComputeCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComputeCallContext computeCall() throws RecognitionException {
		ComputeCallContext _localctx = new ComputeCallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_computeCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(COMPUTE);
			setState(160);
			reference();
			setState(161);
			match(LCURLY);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(162);
				inputDefinition();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(168);
			match(RCURLY);
			setState(169);
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

	public static class InputDefinitionContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode OPERATOR_IN() { return getToken(AutoComputeParser.OPERATOR_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AutoComputeParser.DOT, 0); }
		public InputDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterInputDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitInputDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitInputDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputDefinitionContext inputDefinition() throws RecognitionException {
		InputDefinitionContext _localctx = new InputDefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inputDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			reference();
			setState(172);
			match(OPERATOR_IN);
			setState(173);
			expression(0);
			setState(174);
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

	public static class ReferenceContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AutoComputeParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(AutoComputeParser.ID, i);
		}
		public List<TerminalNode> OPERATOR_SCOPE() { return getTokens(AutoComputeParser.OPERATOR_SCOPE); }
		public TerminalNode OPERATOR_SCOPE(int i) {
			return getToken(AutoComputeParser.OPERATOR_SCOPE, i);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_reference);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(ID);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(OPERATOR_SCOPE);
					setState(178);
					match(ID);
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterReferenceExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitReferenceExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitReferenceExpression(this);
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
		public TerminalNode OPERATOR_EXP() { return getToken(AutoComputeParser.OPERATOR_EXP, 0); }
		public TerminalNode OPERATOR_MUL() { return getToken(AutoComputeParser.OPERATOR_MUL, 0); }
		public TerminalNode OPERATOR_DIV() { return getToken(AutoComputeParser.OPERATOR_DIV, 0); }
		public TerminalNode OPERATOR_ADD() { return getToken(AutoComputeParser.OPERATOR_ADD, 0); }
		public TerminalNode OPERATOR_SUB() { return getToken(AutoComputeParser.OPERATOR_SUB, 0); }
		public TerminalNode OPERATOR_EQ() { return getToken(AutoComputeParser.OPERATOR_EQ, 0); }
		public TerminalNode OPERATOR_NEQ() { return getToken(AutoComputeParser.OPERATOR_NEQ, 0); }
		public TerminalNode OPERATOR_GT() { return getToken(AutoComputeParser.OPERATOR_GT, 0); }
		public TerminalNode OPERATOR_LT() { return getToken(AutoComputeParser.OPERATOR_LT, 0); }
		public TerminalNode OPERATOR_GTEQ() { return getToken(AutoComputeParser.OPERATOR_GTEQ, 0); }
		public TerminalNode OPERATOR_LTEQ() { return getToken(AutoComputeParser.OPERATOR_LTEQ, 0); }
		public TerminalNode OPERATOR_AND() { return getToken(AutoComputeParser.OPERATOR_AND, 0); }
		public TerminalNode OPERATOR_OR() { return getToken(AutoComputeParser.OPERATOR_OR, 0); }
		public InfixExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterInfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitInfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitInfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberExpressionContext extends ExpressionContext {
		public Token value;
		public TerminalNode NUM() { return getToken(AutoComputeParser.NUM, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(AutoComputeParser.BOOLEAN_LITERAL, 0); }
		public NumberExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterNumberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitNumberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitNumberExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionalExpressionContext extends ExpressionContext {
		public ExpressionContext check;
		public ExpressionContext first;
		public ExpressionContext second;
		public TerminalNode COLON() { return getToken(AutoComputeParser.COLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitConditionalExpression(this);
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
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterParenthesisExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitParenthesisExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitParenthesisExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Token operation;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OPERATOR_ADD() { return getToken(AutoComputeParser.OPERATOR_ADD, 0); }
		public TerminalNode OPERATOR_SUB() { return getToken(AutoComputeParser.OPERATOR_SUB, 0); }
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoComputeListener ) ((AutoComputeListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoComputeVisitor ) return ((AutoComputeVisitor<? extends T>)visitor).visitUnaryExpression(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ParenthesisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(185);
				match(T__0);
				setState(186);
				expression(0);
				setState(187);
				match(T__1);
				}
				break;
			case OPERATOR_ADD:
			case OPERATOR_SUB:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
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
				setState(190);
				expression(9);
				}
				break;
			case ID:
				{
				_localctx = new ReferenceExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				reference();
				}
				break;
			case BOOLEAN_LITERAL:
			case NUM:
				{
				_localctx = new NumberExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
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
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(195);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(196);
						((InfixExpressionContext)_localctx).operation = match(OPERATOR_EXP);
						setState(197);
						((InfixExpressionContext)_localctx).right = expression(9);
						}
						break;
					case 2:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(198);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(199);
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
						setState(200);
						((InfixExpressionContext)_localctx).right = expression(8);
						}
						break;
					case 3:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(201);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(202);
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
						setState(203);
						((InfixExpressionContext)_localctx).right = expression(7);
						}
						break;
					case 4:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(204);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(205);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPERATOR_EQ) | (1L << OPERATOR_NEQ) | (1L << OPERATOR_GT) | (1L << OPERATOR_LT) | (1L << OPERATOR_GTEQ) | (1L << OPERATOR_LTEQ))) != 0)) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(206);
						((InfixExpressionContext)_localctx).right = expression(6);
						}
						break;
					case 5:
						{
						_localctx = new InfixExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((InfixExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(207);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(208);
						((InfixExpressionContext)_localctx).operation = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==OPERATOR_AND || _la==OPERATOR_OR) ) {
							((InfixExpressionContext)_localctx).operation = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(209);
						((InfixExpressionContext)_localctx).right = expression(5);
						}
						break;
					case 6:
						{
						_localctx = new ConditionalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((ConditionalExpressionContext)_localctx).check = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(210);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(211);
						match(T__2);
						setState(212);
						((ConditionalExpressionContext)_localctx).first = expression(0);
						setState(213);
						match(COLON);
						setState(214);
						((ConditionalExpressionContext)_localctx).second = expression(4);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\7\2.\n\2\f\2\16\2\61\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\7\4B\n\4"+
		"\f\4\16\4E\13\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\4\7\4N\n\4\f\4\16\4Q\13"+
		"\4\3\4\7\4T\n\4\f\4\16\4W\13\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\5\6g\n\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7o\n\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\5\bx\n\b\3\b\3\b\3\t\3\t\3\t\7\t\177\n\t\f\t\16\t"+
		"\u0082\13\t\3\t\3\t\3\t\5\t\u0087\n\t\3\n\3\n\3\n\5\n\u008c\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\7\13\u0094\n\13\f\13\16\13\u0097\13\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u00a6\n\r\f\r\16\r\u00a9"+
		"\13\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u00b6\n"+
		"\17\f\17\16\17\u00b9\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u00c4\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00db\n\20\f\20"+
		"\16\20\u00de\13\20\3\20\2\3\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\b\4\2\6\6((\3\2\31\32\4\2\26\26((\3\2\33\34\3\2\37$\3\2\35\36\2"+
		"\u00eb\2#\3\2\2\2\4\64\3\2\2\2\6=\3\2\2\2\b^\3\2\2\2\nc\3\2\2\2\fj\3\2"+
		"\2\2\16r\3\2\2\2\20\u0086\3\2\2\2\22\u0088\3\2\2\2\24\u008f\3\2\2\2\26"+
		"\u009b\3\2\2\2\30\u00a1\3\2\2\2\32\u00ad\3\2\2\2\34\u00b2\3\2\2\2\36\u00c3"+
		"\3\2\2\2 \"\5\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$)\3\2\2\2"+
		"%#\3\2\2\2&(\5\30\r\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*/\3\2"+
		"\2\2+)\3\2\2\2,.\5\4\3\2-,\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60"+
		"\62\3\2\2\2\61/\3\2\2\2\62\63\7\2\2\3\63\3\3\2\2\2\64\65\7\t\2\2\65\66"+
		"\7)\2\2\66\67\7\20\2\2\678\5\6\4\289\7\21\2\29\5\3\2\2\2:<\5\b\5\2;:\3"+
		"\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@B\5\24\13\2A"+
		"@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2\2\2EC\3\2\2\2FH\5\n\6\2"+
		"GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO\3\2\2\2KI\3\2\2\2LN\5\f\7\2"+
		"ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PU\3\2\2\2QO\3\2\2\2RT\5\4\3\2"+
		"SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V[\3\2\2\2WU\3\2\2\2XZ\5\16\b"+
		"\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\7\3\2\2\2][\3\2\2\2^_\7"+
		")\2\2_`\7\25\2\2`a\t\2\2\2ab\7\r\2\2b\t\3\2\2\2cd\7\7\2\2df\7)\2\2eg\5"+
		"\26\f\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\r\2\2i\13\3\2\2\2jk\7)\2\2k"+
		"l\7\17\2\2ln\5\36\20\2mo\5\20\t\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\r"+
		"\2\2q\r\3\2\2\2rs\7\b\2\2st\7)\2\2tu\7\17\2\2uw\5\36\20\2vx\5\20\t\2w"+
		"v\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\r\2\2z\17\3\2\2\2{|\7\n\2\2|\u0080\7"+
		"\20\2\2}\177\5\22\n\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0087\7\21"+
		"\2\2\u0084\u0085\7\n\2\2\u0085\u0087\5\34\17\2\u0086{\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\21\3\2\2\2\u0088\u008b\5\36\20\2\u0089\u008a\7\24\2\2\u008a"+
		"\u008c\7\6\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\7\r\2\2\u008e\23\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0091"+
		"\7)\2\2\u0091\u0095\7\20\2\2\u0092\u0094\5\22\n\2\u0093\u0092\3\2\2\2"+
		"\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a\7\r\2\2"+
		"\u009a\25\3\2\2\2\u009b\u009c\7\22\2\2\u009c\u009d\5\36\20\2\u009d\u009e"+
		"\7\16\2\2\u009e\u009f\5\36\20\2\u009f\u00a0\7\23\2\2\u00a0\27\3\2\2\2"+
		"\u00a1\u00a2\7\f\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a7\7\20\2\2\u00a4"+
		"\u00a6\5\32\16\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7\21\2\2\u00ab\u00ac\7\r\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\5\34"+
		"\17\2\u00ae\u00af\7&\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\7\r\2\2\u00b1"+
		"\33\3\2\2\2\u00b2\u00b7\7)\2\2\u00b3\u00b4\7%\2\2\u00b4\u00b6\7)\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\35\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\b\20\1\2\u00bb\u00bc"+
		"\7\3\2\2\u00bc\u00bd\5\36\20\2\u00bd\u00be\7\4\2\2\u00be\u00c4\3\2\2\2"+
		"\u00bf\u00c0\t\3\2\2\u00c0\u00c4\5\36\20\13\u00c1\u00c4\5\34\17\2\u00c2"+
		"\u00c4\t\4\2\2\u00c3\u00ba\3\2\2\2\u00c3\u00bf\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00dc\3\2\2\2\u00c5\u00c6\f\n\2\2\u00c6"+
		"\u00c7\7\'\2\2\u00c7\u00db\5\36\20\13\u00c8\u00c9\f\t\2\2\u00c9\u00ca"+
		"\t\5\2\2\u00ca\u00db\5\36\20\n\u00cb\u00cc\f\b\2\2\u00cc\u00cd\t\3\2\2"+
		"\u00cd\u00db\5\36\20\t\u00ce\u00cf\f\7\2\2\u00cf\u00d0\t\6\2\2\u00d0\u00db"+
		"\5\36\20\b\u00d1\u00d2\f\6\2\2\u00d2\u00d3\t\7\2\2\u00d3\u00db\5\36\20"+
		"\7\u00d4\u00d5\f\5\2\2\u00d5\u00d6\7\5\2\2\u00d6\u00d7\5\36\20\2\u00d7"+
		"\u00d8\7\25\2\2\u00d8\u00d9\5\36\20\6\u00d9\u00db\3\2\2\2\u00da\u00c5"+
		"\3\2\2\2\u00da\u00c8\3\2\2\2\u00da\u00cb\3\2\2\2\u00da\u00ce\3\2\2\2\u00da"+
		"\u00d1\3\2\2\2\u00da\u00d4\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\37\3\2\2\2\u00de\u00dc\3\2\2\2\27#)/=C"+
		"IOU[fnw\u0080\u0086\u008b\u0095\u00a7\u00b7\u00c3\u00da\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}