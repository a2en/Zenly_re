package com.snap.p327ui.seeking;

import java.util.Iterator;

/* renamed from: com.snap.ui.seeking.c */
public final class C11748c<T> implements Seekable<T> {
    public T get(int i) {
        throw new IndexOutOfBoundsException();
    }

    public Iterator<T> iterator() {
        return new C11750e(this);
    }

    public int size() {
        return 0;
    }
}
