package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.operators.observable.d1 */
public final class C12557d1<T> extends C12538a<T, T> {

    /* renamed from: f */
    final long f32597f;

    /* renamed from: io.reactivex.internal.operators.observable.d1$a */
    static final class C12558a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32598e;

        /* renamed from: f */
        long f32599f;

        /* renamed from: g */
        Disposable f32600g;

        C12558a(Observer<? super T> observer, long j) {
            this.f32598e = observer;
            this.f32599f = j;
        }

        public void dispose() {
            this.f32600g.dispose();
        }

        public boolean isDisposed() {
            return this.f32600g.isDisposed();
        }

        public void onComplete() {
            this.f32598e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32598e.onError(th);
        }

        public void onNext(T t) {
            long j = this.f32599f;
            if (j != 0) {
                this.f32599f = j - 1;
            } else {
                this.f32598e.onNext(t);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32600g, disposable)) {
                this.f32600g = disposable;
                this.f32598e.onSubscribe(this);
            }
        }
    }

    public C12557d1(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.f32597f = j;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12558a(observer, this.f32597f));
    }
}
