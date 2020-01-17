package app.zenly.locator.inbox.p103o;

import app.zenly.android.feature.base.model.Avatar;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.util.C3220i;
import app.zenly.locator.inbox.C3854l;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.inbox.o.d */
public final class C3887d extends C11722a {

    /* renamed from: f */
    private final UserProto$User f10297f;

    /* renamed from: g */
    private final C7339i f10298g;

    public C3887d(UserProto$User userProto$User, C7339i iVar, long j) {
        C12932j.m33818b(iVar, "contact");
        super(C3854l.SEARCH_ENTITY, j);
        this.f10297f = userProto$User;
        this.f10298g = iVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3887d dVar = (C3887d) aVar;
            return mo10486f().areAvatarTheSame(dVar.mo10486f()) && C12932j.m33817a((Object) mo10488h(), (Object) dVar.mo10488h());
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.inbox.viewmodel.InboxSearchEntityModel");
    }

    /* renamed from: f */
    public final Avatar mo10486f() {
        UserProto$User userProto$User = this.f10297f;
        if (userProto$User == null) {
            return C2884f.m9357a(this.f10298g);
        }
        String avatarUrlPrefix = userProto$User.getAvatarUrlPrefix();
        if (avatarUrlPrefix == null || avatarUrlPrefix.length() == 0) {
            return C2884f.m9357a(this.f10298g);
        }
        return C2884f.m9355a(this.f10297f);
    }

    /* renamed from: g */
    public final C7339i mo10487g() {
        return this.f10298g;
    }

    /* renamed from: h */
    public final String mo10488h() {
        UserProto$User userProto$User = this.f10297f;
        if (userProto$User == null) {
            return C3220i.m10211a(this.f10298g);
        }
        String name = userProto$User.getName();
        C12932j.m33815a((Object) name, "user.name");
        return name;
    }

    /* renamed from: i */
    public final UserProto$User mo10489i() {
        return this.f10297f;
    }
}
