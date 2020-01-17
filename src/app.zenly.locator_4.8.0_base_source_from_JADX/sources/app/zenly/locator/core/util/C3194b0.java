package app.zenly.locator.core.util;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.util.b0 */
public final class C3194b0 {
    /* renamed from: a */
    public static final boolean m10164a(UserProto$User userProto$User, String str) {
        C12932j.m33818b(userProto$User, "$this$hasRole");
        C12932j.m33818b(str, "requiredRole");
        return userProto$User.getRolesList().contains(str);
    }

    /* renamed from: a */
    public static final boolean m10163a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "$this$hasAvatar");
        return userProto$User.getAvatarVersion() != 0;
    }
}
