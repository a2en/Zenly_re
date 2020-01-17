package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;

/* renamed from: io.reactivex.internal.operators.observable.i0 */
public final class C12596i0<T> extends C12538a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.i0$a */
    static final class C12597a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32766e;

        /* renamed from: f */
        Disposable f32767f;

        C12597a(Observer<? super T> observer) {
            this.f32766e = observer;
        }

        public void dispose() {
            this.f32767f.dispose();
        }

        public boolean isDisposed() {
            return this.f32767f.isDisposed();
        }

        public void onComplete() {
            this.f32766e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32766e.onError(th);
        }

        public void onNext(T t) {
        }

        public void onSubscribe(Disposable disposable) {
            this.f32767f = disposable;
            this.f32766e.onSubscribe(this);
        }
    }

    public C12596i0(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12597a(observer));
    }
}
