package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.r0 */
public final class C2983r0 extends C2985s0 {

    /* renamed from: a */
    private final C2936a0 f8372a;

    public C2983r0(C2936a0 a0Var) {
        C12932j.m33818b(a0Var, "friend");
        super(null);
        this.f8372a = a0Var;
    }

    /* renamed from: a */
    public final C2936a0 mo9165a() {
        return this.f8372a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8372a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2983r0) r2).f8372a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2983r0
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.r0 r2 = (app.zenly.locator.core.store.api.C2983r0) r2
            app.zenly.locator.core.store.api.a0 r0 = r1.f8372a
            app.zenly.locator.core.store.api.a0 r2 = r2.f8372a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2983r0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2936a0 a0Var = this.f8372a;
        if (a0Var != null) {
            return a0Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendUpdate(friend=");
        sb.append(this.f8372a);
        sb.append(")");
        return sb.toString();
    }
}
