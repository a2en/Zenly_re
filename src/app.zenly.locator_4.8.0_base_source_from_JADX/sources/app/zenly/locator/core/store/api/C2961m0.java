package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.m0 */
public final class C2961m0 extends C2973p0 {

    /* renamed from: a */
    private final C2956k0 f8349a;

    public C2961m0(C2956k0 k0Var) {
        C12932j.m33818b(k0Var, "item");
        super(null);
        this.f8349a = k0Var;
    }

    /* renamed from: a */
    public final C2956k0 mo9139a() {
        return this.f8349a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8349a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2961m0) r2).f8349a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2961m0
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.m0 r2 = (app.zenly.locator.core.store.api.C2961m0) r2
            app.zenly.locator.core.store.api.k0 r0 = r1.f8349a
            app.zenly.locator.core.store.api.k0 r2 = r2.f8349a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2961m0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2956k0 k0Var = this.f8349a;
        if (k0Var != null) {
            return k0Var.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendRequestDelete(item=");
        sb.append(this.f8349a);
        sb.append(")");
        return sb.toString();
    }
}
