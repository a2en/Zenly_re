package app.zenly.locator.userprofile.p198me.p204l;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.userprofile.me.l.i */
public final class C6142i {

    /* renamed from: a */
    private final UserProto$User f15418a;

    public C6142i(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        this.f15418a = userProto$User;
    }

    /* renamed from: a */
    public final UserProto$User mo13981a() {
        return this.f15418a;
    }

    /* renamed from: a */
    public final boolean mo13982a(C6142i iVar) {
        C12932j.m33818b(iVar, "model");
        return C12932j.m33817a((Object) this.f15418a.getUuid(), (Object) iVar.f15418a.getUuid()) && C12932j.m33817a((Object) this.f15418a.getName(), (Object) iVar.f15418a.getName()) && C12932j.m33817a((Object) this.f15418a.getUsername(), (Object) iVar.f15418a.getUsername()) && this.f15418a.getAvatarVersion() == iVar.f15418a.getAvatarVersion() && C12932j.m33817a((Object) this.f15418a.getAvatarUrlPrefix(), (Object) iVar.f15418a.getAvatarUrlPrefix());
    }
}
