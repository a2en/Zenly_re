package app.zenly.locator.userprofile.p198me.p204l;

import app.zenly.locator.userprofile.p198me.C6080f;
import app.zenly.locator.userprofile.p198me.appicons.C6052e;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$UserEngagementStats;

/* renamed from: app.zenly.locator.userprofile.me.l.b */
public final class C6135b extends C11722a {

    /* renamed from: f */
    private final UserProto$UserEngagementStats f15408f;

    /* renamed from: g */
    private final C6052e f15409g;

    public C6135b(UserProto$UserEngagementStats userProto$UserEngagementStats, C6052e eVar) {
        C12932j.m33818b(userProto$UserEngagementStats, "userEngagementStats");
        C12932j.m33818b(eVar, "appIconsPrefs");
        super(C6080f.APP_ICONS, 1);
        this.f15408f = userProto$UserEngagementStats;
        this.f15409g = eVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C6135b bVar = (C6135b) aVar;
            return this.f15408f.getLevelValue() == bVar.f15408f.getLevelValue() && C12932j.m33817a((Object) this.f15408f.getCurrentStreak(), (Object) bVar.f15408f.getCurrentStreak()) && this.f15408f.getCurrentFriendsCount() == bVar.f15408f.getCurrentFriendsCount();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.me.viewmodels.MyProfileAppIconsViewModel");
    }

    /* renamed from: f */
    public final C6052e mo13971f() {
        return this.f15409g;
    }

    /* renamed from: g */
    public final UserProto$UserEngagementStats mo13972g() {
        return this.f15408f;
    }
}
