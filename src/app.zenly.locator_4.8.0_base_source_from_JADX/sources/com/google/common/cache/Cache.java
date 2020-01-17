package com.google.common.cache;

import com.google.common.collect.C10909q;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

public interface Cache<K, V> {
    ConcurrentMap<K, V> asMap();

    void cleanUp();

    V get(K k, Callable<? extends V> callable) throws ExecutionException;

    C10909q<K, V> getAllPresent(Iterable<?> iterable);

    V getIfPresent(Object obj);

    void invalidate(Object obj);

    void invalidateAll();

    void invalidateAll(Iterable<?> iterable);

    void put(K k, V v);

    void putAll(Map<? extends K, ? extends V> map);

    long size();

    C10861a stats();
}
