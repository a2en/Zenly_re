package app.zenly.locator.core.store;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.m */
final class C3051m extends C3052n {

    /* renamed from: b */
    private final String f8448b;

    public C3051m(String str) {
        C12932j.m33818b(str, "uuid");
        super(null);
        this.f8448b = str;
    }

    /* renamed from: a */
    public final String mo9232a() {
        return this.f8448b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8448b, (java.lang.Object) ((app.zenly.locator.core.store.C3051m) r2).f8448b) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.C3051m
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.m r2 = (app.zenly.locator.core.store.C3051m) r2
            java.lang.String r0 = r1.f8448b
            java.lang.String r2 = r2.f8448b
            boolean r2 = kotlin.jvm.internal.C12932j.m33817a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.C3051m.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f8448b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuggestedContact(uuid=");
        sb.append(this.f8448b);
        sb.append(")");
        return sb.toString();
    }
}
