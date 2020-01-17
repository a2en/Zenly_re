package kotlin.text;

import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12963e;

/* renamed from: kotlin.text.e */
public final class C13008e {

    /* renamed from: a */
    private final String f33605a;

    /* renamed from: b */
    private final C12963e f33606b;

    public C13008e(String str, C12963e eVar) {
        C12932j.m33818b(str, "value");
        C12932j.m33818b(eVar, "range");
        this.f33605a = str;
        this.f33606b = eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f33606b, (java.lang.Object) r3.f33606b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.text.C13008e
            if (r0 == 0) goto L_0x001d
            kotlin.text.e r3 = (kotlin.text.C13008e) r3
            java.lang.String r0 = r2.f33605a
            java.lang.String r1 = r3.f33605a
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x001d
            kotlin.ranges.e r0 = r2.f33606b
            kotlin.ranges.e r3 = r3.f33606b
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C13008e.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f33605a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C12963e eVar = this.f33606b;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MatchGroup(value=");
        sb.append(this.f33605a);
        sb.append(", range=");
        sb.append(this.f33606b);
        sb.append(")");
        return sb.toString();
    }
}
