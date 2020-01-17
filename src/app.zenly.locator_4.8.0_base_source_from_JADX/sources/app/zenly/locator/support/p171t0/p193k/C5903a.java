package app.zenly.locator.support.p171t0.p193k;

import app.zenly.locator.support.p171t0.C5822e;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.support.t0.k.a */
public final class C5903a extends C11722a {

    /* renamed from: f */
    private final long f14901f;

    public C5903a(long j) {
        super(C5822e.MISSING_PLACE, j);
        this.f14901f = j;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return this.f14901f == ((C5903a) aVar).f14901f;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5903a) {
                if (this.f14901f == ((C5903a) obj).f14901f) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Long.valueOf(this.f14901f).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MissingPlaceViewModel(stableId=");
        sb.append(this.f14901f);
        sb.append(")");
        return sb.toString();
    }
}
