package app.zenly.locator.dashboard.p081z;

import app.zenly.locator.dashboard.C3324u;
import app.zenly.locator.dashboard.p075w.C3327b.C3328a;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.dashboard.z.c */
public final class C3424c extends C11722a {

    /* renamed from: f */
    private final int f9419f;

    /* renamed from: g */
    private final C3328a f9420g;

    public C3424c(int i, C3328a aVar) {
        C12932j.m33818b(aVar, "section");
        super(C3324u.BROADCAST_INVITE_HEADER, (long) i);
        this.f9419f = i;
        this.f9420g = aVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C3424c cVar = (C3424c) aVar;
        return this.f9419f == cVar.f9419f && this.f9420g == cVar.f9420g;
    }

    /* renamed from: f */
    public final C3328a mo9929f() {
        return this.f9420g;
    }

    /* renamed from: g */
    public final int mo9930g() {
        return this.f9419f;
    }
}
