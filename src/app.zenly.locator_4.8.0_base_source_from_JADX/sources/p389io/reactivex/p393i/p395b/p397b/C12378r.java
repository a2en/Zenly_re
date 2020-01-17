package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.i.b.b.r */
public final class C12378r<T, U> extends C12346a<T, T> {

    /* renamed from: f */
    final MaybeSource<U> f32123f;

    /* renamed from: g */
    final MaybeSource<? extends T> f32124g;

    /* renamed from: io.reactivex.i.b.b.r$a */
    static final class C12379a<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: e */
        final MaybeObserver<? super T> f32125e;

        C12379a(MaybeObserver<? super T> maybeObserver) {
            this.f32125e = maybeObserver;
        }

        public void onComplete() {
            this.f32125e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32125e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void onSuccess(T t) {
            this.f32125e.onSuccess(t);
        }
    }

    /* renamed from: io.reactivex.i.b.b.r$b */
    static final class C12380b<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = -5955289211445418871L;

        /* renamed from: e */
        final MaybeObserver<? super T> f32126e;

        /* renamed from: f */
        final C12381c<T, U> f32127f = new C12381c<>(this);

        /* renamed from: g */
        final MaybeSource<? extends T> f32128g;

        /* renamed from: h */
        final C12379a<T> f32129h;

        C12380b(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f32126e = maybeObserver;
            this.f32128g = maybeSource;
            this.f32129h = maybeSource != null ? new C12379a<>(maybeObserver) : null;
        }

        /* renamed from: a */
        public void mo36600a(Throwable th) {
            if (C12458b.m32975a((AtomicReference<Disposable>) this)) {
                this.f32126e.onError(th);
            } else {
                C12768a.m33415b(th);
            }
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
            C12458b.m32975a((AtomicReference<Disposable>) this.f32127f);
            C12379a<T> aVar = this.f32129h;
            if (aVar != null) {
                C12458b.m32975a((AtomicReference<Disposable>) aVar);
            }
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            C12458b.m32975a((AtomicReference<Disposable>) this.f32127f);
            if (getAndSet(C12458b.DISPOSED) != C12458b.DISPOSED) {
                this.f32126e.onComplete();
            }
        }

        public void onError(Throwable th) {
            C12458b.m32975a((AtomicReference<Disposable>) this.f32127f);
            if (getAndSet(C12458b.DISPOSED) != C12458b.DISPOSED) {
                this.f32126e.onError(th);
            } else {
                C12768a.m33415b(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void onSuccess(T t) {
            C12458b.m32975a((AtomicReference<Disposable>) this.f32127f);
            if (getAndSet(C12458b.DISPOSED) != C12458b.DISPOSED) {
                this.f32126e.onSuccess(t);
            }
        }

        /* renamed from: a */
        public void mo36599a() {
            if (C12458b.m32975a((AtomicReference<Disposable>) this)) {
                MaybeSource<? extends T> maybeSource = this.f32128g;
                if (maybeSource == null) {
                    this.f32126e.onError(new TimeoutException());
                } else {
                    maybeSource.subscribe(this.f32129h);
                }
            }
        }
    }

    /* renamed from: io.reactivex.i.b.b.r$c */
    static final class C12381c<T, U> extends AtomicReference<Disposable> implements MaybeObserver<Object> {
        private static final long serialVersionUID = 8663801314800248617L;

        /* renamed from: e */
        final C12380b<T, U> f32130e;

        C12381c(C12380b<T, U> bVar) {
            this.f32130e = bVar;
        }

        public void onComplete() {
            this.f32130e.mo36599a();
        }

        public void onError(Throwable th) {
            this.f32130e.mo36600a(th);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void onSuccess(Object obj) {
            this.f32130e.mo36599a();
        }
    }

    public C12378r(MaybeSource<T> maybeSource, MaybeSource<U> maybeSource2, MaybeSource<? extends T> maybeSource3) {
        super(maybeSource);
        this.f32123f = maybeSource2;
        this.f32124g = maybeSource3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        C12380b bVar = new C12380b(maybeObserver, this.f32124g);
        maybeObserver.onSubscribe(bVar);
        this.f32123f.subscribe(bVar.f32127f);
        this.f32051e.subscribe(bVar);
    }
}
