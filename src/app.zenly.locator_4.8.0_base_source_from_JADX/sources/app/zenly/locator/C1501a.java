package app.zenly.locator;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.C12956q;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12291g;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.a */
public final class C1501a {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f5367f;

    /* renamed from: a */
    private final C12275b f5368a = new C12275b();

    /* renamed from: b */
    private final C12275b f5369b = new C12275b();

    /* renamed from: c */
    private final ZenlySchedulers f5370c = C1351e.m6372a(C3819h.f10169b.mo19916a("ActivityLifecycleDispatcher"));

    /* renamed from: d */
    private final Lazy f5371d = C12896f.m33751a(new C1502a(this));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Provider<Set<ActivityLifecycleObserver>> f5372e;

    /* renamed from: app.zenly.locator.a$a */
    static final class C1502a extends C12933k implements Function0<C12291g<Set<? extends ActivityLifecycleObserver>>> {

        /* renamed from: f */
        final /* synthetic */ C1501a f5373f;

        C1502a(C1501a aVar) {
            this.f5373f = aVar;
            super(0);
        }

        public final C12291g<Set<ActivityLifecycleObserver>> invoke() {
            C1501a aVar = this.f5373f;
            return aVar.m6652a(aVar.f5372e);
        }
    }

    /* renamed from: app.zenly.locator.a$b */
    static final class C1503b<T> implements Consumer<Set<? extends ActivityLifecycleObserver>> {

        /* renamed from: e */
        final /* synthetic */ C12275b f5374e;

        /* renamed from: f */
        final /* synthetic */ Function1 f5375f;

        C1503b(C12275b bVar, C1501a aVar, Function1 function1) {
            this.f5374e = bVar;
            this.f5375f = function1;
        }

        /* renamed from: a */
        public final void accept(Set<? extends ActivityLifecycleObserver> set) {
            C7707a.m18761b("activityLifecycle");
            try {
                for (ActivityLifecycleObserver invoke : set) {
                    C12773a.m33432a((Disposable) this.f5375f.invoke(invoke), this.f5374e);
                }
                C12956q qVar = C12956q.f33541a;
            } finally {
                C7707a.m18759a();
            }
        }
    }

    /* renamed from: app.zenly.locator.a$c */
    static final /* synthetic */ class C1504c extends C12931i implements Function1<ActivityLifecycleObserver, Disposable> {

        /* renamed from: i */
        public static final C1504c f5376i = new C1504c();

        C1504c() {
            super(1);
        }

        /* renamed from: a */
        public final Disposable invoke(ActivityLifecycleObserver activityLifecycleObserver) {
            C12932j.m33818b(activityLifecycleObserver, "p1");
            return activityLifecycleObserver.onCreate();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(ActivityLifecycleObserver.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onCreate()Lio/reactivex/disposables/Disposable;";
        }

        public final String getName() {
            return "onCreate";
        }
    }

    /* renamed from: app.zenly.locator.a$d */
    static final /* synthetic */ class C1505d extends C12931i implements Function1<ActivityLifecycleObserver, Disposable> {

        /* renamed from: i */
        public static final C1505d f5377i = new C1505d();

        C1505d() {
            super(1);
        }

        /* renamed from: a */
        public final Disposable invoke(ActivityLifecycleObserver activityLifecycleObserver) {
            C12932j.m33818b(activityLifecycleObserver, "p1");
            return activityLifecycleObserver.onForeground();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(ActivityLifecycleObserver.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onForeground()Lio/reactivex/disposables/Disposable;";
        }

        public final String getName() {
            return "onForeground";
        }
    }

    /* renamed from: app.zenly.locator.a$e */
    static final class C1506e<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ Provider f5378e;

        C1506e(Provider provider) {
            this.f5378e = provider;
        }

        public final Set<ActivityLifecycleObserver> call() {
            C7707a.m18761b("init activity observers");
            try {
                return (Set) this.f5378e.get();
            } finally {
                C7707a.m18759a();
            }
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C1501a.class), "generalLifecycleObservers", "getGeneralLifecycleObservers()Lio/reactivex/Single;");
        C12946x.m33839a((C12940r) sVar);
        f5367f = new KProperty[]{sVar};
    }

    public C1501a(Provider<Set<ActivityLifecycleObserver>> provider) {
        C12932j.m33818b(provider, "generalLifecycleObserversProvider");
        this.f5372e = provider;
    }

    /* renamed from: e */
    private final C12291g<Set<ActivityLifecycleObserver>> m6654e() {
        Lazy lazy = this.f5371d;
        KProperty kProperty = f5367f[0];
        return (C12291g) lazy.getValue();
    }

    /* renamed from: b */
    public final void mo7041b() {
        this.f5368a.mo36401a();
    }

    /* renamed from: c */
    public final void mo7042c() {
        this.f5369b.mo36401a();
    }

    /* renamed from: d */
    public final void mo7043d() {
        C12773a.m33432a(m6651a((Function1<? super ActivityLifecycleObserver, ? extends Disposable>) C1505d.f5377i), this.f5369b);
    }

    /* renamed from: a */
    public final void mo7040a() {
        C12773a.m33432a(m6651a((Function1<? super ActivityLifecycleObserver, ? extends Disposable>) C1504c.f5376i), this.f5368a);
    }

    /* renamed from: a */
    private final Disposable m6651a(Function1<? super ActivityLifecycleObserver, ? extends Disposable> function1) {
        C12275b bVar = new C12275b();
        Disposable d = m6654e().mo36535a((C12286f) this.f5370c.getUserInteractive()).mo36551d((Consumer<? super T>) new C1503b<Object>(bVar, this, function1));
        C12932j.m33815a((Object) d, "generalLifecycleObserver…      }\n                }");
        C12773a.m33432a(d, bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12291g<Set<ActivityLifecycleObserver>> m6652a(Provider<Set<ActivityLifecycleObserver>> provider) {
        C12291g<Set<ActivityLifecycleObserver>> b = C12291g.m32769c((Callable<? extends T>) new C1506e<Object>(provider)).mo36544b((C12286f) this.f5370c.getComputation()).mo36543b();
        C12932j.m33815a((Object) b, "Single.fromCallable {\n  …ion)\n            .cache()");
        return b;
    }
}
