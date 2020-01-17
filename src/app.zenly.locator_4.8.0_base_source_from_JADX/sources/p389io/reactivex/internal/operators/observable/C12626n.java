package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12461e;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.n */
public final class C12626n<T, U> extends C12279e<T> {

    /* renamed from: e */
    final ObservableSource<? extends T> f32839e;

    /* renamed from: f */
    final ObservableSource<U> f32840f;

    /* renamed from: io.reactivex.internal.operators.observable.n$a */
    final class C12627a implements Observer<U> {

        /* renamed from: e */
        final C12461e f32841e;

        /* renamed from: f */
        final Observer<? super T> f32842f;

        /* renamed from: g */
        boolean f32843g;

        /* renamed from: io.reactivex.internal.operators.observable.n$a$a */
        final class C12628a implements Observer<T> {
            C12628a() {
            }

            public void onComplete() {
                C12627a.this.f32842f.onComplete();
            }

            public void onError(Throwable th) {
                C12627a.this.f32842f.onError(th);
            }

            public void onNext(T t) {
                C12627a.this.f32842f.onNext(t);
            }

            public void onSubscribe(Disposable disposable) {
                C12627a.this.f32841e.mo36654b(disposable);
            }
        }

        C12627a(C12461e eVar, Observer<? super T> observer) {
            this.f32841e = eVar;
            this.f32842f = observer;
        }

        public void onComplete() {
            if (!this.f32843g) {
                this.f32843g = true;
                C12626n.this.f32839e.subscribe(new C12628a());
            }
        }

        public void onError(Throwable th) {
            if (this.f32843g) {
                C12768a.m33415b(th);
                return;
            }
            this.f32843g = true;
            this.f32842f.onError(th);
        }

        public void onNext(U u) {
            onComplete();
        }

        public void onSubscribe(Disposable disposable) {
            this.f32841e.mo36654b(disposable);
        }
    }

    public C12626n(ObservableSource<? extends T> observableSource, ObservableSource<U> observableSource2) {
        this.f32839e = observableSource;
        this.f32840f = observableSource2;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12461e eVar = new C12461e();
        observer.onSubscribe(eVar);
        this.f32840f.subscribe(new C12627a(eVar, observer));
    }
}
