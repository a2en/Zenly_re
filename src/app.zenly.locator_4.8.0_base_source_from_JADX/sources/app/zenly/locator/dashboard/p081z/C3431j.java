package app.zenly.locator.dashboard.p081z;

import app.zenly.locator.dashboard.C3324u;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.dashboard.z.j */
public final class C3431j extends C11722a {

    /* renamed from: f */
    private final int f9433f;

    /* renamed from: g */
    private final C3432a f9434g;

    /* renamed from: h */
    private final boolean f9435h;

    /* renamed from: app.zenly.locator.dashboard.z.j$a */
    public enum C3432a {
        Edit,
        None
    }

    public /* synthetic */ C3431j(int i, C3432a aVar, boolean z, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            aVar = C3432a.None;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        this(i, aVar, z);
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C3431j jVar = (C3431j) aVar;
        return this.f9433f == jVar.f9433f && this.f9434g == jVar.f9434g && this.f9435h == jVar.f9435h;
    }

    /* renamed from: f */
    public final C3432a mo9943f() {
        return this.f9434g;
    }

    /* renamed from: g */
    public final int mo9944g() {
        return this.f9433f;
    }

    /* renamed from: h */
    public final boolean mo9945h() {
        return this.f9435h;
    }

    public C3431j(int i, C3432a aVar, boolean z) {
        C12932j.m33818b(aVar, "ctaType");
        super(C3324u.HEADER, (long) i);
        this.f9433f = i;
        this.f9434g = aVar;
        this.f9435h = z;
    }
}
