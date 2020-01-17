package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.i.b.b.q */
public final class C12375q<T> extends C12346a<T, T> {

    /* renamed from: f */
    final MaybeSource<? extends T> f32118f;

    /* renamed from: io.reactivex.i.b.b.q$a */
    static final class C12376a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = -2223459372976438024L;

        /* renamed from: e */
        final MaybeObserver<? super T> f32119e;

        /* renamed from: f */
        final MaybeSource<? extends T> f32120f;

        /* renamed from: io.reactivex.i.b.b.q$a$a */
        static final class C12377a<T> implements MaybeObserver<T> {

            /* renamed from: e */
            final MaybeObserver<? super T> f32121e;

            /* renamed from: f */
            final AtomicReference<Disposable> f32122f;

            C12377a(MaybeObserver<? super T> maybeObserver, AtomicReference<Disposable> atomicReference) {
                this.f32121e = maybeObserver;
                this.f32122f = atomicReference;
            }

            public void onComplete() {
                this.f32121e.onComplete();
            }

            public void onError(Throwable th) {
                this.f32121e.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32978c(this.f32122f, disposable);
            }

            public void onSuccess(T t) {
                this.f32121e.onSuccess(t);
            }
        }

        C12376a(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f32119e = maybeObserver;
            this.f32120f = maybeSource;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            Disposable disposable = (Disposable) get();
            if (disposable != C12458b.DISPOSED && compareAndSet(disposable, null)) {
                this.f32120f.subscribe(new C12377a(this.f32119e, this));
            }
        }

        public void onError(Throwable th) {
            this.f32119e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                this.f32119e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            this.f32119e.onSuccess(t);
        }
    }

    public C12375q(MaybeSource<T> maybeSource, MaybeSource<? extends T> maybeSource2) {
        super(maybeSource);
        this.f32118f = maybeSource2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32051e.subscribe(new C12376a(maybeObserver, this.f32118f));
    }
}
