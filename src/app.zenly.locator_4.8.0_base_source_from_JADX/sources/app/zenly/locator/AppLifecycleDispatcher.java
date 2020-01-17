package app.zenly.locator;

import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0875o;
import androidx.lifecycle.LifecycleObserver;
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
import p389io.reactivex.SingleSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p405m.C12773a;

public final class AppLifecycleDispatcher implements LifecycleObserver {

    /* renamed from: m */
    static final /* synthetic */ KProperty[] f5287m;

    /* renamed from: e */
    private final C12275b f5288e = new C12275b();

    /* renamed from: f */
    private final C12275b f5289f = new C12275b();

    /* renamed from: g */
    private final ZenlySchedulers f5290g = C1351e.m6372a(C3819h.f10169b.mo19916a("AppLifecycleDispatcher"));

    /* renamed from: h */
    private final Lazy f5291h = C12896f.m33751a(new C1469a(this));

    /* renamed from: i */
    private final Lazy f5292i = C12896f.m33751a(new C1470b(this));

    /* renamed from: j */
    private final AuthenticatedLifecycle f5293j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Provider<Set<AppLifecycleObserver>> f5294k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Provider<Set<AppLifecycleObserver>> f5295l;

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$a */
    static final class C1469a extends C12933k implements Function0<C12291g<Set<? extends AppLifecycleObserver>>> {

        /* renamed from: f */
        final /* synthetic */ AppLifecycleDispatcher f5296f;

        C1469a(AppLifecycleDispatcher appLifecycleDispatcher) {
            this.f5296f = appLifecycleDispatcher;
            super(0);
        }

        public final C12291g<Set<AppLifecycleObserver>> invoke() {
            AppLifecycleDispatcher appLifecycleDispatcher = this.f5296f;
            return appLifecycleDispatcher.m6571a(appLifecycleDispatcher.f5295l);
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$b */
    static final class C1470b extends C12933k implements Function0<C12291g<Set<? extends AppLifecycleObserver>>> {

        /* renamed from: f */
        final /* synthetic */ AppLifecycleDispatcher f5297f;

        C1470b(AppLifecycleDispatcher appLifecycleDispatcher) {
            this.f5297f = appLifecycleDispatcher;
            super(0);
        }

        public final C12291g<Set<AppLifecycleObserver>> invoke() {
            AppLifecycleDispatcher appLifecycleDispatcher = this.f5297f;
            return appLifecycleDispatcher.m6571a(appLifecycleDispatcher.f5294k);
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$c */
    static final class C1471c<T> implements Consumer<Set<? extends AppLifecycleObserver>> {

        /* renamed from: e */
        final /* synthetic */ C12275b f5298e;

        /* renamed from: f */
        final /* synthetic */ Function1 f5299f;

        C1471c(C12275b bVar, AppLifecycleDispatcher appLifecycleDispatcher, Function1 function1) {
            this.f5298e = bVar;
            this.f5299f = function1;
        }

        /* renamed from: a */
        public final void accept(Set<? extends AppLifecycleObserver> set) {
            for (AppLifecycleObserver invoke : set) {
                C12773a.m33432a((Disposable) this.f5299f.invoke(invoke), this.f5298e);
            }
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$d */
    static final class C1472d<T, R> implements Function<T, SingleSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ AppLifecycleDispatcher f5300e;

        C1472d(AppLifecycleDispatcher appLifecycleDispatcher, Function1 function1) {
            this.f5300e = appLifecycleDispatcher;
        }

        /* renamed from: a */
        public final C12291g<Set<AppLifecycleObserver>> apply(Boolean bool) {
            C12932j.m33818b(bool, "it");
            return this.f5300e.m6574b();
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$e */
    static final class C1473e<T> implements Consumer<Set<? extends AppLifecycleObserver>> {

        /* renamed from: e */
        final /* synthetic */ C12275b f5301e;

        /* renamed from: f */
        final /* synthetic */ Function1 f5302f;

        C1473e(C12275b bVar, AppLifecycleDispatcher appLifecycleDispatcher, Function1 function1) {
            this.f5301e = bVar;
            this.f5302f = function1;
        }

        /* renamed from: a */
        public final void accept(Set<? extends AppLifecycleObserver> set) {
            C7707a.m18761b("appLifecycle");
            try {
                for (AppLifecycleObserver invoke : set) {
                    C12773a.m33432a((Disposable) this.f5302f.invoke(invoke), this.f5301e);
                }
                C12956q qVar = C12956q.f33541a;
            } finally {
                C7707a.m18759a();
            }
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$f */
    static final class C1474f<T> implements Predicate<Boolean> {

        /* renamed from: e */
        public static final C1474f f5303e = new C1474f();

        C1474f() {
        }

        /* renamed from: a */
        public final Boolean mo6980a(Boolean bool) {
            C12932j.m33818b(bool, "it");
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo6980a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$g */
    static final /* synthetic */ class C1475g extends C12931i implements Function1<AppLifecycleObserver, Disposable> {

        /* renamed from: i */
        public static final C1475g f5304i = new C1475g();

        C1475g() {
            super(1);
        }

        /* renamed from: a */
        public final Disposable invoke(AppLifecycleObserver appLifecycleObserver) {
            C12932j.m33818b(appLifecycleObserver, "p1");
            return appLifecycleObserver.onInitialize();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(AppLifecycleObserver.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onInitialize()Lio/reactivex/disposables/Disposable;";
        }

        public final String getName() {
            return "onInitialize";
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$h */
    static final /* synthetic */ class C1476h extends C12931i implements Function1<AppLifecycleObserver, Disposable> {

        /* renamed from: i */
        public static final C1476h f5305i = new C1476h();

        C1476h() {
            super(1);
        }

        /* renamed from: a */
        public final Disposable invoke(AppLifecycleObserver appLifecycleObserver) {
            C12932j.m33818b(appLifecycleObserver, "p1");
            return appLifecycleObserver.onInitialize();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(AppLifecycleObserver.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onInitialize()Lio/reactivex/disposables/Disposable;";
        }

        public final String getName() {
            return "onInitialize";
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$i */
    static final /* synthetic */ class C1477i extends C12931i implements Function1<AppLifecycleObserver, Disposable> {

        /* renamed from: i */
        public static final C1477i f5306i = new C1477i();

        C1477i() {
            super(1);
        }

        /* renamed from: a */
        public final Disposable invoke(AppLifecycleObserver appLifecycleObserver) {
            C12932j.m33818b(appLifecycleObserver, "p1");
            return appLifecycleObserver.onForeground();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(AppLifecycleObserver.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onForeground()Lio/reactivex/disposables/Disposable;";
        }

        public final String getName() {
            return "onForeground";
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$j */
    static final /* synthetic */ class C1478j extends C12931i implements Function1<AppLifecycleObserver, Disposable> {

        /* renamed from: i */
        public static final C1478j f5307i = new C1478j();

        C1478j() {
            super(1);
        }

        /* renamed from: a */
        public final Disposable invoke(AppLifecycleObserver appLifecycleObserver) {
            C12932j.m33818b(appLifecycleObserver, "p1");
            return appLifecycleObserver.onForeground();
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(AppLifecycleObserver.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "onForeground()Lio/reactivex/disposables/Disposable;";
        }

        public final String getName() {
            return "onForeground";
        }
    }

    /* renamed from: app.zenly.locator.AppLifecycleDispatcher$k */
    static final class C1479k<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ Provider f5308e;

        C1479k(Provider provider) {
            this.f5308e = provider;
        }

        public final Set<AppLifecycleObserver> call() {
            C7707a.m18761b("init app observers");
            try {
                return (Set) this.f5308e.get();
            } finally {
                C7707a.m18759a();
            }
        }
    }

    static {
        Class<AppLifecycleDispatcher> cls = AppLifecycleDispatcher.class;
        C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "generalLifecycleObservers", "getGeneralLifecycleObservers()Lio/reactivex/Single;");
        C12946x.m33839a((C12940r) sVar);
        C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "loggedInLifecycleObservers", "getLoggedInLifecycleObservers()Lio/reactivex/Single;");
        C12946x.m33839a((C12940r) sVar2);
        f5287m = new KProperty[]{sVar, sVar2};
    }

    public AppLifecycleDispatcher(AuthenticatedLifecycle authenticatedLifecycle, Provider<Set<AppLifecycleObserver>> provider, Provider<Set<AppLifecycleObserver>> provider2) {
        C12932j.m33818b(authenticatedLifecycle, "authenticatedLifecycle");
        C12932j.m33818b(provider, "loggedInLifecycleObserversProvider");
        C12932j.m33818b(provider2, "generalLifecycleObserversProvider");
        this.f5293j = authenticatedLifecycle;
        this.f5294k = provider;
        this.f5295l = provider2;
    }

    /* renamed from: a */
    private final C12291g<Set<AppLifecycleObserver>> m6570a() {
        Lazy lazy = this.f5291h;
        KProperty kProperty = f5287m[0];
        return (C12291g) lazy.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C12291g<Set<AppLifecycleObserver>> m6574b() {
        Lazy lazy = this.f5292i;
        KProperty kProperty = f5287m[1];
        return (C12291g) lazy.getValue();
    }

    @C0875o(C0863a.ON_CREATE)
    public final void onCreate() {
        C12773a.m33432a(m6569a((Function1<? super AppLifecycleObserver, ? extends Disposable>) C1475g.f5304i), this.f5288e);
        C12773a.m33432a(m6573b((Function1<? super AppLifecycleObserver, ? extends Disposable>) C1476h.f5305i), this.f5288e);
    }

    @C0875o(C0863a.ON_DESTROY)
    public final void onDestroy() {
        this.f5288e.mo36401a();
    }

    @C0875o(C0863a.ON_START)
    public final void onStart() {
        C12773a.m33432a(m6569a((Function1<? super AppLifecycleObserver, ? extends Disposable>) C1477i.f5306i), this.f5289f);
        C12773a.m33432a(m6573b((Function1<? super AppLifecycleObserver, ? extends Disposable>) C1478j.f5307i), this.f5289f);
    }

    @C0875o(C0863a.ON_STOP)
    public final void onStop() {
        this.f5289f.mo36401a();
    }

    /* renamed from: b */
    private final Disposable m6573b(Function1<? super AppLifecycleObserver, ? extends Disposable> function1) {
        C12275b bVar = new C12275b();
        Disposable d = this.f5293j.isAuthenticated().mo36459b((Predicate<? super T>) C1474f.f5303e).mo36499h((Function<? super T, ? extends SingleSource<? extends R>>) new C1472d<Object,Object>(this, function1)).mo36428a((C12286f) this.f5290g.getUserInteractive()).mo36476d((Consumer<? super T>) new C1473e<Object>(bVar, this, function1));
        C12932j.m33815a((Object) d, "authenticatedLifecycle.i…      }\n                }");
        C12773a.m33432a(d, bVar);
        return bVar;
    }

    /* renamed from: a */
    private final Disposable m6569a(Function1<? super AppLifecycleObserver, ? extends Disposable> function1) {
        C12275b bVar = new C12275b();
        Disposable d = m6570a().mo36535a((C12286f) this.f5290g.getUserInteractive()).mo36551d((Consumer<? super T>) new C1471c<Object>(bVar, this, function1));
        C12932j.m33815a((Object) d, "generalLifecycleObserver…      }\n                }");
        C12773a.m33432a(d, bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C12291g<Set<AppLifecycleObserver>> m6571a(Provider<Set<AppLifecycleObserver>> provider) {
        C12291g<Set<AppLifecycleObserver>> b = C12291g.m32769c((Callable<? extends T>) new C1479k<Object>(provider)).mo36544b((C12286f) this.f5290g.getComputation()).mo36543b();
        C12932j.m33815a((Object) b, "Single.fromCallable {\n  …ion)\n            .cache()");
        return b;
    }
}
