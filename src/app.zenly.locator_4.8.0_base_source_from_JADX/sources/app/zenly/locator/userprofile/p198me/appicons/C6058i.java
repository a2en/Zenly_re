package app.zenly.locator.userprofile.p198me.appicons;

import app.zenly.locator.core.util.C3222k;
import app.zenly.locator.core.util.C3245z;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$UserEngagementStats;
import p213co.znly.models.UserProto$UserEngagementStats.C6931c;

/* renamed from: app.zenly.locator.userprofile.me.appicons.i */
public final class C6058i {
    /* renamed from: a */
    public static final int m16808a(UserProto$UserEngagementStats userProto$UserEngagementStats) {
        C12932j.m33818b(userProto$UserEngagementStats, "$this$currentStreakDays");
        C6931c currentStreak = userProto$UserEngagementStats.getCurrentStreak();
        String str = "currentStreak";
        C12932j.m33815a((Object) currentStreak, str);
        Timestamp start = currentStreak.getStart();
        C12932j.m33815a((Object) start, "currentStreak.start");
        long g = C3245z.m10288g(start);
        C6931c currentStreak2 = userProto$UserEngagementStats.getCurrentStreak();
        C12932j.m33815a((Object) currentStreak2, str);
        Timestamp end = currentStreak2.getEnd();
        C12932j.m33815a((Object) end, "currentStreak.end");
        return C3222k.m10214a(g, C3245z.m10288g(end)) + 1;
    }
}
