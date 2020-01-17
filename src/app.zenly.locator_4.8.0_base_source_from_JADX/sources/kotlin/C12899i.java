package kotlin;

import java.io.Serializable;

/* renamed from: kotlin.i */
public final class C12899i<A, B> implements Serializable {

    /* renamed from: e */
    private final A f33474e;

    /* renamed from: f */
    private final B f33475f;

    public C12899i(A a, B b) {
        this.f33474e = a;
        this.f33475f = b;
    }

    /* renamed from: a */
    public final A mo37202a() {
        return this.f33474e;
    }

    /* renamed from: b */
    public final B mo37203b() {
        return this.f33475f;
    }

    /* renamed from: c */
    public final A mo37204c() {
        return this.f33474e;
    }

    /* renamed from: d */
    public final B mo37205d() {
        return this.f33475f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f33475f, (java.lang.Object) r3.f33475f) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.C12899i
            if (r0 == 0) goto L_0x001d
            kotlin.i r3 = (kotlin.C12899i) r3
            A r0 = r2.f33474e
            A r1 = r3.f33474e
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x001d
            B r0 = r2.f33475f
            B r3 = r3.f33475f
            boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C12899i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        A a = this.f33474e;
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f33475f;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f33474e);
        sb.append(", ");
        sb.append(this.f33475f);
        sb.append(')');
        return sb.toString();
    }
}
