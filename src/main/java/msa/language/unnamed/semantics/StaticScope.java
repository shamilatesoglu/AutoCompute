package msa.language.unnamed.semantics;

public class StaticScope {

    private final StaticScope enclosingScope;

    private final String reference;

    public StaticScope(String reference, StaticScope enclosingScope) {
        this.reference = reference;
        this.enclosingScope = enclosingScope;
    }

    public StaticScope getEnclosingScope() {
        return enclosingScope;
    }

    public String getReference() {
        return reference;
    }
}
