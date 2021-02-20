package msa.language.unnamed.runtime;

import msa.language.unnamed.ast.node.CompilationUnitASTNode;
import msa.language.unnamed.ds.Pair;
import msa.language.unnamed.semantics.SymbolTable;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class UnnamedInterpreter {

    private final DependencyGraph dependencyGraph;

    private final SymbolTable symbolTable;

    private final PrintStream out;

    public UnnamedInterpreter(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.dependencyGraph = new DependencyGraph();
        try {
            this.out = new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new InternalError("VM does not support mandatory encoding UTF-8");
        }
    }

    public UnnamedInterpreter(SymbolTable symbolTable, PrintStream out) {
        this.symbolTable = symbolTable;
        this.dependencyGraph = new DependencyGraph();
        this.out = out;
    }

    public void interpret(CompilationUnitASTNode root) {
        DependencyResolvingASTVisitor dependencyResolvingASTVisitor = new DependencyResolvingASTVisitor(dependencyGraph, symbolTable);
        dependencyResolvingASTVisitor.visit(root);

        ExecutorASTVisitor executor = new ExecutorASTVisitor(dependencyGraph, symbolTable);
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
