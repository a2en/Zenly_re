package app.zenly.locator.p017a0.p035r.p039i;

import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.p017a0.p035r.C1656d;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7302f3;

/* renamed from: app.zenly.locator.a0.r.i.c */
public final class C1674c extends C11722a {

    /* renamed from: f */
    private final long f5718f;

    /* renamed from: g */
    private final C2936a0 f5719g;

    /* renamed from: h */
    private final C7302f3 f5720h;

    /* renamed from: i */
    private final boolean f5721i;

    /* renamed from: j */
    private final boolean f5722j;

    public C1674c(long j, C2936a0 a0Var, C7302f3 f3Var, boolean z, boolean z2) {
        C12932j.m33818b(a0Var, "friend");
        C12932j.m33818b(f3Var, "notificationType");
        super(C1656d.PER_USER_NOTIFICATION_LIST_ITEM, j);
        this.f5718f = j;
        this.f5719g = a0Var;
        this.f5720h = f3Var;
        this.f5721i = z;
        this.f5722j = z2;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        C1674c cVar = (C1674c) aVar;
        return C12932j.m33817a((Object) this.f5719g.mo9074a().getName(), (Object) cVar.f5719g.mo9074a().getName()) && this.f5719g.mo9074a().getAvatarVersion() == cVar.f5719g.mo9074a().getAvatarVersion() && this.f5722j == cVar.f5722j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1674c) {
                C1674c cVar = (C1674c) obj;
                if ((this.f5718f == cVar.f5718f) && C12932j.m33817a((Object) this.f5719g, (Object) cVar.f5719g) && C12932j.m33817a((Object) this.f5720h, (Object) cVar.f5720h)) {
                    if (this.f5721i == cVar.f5721i) {
                        if (this.f5722j == cVar.f5722j) {
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
    public final C2936a0 mo7285f() {
        return this.f5719g;
    }

    /* renamed from: g */
    public final C7302f3 mo7286g() {
        return this.f5720h;
    }

    /* renamed from: h */
    public final boolean mo7287h() {
        return this.f5721i;
    }

    public int hashCode() {
        int a = Long.valueOf(this.f5718f).hashCode() * 31;
        C2936a0 a0Var = this.f5719g;
        int i = 0;
        int hashCode = (a + (a0Var != null ? a0Var.hashCode() : 0)) * 31;
        C7302f3 f3Var = this.f5720h;
        if (f3Var != null) {
            i = f3Var.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f5721i;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f5722j;
        if (z2) {
            z2 = true;
        }
        return i3 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo7289i() {
        return this.f5722j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PerUserNotificationItemViewModel(stableId=");
        sb.append(this.f5718f);
        sb.append(", friend=");
        sb.append(this.f5719g);
        sb.append(", notificationType=");
        sb.append(this.f5720h);
        sb.append(", isActivated=");
        sb.append(this.f5721i);
        sb.append(", isEnabled=");
        sb.append(this.f5722j);
        sb.append(")");
        return sb.toString();
    }
}
