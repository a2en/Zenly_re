package app.zenly.locator.p086e0.p087a.p091l;

import app.zenly.locator.p086e0.p087a.C3619h;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;

/* renamed from: app.zenly.locator.e0.a.l.d */
public final class C3659d extends C11722a {

    /* renamed from: f */
    private final int f9804f;

    /* renamed from: g */
    private final int f9805g;

    public C3659d(int i, int i2) {
        super(C3619h.PROFILE_OTHER_SECTION_FRIENDS, 1);
        this.f9804f = i;
        this.f9805g = i2;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3659d dVar = (C3659d) aVar;
            return this.f9804f == dVar.f9804f && this.f9805g == dVar.f9805g;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.other.viewmodels.ProfileOtherSectionFriendsViewModel");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3659d) {
                C3659d dVar = (C3659d) obj;
                if (this.f9804f == dVar.f9804f) {
                    if (this.f9805g == dVar.f9805g) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo10162f() {
        return this.f9804f;
    }

    /* renamed from: g */
    public final int mo10163g() {
        return this.f9805g;
    }

    public int hashCode() {
        return (Integer.valueOf(this.f9804f).hashCode() * 31) + Integer.valueOf(this.f9805g).hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProfileOtherSectionFriendsViewModel(friendCount=");
        sb.append(this.f9804f);
        sb.append(", mutualFriendCount=");
        sb.append(this.f9805g);
        sb.append(")");
        return sb.toString();
    }
}
