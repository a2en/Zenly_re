package app.zenly.locator.userprofile.p198me.p204l;

import app.zenly.locator.userprofile.p198me.C6080f;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.userprofile.me.l.f */
public final class C6139f extends C11722a {

    /* renamed from: f */
    private final UserProto$User f15414f;

    public C6139f(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        super(C6080f.FOOTER, 1);
        this.f15414f = userProto$User;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            return C12932j.m33817a((Object) this.f15414f.getName(), (Object) ((C6139f) aVar).f15414f.getName());
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.me.viewmodels.MyProfileFooterViewModel");
    }

    /* renamed from: f */
    public final UserProto$User mo13977f() {
        return this.f15414f;
    }
}
