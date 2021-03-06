// Copyright (c) 2021 M. Samil Atesoglu
//
// Permission is hereby granted, free of charge, to any person obtaining a copy of
// this software and associated documentation files (the "Software"), to deal in
// the Software without restriction, including without limitation the rights to
// use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
// the Software, and to permit persons to whom the Software is furnished to do so,
// subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
// FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
// COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
// IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
// CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

package msa.lang.autocompute.semantics;

import msa.lang.autocompute.ast.node.*;
import msa.lang.autocompute.semantics.exceptions.AlreadyDefinedException;
import msa.lang.autocompute.semantics.exceptions.UndefinedSymbolException;

import java.util.ArrayDeque;
import java.util.Queue;

public class SemanticAnalyser extends ScopeAwareASTVisitor<Void> {

    private final SymbolTable symbolTable;

    private final ScopeGraph scopeGraph;

    private final Queue<String> referencesMade;

    /**
     * Analyses the program structure to catch possible semantic errors
     */
    public SemanticAnalyser() {
        symbolTable = new SymbolTable();
        scopeGraph = new ScopeGraph();
        referencesMade = new ArrayDeque<>();
    }

    private void declare(Symbol symbol) {
        declare(symbol, false);
    }

    private void declare(Symbol symbol, boolean allowRedefinition) {
        if ((!allowRedefinition) && symbolTable.contains(symbol.getName())) {
            throw new AlreadyDefinedException(symbol.getName(), symbolTable.lookup(symbol.getName()).getName());
        } else {
            symbolTable.insert(symbol);
        }
    }

    @Override
    public void enterScope(Scope nestedScope) {
        Scope parentScope = getCurrentScope();
        super.enterScope(nestedScope);
        scopeGraph.addScope(parentScope, nestedScope);
    }

    @Override
    public Void visit(CompilationUnitASTNode node) {
        super.visit(node);

        // Check for undefined references after constructing the symbol table.
        while (!referencesMade.isEmpty()) {
            String reference = referencesMade.poll();
            if (!symbolTable.contains(reference)) {
                throw new UndefinedSymbolException(reference);
            }
        }

        return null;
    }

    @Override
    public Void visit(ConstraintSetASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol);

        return super.visit(node);
    }

    @Override
    public Void visit(EntityASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol);

        return super.visit(node);
    }

    @Override
    public Void visit(InputDeclarationASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol);

        return null;
    }

    @Override
    public Void visit(VariableDefinitionASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol, true);

        return super.visit(node);
    }

    @Override
    public Void visit(OutputDefinitionASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol);

        return super.visit(node);
    }

    @Override
    public Void visit(ReferencingASTNode node) {

        // Add to a queue to check for later.
        // TODO: Multiples of same references may exist, maybe use a set?
        referencesMade.add(getFullReference(node.getReferencedId()));

        return null;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public ScopeGraph getScopeGraph() {
        return scopeGraph;
    }
}
