package msa.language.unnamed.semantics;

public class Scope {

    private final Scope enclosingScope;

    private final String reference;

    public Scope(String reference, Scope enclosingScope) {
        this.reference = reference;
        this.enclosingScope = enclosingScope;
    }

    public Scope getEnclosingScope() {
        return enclosingScope;
    }

    public String getReference() {
        return reference;
    }

    @Override
    public int hashCode() {
        return reference == null ? super.hashCode() : reference.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Scope) {
            Scope other = (Scope) obj;
            return reference == null ? other.reference == null : other.reference.equals(reference);
        }
        return false;
    }

    @Override
    public String toString() {
        return reference;
    }
}
