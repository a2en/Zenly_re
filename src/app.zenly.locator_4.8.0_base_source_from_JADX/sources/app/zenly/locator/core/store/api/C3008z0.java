package app.zenly.locator.core.store.api;

import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.z0 */
public final class C3008z0 extends C3004y0 {

    /* renamed from: a */
    private final List<C2991u0> f8399a;

    public C3008z0(List<C2991u0> list) {
        C12932j.m33818b(list, "items");
        super(null);
        this.f8399a = list;
    }

    /* renamed from: a */
    public final List<C2991u0> mo9194a() {
        return this.f8399a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8399a, (java.lang.Object) ((app.zenly.locator.core.store.api.C3008z0) r2).f8399a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C3008z0
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.z0 r2 = (app.zenly.locator.core.store.api.C3008z0) r2
            java.util.List<app.zenly.locator.core.store.api.u0> r0 = r1.f8399a
            java.util.List<app.zenly.locator.core.store.api.u0> r2 = r2.f8399a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C3008z0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<C2991u0> list = this.f8399a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendshipsUpdate(items=");
        sb.append(this.f8399a);
        sb.append(")");
        return sb.toString();
    }
}