package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.operators.observable.h0 */
public final class C12587h0<T> extends C12538a<T, T> {

    /* renamed from: io.reactivex.internal.operators.observable.h0$a */
    static final class C12588a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32730e;

        /* renamed from: f */
        Disposable f32731f;

        C12588a(Observer<? super T> observer) {
            this.f32730e = observer;
        }

        public void dispose() {
            this.f32731f.dispose();
        }

        public boolean isDisposed() {
            return this.f32731f.isDisposed();
        }

        public void onComplete() {
            this.f32730e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32730e.onError(th);
        }

        public void onNext(T t) {
            this.f32730e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32731f, disposable)) {
                this.f32731f = disposable;
                this.f32730e.onSubscribe(this);
            }
        }
    }

    public C12587h0(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12588a(observer));
    }
}
