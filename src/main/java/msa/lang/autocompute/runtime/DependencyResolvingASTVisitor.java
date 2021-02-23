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

package msa.lang.autocompute.runtime;

import msa.lang.autocompute.ast.node.*;
import msa.lang.autocompute.semantics.ScopeAwareASTVisitor;
import msa.lang.autocompute.semantics.SymbolTable;

public class DependencyResolvingASTVisitor extends ScopeAwareASTVisitor<Void> {

    private final DependencyGraph dependencyGraph;

    private final SymbolTable symbolTable;

    private IdentifiableASTNode definingASTNode;

    public DependencyResolvingASTVisitor(DependencyGraph dependencyGraph, SymbolTable symbolTable) {
        this.dependencyGraph = dependencyGraph;
        this.symbolTable = symbolTable;
    }

    @Override
    public Void visit(VariableDefinitionASTNode node) {
        definingASTNode = node;

        return super.visit(node);
    }

    @Override
    public Void visit(OutputDefinitionASTNode node) {
        definingASTNode = node;

        return super.visit(node);
    }

    @Override
    public Void visit(ReferencingASTNode node) {
        String definingName = getFullReference(definingASTNode.getId());
        String reference = getFullReference(node.getReferencedId());

        dependencyGraph.addDependency(definingName, reference);

        return super.visit(node);
    }

    @Override
    public Void visit(ComputeCallASTNode node) {
        return null;
    }
}
