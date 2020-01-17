package app.zenly.locator.powermoves.p129d;

import android.app.Application;
import app.zenly.locator.powermoves.p127b.C4984a;
import app.zenly.locator.powermoves.p129d.p130d.C5013a;
import app.zenly.locator.powermoves.p129d.p130d.C5014b;
import app.zenly.locator.powermoves.p129d.p131e.C5017a;
import app.zenly.locator.powermoves.p129d.p131e.C5019b;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.powermoves.d.a */
public final class C4995a extends C5019b {

    /* renamed from: e */
    private final C5017a<C5013a> f13024e = new C5017a<>();

    /* renamed from: f */
    private final C5017a<C5014b> f13025f = new C5017a<>();

    /* renamed from: app.zenly.locator.powermoves.d.a$a */
    static final class C4996a<T> implements Consumer<List<? extends C4984a>> {

        /* renamed from: e */
        final /* synthetic */ C4995a f13026e;

        C4996a(C4995a aVar) {
            this.f13026e = aVar;
        }

        /* renamed from: a */
        public final void accept(List<C4984a> list) {
            this.f13026e.mo12238e().mo12260a(C5013a.LOADED, (Object) list);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.a$b */
    static final class C4997b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C4995a f13027e;

        C4997b(C4995a aVar) {
            this.f13027e = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C4995a aVar = this.f13027e;
            C12932j.m33815a((Object) th, "it");
            aVar.mo12264a(th);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.a$c */
    static final class C4998c<T> implements Predicate<Boolean> {

        /* renamed from: e */
        public static final C4998c f13028e = new C4998c();

        C4998c() {
        }

        /* renamed from: a */
        public final Boolean mo12243a(Boolean bool) {
            C12932j.m33818b(bool, "justUnlock");
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo12243a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.a$d */
    static final class C4999d<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ C4995a f13029e;

        C4999d(C4995a aVar) {
            this.f13029e = aVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C5017a.m14387b(this.f13029e.mo12239f(), C5014b.JUST_UNLOCK, null, 2, null);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.a$e */
    static final class C5000e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C4995a f13030e;

        C5000e(C4995a aVar) {
            this.f13030e = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C4995a aVar = this.f13030e;
            C12932j.m33815a((Object) th, "it");
            aVar.mo12264a(th);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.a$f */
    static final class C5001f<T> implements Predicate<Boolean> {

        /* renamed from: e */
        public static final C5001f f13031e = new C5001f();

        C5001f() {
        }

        /* renamed from: a */
        public final Boolean mo12246a(Boolean bool) {
            C12932j.m33818b(bool, "allRead");
            return bool;
        }

        public /* bridge */ /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            mo12246a(bool);
            return bool.booleanValue();
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.a$g */
    static final class C5002g<T> implements Consumer<Boolean> {

        /* renamed from: e */
        final /* synthetic */ C4995a f13032e;

        C5002g(C4995a aVar) {
            this.f13032e = aVar;
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
            C5017a.m14387b(this.f13032e.mo12239f(), C5014b.HAS_UNLOCK, null, 2, null);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.a$h */
    static final class C5003h<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C4995a f13033e;

        C5003h(C4995a aVar) {
            this.f13033e = aVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C4995a aVar = this.f13033e;
            C12932j.m33815a((Object) th, "it");
            aVar.mo12264a(th);
        }
    }

    public C4995a(Application application) {
        C12932j.m33818b(application, "application");
        super(application);
    }

    /* renamed from: e */
    public final C5017a<C5013a> mo12238e() {
        return this.f13024e;
    }

    /* renamed from: f */
    public final C5017a<C5014b> mo12239f() {
        return this.f13025f;
    }

    /* renamed from: g */
    public final void mo12240g() {
        Disposable c = mo12267d().powerMoves().mo36535a(C12295a.m32802a()).mo36549c((Consumer<? super T>) new C4996a<Object>(this)).mo36537a((Consumer<? super Throwable>) new C4997b<Object>(this)).mo36547c();
        C12932j.m33815a((Object) c, "service.powerMoves()\n   …\n            .subscribe()");
        C12773a.m33432a(c, mo12266c());
        Disposable a = mo12267d().justUnlockedPowerMoves().mo36532a((Predicate<? super T>) C4998c.f13028e).mo36378a(C12295a.m32802a()).mo36393b((Consumer<? super T>) new C4999d<Object>(this)).mo36380a((Consumer<? super Throwable>) new C5000e<Object>(this)).mo36384a();
        C12932j.m33815a((Object) a, "service.justUnlockedPowe…\n            .subscribe()");
        C12773a.m33432a(a, mo12266c());
        Disposable a2 = mo12267d().powerMovesRead().mo36532a((Predicate<? super T>) C5001f.f13031e).mo36378a(C12295a.m32802a()).mo36393b((Consumer<? super T>) new C5002g<Object>(this)).mo36380a((Consumer<? super Throwable>) new C5003h<Object>(this)).mo36384a();
        C12932j.m33815a((Object) a2, "service.powerMovesRead()…\n            .subscribe()");
        C12773a.m33432a(a2, mo12266c());
    }
}
