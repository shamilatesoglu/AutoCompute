// Generated from D:/Library/Repos/Unnamed/grammar\Unnamed.g4 by ANTLR 4.9.1
package msa.language.unnamed.lang.cst;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link UnnamedParser}.
 */
public interface UnnamedListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(UnnamedParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(UnnamedParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#entityDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEntityDefinition(UnnamedParser.EntityDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#entityDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEntityDefinition(UnnamedParser.EntityDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#entityBody}.
	 * @param ctx the parse tree
	 */
	void enterEntityBody(UnnamedParser.EntityBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#entityBody}.
	 * @param ctx the parse tree
	 */
	void exitEntityBody(UnnamedParser.EntityBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(UnnamedParser.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(UnnamedParser.PropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(UnnamedParser.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(UnnamedParser.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#localVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDefinition(UnnamedParser.LocalVariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#localVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDefinition(UnnamedParser.LocalVariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#outputDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOutputDefinition(UnnamedParser.OutputDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#outputDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOutputDefinition(UnnamedParser.OutputDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#given}.
	 * @param ctx the parse tree
	 */
	void enterGiven(UnnamedParser.GivenContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#given}.
	 * @param ctx the parse tree
	 */
	void exitGiven(UnnamedParser.GivenContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(UnnamedParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(UnnamedParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#constraintsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintsDefinition(UnnamedParser.ConstraintsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#constraintsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintsDefinition(UnnamedParser.ConstraintsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(UnnamedParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(UnnamedParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#computeCall}.
	 * @param ctx the parse tree
	 */
	void enterComputeCall(UnnamedParser.ComputeCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#computeCall}.
	 * @param ctx the parse tree
	 */
	void exitComputeCall(UnnamedParser.ComputeCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#inputDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputDefinition(UnnamedParser.InputDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#inputDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputDefinition(UnnamedParser.InputDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link UnnamedParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(UnnamedParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link UnnamedParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(UnnamedParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReferenceExpression(UnnamedParser.ReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReferenceExpression(UnnamedParser.ReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpression(UnnamedParser.InfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpression(UnnamedParser.InfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(UnnamedParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(UnnamedParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(UnnamedParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(UnnamedParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(UnnamedParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(UnnamedParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(UnnamedParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link UnnamedParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(UnnamedParser.UnaryExpressionContext ctx);
}