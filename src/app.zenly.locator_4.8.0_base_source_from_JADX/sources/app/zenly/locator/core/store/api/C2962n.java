package app.zenly.locator.core.store.api;

import java.util.List;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.n */
public final class C2962n extends C2951i {

    /* renamed from: a */
    private final List<C2949h> f8350a;

    public C2962n(List<C2949h> list) {
        C12932j.m33818b(list, "items");
        super(null);
        this.f8350a = list;
    }

    /* renamed from: a */
    public final List<C2949h> mo9143a() {
        return this.f8350a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8350a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2962n) r2).f8350a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2962n
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.n r2 = (app.zenly.locator.core.store.api.C2962n) r2
            java.util.List<app.zenly.locator.core.store.api.h> r0 = r1.f8350a
            java.util.List<app.zenly.locator.core.store.api.h> r2 = r2.f8350a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2962n.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        List<C2949h> list = this.f8350a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactSoonOnZenlysUpdate(items=");
        sb.append(this.f8350a);
        sb.append(")");
        return sb.toString();
    }
}
