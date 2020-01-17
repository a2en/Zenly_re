package app.zenly.locator.core.invitations;

import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.invitations.b0 */
public final class C2536b0 {

    /* renamed from: a */
    private final boolean f7581a;

    /* renamed from: b */
    private final Boolean f7582b;

    /* renamed from: c */
    private final Integer f7583c;

    /* renamed from: d */
    private final boolean f7584d;

    public C2536b0() {
        this(false, null, null, false, 15, null);
    }

    public C2536b0(boolean z, Boolean bool, Integer num, boolean z2) {
        this.f7581a = z;
        this.f7582b = bool;
        this.f7583c = num;
        this.f7584d = z2;
    }

    /* renamed from: a */
    public final boolean mo8658a() {
        return this.f7584d;
    }

    /* renamed from: b */
    public final Integer mo8659b() {
        return this.f7583c;
    }

    /* renamed from: c */
    public final boolean mo8660c() {
        return this.f7581a;
    }

    /* renamed from: d */
    public final Boolean mo8661d() {
        return this.f7582b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2536b0) {
                C2536b0 b0Var = (C2536b0) obj;
                if ((this.f7581a == b0Var.f7581a) && C12932j.m33817a((Object) this.f7582b, (Object) b0Var.f7582b) && C12932j.m33817a((Object) this.f7583c, (Object) b0Var.f7583c)) {
                    if (this.f7584d == b0Var.f7584d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        boolean z = this.f7581a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        Boolean bool = this.f7582b;
        int i3 = 0;
        int hashCode = (i2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.f7583c;
        if (num != null) {
            i3 = num.hashCode();
        }
        int i4 = (hashCode + i3) * 31;
        boolean z2 = this.f7584d;
        if (!z2) {
            i = z2;
        }
        return i4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvitationTrackingInfo(isReminder=");
        sb.append(this.f7581a);
        sb.append(", isZenlyUser=");
        sb.append(this.f7582b);
        sb.append(", mutualFriendsCount=");
        sb.append(this.f7583c);
        sb.append(", fromQuickAdd=");
        sb.append(this.f7584d);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2536b0(boolean z, Boolean bool, Integer num, boolean z2, int i, C12928f fVar) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        this(z, bool, num, z2);
    }
}
