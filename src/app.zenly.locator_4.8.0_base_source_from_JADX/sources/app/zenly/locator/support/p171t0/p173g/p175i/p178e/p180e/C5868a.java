package app.zenly.locator.support.p171t0.p173g.p175i.p178e.p180e;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.support.t0.g.i.e.e.a */
public final class C5868a {

    /* renamed from: a */
    private final String f14845a;

    /* renamed from: b */
    private final String f14846b;

    public C5868a(String str, String str2) {
        C12932j.m33818b(str, "title");
        C12932j.m33818b(str2, "subtitle");
        this.f14845a = str;
        this.f14846b = str2;
    }

    /* renamed from: a */
    public final String mo13547a() {
        return this.f14846b;
    }

    /* renamed from: b */
    public final String mo13548b() {
        return this.f14845a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f14846b, (java.lang.Object) r3.f14846b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof app.zenly.locator.support.p171t0.p173g.p175i.p178e.p180e.C5868a
            if (r0 == 0) goto L_0x001d
            app.zenly.locator.support.t0.g.i.e.e.a r3 = (app.zenly.locator.support.p171t0.p173g.p175i.p178e.p180e.C5868a) r3
            java.lang.String r0 = r2.f14845a
            java.lang.String r1 = r3.f14845a
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f14846b
            java.lang.String r3 = r3.f14846b
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.p171t0.p173g.p175i.p178e.p180e.C5868a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f14845a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f14846b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuggestedPlace(title=");
        sb.append(this.f14845a);
        sb.append(", subtitle=");
        sb.append(this.f14846b);
        sb.append(")");
        return sb.toString();
    }
}
