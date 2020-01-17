package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.operators.observable.j */
public final class C12600j<T> extends C12538a<T, Long> {

    /* renamed from: io.reactivex.internal.operators.observable.j$a */
    static final class C12601a implements Observer<Object>, Disposable {

        /* renamed from: e */
        final Observer<? super Long> f32773e;

        /* renamed from: f */
        Disposable f32774f;

        /* renamed from: g */
        long f32775g;

        C12601a(Observer<? super Long> observer) {
            this.f32773e = observer;
        }

        public void dispose() {
            this.f32774f.dispose();
        }

        public boolean isDisposed() {
            return this.f32774f.isDisposed();
        }

        public void onComplete() {
            this.f32773e.onNext(Long.valueOf(this.f32775g));
            this.f32773e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32773e.onError(th);
        }

        public void onNext(Object obj) {
            this.f32775g++;
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32774f, disposable)) {
                this.f32774f = disposable;
                this.f32773e.onSubscribe(this);
            }
        }
    }

    public C12600j(ObservableSource<T> observableSource) {
        super(observableSource);
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super Long> observer) {
        this.f32549e.subscribe(new C12601a(observer));
    }
}
