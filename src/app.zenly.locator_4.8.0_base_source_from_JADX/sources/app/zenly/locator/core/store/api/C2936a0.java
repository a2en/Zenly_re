package app.zenly.locator.core.store.api;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.store.api.a0 */
public final class C2936a0 {

    /* renamed from: a */
    private final UserProto$User f8322a;

    public C2936a0(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        this.f8322a = userProto$User;
    }

    /* renamed from: a */
    public final UserProto$User mo9074a() {
        return this.f8322a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r1.f8322a, (java.lang.Object) ((app.zenly.locator.core.store.api.C2936a0) r2).f8322a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof app.zenly.locator.core.store.api.C2936a0
            if (r0 == 0) goto L_0x0013
            app.zenly.locator.core.store.api.a0 r2 = (app.zenly.locator.core.store.api.C2936a0) r2
            co.znly.models.UserProto$User r0 = r1.f8322a
            co.znly.models.UserProto$User r2 = r2.f8322a
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
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.store.api.C2936a0.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        UserProto$User userProto$User = this.f8322a;
        if (userProto$User != null) {
            return userProto$User.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Friend(user=");
        sb.append(this.f8322a);
        sb.append(")");
        return sb.toString();
    }
}
