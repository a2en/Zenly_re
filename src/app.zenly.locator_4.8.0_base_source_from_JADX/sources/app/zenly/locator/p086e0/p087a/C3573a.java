package app.zenly.locator.p086e0.p087a;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.e0.a.a */
public final class C3573a {

    /* renamed from: a */
    public UserProto$User f9617a;

    /* renamed from: b */
    private final boolean f9618b;

    /* renamed from: c */
    private final boolean f9619c;

    /* renamed from: d */
    private final boolean f9620d;

    /* renamed from: e */
    private final boolean f9621e;

    /* renamed from: f */
    private final boolean f9622f;

    /* renamed from: g */
    private final long f9623g;

    public C3573a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, long j) {
        this.f9618b = z;
        this.f9619c = z2;
        this.f9620d = z3;
        this.f9621e = z4;
        this.f9622f = z5;
        this.f9623g = j;
    }

    /* renamed from: a */
    public final boolean mo10041a() {
        return this.f9621e;
    }

    /* renamed from: b */
    public final long mo10042b() {
        return this.f9623g;
    }

    /* renamed from: c */
    public final UserProto$User mo10043c() {
        UserProto$User userProto$User = this.f9617a;
        if (userProto$User != null) {
            return userProto$User;
        }
        C12932j.m33820c("user");
        throw null;
    }

    /* renamed from: d */
    public final boolean mo10044d() {
        return this.f9620d;
    }

    /* renamed from: e */
    public final boolean mo10045e() {
        return this.f9618b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3573a) {
                C3573a aVar = (C3573a) obj;
                if (this.f9618b == aVar.f9618b) {
                    if (this.f9619c == aVar.f9619c) {
                        if (this.f9620d == aVar.f9620d) {
                            if (this.f9621e == aVar.f9621e) {
                                if (this.f9622f == aVar.f9622f) {
                                    if (this.f9623g == aVar.f9623g) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo10047f() {
        return this.f9619c;
    }

    /* renamed from: g */
    public final boolean mo10048g() {
        return this.f9622f;
    }

    public int hashCode() {
        boolean z = this.f9618b;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (z ? 1 : 0) * true;
        boolean z2 = this.f9619c;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f9620d;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f9621e;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f9622f;
        if (!z5) {
            i = z5;
        }
        return ((i5 + i) * 31) + Long.valueOf(this.f9623g).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HeaderButtonsViewModel(isFriend=");
        sb.append(this.f9618b);
        sb.append(", isInvited=");
        sb.append(this.f9619c);
        sb.append(", isBlocked=");
        sb.append(this.f9620d);
        sb.append(", blockedYou=");
        sb.append(this.f9621e);
        sb.append(", isPrivate=");
        sb.append(this.f9622f);
        sb.append(", friendsSince=");
        sb.append(this.f9623g);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo10040a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "<set-?>");
        this.f9617a = userProto$User;
    }
}
