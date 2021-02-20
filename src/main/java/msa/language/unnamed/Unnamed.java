package msa.language.unnamed;

import msa.language.unnamed.ast.UnnamedAbstractSyntaxTreeBuilder;
import msa.language.unnamed.ast.node.CompilationUnitASTNode;
import msa.language.unnamed.cst.UnnamedLexer;
import msa.language.unnamed.cst.UnnamedParser;
import msa.language.unnamed.runtime.DependencyGraph;
import msa.language.unnamed.runtime.UnnamedInterpreter;
import msa.language.unnamed.semantics.SemanticAnalyser;
import msa.language.unnamed.semantics.SymbolTable;
import msa.language.unnamed.utils.ExecutionTimer;
import msa.language.unnamed.utils.FileUtils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import picocli.CommandLine;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Callable;


public class Unnamed implements Callable<Integer> {

    /// Command line parameters
    @CommandLine.Option(names = {"-t"}, description = "Prints the execution time.")
    private boolean printExecutionTime;

    @CommandLine.Parameters(index = "0", description = "The source file to interpret.")
    // TODO: Interpreter maybe should be able to handle multiple sources?
    private String filepath;
    ///

    private SymbolTable symbolTable;
    private DependencyGraph dependencyGraph;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new Unnamed()).execute(args);
        System.exit(exitCode);
    }

    public Unnamed() {
    }

    public void execute(String source) {
        // TODO: Interpreter should retain state, and be able to execute codes in succession.
    }

    public static void executeAll(String source, PrintStream out) {
        // Lexical Analysis
        UnnamedLexer lexer = new UnnamedLexer(CharStreams.fromString(source));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        UnnamedParser parser = new UnnamedParser(tokenStream);
        UnnamedParser.CompilationUnitContext cst = parser.compilationUnit();
        CompilationUnitASTNode root = (CompilationUnitASTNode) new UnnamedAbstractSyntaxTreeBuilder().visitCompilationUnit(cst);


        // Semantic Analysis
        SemanticAnalyser semanticAnalyser = new SemanticAnalyser();
        semanticAnalyser.visit(root);

        // Interpretation
        UnnamedInterpreter interpreter = new UnnamedInterpreter(semanticAnalyser.getSymbolTable(), semanticAnalyser.getScopeGraph(), out);
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
                Unnamed.executeAll(source);
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
