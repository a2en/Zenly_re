package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12273d;
import p389io.reactivex.MaybeObserver;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.t0 */
public final class C12672t0<T> extends C12273d<T> {

    /* renamed from: e */
    final ObservableSource<T> f32994e;

    /* renamed from: f */
    final BiFunction<T, T, T> f32995f;

    /* renamed from: io.reactivex.internal.operators.observable.t0$a */
    static final class C12673a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final MaybeObserver<? super T> f32996e;

        /* renamed from: f */
        final BiFunction<T, T, T> f32997f;

        /* renamed from: g */
        boolean f32998g;

        /* renamed from: h */
        T f32999h;

        /* renamed from: i */
        Disposable f33000i;

        C12673a(MaybeObserver<? super T> maybeObserver, BiFunction<T, T, T> biFunction) {
            this.f32996e = maybeObserver;
            this.f32997f = biFunction;
        }

        public void dispose() {
            this.f33000i.dispose();
        }

        public boolean isDisposed() {
            return this.f33000i.isDisposed();
        }

        public void onComplete() {
            if (!this.f32998g) {
                this.f32998g = true;
                T t = this.f32999h;
                this.f32999h = null;
                if (t != null) {
                    this.f32996e.onSuccess(t);
                } else {
                    this.f32996e.onComplete();
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32998g) {
                C12768a.m33415b(th);
                return;
            }
            this.f32998g = true;
            this.f32999h = null;
            this.f32996e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32998g) {
                T t2 = this.f32999h;
                if (t2 == null) {
                    this.f32999h = t;
                    return;
                }
                try {
                    T apply = this.f32997f.apply(t2, t);
                    C12324b.m32836a(apply, "The reducer returned a null value");
                    this.f32999h = apply;
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f33000i.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f33000i, disposable)) {
                this.f33000i = disposable;
                this.f32996e.onSubscribe(this);
            }
        }
    }

    public C12672t0(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        this.f32994e = observableSource;
        this.f32995f = biFunction;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36387a(MaybeObserver<? super T> maybeObserver) {
        this.f32994e.subscribe(new C12673a(maybeObserver, this.f32995f));
    }
}
