package app.zenly.locator.dashboard.p081z;

import app.zenly.locator.dashboard.C3321r;
import app.zenly.locator.dashboard.C3322s;
import app.zenly.locator.dashboard.C3324u;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.dashboard.z.o */
public final class C3437o extends C11722a {

    /* renamed from: f */
    private final boolean f9458f;

    /* renamed from: g */
    private final C3435m f9459g;

    /* renamed from: h */
    private final UserProto$User f9460h;

    /* renamed from: i */
    private final String f9461i;

    /* renamed from: j */
    private final boolean f9462j;

    /* renamed from: k */
    private final boolean f9463k;

    /* renamed from: l */
    private final boolean f9464l;

    public /* synthetic */ C3437o(long j, C3435m mVar, UserProto$User userProto$User, String str, boolean z, boolean z2, boolean z3, int i, C12928f fVar) {
        this(j, mVar, userProto$User, str, z, z2, (i & 64) != 0 ? false : z3);
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C3437o oVar = (C3437o) aVar;
        return C12932j.m33817a((Object) this.f9461i, (Object) oVar.f9461i) && this.f9460h.getFriendsCount() == oVar.f9460h.getFriendsCount() && this.f9460h.getAvatarVersion() == oVar.f9460h.getAvatarVersion() && this.f9462j == oVar.f9462j && this.f9463k == oVar.f9463k && this.f9458f == oVar.f9458f && this.f9464l == oVar.f9464l;
    }

    /* renamed from: f */
    public final C3321r mo9954f() {
        return new C3321r(this.f9459g, this.f9460h);
    }

    /* renamed from: g */
    public final C3322s mo9955g() {
        return new C3322s(this.f9459g, this.f9460h);
    }

    /* renamed from: h */
    public final String mo9956h() {
        return this.f9461i;
    }

    /* renamed from: i */
    public final boolean mo9957i() {
        return C3436n.f9457b[this.f9459g.ordinal()] == 1;
    }

    /* renamed from: j */
    public final C3435m mo9958j() {
        return this.f9459g;
    }

    /* renamed from: k */
    public final UserProto$User mo9959k() {
        return this.f9460h;
    }

    /* renamed from: l */
    public final boolean mo9960l() {
        int i = C3436n.f9456a[this.f9459g.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        return this.f9464l;
    }

    /* renamed from: m */
    public final boolean mo9961m() {
        return this.f9462j;
    }

    /* renamed from: n */
    public final boolean mo9962n() {
        return this.f9458f;
    }

    /* renamed from: o */
    public final boolean mo9963o() {
        return this.f9463k;
    }

    public C3437o(long j, C3435m mVar, UserProto$User userProto$User, String str, boolean z, boolean z2, boolean z3) {
        C12932j.m33818b(mVar, "presentationType");
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(str, "displayName");
        super(C3324u.USER, j);
        this.f9459g = mVar;
        this.f9460h = userProto$User;
        this.f9461i = str;
        this.f9462j = z;
        this.f9463k = z2;
        this.f9464l = z3;
        this.f9458f = this.f9460h.getPrivateMode();
    }
}
