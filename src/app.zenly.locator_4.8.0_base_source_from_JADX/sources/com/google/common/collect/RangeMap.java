package com.google.common.collect;

import java.lang.Comparable;
import java.util.Map;
import java.util.Map.Entry;

public interface RangeMap<K extends Comparable, V> {
    Map<C10871b0<K>, V> asDescendingMapOfRanges();

    Map<C10871b0<K>, V> asMapOfRanges();

    void clear();

    boolean equals(Object obj);

    V get(K k);

    Entry<C10871b0<K>, V> getEntry(K k);

    int hashCode();

    void put(C10871b0<K> b0Var, V v);

    void putAll(RangeMap<K, V> rangeMap);

    void putCoalescing(C10871b0<K> b0Var, V v);

    void remove(C10871b0<K> b0Var);

    C10871b0<K> span();

    RangeMap<K, V> subRangeMap(C10871b0<K> b0Var);

    String toString();
}
