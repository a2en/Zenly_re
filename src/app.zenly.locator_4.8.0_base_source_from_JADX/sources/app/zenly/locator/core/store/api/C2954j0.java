package app.zenly.locator.core.store.api;

import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.j0 */
public final class C2954j0 extends C2952i0 {

    /* renamed from: a */
    private final List<C2946f0> f8338a;

    public C2954j0(List<C2946f0> list) {
        C12932j.m33818b(list, "infos");
        super(null);
        this.f8338a = list;
    }

    /* renamed from: a */
    public final List<C2946f0> mo9113a() {
        return this.f8338a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8338a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2954j0) r2).f8338a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2954j0
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.j0 r2 = (app.zenly.locator.core.store.api.C2954j0) r2
            java.util.List<app.zenly.locator.core.store.api.f0> r0 = r1.f8338a
            java.util.List<app.zenly.locator.core.store.api.f0> r2 = r2.f8338a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2954j0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<C2946f0> list = this.f8338a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendRanksUpdate(infos=");
        sb.append(this.f8338a);
        sb.append(")");
        return sb.toString();
    }
}
