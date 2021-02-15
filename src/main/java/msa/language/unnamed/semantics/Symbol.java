package msa.language.unnamed.semantics;

public class Symbol {
    private final Type type;
    private String name;

    public Symbol(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public enum Type {
        ENTITY,
        CONSTRAINT_SET,
        INPUT,
        OUTPUT,
        INTERMEDIATE
    }
}
