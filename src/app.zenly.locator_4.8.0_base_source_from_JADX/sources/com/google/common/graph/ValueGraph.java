package com.google.common.graph;

import java.util.Set;

public interface ValueGraph<N, V> extends C10965a<N> {
    Set<N> adjacentNodes(N n);

    boolean allowsSelfLoops();

    Graph<N> asGraph();

    int degree(N n);

    V edgeValueOrDefault(N n, N n2, V v);

    Set<C10967c<N>> edges();

    boolean equals(Object obj);

    boolean hasEdgeConnecting(N n, N n2);

    int hashCode();

    int inDegree(N n);

    Set<C10967c<N>> incidentEdges(N n);

    boolean isDirected();

    C10966b<N> nodeOrder();

    Set<N> nodes();

    int outDegree(N n);

    Set<N> predecessors(N n);

    Set<N> successors(N n);
}
