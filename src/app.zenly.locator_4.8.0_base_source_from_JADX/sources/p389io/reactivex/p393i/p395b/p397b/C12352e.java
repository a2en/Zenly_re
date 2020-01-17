package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.b.e */
public final class C12352e<T> extends C12346a<T, T> {

    /* renamed from: f */
    final long f32065f;

    /* renamed from: g */
    final TimeUnit f32066g;

    /* renamed from: h */
    final C12286f f32067h;

    /* renamed from: io.reactivex.i.b.b.e$a */
    static final class C12353a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {
        private static final long serialVersionUID = 5566860102500855068L;

        /* renamed from: e */
        final MaybeObserver<? super T> f32068e;

        /* renamed from: f */
        final long f32069f;

        /* renamed from: g */
        final TimeUnit f32070g;

        /* renamed from: h */
        final C12286f f32071h;

        /* renamed from: i */
        T f32072i;

        /* renamed from: j */
        Throwable f32073j;

        C12353a(MaybeObserver<? super T> maybeObserver, long j, TimeUnit timeUnit, C12286f fVar) {
            this.f32068e = maybeObserver;
            this.f32069f = j;
            this.f32070g = timeUnit;
            this.f32071h = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36591a() {
            C12458b.m32976a((AtomicReference<Disposable>) this, this.f32071h.mo6572a(this, this.f32069f, this.f32070g));
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            mo36591a();
        }

        public void onError(Throwable th) {
            this.f32073j = th;
            mo36591a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                this.f32068e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f32072i = t;
            mo36591a();
        }

        public void run() {
            Throwable th = this.f32073j;
            if (th != null) {
                this.f32068e.onError(th);
                return;
            }
            T t = this.f32072i;
            if (t != null) {
                this.f32068e.onSuccess(t);
            } else {
                this.f32068e.onComplete();
            }
        }
    }

    public C12352e(MaybeSource<T> maybeSource, long j, TimeUnit timeUnit, C12286f fVar) {
        super(maybeSource);
        this.f32065f = j;
        this.f32066g = timeUnit;
        this.f32067h = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        MaybeSource<T> maybeSource = this.f32051e;
        C12353a aVar = new C12353a(maybeObserver, this.f32065f, this.f32066g, this.f32067h);
        maybeSource.subscribe(aVar);
    }
}
