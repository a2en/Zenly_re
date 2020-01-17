package app.zenly.locator.p017a0.p035r.p039i;

import app.zenly.locator.p017a0.p035r.C1656d;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7302f3;

/* renamed from: app.zenly.locator.a0.r.i.b */
public final class C1673b extends C11722a {

    /* renamed from: f */
    private final int f5715f;

    /* renamed from: g */
    private final C7302f3 f5716g;

    /* renamed from: h */
    private final boolean f5717h;

    public C1673b(int i, C7302f3 f3Var, boolean z) {
        C12932j.m33818b(f3Var, "notificationType");
        super(C1656d.GLOBAL_NOTIFICATION_LIST_ITEM, (long) f3Var.getNumber());
        this.f5715f = i;
        this.f5716g = f3Var;
        this.f5717h = z;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        return super.mo7088a(aVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1673b) {
                C1673b bVar = (C1673b) obj;
                if ((this.f5715f == bVar.f5715f) && C12932j.m33817a((Object) this.f5716g, (Object) bVar.f5716g)) {
                    if (this.f5717h == bVar.f5717h) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C7302f3 mo7279f() {
        return this.f5716g;
    }

    /* renamed from: g */
    public final int mo7280g() {
        return this.f5715f;
    }

    /* renamed from: h */
    public final boolean mo7281h() {
        return this.f5717h;
    }

    public int hashCode() {
        int a = Integer.valueOf(this.f5715f).hashCode() * 31;
        C7302f3 f3Var = this.f5716g;
        int hashCode = (a + (f3Var != null ? f3Var.hashCode() : 0)) * 31;
        boolean z = this.f5717h;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GlobalNotificationItemViewModel(title=");
        sb.append(this.f5715f);
        sb.append(", notificationType=");
        sb.append(this.f5716g);
        sb.append(", isActivated=");
        sb.append(this.f5717h);
        sb.append(")");
        return sb.toString();
    }
}
