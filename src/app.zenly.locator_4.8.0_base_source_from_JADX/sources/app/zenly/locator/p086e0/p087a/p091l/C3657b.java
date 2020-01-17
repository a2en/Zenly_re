package app.zenly.locator.p086e0.p087a.p091l;

import app.zenly.locator.p086e0.p087a.C3619h;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.e0.a.l.b */
public final class C3657b extends C11722a {

    /* renamed from: f */
    public UserProto$User f9795f;

    /* renamed from: g */
    private final long f9796g;

    /* renamed from: h */
    private final String f9797h;

    /* renamed from: i */
    private final boolean f9798i;

    /* renamed from: j */
    private final boolean f9799j;

    /* renamed from: k */
    private final boolean f9800k;

    /* renamed from: l */
    private final boolean f9801l;

    public C3657b(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C12932j.m33818b(str, "userUuid");
        super(C3619h.PROFILE_OTHER_FRIEND, j);
        this.f9796g = j;
        this.f9797h = str;
        this.f9798i = z;
        this.f9799j = z2;
        this.f9800k = z3;
        this.f9801l = z4;
    }

    /* renamed from: a */
    public final void mo10150a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "<set-?>");
        this.f9795f = userProto$User;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3657b) {
                C3657b bVar = (C3657b) obj;
                if ((this.f9796g == bVar.f9796g) && C12932j.m33817a((Object) this.f9797h, (Object) bVar.f9797h)) {
                    if (this.f9798i == bVar.f9798i) {
                        if (this.f9799j == bVar.f9799j) {
                            if (this.f9800k == bVar.f9800k) {
                                if (this.f9801l == bVar.f9801l) {
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

    /* renamed from: f */
    public final UserProto$User mo10152f() {
        UserProto$User userProto$User = this.f9795f;
        if (userProto$User != null) {
            return userProto$User;
        }
        C12932j.m33820c("user");
        throw null;
    }

    /* renamed from: g */
    public final String mo10153g() {
        return this.f9797h;
    }

    /* renamed from: h */
    public final boolean mo10154h() {
        return this.f9799j;
    }

    public int hashCode() {
        int a = Long.valueOf(this.f9796g).hashCode() * 31;
        String str = this.f9797h;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f9798i;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z2 = this.f9799j;
        if (z2) {
            z2 = true;
        }
        int i2 = (i + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f9800k;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f9801l;
        if (z4) {
            z4 = true;
        }
        return i3 + (z4 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo10156i() {
        return this.f9800k;
    }

    /* renamed from: j */
    public final boolean mo10157j() {
        return this.f9798i;
    }

    /* renamed from: k */
    public final boolean mo10158k() {
        return this.f9801l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileOtherFriendViewModel(stableId=");
        sb.append(this.f9796g);
        sb.append(", userUuid=");
        sb.append(this.f9797h);
        sb.append(", isMutualFriend=");
        sb.append(this.f9798i);
        sb.append(", isInvited=");
        sb.append(this.f9799j);
        sb.append(", isLoggedInUser=");
        sb.append(this.f9800k);
        sb.append(", isPrivate=");
        sb.append(this.f9801l);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3657b bVar = (C3657b) aVar;
            return this.f9798i == bVar.f9798i && this.f9799j == bVar.f9799j && this.f9801l == bVar.f9801l;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.other.viewmodels.ProfileOtherFriendViewModel");
    }
}
