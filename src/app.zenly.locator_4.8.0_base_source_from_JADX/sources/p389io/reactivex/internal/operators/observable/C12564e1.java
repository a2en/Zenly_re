package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.operators.observable.e1 */
public final class C12564e1<T> extends C12538a<T, T> {

    /* renamed from: f */
    final C12286f f32624f;

    /* renamed from: io.reactivex.internal.operators.observable.e1$a */
    static final class C12565a<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {
        private static final long serialVersionUID = 8094547886072529208L;

        /* renamed from: e */
        final Observer<? super T> f32625e;

        /* renamed from: f */
        final AtomicReference<Disposable> f32626f = new AtomicReference<>();

        C12565a(Observer<? super T> observer) {
            this.f32625e = observer;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36732a(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }

        public void dispose() {
            C12458b.m32975a(this.f32626f);
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            this.f32625e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32625e.onError(th);
        }

        public void onNext(T t) {
            this.f32625e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this.f32626f, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.e1$b */
    final class C12566b implements Runnable {

        /* renamed from: e */
        private final C12565a<T> f32627e;

        C12566b(C12565a<T> aVar) {
            this.f32627e = aVar;
        }

        public void run() {
            C12564e1.this.f32549e.subscribe(this.f32627e);
        }
    }

    public C12564e1(ObservableSource<T> observableSource, C12286f fVar) {
        super(observableSource);
        this.f32624f = fVar;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12565a aVar = new C12565a(observer);
        observer.onSubscribe(aVar);
        aVar.mo36732a(this.f32624f.mo6570a(new C12566b(aVar)));
    }
}
