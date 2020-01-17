package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.internal.util.C12759h;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p406n.C12789c;
import p389io.reactivex.p406n.C12798f;

/* renamed from: io.reactivex.internal.operators.observable.y0 */
public final class C12709y0<T> extends C12538a<T, T> {

    /* renamed from: f */
    final Function<? super C12279e<Throwable>, ? extends ObservableSource<?>> f33125f;

    /* renamed from: io.reactivex.internal.operators.observable.y0$a */
    static final class C12710a<T> extends AtomicInteger implements Observer<T>, Disposable {
        private static final long serialVersionUID = 802743776666017014L;

        /* renamed from: e */
        final Observer<? super T> f33126e;

        /* renamed from: f */
        final AtomicInteger f33127f = new AtomicInteger();

        /* renamed from: g */
        final C12752b f33128g = new C12752b();

        /* renamed from: h */
        final C12798f<Throwable> f33129h;

        /* renamed from: i */
        final C12711a f33130i = new C12711a<>();

        /* renamed from: j */
        final AtomicReference<Disposable> f33131j = new AtomicReference<>();

        /* renamed from: k */
        final ObservableSource<T> f33132k;

        /* renamed from: l */
        volatile boolean f33133l;

        /* renamed from: io.reactivex.internal.operators.observable.y0$a$a */
        final class C12711a extends AtomicReference<Disposable> implements Observer<Object> {
            private static final long serialVersionUID = 3254781284376480842L;

            C12711a() {
            }

            public void onComplete() {
                C12710a.this.mo36851a();
            }

            public void onError(Throwable th) {
                C12710a.this.mo36852a(th);
            }

            public void onNext(Object obj) {
                C12710a.this.mo36853b();
            }

            public void onSubscribe(Disposable disposable) {
                C12458b.m32978c(this, disposable);
            }
        }

        C12710a(Observer<? super T> observer, C12798f<Throwable> fVar, ObservableSource<T> observableSource) {
            this.f33126e = observer;
            this.f33129h = fVar;
            this.f33132k = observableSource;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36852a(Throwable th) {
            C12458b.m32975a(this.f33131j);
            C12759h.m33356a(this.f33126e, th, (AtomicInteger) this, this.f33128g);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36853b() {
            mo36854c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36854c() {
            if (this.f33127f.getAndIncrement() == 0) {
                while (!isDisposed()) {
                    if (!this.f33133l) {
                        this.f33133l = true;
                        this.f33132k.subscribe(this);
                    }
                    if (this.f33127f.decrementAndGet() == 0) {
                    }
                }
            }
        }

        public void dispose() {
            C12458b.m32975a(this.f33131j);
            C12458b.m32975a((AtomicReference<Disposable>) this.f33130i);
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) this.f33131j.get());
        }

        public void onComplete() {
            C12458b.m32975a((AtomicReference<Disposable>) this.f33130i);
            C12759h.m33357a(this.f33126e, (AtomicInteger) this, this.f33128g);
        }

        public void onError(Throwable th) {
            C12458b.m32976a(this.f33131j, (Disposable) null);
            this.f33133l = false;
            this.f33129h.onNext(th);
        }

        public void onNext(T t) {
            C12759h.m33355a(this.f33126e, t, (AtomicInteger) this, this.f33128g);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32976a(this.f33131j, disposable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36851a() {
            C12458b.m32975a(this.f33131j);
            C12759h.m33357a(this.f33126e, (AtomicInteger) this, this.f33128g);
        }
    }

    public C12709y0(ObservableSource<T> observableSource, Function<? super C12279e<Throwable>, ? extends ObservableSource<?>> function) {
        super(observableSource);
        this.f33125f = function;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12798f r = C12789c.m33462s().mo36986r();
        try {
            Object apply = this.f33125f.apply(r);
            C12324b.m32836a(apply, "The handler returned a null ObservableSource");
            ObservableSource observableSource = (ObservableSource) apply;
            C12710a aVar = new C12710a(observer, r, this.f32549e);
            observer.onSubscribe(aVar);
            observableSource.subscribe(aVar.f33130i);
            aVar.mo36854c();
        } catch (Throwable th) {
            C12285a.m32748b(th);
            C12459c.m32985a(th, observer);
        }
    }
}
