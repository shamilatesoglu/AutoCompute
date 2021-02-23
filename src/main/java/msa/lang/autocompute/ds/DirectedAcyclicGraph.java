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

package msa.lang.autocompute.ds;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class DirectedAcyclicGraph<V> extends DirectedGraph<V> {

    @Override
    public void addEdge(V from, V to) {
        super.addEdge(from, to);
        if (isCyclic()) {
            throw new IllegalArgumentException(String.format("Adding edge (%s -> %s) creates a cycle!",
                    from.toString(), to.toString()));
        }
    }

    @Override
    public Iterator<V> iterator() {
        return new TopologicalOrderTraversal().iterator();
    }

    private class TopologicalOrderTraversal implements Iterable<V> {
        private final HashMap<V, Boolean> visited;
        private final LinkedList<V> reversePostOrder;

        public TopologicalOrderTraversal() {
            reversePostOrder = new LinkedList<>();
            visited = new HashMap<>(getNumberOfVertices(), 2);
            for (V v : vertices())
                visited.put(v, false);
            for (V v : vertices())
                if (!visited.get(v)) dfs(v);
        }

        private void dfs(V v) {
            visited.put(v, true);
            for (V w : DirectedAcyclicGraph.this.adjacentVertices(v))
                if (!visited.get(w)) dfs(w);
            reversePostOrder.push(v);
        }

        @Override
        public Iterator<V> iterator() {
            return reversePostOrder.iterator();
        }
    }
}
