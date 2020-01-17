package com.google.firebase.components;

import com.google.firebase.inject.Provider;

/* renamed from: com.google.firebase.components.n */
class C11043n<T> implements Provider<T> {

    /* renamed from: c */
    private static final Object f28650c = new Object();

    /* renamed from: a */
    private volatile Object f28651a = f28650c;

    /* renamed from: b */
    private volatile Provider<T> f28652b;

    C11043n(Provider<T> provider) {
        this.f28652b = provider;
    }

    public T get() {
        T t = this.f28651a;
        if (t == f28650c) {
            synchronized (this) {
                t = this.f28651a;
                if (t == f28650c) {
                    t = this.f28652b.get();
                    this.f28651a = t;
                    this.f28652b = null;
                }
            }
        }
        return t;
    }
}
