package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

/* renamed from: com.google.android.gms.internal.clearcut.i3 */
final class C10328i3 implements ListIterator<String> {

    /* renamed from: e */
    private ListIterator<String> f27016e = this.f27018g.f27012e.listIterator(this.f27017f);

    /* renamed from: f */
    private final /* synthetic */ int f27017f;

    /* renamed from: g */
    private final /* synthetic */ C10322h3 f27018g;

    C10328i3(C10322h3 h3Var, int i) {
        this.f27018g = h3Var;
        this.f27017f = i;
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f27016e.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f27016e.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f27016e.next();
    }

    public final int nextIndex() {
        return this.f27016e.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f27016e.previous();
    }

    public final int previousIndex() {
        return this.f27016e.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
