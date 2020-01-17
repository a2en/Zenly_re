package app.zenly.locator.p017a0.p024p.p025d;

import android.content.Context;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.p017a0.C1525l;
import app.zenly.locator.p143s.C5407g;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.a0.p.d.c */
public final class C1565c {

    /* renamed from: a */
    private final C12785a<C1564b> f5499a;

    /* renamed from: b */
    private final ZenlySchedulers f5500b = C1351e.m6372a(C1525l.f5415b.mo19916a("repository"));

    /* renamed from: c */
    private final C5407g f5501c;

    public C1565c(Context context) {
        C12932j.m33818b(context, "context");
        this.f5501c = C5407g.f13966d.mo12991a(context);
        C12785a<C1564b> h = C12785a.m33446h(new C1564b(this.f5501c.mo12981e(), this.f5501c.mo12983f(), this.f5501c.mo12988j()));
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(currentPrefs)");
        this.f5499a = h;
    }

    /* renamed from: a */
    public final C12279e<C1564b> mo7117a() {
        C12279e<C1564b> a = this.f5499a.mo36428a((C12286f) this.f5500b.getComputation());
        C12932j.m33815a((Object) a, "settingsPreferencesSubje…n(schedulers.computation)");
        return a;
    }

    /* renamed from: b */
    public final void mo7119b(int i) {
        this.f5501c.mo12980d(i);
        C12785a<C1564b> aVar = this.f5499a;
        Object s = aVar.mo36963s();
        if (s != null) {
            aVar.onNext(C1564b.m6772a((C1564b) s, 0, i, 0, 5, null));
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: c */
    public final void mo7120c(int i) {
        this.f5501c.mo12984f(i);
        C12785a<C1564b> aVar = this.f5499a;
        Object s = aVar.mo36963s();
        if (s != null) {
            aVar.onNext(C1564b.m6772a((C1564b) s, 0, 0, i, 3, null));
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo7118a(int i) {
        this.f5501c.mo12978c(i);
        C12785a<C1564b> aVar = this.f5499a;
        Object s = aVar.mo36963s();
        if (s != null) {
            aVar.onNext(C1564b.m6772a((C1564b) s, i, 0, 0, 6, null));
        } else {
            C12932j.m33814a();
            throw null;
        }
    }
}
