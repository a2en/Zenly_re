package com.google.android.gms.internal.clearcut;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.y2 */
class C10434y2 extends AbstractSet<Entry<K, V>> {

    /* renamed from: e */
    private final /* synthetic */ C10377p2 f27336e;

    private C10434y2(C10377p2 p2Var) {
        this.f27336e = p2Var;
    }

    /* synthetic */ C10434y2(C10377p2 p2Var, C10383q2 q2Var) {
        this(p2Var);
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f27336e.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f27336e.clear();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f27336e.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public Iterator<Entry<K, V>> iterator() {
        return new C10428x2(this.f27336e, null);
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f27336e.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f27336e.size();
    }
}
