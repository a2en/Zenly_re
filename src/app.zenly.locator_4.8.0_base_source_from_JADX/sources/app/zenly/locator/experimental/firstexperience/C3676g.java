package app.zenly.locator.experimental.firstexperience;

import android.app.Activity;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p196u.p197b.C5943a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.experimental.firstexperience.g */
public final class C3676g extends C3664b {

    /* renamed from: b */
    private final C5943a f9846b;

    /* renamed from: c */
    private final UserProto$User f9847c;

    /* renamed from: d */
    private final int f9848d;

    /* renamed from: e */
    private final C3677h f9849e;

    public C3676g(C5943a aVar, UserProto$User userProto$User, int i, C3677h hVar) {
        C12932j.m33818b(aVar, "analytics");
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(hVar, "noFriendPreferences");
        super(null);
        this.f9846b = aVar;
        this.f9847c = userProto$User;
        this.f9848d = i;
        this.f9849e = hVar;
    }

    /* renamed from: a */
    public boolean mo10176a() {
        if (this.f9847c.getFriendsCount() == 0) {
            Timestamp createdAt = this.f9847c.getCreatedAt();
            C12932j.m33815a((Object) createdAt, "user.createdAt");
            if (C3245z.m10287f(createdAt) >= 5 && this.f9848d == 0 && !this.f9849e.mo10196d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo10175a(Activity activity) {
        C12932j.m33818b(activity, "activity");
        this.f9849e.mo10194c(true);
        this.f9846b.mo13638a();
    }
}
