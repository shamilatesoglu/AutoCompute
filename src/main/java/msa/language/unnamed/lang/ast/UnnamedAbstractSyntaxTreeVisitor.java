package msa.language.unnamed.lang.ast;

import msa.language.unnamed.lang.ast.node.InfixExpressionASTNode;

public abstract class UnnamedAbstractSyntaxTreeVisitor<T> {
    public abstract T visit(InfixExpressionASTNode node);
}
