package app.zenly.locator.support.p171t0.p193k;

import app.zenly.locator.support.p171t0.C5822e;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.support.t0.k.b */
public final class C5904b extends C11722a {

    /* renamed from: f */
    private final long f14902f;

    /* renamed from: g */
    private final int f14903g;

    public C5904b(long j, int i) {
        super(C5822e.MORE_PLACES, j);
        this.f14902f = j;
        this.f14903g = i;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return this.f14903g == ((C5904b) aVar).f14903g;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5904b) {
                C5904b bVar = (C5904b) obj;
                if (this.f14902f == bVar.f14902f) {
                    if (this.f14903g == bVar.f14903g) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo13604f() {
        return this.f14903g;
    }

    public int hashCode() {
        return (Long.valueOf(this.f14902f).hashCode() * 31) + Integer.valueOf(this.f14903g).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MorePlacesViewModel(stableId=");
        sb.append(this.f14902f);
        sb.append(", count=");
        sb.append(this.f14903g);
        sb.append(")");
        return sb.toString();
    }
}
