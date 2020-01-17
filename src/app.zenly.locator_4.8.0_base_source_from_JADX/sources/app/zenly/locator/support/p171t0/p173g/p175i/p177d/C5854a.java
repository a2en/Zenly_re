package app.zenly.locator.support.p171t0.p173g.p175i.p177d;

import app.zenly.locator.support.C5724n0.C5738f;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.support.t0.g.i.d.a */
public final class C5854a {

    /* renamed from: a */
    private final int f14807a;

    /* renamed from: b */
    private final C5738f f14808b;

    public C5854a(int i, C5738f fVar) {
        C12932j.m33818b(fVar, "reason");
        this.f14807a = i;
        this.f14808b = fVar;
    }

    /* renamed from: a */
    public final C5738f mo13534a() {
        return this.f14808b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5854a) {
                C5854a aVar = (C5854a) obj;
                if (!(this.f14807a == aVar.f14807a) || !C12932j.m33817a((Object) this.f14808b, (Object) aVar.f14808b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int a = Integer.valueOf(this.f14807a).hashCode() * 31;
        C5738f fVar = this.f14808b;
        return a + (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MissingPlace(id=");
        sb.append(this.f14807a);
        sb.append(", reason=");
        sb.append(this.f14808b);
        sb.append(")");
        return sb.toString();
    }
}
