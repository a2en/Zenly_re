package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12461e;
import p389io.reactivex.internal.util.C12757g;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.o1 */
public final class C12637o1<T> extends C12538a<T, T> {

    /* renamed from: f */
    final long f32884f;

    /* renamed from: g */
    final TimeUnit f32885g;

    /* renamed from: h */
    final C12286f f32886h;

    /* renamed from: i */
    final ObservableSource<? extends T> f32887i;

    /* renamed from: io.reactivex.internal.operators.observable.o1$a */
    static final class C12638a<T> implements Observer<T> {

        /* renamed from: e */
        final Observer<? super T> f32888e;

        /* renamed from: f */
        final AtomicReference<Disposable> f32889f;

        C12638a(Observer<? super T> observer, AtomicReference<Disposable> atomicReference) {
            this.f32888e = observer;
            this.f32889f = atomicReference;
        }

        public void onComplete() {
            this.f32888e.onComplete();
        }

        public void onError(Throwable th) {
            this.f32888e.onError(th);
        }

        public void onNext(T t) {
            this.f32888e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32976a(this.f32889f, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.o1$b */
    static final class C12639b<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable, C12641d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: e */
        final Observer<? super T> f32890e;

        /* renamed from: f */
        final long f32891f;

        /* renamed from: g */
        final TimeUnit f32892g;

        /* renamed from: h */
        final C12289c f32893h;

        /* renamed from: i */
        final C12461e f32894i = new C12461e();

        /* renamed from: j */
        final AtomicLong f32895j = new AtomicLong();

        /* renamed from: k */
        final AtomicReference<Disposable> f32896k = new AtomicReference<>();

        /* renamed from: l */
        ObservableSource<? extends T> f32897l;

        C12639b(Observer<? super T> observer, long j, TimeUnit timeUnit, C12289c cVar, ObservableSource<? extends T> observableSource) {
            this.f32890e = observer;
            this.f32891f = j;
            this.f32892g = timeUnit;
            this.f32893h = cVar;
            this.f32897l = observableSource;
        }

        /* renamed from: a */
        public void mo36783a(long j) {
            if (this.f32895j.compareAndSet(j, Long.MAX_VALUE)) {
                C12458b.m32975a(this.f32896k);
                ObservableSource<? extends T> observableSource = this.f32897l;
                this.f32897l = null;
                observableSource.subscribe(new C12638a(this.f32890e, this));
                this.f32893h.dispose();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36784b(long j) {
            this.f32894i.mo36653a(this.f32893h.mo6576a(new C12642e(j, this), this.f32891f, this.f32892g));
        }

        public void dispose() {
            C12458b.m32975a(this.f32896k);
            C12458b.m32975a((AtomicReference<Disposable>) this);
            this.f32893h.dispose();
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) get());
        }

        public void onComplete() {
            if (this.f32895j.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f32894i.dispose();
                this.f32890e.onComplete();
                this.f32893h.dispose();
            }
        }

        public void onError(Throwable th) {
            if (this.f32895j.getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f32894i.dispose();
                this.f32890e.onError(th);
                this.f32893h.dispose();
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            long j = this.f32895j.get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (this.f32895j.compareAndSet(j, j2)) {
                    ((Disposable) this.f32894i.get()).dispose();
                    this.f32890e.onNext(t);
                    mo36784b(j2);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this.f32896k, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.o1$c */
    static final class C12640c<T> extends AtomicLong implements Observer<T>, Disposable, C12641d {
        private static final long serialVersionUID = 3764492702657003550L;

        /* renamed from: e */
        final Observer<? super T> f32898e;

        /* renamed from: f */
        final long f32899f;

        /* renamed from: g */
        final TimeUnit f32900g;

        /* renamed from: h */
        final C12289c f32901h;

        /* renamed from: i */
        final C12461e f32902i = new C12461e();

        /* renamed from: j */
        final AtomicReference<Disposable> f32903j = new AtomicReference<>();

        C12640c(Observer<? super T> observer, long j, TimeUnit timeUnit, C12289c cVar) {
            this.f32898e = observer;
            this.f32899f = j;
            this.f32900g = timeUnit;
            this.f32901h = cVar;
        }

        /* renamed from: a */
        public void mo36783a(long j) {
            if (compareAndSet(j, Long.MAX_VALUE)) {
                C12458b.m32975a(this.f32903j);
                this.f32898e.onError(new TimeoutException(C12757g.m33351a(this.f32899f, this.f32900g)));
                this.f32901h.dispose();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36785b(long j) {
            this.f32902i.mo36653a(this.f32901h.mo6576a(new C12642e(j, this), this.f32899f, this.f32900g));
        }

        public void dispose() {
            C12458b.m32975a(this.f32903j);
            this.f32901h.dispose();
        }

        public boolean isDisposed() {
            return C12458b.m32973a((Disposable) this.f32903j.get());
        }

        public void onComplete() {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f32902i.dispose();
                this.f32898e.onComplete();
                this.f32901h.dispose();
            }
        }

        public void onError(Throwable th) {
            if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
                this.f32902i.dispose();
                this.f32898e.onError(th);
                this.f32901h.dispose();
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            long j = get();
            if (j != Long.MAX_VALUE) {
                long j2 = 1 + j;
                if (compareAndSet(j, j2)) {
                    ((Disposable) this.f32902i.get()).dispose();
                    this.f32898e.onNext(t);
                    mo36785b(j2);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this.f32903j, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.o1$d */
    interface C12641d {
        /* renamed from: a */
        void mo36783a(long j);
    }

    /* renamed from: io.reactivex.internal.operators.observable.o1$e */
    static final class C12642e implements Runnable {

        /* renamed from: e */
        final C12641d f32904e;

        /* renamed from: f */
        final long f32905f;

        C12642e(long j, C12641d dVar) {
            this.f32905f = j;
            this.f32904e = dVar;
        }

        public void run() {
            this.f32904e.mo36783a(this.f32905f);
        }
    }

    public C12637o1(C12279e<T> eVar, long j, TimeUnit timeUnit, C12286f fVar, ObservableSource<? extends T> observableSource) {
        super(eVar);
        this.f32884f = j;
        this.f32885g = timeUnit;
        this.f32886h = fVar;
        this.f32887i = observableSource;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        if (this.f32887i == null) {
            C12640c cVar = new C12640c(observer, this.f32884f, this.f32885g, this.f32886h.mo6573a());
            observer.onSubscribe(cVar);
            cVar.mo36785b(0);
            this.f32549e.subscribe(cVar);
            return;
        }
        C12639b bVar = new C12639b(observer, this.f32884f, this.f32885g, this.f32886h.mo6573a(), this.f32887i);
        observer.onSubscribe(bVar);
        bVar.mo36784b(0);
        this.f32549e.subscribe(bVar);
    }
}
