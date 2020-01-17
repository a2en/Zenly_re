package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.common.collect.l */
public abstract class C10896l<K, V> extends C10898m implements Map<K, V> {
    protected C10896l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Map<K, V> mo31708a();

    public void clear() {
        mo31708a().clear();
    }

    public boolean containsKey(Object obj) {
        return mo31708a().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo31708a().containsValue(obj);
    }

    public Set<Entry<K, V>> entrySet() {
        return mo31708a().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || mo31708a().equals(obj);
    }

    public V get(Object obj) {
        return mo31708a().get(obj);
    }

    public int hashCode() {
        return mo31708a().hashCode();
    }

    public boolean isEmpty() {
        return mo31708a().isEmpty();
    }

    public Set<K> keySet() {
        return mo31708a().keySet();
    }

    public V put(K k, V v) {
        return mo31708a().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo31708a().putAll(map);
    }

    public V remove(Object obj) {
        return mo31708a().remove(obj);
    }

    public int size() {
        return mo31708a().size();
    }

    public Collection<V> values() {
        return mo31708a().values();
    }
}
