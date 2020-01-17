package app.zenly.locator.p017a0.p030q.p034f;

import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2991u0;
import app.zenly.locator.p017a0.p030q.C1617b;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.q.f.c */
public final class C1647c extends C11722a {

    /* renamed from: f */
    private final long f5663f;

    /* renamed from: g */
    private final C2936a0 f5664g;

    /* renamed from: h */
    private final C2991u0 f5665h;

    /* renamed from: i */
    private boolean f5666i;

    /* renamed from: j */
    private boolean f5667j;

    public C1647c(long j, C2936a0 a0Var, C2991u0 u0Var, boolean z, boolean z2) {
        C12932j.m33818b(a0Var, "friend");
        C12932j.m33818b(u0Var, "friendship");
        super(C1617b.FRIEND, j);
        this.f5663f = j;
        this.f5664g = a0Var;
        this.f5665h = u0Var;
        this.f5666i = z;
        this.f5667j = z2;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C1647c cVar = (C1647c) aVar;
        return C12932j.m33817a((Object) this.f5664g.mo9074a().getName(), (Object) cVar.f5664g.mo9074a().getName()) && this.f5664g.mo9074a().getAvatarVersion() == cVar.f5664g.mo9074a().getAvatarVersion() && this.f5666i == cVar.f5666i && this.f5667j == cVar.f5667j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1647c) {
                C1647c cVar = (C1647c) obj;
                if ((this.f5663f == cVar.f5663f) && C12932j.m33817a((Object) this.f5664g, (Object) cVar.f5664g) && C12932j.m33817a((Object) this.f5665h, (Object) cVar.f5665h)) {
                    if (this.f5666i == cVar.f5666i) {
                        if (this.f5667j == cVar.f5667j) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C2936a0 mo7240f() {
        return this.f5664g;
    }

    /* renamed from: g */
    public final C2991u0 mo7241g() {
        return this.f5665h;
    }

    /* renamed from: h */
    public final boolean mo7242h() {
        return this.f5667j;
    }

    public int hashCode() {
        int a = Long.valueOf(this.f5663f).hashCode() * 31;
        C2936a0 a0Var = this.f5664g;
        int i = 0;
        int hashCode = (a + (a0Var != null ? a0Var.hashCode() : 0)) * 31;
        C2991u0 u0Var = this.f5665h;
        if (u0Var != null) {
            i = u0Var.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f5666i;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f5667j;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo7244i() {
        return this.f5666i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FriendViewModel(stableId=");
        sb.append(this.f5663f);
        sb.append(", friend=");
        sb.append(this.f5664g);
        sb.append(", friendship=");
        sb.append(this.f5665h);
        sb.append(", isHiddenMutualLove=");
        sb.append(this.f5666i);
        sb.append(", isHiddenBestFriend=");
        sb.append(this.f5667j);
        sb.append(")");
        return sb.toString();
    }
}
