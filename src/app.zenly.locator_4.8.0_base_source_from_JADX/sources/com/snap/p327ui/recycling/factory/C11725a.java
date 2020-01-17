package com.snap.p327ui.recycling.factory;

import android.annotation.TargetApi;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: com.snap.ui.recycling.factory.a */
class C11725a<K, V> extends HashMap<K, V> {

    /* renamed from: e */
    private final ConcurrentHashMap<K, V> f30392e;

    public C11725a() {
        this.f30392e = new ConcurrentHashMap<>();
    }

    public void clear() {
        this.f30392e.clear();
    }

    @TargetApi(24)
    public Object clone() {
        return new C11725a(this.f30392e);
    }

    @TargetApi(24)
    public V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        return this.f30392e.compute(k, biFunction);
    }

    @TargetApi(24)
    public V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        return this.f30392e.computeIfAbsent(k, function);
    }

    @TargetApi(24)
    public V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        return this.f30392e.computeIfPresent(k, biFunction);
    }

    public boolean containsKey(Object obj) {
        return this.f30392e.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.f30392e.containsValue(obj);
    }

    public Set<Entry<K, V>> entrySet() {
        return this.f30392e.entrySet();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11725a)) {
            return false;
        }
        return this.f30392e.equals(((C11725a) obj).f30392e);
    }

    @TargetApi(24)
    public void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        this.f30392e.forEach(biConsumer);
    }

    public V get(Object obj) {
        return this.f30392e.get(obj);
    }

    @TargetApi(24)
    public V getOrDefault(Object obj, V v) {
        return this.f30392e.getOrDefault(obj, v);
    }

    public int hashCode() {
        return this.f30392e.hashCode();
    }

    public boolean isEmpty() {
        return this.f30392e.isEmpty();
    }

    public synchronized Set<K> keySet() {
        HashSet hashSet;
        Enumeration keys = this.f30392e.keys();
        hashSet = new HashSet();
        while (keys.hasMoreElements()) {
            hashSet.add(keys.nextElement());
        }
        return hashSet;
    }

    @TargetApi(24)
    public V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        return this.f30392e.merge(k, v, biFunction);
    }

    public V put(K k, V v) {
        return this.f30392e.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        this.f30392e.putAll(map);
    }

    @TargetApi(24)
    public V putIfAbsent(K k, V v) {
        return this.f30392e.putIfAbsent(k, v);
    }

    public V remove(Object obj) {
        if (obj != null) {
            return this.f30392e.remove(obj);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        return this.f30392e.replace(k, v, v2);
    }

    @TargetApi(24)
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        this.f30392e.replaceAll(biFunction);
    }

    public int size() {
        return this.f30392e.size();
    }

    public String toString() {
        return this.f30392e.toString();
    }

    public Collection<V> values() {
        return this.f30392e.values();
    }

    public boolean remove(Object obj, Object obj2) {
        return this.f30392e.remove(obj, obj2);
    }

    public V replace(K k, V v) {
        return this.f30392e.replace(k, v);
    }

    public C11725a(Map<? extends K, ? extends V> map) {
        super(map);
        this.f30392e = new ConcurrentHashMap<>(map);
    }
}
