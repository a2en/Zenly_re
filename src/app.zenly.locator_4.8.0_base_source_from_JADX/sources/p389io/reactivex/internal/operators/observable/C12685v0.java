package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12461e;

/* renamed from: io.reactivex.internal.operators.observable.v0 */
public final class C12685v0<T> extends C12538a<T, T> {

    /* renamed from: f */
    final long f33050f;

    /* renamed from: io.reactivex.internal.operators.observable.v0$a */
    static final class C12686a<T> extends AtomicInteger implements Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: e */
        final Observer<? super T> f33051e;

        /* renamed from: f */
        final C12461e f33052f;

        /* renamed from: g */
        final ObservableSource<? extends T> f33053g;

        /* renamed from: h */
        long f33054h;

        C12686a(Observer<? super T> observer, long j, C12461e eVar, ObservableSource<? extends T> observableSource) {
            this.f33051e = observer;
            this.f33052f = eVar;
            this.f33053g = observableSource;
            this.f33054h = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36813a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f33052f.isDisposed()) {
                    this.f33053g.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }

        public void onComplete() {
            long j = this.f33054h;
            if (j != Long.MAX_VALUE) {
                this.f33054h = j - 1;
            }
            if (j != 0) {
                mo36813a();
            } else {
                this.f33051e.onComplete();
            }
        }

        public void onError(Throwable th) {
            this.f33051e.onError(th);
        }

        public void onNext(T t) {
            this.f33051e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f33052f.mo36653a(disposable);
        }
    }

    public C12685v0(C12279e<T> eVar, long j) {
        super(eVar);
        this.f33050f = j;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12461e eVar = new C12461e();
        observer.onSubscribe(eVar);
        long j = this.f33050f;
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j - 1;
        }
        C12686a aVar = new C12686a(observer, j2, eVar, this.f32549e);
        aVar.mo36813a();
    }
}
