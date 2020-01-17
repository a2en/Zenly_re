package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.d */
public final class C2941d extends C2937b {

    /* renamed from: a */
    private final C2935a f8325a;

    public C2941d(C2935a aVar) {
        C12932j.m33818b(aVar, "item");
        super(null);
        this.f8325a = aVar;
    }

    /* renamed from: a */
    public final C2935a mo9082a() {
        return this.f8325a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8325a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2941d) r2).f8325a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2941d
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.d r2 = (app.zenly.locator.core.store.api.C2941d) r2
            app.zenly.locator.core.store.api.a r0 = r1.f8325a
            app.zenly.locator.core.store.api.a r2 = r2.f8325a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2941d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2935a aVar = this.f8325a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactAlreadyOnZenlyDelete(item=");
        sb.append(this.f8325a);
        sb.append(")");
        return sb.toString();
    }
}
