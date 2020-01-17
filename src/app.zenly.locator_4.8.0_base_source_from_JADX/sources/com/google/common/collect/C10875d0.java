package com.google.common.collect;

import com.google.common.base.C10850i;

/* renamed from: com.google.common.collect.d0 */
class C10875d0<E> extends C10904p<E> {

    /* renamed from: i */
    static final C10904p<Object> f28420i = new C10875d0(new Object[0], 0);

    /* renamed from: g */
    final transient Object[] f28421g;

    /* renamed from: h */
    private final transient int f28422h;

    C10875d0(Object[] objArr, int i) {
        this.f28421g = objArr;
        this.f28422h = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo31668a(Object[] objArr, int i) {
        System.arraycopy(this.f28421g, 0, objArr, i, this.f28422h);
        return i + this.f28422h;
    }

    public E get(int i) {
        C10850i.m28003a(i, this.f28422h);
        return this.f28421g[i];
    }

    public int size() {
        return this.f28422h;
    }
}
