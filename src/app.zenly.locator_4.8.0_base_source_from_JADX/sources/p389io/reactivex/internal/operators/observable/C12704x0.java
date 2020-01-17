package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.BiPredicate;
import p389io.reactivex.internal.disposables.C12461e;

/* renamed from: io.reactivex.internal.operators.observable.x0 */
public final class C12704x0<T> extends C12538a<T, T> {

    /* renamed from: f */
    final BiPredicate<? super Integer, ? super Throwable> f33107f;

    /* renamed from: io.reactivex.internal.operators.observable.x0$a */
    static final class C12705a<T> extends AtomicInteger implements Observer<T> {
        private static final long serialVersionUID = -7098360935104053232L;

        /* renamed from: e */
        final Observer<? super T> f33108e;

        /* renamed from: f */
        final C12461e f33109f;

        /* renamed from: g */
        final ObservableSource<? extends T> f33110g;

        /* renamed from: h */
        final BiPredicate<? super Integer, ? super Throwable> f33111h;

        /* renamed from: i */
        int f33112i;

        C12705a(Observer<? super T> observer, BiPredicate<? super Integer, ? super Throwable> biPredicate, C12461e eVar, ObservableSource<? extends T> observableSource) {
            this.f33108e = observer;
            this.f33109f = eVar;
            this.f33110g = observableSource;
            this.f33111h = biPredicate;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36843a() {
            if (getAndIncrement() == 0) {
                int i = 1;
                while (!this.f33109f.isDisposed()) {
                    this.f33110g.subscribe(this);
                    i = addAndGet(-i);
                    if (i == 0) {
                    }
                }
            }
        }

        public void onComplete() {
            this.f33108e.onComplete();
        }

        public void onError(Throwable th) {
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.f33111h;
                int i = this.f33112i + 1;
                this.f33112i = i;
                if (!biPredicate.test(Integer.valueOf(i), th)) {
                    this.f33108e.onError(th);
                } else {
                    mo36843a();
                }
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                this.f33108e.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f33108e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            this.f33109f.mo36653a(disposable);
        }
    }

    public C12704x0(C12279e<T> eVar, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(eVar);
        this.f33107f = biPredicate;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12461e eVar = new C12461e();
        observer.onSubscribe(eVar);
        new C12705a(observer, this.f33107f, eVar, this.f32549e).mo36843a();
    }
}
