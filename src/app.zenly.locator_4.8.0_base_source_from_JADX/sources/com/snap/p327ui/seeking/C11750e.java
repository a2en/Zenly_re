package com.snap.p327ui.seeking;

import java.util.Iterator;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: com.snap.ui.seeking.e */
public final class C11750e<T> implements Iterator<T>, KMappedMarker {

    /* renamed from: e */
    private int f30433e;

    /* renamed from: f */
    private final Seekable<T> f30434f;

    public C11750e(Seekable<T> seekable) {
        C12932j.m33818b(seekable, "seekable");
        this.f30434f = seekable;
    }

    public boolean hasNext() {
        return this.f30433e < this.f30434f.size();
    }

    public T next() {
        Seekable<T> seekable = this.f30434f;
        int i = this.f30433e;
        this.f30433e = i + 1;
        return seekable.get(i);
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
