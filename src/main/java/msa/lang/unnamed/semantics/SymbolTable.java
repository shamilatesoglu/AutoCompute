package msa.lang.unnamed.semantics;

import java.util.LinkedHashMap;
import java.util.Map;

public class SymbolTable {
    private final Map<String, Symbol> map;


    public SymbolTable() {
        map = new LinkedHashMap<>();
    }

    public Symbol lookup(String name) {
        if (contains(name)) {
            return map.get(name);
        } else {
            return null;
        }
    }

    public boolean contains(String name) {
        return map.containsKey(name);
    }

    public void insert(Symbol symbol) {
        map.put(symbol.getName(), symbol);
    }
}
