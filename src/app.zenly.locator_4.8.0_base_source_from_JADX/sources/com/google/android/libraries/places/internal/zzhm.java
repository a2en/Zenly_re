package com.google.android.libraries.places.internal;

import java.util.Iterator;

public abstract class zzhm<E> implements Iterator<E> {
    protected zzhm() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
