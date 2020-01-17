package com.google.common.collect;

import com.google.common.base.C10849h;

/* renamed from: com.google.common.collect.j */
public abstract class C10892j<E> implements Iterable<E> {

    /* renamed from: e */
    private final C10849h<Iterable<E>> f28451e = C10849h.m28001a();

    protected C10892j() {
    }

    /* renamed from: a */
    private Iterable<E> m28084a() {
        return (Iterable) this.f28451e.mo31458a(this);
    }

    public String toString() {
        return C10914s.m28129a(m28084a());
    }
}
