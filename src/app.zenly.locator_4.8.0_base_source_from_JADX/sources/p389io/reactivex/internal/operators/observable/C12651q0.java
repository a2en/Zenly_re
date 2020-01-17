package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.exceptions.CompositeException;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.operators.observable.q0 */
public final class C12651q0<T> extends C12538a<T, T> {

    /* renamed from: f */
    final Function<? super Throwable, ? extends T> f32935f;

    /* renamed from: io.reactivex.internal.operators.observable.q0$a */
    static final class C12652a<T> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super T> f32936e;

        /* renamed from: f */
        final Function<? super Throwable, ? extends T> f32937f;

        /* renamed from: g */
        Disposable f32938g;

        C12652a(Observer<? super T> observer, Function<? super Throwable, ? extends T> function) {
            this.f32936e = observer;
            this.f32937f = function;
        }

        public void dispose() {
            this.f32938g.dispose();
        }

        public boolean isDisposed() {
            return this.f32938g.isDisposed();
        }

        public void onComplete() {
            this.f32936e.onComplete();
        }

        public void onError(Throwable th) {
            try {
                Object apply = this.f32937f.apply(th);
                if (apply == null) {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(th);
                    this.f32936e.onError(nullPointerException);
                    return;
                }
                this.f32936e.onNext(apply);
                this.f32936e.onComplete();
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                this.f32936e.onError(new CompositeException(th, th2));
            }
        }

        public void onNext(T t) {
            this.f32936e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32938g, disposable)) {
                this.f32938g = disposable;
                this.f32936e.onSubscribe(this);
            }
        }
    }

    public C12651q0(ObservableSource<T> observableSource, Function<? super Throwable, ? extends T> function) {
        super(observableSource);
        this.f32935f = function;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f32549e.subscribe(new C12652a(observer, this.f32935f));
    }
}
