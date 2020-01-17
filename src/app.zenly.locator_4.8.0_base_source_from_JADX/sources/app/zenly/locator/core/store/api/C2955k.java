package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.k */
public final class C2955k extends C2951i {

    /* renamed from: a */
    private final C2949h f8339a;

    public C2955k(C2949h hVar) {
        C12932j.m33818b(hVar, "item");
        super(null);
        this.f8339a = hVar;
    }

    /* renamed from: a */
    public final C2949h mo9117a() {
        return this.f8339a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8339a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2955k) r2).f8339a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2955k
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.k r2 = (app.zenly.locator.core.store.api.C2955k) r2
            app.zenly.locator.core.store.api.h r0 = r1.f8339a
            app.zenly.locator.core.store.api.h r2 = r2.f8339a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2955k.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2949h hVar = this.f8339a;
        if (hVar != null) {
            return hVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactSoonOnZenlyDelete(item=");
        sb.append(this.f8339a);
        sb.append(")");
        return sb.toString();
    }
}
