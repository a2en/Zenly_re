package com.google.common.graph;

import java.util.Set;

public interface Network<N, E> extends SuccessorsFunction<N>, PredecessorsFunction<N> {
    Set<E> adjacentEdges(E e);

    Set<N> adjacentNodes(N n);

    boolean allowsParallelEdges();

    boolean allowsSelfLoops();

    Graph<N> asGraph();

    int degree(N n);

    E edgeConnectingOrNull(N n, N n2);

    C10966b<E> edgeOrder();

    Set<E> edges();

    Set<E> edgesConnecting(N n, N n2);

    boolean equals(Object obj);

    boolean hasEdgeConnecting(N n, N n2);

    int hashCode();

    int inDegree(N n);

    Set<E> inEdges(N n);

    Set<E> incidentEdges(N n);

    C10967c<N> incidentNodes(E e);

    boolean isDirected();

    C10966b<N> nodeOrder();

    Set<N> nodes();

    int outDegree(N n);

    Set<E> outEdges(N n);

    Set<N> predecessors(N n);

    Set<N> successors(N n);
}
