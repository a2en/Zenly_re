package app.zenly.locator.p017a0.p024p.p029h;

import app.zenly.locator.p017a0.p024p.C1561c;
import app.zenly.locator.p017a0.p024p.p026e.C1583q;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.p.h.g */
public final class C1612g extends C1611f {

    /* renamed from: g */
    private final String f5587g;

    /* renamed from: h */
    private final String f5588h;

    /* renamed from: i */
    private final boolean f5589i;

    public C1612g(long j, String str, String str2, boolean z, C1583q qVar) {
        C12932j.m33818b(str, "title");
        C12932j.m33818b(qVar, "action");
        super(C1561c.SWITCH, j, qVar);
        this.f5587g = str;
        this.f5588h = str2;
        this.f5589i = z;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C1612g gVar = (C1612g) aVar;
        return C12932j.m33817a((Object) this.f5587g, (Object) gVar.f5587g) && C12932j.m33817a((Object) this.f5588h, (Object) gVar.f5588h);
    }

    /* renamed from: g */
    public final String mo7185g() {
        return this.f5588h;
    }

    /* renamed from: h */
    public final String mo7186h() {
        return this.f5587g;
    }

    /* renamed from: i */
    public final boolean mo7187i() {
        return this.f5589i;
    }
}
