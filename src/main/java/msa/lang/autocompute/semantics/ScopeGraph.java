package msa.lang.autocompute.semantics;

import msa.lang.autocompute.ds.DirectedAcyclicGraph;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ScopeGraph {
    private final DirectedAcyclicGraph<Scope> childrenGraph;  // parent -> child
    private final Map<Scope, Scope> parentMap;    // child -> parent

    private final Map<String, Scope> scopeTable;

    public ScopeGraph() {
        childrenGraph = new DirectedAcyclicGraph<>();
        parentMap = new LinkedHashMap<>();
        scopeTable = new LinkedHashMap<>();
    }

    public void addScope(Scope parentScope, Scope childScope) {
        if (parentScope != null && parentScope.getReference() != null) {
            childrenGraph.addEdge(parentScope, childScope);
            parentMap.put(childScope, parentScope);
            scopeTable.put(parentScope.getReference(), parentScope);
            scopeTable.put(childScope.getReference(), childScope);
        } else if (childScope != null && childScope.getReference() != null) {
            // Means global scope.
            childrenGraph.addVertex(childScope);
            parentMap.put(childScope, null);
            scopeTable.put(childScope.getReference(), childScope);
        }
    }

    public Scope getParent(Scope child) {
        return parentMap.get(child);
    }

    public Scope get(String reference) {
        return scopeTable.get(reference);
    }

    public Set<Scope> getChildren(Scope parent) {
        return childrenGraph.getAdjacencySet(parent);
    }


}
