package com.bumptech.glide.load.p294h;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.p301o.C9216j;

/* renamed from: com.bumptech.glide.load.h.b */
public class C9016b<T> implements Resource<T> {

    /* renamed from: e */
    protected final T f23552e;

    public C9016b(T t) {
        C9216j.m22083a(t);
        this.f23552e = t;
    }

    public final T get() {
        return this.f23552e;
    }

    public Class<T> getResourceClass() {
        return this.f23552e.getClass();
    }

    public final int getSize() {
        return 1;
    }

    public void recycle() {
    }
}
