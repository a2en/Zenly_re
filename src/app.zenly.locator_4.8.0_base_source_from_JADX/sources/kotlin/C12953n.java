package kotlin;

import java.io.Serializable;

/* renamed from: kotlin.n */
public final class C12953n<A, B, C> implements Serializable {

    /* renamed from: e */
    private final A f33537e;

    /* renamed from: f */
    private final B f33538f;

    /* renamed from: g */
    private final C f33539g;

    public C12953n(A a, B b, C c) {
        this.f33537e = a;
        this.f33538f = b;
        this.f33539g = c;
    }

    /* renamed from: a */
    public final A mo37312a() {
        return this.f33537e;
    }

    /* renamed from: b */
    public final B mo37313b() {
        return this.f33538f;
    }

    /* renamed from: c */
    public final C mo37314c() {
        return this.f33539g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f33539g, (java.lang.Object) r3.f33539g) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof kotlin.C12953n
            if (r0 == 0) goto L_0x0027
            kotlin.n r3 = (kotlin.C12953n) r3
            A r0 = r2.f33537e
            A r1 = r3.f33537e
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0027
            B r0 = r2.f33538f
            B r1 = r3.f33538f
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x0027
            C r0 = r2.f33539g
            C r3 = r3.f33539g
            boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C12953n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        A a = this.f33537e;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f33538f;
        int hashCode2 = (hashCode + (b != null ? b.hashCode() : 0)) * 31;
        C c = this.f33539g;
        if (c != null) {
            i = c.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f33537e);
        String str = ", ";
        sb.append(str);
        sb.append(this.f33538f);
        sb.append(str);
        sb.append(this.f33539g);
        sb.append(')');
        return sb.toString();
    }
}
