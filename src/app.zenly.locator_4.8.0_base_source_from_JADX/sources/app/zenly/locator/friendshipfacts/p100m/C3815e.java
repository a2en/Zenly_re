package app.zenly.locator.friendshipfacts.p100m;

import app.zenly.locator.friendshipfacts.C3781e;
import app.zenly.locator.friendshipfacts.p099l.C3809c;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.friendshipfacts.m.e */
public final class C3815e extends C11722a {

    /* renamed from: f */
    private final C3809c f10159f;

    public C3815e(long j, C3809c cVar) {
        C12932j.m33818b(cVar, "streakUser");
        super(C3781e.STREAK_USERS_ITEM, j);
        this.f10159f = cVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3815e eVar = (C3815e) aVar;
            return eVar.f10159f.mo10389c().getAvatarVersion() == this.f10159f.mo10389c().getAvatarVersion() && eVar.f10159f.mo10388b() == this.f10159f.mo10388b() && eVar.f10159f.mo10387a() == this.f10159f.mo10387a();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.friendshipfacts.viewmodels.StreakUserItemViewModel");
    }

    /* renamed from: f */
    public final C3809c mo10399f() {
        return this.f10159f;
    }
}
