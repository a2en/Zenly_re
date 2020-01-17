package p389io.reactivex.internal.operators.observable;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.functions.Function;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.fuseable.QueueDisposable;
import p389io.reactivex.internal.fuseable.SimpleQueue;
import p389io.reactivex.internal.util.C12752b;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12449c;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.g1 */
public final class C12581g1<T, R> extends C12538a<T, R> {

    /* renamed from: f */
    final Function<? super T, ? extends ObservableSource<? extends R>> f32693f;

    /* renamed from: g */
    final int f32694g;

    /* renamed from: h */
    final boolean f32695h;

    /* renamed from: io.reactivex.internal.operators.observable.g1$a */
    static final class C12582a<T, R> extends AtomicReference<Disposable> implements Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* renamed from: e */
        final C12583b<T, R> f32696e;

        /* renamed from: f */
        final long f32697f;

        /* renamed from: g */
        final int f32698g;

        /* renamed from: h */
        volatile SimpleQueue<R> f32699h;

        /* renamed from: i */
        volatile boolean f32700i;

        C12582a(C12583b<T, R> bVar, long j, int i) {
            this.f32696e = bVar;
            this.f32697f = j;
            this.f32698g = i;
        }

        /* renamed from: a */
        public void mo36746a() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public void onComplete() {
            if (this.f32697f == this.f32696e.f32711n) {
                this.f32700i = true;
                this.f32696e.mo36749b();
            }
        }

        public void onError(Throwable th) {
            this.f32696e.mo36748a(this, th);
        }

        public void onNext(R r) {
            if (this.f32697f == this.f32696e.f32711n) {
                if (r != null) {
                    this.f32699h.offer(r);
                }
                this.f32696e.mo36749b();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(7);
                    if (requestFusion == 1) {
                        this.f32699h = queueDisposable;
                        this.f32700i = true;
                        this.f32696e.mo36749b();
                        return;
                    } else if (requestFusion == 2) {
                        this.f32699h = queueDisposable;
                        return;
                    }
                }
                this.f32699h = new C12449c(this.f32698g);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.g1$b */
    static final class C12583b<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* renamed from: o */
        static final C12582a<Object, Object> f32701o = new C12582a<>(null, -1, 1);
        private static final long serialVersionUID = -3491074160481096299L;

        /* renamed from: e */
        final Observer<? super R> f32702e;

        /* renamed from: f */
        final Function<? super T, ? extends ObservableSource<? extends R>> f32703f;

        /* renamed from: g */
        final int f32704g;

        /* renamed from: h */
        final boolean f32705h;

        /* renamed from: i */
        final C12752b f32706i;

        /* renamed from: j */
        volatile boolean f32707j;

        /* renamed from: k */
        volatile boolean f32708k;

        /* renamed from: l */
        Disposable f32709l;

        /* renamed from: m */
        final AtomicReference<C12582a<T, R>> f32710m = new AtomicReference<>();

        /* renamed from: n */
        volatile long f32711n;

        static {
            f32701o.mo36746a();
        }

        C12583b(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
            this.f32702e = observer;
            this.f32703f = function;
            this.f32704g = i;
            this.f32705h = z;
            this.f32706i = new C12752b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36747a() {
            C12582a<Object, Object> aVar = (C12582a) this.f32710m.get();
            C12582a<Object, Object> aVar2 = f32701o;
            if (aVar != aVar2) {
                C12582a<Object, Object> aVar3 = (C12582a) this.f32710m.getAndSet(aVar2);
                if (aVar3 != f32701o && aVar3 != null) {
                    aVar3.mo36746a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x000f A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36749b() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L_0x0007
                return
            L_0x0007:
                io.reactivex.Observer<? super R> r0 = r13.f32702e
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.g1$a<T, R>> r1 = r13.f32710m
                boolean r2 = r13.f32705h
                r3 = 1
                r4 = 1
            L_0x000f:
                boolean r5 = r13.f32708k
                if (r5 == 0) goto L_0x0014
                return
            L_0x0014:
                boolean r5 = r13.f32707j
                r6 = 0
                if (r5 == 0) goto L_0x0052
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L_0x0021
                r5 = 1
                goto L_0x0022
            L_0x0021:
                r5 = 0
            L_0x0022:
                if (r2 == 0) goto L_0x0038
                if (r5 == 0) goto L_0x0052
                io.reactivex.internal.util.b r1 = r13.f32706i
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L_0x0034
                r0.onError(r1)
                goto L_0x0037
            L_0x0034:
                r0.onComplete()
            L_0x0037:
                return
            L_0x0038:
                io.reactivex.internal.util.b r7 = r13.f32706i
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x004c
                io.reactivex.internal.util.b r1 = r13.f32706i
                java.lang.Throwable r1 = r1.mo36928a()
                r0.onError(r1)
                return
            L_0x004c:
                if (r5 == 0) goto L_0x0052
                r0.onComplete()
                return
            L_0x0052:
                java.lang.Object r5 = r1.get()
                io.reactivex.internal.operators.observable.g1$a r5 = (p389io.reactivex.internal.operators.observable.C12581g1.C12582a) r5
                if (r5 == 0) goto L_0x00e9
                io.reactivex.internal.fuseable.SimpleQueue<R> r7 = r5.f32699h
                if (r7 == 0) goto L_0x00e9
                boolean r8 = r5.f32700i
                r9 = 0
                if (r8 == 0) goto L_0x0089
                boolean r8 = r7.isEmpty()
                if (r2 == 0) goto L_0x006f
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x006f:
                io.reactivex.internal.util.b r10 = r13.f32706i
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x0083
                io.reactivex.internal.util.b r1 = r13.f32706i
                java.lang.Throwable r1 = r1.mo36928a()
                r0.onError(r1)
                return
            L_0x0083:
                if (r8 == 0) goto L_0x0089
                r1.compareAndSet(r5, r9)
                goto L_0x000f
            L_0x0089:
                r8 = 0
            L_0x008a:
                boolean r10 = r13.f32708k
                if (r10 == 0) goto L_0x008f
                return
            L_0x008f:
                java.lang.Object r10 = r1.get()
                if (r5 == r10) goto L_0x0097
            L_0x0095:
                r8 = 1
                goto L_0x00e1
            L_0x0097:
                if (r2 != 0) goto L_0x00ad
                io.reactivex.internal.util.b r10 = r13.f32706i
                java.lang.Object r10 = r10.get()
                java.lang.Throwable r10 = (java.lang.Throwable) r10
                if (r10 == 0) goto L_0x00ad
                io.reactivex.internal.util.b r1 = r13.f32706i
                java.lang.Throwable r1 = r1.mo36928a()
                r0.onError(r1)
                return
            L_0x00ad:
                boolean r10 = r5.f32700i
                java.lang.Object r11 = r7.poll()     // Catch:{ all -> 0x00b4 }
                goto L_0x00d2
            L_0x00b4:
                r8 = move-exception
                p389io.reactivex.exceptions.C12285a.m32748b(r8)
                io.reactivex.internal.util.b r11 = r13.f32706i
                r11.mo36929a(r8)
                r1.compareAndSet(r5, r9)
                if (r2 != 0) goto L_0x00cd
                r13.mo36747a()
                io.reactivex.disposables.Disposable r8 = r13.f32709l
                r8.dispose()
                r13.f32707j = r3
                goto L_0x00d0
            L_0x00cd:
                r5.mo36746a()
            L_0x00d0:
                r11 = r9
                r8 = 1
            L_0x00d2:
                if (r11 != 0) goto L_0x00d6
                r12 = 1
                goto L_0x00d7
            L_0x00d6:
                r12 = 0
            L_0x00d7:
                if (r10 == 0) goto L_0x00df
                if (r12 == 0) goto L_0x00df
                r1.compareAndSet(r5, r9)
                goto L_0x0095
            L_0x00df:
                if (r12 == 0) goto L_0x00e5
            L_0x00e1:
                if (r8 == 0) goto L_0x00e9
                goto L_0x000f
            L_0x00e5:
                r0.onNext(r11)
                goto L_0x008a
            L_0x00e9:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto L_0x000f
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12581g1.C12583b.mo36749b():void");
        }

        public void dispose() {
            if (!this.f32708k) {
                this.f32708k = true;
                this.f32709l.dispose();
                mo36747a();
            }
        }

        public boolean isDisposed() {
            return this.f32708k;
        }

        public void onComplete() {
            if (!this.f32707j) {
                this.f32707j = true;
                mo36749b();
            }
        }

        public void onError(Throwable th) {
            if (this.f32707j || !this.f32706i.mo36929a(th)) {
                C12768a.m33415b(th);
                return;
            }
            if (!this.f32705h) {
                mo36747a();
            }
            this.f32707j = true;
            mo36749b();
        }

        public void onNext(T t) {
            long j = this.f32711n + 1;
            this.f32711n = j;
            C12582a aVar = (C12582a) this.f32710m.get();
            if (aVar != null) {
                aVar.mo36746a();
            }
            try {
                Object apply = this.f32703f.apply(t);
                C12324b.m32836a(apply, "The ObservableSource returned is null");
                ObservableSource observableSource = (ObservableSource) apply;
                C12582a aVar2 = new C12582a(this, j, this.f32704g);
                while (true) {
                    C12582a<Object, Object> aVar3 = (C12582a) this.f32710m.get();
                    if (aVar3 != f32701o) {
                        if (this.f32710m.compareAndSet(aVar3, aVar2)) {
                            observableSource.subscribe(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32709l.dispose();
                onError(th);
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32709l, disposable)) {
                this.f32709l = disposable;
                this.f32702e.onSubscribe(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36748a(C12582a<T, R> aVar, Throwable th) {
            if (aVar.f32697f != this.f32711n || !this.f32706i.mo36929a(th)) {
                C12768a.m33415b(th);
                return;
            }
            if (!this.f32705h) {
                this.f32709l.dispose();
                this.f32707j = true;
            }
            aVar.f32700i = true;
            mo36749b();
        }
    }

    public C12581g1(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i, boolean z) {
        super(observableSource);
        this.f32693f = function;
        this.f32694g = i;
        this.f32695h = z;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        if (!C12541a1.m33073a(this.f32549e, observer, this.f32693f)) {
            this.f32549e.subscribe(new C12583b(observer, this.f32693f, this.f32694g, this.f32695h));
        }
    }
}
