package msa.language.unnamed;

import msa.language.unnamed.lang.ast.UnnamedAbstractSyntaxTreeBuilder;
import msa.language.unnamed.lang.ast.node.UnnamedAbstractSyntaxTreeNode;
import msa.language.unnamed.lang.cst.UnnamedLexer;
import msa.language.unnamed.lang.cst.UnnamedParser;
import msa.language.unnamed.utils.FileUtils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class UnnamedInterpreter {
    private static final UnnamedInterpreter INSTANCE = new UnnamedInterpreter();

    public static UnnamedInterpreter getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {

        String source = FileUtils.readString(args[0]);
        getInstance().interpret(source);

    }

    public void interpret(String source) {
        UnnamedLexer lexer = new UnnamedLexer(CharStreams.fromString(source));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        UnnamedParser parser = new UnnamedParser(tokenStream);
        UnnamedParser.CompilationUnitContext cst = parser.compilationUnit();
        UnnamedAbstractSyntaxTreeNode root = new UnnamedAbstractSyntaxTreeBuilder().visitCompilationUnit(cst);

        assert root != null;
    }

}
