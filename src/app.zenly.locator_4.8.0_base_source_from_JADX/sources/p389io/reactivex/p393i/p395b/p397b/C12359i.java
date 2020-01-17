package p389io.reactivex.p393i.p395b.p397b;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.MaybeSource;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.i.b.b.i */
public final class C12359i<T, R> extends C12346a<T, R> {

    /* renamed from: f */
    final Function<? super T, ? extends MaybeSource<? extends R>> f32084f;

    /* renamed from: io.reactivex.i.b.b.i$a */
    static final class C12360a<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {
        private static final long serialVersionUID = 4375739915521278546L;

        /* renamed from: e */
        final MaybeObserver<? super R> f32085e;

        /* renamed from: f */
        final Function<? super T, ? extends MaybeSource<? extends R>> f32086f;

        /* renamed from: g */
        Disposable f32087g;

        /* renamed from: io.reactivex.i.b.b.i$a$a */
        final class C12361a implements MaybeObserver<R> {
            C12361a() {
            }

            public void onComplete() {
                C12360a.this.f32085e.onComplete();
            }

            public void onError(Throwable th) {
                C12360a.this.f32085e.onError(th);
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32978c(C12360a.this, disposable);
            }

            public void onSuccess(R r) {
                C12360a.this.f32085e.onSuccess(r);
            }
        }

        C12360a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends MaybeSource<? extends R>> function) {
            this.f32085e = maybeObserver;
            this.f32086f = function;
        }

        public void dispose() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
            this.f32087g.dispose();
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            this.f32085e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32085e.onError(th);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32087g, disposable)) {
                this.f32087g = disposable;
                this.f32085e.onSubscribe(this);
            }
        }

        public void onSuccess(T t) {
            try {
                Object apply = this.f32086f.apply(t);
                C12324b.m32836a(apply, "The mapper returned a null MaybeSource");
                MaybeSource maybeSource = (MaybeSource) apply;
                if (!isDisposed()) {
                    maybeSource.subscribe(new C12361a());
                }
            } catch (Exception e) {
                C12285a.m32748b(e);
                this.f32085e.onError(e);
            }
        }
    }

    public C12359i(MaybeSource<T> maybeSource, Function<? super T, ? extends MaybeSource<? extends R>> function) {
        super(maybeSource);
        this.f32084f = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super R> maybeObserver) {
        this.f32051e.subscribe(new C12360a(maybeObserver, this.f32084f));
    }
}
