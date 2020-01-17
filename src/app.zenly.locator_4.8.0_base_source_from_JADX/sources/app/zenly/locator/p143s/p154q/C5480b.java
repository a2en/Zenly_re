package app.zenly.locator.p143s.p154q;

import android.content.Intent;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.ActivityLifecycleObserver;
import app.zenly.locator.AuthenticatedNotifier;
import app.zenly.locator.C3819h;
import app.zenly.locator.MainActivity;
import app.zenly.locator.RequiresAuthentication;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.onboarding.activity.SignupActivity;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.s.q.b */
public final class C5480b implements ActivityLifecycleObserver {

    /* renamed from: a */
    private final ZenlySchedulers f14089a = C1351e.m6372a(C3819h.f10169b.mo19916a("logout"));

    /* renamed from: b */
    private final BaseActivity f14090b;

    /* renamed from: c */
    private final AuthenticatedNotifier f14091c;

    /* renamed from: app.zenly.locator.s.q.b$a */
    static final class C5481a<T> implements Predicate<Integer> {

        /* renamed from: e */
        public static final C5481a f14092e = new C5481a();

        C5481a() {
        }

        /* renamed from: a */
        public final boolean test(Integer num) {
            C12932j.m33818b(num, "it");
            return num.intValue() == 5;
        }
    }

    /* renamed from: app.zenly.locator.s.q.b$b */
    static final class C5482b<T> implements Consumer<Integer> {

        /* renamed from: e */
        final /* synthetic */ C5480b f14093e;

        C5482b(C5480b bVar) {
            this.f14093e = bVar;
        }

        /* renamed from: a */
        public final void accept(Integer num) {
            this.f14093e.m15576a();
        }
    }

    public C5480b(BaseActivity baseActivity, AuthenticatedNotifier authenticatedNotifier) {
        C12932j.m33818b(baseActivity, "activity");
        C12932j.m33818b(authenticatedNotifier, "authenticatedNotifier");
        this.f14090b = baseActivity;
        this.f14091c = authenticatedNotifier;
    }

    public Disposable onCreate() {
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }

    public Disposable onForeground() {
        if (this.f14090b instanceof RequiresAuthentication) {
            Disposable d = C5448c.m15478a().serverStateStream().mo36459b((Predicate<? super T>) C5481a.f14092e).mo36477d().mo36428a((C12286f) this.f14089a.getMainThread()).mo36476d((Consumer<? super T>) new C5482b<Object>(this));
            C12932j.m33815a((Object) d, "ZenlyCoreProvider.get()\n…{ onServerStateChange() }");
            return d;
        }
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m15576a() {
        Intent c = SignupActivity.m13880c(this.f14090b, new Intent(this.f14090b, MainActivity.class));
        this.f14091c.setAuthenticated(false);
        C5343a.m15160U().mo12855b();
        this.f14090b.startActivity(c);
        this.f14090b.finish();
    }
}
