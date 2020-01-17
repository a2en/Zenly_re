package app.zenly.locator.core.manager;

import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.core.manager.q5 */
public final class C2800q5 {

    /* renamed from: a */
    private final ZenlySchedulers f8031a = C1351e.m6372a(C2703i5.f7877b.mo19916a("userAvatar"));

    /* renamed from: b */
    private final ZenlyCore f8032b = C5448c.m15478a();

    /* renamed from: c */
    private Disposable f8033c;

    /* renamed from: d */
    private final C12785a<C2801a> f8034d;

    /* renamed from: app.zenly.locator.core.manager.q5$a */
    public enum C2801a {
        ERROR,
        IDLE,
        UPLOAD
    }

    /* renamed from: app.zenly.locator.core.manager.q5$b */
    static final class C2802b<T> implements Consumer<Double> {

        /* renamed from: e */
        public static final C2802b f8039e = new C2802b();

        C2802b() {
        }

        /* renamed from: a */
        public final void accept(Double d) {
        }
    }

    /* renamed from: app.zenly.locator.core.manager.q5$c */
    static final class C2803c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C2800q5 f8040e;

        C2803c(C2800q5 q5Var) {
            this.f8040e = q5Var;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f8040e.mo8845b().onNext(C2801a.ERROR);
        }
    }

    /* renamed from: app.zenly.locator.core.manager.q5$d */
    static final class C2804d implements Action {

        /* renamed from: a */
        final /* synthetic */ C2800q5 f8041a;

        C2804d(C2800q5 q5Var) {
            this.f8041a = q5Var;
        }

        public final void run() {
            this.f8041a.mo8845b().onNext(C2801a.IDLE);
        }
    }

    public C2800q5() {
        C12785a<C2801a> h = C12785a.m33446h(C2801a.IDLE);
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(State.IDLE)");
        this.f8034d = h;
    }

    /* renamed from: a */
    public final void mo8844a(byte[] bArr) {
        C12932j.m33818b(bArr, "data");
        Disposable disposable = this.f8033c;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f8034d.onNext(C2801a.UPLOAD);
        this.f8033c = this.f8032b.userUpdateAvatar(bArr).mo36428a((C12286f) this.f8031a.getDisk()).mo36413a((Consumer<? super T>) C2802b.f8039e, (Consumer<? super Throwable>) new C2803c<Object>(this), (Action) new C2804d(this));
    }

    /* renamed from: b */
    public final C12785a<C2801a> mo8845b() {
        return this.f8034d;
    }

    /* renamed from: a */
    public final void mo8843a() {
        if (((C2801a) this.f8034d.mo36963s()) == C2801a.ERROR) {
            this.f8034d.onNext(C2801a.IDLE);
        }
    }
}
