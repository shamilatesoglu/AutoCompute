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

package msa.lang.autocompute.runtime;

import msa.lang.autocompute.ds.DirectedAcyclicGraph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.Set;

public class DependencyGraph {
    private final DirectedAcyclicGraph<String> dependants;
    private final DirectedAcyclicGraph<String> dependencies;


    public DependencyGraph() {
        this.dependants = new DirectedAcyclicGraph<>();
        this.dependencies = new DirectedAcyclicGraph<>();
    }

    public void add(String id) {
        dependants.addVertex(id);
    }

    public void addDependency(String dependant, String dependency) {
        dependants.addEdge(dependency, dependant); // dependency -> dependant: Represents the flow of data
        dependencies.addEdge(dependant, dependency); // dependant -> dependency: Represents the hierarchy
    }

    public Set<String> getImmediateDependencies(String dependant) {
        return dependencies.getAdjacencySet(dependant);
    }

    public Set<String> getImmediateDependants(String dependency) {
        return dependants.getAdjacencySet(dependency);
    }

    public Set<String> getAllDependants(String dependency) {
        Set<String> allDependants = new LinkedHashSet<>();

        Deque<String> stack = new ArrayDeque<>();
        stack.add(dependency);

        while (!stack.isEmpty()) {
            String id = stack.poll();

            Set<String> dependants = getImmediateDependants(id);

            if (!id.equals(dependency)) {
                allDependants.add(id);
            }

            for (String dependant : dependants) {
                stack.push(dependant);
            }
        }
        return allDependants;
    }

    public Set<String> getAllUltimateDependants() {
        return dependants.getSinkVertices();
    }

    public Set<String> getUltimateDependants(String dependency) {
        Set<String> ultimateDependants = new LinkedHashSet<>();

        Deque<String> stack = new ArrayDeque<>();
        stack.add(dependency);

        while (!stack.isEmpty()) {
            String id = stack.poll();

            Set<String> dependants = getImmediateDependants(id);

            if (dependants.isEmpty()) {
                ultimateDependants.add(id);
            } else {
                for (String dependant : dependants) {
                    stack.push(dependant);
                }
            }
        }

        return ultimateDependants;
    }
}

