package app.zenly.locator.support.p171t0;

import kotlin.jvm.internal.C12932j;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.support.t0.d */
public final class C5821d {

    /* renamed from: a */
    private final C12785a<Boolean> f14717a;

    public C5821d() {
        C12785a<Boolean> h = C12785a.m33446h(Boolean.valueOf(false));
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(false)");
        this.f14717a = h;
    }

    /* renamed from: a */
    public final C12785a<Boolean> mo13500a() {
        return this.f14717a;
    }

    /* renamed from: b */
    public final void mo13501b() {
        this.f14717a.onNext(Boolean.valueOf(true));
    }
}
