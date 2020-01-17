package com.snap.p327ui.seeking;

import java.util.Iterator;
import kotlin.jvm.internal.C12932j;

/* renamed from: com.snap.ui.seeking.a */
public final class C11746a<T> implements Seekable<T> {

    /* renamed from: e */
    private final Seekable<T> f30429e;

    /* renamed from: f */
    private final Seekable<T> f30430f;

    public C11746a(Seekable<T> seekable, Seekable<T> seekable2) {
        C12932j.m33818b(seekable, "head");
        C12932j.m33818b(seekable2, "tail");
        this.f30429e = seekable;
        this.f30430f = seekable2;
    }

    public T get(int i) {
        int size = this.f30429e.size();
        if (i < size) {
            return this.f30429e.get(i);
        }
        return this.f30430f.get(i - size);
    }

    public Iterator<T> iterator() {
        return new C11750e(this);
    }

    public int size() {
        return this.f30429e.size() + this.f30430f.size();
    }
}
