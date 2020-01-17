package app.zenly.locator.friendshipfacts.p100m;

import app.zenly.locator.friendshipfacts.C3781e;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.friendshipfacts.m.c */
public final class C3813c extends C11722a {

    /* renamed from: f */
    private final String f10156f;

    /* renamed from: g */
    private final String f10157g;

    public C3813c(String str, String str2) {
        C12932j.m33818b(str, "title");
        C12932j.m33818b(str2, "subtitle");
        super(C3781e.TST_HEADER, 1);
        this.f10156f = str;
        this.f10157g = str2;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C3813c cVar = (C3813c) aVar;
            return C12932j.m33817a((Object) cVar.f10156f, (Object) this.f10156f) && C12932j.m33817a((Object) cVar.f10157g, (Object) this.f10157g);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.friendshipfacts.viewmodels.HeaderWithSubtitleViewModel");
    }

    /* renamed from: f */
    public final String mo10396f() {
        return this.f10157g;
    }

    /* renamed from: g */
    public final String mo10397g() {
        return this.f10156f;
    }
}
