package app.zenly.locator.p017a0.p035r;

import android.app.Activity;
import android.content.Context;
import app.zenly.locator.p017a0.C1512f;
import app.zenly.locator.p017a0.C1526m;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7302f3;
import p213co.znly.models.UserProto$DisabledNotifications;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;

/* renamed from: app.zenly.locator.a0.r.a */
public abstract class C1650a extends C1512f {

    /* renamed from: Q */
    private UserProto$User f5671Q;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7050a(Context context, UserProto$User userProto$User) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(userProto$User, "newUser");
        this.f5671Q = userProto$User;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7254a(C7302f3 f3Var, boolean z) {
        C12932j.m33818b(f3Var, "notificationType");
        UserProto$User userProto$User = this.f5671Q;
        if (userProto$User != null) {
            m6946a(userProto$User, f3Var, z);
        }
    }

    /* renamed from: a */
    private final void m6946a(UserProto$User userProto$User, C7302f3 f3Var, boolean z) {
        UserProto$DisabledNotifications disabledNotifications = userProto$User.getDisabledNotifications();
        String str = "currentUser.disabledNotifications";
        C12932j.m33815a((Object) disabledNotifications, str);
        if (z != C1651b.m6951a(disabledNotifications, f3Var)) {
            UserProto$DisabledNotifications disabledNotifications2 = userProto$User.getDisabledNotifications();
            C12932j.m33815a((Object) disabledNotifications2, str);
            UserProto$DisabledNotifications a = C1651b.m6949a(disabledNotifications2, f3Var, z);
            C6925a newBuilder = UserProto$User.newBuilder();
            newBuilder.mo18017a(a);
            UserProto$User userProto$User2 = (UserProto$User) newBuilder.build();
            C12932j.m33815a((Object) userProto$User2, "newUser");
            Activity A = mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            C1526m.m6700b(userProto$User2, A);
        }
    }
}
