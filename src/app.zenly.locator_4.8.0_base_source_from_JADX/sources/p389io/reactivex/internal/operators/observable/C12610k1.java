package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.internal.util.C12759h;

/* renamed from: io.reactivex.internal.operators.observable.k1 */
public final class C12610k1<T, U> extends C12538a<T, T> {

    /* renamed from: f */
    final ObservableSource<? extends U> f32792f;

    /* renamed from: io.reactivex.internal.operators.observable.k1$a */
    static final class C12611a<T, U> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 1418547743690811973L;

        /* renamed from: e */
        final Observer<? super T> f32793e;

        /* renamed from: f */
        final AtomicReference<Disposable> f32794f = new AtomicReference<>();

        /* renamed from: g */
        final C12612a f32795g = new C12612a<>();

        /* renamed from: h */
        final C12752b f32796h = new C12752b();

        /* renamed from: io.reactivex.internal.operators.observable.k1$a$a */
        final class C12612a extends AtomicReference<Disposable> implements Observer<U> {
            private static final long serialVersionUID = -8693423678067375039L;

            C12612a() {
            }

            public void onComplete() {
                C12611a.this.mo36766a();
            }

            public void onError(Throwable th) {
                C12611a.this.mo36767a(th);
            }

            public void onNext(U u) {
                C12458b.m32975a((AtomicReference<Disposable>) this);
                C12611a.this.mo36766a();
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32978c(this, disposable);
            }
        }

        C12611a(Observer<? super T> observer) {
            this.f32793e = observer;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36767a(Throwable th) {
            C12458b.m32975a(this.f32794f);
            C12759h.m33356a(this.f32793e, th, (AtomicInteger) this, this.f32796h);
        }

        public void dispose() {
            C12458b.m32975a(this.f32794f);
            C12458b.m32975a((AtomicReference<Disposable>) this.f32795g);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) this.f32794f.get());
        }

        public void onComplete() {
            C12458b.m32975a((AtomicReference<Disposable>) this.f32795g);
            C12759h.m33357a(this.f32793e, (AtomicInteger) this, this.f32796h);
        }

        public void onError(Throwable th) {
            C12458b.m32975a((AtomicReference<Disposable>) this.f32795g);
            C12759h.m33356a(this.f32793e, th, (AtomicInteger) this, this.f32796h);
        }

        public void onNext(T t) {
            C12759h.m33355a(this.f32793e, t, (AtomicInteger) this, this.f32796h);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this.f32794f, disposable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36766a() {
            C12458b.m32975a(this.f32794f);
            C12759h.m33357a(this.f32793e, (AtomicInteger) this, this.f32796h);
        }
    }

    public C12610k1(ObservableSource<T> observableSource, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f32792f = observableSource2;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12611a aVar = new C12611a(observer);
        observer.onSubscribe(aVar);
        this.f32792f.subscribe(aVar.f32795g);
        this.f32549e.subscribe(aVar);
    }
}
