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

package msa.lang.autocompute;

import msa.lang.autocompute.ast.AutoComputeAbstractSyntaxTreeBuilder;
import msa.lang.autocompute.ast.node.CompilationUnitASTNode;
import msa.lang.autocompute.cst.AutoComputeLexer;
import msa.lang.autocompute.cst.AutoComputeParser;
import msa.lang.autocompute.runtime.DependencyGraph;
import msa.lang.autocompute.runtime.AutoComputeInterpreter;
import msa.lang.autocompute.semantics.SemanticAnalyser;
import msa.lang.autocompute.semantics.SymbolTable;
import msa.lang.autocompute.utils.ExecutionTimer;
import msa.lang.autocompute.utils.FileUtils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import picocli.CommandLine;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Callable;


public class AutoCompute implements Callable<Integer> {

    /// Command line parameters
    @CommandLine.Option(names = {"-t"}, description = "Prints the execution time.")
    private boolean printExecutionTime;

    @CommandLine.Parameters(index = "0", description = "The source file to interpret.")
    // TODO: Interpreter maybe should be able to handle multiple sources?
    private String filepath;
    ///

    // TODO: Interpreter should retain state, and be able to execute codes in succession.
    private SymbolTable symbolTable;
    private DependencyGraph dependencyGraph;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new AutoCompute()).execute(args);
        System.exit(exitCode);
    }

    public AutoCompute() {
    }

    public static void executeAll(String source, PrintStream out) {
        // Lexical Analysis
        AutoComputeLexer lexer = new AutoComputeLexer(CharStreams.fromString(source));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        AutoComputeParser parser = new AutoComputeParser(tokenStream);
        AutoComputeParser.CompilationUnitContext cst = parser.compilationUnit();
        CompilationUnitASTNode root = (CompilationUnitASTNode) new AutoComputeAbstractSyntaxTreeBuilder().visitCompilationUnit(cst);


        // Semantic Analysis
        SemanticAnalyser semanticAnalyser = new SemanticAnalyser();
        semanticAnalyser.visit(root);

        // Interpretation
        AutoComputeInterpreter interpreter = new AutoComputeInterpreter(semanticAnalyser.getSymbolTable(), semanticAnalyser.getScopeGraph(), out);
        interpreter.interpret(root);
    }

    public static void executeAll(String source) {
        try {
            PrintStream out = new PrintStream(new FileOutputStream(FileDescriptor.out), true, "UTF-8");
            executeAll(source, out);
        } catch (UnsupportedEncodingException e) {
            throw new InternalError("VM does not support mandatory encoding UTF-8");
        }
    }

    private int runFromCommandLine() {

        long executionTime = new ExecutionTimer() {
            @Override
            public void execute() {
                String source = FileUtils.readString(filepath);
                AutoCompute.executeAll(source);
            }
        }.start();

        if (printExecutionTime) {
            System.out.printf("Execution took %f seconds%n", executionTime / 1000.0);
        }

        return 0;
    }


    @Override
    public Integer call() throws Exception {
        return runFromCommandLine();
    }
}
