package p389io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.c1 */
public final class C12553c1<T> extends C12291g<T> {

    /* renamed from: e */
    final ObservableSource<? extends T> f32583e;

    /* renamed from: f */
    final T f32584f;

    /* renamed from: io.reactivex.internal.operators.observable.c1$a */
    static final class C12554a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final SingleObserver<? super T> f32585e;

        /* renamed from: f */
        final T f32586f;

        /* renamed from: g */
        Disposable f32587g;

        /* renamed from: h */
        T f32588h;

        /* renamed from: i */
        boolean f32589i;

        C12554a(SingleObserver<? super T> singleObserver, T t) {
            this.f32585e = singleObserver;
            this.f32586f = t;
        }

        public void dispose() {
            this.f32587g.dispose();
        }

        public boolean isDisposed() {
            return this.f32587g.isDisposed();
        }

        public void onComplete() {
            if (!this.f32589i) {
                this.f32589i = true;
                T t = this.f32588h;
                this.f32588h = null;
                if (t == null) {
                    t = this.f32586f;
                }
                if (t != null) {
                    this.f32585e.onSuccess(t);
                } else {
                    this.f32585e.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f32589i) {
                C12768a.m33415b(th);
                return;
            }
            this.f32589i = true;
            this.f32585e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32589i) {
                if (this.f32588h != null) {
                    this.f32589i = true;
                    this.f32587g.dispose();
                    this.f32585e.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.f32588h = t;
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32587g, disposable)) {
                this.f32587g = disposable;
                this.f32585e.onSubscribe(this);
            }
        }
    }

    public C12553c1(ObservableSource<? extends T> observableSource, T t) {
        this.f32583e = observableSource;
        this.f32584f = t;
    }

    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f32583e.subscribe(new C12554a(singleObserver, this.f32584f));
    }
}
