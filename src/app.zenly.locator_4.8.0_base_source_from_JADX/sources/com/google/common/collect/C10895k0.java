package com.google.common.collect;

import com.google.common.base.C10850i;
import java.util.Iterator;

/* renamed from: com.google.common.collect.k0 */
abstract class C10895k0<F, T> implements Iterator<T> {

    /* renamed from: e */
    final Iterator<? extends F> f28452e;

    C10895k0(Iterator<? extends F> it) {
        C10850i.m28004a(it);
        this.f28452e = it;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo31713a(F f);

    public final boolean hasNext() {
        return this.f28452e.hasNext();
    }

    public final T next() {
        return mo31713a(this.f28452e.next());
    }

    public final void remove() {
        this.f28452e.remove();
    }
}
