package app.zenly.locator.support.p171t0.p193k;

import app.zenly.locator.support.p171t0.C5822e;
import app.zenly.locator.support.p171t0.p190h.C5890a;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.support.t0.k.c */
public final class C5905c extends C11722a {

    /* renamed from: f */
    private final long f14904f;

    /* renamed from: g */
    private final C5890a f14905g;

    public C5905c(long j, C5890a aVar) {
        C12932j.m33818b(aVar, "personalPlace");
        super(C5822e.PLACE, j);
        this.f14904f = j;
        this.f14905g = aVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C5905c cVar = (C5905c) aVar;
        return this.f14905g.mo13586b() == cVar.f14905g.mo13586b() && C12932j.m33817a((Object) this.f14905g.mo13587c(), (Object) cVar.f14905g.mo13587c());
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5905c) {
                C5905c cVar = (C5905c) obj;
                if (!(this.f14904f == cVar.f14904f) || !C12932j.m33817a((Object) this.f14905g, (Object) cVar.f14905g)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C5890a mo13608f() {
        return this.f14905g;
    }

    public int hashCode() {
        int a = Long.valueOf(this.f14904f).hashCode() * 31;
        C5890a aVar = this.f14905g;
        return a + (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlaceViewModel(stableId=");
        sb.append(this.f14904f);
        sb.append(", personalPlace=");
        sb.append(this.f14905g);
        sb.append(")");
        return sb.toString();
    }
}
