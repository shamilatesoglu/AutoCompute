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

import msa.lang.autocompute.ds.Pair;
import msa.lang.autocompute.ast.node.CompilationUnitASTNode;
import msa.lang.autocompute.semantics.ScopeGraph;
import msa.lang.autocompute.semantics.SymbolTable;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class AutoComputeInterpreter {

    private final DependencyGraph dependencyGraph;
    private final SymbolTable symbolTable;
    private final ScopeGraph scopeGraph;

    private final PrintStream out;

    public AutoComputeInterpreter(SymbolTable symbolTable, ScopeGraph scopeGraph) {
        this.symbolTable = symbolTable;
        this.dependencyGraph = new DependencyGraph();
        this.scopeGraph = scopeGraph;
        try {
            this.out = new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new InternalError("VM does not support mandatory encoding UTF-8");
        }
    }

    public AutoComputeInterpreter(SymbolTable symbolTable, ScopeGraph scopeGraph, PrintStream out) {
        this.symbolTable = symbolTable;
        this.dependencyGraph = new DependencyGraph();
        this.scopeGraph = scopeGraph;
        this.out = out;
    }

    public void interpret(CompilationUnitASTNode root) {
        DependencyResolvingASTVisitor dependencyResolvingASTVisitor = new DependencyResolvingASTVisitor(dependencyGraph, symbolTable);
        dependencyResolvingASTVisitor.visit(root);

        ExecutorASTVisitor executor = new ExecutorASTVisitor(dependencyGraph, symbolTable, scopeGraph);
        executor.visit(root);

        printResults(executor.getInferred(), executor.getFiltered());
    }

    private void printResults(Map<String, Double> inferred, Map<String, Pair<Double, String>> filtered) {
        for (String reference : inferred.keySet()) {
            Double val = inferred.get(reference);
            out.printf("%s = %f.%n", reference, val);
        }

        for (String reference : filtered.keySet()) {
            String rationale = filtered.get(reference).y;
            out.printf("%s = NaN, %s.%n", reference, rationale);
        }
    }
}
