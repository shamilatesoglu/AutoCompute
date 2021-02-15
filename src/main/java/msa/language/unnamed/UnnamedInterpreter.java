package msa.language.unnamed;

import msa.language.unnamed.lang.ast.UnnamedAbstractSyntaxTreeBuilder;
import msa.language.unnamed.lang.ast.node.CompilationUnitASTNode;
import msa.language.unnamed.lang.ast.node.UnnamedAbstractSyntaxTreeNode;
import msa.language.unnamed.lang.cst.UnnamedLexer;
import msa.language.unnamed.lang.cst.UnnamedParser;
import msa.language.unnamed.lang.semantics.SemanticAnalyser;
import msa.language.unnamed.utils.FileUtils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class UnnamedInterpreter {

    public UnnamedInterpreter() {
    }

    public static void main(String[] args) {

        String source = FileUtils.readString(args[0]);
        new UnnamedInterpreter().interpret(source);

    }

    public void interpret(String source) {
        UnnamedLexer lexer = new UnnamedLexer(CharStreams.fromString(source));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        UnnamedParser parser = new UnnamedParser(tokenStream);
        UnnamedParser.CompilationUnitContext cst = parser.compilationUnit();
        CompilationUnitASTNode root = (CompilationUnitASTNode) new UnnamedAbstractSyntaxTreeBuilder().visitCompilationUnit(cst);

        SemanticAnalyser semanticAnalyser = new SemanticAnalyser();
        semanticAnalyser.visit(root);
    }

}
