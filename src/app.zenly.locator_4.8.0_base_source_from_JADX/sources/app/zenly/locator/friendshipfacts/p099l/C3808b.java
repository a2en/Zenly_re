package app.zenly.locator.friendshipfacts.p099l;

import app.zenly.locator.core.util.C3245z;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$BestFriend.C6920c;
import p213co.znly.models.core.C7210s0;
import p213co.znly.models.services.ZenlyProto$BestFriend.C7938b;
import p213co.znly.models.timetogether.C8433b;

/* renamed from: app.zenly.locator.friendshipfacts.l.b */
public final class C3808b {
    /* renamed from: a */
    private static final C7938b m11288a(C7210s0 s0Var) {
        Object obj;
        boolean z;
        List bestCategoriesList = s0Var.getBestCategoriesList();
        C12932j.m33815a((Object) bestCategoriesList, "bestCategoriesList");
        Iterator it = bestCategoriesList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C7938b bVar = (C7938b) obj;
            C12932j.m33815a((Object) bVar, "it");
            if (bVar.getCategory() == C8433b.MUTUAL_LOVE || bVar.getCategory() == C8433b.ALL_TIME_MUTUAL_LOVE) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return (C7938b) obj;
    }

    /* renamed from: b */
    public static final boolean m11289b(C7210s0 s0Var) {
        C12932j.m33818b(s0Var, "$this$isCandidate");
        return s0Var.getLevel() == C6920c.CANDIDATE;
    }

    /* renamed from: c */
    public static final boolean m11290c(C7210s0 s0Var) {
        C12932j.m33818b(s0Var, "$this$isMutualLove");
        return m11288a(s0Var) != null;
    }

    /* renamed from: d */
    public static final int m11291d(C7210s0 s0Var) {
        int i;
        C12932j.m33818b(s0Var, "$this$mutualLoveWeekStreak");
        C7938b a = m11288a(s0Var);
        if (a != null) {
            Timestamp bestSince = a.getBestSince();
            if (bestSince != null) {
                i = C3245z.m10280a(bestSince);
                return i / 7;
            }
        }
        i = 0;
        return i / 7;
    }

    /* renamed from: e */
    public static final Integer m11292e(C7210s0 s0Var) {
        C12932j.m33818b(s0Var, "$this$remainingHours");
        if (!s0Var.hasValidUntil()) {
            return null;
        }
        Timestamp validUntil = s0Var.getValidUntil();
        C12932j.m33815a((Object) validUntil, "validUntil");
        return Integer.valueOf(C3245z.m10285d(validUntil));
    }
}
