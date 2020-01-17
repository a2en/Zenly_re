package com.google.common.collect;

import com.google.common.base.C10850i;

/* renamed from: com.google.common.collect.h0 */
final class C10887h0<E> extends C10912r<E> {

    /* renamed from: g */
    final transient E f28446g;

    /* renamed from: h */
    private transient int f28447h;

    C10887h0(E e) {
        C10850i.m28004a(e);
        this.f28446g = e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo31668a(Object[] objArr, int i) {
        objArr[i] = this.f28446g;
        return i + 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C10904p<E> mo31680b() {
        return C10904p.m28096a(this.f28446g);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo31690c() {
        return this.f28447h != 0;
    }

    public boolean contains(Object obj) {
        return this.f28446g.equals(obj);
    }

    public final int hashCode() {
        int i = this.f28447h;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f28446g.hashCode();
        this.f28447h = hashCode;
        return hashCode;
    }

    public int size() {
        return 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.f28446g.toString());
        sb.append(']');
        return sb.toString();
    }

    public C10897l0<E> iterator() {
        return C10917t.m28130a(this.f28446g);
    }

    C10887h0(E e, int i) {
        this.f28446g = e;
        this.f28447h = i;
    }
}
