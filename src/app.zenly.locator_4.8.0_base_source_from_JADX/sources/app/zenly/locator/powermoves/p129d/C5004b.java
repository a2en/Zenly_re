package app.zenly.locator.powermoves.p129d;

import android.app.Application;
import app.zenly.locator.powermoves.p127b.C4984a;
import app.zenly.locator.powermoves.p129d.p130d.C5015c;
import app.zenly.locator.powermoves.p129d.p131e.C5017a;
import app.zenly.locator.powermoves.p129d.p131e.C5019b;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.powermoves.d.b */
public final class C5004b extends C5019b {

    /* renamed from: e */
    private final C5017a<C5015c> f13034e = new C5017a<>();

    /* renamed from: app.zenly.locator.powermoves.d.b$a */
    static final class C5005a<T> implements Consumer<C4984a> {

        /* renamed from: e */
        final /* synthetic */ C5004b f13035e;

        C5005a(C5004b bVar) {
            this.f13035e = bVar;
        }

        /* renamed from: a */
        public final void accept(C4984a aVar) {
            this.f13035e.mo12250e().mo12260a(C5015c.PM_LOADED, (Object) aVar);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.b$b */
    static final class C5006b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5004b f13036e;

        C5006b(C5004b bVar) {
            this.f13036e = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C5004b bVar = this.f13036e;
            C12932j.m33815a((Object) th, "it");
            bVar.mo12264a(th);
        }
    }

    public C5004b(Application application) {
        C12932j.m33818b(application, "application");
        super(application);
    }

    /* renamed from: b */
    public final void mo12249b(String str) {
        C12932j.m33818b(str, "powerMoveId");
        Disposable c = mo12267d().powerMove(str).mo36535a(C12295a.m32802a()).mo36549c((Consumer<? super T>) new C5005a<Object>(this)).mo36537a((Consumer<? super Throwable>) new C5006b<Object>(this)).mo36547c();
        C12932j.m33815a((Object) c, "service.powerMove(powerM…\n            .subscribe()");
        C12773a.m33432a(c, mo12266c());
    }

    /* renamed from: e */
    public final C5017a<C5015c> mo12250e() {
        return this.f13034e;
    }
}
