// Generated from D:/Library/Repos/Unnamed/grammar\AutoCompute.g4 by ANTLR 4.9.1
package msa.lang.autocompute.cst;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AutoComputeParser}.
 */
public interface AutoComputeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(AutoComputeParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(AutoComputeParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#entityDefinition}.
	 * @param ctx the parse tree
	 */
	void enterEntityDefinition(AutoComputeParser.EntityDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#entityDefinition}.
	 * @param ctx the parse tree
	 */
	void exitEntityDefinition(AutoComputeParser.EntityDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#entityBody}.
	 * @param ctx the parse tree
	 */
	void enterEntityBody(AutoComputeParser.EntityBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#entityBody}.
	 * @param ctx the parse tree
	 */
	void exitEntityBody(AutoComputeParser.EntityBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPropertyDefinition(AutoComputeParser.PropertyDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#propertyDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPropertyDefinition(AutoComputeParser.PropertyDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInputDeclaration(AutoComputeParser.InputDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#inputDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInputDeclaration(AutoComputeParser.InputDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#localVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDefinition(AutoComputeParser.LocalVariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#localVariableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDefinition(AutoComputeParser.LocalVariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#outputDefinition}.
	 * @param ctx the parse tree
	 */
	void enterOutputDefinition(AutoComputeParser.OutputDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#outputDefinition}.
	 * @param ctx the parse tree
	 */
	void exitOutputDefinition(AutoComputeParser.OutputDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#given}.
	 * @param ctx the parse tree
	 */
	void enterGiven(AutoComputeParser.GivenContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#given}.
	 * @param ctx the parse tree
	 */
	void exitGiven(AutoComputeParser.GivenContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(AutoComputeParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(AutoComputeParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#constraintsDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintsDefinition(AutoComputeParser.ConstraintsDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#constraintsDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintsDefinition(AutoComputeParser.ConstraintsDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void enterRangeExpression(AutoComputeParser.RangeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#rangeExpression}.
	 * @param ctx the parse tree
	 */
	void exitRangeExpression(AutoComputeParser.RangeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#computeCall}.
	 * @param ctx the parse tree
	 */
	void enterComputeCall(AutoComputeParser.ComputeCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#computeCall}.
	 * @param ctx the parse tree
	 */
	void exitComputeCall(AutoComputeParser.ComputeCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#inputDefinition}.
	 * @param ctx the parse tree
	 */
	void enterInputDefinition(AutoComputeParser.InputDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#inputDefinition}.
	 * @param ctx the parse tree
	 */
	void exitInputDefinition(AutoComputeParser.InputDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AutoComputeParser#reference}.
	 * @param ctx the parse tree
	 */
	void enterReference(AutoComputeParser.ReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link AutoComputeParser#reference}.
	 * @param ctx the parse tree
	 */
	void exitReference(AutoComputeParser.ReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReferenceExpression(AutoComputeParser.ReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReferenceExpression(AutoComputeParser.ReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpression(AutoComputeParser.InfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpression(AutoComputeParser.InfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(AutoComputeParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(AutoComputeParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(AutoComputeParser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(AutoComputeParser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(AutoComputeParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(AutoComputeParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(AutoComputeParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(AutoComputeParser.UnaryExpressionContext ctx);
}