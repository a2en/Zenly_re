package app.zenly.locator.friendshipfacts.p100m;

import app.zenly.locator.friendshipfacts.C3781e;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.friendshipfacts.m.a */
public final class C3811a extends C11722a {

    /* renamed from: f */
    private final int f10153f;

    /* renamed from: g */
    private final String f10154g;

    public C3811a(int i, String str) {
        C12932j.m33818b(str, "description");
        super(C3781e.EMPTY_SECTION, 1);
        this.f10153f = i;
        this.f10154g = str;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3811a aVar2 = (C3811a) aVar;
            return aVar2.f10153f == this.f10153f && C12932j.m33817a((Object) aVar2.f10154g, (Object) this.f10154g);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.friendshipfacts.viewmodels.EmptySectionViewModel");
    }

    /* renamed from: f */
    public final String mo10393f() {
        return this.f10154g;
    }

    /* renamed from: g */
    public final int mo10394g() {
        return this.f10153f;
    }
}
