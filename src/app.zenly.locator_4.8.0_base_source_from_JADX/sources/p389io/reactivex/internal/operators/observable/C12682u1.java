package p389io.reactivex.internal.operators.observable;

import java.util.Iterator;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.BiFunction;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.u1 */
public final class C12682u1<T, U, V> extends C12279e<V> {

    /* renamed from: e */
    final C12279e<? extends T> f33041e;

    /* renamed from: f */
    final Iterable<U> f33042f;

    /* renamed from: g */
    final BiFunction<? super T, ? super U, ? extends V> f33043g;

    /* renamed from: io.reactivex.internal.operators.observable.u1$a */
    static final class C12683a<T, U, V> implements Observer<T>, Disposable {

        /* renamed from: e */
        final Observer<? super V> f33044e;

        /* renamed from: f */
        final Iterator<U> f33045f;

        /* renamed from: g */
        final BiFunction<? super T, ? super U, ? extends V> f33046g;

        /* renamed from: h */
        Disposable f33047h;

        /* renamed from: i */
        boolean f33048i;

        C12683a(Observer<? super V> observer, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.f33044e = observer;
            this.f33045f = it;
            this.f33046g = biFunction;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36812a(Throwable th) {
            this.f33048i = true;
            this.f33047h.dispose();
            this.f33044e.onError(th);
        }

        public void dispose() {
            this.f33047h.dispose();
        }

        public boolean isDisposed() {
            return this.f33047h.isDisposed();
        }

        public void onComplete() {
            if (!this.f33048i) {
                this.f33048i = true;
                this.f33044e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (this.f33048i) {
                C12768a.m33415b(th);
                return;
            }
            this.f33048i = true;
            this.f33044e.onError(th);
        }

        public void onNext(T t) {
            if (!this.f33048i) {
                try {
                    Object next = this.f33045f.next();
                    C12324b.m32836a(next, "The iterator returned a null value");
                    try {
                        Object apply = this.f33046g.apply(t, next);
                        C12324b.m32836a(apply, "The zipper function returned a null value");
                        this.f33044e.onNext(apply);
                        try {
                            if (!this.f33045f.hasNext()) {
                                this.f33048i = true;
                                this.f33047h.dispose();
                                this.f33044e.onComplete();
                            }
                        } catch (Throwable th) {
                            C12285a.m32748b(th);
                            mo36812a(th);
                        }
                    } catch (Throwable th2) {
                        C12285a.m32748b(th2);
                        mo36812a(th2);
                    }
                } catch (Throwable th3) {
                    C12285a.m32748b(th3);
                    mo36812a(th3);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f33047h, disposable)) {
                this.f33047h = disposable;
                this.f33044e.onSubscribe(this);
            }
        }
    }

    public C12682u1(C12279e<? extends T> eVar, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        this.f33041e = eVar;
        this.f33042f = iterable;
        this.f33043g = biFunction;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super V> observer) {
        try {
            Iterator it = this.f33042f.iterator();
            C12324b.m32836a(it, "The iterator returned by other is null");
            Iterator it2 = it;
            try {
                if (!it2.hasNext()) {
                    C12459c.m32982a(observer);
                } else {
                    this.f33041e.subscribe(new C12683a(observer, it2, this.f33043g));
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                C12459c.m32985a(th, observer);
            }
        } catch (Throwable th2) {
            C12285a.m32748b(th2);
            C12459c.m32985a(th2, observer);
        }
    }
}
