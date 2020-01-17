package app.zenly.locator.map.p108h1;

import app.zenly.locator.core.contracts.MapControllerContract.C2464g;
import app.zenly.locator.core.models.C2896p;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.h1.a */
public final class C3990a {
    static {
        new C3990a();
    }

    private C3990a() {
    }

    /* renamed from: a */
    public static final C2464g m11641a(C2464g gVar, C2896p pVar) {
        C12932j.m33818b(gVar, "input");
        C12932j.m33818b(pVar, "friend");
        if (gVar != C2464g.AUTO) {
            return gVar;
        }
        if (!pVar.f8222z.mo8994c() || !pVar.f8222z.mo8995d().mo9010h()) {
            return C2464g.ALL;
        }
        return C2464g.MARKER_DESTINATION;
    }
}
