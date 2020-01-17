package app.zenly.locator.chat.p052l5;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.chat.p052l5.C2085a.C2086a;
import app.zenly.locator.chat.panel.ChatPanelHelper.C2214e;
import app.zenly.locator.core.contracts.MapControllerContract.C2458b;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.chat.l5.b */
public final class C2087b {

    /* renamed from: a */
    private final C12275b f6568a = new C12275b();

    /* renamed from: b */
    private final ZenlySchedulers f6569b = C1351e.m6372a(C2382x4.f7181b.mo19916a("header"));

    /* renamed from: c */
    private final C12279e<C2458b> f6570c;

    /* renamed from: d */
    private final C12279e<C2214e> f6571d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2085a f6572e;

    /* renamed from: app.zenly.locator.chat.l5.b$a */
    public static final class C2088a<T1, T2, R> implements BiFunction<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            C2458b bVar = (C2458b) t2;
            boolean z = true;
            boolean z2 = ((C2214e) t1) == C2214e.CHAT;
            if (bVar != C2458b.NORMAL) {
                z = false;
            }
            return new C2086a(z2, z);
        }
    }

    /* renamed from: app.zenly.locator.chat.l5.b$b */
    static final class C2089b<T> implements Consumer<C2086a> {

        /* renamed from: e */
        final /* synthetic */ C2087b f6573e;

        C2089b(C2087b bVar) {
            this.f6573e = bVar;
        }

        /* renamed from: a */
        public final void accept(C2086a aVar) {
            C2085a a = this.f6573e.f6572e;
            C12932j.m33815a((Object) aVar, "it");
            a.mo7888a(aVar);
        }
    }

    /* renamed from: app.zenly.locator.chat.l5.b$c */
    static final class C2090c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C2090c f6574e = new C2090c();

        C2090c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32034c(th, "Unable to get chat header info", new Object[0]);
        }
    }

    public C2087b(C12279e<C2458b> eVar, C12279e<C2214e> eVar2, C2085a aVar) {
        C12932j.m33818b(eVar, "focusModeObservable");
        C12932j.m33818b(eVar2, "stateObservable");
        C12932j.m33818b(aVar, "viewController");
        this.f6570c = eVar;
        this.f6571d = eVar2;
        this.f6572e = aVar;
    }

    /* renamed from: b */
    public final void mo7894b() {
        this.f6568a.mo36401a();
    }

    /* renamed from: a */
    public final void mo7893a() {
        C12774b bVar = C12774b.f33320a;
        Disposable a = C12279e.m32610a((ObservableSource<? extends T1>) this.f6571d, (ObservableSource<? extends T2>) this.f6570c, (BiFunction<? super T1, ? super T2, ? extends R>) new C2088a<Object,Object,Object>()).mo36477d().mo36428a((C12286f) this.f6569b.getMainThread()).mo36412a((Consumer<? super T>) new C2089b<Object>(this), (Consumer<? super Throwable>) C2090c.f6574e);
        C12932j.m33815a((Object) a, "Observables.combineLates…er info\") }\n            )");
        C12773a.m33432a(a, this.f6568a);
    }
}
