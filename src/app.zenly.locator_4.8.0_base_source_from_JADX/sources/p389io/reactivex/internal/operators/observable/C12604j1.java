package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.operators.observable.j1 */
public final class C12604j1<T> extends C12538a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.j1$a */
    static final class C12605a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32779e;

        /* renamed from: f */
        Disposable f32780f;

        /* renamed from: g */
        T f32781g;

        C12605a(Observer<? super T> observer) {
            this.f32779e = observer;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36763a() {
            T t = this.f32781g;
            if (t != null) {
                this.f32781g = null;
                this.f32779e.onNext(t);
            }
            this.f32779e.onComplete();
        }

        public void dispose() {
            this.f32781g = null;
            this.f32780f.dispose();
        }

        public boolean isDisposed() {
            return this.f32780f.isDisposed();
        }

        public void onComplete() {
            mo36763a();
        }

        public void onError(Throwable th) {
            this.f32781g = null;
            this.f32779e.onError(th);
        }

        public void onNext(T t) {
            this.f32781g = t;
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32780f, disposable)) {
                this.f32780f = disposable;
                this.f32779e.onSubscribe(this);
            }
        }
    }

    public C12604j1(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12605a(observer));
    }
}
