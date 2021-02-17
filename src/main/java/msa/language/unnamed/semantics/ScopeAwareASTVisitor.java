package msa.language.unnamed.semantics;

import msa.language.unnamed.ast.UnnamedAbstractSyntaxTreeVisitor;
import msa.language.unnamed.ast.node.*;
import msa.language.unnamed.cst.UnnamedParser;
import msa.language.unnamed.semantics.exceptions.AlreadyDefinedException;
import msa.language.unnamed.semantics.exceptions.UndefinedSymbolException;

import java.util.ArrayDeque;
import java.util.Queue;

public abstract class ScopeAwareASTVisitor<T> extends UnnamedAbstractSyntaxTreeVisitor<T> {
    private StaticScope currentScope;
    private StaticScope globalScope;

    public ScopeAwareASTVisitor() {

    }

    /**
     * Prefixes scope resolution operator and current scope name to the id of the variable.
     * @param id Name of the variable. Should not contain scope resolution operator, otherwise wouldn't work as intended.
     * @return Full reference to the variable.
     */
    public String getReferenceForId(String id) {
        String scopeOperator = UnnamedParser.VOCABULARY.getLiteralName(UnnamedParser.OPERATOR_SCOPE);
        scopeOperator = scopeOperator.substring(1, scopeOperator.length() - 1);
        String currentScopeName = getCurrentScope().getReference();

        return currentScopeName == null ? id : currentScopeName + scopeOperator + id;
    }

    public StaticScope getCurrentScope() {
        return currentScope;
    }

    public void setCurrentScope(StaticScope currentScope) {
        this.currentScope = currentScope;
    }

    public StaticScope getGlobalScope() {
        return globalScope;
    }

    public void setGlobalScope(StaticScope globalScope) {
        this.globalScope = globalScope;
    }

    @Override
    public T visit(CompilationUnitASTNode node) {

        setGlobalScope(new StaticScope(null, null));
        setCurrentScope(getGlobalScope());


        for (EntityASTNode entity : node.getEntities()) {
            visit(entity);
        }

        setCurrentScope(getGlobalScope());

        for (ComputeCallASTNode computeCall : node.getComputeCalls()) {
            visit(computeCall);
        }

        return null;
    }

    @Override
    public T visit(ComputeCallASTNode node) {
        visit(node.getReference());

        String reference = node.getReference().getReferencedId();

        setCurrentScope(new StaticScope(reference, getCurrentScope()));

        for (InputDefinitionASTNode inputDefinitionASTNode : node.getInputs()) {
            visit(inputDefinitionASTNode);
        }

        return null;
    }

    @Override
    public T visit(ConditionalExpressionASTNode node) {
        visit(node.getCheck());
        visit(node.getFirst());
        visit(node.getSecond());
        return null;
    }

    @Override
    public T visit(ConstraintASTNode node) {

        // TODO: Scope will be dynamically bounded.
        //  So, no checking for references.
        //  visit(node.getConstraint());

        return null;
    }
    @Override
    public T visit(ConstraintSetASTNode node) {

        for (ConstraintASTNode constraint : node.getConstraints()) {
            visit(constraint);
        }

        return null;
    }

    @Override
    public T visit(EntityASTNode node) {
        String name = node.getId();

        setCurrentScope(new StaticScope(getReferenceForId(name), getCurrentScope()));

        return visit(node.getBlockASTNode());
    }

    @Override
    public T visit(EntityBodyASTNode node) {

        for (ConstraintSetASTNode constraintSet : node.getConstraintSets()) {
            visit(constraintSet);
        }

        for (PropertyASTNode property : node.getProperties()) {
            visit(property);
        }

        for (InputDeclarationASTNode input : node.getInputs()) {
            visit(input);
        }

        for (VariableDefinitionASTNode local : node.getLocals()) {
            visit(local);
        }

        for (EntityASTNode entity : node.getEntities()) {
            visit(entity);
        }

        for (OutputDefinitionASTNode output : node.getOutputs()) {
            visit(output);
        }

        setCurrentScope(getCurrentScope().getEnclosingScope());

        return null;
    }

    @Override
    public T visit(GivenASTNode node) {

        for (ConstraintASTNode constraint : node.getConstraints()) {
            visit(constraint);
        }

        return null;
    }


    @Override
    public T visit(InfixExpressionASTNode node) {
        visit(node.getLeft());
        visit(node.getRight());

        return null;
    }

    @Override
    public T visit(InputDeclarationASTNode node) {

        return null;
    }



    @Override
    public T visit(InputDefinitionASTNode node) {

        visit(node.getReference());
        visit(node.getExpression());

        return null;
    }

    @Override
    public T visit(VariableDefinitionASTNode node) {

        visit(node.getExpressionASTNode());
        visit(node.getGivenASTNode());

        return null;
    }

    @Override
    public T visit(NegationASTNode node) {
        visit(node.getInnerNode());
        return null;
    }

    @Override
    public T visit(NumberASTNode node) {
        return null;
    }

    @Override
    public T visit(OutputDefinitionASTNode node) {

        visit(node.getExpressionASTNode());
        visit(node.getGivenASTNode());

        return null;
    }

    @Override
    public T visit(PropertyASTNode node) {


        return null;
    }

    @Override
    public T visit(ReferencingASTNode node) {


        return null;
    }
}
