package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.clearcut.z */
final class C10437z implements Iterator {

    /* renamed from: e */
    private int f27337e = 0;

    /* renamed from: f */
    private final int f27338f = this.f27339g.size();

    /* renamed from: g */
    private final /* synthetic */ C10431y f27339g;

    C10437z(C10431y yVar) {
        this.f27339g = yVar;
    }

    private final byte nextByte() {
        try {
            C10431y yVar = this.f27339g;
            int i = this.f27337e;
            this.f27337e = i + 1;
            return yVar.mo27798a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f27337e < this.f27338f;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
