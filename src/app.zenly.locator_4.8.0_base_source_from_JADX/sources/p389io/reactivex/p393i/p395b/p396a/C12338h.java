package p389io.reactivex.p393i.p395b.p396a;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12286f;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.a.h */
public final class C12338h extends C12271b {

    /* renamed from: e */
    final CompletableSource f32026e;

    /* renamed from: f */
    final C12286f f32027f;

    /* renamed from: io.reactivex.i.b.a.h$a */
    static final class C12339a extends AtomicReference<Disposable> implements CompletableObserver, Disposable, Runnable {
        private static final long serialVersionUID = 8571289934935992137L;

        /* renamed from: e */
        final CompletableObserver f32028e;

        /* renamed from: f */
        final C12286f f32029f;

        /* renamed from: g */
        Throwable f32030g;

        C12339a(CompletableObserver completableObserver, C12286f fVar) {
            this.f32028e = completableObserver;
            this.f32029f = fVar;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32029f.mo6570a(this));
        }

        public void onError(Throwable th) {
            this.f32030g = th;
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32029f.mo6570a(this));
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                this.f32028e.onSubscribe(this);
            }
        }

        public void run() {
            Throwable th = this.f32030g;
            if (th != null) {
                this.f32030g = null;
                this.f32028e.onError(th);
                return;
            }
            this.f32028e.onComplete();
        }
    }

    public C12338h(CompletableSource completableSource, C12286f fVar) {
        this.f32026e = completableSource;
        this.f32027f = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        this.f32026e.subscribe(new C12339a(completableObserver, this.f32027f));
    }
}
