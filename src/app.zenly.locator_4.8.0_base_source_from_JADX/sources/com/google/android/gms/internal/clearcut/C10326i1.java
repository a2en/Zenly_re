package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.i1 */
final class C10326i1<K> implements Iterator<Entry<K, Object>> {

    /* renamed from: e */
    private Iterator<Entry<K, Object>> f27013e;

    public C10326i1(Iterator<Entry<K, Object>> it) {
        this.f27013e = it;
    }

    public final boolean hasNext() {
        return this.f27013e.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f27013e.next();
        return entry.getValue() instanceof C10306f1 ? new C10320h1(entry) : entry;
    }

    public final void remove() {
        this.f27013e.remove();
    }
}
