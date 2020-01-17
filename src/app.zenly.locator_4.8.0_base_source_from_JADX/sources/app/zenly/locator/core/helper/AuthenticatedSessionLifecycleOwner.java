package app.zenly.locator.core.helper;

import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0869k;
import androidx.lifecycle.C0875o;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.locator.AuthenticatedLifecycle;
import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p266e.C7702b;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;

public final class AuthenticatedSessionLifecycleOwner implements LifecycleOwner, LifecycleObserver {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static AuthenticatedSessionLifecycleOwner f7493h;

    /* renamed from: i */
    public static final C2495a f7494i = new C2495a(null);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0869k f7495e = new C0869k(this);

    /* renamed from: f */
    private Disposable f7496f;

    /* renamed from: g */
    private final AuthenticatedLifecycle f7497g;

    /* renamed from: app.zenly.locator.core.helper.AuthenticatedSessionLifecycleOwner$a */
    public static final class C2495a {
        private C2495a() {
        }

        /* renamed from: a */
        public final LifecycleOwner mo8561a() {
            AuthenticatedSessionLifecycleOwner a = AuthenticatedSessionLifecycleOwner.f7493h;
            if (a != null) {
                return a;
            }
            C12932j.m33820c("instance");
            throw null;
        }

        public /* synthetic */ C2495a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo8562a(LifecycleOwner lifecycleOwner, AuthenticatedLifecycle authenticatedLifecycle) {
            C12932j.m33818b(lifecycleOwner, "processLifecycleOwner");
            C12932j.m33818b(authenticatedLifecycle, "authenticatedLifecycle");
            AuthenticatedSessionLifecycleOwner.f7493h = new AuthenticatedSessionLifecycleOwner(lifecycleOwner, authenticatedLifecycle);
        }
    }

    /* renamed from: app.zenly.locator.core.helper.AuthenticatedSessionLifecycleOwner$b */
    static final class C2496b<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ AuthenticatedSessionLifecycleOwner f7498e;

        C2496b(AuthenticatedSessionLifecycleOwner authenticatedSessionLifecycleOwner) {
            this.f7498e = authenticatedSessionLifecycleOwner;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C12932j.m33815a((Object) bool, "authenticated");
            if (bool.booleanValue()) {
                this.f7498e.f7495e.mo4450a(C0863a.ON_START);
            } else {
                this.f7498e.f7495e.mo4450a(C0863a.ON_STOP);
            }
        }
    }

    public AuthenticatedSessionLifecycleOwner(LifecycleOwner lifecycleOwner, AuthenticatedLifecycle authenticatedLifecycle) {
        C12932j.m33818b(lifecycleOwner, "processLifecycleOwner");
        C12932j.m33818b(authenticatedLifecycle, "authenticatedLifecycle");
        this.f7497g = authenticatedLifecycle;
        C1351e.m6372a(new C7702b("auth").mo19916a("lifecycle"));
        lifecycleOwner.getLifecycle().mo4446a(this);
    }

    /* renamed from: b */
    public static final LifecycleOwner m8733b() {
        return f7494i.mo8561a();
    }

    public C0862g getLifecycle() {
        return this.f7495e;
    }

    @C0875o(C0863a.ON_START)
    public final void onStart() {
        C7707a.m18761b("authlifecycle:start");
        try {
            this.f7496f = this.f7497g.isAuthenticated().mo36476d((Consumer<? super T>) new C2496b<Object>(this));
            C12956q qVar = C12956q.f33541a;
        } finally {
            C7707a.m18759a();
        }
    }

    @C0875o(C0863a.ON_STOP)
    public final void onStop() {
        Disposable disposable = this.f7496f;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f7495e.mo4450a(C0863a.ON_STOP);
    }
}
