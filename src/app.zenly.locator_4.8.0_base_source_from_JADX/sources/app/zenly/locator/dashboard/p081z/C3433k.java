package app.zenly.locator.dashboard.p081z;

import app.zenly.locator.dashboard.C3303e;
import app.zenly.locator.dashboard.C3304f;
import app.zenly.locator.dashboard.C3324u;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;

/* renamed from: app.zenly.locator.dashboard.z.k */
public final class C3433k extends C11722a {

    /* renamed from: f */
    private final boolean f9439f = this.f9443j;

    /* renamed from: g */
    private final C3435m f9440g;

    /* renamed from: h */
    private final C7339i f9441h;

    /* renamed from: i */
    private final boolean f9442i;

    /* renamed from: j */
    private final boolean f9443j;

    public C3433k(long j, C3435m mVar, C7339i iVar, boolean z, boolean z2) {
        C12932j.m33818b(mVar, "presentationType");
        C12932j.m33818b(iVar, "contact");
        super(C3324u.MINI_CONTACT, j);
        this.f9440g = mVar;
        this.f9441h = iVar;
        this.f9442i = z;
        this.f9443j = z2;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C3433k kVar = (C3433k) aVar;
        return this.f9442i == kVar.f9442i && this.f9443j == kVar.f9443j;
    }

    /* renamed from: f */
    public final C3303e mo9946f() {
        return new C3303e(this.f9440g, this.f9441h);
    }

    /* renamed from: g */
    public final C7339i mo9947g() {
        return this.f9441h;
    }

    /* renamed from: h */
    public final C3304f mo9948h() {
        return new C3304f(this.f9440g, this.f9441h);
    }

    /* renamed from: i */
    public final boolean mo9949i() {
        return this.f9439f;
    }
}
