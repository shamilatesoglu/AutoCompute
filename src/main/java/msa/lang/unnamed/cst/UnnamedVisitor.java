// Generated from D:/Library/Repos/Unnamed/grammar\Unnamed.g4 by ANTLR 4.9.1
package msa.lang.unnamed.cst;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link UnnamedParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface UnnamedVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link UnnamedParser#compilationUnit}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCompilationUnit(UnnamedParser.CompilationUnitContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#entityDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEntityDefinition(UnnamedParser.EntityDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#entityBody}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEntityBody(UnnamedParser.EntityBodyContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#propertyDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPropertyDefinition(UnnamedParser.PropertyDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#inputDeclaration}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInputDeclaration(UnnamedParser.InputDeclarationContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#localVariableDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLocalVariableDefinition(UnnamedParser.LocalVariableDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#outputDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitOutputDefinition(UnnamedParser.OutputDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#given}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitGiven(UnnamedParser.GivenContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#constraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstraint(UnnamedParser.ConstraintContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#constraintsDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstraintsDefinition(UnnamedParser.ConstraintsDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#rangeExpression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRangeExpression(UnnamedParser.RangeExpressionContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#computeCall}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitComputeCall(UnnamedParser.ComputeCallContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#inputDefinition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInputDefinition(UnnamedParser.InputDefinitionContext ctx);

    /**
     * Visit a parse tree produced by {@link UnnamedParser#reference}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReference(UnnamedParser.ReferenceContext ctx);

    /**
     * Visit a parse tree produced by the {@code referenceExpression}
     * labeled alternative in {@link UnnamedParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReferenceExpression(UnnamedParser.ReferenceExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code infixExpression}
     * labeled alternative in {@link UnnamedParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitInfixExpression(UnnamedParser.InfixExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code numberExpression}
     * labeled alternative in {@link UnnamedParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNumberExpression(UnnamedParser.NumberExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code conditionalExpression}
     * labeled alternative in {@link UnnamedParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConditionalExpression(UnnamedParser.ConditionalExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code parenthesisExpression}
     * labeled alternative in {@link UnnamedParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitParenthesisExpression(UnnamedParser.ParenthesisExpressionContext ctx);

    /**
     * Visit a parse tree produced by the {@code unaryExpression}
     * labeled alternative in {@link UnnamedParser#expression}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitUnaryExpression(UnnamedParser.UnaryExpressionContext ctx);
}