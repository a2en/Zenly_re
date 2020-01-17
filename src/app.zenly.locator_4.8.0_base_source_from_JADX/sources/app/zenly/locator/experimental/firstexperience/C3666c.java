package app.zenly.locator.experimental.firstexperience;

import android.app.Activity;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p196u.p197b.C5943a;
import app.zenly.locator.p196u.p197b.C5943a.C5944a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.experimental.firstexperience.c */
public final class C3666c extends C3664b {

    /* renamed from: b */
    private final C5943a f9822b;

    /* renamed from: c */
    private final UserProto$User f9823c;

    /* renamed from: d */
    private final int f9824d;

    /* renamed from: e */
    private final NavigationContract f9825e;

    /* renamed from: f */
    private final C3677h f9826f;

    public C3666c(C5943a aVar, UserProto$User userProto$User, int i, NavigationContract navigationContract, C3677h hVar) {
        C12932j.m33818b(aVar, "analytics");
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(navigationContract, "navigationContract");
        C12932j.m33818b(hVar, "noFriendPreferences");
        super(null);
        this.f9822b = aVar;
        this.f9823c = userProto$User;
        this.f9824d = i;
        this.f9825e = navigationContract;
        this.f9826f = hVar;
    }

    /* renamed from: a */
    public boolean mo10176a() {
        if (this.f9823c.getFriendsCount() == 0) {
            Timestamp createdAt = this.f9823c.getCreatedAt();
            C12932j.m33815a((Object) createdAt, "user.createdAt");
            if (C3245z.m10287f(createdAt) >= 5 && this.f9824d == 0 && !this.f9826f.mo10195c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo10175a(Activity activity) {
        C12932j.m33818b(activity, "activity");
        this.f9822b.mo13646b(C5944a.f14965g);
        this.f9822b.mo13650c(C5944a.f14965g);
        this.f9826f.mo10192b(true);
        this.f9825e.displayNoFriendController();
    }
}
