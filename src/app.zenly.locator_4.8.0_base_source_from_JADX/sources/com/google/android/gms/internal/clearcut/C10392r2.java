package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.r2 */
final class C10392r2 implements Iterator<Entry<K, V>> {

    /* renamed from: e */
    private int f27173e;

    /* renamed from: f */
    private Iterator<Entry<K, V>> f27174f;

    /* renamed from: g */
    private final /* synthetic */ C10377p2 f27175g;

    private C10392r2(C10377p2 p2Var) {
        this.f27175g = p2Var;
        this.f27173e = this.f27175g.f27163f.size();
    }

    /* synthetic */ C10392r2(C10377p2 p2Var, C10383q2 q2Var) {
        this(p2Var);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m26490a() {
        if (this.f27174f == null) {
            this.f27174f = this.f27175g.f27167j.entrySet().iterator();
        }
        return this.f27174f;
    }

    public final boolean hasNext() {
        int i = this.f27173e;
        return (i > 0 && i <= this.f27175g.f27163f.size()) || m26490a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (m26490a().hasNext()) {
            obj = m26490a().next();
        } else {
            List b = this.f27175g.f27163f;
            int i = this.f27173e - 1;
            this.f27173e = i;
            obj = b.get(i);
        }
        return (Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
