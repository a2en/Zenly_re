package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.store.api.f */
public final class C2945f extends C2937b {

    /* renamed from: a */
    private final C2935a f8328a;

    public C2945f(C2935a aVar) {
        C12932j.m33818b(aVar, "item");
        super(null);
        this.f8328a = aVar;
    }

    /* renamed from: a */
    public final C2935a mo9090a() {
        return this.f8328a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8328a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2945f) r2).f8328a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2945f
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.f r2 = (app.zenly.locator.core.store.api.C2945f) r2
            app.zenly.locator.core.store.api.a r0 = r1.f8328a
            app.zenly.locator.core.store.api.a r2 = r2.f8328a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2945f.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C2935a aVar = this.f8328a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactAlreadyOnZenlyUpdate(item=");
        sb.append(this.f8328a);
        sb.append(")");
        return sb.toString();
    }
}
