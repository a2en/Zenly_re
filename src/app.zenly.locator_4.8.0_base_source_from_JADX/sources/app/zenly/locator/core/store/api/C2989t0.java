package app.zenly.locator.core.store.api;

import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.t0 */
public final class C2989t0 extends C2985s0 {

    /* renamed from: a */
    private final List<C2936a0> f8378a;

    public C2989t0(List<C2936a0> list) {
        C12932j.m33818b(list, "friends");
        super(null);
        this.f8378a = list;
    }

    /* renamed from: a */
    public final List<C2936a0> mo9171a() {
        return this.f8378a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8378a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2989t0) r2).f8378a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2989t0
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.t0 r2 = (app.zenly.locator.core.store.api.C2989t0) r2
            java.util.List<app.zenly.locator.core.store.api.a0> r0 = r1.f8378a
            java.util.List<app.zenly.locator.core.store.api.a0> r2 = r2.f8378a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2989t0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<C2936a0> list = this.f8378a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendsUpdate(friends=");
        sb.append(this.f8378a);
        sb.append(")");
        return sb.toString();
    }
}
