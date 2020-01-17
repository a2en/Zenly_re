package com.google.android.libraries.places.internal;

import java.util.ListIterator;

public abstract class zzhl<E> extends zzhm<E> implements ListIterator<E> {
    protected zzhl() {
    }

    @Deprecated
    public final void add(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(E e) {
        throw new UnsupportedOperationException();
    }
}
