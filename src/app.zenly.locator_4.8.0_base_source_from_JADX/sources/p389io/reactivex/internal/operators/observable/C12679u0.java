package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.ResettableConnectable;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.u0 */
public final class C12679u0<T> extends C12279e<T> {

    /* renamed from: e */
    final C12767a<T> f33026e;

    /* renamed from: f */
    final int f33027f;

    /* renamed from: g */
    final long f33028g;

    /* renamed from: h */
    final TimeUnit f33029h;

    /* renamed from: i */
    final C12286f f33030i;

    /* renamed from: j */
    C12680a f33031j;

    /* renamed from: io.reactivex.internal.operators.observable.u0$a */
    static final class C12680a extends AtomicReference<Disposable> implements Runnable, Consumer<Disposable> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* renamed from: e */
        final C12679u0<?> f33032e;

        /* renamed from: f */
        Disposable f33033f;

        /* renamed from: g */
        long f33034g;

        /* renamed from: h */
        boolean f33035h;

        /* renamed from: i */
        boolean f33036i;

        C12680a(C12679u0<?> u0Var) {
            this.f33032e = u0Var;
        }

        /* renamed from: a */
        public void accept(Disposable disposable) throws Exception {
            C12458b.m32976a((AtomicReference<Disposable>) this, disposable);
            synchronized (this.f33032e) {
                if (this.f33036i) {
                    ((ResettableConnectable) this.f33032e.f33026e).resetIf(disposable);
                }
            }
        }

        public void run() {
            this.f33032e.mo36809e(this);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.u0$b */
    static final class C12681b<T> extends AtomicBoolean implements Observer<T>, Disposable {
        private static final long serialVersionUID = -7419642935409022375L;

        /* renamed from: e */
        final Observer<? super T> f33037e;

        /* renamed from: f */
        final C12679u0<T> f33038f;

        /* renamed from: g */
        final C12680a f33039g;

        /* renamed from: h */
        Disposable f33040h;

        C12681b(Observer<? super T> observer, C12679u0<T> u0Var, C12680a aVar) {
            this.f33037e = observer;
            this.f33038f = u0Var;
            this.f33039g = aVar;
        }

        public void dispose() {
            this.f33040h.dispose();
            if (compareAndSet(false, true)) {
                this.f33038f.mo36805a(this.f33039g);
            }
        }

        public boolean isDisposed() {
            return this.f33040h.isDisposed();
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f33038f.mo36808d(this.f33039g);
                this.f33037e.onComplete();
            }
        }

        public void onError(Throwable th) {
            if (compareAndSet(false, true)) {
                this.f33038f.mo36808d(this.f33039g);
                this.f33037e.onError(th);
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            this.f33037e.onNext(t);
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f33040h, disposable)) {
                this.f33040h = disposable;
                this.f33037e.onSubscribe(this);
            }
        }
    }

    public C12679u0(C12767a<T> aVar) {
        this(aVar, 1, 0, TimeUnit.NANOSECONDS, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12680a aVar;
        boolean z;
        synchronized (this) {
            aVar = this.f33031j;
            if (aVar == null) {
                aVar = new C12680a(this);
                this.f33031j = aVar;
            }
            long j = aVar.f33034g;
            if (j == 0 && aVar.f33033f != null) {
                aVar.f33033f.dispose();
            }
            long j2 = j + 1;
            aVar.f33034g = j2;
            z = true;
            if (aVar.f33035h || j2 != ((long) this.f33027f)) {
                z = false;
            } else {
                aVar.f33035h = true;
            }
        }
        this.f33026e.subscribe(new C12681b(observer, this, aVar));
        if (z) {
            this.f33026e.mo36790e(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36806b(C12680a aVar) {
        Disposable disposable = aVar.f33033f;
        if (disposable != null) {
            disposable.dispose();
            aVar.f33033f = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo36807c(C12680a aVar) {
        C12767a<T> aVar2 = this.f33026e;
        if (aVar2 instanceof Disposable) {
            ((Disposable) aVar2).dispose();
        } else if (aVar2 instanceof ResettableConnectable) {
            ((ResettableConnectable) aVar2).resetIf((Disposable) aVar.get());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo36808d(C12680a aVar) {
        synchronized (this) {
            if (this.f33026e instanceof ObservablePublishClassic) {
                if (this.f33031j != null && this.f33031j == aVar) {
                    this.f33031j = null;
                    mo36806b(aVar);
                }
                long j = aVar.f33034g - 1;
                aVar.f33034g = j;
                if (j == 0) {
                    mo36807c(aVar);
                }
            } else if (this.f33031j != null && this.f33031j == aVar) {
                mo36806b(aVar);
                long j2 = aVar.f33034g - 1;
                aVar.f33034g = j2;
                if (j2 == 0) {
                    this.f33031j = null;
                    mo36807c(aVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo36809e(C12680a aVar) {
        synchronized (this) {
            if (aVar.f33034g == 0 && aVar == this.f33031j) {
                this.f33031j = null;
                Disposable disposable = (Disposable) aVar.get();
                C12458b.m32975a((AtomicReference<Disposable>) aVar);
                if (this.f33026e instanceof Disposable) {
                    ((Disposable) this.f33026e).dispose();
                } else if (this.f33026e instanceof ResettableConnectable) {
                    if (disposable == null) {
                        aVar.f33036i = true;
                    } else {
                        ((ResettableConnectable) this.f33026e).resetIf(disposable);
                    }
                }
            }
        }
    }

    public C12679u0(C12767a<T> aVar, int i, long j, TimeUnit timeUnit, C12286f fVar) {
        this.f33026e = aVar;
        this.f33027f = i;
        this.f33028g = j;
        this.f33029h = timeUnit;
        this.f33030i = fVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36805a(p389io.reactivex.internal.operators.observable.C12679u0.C12680a r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            io.reactivex.internal.operators.observable.u0$a r0 = r5.f33031j     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003f
            io.reactivex.internal.operators.observable.u0$a r0 = r5.f33031j     // Catch:{ all -> 0x0041 }
            if (r0 == r6) goto L_0x000a
            goto L_0x003f
        L_0x000a:
            long r0 = r6.f33034g     // Catch:{ all -> 0x0041 }
            r2 = 1
            long r0 = r0 - r2
            r6.f33034g = r0     // Catch:{ all -> 0x0041 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x003d
            boolean r0 = r6.f33035h     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x001c
            goto L_0x003d
        L_0x001c:
            long r0 = r5.f33028g     // Catch:{ all -> 0x0041 }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0027
            r5.mo36809e(r6)     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0027:
            io.reactivex.internal.disposables.e r0 = new io.reactivex.internal.disposables.e     // Catch:{ all -> 0x0041 }
            r0.<init>()     // Catch:{ all -> 0x0041 }
            r6.f33033f = r0     // Catch:{ all -> 0x0041 }
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            io.reactivex.f r1 = r5.f33030i
            long r2 = r5.f33028g
            java.util.concurrent.TimeUnit r4 = r5.f33029h
            io.reactivex.disposables.Disposable r6 = r1.mo6572a(r6, r2, r4)
            r0.mo36653a(r6)
            return
        L_0x003d:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x003f:
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0041 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12679u0.mo36805a(io.reactivex.internal.operators.observable.u0$a):void");
    }
}
