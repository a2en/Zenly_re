package app.zenly.locator.experimental.inbox.p095l;

import app.zenly.locator.experimental.inbox.C3707h;
import app.zenly.locator.experimental.inbox.p093j.C3710a;
import app.zenly.locator.experimental.inbox.p093j.C3711b;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.experimental.inbox.l.a */
public final class C3720a extends C11722a {

    /* renamed from: f */
    private final C3711b f9968f;

    /* renamed from: g */
    private final C3710a f9969g;

    public C3720a(long j, C3711b bVar, C3710a aVar) {
        C12932j.m33818b(bVar, "suggestedFriend");
        C12932j.m33818b(aVar, "inviteStatus");
        super(C3707h.SUGGESTED_ITEM, j);
        this.f9968f = bVar;
        this.f9969g = aVar;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        C12932j.m33818b(aVar, "model");
        return mo34500c() == aVar.mo34500c() && this.f9969g == ((C3720a) aVar).f9969g;
    }

    /* renamed from: f */
    public final C3710a mo10251f() {
        return this.f9969g;
    }

    /* renamed from: g */
    public final C3711b mo10252g() {
        return this.f9968f;
    }
}
