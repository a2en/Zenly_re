package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.observers.C12462a;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.operators.observable.n0 */
public final class C12629n0<T, U> extends C12538a<T, U> {

    /* renamed from: f */
    final Function<? super T, ? extends U> f32846f;

    /* renamed from: io.reactivex.internal.operators.observable.n0$a */
    static final class C12630a<T, U> extends C12462a<T, U> {

        /* renamed from: j */
        final Function<? super T, ? extends U> f32847j;

        C12630a(Observer<? super U> observer, Function<? super T, ? extends U> function) {
            super(observer);
            this.f32847j = function;
        }

        public void onNext(T t) {
            if (!this.f32323h) {
                if (this.f32324i != 0) {
                    this.f32320e.onNext(null);
                    return;
                }
                try {
                    Object apply = this.f32847j.apply(t);
                    C12324b.m32836a(apply, "The mapper function returned a null value.");
                    this.f32320e.onNext(apply);
                } catch (Throwable th) {
                    mo36669a(th);
                }
            }
        }

        public U poll() throws Exception {
            Object poll = this.f32322g.poll();
            if (poll != null) {
                return C12324b.m32836a(this.f32847j.apply(poll), "The mapper function returned a null value.");
            }
            return null;
        }

        public int requestFusion(int i) {
            return mo36667a(i);
        }
    }

    public C12629n0(ObservableSource<T> observableSource, Function<? super T, ? extends U> function) {
        super(observableSource);
        this.f32846f = function;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super U> observer) {
        this.f32549e.subscribe(new C12630a(observer, this.f32846f));
    }
}
