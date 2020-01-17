package com.google.common.collect;

import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.common.collect.k */
public abstract class C10894k<K, V> extends C10896l<K, V> implements ConcurrentMap<K, V> {
    protected C10894k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ConcurrentMap<K, V> mo31708a();

    public V putIfAbsent(K k, V v) {
        return mo31708a().putIfAbsent(k, v);
    }

    public boolean remove(Object obj, Object obj2) {
        return mo31708a().remove(obj, obj2);
    }

    public V replace(K k, V v) {
        return mo31708a().replace(k, v);
    }

    public boolean replace(K k, V v, V v2) {
        return mo31708a().replace(k, v, v2);
    }
}
