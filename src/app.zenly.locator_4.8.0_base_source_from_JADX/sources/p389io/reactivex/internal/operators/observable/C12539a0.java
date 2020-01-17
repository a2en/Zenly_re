package p389io.reactivex.internal.operators.observable;

import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.a0 */
public final class C12539a0<T, R> extends C12538a<T, R> {

    /* renamed from: f */
    final Function<? super T, ? extends Iterable<? extends R>> f32550f;

    /* renamed from: io.reactivex.internal.operators.observable.a0$a */
    static final class C12540a<T, R> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super R> f32551e;

        /* renamed from: f */
        final Function<? super T, ? extends Iterable<? extends R>> f32552f;

        /* renamed from: g */
        Disposable f32553g;

        C12540a(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f32551e = observer;
            this.f32552f = function;
        }

        public void dispose() {
            this.f32553g.dispose();
            this.f32553g = C12458b.DISPOSED;
        }

        public boolean isDisposed() {
            return this.f32553g.isDisposed();
        }

        public void onComplete() {
            Disposable disposable = this.f32553g;
            C12458b bVar = C12458b.DISPOSED;
            if (disposable != bVar) {
                this.f32553g = bVar;
                this.f32551e.onComplete();
            }
        }

        public void onError(Throwable th) {
            Disposable disposable = this.f32553g;
            C12458b bVar = C12458b.DISPOSED;
            if (disposable == bVar) {
                C12768a.m33415b(th);
                return;
            }
            this.f32553g = bVar;
            this.f32551e.onError(th);
        }

        public void onNext(T t) {
            if (this.f32553g != C12458b.DISPOSED) {
                try {
                    Observer<? super R> observer = this.f32551e;
                    for (Object next : (Iterable) this.f32552f.apply(t)) {
                        try {
                            try {
                                C12324b.m32836a(next, "The iterator returned a null value");
                                observer.onNext(next);
                            } catch (Throwable th) {
                                C12285a.m32748b(th);
                                this.f32553g.dispose();
                                onError(th);
                            }
                        } catch (Throwable th2) {
                            C12285a.m32748b(th2);
                            this.f32553g.dispose();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    C12285a.m32748b(th3);
                    this.f32553g.dispose();
                    onError(th3);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32553g, disposable)) {
                this.f32553g = disposable;
                this.f32551e.onSubscribe(this);
            }
        }
    }

    public C12539a0(ObservableSource<T> observableSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        super(observableSource);
        this.f32550f = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        this.f32549e.subscribe(new C12540a(observer, this.f32550f));
    }
}
