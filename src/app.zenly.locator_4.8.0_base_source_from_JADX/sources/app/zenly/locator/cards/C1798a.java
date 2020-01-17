package app.zenly.locator.cards;

import app.zenly.locator.cards.models.BestFriendV2Card;
import app.zenly.locator.cards.models.BestFriendV2Card.C1861a;
import app.zenly.locator.cards.models.BestFriendV2Card.C1863c;
import app.zenly.locator.cards.models.BestFriendV2Card.CardUser;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.friendshipfacts.p099l.C3809c;
import app.zenly.locator.friendshipfacts.p099l.C3810d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;

/* renamed from: app.zenly.locator.cards.a */
public final class C1798a {
    /* renamed from: a */
    public static final List<Card> m7229a(TimeTogetherProto$Tst timeTogetherProto$Tst, CardUser cardUser, Timestamp timestamp, boolean z) {
        C1863c cVar;
        C12932j.m33818b(timeTogetherProto$Tst, "$this$toCards");
        C12932j.m33818b(cardUser, "cardUser");
        if (timeTogetherProto$Tst.getMeetCount() == 0) {
            return C12848o.m33640a();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1861a.m7406a(BestFriendV2Card.f6084x, C1863c.HANGOUT, cardUser, timeTogetherProto$Tst.getMeetCount(), false, false, null, z, 56, null));
        if (timestamp != null) {
            arrayList.add(C1861a.m7406a(BestFriendV2Card.f6084x, C1863c.FRIENDSHIP, cardUser, C3245z.m10280a(timestamp), false, false, null, z, 56, null));
        }
        if (timeTogetherProto$Tst.getTimeTogetherAllTime() > 0) {
            arrayList.add(C1861a.m7406a(BestFriendV2Card.f6084x, C1863c.TIME_TOGETHER, cardUser, (int) TimeUnit.SECONDS.toHours(timeTogetherProto$Tst.getTimeTogetherAllTime()), false, false, null, z, 56, null));
        }
        Timestamp ts = timeTogetherProto$Tst.getTs();
        String str = "ts";
        C12932j.m33815a((Object) ts, str);
        if (!C3245z.m10286e(ts)) {
            Timestamp ts2 = timeTogetherProto$Tst.getTs();
            C12932j.m33815a((Object) ts2, str);
            int a = C3245z.m10280a(ts2);
            if (a != 0) {
                if (a >= C3810d.m11296a()) {
                    cVar = C1863c.NO_SEE;
                } else {
                    cVar = C1863c.STREAK;
                }
                arrayList.add(C1861a.m7406a(BestFriendV2Card.f6084x, cVar, cardUser, a, false, false, null, z, 56, null));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final Card m7228a(C3809c cVar) {
        C12932j.m33818b(cVar, "$this$toCards");
        C1861a aVar = BestFriendV2Card.f6084x;
        C1863c cVar2 = cVar.mo10388b() < 0 ? C1863c.NO_SEE : C1863c.STREAK;
        String uuid = cVar.mo10389c().getUuid();
        C12932j.m33815a((Object) uuid, "user.uuid");
        String username = cVar.mo10389c().getUsername();
        C12932j.m33815a((Object) username, "user.username");
        return C1861a.m7406a(aVar, cVar2, new CardUser(uuid, username), Math.abs(cVar.mo10388b()), false, false, null, false, 120, null);
    }
}
