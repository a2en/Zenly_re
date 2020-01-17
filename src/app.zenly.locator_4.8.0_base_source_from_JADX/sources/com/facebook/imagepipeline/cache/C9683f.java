package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.imagepipeline.cache.f */
public class C9683f<K, V> {

    /* renamed from: a */
    private final ValueDescriptor<V> f25310a;

    /* renamed from: b */
    private final LinkedHashMap<K, V> f25311b = new LinkedHashMap<>();

    /* renamed from: c */
    private int f25312c = 0;

    public C9683f(ValueDescriptor<V> valueDescriptor) {
        this.f25310a = valueDescriptor;
    }

    /* renamed from: d */
    private int m23812d(V v) {
        if (v == null) {
            return 0;
        }
        return this.f25310a.getSizeInBytes(v);
    }

    /* renamed from: a */
    public synchronized int mo26237a() {
        return this.f25311b.size();
    }

    /* renamed from: b */
    public synchronized K mo26241b() {
        return this.f25311b.isEmpty() ? null : this.f25311b.keySet().iterator().next();
    }

    /* renamed from: c */
    public synchronized int mo26244c() {
        return this.f25312c;
    }

    /* renamed from: a */
    public synchronized ArrayList<Entry<K, V>> mo26239a(Predicate<K> predicate) {
        ArrayList<Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f25311b.entrySet().size());
        for (Entry entry : this.f25311b.entrySet()) {
            if (predicate == null || predicate.apply(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public synchronized V mo26242b(K k) {
        return this.f25311b.get(k);
    }

    /* renamed from: c */
    public synchronized V mo26245c(K k) {
        V remove;
        remove = this.f25311b.remove(k);
        this.f25312c -= m23812d(remove);
        return remove;
    }

    /* renamed from: b */
    public synchronized ArrayList<V> mo26243b(Predicate<K> predicate) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator it = this.f25311b.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (predicate == null || predicate.apply(entry.getKey())) {
                arrayList.add(entry.getValue());
                this.f25312c -= m23812d(entry.getValue());
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public synchronized boolean mo26240a(K k) {
        return this.f25311b.containsKey(k);
    }

    /* renamed from: a */
    public synchronized V mo26238a(K k, V v) {
        V remove;
        remove = this.f25311b.remove(k);
        this.f25312c -= m23812d(remove);
        this.f25311b.put(k, v);
        this.f25312c += m23812d(v);
        return remove;
    }
}
