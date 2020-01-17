package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.j3 */
final class C10334j3 implements Iterator<String> {

    /* renamed from: e */
    private Iterator<String> f27033e = this.f27034f.f27012e.iterator();

    /* renamed from: f */
    private final /* synthetic */ C10322h3 f27034f;

    C10334j3(C10322h3 h3Var) {
        this.f27034f = h3Var;
    }

    public final boolean hasNext() {
        return this.f27033e.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f27033e.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
