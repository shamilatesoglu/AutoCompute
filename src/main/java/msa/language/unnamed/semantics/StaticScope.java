package msa.language.unnamed.semantics;

public class StaticScope {

    private final StaticScope enclosingScope;

    private final String scopeName;

    public StaticScope(String name, StaticScope enclosingScope) {
        this.scopeName = name;
        this.enclosingScope = enclosingScope;
    }

    public StaticScope getEnclosingScope() {
        return enclosingScope;
    }

    public String getScopeName() {
        return scopeName;
    }
}
