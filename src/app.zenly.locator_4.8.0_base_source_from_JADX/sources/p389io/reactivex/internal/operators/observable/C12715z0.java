package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.observers.C12800a;

/* renamed from: io.reactivex.internal.operators.observable.z0 */
public final class C12715z0<T> extends C12538a<T, T> {

    /* renamed from: f */
    final long f33147f;

    /* renamed from: g */
    final TimeUnit f33148g;

    /* renamed from: h */
    final C12286f f33149h;

    /* renamed from: i */
    final boolean f33150i;

    /* renamed from: io.reactivex.internal.operators.observable.z0$a */
    static final class C12716a<T> extends C12718c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        /* renamed from: k */
        final AtomicInteger f33151k = new AtomicInteger(1);

        C12716a(Observer<? super T> observer, long j, TimeUnit timeUnit, C12286f fVar) {
            super(observer, j, timeUnit, fVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36861b() {
            mo36865c();
            if (this.f33151k.decrementAndGet() == 0) {
                this.f33152e.onComplete();
            }
        }

        public void run() {
            if (this.f33151k.incrementAndGet() == 2) {
                mo36865c();
                if (this.f33151k.decrementAndGet() == 0) {
                    this.f33152e.onComplete();
                }
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.z0$b */
    static final class C12717b<T> extends C12718c<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        C12717b(Observer<? super T> observer, long j, TimeUnit timeUnit, C12286f fVar) {
            super(observer, j, timeUnit, fVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36861b() {
            this.f33152e.onComplete();
        }

        public void run() {
            mo36865c();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.z0$c */
    static abstract class C12718c<T> extends AtomicReference<T> implements Observer<T>, Disposable, Runnable {
        private static final long serialVersionUID = -3517602651313910099L;

        /* renamed from: e */
        final Observer<? super T> f33152e;

        /* renamed from: f */
        final long f33153f;

        /* renamed from: g */
        final TimeUnit f33154g;

        /* renamed from: h */
        final C12286f f33155h;

        /* renamed from: i */
        final AtomicReference<Disposable> f33156i = new AtomicReference<>();

        /* renamed from: j */
        Disposable f33157j;

        C12718c(Observer<? super T> observer, long j, TimeUnit timeUnit, C12286f fVar) {
            this.f33152e = observer;
            this.f33153f = j;
            this.f33154g = timeUnit;
            this.f33155h = fVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36864a() {
            C12458b.m32975a(this.f33156i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract void mo36861b();

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo36865c() {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f33152e.onNext(andSet);
            }
        }

        public void dispose() {
            mo36864a();
            this.f33157j.dispose();
        }

        public boolean isDisposed() {
            return this.f33157j.isDisposed();
        }

        public void onComplete() {
            mo36864a();
            mo36861b();
        }

        public void onError(Throwable th) {
            mo36864a();
            this.f33152e.onError(th);
        }

        public void onNext(T t) {
            lazySet(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f33157j, disposable)) {
                this.f33157j = disposable;
                this.f33152e.onSubscribe(this);
                C12286f fVar = this.f33155h;
                long j = this.f33153f;
                C12458b.m32976a(this.f33156i, fVar.mo6571a(this, j, j, this.f33154g));
            }
        }
    }

    public C12715z0(ObservableSource<T> observableSource, long j, TimeUnit timeUnit, C12286f fVar, boolean z) {
        super(observableSource);
        this.f33147f = j;
        this.f33148g = timeUnit;
        this.f33149h = fVar;
        this.f33150i = z;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12800a aVar = new C12800a(observer);
        if (this.f33150i) {
            ObservableSource<T> observableSource = this.f32549e;
            C12716a aVar2 = new C12716a(aVar, this.f33147f, this.f33148g, this.f33149h);
            observableSource.subscribe(aVar2);
            return;
        }
        ObservableSource<T> observableSource2 = this.f32549e;
        C12717b bVar = new C12717b(aVar, this.f33147f, this.f33148g, this.f33149h);
        observableSource2.subscribe(bVar);
    }
}
