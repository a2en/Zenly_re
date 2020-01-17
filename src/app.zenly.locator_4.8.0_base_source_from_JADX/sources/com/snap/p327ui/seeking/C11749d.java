package com.snap.p327ui.seeking;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: com.snap.ui.seeking.d */
public final class C11749d<T> implements Seekable<T> {

    /* renamed from: e */
    private final List<T> f30432e;

    public C11749d(List<? extends T> list) {
        C12932j.m33818b(list, "list");
        this.f30432e = list;
    }

    public T get(int i) {
        return this.f30432e.get(i);
    }

    public Iterator<T> iterator() {
        return new C11750e(this);
    }

    public int size() {
        return this.f30432e.size();
    }

    public String toString() {
        return this.f30432e.toString();
    }
}
