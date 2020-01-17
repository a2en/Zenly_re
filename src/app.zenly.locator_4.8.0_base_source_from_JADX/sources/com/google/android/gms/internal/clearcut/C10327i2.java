package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.i2 */
final class C10327i2<E> extends C10389r<E> {

    /* renamed from: g */
    private static final C10327i2<Object> f27014g;

    /* renamed from: f */
    private final List<E> f27015f;

    static {
        C10327i2<Object> i2Var = new C10327i2<>();
        f27014g = i2Var;
        i2Var.zzv();
    }

    C10327i2() {
        this(new ArrayList(10));
    }

    private C10327i2(List<E> list) {
        this.f27015f = list;
    }

    /* renamed from: b */
    public static <E> C10327i2<E> m26135b() {
        return f27014g;
    }

    public final void add(int i, E e) {
        mo28114a();
        this.f27015f.add(i, e);
        this.modCount++;
    }

    public final E get(int i) {
        return this.f27015f.get(i);
    }

    public final E remove(int i) {
        mo28114a();
        E remove = this.f27015f.remove(i);
        this.modCount++;
        return remove;
    }

    public final E set(int i, E e) {
        mo28114a();
        E e2 = this.f27015f.set(i, e);
        this.modCount++;
        return e2;
    }

    public final int size() {
        return this.f27015f.size();
    }

    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f27015f);
            return new C10327i2(arrayList);
        }
        throw new IllegalArgumentException();
    }
}
