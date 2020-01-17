package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.store.api.a */
public final class C2935a {

    /* renamed from: a */
    private final C7339i f8320a;

    /* renamed from: b */
    private final UserProto$User f8321b;

    public C2935a(C7339i iVar, UserProto$User userProto$User) {
        C12932j.m33818b(iVar, "contact");
        C12932j.m33818b(userProto$User, "user");
        this.f8320a = iVar;
        this.f8321b = userProto$User;
    }

    /* renamed from: a */
    public final C7339i mo9069a() {
        return this.f8320a;
    }

    /* renamed from: b */
    public final UserProto$User mo9070b() {
        return this.f8321b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f8321b, (java.lang.Object) r3.f8321b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof app.zenly.locator.core.store.api.C2935a
            if (r0 == 0) goto L_0x001d
            app.zenly.locator.core.store.api.a r3 = (app.zenly.locator.core.store.api.C2935a) r3
            co.znly.models.i r0 = r2.f8320a
            co.znly.models.i r1 = r3.f8320a
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x001d
            co.znly.models.UserProto$User r0 = r2.f8321b
            co.znly.models.UserProto$User r3 = r3.f8321b
            boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2935a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        C7339i iVar = this.f8320a;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        UserProto$User userProto$User = this.f8321b;
        if (userProto$User != null) {
            i = userProto$User.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContactAlreadyOnZenly(contact=");
        sb.append(this.f8320a);
        sb.append(", user=");
        sb.append(this.f8321b);
        sb.append(")");
        return sb.toString();
    }
}
