package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.Predicate;
import com.facebook.common.references.CloseableReference;

/* renamed from: com.facebook.imagepipeline.cache.l */
public class C9691l<K, V> implements MemoryCache<K, V> {

    /* renamed from: a */
    private final MemoryCache<K, V> f25318a;

    /* renamed from: b */
    private final MemoryCacheTracker f25319b;

    public C9691l(MemoryCache<K, V> memoryCache, MemoryCacheTracker memoryCacheTracker) {
        this.f25318a = memoryCache;
        this.f25319b = memoryCacheTracker;
    }

    public CloseableReference<V> cache(K k, CloseableReference<V> closeableReference) {
        this.f25319b.onCachePut();
        return this.f25318a.cache(k, closeableReference);
    }

    public boolean contains(Predicate<K> predicate) {
        return this.f25318a.contains(predicate);
    }

    public CloseableReference<V> get(K k) {
        CloseableReference<V> closeableReference = this.f25318a.get(k);
        if (closeableReference == null) {
            this.f25319b.onCacheMiss();
        } else {
            this.f25319b.onCacheHit(k);
        }
        return closeableReference;
    }

    public int removeAll(Predicate<K> predicate) {
        return this.f25318a.removeAll(predicate);
    }

    public boolean contains(K k) {
        return this.f25318a.contains(k);
    }
}
