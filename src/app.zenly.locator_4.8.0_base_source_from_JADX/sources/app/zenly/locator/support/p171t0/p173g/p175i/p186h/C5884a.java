package app.zenly.locator.support.p171t0.p173g.p175i.p186h;

import app.zenly.locator.support.p171t0.p173g.p175i.C5851b;
import app.zenly.locator.support.p171t0.p173g.p175i.p177d.C5854a;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.support.t0.g.i.h.a */
public final class C5884a extends C11722a {

    /* renamed from: f */
    private final long f14867f;

    /* renamed from: g */
    private final C5854a f14868g;

    public C5884a(long j, C5854a aVar) {
        C12932j.m33818b(aVar, "missingPlace");
        super(C5851b.MISSING_PLACE, j);
        this.f14867f = j;
        this.f14868g = aVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return C12932j.m33817a((Object) this.f14868g, (Object) ((C5884a) aVar).f14868g);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5884a) {
                C5884a aVar = (C5884a) obj;
                if (!(this.f14867f == aVar.f14867f) || !C12932j.m33817a((Object) this.f14868g, (Object) aVar.f14868g)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C5854a mo13572f() {
        return this.f14868g;
    }

    public int hashCode() {
        int a = Long.valueOf(this.f14867f).hashCode() * 31;
        C5854a aVar = this.f14868g;
        return a + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MissingPlaceViewModel(stableId=");
        sb.append(this.f14867f);
        sb.append(", missingPlace=");
        sb.append(this.f14868g);
        sb.append(")");
        return sb.toString();
    }
}
