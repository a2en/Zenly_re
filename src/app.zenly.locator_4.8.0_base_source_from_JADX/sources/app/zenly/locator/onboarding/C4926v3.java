package app.zenly.locator.onboarding;

import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.onboarding.C4933w3.C4934a;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.onboarding.v3 */
public final class C4926v3 {

    /* renamed from: a */
    private final C4933w3 f12917a;

    /* renamed from: b */
    private final C12275b f12918b = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C4916u3 f12919c;

    /* renamed from: d */
    private final boolean f12920d;

    /* renamed from: app.zenly.locator.onboarding.v3$a */
    static final class C4927a<T> implements Consumer<C4934a> {

        /* renamed from: e */
        final /* synthetic */ C4926v3 f12921e;

        C4927a(C4926v3 v3Var) {
            this.f12921e = v3Var;
        }

        /* renamed from: a */
        public final void accept(C4934a aVar) {
            C4916u3 a = this.f12921e.f12919c;
            C12932j.m33815a((Object) aVar, "userMeWithFriends");
            a.mo12121a(aVar);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.v3$b */
    static final class C4928b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4928b f12922e = new C4928b();

        C4928b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Cannot get user me with friends", new Object[0]);
        }
    }

    public C4926v3(FriendStore friendStore, C4916u3 u3Var, boolean z) {
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(u3Var, "controller");
        this.f12919c = u3Var;
        this.f12920d = z;
        this.f12917a = new C4933w3(friendStore);
    }

    /* renamed from: b */
    public final void mo12130b() {
        if (this.f12920d) {
            this.f12919c.mo12000E();
        } else {
            this.f12919c.mo12117F();
        }
    }

    /* renamed from: c */
    public final void mo12131c() {
        Disposable a = this.f12917a.mo12138a().mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C4927a<Object>(this), (Consumer<? super Throwable>) C4928b.f12922e);
        C12932j.m33815a((Object) a, "viewModel.userMeWithFrie…friends\") }\n            )");
        C12773a.m33432a(a, this.f12918b);
    }

    /* renamed from: d */
    public final void mo12132d() {
        if (this.f12920d) {
            this.f12919c.mo12119H();
        } else {
            this.f12919c.mo12120I();
        }
    }

    /* renamed from: e */
    public final void mo12133e() {
        this.f12918b.mo36401a();
    }

    /* renamed from: a */
    public final void mo12129a() {
        this.f12919c.mo12118G();
    }
}
