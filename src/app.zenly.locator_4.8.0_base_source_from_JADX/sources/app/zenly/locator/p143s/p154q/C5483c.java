package app.zenly.locator.p143s.p154q;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import androidx.core.content.C0540a;
import app.zenly.android.feature.base.p010rx.RxBroadcastReceiver;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.ActivityLifecycleObserver;
import app.zenly.locator.AuthenticatedLifecycle;
import app.zenly.locator.C3819h;
import app.zenly.locator.MainActivity;
import app.zenly.locator.RequiresAuthentication;
import app.zenly.locator.core.helper.C2513e;
import app.zenly.locator.core.invitations.p068g0.C2593c;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.onboarding.activity.SignupActivity;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p208y.C6300h;
import com.google.android.gms.location.C10568e;
import com.google.android.gms.location.C10571f;
import com.google.android.gms.location.C10575h;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest.C10558a;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.models.core.C7174n2;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p387h.p388a.C12143a;
import p389io.reactivex.C12273d;
import p389io.reactivex.C12286f;
import p389io.reactivex.MaybeEmitter;
import p389io.reactivex.MaybeOnSubscribe;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.s.q.c */
public final class C5483c implements ActivityLifecycleObserver {

    /* renamed from: e */
    static final /* synthetic */ KProperty[] f14094e;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ZenlySchedulers f14095a = C1351e.m6372a(C3819h.f10169b.mo19916a("readyToBoot"));

    /* renamed from: b */
    private final Lazy f14096b = C12896f.m33751a(new C5494h(this));
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Activity f14097c;

    /* renamed from: d */
    private final AuthenticatedLifecycle f14098d;

    /* renamed from: app.zenly.locator.s.q.c$a */
    static final class C5484a<T> implements MaybeOnSubscribe<T> {

        /* renamed from: a */
        final /* synthetic */ C5483c f14099a;

        /* renamed from: b */
        final /* synthetic */ Intent f14100b;

        /* renamed from: app.zenly.locator.s.q.c$a$a */
        static final class C5485a implements OnFailureListener {

            /* renamed from: a */
            final /* synthetic */ C5484a f14101a;

            /* renamed from: b */
            final /* synthetic */ MaybeEmitter f14102b;

            C5485a(C5484a aVar, MaybeEmitter maybeEmitter) {
                this.f14101a = aVar;
                this.f14102b = maybeEmitter;
            }

            public final void onFailure(Exception exc) {
                C12932j.m33818b(exc, "it");
                C5484a aVar = this.f14101a;
                Intent intent = aVar.f14100b;
                if (intent == null) {
                    intent = new Intent(aVar.f14099a.f14097c, MainActivity.class);
                }
                this.f14102b.onSuccess(SignupActivity.m13882d(this.f14101a.f14099a.f14097c, intent));
            }
        }

        /* renamed from: app.zenly.locator.s.q.c$a$b */
        static final class C5486b<TResult> implements OnSuccessListener<C10571f> {

            /* renamed from: a */
            final /* synthetic */ MaybeEmitter f14103a;

            C5486b(MaybeEmitter maybeEmitter) {
                this.f14103a = maybeEmitter;
            }

            /* renamed from: a */
            public final void onSuccess(C10571f fVar) {
                this.f14103a.onComplete();
            }
        }

        C5484a(C5483c cVar, Intent intent) {
            this.f14099a = cVar;
            this.f14100b = intent;
        }

        public final void subscribe(MaybeEmitter<Intent> maybeEmitter) {
            C12932j.m33818b(maybeEmitter, "emitter");
            C12143a.m32027a("checkLocationSettings", new Object[0]);
            LocationRequest priority = LocationRequest.create().setPriority(100);
            C10558a aVar = new C10558a();
            aVar.mo28668a(priority);
            aVar.mo28669a(true);
            C10693c a = this.f14099a.m15581a().mo28698a(aVar.mo28670a());
            a.mo29300a((OnFailureListener) new C5485a(this, maybeEmitter));
            a.mo29301a((OnSuccessListener<? super TResult>) new C5486b<Object>(maybeEmitter));
        }
    }

    /* renamed from: app.zenly.locator.s.q.c$b */
    static final class C5487b<V> implements Callable<T> {

        /* renamed from: e */
        final /* synthetic */ C5483c f14104e;

        /* renamed from: f */
        final /* synthetic */ Intent f14105f;

        C5487b(C5483c cVar, Intent intent) {
            this.f14104e = cVar;
            this.f14105f = intent;
        }

        public final Intent call() {
            if (new C2513e(this.f14104e.f14097c).mo8588d()) {
                return SignupActivity.m13883e(this.f14104e.f14097c, this.f14105f);
            }
            return null;
        }
    }

    /* renamed from: app.zenly.locator.s.q.c$c */
    static final class C5488c<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5483c f14106e;

        /* renamed from: f */
        final /* synthetic */ Intent f14107f;

        /* renamed from: app.zenly.locator.s.q.c$c$a */
        static final class C5489a<V> implements Callable<T> {

            /* renamed from: e */
            final /* synthetic */ C5488c f14108e;

            /* renamed from: f */
            final /* synthetic */ Boolean f14109f;

            C5489a(C5488c cVar, Boolean bool) {
                this.f14108e = cVar;
                this.f14109f = bool;
            }

            public final Intent call() {
                C7174n2 n2Var = (C7174n2) C5448c.m15478a().sessionCacheGet().mo36487e(1).mo36446a(null);
                SharedPreferences h = C5407g.f13966d.mo12991a(this.f14108e.f14106e.f14097c).mo12986h();
                C2594d dVar = new C2594d(h);
                int i = (!C2593c.m8906a(C3444a.m10686a(this.f14108e.f14106e.f14097c), dVar) || dVar.mo8699a()) ? new C6300h(h).mo14157d() ? 55 : 53 : 54;
                if (!this.f14109f.booleanValue()) {
                    return SignupActivity.m13874a(this.f14108e.f14106e.f14097c, this.f14108e.f14107f);
                }
                if (n2Var != null && n2Var.getContactPickerDone() < i) {
                    return SignupActivity.m13874a(this.f14108e.f14106e.f14097c, this.f14108e.f14107f);
                }
                if (C0540a.m2537a((Context) this.f14108e.f14106e.f14097c, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    return SignupActivity.m13882d(this.f14108e.f14106e.f14097c, this.f14108e.f14107f);
                }
                if (C0540a.m2537a((Context) this.f14108e.f14106e.f14097c, "android.permission.READ_CONTACTS") != 0) {
                    return SignupActivity.m13879b(this.f14108e.f14106e.f14097c, this.f14108e.f14107f);
                }
                return null;
            }
        }

        C5488c(C5483c cVar, Intent intent) {
            this.f14106e = cVar;
            this.f14107f = intent;
        }

        /* renamed from: a */
        public final C12273d<Intent> apply(Boolean bool) {
            C12932j.m33818b(bool, "isAuthenticated");
            return C12273d.m32559a((Callable<? extends T>) new C5489a<Object>(this, bool));
        }
    }

    /* renamed from: app.zenly.locator.s.q.c$d */
    static final class C5490d<T> implements Consumer<Intent> {

        /* renamed from: e */
        final /* synthetic */ C5483c f14110e;

        C5490d(C5483c cVar) {
            this.f14110e = cVar;
        }

        /* renamed from: a */
        public final void accept(Intent intent) {
            this.f14110e.f14097c.startActivity(intent);
            this.f14110e.f14097c.finish();
        }
    }

    /* renamed from: app.zenly.locator.s.q.c$e */
    static final class C5491e<T> implements Consumer<Intent> {

        /* renamed from: e */
        final /* synthetic */ C5483c f14111e;

        C5491e(C5483c cVar, C12275b bVar) {
            this.f14111e = cVar;
        }

        /* renamed from: a */
        public final void accept(Intent intent) {
            this.f14111e.f14097c.startActivity(intent);
            this.f14111e.f14097c.finish();
        }
    }

    /* renamed from: app.zenly.locator.s.q.c$f */
    static final class C5492f<T, R> implements Function<T, MaybeSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C5483c f14112e;

        C5492f(C5483c cVar) {
            this.f14112e = cVar;
        }

        /* renamed from: a */
        public final C12273d<Intent> apply(Intent intent) {
            C12932j.m33818b(intent, "it");
            return C5483c.m15583a(this.f14112e, null, 1, null).mo36392b((C12286f) this.f14112e.f14095a.getUserInteractive());
        }
    }

    /* renamed from: app.zenly.locator.s.q.c$g */
    static final class C5493g<T> implements Consumer<Intent> {

        /* renamed from: e */
        final /* synthetic */ C5483c f14113e;

        C5493g(C5483c cVar) {
            this.f14113e = cVar;
        }

        /* renamed from: a */
        public final void accept(Intent intent) {
            this.f14113e.f14097c.startActivity(intent);
            this.f14113e.f14097c.finish();
        }
    }

    /* renamed from: app.zenly.locator.s.q.c$h */
    static final class C5494h extends C12933k implements Function0<C10575h> {

        /* renamed from: f */
        final /* synthetic */ C5483c f14114f;

        C5494h(C5483c cVar) {
            this.f14114f = cVar;
            super(0);
        }

        public final C10575h invoke() {
            return C10568e.m27018a(this.f14114f.f14097c);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C5483c.class), "settingsClient", "getSettingsClient()Lcom/google/android/gms/location/SettingsClient;");
        C12946x.m33839a((C12940r) sVar);
        f14094e = new KProperty[]{sVar};
    }

    public C5483c(Activity activity, AuthenticatedLifecycle authenticatedLifecycle) {
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(authenticatedLifecycle, "authLifecycle");
        this.f14097c = activity;
        this.f14098d = authenticatedLifecycle;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10575h m15581a() {
        Lazy lazy = this.f14096b;
        KProperty kProperty = f14094e[0];
        return (C10575h) lazy.getValue();
    }

    public Disposable onCreate() {
        Activity activity = this.f14097c;
        if (!(activity instanceof RequiresAuthentication)) {
            Disposable a = C12276c.m32592a();
            C12932j.m33815a((Object) a, "Disposables.disposed()");
            return a;
        }
        Disposable c = C12273d.m32556a((MaybeSource<? extends T>) m15585b(activity.getIntent()), (MaybeSource<? extends T>) m15587c(this.f14097c.getIntent())).mo36367b().mo36392b((C12286f) this.f14095a.getUserInteractive()).mo36378a((C12286f) this.f14095a.getMainThread()).mo36398c((Consumer<? super T>) new C5490d<Object>(this));
        C12932j.m33815a((Object) c, "Maybe.concat(\n          …ty.finish()\n            }");
        return c;
    }

    /* JADX INFO: finally extract failed */
    public Disposable onForeground() {
        if (!(this.f14097c instanceof RequiresAuthentication)) {
            Disposable a = C12276c.m32592a();
            C12932j.m33815a((Object) a, "Disposables.disposed()");
            return a;
        }
        C12275b bVar = new C12275b();
        C7707a.m18761b("checkLocationSettings");
        try {
            Disposable c = m15582a(this.f14097c.getIntent()).mo36392b((C12286f) this.f14095a.getUserInteractive()).mo36378a((C12286f) this.f14095a.getMainThread()).mo36398c((Consumer<? super T>) new C5491e<Object>(this, bVar));
            C12932j.m33815a((Object) c, "checkLocationSettings(ac…inish()\n                }");
            C12773a.m33432a(c, bVar);
            C7707a.m18759a();
            Disposable d = RxBroadcastReceiver.f4946c.mo6555a(this.f14097c, new IntentFilter("android.location.PROVIDERS_CHANGED")).mo36452b((C12286f) this.f14095a.getUserInteractive()).mo36497g((Function<? super T, ? extends MaybeSource<? extends R>>) new C5492f<Object,Object>(this)).mo36428a((C12286f) this.f14095a.getMainThread()).mo36476d((Consumer<? super T>) new C5493g<Object>(this));
            C12932j.m33815a((Object) d, "RxBroadcastReceiver.crea…ty.finish()\n            }");
            C12773a.m33432a(d, bVar);
            return bVar;
        } catch (Throwable th) {
            C7707a.m18759a();
            throw th;
        }
    }

    /* renamed from: a */
    private final C12273d<Intent> m15582a(Intent intent) {
        C12273d<Intent> a = C12273d.m32558a((MaybeOnSubscribe<T>) new C5484a<T>(this, intent));
        C12932j.m33815a((Object) a, "Maybe.create<Intent> { e…ete()\n            }\n    }");
        return a;
    }

    /* renamed from: b */
    private final C12273d<Intent> m15585b(Intent intent) {
        C12273d<Intent> a = C12273d.m32559a((Callable<? extends T>) new C5487b<Object>(this, intent));
        C12932j.m33815a((Object) a, "Maybe.fromCallable {\n   …     null\n        }\n    }");
        return a;
    }

    /* renamed from: c */
    private final C12273d<Intent> m15587c(Intent intent) {
        C12273d<Intent> a = this.f14098d.isAuthenticated().mo36428a((C12286f) this.f14095a.getUserInteractive()).mo36486e().mo36381a((Function<? super T, ? extends MaybeSource<? extends R>>) new C5488c<Object,Object>(this, intent));
        C12932j.m33815a((Object) a, "authLifecycle.isAuthenti…          }\n            }");
        return a;
    }

    /* renamed from: a */
    static /* synthetic */ C12273d m15583a(C5483c cVar, Intent intent, int i, Object obj) {
        if ((i & 1) != 0) {
            intent = null;
        }
        return cVar.m15582a(intent);
    }
}
