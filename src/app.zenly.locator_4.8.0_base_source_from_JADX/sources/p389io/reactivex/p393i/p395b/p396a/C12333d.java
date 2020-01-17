package p389io.reactivex.p393i.p395b.p396a;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12271b;
import p389io.reactivex.C12286f;
import p389io.reactivex.CompletableObserver;
import p389io.reactivex.CompletableSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.a.d */
public final class C12333d extends C12271b {

    /* renamed from: e */
    final CompletableSource f32012e;

    /* renamed from: f */
    final long f32013f;

    /* renamed from: g */
    final TimeUnit f32014g;

    /* renamed from: h */
    final C12286f f32015h;

    /* renamed from: i */
    final boolean f32016i;

    /* renamed from: io.reactivex.i.b.a.d$a */
    static final class C12334a extends AtomicReference<Disposable> implements CompletableObserver, Runnable, Disposable {
        private static final long serialVersionUID = 465972761105851022L;

        /* renamed from: e */
        final CompletableObserver f32017e;

        /* renamed from: f */
        final long f32018f;

        /* renamed from: g */
        final TimeUnit f32019g;

        /* renamed from: h */
        final C12286f f32020h;

        /* renamed from: i */
        final boolean f32021i;

        /* renamed from: j */
        Throwable f32022j;

        C12334a(CompletableObserver completableObserver, long j, TimeUnit timeUnit, C12286f fVar, boolean z) {
            this.f32017e = completableObserver;
            this.f32018f = j;
            this.f32019g = timeUnit;
            this.f32020h = fVar;
            this.f32021i = z;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32020h.mo6572a(this, this.f32018f, this.f32019g));
        }

        public void onError(Throwable th) {
            this.f32022j = th;
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32020h.mo6572a(this, this.f32021i ? this.f32018f : 0, this.f32019g));
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                this.f32017e.onSubscribe(this);
            }
        }

        public void run() {
            Throwable th = this.f32022j;
            this.f32022j = null;
            if (th != null) {
                this.f32017e.onError(th);
            } else {
                this.f32017e.onComplete();
            }
        }
    }

    public C12333d(CompletableSource completableSource, long j, TimeUnit timeUnit, C12286f fVar, boolean z) {
        this.f32012e = completableSource;
        this.f32013f = j;
        this.f32014g = timeUnit;
        this.f32015h = fVar;
        this.f32016i = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36349a(CompletableObserver completableObserver) {
        CompletableSource completableSource = this.f32012e;
        C12334a aVar = new C12334a(completableObserver, this.f32013f, this.f32014g, this.f32015h, this.f32016i);
        completableSource.subscribe(aVar);
    }
}
