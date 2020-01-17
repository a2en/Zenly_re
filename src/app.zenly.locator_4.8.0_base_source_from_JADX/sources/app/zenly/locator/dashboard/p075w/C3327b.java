package app.zenly.locator.dashboard.p075w;

import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.invitations.p068g0.C2593c;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.dashboard.w.b */
public final class C3327b {

    /* renamed from: a */
    private final C12785a<C3328a> f9254a;

    /* renamed from: b */
    private final ZenlySchedulers f9255b = C1351e.m6372a(C2593c.f7686b.mo19916a("repository"));

    /* renamed from: c */
    private final C2594d f9256c;

    /* renamed from: app.zenly.locator.dashboard.w.b$a */
    public enum C3328a {
        FIRST,
        SECOND,
        NONE
    }

    public C3327b(C1322a aVar, C2594d dVar) {
        C3328a aVar2;
        C12932j.m33818b(aVar, "decisionApi");
        C12932j.m33818b(dVar, "broadcastInvitePrefs");
        this.f9256c = dVar;
        if (!C2593c.m8906a(aVar, this.f9256c)) {
            aVar2 = C3328a.NONE;
        } else if (!this.f9256c.mo8701b()) {
            aVar2 = C3328a.FIRST;
        } else if (!this.f9256c.mo8703c()) {
            aVar2 = C3328a.SECOND;
        } else {
            aVar2 = C3328a.NONE;
        }
        C12785a<C3328a> h = C12785a.m33446h(aVar2);
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(currentSection)");
        this.f9254a = h;
    }

    /* renamed from: a */
    public final C12279e<C3328a> mo9833a() {
        C12279e<C3328a> a = this.f9254a.mo36428a((C12286f) this.f9255b.getComputation());
        C12932j.m33815a((Object) a, "broadcastInviteSectionSu…n(schedulers.computation)");
        return a;
    }

    /* renamed from: a */
    public final void mo9834a(C3328a aVar) {
        C12932j.m33818b(aVar, "section");
        int i = C3329c.f9261a[aVar.ordinal()];
        if (i == 1) {
            this.f9256c.mo8700b(true);
        } else if (i == 2) {
            this.f9256c.mo8702c(true);
        } else if (i == 3) {
            throw new IllegalArgumentException("Can't close the Section.NONE");
        }
        this.f9254a.onNext(C3328a.NONE);
    }
}
