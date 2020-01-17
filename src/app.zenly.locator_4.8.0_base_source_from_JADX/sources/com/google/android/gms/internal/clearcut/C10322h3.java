package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.h3 */
public final class C10322h3 extends AbstractList<String> implements zzcx, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final zzcx f27012e;

    public C10322h3(zzcx zzcx) {
        this.f27012e = zzcx;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f27012e.get(i);
    }

    public final Object getRaw(int i) {
        return this.f27012e.getRaw(i);
    }

    public final Iterator<String> iterator() {
        return new C10334j3(this);
    }

    public final ListIterator<String> listIterator(int i) {
        return new C10328i3(this, i);
    }

    public final int size() {
        return this.f27012e.size();
    }

    public final List<?> zzbt() {
        return this.f27012e.zzbt();
    }

    public final zzcx zzbu() {
        return this;
    }
}
