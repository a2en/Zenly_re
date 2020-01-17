package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.functions.Predicate;
import p389io.reactivex.internal.observers.C12462a;

/* renamed from: io.reactivex.internal.operators.observable.w */
public final class C12687w<T> extends C12538a<T, T> {

    /* renamed from: f */
    final Predicate<? super T> f33055f;

    /* renamed from: io.reactivex.internal.operators.observable.w$a */
    static final class C12688a<T> extends C12462a<T, T> {

        /* renamed from: j */
        final Predicate<? super T> f33056j;

        C12688a(Observer<? super T> observer, Predicate<? super T> predicate) {
            super(observer);
            this.f33056j = predicate;
        }

        public void onNext(T t) {
            if (this.f32324i == 0) {
                try {
                    if (this.f33056j.test(t)) {
                        this.f32320e.onNext(t);
                    }
                } catch (Throwable th) {
                    mo36669a(th);
                }
            } else {
                this.f32320e.onNext(null);
            }
        }

        public T poll() throws Exception {
            T poll;
            do {
                poll = this.f32322g.poll();
                if (poll == null) {
                    break;
                }
            } while (!this.f33056j.test(poll));
            return poll;
        }

        public int requestFusion(int i) {
            return mo36667a(i);
        }
    }

    public C12687w(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f33055f = predicate;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12688a(observer, this.f33055f));
    }
}
