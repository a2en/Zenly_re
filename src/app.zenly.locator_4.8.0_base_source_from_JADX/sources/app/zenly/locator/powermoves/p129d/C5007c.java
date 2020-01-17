package app.zenly.locator.powermoves.p129d;

import android.app.Application;
import app.zenly.locator.powermoves.p127b.C4984a;
import app.zenly.locator.powermoves.p129d.p130d.C5016d;
import app.zenly.locator.powermoves.p129d.p131e.C5017a;
import app.zenly.locator.powermoves.p129d.p131e.C5019b;
import java.util.List;
import kotlin.C12899i;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12291g;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p390h.p392c.C12295a;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12777c;
import p389io.reactivex.p405m.C12779d;

/* renamed from: app.zenly.locator.powermoves.d.c */
public final class C5007c extends C5019b {

    /* renamed from: e */
    private final C5017a<C5016d> f13037e = new C5017a<>();

    /* renamed from: app.zenly.locator.powermoves.d.c$a */
    static final class C5008a<T> implements Consumer<C12899i<? extends List<? extends C4984a>, ? extends Integer>> {

        /* renamed from: e */
        final /* synthetic */ C5007c f13038e;

        C5008a(C5007c cVar) {
            this.f13038e = cVar;
        }

        /* renamed from: a */
        public final void accept(C12899i<? extends List<C4984a>, Integer> iVar) {
            this.f13038e.mo12255e().mo12260a(C5016d.ALL_PM_LOADED, (Object) new C12899i((List) iVar.mo37202a(), (Integer) iVar.mo37203b()));
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.c$b */
    static final class C5009b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5007c f13039e;

        C5009b(C5007c cVar) {
            this.f13039e = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C5007c cVar = this.f13039e;
            C12932j.m33815a((Object) th, "it");
            cVar.mo12264a(th);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.c$c */
    static final class C5010c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C5010c f13040e = new C5010c();

        C5010c() {
        }

        /* renamed from: a */
        public final int mo12258a(C12899i<C4984a, ? extends List<C4984a>> iVar) {
            C12932j.m33818b(iVar, "<name for destructuring parameter 0>");
            return ((List) iVar.mo37203b()).indexOf((C4984a) iVar.mo37202a());
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(mo12258a((C12899i) obj));
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.c$d */
    static final class C5011d<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5007c f13041e;

        C5011d(C5007c cVar) {
            this.f13041e = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C5007c cVar = this.f13041e;
            C12932j.m33815a((Object) th, "it");
            cVar.mo12264a(th);
        }
    }

    /* renamed from: app.zenly.locator.powermoves.d.c$e */
    static final class C5012e extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        public static final C5012e f13042f = new C5012e();

        C5012e() {
            super(0);
        }

        public final void invoke() {
        }
    }

    public C5007c(Application application) {
        C12932j.m33818b(application, "application");
        super(application);
    }

    /* renamed from: a */
    public final void mo12253a(C4984a aVar) {
        C12932j.m33818b(aVar, "powerMove");
        C12271b a = mo12267d().markPowerMoveAsRead(aVar).mo36342a(C12295a.m32802a()).mo36343a((Consumer<? super Throwable>) new C5011d<Object>(this));
        C12932j.m33815a((Object) a, "service.markPowerMoveAsR…r { handleThrowable(it) }");
        C12773a.m33432a(C12779d.m33437a(a, (Function1) null, (Function0) C5012e.f13042f, 1, (Object) null), mo12266c());
    }

    /* renamed from: b */
    public final void mo12254b(String str) {
        C12932j.m33818b(str, "powerMoveId");
        C12291g powerMove = mo12267d().powerMove(str);
        C12291g powerMoves = mo12267d().powerMoves();
        C12291g d = C12777c.f33323a.mo36957a(powerMove, powerMoves).mo36552d((Function<? super T, ? extends R>) C5010c.f13040e);
        C12932j.m33815a((Object) d, "Singles.zip(selectedPm, … list.indexOf(selected) }");
        Disposable c = C12777c.f33323a.mo36957a(powerMoves, d).mo36535a(C12295a.m32802a()).mo36549c((Consumer<? super T>) new C5008a<Object>(this)).mo36537a((Consumer<? super Throwable>) new C5009b<Object>(this)).mo36547c();
        C12932j.m33815a((Object) c, "Singles.zip(allPm, selec…\n            .subscribe()");
        C12773a.m33432a(c, mo12266c());
    }

    /* renamed from: e */
    public final C5017a<C5016d> mo12255e() {
        return this.f13037e;
    }
}
