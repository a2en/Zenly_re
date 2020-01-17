package app.zenly.locator.p086e0.p087a.p091l;

import app.zenly.locator.cards.C1798a;
import app.zenly.locator.cards.models.BestFriendV2Card.CardUser;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.p086e0.p087a.C3619h;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6926b;
import p213co.znly.models.timetogether.TimeTogetherProto$Tst;

/* renamed from: app.zenly.locator.e0.a.l.f */
public final class C3661f extends C11722a {

    /* renamed from: f */
    private final Timestamp f9807f;

    /* renamed from: g */
    private final int f9808g = this.f9812k.getFriendsCount();

    /* renamed from: h */
    private final int f9809h;

    /* renamed from: i */
    private final int f9810i;

    /* renamed from: j */
    private final boolean f9811j;

    /* renamed from: k */
    private final UserProto$User f9812k;

    /* renamed from: l */
    private final TimeTogetherProto$Tst f9813l;

    public C3661f(UserProto$User userProto$User, TimeTogetherProto$Tst timeTogetherProto$Tst, C2991u0 u0Var) {
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(u0Var, "friendship");
        super(C3619h.PROFILE_OTHER_VANITY_METRICS, 1);
        this.f9812k = userProto$User;
        this.f9813l = timeTogetherProto$Tst;
        Timestamp createdAt = u0Var.mo9175a().getCreatedAt();
        C12932j.m33815a((Object) createdAt, "friendship.info.createdAt");
        this.f9807f = createdAt;
        C6926b events = this.f9812k.getEvents();
        C12932j.m33815a((Object) events, "user.events");
        this.f9809h = events.getInviterCount();
        TimeTogetherProto$Tst timeTogetherProto$Tst2 = this.f9813l;
        boolean z = false;
        this.f9810i = timeTogetherProto$Tst2 != null ? timeTogetherProto$Tst2.getMeetCount() : 0;
        if (this.f9813l != null) {
            z = true;
        }
        this.f9811j = z;
    }

    /* renamed from: a */
    public final List<Card> mo10167a(String str, String str2, Timestamp timestamp, boolean z) {
        C12932j.m33818b(str, "userUuid");
        C12932j.m33818b(str2, "username");
        TimeTogetherProto$Tst timeTogetherProto$Tst = this.f9813l;
        if (timeTogetherProto$Tst != null) {
            List<Card> a = C1798a.m7229a(timeTogetherProto$Tst, new CardUser(str, str2), timestamp, z);
            if (a != null) {
                return a;
            }
        }
        return C12848o.m33640a();
    }

    /* renamed from: f */
    public final int mo10168f() {
        return this.f9809h;
    }

    /* renamed from: g */
    public final Timestamp mo10169g() {
        return this.f9807f;
    }

    /* renamed from: h */
    public final boolean mo10170h() {
        return this.f9811j;
    }

    /* renamed from: i */
    public final int mo10171i() {
        return this.f9810i;
    }

    /* renamed from: j */
    public final UserProto$User mo10172j() {
        return this.f9812k;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3661f fVar = (C3661f) aVar;
            return this.f9808g == fVar.f9808g && C12932j.m33817a((Object) this.f9812k.getUuid(), (Object) fVar.f9812k.getUuid()) && this.f9809h == fVar.f9809h && this.f9810i == fVar.f9810i && C12932j.m33817a((Object) this.f9807f, (Object) fVar.f9807f) && this.f9811j == fVar.f9811j;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.other.viewmodels.ProfileOtherVanityMetricsViewModel");
    }
}
