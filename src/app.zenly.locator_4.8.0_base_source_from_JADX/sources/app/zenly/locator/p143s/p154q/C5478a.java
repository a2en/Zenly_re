package app.zenly.locator.p143s.p154q;

import app.zenly.locator.ActivityLifecycleObserver;
import app.zenly.locator.AuthenticatedNotifier;
import app.zenly.locator.C3763f;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.C7402n2;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.s.q.a */
public final class C5478a implements ActivityLifecycleObserver {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final AuthenticatedNotifier f14087a;

    /* renamed from: app.zenly.locator.s.q.a$a */
    static final class C5479a<T> implements Consumer<C7402n2> {

        /* renamed from: e */
        final /* synthetic */ C5478a f14088e;

        C5479a(C5478a aVar) {
            this.f14088e = aVar;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: a */
        public final void accept(C7402n2 n2Var) {
            C7707a.m18761b("identity:init");
            try {
                C3763f fVar = C3763f.f10063a;
                C12932j.m33815a((Object) n2Var, "session");
                fVar.mo10322a(n2Var);
                C12956q qVar = C12956q.f33541a;
                C7707a.m18759a();
                this.f14088e.f14087a.setAuthenticated(true);
            } catch (Throwable th) {
                C7707a.m18759a();
                throw th;
            }
        }
    }

    public C5478a(AuthenticatedNotifier authenticatedNotifier) {
        C12932j.m33818b(authenticatedNotifier, "authenticatedNotifier");
        this.f14087a = authenticatedNotifier;
    }

    public Disposable onCreate() {
        Disposable d = C5448c.m15478a().sessionGet().mo36476d((Consumer<? super T>) new C5479a<Object>(this));
        C12932j.m33815a((Object) d, "ZenlyCoreProvider.get().…cated(true)\n            }");
        return d;
    }

    public Disposable onForeground() {
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }
}
