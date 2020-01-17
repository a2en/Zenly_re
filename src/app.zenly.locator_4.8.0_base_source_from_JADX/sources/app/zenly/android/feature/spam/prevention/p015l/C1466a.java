package app.zenly.android.feature.spam.prevention.p015l;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.spam.prevention.l.a */
public final class C1466a {

    /* renamed from: a */
    private final String f5280a;

    public C1466a(String str) {
        C12932j.m33818b(str, "uuid");
        this.f5280a = str;
    }

    /* renamed from: a */
    public final String mo6956a() {
        return this.f5280a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f5280a, (java.lang.Object) ((app.zenly.android.feature.spam.prevention.p015l.C1466a) r2).f5280a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.android.feature.spam.prevention.p015l.C1466a
            if (r0 == 0) goto L_0x0013
            app.zenly.android.feature.spam.prevention.l.a r2 = (app.zenly.android.feature.spam.prevention.p015l.C1466a) r2
            java.lang.String r0 = r1.f5280a
            java.lang.String r2 = r2.f5280a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.spam.prevention.p015l.C1466a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.f5280a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CancelEvent(uuid=");
        sb.append(this.f5280a);
        sb.append(")");
        return sb.toString();
    }
}
