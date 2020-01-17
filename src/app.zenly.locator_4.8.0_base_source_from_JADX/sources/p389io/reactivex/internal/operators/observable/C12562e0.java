package p389io.reactivex.internal.operators.observable;

import java.util.Iterator;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.internal.observers.C12464c;
import p389io.reactivex.p393i.p394a.C12324b;

/* renamed from: io.reactivex.internal.operators.observable.e0 */
public final class C12562e0<T> extends C12279e<T> {

    /* renamed from: e */
    final Iterable<? extends T> f32617e;

    /* renamed from: io.reactivex.internal.operators.observable.e0$a */
    static final class C12563a<T> extends C12464c<T> {

        /* renamed from: e */
        final Observer<? super T> f32618e;

        /* renamed from: f */
        final Iterator<? extends T> f32619f;

        /* renamed from: g */
        volatile boolean f32620g;

        /* renamed from: h */
        boolean f32621h;

        /* renamed from: i */
        boolean f32622i;

        /* renamed from: j */
        boolean f32623j;

        C12563a(Observer<? super T> observer, Iterator<? extends T> it) {
            this.f32618e = observer;
            this.f32619f = it;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36731a() {
            while (!isDisposed()) {
                try {
                    Object next = this.f32619f.next();
                    C12324b.m32836a(next, "The iterator returned a null value");
                    this.f32618e.onNext(next);
                    if (!isDisposed()) {
                        try {
                            if (!this.f32619f.hasNext()) {
                                if (!isDisposed()) {
                                    this.f32618e.onComplete();
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            C12285a.m32748b(th);
                            this.f32618e.onError(th);
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Throwable th2) {
                    C12285a.m32748b(th2);
                    this.f32618e.onError(th2);
                    return;
                }
            }
        }

        public void clear() {
            this.f32622i = true;
        }

        public void dispose() {
            this.f32620g = true;
        }

        public boolean isDisposed() {
            return this.f32620g;
        }

        public boolean isEmpty() {
            return this.f32622i;
        }

        public T poll() {
            if (this.f32622i) {
                return null;
            }
            if (!this.f32623j) {
                this.f32623j = true;
            } else if (!this.f32619f.hasNext()) {
                this.f32622i = true;
                return null;
            }
            return C12324b.m32836a(this.f32619f.next(), "The iterator returned a null value");
        }

        public int requestFusion(int i) {
            if ((i & 1) == 0) {
                return 0;
            }
            this.f32621h = true;
            return 1;
        }
    }

    public C12562e0(Iterable<? extends T> iterable) {
        this.f32617e = iterable;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        try {
            Iterator it = this.f32617e.iterator();
            try {
                if (!it.hasNext()) {
                    C12459c.m32982a(observer);
                    return;
                }
                C12563a aVar = new C12563a(observer, it);
                observer.onSubscribe(aVar);
                if (!aVar.f32621h) {
                    aVar.mo36731a();
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
