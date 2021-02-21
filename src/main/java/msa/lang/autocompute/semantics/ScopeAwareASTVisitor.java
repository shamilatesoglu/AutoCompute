package msa.lang.autocompute.semantics;

import msa.lang.autocompute.ast.AutoComputeAbstractSyntaxTreeVisitor;
import msa.lang.autocompute.ast.node.*;
import msa.lang.autocompute.cst.AutoComputeParser;

import java.util.Arrays;

public abstract class ScopeAwareASTVisitor<T> extends AutoComputeAbstractSyntaxTreeVisitor<T> {
    private Scope currentScope;
    private Scope globalScope;

    public ScopeAwareASTVisitor() {

    }

    /**
     * Prefixes scope resolution operator and current scope name to the id of the variable.
     *
     * @param id Name of the variable. Should not contain scope resolution operator, otherwise wouldn't work as intended.
     * @return Full reference to the variable.
     */
    public String getFullReference(String id) {
        return getFullReference(id, getCurrentScope());
    }

    protected String getScopeOperator() {
        String scopeOperator = AutoComputeParser.VOCABULARY.getLiteralName(AutoComputeParser.OPERATOR_SCOPE);
        scopeOperator = scopeOperator.substring(1, scopeOperator.length() - 1);
        return scopeOperator;
    }

    public String getFullReference(String id, Scope scope) {
        String scopeOperator = getScopeOperator();
        String currentScopeName = scope.getReference();

        return currentScopeName == null ? id : currentScopeName + scopeOperator + id;
    }

    public String getName(String reference) {
        String scopeOperator = getScopeOperator();
        String[] scopes = reference.split(scopeOperator);
        return scopes.length > 1 ? scopes[scopes.length - 1] : scopes[0];
    }

    public String getParent(String reference) {
        String scopeOperator = getScopeOperator();
        String[] scopes = reference.split(scopeOperator);
        return scopes.length > 1 ? String.join(scopeOperator, Arrays.copyOfRange(scopes, 0, scopes.length - 1)) : null;
    }

    public Scope getCurrentScope() {
        return currentScope;
    }

    public void enterScope(Scope newScope) {
        this.currentScope = newScope;
    }

    public void exitScope(Scope newScope) {
        this.currentScope = newScope;
    }

    public Scope getGlobalScope() {
        return globalScope;
    }

    public void setGlobalScope(Scope globalScope) {
        this.globalScope = globalScope;
    }

    @Override
    public T visit(CompilationUnitASTNode node) {

        setGlobalScope(new Scope(null, null));
        enterScope(getGlobalScope());

        for (EntityASTNode entity : node.getEntities()) {
            visit(entity);
        }

        enterScope(getGlobalScope());

        for (ComputeCallASTNode computeCall : node.getComputeCalls()) {
            visit(computeCall);
        }

        return null;
    }

    @Override
    public T visit(ComputeCallASTNode node) {
        visit(node.getReference());

        String reference = node.getReference().getReferencedId();

        enterScope(new Scope(reference, getCurrentScope()));

        for (InputDefinitionASTNode inputDefinitionASTNode : node.getInputs()) {
            visit(inputDefinitionASTNode);
        }

        exitScope(getCurrentScope().getEnclosingScope());

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

        // Scope will be dynamically bounded at runtime.
        // So, no checking for references. And no visiting beyond this point.
        // You have to override this method to evaluate expressions at runtime.

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

        String reference = getFullReference(name);
        enterScope(new Scope(reference, getCurrentScope()));

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

        exitScope(getCurrentScope().getEnclosingScope());

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
