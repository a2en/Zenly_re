package p389io.reactivex.p393i.p395b.p396a;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12286f;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12461e;

/* renamed from: io.reactivex.i.b.a.j */
public final class C12342j extends C12271b {

    /* renamed from: e */
    final CompletableSource f32041e;

    /* renamed from: f */
    final C12286f f32042f;

    /* renamed from: io.reactivex.i.b.a.j$a */
    static final class C12343a extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* renamed from: e */
        final CompletableObserver f32043e;

        /* renamed from: f */
        final C12461e f32044f = new C12461e();

        /* renamed from: g */
        final CompletableSource f32045g;

        C12343a(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f32043e = completableObserver;
            this.f32045g = completableSource;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
            this.f32044f.dispose();
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            this.f32043e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32043e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void run() {
            this.f32045g.subscribe(this);
        }
    }

    public C12342j(CompletableSource completableSource, C12286f fVar) {
        this.f32041e = completableSource;
        this.f32042f = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        C12343a aVar = new C12343a(completableObserver, this.f32041e);
        completableObserver.onSubscribe(aVar);
        aVar.f32044f.mo36653a(this.f32042f.mo6570a(aVar));
    }
}
