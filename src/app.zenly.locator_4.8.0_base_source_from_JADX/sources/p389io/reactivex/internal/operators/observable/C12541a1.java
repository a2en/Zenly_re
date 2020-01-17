package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.internal.fuseable.QueueDisposable;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.a1 */
public final class C12541a1 {

    /* renamed from: io.reactivex.internal.operators.observable.a1$a */
    public static final class C12542a<T> extends AtomicInteger implements QueueDisposable<T>, Runnable {
        private static final long serialVersionUID = 3880992722410194083L;

        /* renamed from: e */
        final Observer<? super T> f32554e;

        /* renamed from: f */
        final T f32555f;

        public C12542a(Observer<? super T> observer, T t) {
            this.f32554e = observer;
            this.f32555f = t;
        }

        public void clear() {
            lazySet(3);
        }

        public void dispose() {
            set(3);
        }

        public boolean isDisposed() {
            return get() == 3;
        }

        public boolean isEmpty() {
            return get() != 1;
        }

        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        public T poll() throws Exception {
            if (get() != 1) {
                return null;
            }
            lazySet(3);
            return this.f32555f;
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            lazySet(1);
            return 1;
        }

        public void run() {
            if (get() == 0 && compareAndSet(0, 2)) {
                this.f32554e.onNext(this.f32555f);
                if (get() == 2) {
                    lazySet(3);
                    this.f32554e.onComplete();
                }
            }
        }

        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.a1$b */
    static final class C12543b<T, R> extends C12279e<R> {

        /* renamed from: e */
        final T f32556e;

        /* renamed from: f */
        final Function<? super T, ? extends ObservableSource<? extends R>> f32557f;

        C12543b(T t, Function<? super T, ? extends ObservableSource<? extends R>> function) {
            this.f32556e = t;
            this.f32557f = function;
        }

        /* renamed from: a */
        public void mo35836a(Observer<? super R> observer) {
            try {
                Object apply = this.f32557f.apply(this.f32556e);
                C12324b.m32836a(apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) apply;
                if (observableSource instanceof Callable) {
                    try {
                        Object call = ((Callable) observableSource).call();
                        if (call == null) {
                            C12459c.m32982a(observer);
                            return;
                        }
                        C12542a aVar = new C12542a(observer, call);
                        observer.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        C12459c.m32985a(th, observer);
                    }
                } else {
                    observableSource.subscribe(observer);
                }
            } catch (Throwable th2) {
                C12459c.m32985a(th2, observer);
            }
        }
    }

    /* renamed from: a */
    public static <T, R> boolean m33073a(ObservableSource<T> observableSource, Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function) {
        if (!(observableSource instanceof Callable)) {
            return false;
        }
        try {
            Object call = ((Callable) observableSource).call();
            if (call == null) {
                C12459c.m32982a(observer);
                return true;
            }
            try {
                Object apply = function.apply(call);
                C12324b.m32836a(apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource2 = (ObservableSource) apply;
                if (observableSource2 instanceof Callable) {
                    try {
                        Object call2 = ((Callable) observableSource2).call();
                        if (call2 == null) {
                            C12459c.m32982a(observer);
                            return true;
                        }
                        C12542a aVar = new C12542a(observer, call2);
                        observer.onSubscribe(aVar);
                        aVar.run();
                    } catch (Throwable th) {
                        C12285a.m32748b(th);
                        C12459c.m32985a(th, observer);
                        return true;
                    }
                } else {
                    observableSource2.subscribe(observer);
                }
                return true;
            } catch (Throwable th2) {
                C12285a.m32748b(th2);
                C12459c.m32985a(th2, observer);
                return true;
            }
        } catch (Throwable th3) {
            C12285a.m32748b(th3);
            C12459c.m32985a(th3, observer);
            return true;
        }
    }

    /* renamed from: a */
    public static <T, U> C12279e<U> m33072a(T t, Function<? super T, ? extends ObservableSource<? extends U>> function) {
        return C12768a.m33396a((C12279e<T>) new C12543b<T>(t, function));
    }
}
