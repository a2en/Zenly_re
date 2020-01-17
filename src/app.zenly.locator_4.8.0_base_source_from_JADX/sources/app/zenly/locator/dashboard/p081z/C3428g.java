package app.zenly.locator.dashboard.p081z;

import app.zenly.locator.dashboard.C3304f;
import app.zenly.locator.dashboard.C3305g;
import app.zenly.locator.dashboard.C3324u;
import app.zenly.locator.dashboard.p075w.C3341i;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;

/* renamed from: app.zenly.locator.dashboard.z.g */
public final class C3428g extends C11722a {

    /* renamed from: f */
    private final String f9425f;

    /* renamed from: g */
    private final C3435m f9426g;

    /* renamed from: h */
    private final C7339i f9427h;

    /* renamed from: i */
    private final int f9428i;

    /* renamed from: j */
    private final C3341i f9429j;

    /* renamed from: k */
    private final boolean f9430k;

    public /* synthetic */ C3428g(long j, C3435m mVar, C7339i iVar, int i, C3341i iVar2, boolean z, int i2, C12928f fVar) {
        this(j, mVar, iVar, i, iVar2, (i2 & 32) != 0 ? false : z);
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C3428g gVar = (C3428g) aVar;
        return C12932j.m33817a((Object) this.f9425f, (Object) gVar.f9425f) && this.f9428i == gVar.f9428i && this.f9429j == gVar.f9429j && this.f9430k == gVar.f9430k;
    }

    /* renamed from: f */
    public final C7339i mo9933f() {
        return this.f9427h;
    }

    /* renamed from: g */
    public final C3304f mo9934g() {
        return new C3304f(this.f9426g, this.f9427h);
    }

    /* renamed from: h */
    public final C3305g mo9935h() {
        return new C3305g(this.f9426g, this.f9427h);
    }

    /* renamed from: i */
    public final String mo9936i() {
        return this.f9425f;
    }

    /* renamed from: j */
    public final C3341i mo9937j() {
        return this.f9429j;
    }

    /* renamed from: k */
    public final boolean mo9938k() {
        return C3427f.f9424b[this.f9426g.ordinal()] == 1;
    }

    /* renamed from: l */
    public final int mo9939l() {
        return this.f9428i;
    }

    /* renamed from: m */
    public final C3435m mo9940m() {
        return this.f9426g;
    }

    /* renamed from: n */
    public final boolean mo9941n() {
        int i = C3427f.f9423a[this.f9426g.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        return this.f9430k;
    }

    public C3428g(long j, C3435m mVar, C7339i iVar, int i, C3341i iVar2, boolean z) {
        C12932j.m33818b(mVar, "presentationType");
        C12932j.m33818b(iVar, "contact");
        C12932j.m33818b(iVar2, "inviteStatus");
        super(C3324u.CONTACT, j);
        this.f9426g = mVar;
        this.f9427h = iVar;
        this.f9428i = i;
        this.f9429j = iVar2;
        this.f9430k = z;
        String full = this.f9427h.getFull();
        C12932j.m33815a((Object) full, "contact.full");
        this.f9425f = full;
    }
}
