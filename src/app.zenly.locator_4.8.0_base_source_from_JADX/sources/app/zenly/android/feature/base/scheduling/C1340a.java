package app.zenly.android.feature.base.scheduling;

import kotlin.jvm.internal.C12932j;
import p389io.reactivex.schedulers.SchedulerRunnableIntrospection;

/* renamed from: app.zenly.android.feature.base.scheduling.a */
public final class C1340a implements Runnable, SchedulerRunnableIntrospection {

    /* renamed from: g */
    public static final C1341a f4958g = new C1341a(null);

    /* renamed from: e */
    private final C1344c f4959e;

    /* renamed from: f */
    private final Runnable f4960f;

    /* renamed from: app.zenly.android.feature.base.scheduling.a$a */
    public static final class C1341a {
        private C1341a() {
        }

        /* renamed from: a */
        public final Runnable mo6568a(C1344c cVar, Runnable runnable) {
            C12932j.m33818b(cVar, "attribution");
            C12932j.m33818b(runnable, "runnable");
            if (runnable instanceof SchedulerRunnableIntrospection) {
                return runnable;
            }
            return new C1340a(cVar, runnable, null);
        }

        public /* synthetic */ C1341a(C12928f fVar) {
            this();
        }
    }

    private C1340a(C1344c cVar, Runnable runnable) {
        this.f4959e = cVar;
        this.f4960f = runnable;
    }

    public Runnable getWrappedRunnable() {
        return this.f4960f;
    }

    public void run() {
        try {
            C1352f.f4986h.mo6581a().set(this.f4959e);
            this.f4960f.run();
        } finally {
            C1352f.f4986h.mo6581a().remove();
        }
    }

    public /* synthetic */ C1340a(C1344c cVar, Runnable runnable, C12928f fVar) {
        this(cVar, runnable);
    }
}
