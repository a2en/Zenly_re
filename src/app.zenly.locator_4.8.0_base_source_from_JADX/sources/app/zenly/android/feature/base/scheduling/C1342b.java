package app.zenly.android.feature.base.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p266e.C7701a;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.disposables.Disposable;

/* renamed from: app.zenly.android.feature.base.scheduling.b */
public final class C1342b extends C12286f {

    /* renamed from: b */
    private C1344c f4961b;

    /* renamed from: c */
    private final C12286f f4962c;

    /* renamed from: app.zenly.android.feature.base.scheduling.b$a */
    private static final class C1343a extends C12289c {

        /* renamed from: e */
        private final C1344c f4963e;

        /* renamed from: f */
        private final C12289c f4964f;

        public C1343a(C1344c cVar, C12289c cVar2) {
            C12932j.m33818b(cVar, "attribution");
            C12932j.m33818b(cVar2, "worker");
            this.f4963e = cVar;
            this.f4964f = cVar2;
        }

        /* renamed from: a */
        public Disposable mo6574a(Runnable runnable) {
            C12932j.m33818b(runnable, "run");
            Disposable a = this.f4964f.mo6574a(C1340a.f4958g.mo6568a(this.f4963e, runnable));
            C12932j.m33815a((Object) a, "worker.schedule(Attribut…e.wrap(attribution, run))");
            return a;
        }

        public void dispose() {
            this.f4964f.dispose();
        }

        public boolean isDisposed() {
            return this.f4964f.isDisposed();
        }

        /* renamed from: a */
        public Disposable mo6576a(Runnable runnable, long j, TimeUnit timeUnit) {
            C12932j.m33818b(runnable, "run");
            C12932j.m33818b(timeUnit, "unit");
            Disposable a = this.f4964f.mo6576a(C1340a.f4958g.mo6568a(this.f4963e, runnable), j, timeUnit);
            C12932j.m33815a((Object) a, "worker.schedule(Attribut…ution, run), delay, unit)");
            return a;
        }

        /* renamed from: a */
        public Disposable mo6575a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
            C12932j.m33818b(runnable, "run");
            C12932j.m33818b(timeUnit, "unit");
            Disposable a = this.f4964f.mo6575a(C1340a.f4958g.mo6568a(this.f4963e, runnable), j, j2, timeUnit);
            C12932j.m33815a((Object) a, "worker.schedulePeriodica…itialDelay, period, unit)");
            return a;
        }
    }

    public C1342b(C7701a aVar, String str, C12286f fVar) {
        C12932j.m33818b(aVar, "callsite");
        C12932j.m33818b(str, "schedulerType");
        C12932j.m33818b(fVar, "scheduler");
        this.f4962c = fVar;
        this.f4961b = new C1344c(aVar, str);
    }

    /* renamed from: a */
    public C12289c mo6573a() {
        C1344c cVar = this.f4961b;
        C12289c a = this.f4962c.mo6573a();
        C12932j.m33815a((Object) a, "scheduler.createWorker()");
        return new C1343a(cVar, a);
    }

    /* renamed from: a */
    public Disposable mo6570a(Runnable runnable) {
        C12932j.m33818b(runnable, "run");
        Disposable a = this.f4962c.mo6570a(C1340a.f4958g.mo6568a(this.f4961b, runnable));
        C12932j.m33815a((Object) a, "scheduler.scheduleDirect…e.wrap(attribution, run))");
        return a;
    }

    /* renamed from: a */
    public Disposable mo6572a(Runnable runnable, long j, TimeUnit timeUnit) {
        C12932j.m33818b(runnable, "run");
        C12932j.m33818b(timeUnit, "unit");
        Disposable a = this.f4962c.mo6572a(C1340a.f4958g.mo6568a(this.f4961b, runnable), j, timeUnit);
        C12932j.m33815a((Object) a, "scheduler.scheduleDirect…ution, run), delay, unit)");
        return a;
    }

    /* renamed from: a */
    public Disposable mo6571a(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        C12932j.m33818b(runnable, "run");
        C12932j.m33818b(timeUnit, "unit");
        Disposable a = this.f4962c.mo6571a(C1340a.f4958g.mo6568a(this.f4961b, runnable), j, j2, timeUnit);
        C12932j.m33815a((Object) a, "scheduler.schedulePeriod…itialDelay, period, unit)");
        return a;
    }

    /* renamed from: a */
    public final C1342b mo6569a(String str) {
        C12932j.m33818b(str, "subBreadcrumb");
        return new C1342b(this.f4961b.mo6579a().mo19914a(str), this.f4961b.mo6580b(), this.f4962c);
    }
}
