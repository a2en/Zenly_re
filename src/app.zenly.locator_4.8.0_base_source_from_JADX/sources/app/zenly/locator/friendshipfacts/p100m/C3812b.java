package app.zenly.locator.friendshipfacts.p100m;

import app.zenly.locator.friendshipfacts.C3781e;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.friendshipfacts.m.b */
public final class C3812b extends C11722a {

    /* renamed from: f */
    private final String f10155f;

    public C3812b(String str) {
        C12932j.m33818b(str, "title");
        super(C3781e.HEADER, 1);
        this.f10155f = str;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            return C12932j.m33817a((Object) ((C3812b) aVar).f10155f, (Object) this.f10155f);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.friendshipfacts.viewmodels.HeaderViewModel");
    }

    /* renamed from: f */
    public final String mo10395f() {
        return this.f10155f;
    }
}
