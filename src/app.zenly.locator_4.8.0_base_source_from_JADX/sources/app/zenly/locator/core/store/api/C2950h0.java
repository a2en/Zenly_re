package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.h0 */
public final class C2950h0 extends C2952i0 {

    /* renamed from: a */
    private final C2946f0 f8337a;

    public C2950h0(C2946f0 f0Var) {
        C12932j.m33818b(f0Var, "info");
        super(null);
        this.f8337a = f0Var;
    }

    /* renamed from: a */
    public final C2946f0 mo9109a() {
        return this.f8337a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8337a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2950h0) r2).f8337a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2950h0
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.h0 r2 = (app.zenly.locator.core.store.api.C2950h0) r2
            app.zenly.locator.core.store.api.f0 r0 = r1.f8337a
            app.zenly.locator.core.store.api.f0 r2 = r2.f8337a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2950h0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2946f0 f0Var = this.f8337a;
        if (f0Var != null) {
            return f0Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendRankUpdate(info=");
        sb.append(this.f8337a);
        sb.append(")");
        return sb.toString();
    }
}
