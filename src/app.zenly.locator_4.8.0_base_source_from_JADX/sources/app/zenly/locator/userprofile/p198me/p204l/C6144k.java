package app.zenly.locator.userprofile.p198me.p204l;

import app.zenly.android.feature.descendants.feedback.C1381b;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs.C1379a;
import app.zenly.locator.cards.models.C1871b;
import app.zenly.locator.p143s.C5343a.C5366w;
import app.zenly.locator.userprofile.p198me.C6080f;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.services.C8361w5;

/* renamed from: app.zenly.locator.userprofile.me.l.k */
public final class C6144k extends C11722a {

    /* renamed from: f */
    private final int f15420f = this.f15425k.getFriendsCount();

    /* renamed from: g */
    private final int f15421g;

    /* renamed from: h */
    private final int f15422h;

    /* renamed from: i */
    private final C1871b f15423i;

    /* renamed from: j */
    private final C5366w f15424j;

    /* renamed from: k */
    private final UserProto$User f15425k;

    /* renamed from: l */
    private final int f15426l;

    /* renamed from: m */
    private final int f15427m;

    /* renamed from: n */
    private final C1379a f15428n;

    /* renamed from: o */
    private final C1381b f15429o;

    public C6144k(UserProto$User userProto$User, int i, int i2, C1379a aVar, C1381b bVar, C8361w5 w5Var) {
        C1871b bVar2;
        C5366w wVar;
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(aVar, "descendantsAllPrefs");
        C12932j.m33818b(bVar, "descendantsNewCountInterceptor");
        C12932j.m33818b(w5Var, "todayWatchersResponse");
        super(C6080f.VANITY_METRICS, 1);
        this.f15425k = userProto$User;
        this.f15426l = i;
        this.f15427m = i2;
        this.f15428n = aVar;
        this.f15429o = bVar;
        this.f15421g = w5Var.getTimes();
        this.f15422h = w5Var.getBy();
        int i3 = this.f15421g;
        if (i3 > 100) {
            bVar2 = C1871b.Gold;
        } else if (i3 > 50) {
            bVar2 = C1871b.Silver;
        } else if (i3 > 10) {
            bVar2 = C1871b.Bronze;
        } else {
            bVar2 = C1871b.Wood;
        }
        this.f15423i = bVar2;
        int i4 = this.f15421g;
        if (i4 > 100) {
            wVar = C5366w.GOLD;
        } else if (i4 > 50) {
            wVar = C5366w.SILVER;
        } else if (i4 > 10) {
            wVar = C5366w.BRONZE;
        } else {
            wVar = C5366w.WOOD;
        }
        this.f15424j = wVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C6144k kVar = (C6144k) aVar;
            return this.f15420f == kVar.f15420f && C12932j.m33817a((Object) this.f15425k.getUuid(), (Object) kVar.f15425k.getUuid()) && this.f15427m == kVar.f15427m && this.f15426l == kVar.f15426l && C12932j.m33817a((Object) this.f15428n, (Object) kVar.f15428n) && this.f15421g == kVar.f15421g && this.f15422h == kVar.f15422h;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.me.viewmodels.MyProfileVanityMetricsViewModel");
    }

    /* renamed from: f */
    public final C5366w mo13984f() {
        return this.f15424j;
    }

    /* renamed from: g */
    public final C1871b mo13985g() {
        return this.f15423i;
    }

    /* renamed from: h */
    public final C1379a mo13986h() {
        return this.f15428n;
    }

    /* renamed from: i */
    public final C1381b mo13987i() {
        return this.f15429o;
    }

    /* renamed from: j */
    public final int mo13988j() {
        return this.f15420f;
    }

    /* renamed from: k */
    public final int mo13989k() {
        return this.f15427m;
    }

    /* renamed from: l */
    public final int mo13990l() {
        return this.f15421g;
    }

    /* renamed from: m */
    public final int mo13991m() {
        return this.f15422h;
    }

    /* renamed from: n */
    public final UserProto$User mo13992n() {
        return this.f15425k;
    }
}
