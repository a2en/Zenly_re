package p389io.reactivex.p393i.p395b.p396a;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12271b;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.a.a */
public final class C12326a extends C12271b {

    /* renamed from: e */
    final CompletableSource f31996e;

    /* renamed from: f */
    final CompletableSource f31997f;

    /* renamed from: io.reactivex.i.b.a.a$a */
    static final class C12327a implements CompletableObserver {

        /* renamed from: e */
        final AtomicReference<Disposable> f31998e;

        /* renamed from: f */
        final CompletableObserver f31999f;

        public C12327a(AtomicReference<Disposable> atomicReference, CompletableObserver completableObserver) {
            this.f31998e = atomicReference;
            this.f31999f = completableObserver;
        }

        public void onComplete() {
            this.f31999f.onComplete();
        }

        public void onError(Throwable th) {
            this.f31999f.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32976a(this.f31998e, disposable);
        }
    }

    /* renamed from: io.reactivex.i.b.a.a$b */
    static final class C12328b extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
        private static final long serialVersionUID = -4101678820158072998L;

        /* renamed from: e */
        final CompletableObserver f32000e;

        /* renamed from: f */
        final CompletableSource f32001f;

        C12328b(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f32000e = completableObserver;
            this.f32001f = completableSource;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            this.f32001f.subscribe(new C12327a(this, this.f32000e));
        }

        public void onError(Throwable th) {
            this.f32000e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                this.f32000e.onSubscribe(this);
            }
        }
    }

    public C12326a(CompletableSource completableSource, CompletableSource completableSource2) {
        this.f31996e = completableSource;
        this.f31997f = completableSource2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        this.f31996e.subscribe(new C12328b(completableObserver, this.f31997f));
    }
}
