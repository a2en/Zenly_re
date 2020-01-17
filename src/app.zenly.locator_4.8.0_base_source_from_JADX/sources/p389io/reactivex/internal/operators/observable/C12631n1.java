package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;

/* renamed from: io.reactivex.internal.operators.observable.n1 */
public final class C12631n1<T> extends C12538a<T, T> {

    /* renamed from: f */
    final long f32848f;

    /* renamed from: g */
    final TimeUnit f32849g;

    /* renamed from: h */
    final C12286f f32850h;

    /* renamed from: i */
    final boolean f32851i;

    /* renamed from: io.reactivex.internal.operators.observable.n1$a */
    static final class C12632a<T> extends AtomicInteger implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* renamed from: e */
        final Observer<? super T> f32852e;

        /* renamed from: f */
        final long f32853f;

        /* renamed from: g */
        final TimeUnit f32854g;

        /* renamed from: h */
        final C12289c f32855h;

        /* renamed from: i */
        final boolean f32856i;

        /* renamed from: j */
        final AtomicReference<T> f32857j = new AtomicReference<>();

        /* renamed from: k */
        Disposable f32858k;

        /* renamed from: l */
        volatile boolean f32859l;

        /* renamed from: m */
        Throwable f32860m;

        /* renamed from: n */
        volatile boolean f32861n;

        /* renamed from: o */
        volatile boolean f32862o;

        /* renamed from: p */
        boolean f32863p;

        C12632a(Observer<? super T> observer, long j, TimeUnit timeUnit, C12289c cVar, boolean z) {
            this.f32852e = observer;
            this.f32853f = j;
            this.f32854g = timeUnit;
            this.f32855h = cVar;
            this.f32856i = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36776a() {
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.f32857j;
                Observer<? super T> observer = this.f32852e;
                int i = 1;
                while (!this.f32861n) {
                    boolean z = this.f32859l;
                    if (!z || this.f32860m == null) {
                        boolean z2 = atomicReference.get() == null;
                        if (z) {
                            Object andSet = atomicReference.getAndSet(null);
                            if (!z2 && this.f32856i) {
                                observer.onNext(andSet);
                            }
                            observer.onComplete();
                            this.f32855h.dispose();
                            return;
                        }
                        if (z2) {
                            if (this.f32862o) {
                                this.f32863p = false;
                                this.f32862o = false;
                            }
                        } else if (!this.f32863p || this.f32862o) {
                            observer.onNext(atomicReference.getAndSet(null));
                            this.f32862o = false;
                            this.f32863p = true;
                            this.f32855h.mo6576a(this, this.f32853f, this.f32854g);
                        }
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        atomicReference.lazySet(null);
                        observer.onError(this.f32860m);
                        this.f32855h.dispose();
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        public void dispose() {
            this.f32861n = true;
            this.f32858k.dispose();
            this.f32855h.dispose();
            if (getAndIncrement() == 0) {
                this.f32857j.lazySet(null);
            }
        }

        public boolean isDisposed() {
            return this.f32861n;
        }

        public void onComplete() {
            this.f32859l = true;
            mo36776a();
        }

        public void onError(Throwable th) {
            this.f32860m = th;
            this.f32859l = true;
            mo36776a();
        }

        public void onNext(T t) {
            this.f32857j.set(t);
            mo36776a();
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32858k, disposable)) {
                this.f32858k = disposable;
                this.f32852e.onSubscribe(this);
            }
        }

        public void run() {
            this.f32862o = true;
            mo36776a();
        }
    }

    public C12631n1(C12279e<T> eVar, long j, TimeUnit timeUnit, C12286f fVar, boolean z) {
        super(eVar);
        this.f32848f = j;
        this.f32849g = timeUnit;
        this.f32850h = fVar;
        this.f32851i = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        ObservableSource<T> observableSource = this.f32549e;
        C12632a aVar = new C12632a(observer, this.f32848f, this.f32849g, this.f32850h.mo6573a(), this.f32851i);
        observableSource.subscribe(aVar);
    }
}
