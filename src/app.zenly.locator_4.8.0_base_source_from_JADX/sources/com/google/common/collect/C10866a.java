package com.google.common.collect;

import com.google.common.base.C10850i;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.a */
abstract class C10866a<E> extends C10899m0<E> {

    /* renamed from: e */
    private final int f28404e;

    /* renamed from: f */
    private int f28405f;

    protected C10866a(int i, int i2) {
        C10850i.m28013b(i2, i);
        this.f28404e = i;
        this.f28405f = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract E mo31649a(int i);

    public final boolean hasNext() {
        return this.f28405f < this.f28404e;
    }

    public final boolean hasPrevious() {
        return this.f28405f > 0;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f28405f;
            this.f28405f = i + 1;
            return mo31649a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f28405f;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f28405f - 1;
            this.f28405f = i;
            return mo31649a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f28405f - 1;
    }
}
