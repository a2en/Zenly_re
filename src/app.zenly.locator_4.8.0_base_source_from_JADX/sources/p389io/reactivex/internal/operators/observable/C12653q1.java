package p389io.reactivex.internal.operators.observable;

import java.util.Collection;
import java.util.concurrent.Callable;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.operators.observable.q1 */
public final class C12653q1<T, U extends Collection<? super T>> extends C12538a<T, U> {

    /* renamed from: f */
    final Callable<U> f32939f;

    /* renamed from: io.reactivex.internal.operators.observable.q1$a */
    static final class C12654a<T, U extends Collection<? super T>> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super U> f32940e;

        /* renamed from: f */
        Disposable f32941f;

        /* renamed from: g */
        U f32942g;

        C12654a(Observer<? super U> observer, U u) {
            this.f32940e = observer;
            this.f32942g = u;
        }

        public void dispose() {
            this.f32941f.dispose();
        }

        public boolean isDisposed() {
            return this.f32941f.isDisposed();
        }

        public void onComplete() {
            U u = this.f32942g;
            this.f32942g = null;
            this.f32940e.onNext(u);
            this.f32940e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32942g = null;
            this.f32940e.onError(th);
        }

        public void onNext(T t) {
            this.f32942g.add(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32941f, disposable)) {
                this.f32941f = disposable;
                this.f32940e.onSubscribe(this);
            }
        }
    }

    public C12653q1(ObservableSource<T> observableSource, Callable<U> callable) {
        super(observableSource);
        this.f32939f = callable;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super U> observer) {
        try {
            Object call = this.f32939f.call();
            C12324b.m32836a(call, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
            this.f32549e.subscribe(new C12654a(observer, (Collection) call));
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12459c.m32985a(th, observer);
        }
    }
}
