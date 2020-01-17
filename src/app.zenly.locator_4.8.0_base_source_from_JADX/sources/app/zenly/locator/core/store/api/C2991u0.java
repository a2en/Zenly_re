package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C6980c3;

/* renamed from: app.zenly.locator.core.store.api.u0 */
public final class C2991u0 {

    /* renamed from: a */
    private final C6980c3 f8380a;

    public C2991u0(C6980c3 c3Var) {
        C12932j.m33818b(c3Var, "info");
        this.f8380a = c3Var;
    }

    /* renamed from: a */
    public final C6980c3 mo9175a() {
        return this.f8380a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8380a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2991u0) r2).f8380a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2991u0
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.u0 r2 = (app.zenly.locator.core.store.api.C2991u0) r2
            co.znly.models.c3 r0 = r1.f8380a
            co.znly.models.c3 r2 = r2.f8380a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2991u0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C6980c3 c3Var = this.f8380a;
        if (c3Var != null) {
            return c3Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Friendship(info=");
        sb.append(this.f8380a);
        sb.append(")");
        return sb.toString();
    }
}
