package app.zenly.locator;

import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.store.C2931a;
import app.zenly.locator.core.store.C3010c;
import app.zenly.locator.core.store.C3023e;
import app.zenly.locator.core.store.C3027g;
import app.zenly.locator.core.store.C3034i;
import app.zenly.locator.core.store.C3045k;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;

/* renamed from: app.zenly.locator.i */
public final class C3820i implements AppLifecycleObserver {

    /* renamed from: a */
    private final Provider<C3034i> f10170a;

    /* renamed from: b */
    private final Provider<C3023e> f10171b;

    /* renamed from: c */
    private final Provider<C3027g> f10172c;

    /* renamed from: d */
    private final Provider<C2931a> f10173d;

    /* renamed from: e */
    private final Provider<C3010c> f10174e;

    /* renamed from: f */
    private final Provider<C3045k> f10175f;

    /* renamed from: g */
    private final Provider<MeUserManager> f10176g;

    /* renamed from: h */
    private final Provider<C2718k5> f10177h;

    public C3820i(Provider<C3034i> provider, Provider<C3023e> provider2, Provider<C3027g> provider3, Provider<C2931a> provider4, Provider<C3010c> provider5, Provider<C3045k> provider6, Provider<MeUserManager> provider7, Provider<C2718k5> provider8) {
        C12932j.m33818b(provider, "friendStore");
        C12932j.m33818b(provider2, "bestFriendStore");
        C12932j.m33818b(provider3, "friendRequestStore");
        C12932j.m33818b(provider4, "aozStore");
        C12932j.m33818b(provider5, "soonStore");
        C12932j.m33818b(provider6, "friendshipStore");
        C12932j.m33818b(provider7, "userMeManager");
        C12932j.m33818b(provider8, "friendsManager");
        this.f10170a = provider;
        this.f10171b = provider2;
        this.f10172c = provider3;
        this.f10173d = provider4;
        this.f10174e = provider5;
        this.f10175f = provider6;
        this.f10176g = provider7;
        this.f10177h = provider8;
    }

    public Disposable onForeground() {
        C12143a.m32027a("User is foreground and authenticated, starting all stores", new Object[0]);
        C7707a.m18761b("store:registry:start");
        try {
            return new C12275b(((C3034i) this.f10170a.get()).mo9217a(), ((C3023e) this.f10171b.get()).mo9208a(), ((C3027g) this.f10172c.get()).mo9211a(), ((C2931a) this.f10173d.get()).mo9040a(), ((C3010c) this.f10174e.get()).mo9198a(), ((C3045k) this.f10175f.get()).mo9227a(), ((MeUserManager) this.f10176g.get()).mo8761d(), ((C2718k5) this.f10177h.get()).mo8796f());
        } finally {
            C7707a.m18759a();
        }
    }

    public Disposable onInitialize() {
        Disposable a = C12276c.m32592a();
        C12932j.m33815a((Object) a, "Disposables.disposed()");
        return a;
    }
}
