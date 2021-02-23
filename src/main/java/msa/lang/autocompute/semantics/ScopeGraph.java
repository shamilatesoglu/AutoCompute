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
