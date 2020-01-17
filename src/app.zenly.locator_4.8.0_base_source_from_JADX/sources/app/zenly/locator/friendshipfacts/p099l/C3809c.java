package app.zenly.locator.friendshipfacts.p099l;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.friendshipfacts.l.c */
public final class C3809c {

    /* renamed from: a */
    private final UserProto$User f10147a;

    /* renamed from: b */
    private final int f10148b;

    /* renamed from: c */
    private final int f10149c;

    /* renamed from: d */
    private final boolean f10150d;

    /* renamed from: e */
    private final int f10151e;

    public C3809c(UserProto$User userProto$User, int i, int i2, boolean z, int i3) {
        C12932j.m33818b(userProto$User, "user");
        this.f10147a = userProto$User;
        this.f10148b = i;
        this.f10149c = i2;
        this.f10150d = z;
        this.f10151e = i3;
    }

    /* renamed from: a */
    public final int mo10387a() {
        return this.f10149c;
    }

    /* renamed from: b */
    public final int mo10388b() {
        return this.f10148b;
    }

    /* renamed from: c */
    public final UserProto$User mo10389c() {
        return this.f10147a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3809c) {
                C3809c cVar = (C3809c) obj;
                if (C12932j.m33817a((Object) this.f10147a, (Object) cVar.f10147a)) {
                    if (this.f10148b == cVar.f10148b) {
                        if (this.f10149c == cVar.f10149c) {
                            if (this.f10150d == cVar.f10150d) {
                                if (this.f10151e == cVar.f10151e) {
                                    return true;
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

    public int hashCode() {
        UserProto$User userProto$User = this.f10147a;
        int hashCode = (((((userProto$User != null ? userProto$User.hashCode() : 0) * 31) + Integer.valueOf(this.f10148b).hashCode()) * 31) + Integer.valueOf(this.f10149c).hashCode()) * 31;
        boolean z = this.f10150d;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + Integer.valueOf(this.f10151e).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StreakUser(user=");
        sb.append(this.f10147a);
        sb.append(", streak=");
        sb.append(this.f10148b);
        sb.append(", bestStreak=");
        sb.append(this.f10149c);
        sb.append(", ongoing=");
        sb.append(this.f10150d);
        sb.append(", lastSeen=");
        sb.append(this.f10151e);
        sb.append(")");
        return sb.toString();
    }
}
