package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.b1 */
public final class C12548b1<T, R> extends C12538a<T, R> {

    /* renamed from: f */
    final BiFunction<R, ? super T, R> f32569f;

    /* renamed from: g */
    final Callable<R> f32570g;

    /* renamed from: io.reactivex.internal.operators.observable.b1$a */
    static final class C12549a<T, R> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super R> f32571e;

        /* renamed from: f */
        final BiFunction<R, ? super T, R> f32572f;

        /* renamed from: g */
        R f32573g;

        /* renamed from: h */
        Disposable f32574h;

        /* renamed from: i */
        boolean f32575i;

        C12549a(Observer<? super R> observer, BiFunction<R, ? super T, R> biFunction, R r) {
            this.f32571e = observer;
            this.f32572f = biFunction;
            this.f32573g = r;
        }

        public void dispose() {
            this.f32574h.dispose();
        }

        public boolean isDisposed() {
            return this.f32574h.isDisposed();
        }

        public void onComplete() {
            if (!this.f32575i) {
                this.f32575i = true;
                this.f32571e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f32575i) {
                C12768a.m33415b(th);
                return;
            }
            this.f32575i = true;
            this.f32571e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f32575i) {
                try {
                    R apply = this.f32572f.apply(this.f32573g, t);
                    C12324b.m32836a(apply, "The accumulator returned a null value");
                    this.f32573g = apply;
                    this.f32571e.onNext(apply);
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f32574h.dispose();
                    onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32574h, disposable)) {
                this.f32574h = disposable;
                this.f32571e.onSubscribe(this);
                this.f32571e.onNext(this.f32573g);
            }
        }
    }

    public C12548b1(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.f32569f = biFunction;
        this.f32570g = callable;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        try {
            Object call = this.f32570g.call();
            C12324b.m32836a(call, "The seed supplied is null");
            this.f32549e.subscribe(new C12549a(observer, this.f32569f, call));
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12459c.m32985a(th, observer);
        }
    }
}
