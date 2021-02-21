// Generated from D:/Library/Repos/Unnamed/grammar\AutoCompute.g4 by ANTLR 4.9.1
package msa.lang.autocompute.cst;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AutoComputeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AutoComputeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(AutoComputeParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#entityDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityDefinition(AutoComputeParser.EntityDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#entityBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntityBody(AutoComputeParser.EntityBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#propertyDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyDefinition(AutoComputeParser.PropertyDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#inputDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDeclaration(AutoComputeParser.InputDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#localVariableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDefinition(AutoComputeParser.LocalVariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#outputDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputDefinition(AutoComputeParser.OutputDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#given}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGiven(AutoComputeParser.GivenContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(AutoComputeParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#constraintsDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintsDefinition(AutoComputeParser.ConstraintsDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(AutoComputeParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#computeCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComputeCall(AutoComputeParser.ComputeCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#inputDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputDefinition(AutoComputeParser.InputDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AutoComputeParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(AutoComputeParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceExpression(AutoComputeParser.ReferenceExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpression(AutoComputeParser.InfixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberExpression(AutoComputeParser.NumberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression(AutoComputeParser.ConditionalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExpression(AutoComputeParser.ParenthesisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression}
	 * labeled alternative in {@link AutoComputeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(AutoComputeParser.UnaryExpressionContext ctx);
}