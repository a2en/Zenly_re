package p389io.reactivex.internal.operators.observable;

import java.util.NoSuchElementException;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.SingleObserver;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.FuseToObservable;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.u */
public final class C12677u<T> extends C12291g<T> implements FuseToObservable<T> {

    /* renamed from: e */
    final ObservableSource<T> f33017e;

    /* renamed from: f */
    final long f33018f;

    /* renamed from: g */
    final T f33019g;

    /* renamed from: io.reactivex.internal.operators.observable.u$a */
    static final class C12678a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final SingleObserver<? super T> f33020e;

        /* renamed from: f */
        final long f33021f;

        /* renamed from: g */
        final T f33022g;

        /* renamed from: h */
        Disposable f33023h;

        /* renamed from: i */
        long f33024i;

        /* renamed from: j */
        boolean f33025j;

        C12678a(SingleObserver<? super T> singleObserver, long j, T t) {
            this.f33020e = singleObserver;
            this.f33021f = j;
            this.f33022g = t;
        }

        public void dispose() {
            this.f33023h.dispose();
        }

        public boolean isDisposed() {
            return this.f33023h.isDisposed();
        }

        public void onComplete() {
            if (!this.f33025j) {
                this.f33025j = true;
                T t = this.f33022g;
                if (t != null) {
                    this.f33020e.onSuccess(t);
                } else {
                    this.f33020e.onError(new NoSuchElementException());
                }
            }
        }

        public void onError(Throwable th) {
            if (this.f33025j) {
                C12768a.m33415b(th);
                return;
            }
            this.f33025j = true;
            this.f33020e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f33025j) {
                long j = this.f33024i;
                if (j == this.f33021f) {
                    this.f33025j = true;
                    this.f33023h.dispose();
                    this.f33020e.onSuccess(t);
                    return;
                }
                this.f33024i = j + 1;
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f33023h, disposable)) {
                this.f33023h = disposable;
                this.f33020e.onSubscribe(this);
            }
        }
    }

    public C12677u(ObservableSource<T> observableSource, long j, T t) {
        this.f33017e = observableSource;
        this.f33018f = j;
        this.f33019g = t;
    }

    /* renamed from: a */
    public void mo36541a(SingleObserver<? super T> singleObserver) {
        this.f33017e.subscribe(new C12678a(singleObserver, this.f33018f, this.f33019g));
    }

    public C12279e<T> fuseToObservable() {
        C12662s sVar = new C12662s(this.f33017e, this.f33018f, this.f33019g, true);
        return C12768a.m33396a((C12279e<T>) sVar);
    }
}
