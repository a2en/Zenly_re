package app.zenly.locator.p017a0.p030q.p034f;

import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.p017a0.p030q.C1617b;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.q.f.d */
public final class C1648d extends C11722a {

    /* renamed from: f */
    private final long f5668f;

    /* renamed from: g */
    private final C2956k0 f5669g;

    public C1648d(long j, C2956k0 k0Var) {
        C12932j.m33818b(k0Var, "friendRequest");
        super(C1617b.INVITED, j);
        this.f5668f = j;
        this.f5669g = k0Var;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C1648d dVar = (C1648d) aVar;
        return C12932j.m33817a((Object) this.f5669g.mo9122b().getTargetName(), (Object) dVar.f5669g.mo9122b().getTargetName()) && this.f5669g.mo9123c().getAvatarVersion() == dVar.f5669g.mo9123c().getAvatarVersion();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1648d) {
                C1648d dVar = (C1648d) obj;
                if (!(this.f5668f == dVar.f5668f) || !C12932j.m33817a((Object) this.f5669g, (Object) dVar.f5669g)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C2956k0 mo7247f() {
        return this.f5669g;
    }

    public int hashCode() {
        int a = Long.valueOf(this.f5668f).hashCode() * 31;
        C2956k0 k0Var = this.f5669g;
        return a + (k0Var != null ? k0Var.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvitedViewModel(stableId=");
        sb.append(this.f5668f);
        sb.append(", friendRequest=");
        sb.append(this.f5669g);
        sb.append(")");
        return sb.toString();
    }
}
