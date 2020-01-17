package app.zenly.locator.friendshipfacts.p098k;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.friendshipfacts.k.d */
public final class C3803d {

    /* renamed from: a */
    private final UserProto$User f10133a;

    /* renamed from: b */
    private final int f10134b;

    public C3803d(UserProto$User userProto$User, int i) {
        C12932j.m33818b(userProto$User, "user");
        this.f10133a = userProto$User;
        this.f10134b = i;
    }

    /* renamed from: a */
    public final int mo10367a() {
        return this.f10134b;
    }

    /* renamed from: b */
    public final UserProto$User mo10368b() {
        return this.f10133a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3803d) {
                C3803d dVar = (C3803d) obj;
                if (C12932j.m33817a((Object) this.f10133a, (Object) dVar.f10133a)) {
                    if (this.f10134b == dVar.f10134b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        UserProto$User userProto$User = this.f10133a;
        return ((userProto$User != null ? userProto$User.hashCode() : 0) * 31) + Integer.valueOf(this.f10134b).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecordStreakUser(user=");
        sb.append(this.f10133a);
        sb.append(", bestStreak=");
        sb.append(this.f10134b);
        sb.append(")");
        return sb.toString();
    }
}
