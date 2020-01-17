package app.zenly.locator.dashboard.p081z;

import app.zenly.locator.dashboard.C3320q;
import app.zenly.locator.dashboard.C3321r;
import app.zenly.locator.dashboard.C3324u;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.dashboard.z.l */
public final class C3434l extends C11722a {

    /* renamed from: f */
    private final boolean f9444f = this.f9449k;

    /* renamed from: g */
    private final C3435m f9445g;

    /* renamed from: h */
    private final UserProto$User f9446h;

    /* renamed from: i */
    private final boolean f9447i;

    /* renamed from: j */
    private final boolean f9448j;

    /* renamed from: k */
    private final boolean f9449k;

    public C3434l(long j, C3435m mVar, UserProto$User userProto$User, String str, boolean z, boolean z2, boolean z3) {
        C12932j.m33818b(mVar, "presentationType");
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(str, "displayName");
        super(C3324u.MINI_USER, j);
        this.f9445g = mVar;
        this.f9446h = userProto$User;
        this.f9447i = z;
        this.f9448j = z2;
        this.f9449k = z3;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C3434l lVar = (C3434l) aVar;
        return this.f9446h.getAvatarVersion() == lVar.f9446h.getAvatarVersion() && this.f9447i == lVar.f9447i && this.f9448j == lVar.f9448j && this.f9449k == lVar.f9449k;
    }

    /* renamed from: f */
    public final C3320q mo9950f() {
        return new C3320q(this.f9445g, this.f9446h, this.f9447i);
    }

    /* renamed from: g */
    public final C3321r mo9951g() {
        return new C3321r(this.f9445g, this.f9446h);
    }

    /* renamed from: h */
    public final UserProto$User mo9952h() {
        return this.f9446h;
    }

    /* renamed from: i */
    public final boolean mo9953i() {
        return this.f9444f;
    }
}
