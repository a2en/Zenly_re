package com.google.common.collect;

/* renamed from: com.google.common.collect.f0 */
final class C10883f0<E> extends C10912r<E> {

    /* renamed from: l */
    static final C10883f0<Object> f28439l;

    /* renamed from: g */
    final transient Object[] f28440g;

    /* renamed from: h */
    final transient Object[] f28441h;

    /* renamed from: i */
    private final transient int f28442i;

    /* renamed from: j */
    private final transient int f28443j;

    /* renamed from: k */
    private final transient int f28444k;

    static {
        C10883f0 f0Var = new C10883f0(new Object[0], 0, null, 0, 0);
        f28439l = f0Var;
    }

    C10883f0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f28440g = objArr;
        this.f28441h = objArr2;
        this.f28442i = i2;
        this.f28443j = i;
        this.f28444k = i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo31668a(Object[] objArr, int i) {
        System.arraycopy(this.f28440g, 0, objArr, i, this.f28444k);
        return i + this.f28444k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C10904p<E> mo31680b() {
        return C10904p.m28100b(this.f28440g, this.f28444k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo31690c() {
        return true;
    }

    public boolean contains(Object obj) {
        Object[] objArr = this.f28441h;
        if (obj == null || objArr == null) {
            return false;
        }
        int a = C10900n.m28090a(obj);
        while (true) {
            int i = a & this.f28442i;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a = i + 1;
        }
    }

    public int hashCode() {
        return this.f28443j;
    }

    public int size() {
        return this.f28444k;
    }

    public C10897l0<E> iterator() {
        return mo31686a().iterator();
    }
}
