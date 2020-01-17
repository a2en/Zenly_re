package app.zenly.locator.support.p170s0;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.AppLifecycleObserver;
import app.zenly.locator.support.C5667e0;
import app.zenly.locator.support.C5724n0;
import java.util.concurrent.Callable;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;

/* renamed from: app.zenly.locator.support.s0.a */
public final class C5803a implements AppLifecycleObserver {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f14693c;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ZenlySchedulers f14694a = C1351e.m6372a(C5667e0.f14437b.mo19916a("lifecycleObserver"));

    /* renamed from: b */
    private final Lazy f14695b;

    /* renamed from: app.zenly.locator.support.s0.a$a */
    static final class C5804a extends C12933k implements Function0<C12271b> {

        /* renamed from: f */
        final /* synthetic */ C5803a f14696f;

        /* renamed from: g */
        final /* synthetic */ Provider f14697g;

        /* renamed from: app.zenly.locator.support.s0.a$a$a */
        static final class C5805a<V> implements Callable<Object> {

            /* renamed from: e */
            final /* synthetic */ C5804a f14698e;

            C5805a(C5804a aVar) {
                this.f14698e = aVar;
            }

            public final void call() {
                C7707a.m18761b("zendesk:init");
                try {
                    ((C5724n0) this.f14698e.f14697g.get()).mo13406f();
                    C12956q qVar = C12956q.f33541a;
                } finally {
                    C7707a.m18759a();
                }
            }
        }

        C5804a(C5803a aVar, Provider provider) {
            this.f14696f = aVar;
            this.f14697g = provider;
            super(0);
        }

        public final C12271b invoke() {
            return C12271b.m32507b((Callable<?>) new C5805a<Object>(this)).mo36350b((C12286f) this.f14696f.f14694a.getComputation());
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C5803a.class), "sdkInit", "getSdkInit()Lio/reactivex/Completable;");
        C12946x.m33839a((C12940r) sVar);
        f14693c = new KProperty[]{sVar};
    }

    public C5803a(Provider<C5724n0> provider) {
        C12932j.m33818b(provider, "zendesk");
        this.f14695b = C12896f.m33751a(new C5804a(this, provider));
    }

    /* renamed from: a */
    private final C12271b m16233a() {
        Lazy lazy = this.f14695b;
        KProperty kProperty = f14693c[0];
        return (C12271b) lazy.getValue();
    }

    public Disposable onForeground() {
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }

    public Disposable onInitialize() {
        Disposable b = m16233a().mo36351b();
        C12932j.m33815a((Object) b, "sdkInit.subscribe()");
        return b;
    }
}
