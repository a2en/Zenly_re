package app.zenly.locator.p017a0.p024p.p029h;

import app.zenly.locator.p017a0.p024p.C1561c;
import app.zenly.locator.p017a0.p024p.p026e.C1583q;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.a0.p.h.h */
public final class C1613h extends C1611f {

    /* renamed from: g */
    private final int f5590g;

    /* renamed from: h */
    private final String f5591h;

    /* renamed from: i */
    private final String f5592i;

    /* renamed from: j */
    private final int f5593j;

    public /* synthetic */ C1613h(long j, int i, String str, String str2, int i2, C1583q qVar, int i3, C12928f fVar) {
        this(j, i, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? C7674a.f19294a : i2, qVar);
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C1613h hVar = (C1613h) aVar;
        return this.f5590g == hVar.f5590g && C12932j.m33817a((Object) this.f5591h, (Object) hVar.f5591h) && C12932j.m33817a((Object) this.f5592i, (Object) hVar.f5592i) && this.f5593j == hVar.f5593j;
    }

    /* renamed from: g */
    public final int mo7188g() {
        return this.f5593j;
    }

    /* renamed from: h */
    public final String mo7189h() {
        return this.f5592i;
    }

    /* renamed from: i */
    public final String mo7190i() {
        return this.f5591h;
    }

    /* renamed from: j */
    public final int mo7191j() {
        return this.f5590g;
    }

    public C1613h(long j, int i, String str, String str2, int i2, C1583q qVar) {
        C12932j.m33818b(qVar, "action");
        super(C1561c.TEXT, j, qVar);
        this.f5590g = i;
        this.f5591h = str;
        this.f5592i = str2;
        this.f5593j = i2;
    }
}
