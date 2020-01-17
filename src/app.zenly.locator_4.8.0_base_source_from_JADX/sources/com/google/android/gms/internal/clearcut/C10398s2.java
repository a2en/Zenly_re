package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.clearcut.s2 */
final class C10398s2 extends C10434y2 {

    /* renamed from: f */
    private final /* synthetic */ C10377p2 f27183f;

    private C10398s2(C10377p2 p2Var) {
        this.f27183f = p2Var;
        super(p2Var, null);
    }

    /* synthetic */ C10398s2(C10377p2 p2Var, C10383q2 q2Var) {
        this(p2Var);
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new C10392r2(this.f27183f, null);
    }
}
