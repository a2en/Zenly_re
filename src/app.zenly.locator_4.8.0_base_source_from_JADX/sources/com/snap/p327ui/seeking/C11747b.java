package com.snap.p327ui.seeking;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: com.snap.ui.seeking.b */
public final class C11747b<T> implements Seekable<T> {

    /* renamed from: e */
    private final List<Seekable<T>> f30431e;

    public C11747b(List<? extends Seekable<T>> list) {
        C12932j.m33818b(list, "list");
        this.f30431e = list;
    }

    public T get(int i) {
        int size = this.f30431e.size();
        for (int i2 = 0; i2 < size; i2++) {
            Seekable seekable = (Seekable) this.f30431e.get(i2);
            int size2 = seekable.size();
            if (i < size2) {
                return seekable.get(i);
            }
            i -= size2;
        }
        throw new IndexOutOfBoundsException();
    }

    public Iterator<T> iterator() {
        return new C11750e(this);
    }

    public int size() {
        int i = 0;
        for (Seekable size : this.f30431e) {
            i += size.size();
        }
        return i;
    }
}
