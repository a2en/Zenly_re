package app.zenly.locator.p086e0.p087a.p091l;

import app.zenly.locator.p086e0.p087a.C3619h;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.e0.a.l.c */
public final class C3658c extends C11722a {

    /* renamed from: f */
    private final String f9802f;

    /* renamed from: g */
    private final int f9803g;

    public C3658c(String str, int i) {
        C12932j.m33818b(str, "username");
        super(C3619h.PROFILE_OTHER_RECOMMEND_FRIENDS, 1);
        this.f9802f = str;
        this.f9803g = i;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3658c cVar = (C3658c) aVar;
            return C12932j.m33817a((Object) this.f9802f, (Object) cVar.f9802f) && this.f9803g == cVar.f9803g;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.other.viewmodels.ProfileOtherRecommendFriendsViewModel");
    }

    /* renamed from: f */
    public final String mo10160f() {
        return this.f9802f;
    }
}
