package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12461e;

/* renamed from: io.reactivex.internal.operators.observable.f1 */
public final class C12575f1<T> extends C12538a<T, T> {

    /* renamed from: f */
    final ObservableSource<? extends T> f32668f;

    /* renamed from: io.reactivex.internal.operators.observable.f1$a */
    static final class C12576a<T> implements Observer<T> {

        /* renamed from: e */
        final Observer<? super T> f32669e;

        /* renamed from: f */
        final ObservableSource<? extends T> f32670f;

        /* renamed from: g */
        final C12461e f32671g = new C12461e();

        /* renamed from: h */
        boolean f32672h = true;

        C12576a(Observer<? super T> observer, ObservableSource<? extends T> observableSource) {
            this.f32669e = observer;
            this.f32670f = observableSource;
        }

        public void onComplete() {
            if (this.f32672h) {
                this.f32672h = false;
                this.f32670f.subscribe(this);
                return;
            }
            this.f32669e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32669e.onError(th);
        }

        public void onNext(T t) {
            if (this.f32672h) {
                this.f32672h = false;
            }
            this.f32669e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f32671g.mo36654b(disposable);
        }
    }

    public C12575f1(ObservableSource<T> observableSource, ObservableSource<? extends T> observableSource2) {
        super(observableSource);
        this.f32668f = observableSource2;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12576a aVar = new C12576a(observer, this.f32668f);
        observer.onSubscribe(aVar.f32671g);
        this.f32549e.subscribe(aVar);
    }
}
