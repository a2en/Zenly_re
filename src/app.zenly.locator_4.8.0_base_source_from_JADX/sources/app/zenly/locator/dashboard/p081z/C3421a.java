package app.zenly.locator.dashboard.p081z;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.dashboard.z.a */
public final class C3421a {

    /* renamed from: a */
    private final UserProto$User f9415a;

    /* renamed from: b */
    private final String f9416b;

    public C3421a(long j, UserProto$User userProto$User, String str, String str2) {
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(str, "userUuid");
        C12932j.m33818b(str2, "displayName");
        this.f9415a = userProto$User;
        this.f9416b = str;
    }

    /* renamed from: a */
    public final UserProto$User mo9926a() {
        return this.f9415a;
    }

    /* renamed from: b */
    public final String mo9927b() {
        return this.f9416b;
    }
}
