package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.x2 */
final class C10428x2 implements Iterator<Entry<K, V>> {

    /* renamed from: e */
    private int f27313e;

    /* renamed from: f */
    private boolean f27314f;

    /* renamed from: g */
    private Iterator<Entry<K, V>> f27315g;

    /* renamed from: h */
    private final /* synthetic */ C10377p2 f27316h;

    private C10428x2(C10377p2 p2Var) {
        this.f27316h = p2Var;
        this.f27313e = -1;
    }

    /* synthetic */ C10428x2(C10377p2 p2Var, C10383q2 q2Var) {
        this(p2Var);
    }

    /* renamed from: a */
    private final Iterator<Entry<K, V>> m26591a() {
        if (this.f27315g == null) {
            this.f27315g = this.f27316h.f27164g.entrySet().iterator();
        }
        return this.f27315g;
    }

    public final boolean hasNext() {
        return this.f27313e + 1 < this.f27316h.f27163f.size() || (!this.f27316h.f27164g.isEmpty() && m26591a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f27314f = true;
        int i = this.f27313e + 1;
        this.f27313e = i;
        return (Entry) (i < this.f27316h.f27163f.size() ? this.f27316h.f27163f.get(this.f27313e) : m26591a().next());
    }

    public final void remove() {
        if (this.f27314f) {
            this.f27314f = false;
            this.f27316h.m26443f();
            if (this.f27313e < this.f27316h.f27163f.size()) {
                C10377p2 p2Var = this.f27316h;
                int i = this.f27313e;
                this.f27313e = i - 1;
                p2Var.m26440c(i);
                return;
            }
            m26591a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
