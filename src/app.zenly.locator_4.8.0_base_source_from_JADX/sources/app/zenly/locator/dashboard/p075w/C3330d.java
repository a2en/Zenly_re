package app.zenly.locator.dashboard.p075w;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7339i;
import p389io.reactivex.C12279e;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.dashboard.w.d */
public final class C3330d {

    /* renamed from: a */
    private final C3326a f9262a = new C3326a();

    /* renamed from: b */
    private final C12785a<C3326a> f9263b;

    public C3330d() {
        C12785a<C3326a> h = C12785a.m33446h(this.f9262a);
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(table)");
        this.f9263b = h;
    }

    /* renamed from: a */
    public final void mo9836a(C7339i iVar, C3341i iVar2) {
        C12932j.m33818b(iVar, "contact");
        C12932j.m33818b(iVar2, "invitedStatus");
        this.f9262a.mo9832a(iVar, iVar2);
        this.f9263b.onNext(this.f9262a);
    }

    /* renamed from: a */
    public final C12279e<C3326a> mo9835a() {
        C12279e<C3326a> g = this.f9263b.mo36496g();
        C12932j.m33815a((Object) g, "subject.hide()");
        return g;
    }
}
