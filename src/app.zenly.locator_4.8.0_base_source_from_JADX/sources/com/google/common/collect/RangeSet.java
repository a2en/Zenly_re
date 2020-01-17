package com.google.common.collect;

import java.lang.Comparable;
import java.util.Set;

public interface RangeSet<C extends Comparable> {
    void add(C10871b0<C> b0Var);

    void addAll(RangeSet<C> rangeSet);

    void addAll(Iterable<C10871b0<C>> iterable);

    Set<C10871b0<C>> asDescendingSetOfRanges();

    Set<C10871b0<C>> asRanges();

    void clear();

    RangeSet<C> complement();

    boolean contains(C c);

    boolean encloses(C10871b0<C> b0Var);

    boolean enclosesAll(RangeSet<C> rangeSet);

    boolean enclosesAll(Iterable<C10871b0<C>> iterable);

    boolean equals(Object obj);

    int hashCode();

    boolean intersects(C10871b0<C> b0Var);

    boolean isEmpty();

    C10871b0<C> rangeContaining(C c);

    void remove(C10871b0<C> b0Var);

    void removeAll(RangeSet<C> rangeSet);

    void removeAll(Iterable<C10871b0<C>> iterable);

    C10871b0<C> span();

    RangeSet<C> subRangeSet(C10871b0<C> b0Var);

    String toString();
}
