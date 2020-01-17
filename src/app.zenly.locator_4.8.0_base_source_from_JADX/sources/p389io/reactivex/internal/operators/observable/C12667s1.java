package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.observers.C12800a;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.operators.observable.s1 */
public final class C12667s1<T, U, R> extends C12538a<T, R> {

    /* renamed from: f */
    final BiFunction<? super T, ? super U, ? extends R> f32980f;

    /* renamed from: g */
    final ObservableSource<? extends U> f32981g;

    /* renamed from: io.reactivex.internal.operators.observable.s1$a */
    static final class C12668a<T, U, R> extends AtomicReference<U> implements Observer<T>, Disposable {
        private static final long serialVersionUID = -312246233408980075L;

        /* renamed from: e */
        final Observer<? super R> f32982e;

        /* renamed from: f */
        final BiFunction<? super T, ? super U, ? extends R> f32983f;

        /* renamed from: g */
        final AtomicReference<Disposable> f32984g = new AtomicReference<>();

        /* renamed from: h */
        final AtomicReference<Disposable> f32985h = new AtomicReference<>();

        C12668a(Observer<? super R> observer, BiFunction<? super T, ? super U, ? extends R> biFunction) {
            this.f32982e = observer;
            this.f32983f = biFunction;
        }

        /* renamed from: a */
        public boolean mo36797a(Disposable disposable) {
            return C12458b.m32978c(this.f32985h, disposable);
        }

        public void dispose() {
            C12458b.m32975a(this.f32984g);
            C12458b.m32975a(this.f32985h);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) this.f32984g.get());
        }

        public void onComplete() {
            C12458b.m32975a(this.f32985h);
            this.f32982e.onComplete();
        }

        public void onError(Throwable th) {
            C12458b.m32975a(this.f32985h);
            this.f32982e.onError(th);
        }

        public void onNext(T t) {
            Object obj = get();
            if (obj != null) {
                try {
                    Object apply = this.f32983f.apply(t, obj);
                    C12324b.m32836a(apply, "The combiner returned a null value");
                    this.f32982e.onNext(apply);
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    dispose();
                    this.f32982e.onError(th);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this.f32984g, disposable);
        }

        /* renamed from: a */
        public void mo36796a(Throwable th) {
            C12458b.m32975a(this.f32984g);
            this.f32982e.onError(th);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.s1$b */
    final class C12669b implements Observer<U> {

        /* renamed from: e */
        private final C12668a<T, U, R> f32986e;

        C12669b(C12667s1 s1Var, C12668a<T, U, R> aVar) {
            this.f32986e = aVar;
        }

        public void onComplete() {
        }

        public void onError(Throwable th) {
            this.f32986e.mo36796a(th);
        }

        public void onNext(U u) {
            this.f32986e.lazySet(u);
        }

        public void onSubscribe(Disposable disposable) {
            this.f32986e.mo36797a(disposable);
        }
    }

    public C12667s1(ObservableSource<T> observableSource, BiFunction<? super T, ? super U, ? extends R> biFunction, ObservableSource<? extends U> observableSource2) {
        super(observableSource);
        this.f32980f = biFunction;
        this.f32981g = observableSource2;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        C12800a aVar = new C12800a(observer);
        C12668a aVar2 = new C12668a(aVar, this.f32980f);
        aVar.onSubscribe(aVar2);
        this.f32981g.subscribe(new C12669b(this, aVar2));
        this.f32549e.subscribe(aVar2);
    }
}
