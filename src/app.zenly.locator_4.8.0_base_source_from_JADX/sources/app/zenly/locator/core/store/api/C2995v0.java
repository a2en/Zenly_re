package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.v0 */
public final class C2995v0 extends C3004y0 {

    /* renamed from: a */
    private final C2991u0 f8385a;

    public C2995v0(C2991u0 u0Var) {
        C12932j.m33818b(u0Var, "item");
        super(null);
        this.f8385a = u0Var;
    }

    /* renamed from: a */
    public final C2991u0 mo9181a() {
        return this.f8385a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8385a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2995v0) r2).f8385a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2995v0
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.v0 r2 = (app.zenly.locator.core.store.api.C2995v0) r2
            app.zenly.locator.core.store.api.u0 r0 = r1.f8385a
            app.zenly.locator.core.store.api.u0 r2 = r2.f8385a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2995v0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2991u0 u0Var = this.f8385a;
        if (u0Var != null) {
            return u0Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendshipDelete(item=");
        sb.append(this.f8385a);
        sb.append(")");
        return sb.toString();
    }
}
