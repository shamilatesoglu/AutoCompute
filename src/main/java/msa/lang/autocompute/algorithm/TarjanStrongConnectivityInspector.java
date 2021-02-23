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

package msa.lang.autocompute.algorithm;

import msa.lang.autocompute.ds.DirectedGraph;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TarjanStrongConnectivityInspector<V> {

    private final Map<TarjanVertex<V>, Set<TarjanVertex<V>>> internal;

    private final Set<TarjanVertex<V>> vertices;

    public TarjanStrongConnectivityInspector(DirectedGraph<V> directedGraph) {
        internal = new LinkedHashMap<>();
        vertices = new LinkedHashSet<>();

        buildInternalDigraph(directedGraph);
    }

    public TarjanStrongConnectivityInspector() {
        internal = new LinkedHashMap<>();
        vertices = new LinkedHashSet<>();
    }

    private void buildInternalDigraph(DirectedGraph<V> directedGraph) {
        for (V from : directedGraph.vertices()) {
            for (V to : directedGraph.getAdjacencySet(from)) {
                this.addEdge(from, to);
            }
        }
    }

    public void addEdge(V from, V to) {
        TarjanVertex<V> tarjanFrom = new TarjanVertex<>(from);
        TarjanVertex<V> tarjanTo = new TarjanVertex<>(to);
        if (!internal.containsKey(tarjanFrom)) internal.put(tarjanFrom, new LinkedHashSet<>());
        if (!internal.containsKey(tarjanTo)) internal.put(tarjanTo, new LinkedHashSet<>());
        internal.get(tarjanFrom).add(tarjanTo);
        vertices.add(tarjanFrom);
        vertices.add(tarjanTo);
    }

    public void addVertex(V v) {
        TarjanVertex<V> t = new TarjanVertex<>(v);
        if (!internal.containsKey(t)) {
            internal.put(t, new LinkedHashSet<>());
            vertices.add(t);
        }
    }

    private void clear() {
        for (TarjanVertex<V> tarjanVertex : vertices) {
            tarjanVertex.index = TarjanVertex.UNDEFINED;
            tarjanVertex.lowLink = 0;
            tarjanVertex.onStack = false;
        }
    }

    /**
     * Returns sets of vertices that are strongly connected.
     * If any set contains more than 1 element, the graph is cyclic.
     * <p>
     * See: https://en.wikipedia.org/wiki/Tarjan%27s_strongly_connected_components_algorithm
     *
     * @return Sets of vertices that are strongly connected.
     */
    public Set<Set<V>> getStronglyConnectedComponents() {
        clear();

        Set<Set<V>> stronglyConnectedComponents = new LinkedHashSet<>();

        AtomicInteger index = new AtomicInteger(0);

        Stack<TarjanVertex<V>> S = new Stack<>();

        for (TarjanVertex<V> vertex : internal.keySet()) {
            if (vertex.index == TarjanVertex.UNDEFINED) {
                strongConnect(vertex, index, S, stronglyConnectedComponents);
            }
        }

        return stronglyConnectedComponents;
    }

    private void strongConnect(TarjanVertex<V> v, AtomicInteger index,
                               Stack<TarjanVertex<V>> S, Set<Set<V>> stronglyConnectedComponents) {
        v.index = index.get();
        v.lowLink = index.getAndIncrement();
        S.push(v);
        v.onStack = true;

        for (TarjanVertex<V> w : internal.get(v)) {
            if (w.index == TarjanVertex.UNDEFINED) {
                // Successor w has not yet been visited; recurse on it
                strongConnect(w, index, S, stronglyConnectedComponents);
                v.lowLink = Math.min(v.lowLink, w.lowLink);
            } else if (w.onStack) {
                // Successor w is in stack S and hence in the current SCC
                // If w is not on stack, then (v, w) is an edge pointing to an SCC already found and must be ignored
                v.lowLink = Math.min(v.lowLink, w.index);
            }
        }

        if (v.lowLink == v.index) {
            Set<V> stronglyConnectedComponent = new LinkedHashSet<>();
            TarjanVertex<V> w;
            do {
                w = S.pop();
                w.onStack = false;
                stronglyConnectedComponent.add(w.v);
            } while (w.index != v.index);
            stronglyConnectedComponents.add(stronglyConnectedComponent);
        }
    }

    private static class TarjanVertex<V> {
        private static final int UNDEFINED = -1;

        final V v;
        int lowLink;
        int index;
        boolean onStack;

        TarjanVertex(V vertex) {
            this.v = vertex;
            index = UNDEFINED;
        }

        @Override
        public int hashCode() {
            return v.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (!(obj instanceof TarjanVertex))
                return false;
            return v.equals(((TarjanVertex) obj).v);
        }
    }
}
