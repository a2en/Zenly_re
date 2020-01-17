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
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12449c;

/* renamed from: io.reactivex.internal.operators.observable.h */
public final class C12584h<T, R> extends C12279e<R> {

    /* renamed from: e */
    final ObservableSource<? extends T>[] f32712e;

    /* renamed from: f */
    final Iterable<? extends ObservableSource<? extends T>> f32713f;

    /* renamed from: g */
    final Function<? super Object[], ? extends R> f32714g;

    /* renamed from: h */
    final int f32715h;

    /* renamed from: i */
    final boolean f32716i;

    /* renamed from: io.reactivex.internal.operators.observable.h$a */
    static final class C12585a<T, R> extends AtomicReference<Disposable> implements Observer<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* renamed from: e */
        final C12586b<T, R> f32717e;

        /* renamed from: f */
        final int f32718f;

        C12585a(C12586b<T, R> bVar, int i) {
            this.f32717e = bVar;
            this.f32718f = i;
        }

        /* renamed from: a */
        public void mo36750a() {
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public void onComplete() {
            this.f32717e.mo36752a(this.f32718f);
        }

        public void onError(Throwable th) {
            this.f32717e.mo36754a(this.f32718f, th);
        }

        public void onNext(T t) {
            this.f32717e.mo36753a(this.f32718f, t);
        }

        public void onSubscribe(Disposable disposable) {
            C12458b.m32978c(this, disposable);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.h$b */
    static final class C12586b<T, R> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 8567835998786448817L;

        /* renamed from: e */
        final Observer<? super R> f32719e;

        /* renamed from: f */
        final Function<? super Object[], ? extends R> f32720f;

        /* renamed from: g */
        final C12585a<T, R>[] f32721g;

        /* renamed from: h */
        Object[] f32722h;

        /* renamed from: i */
        final C12449c<Object[]> f32723i;

        /* renamed from: j */
        final boolean f32724j;

        /* renamed from: k */
        volatile boolean f32725k;

        /* renamed from: l */
        volatile boolean f32726l;

        /* renamed from: m */
        final C12752b f32727m = new C12752b();

        /* renamed from: n */
        int f32728n;

        /* renamed from: o */
        int f32729o;

        C12586b(Observer<? super R> observer, Function<? super Object[], ? extends R> function, int i, int i2, boolean z) {
            this.f32719e = observer;
            this.f32720f = function;
            this.f32724j = z;
            this.f32722h = new Object[i];
            C12585a<T, R>[] aVarArr = new C12585a[i];
            for (int i3 = 0; i3 < i; i3++) {
                aVarArr[i3] = new C12585a<>(this, i3);
            }
            this.f32721g = aVarArr;
            this.f32723i = new C12449c<>(i2);
        }

        /* renamed from: a */
        public void mo36756a(ObservableSource<? extends T>[] observableSourceArr) {
            C12585a<T, R>[] aVarArr = this.f32721g;
            int length = aVarArr.length;
            this.f32719e.onSubscribe(this);
            for (int i = 0; i < length && !this.f32726l && !this.f32725k; i++) {
                observableSourceArr[i].subscribe(aVarArr[i]);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36757b() {
            if (getAndIncrement() == 0) {
                C12449c<Object[]> cVar = this.f32723i;
                Observer<? super R> observer = this.f32719e;
                boolean z = this.f32724j;
                int i = 1;
                while (!this.f32725k) {
                    if (z || this.f32727m.get() == null) {
                        boolean z2 = this.f32726l;
                        Object[] objArr = (Object[]) cVar.poll();
                        boolean z3 = objArr == null;
                        if (z2 && z3) {
                            mo36755a(cVar);
                            Throwable a = this.f32727m.mo36928a();
                            if (a == null) {
                                observer.onComplete();
                            } else {
                                observer.onError(a);
                            }
                            return;
                        } else if (z3) {
                            i = addAndGet(-i);
                            if (i == 0) {
                                return;
                            }
                        } else {
                            try {
                                Object apply = this.f32720f.apply(objArr);
                                C12324b.m32836a(apply, "The combiner returned a null value");
                                observer.onNext(apply);
                            } catch (Throwable th) {
                                C12285a.m32748b(th);
                                this.f32727m.mo36929a(th);
                                mo36751a();
                                mo36755a(cVar);
                                observer.onError(this.f32727m.mo36928a());
                                return;
                            }
                        }
                    } else {
                        mo36751a();
                        mo36755a(cVar);
                        observer.onError(this.f32727m.mo36928a());
                        return;
                    }
                }
                mo36755a(cVar);
            }
        }

        public void dispose() {
            if (!this.f32725k) {
                this.f32725k = true;
                mo36751a();
                if (getAndIncrement() == 0) {
                    mo36755a(this.f32723i);
                }
            }
        }

        public boolean isDisposed() {
            return this.f32725k;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36751a() {
            for (C12585a<T, R> a : this.f32721g) {
                a.mo36750a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36755a(C12449c<?> cVar) {
            synchronized (this) {
                this.f32722h = null;
            }
            cVar.clear();
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            if (r4 == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            mo36757b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36753a(int r4, T r5) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f32722h     // Catch:{ all -> 0x0029 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                return
            L_0x0007:
                r1 = r0[r4]     // Catch:{ all -> 0x0029 }
                int r2 = r3.f32728n     // Catch:{ all -> 0x0029 }
                if (r1 != 0) goto L_0x0011
                int r2 = r2 + 1
                r3.f32728n = r2     // Catch:{ all -> 0x0029 }
            L_0x0011:
                r0[r4] = r5     // Catch:{ all -> 0x0029 }
                int r4 = r0.length     // Catch:{ all -> 0x0029 }
                if (r2 != r4) goto L_0x0021
                io.reactivex.i.c.c<java.lang.Object[]> r4 = r3.f32723i     // Catch:{ all -> 0x0029 }
                java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x0029 }
                r4.offer(r5)     // Catch:{ all -> 0x0029 }
                r4 = 1
                goto L_0x0022
            L_0x0021:
                r4 = 0
            L_0x0022:
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                if (r4 == 0) goto L_0x0028
                r3.mo36757b()
            L_0x0028:
                return
            L_0x0029:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0029 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12584h.C12586b.mo36753a(int, java.lang.Object):void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0023, code lost:
            if (r1 == r4.length) goto L_0x0025;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36754a(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                io.reactivex.internal.util.b r0 = r2.f32727m
                boolean r0 = r0.mo36929a(r4)
                if (r0 == 0) goto L_0x0036
                boolean r4 = r2.f32724j
                r0 = 1
                if (r4 == 0) goto L_0x002c
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f32722h     // Catch:{ all -> 0x0029 }
                if (r4 != 0) goto L_0x0014
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                return
            L_0x0014:
                r3 = r4[r3]     // Catch:{ all -> 0x0029 }
                if (r3 != 0) goto L_0x001a
                r3 = 1
                goto L_0x001b
            L_0x001a:
                r3 = 0
            L_0x001b:
                if (r3 != 0) goto L_0x0025
                int r1 = r2.f32729o     // Catch:{ all -> 0x0029 }
                int r1 = r1 + r0
                r2.f32729o = r1     // Catch:{ all -> 0x0029 }
                int r4 = r4.length     // Catch:{ all -> 0x0029 }
                if (r1 != r4) goto L_0x0027
            L_0x0025:
                r2.f32726l = r0     // Catch:{ all -> 0x0029 }
            L_0x0027:
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                goto L_0x002d
            L_0x0029:
                r3 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0029 }
                throw r3
            L_0x002c:
                r3 = 1
            L_0x002d:
                if (r3 == 0) goto L_0x0032
                r2.mo36751a()
            L_0x0032:
                r2.mo36757b()
                goto L_0x0039
            L_0x0036:
                p389io.reactivex.p403k.C12768a.m33415b(r4)
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12584h.C12586b.mo36754a(int, java.lang.Throwable):void");
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r2 == r0.length) goto L_0x0019;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
            if (r4 == false) goto L_0x0021;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
            mo36751a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
            mo36757b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36752a(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f32722h     // Catch:{ all -> 0x0025 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                return
            L_0x0007:
                r4 = r0[r4]     // Catch:{ all -> 0x0025 }
                r1 = 1
                if (r4 != 0) goto L_0x000e
                r4 = 1
                goto L_0x000f
            L_0x000e:
                r4 = 0
            L_0x000f:
                if (r4 != 0) goto L_0x0019
                int r2 = r3.f32729o     // Catch:{ all -> 0x0025 }
                int r2 = r2 + r1
                r3.f32729o = r2     // Catch:{ all -> 0x0025 }
                int r0 = r0.length     // Catch:{ all -> 0x0025 }
                if (r2 != r0) goto L_0x001b
            L_0x0019:
                r3.f32726l = r1     // Catch:{ all -> 0x0025 }
            L_0x001b:
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                if (r4 == 0) goto L_0x0021
                r3.mo36751a()
            L_0x0021:
                r3.mo36757b()
                return
            L_0x0025:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0025 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12584h.C12586b.mo36752a(int):void");
        }
    }

    public C12584h(ObservableSource<? extends T>[] observableSourceArr, Iterable<? extends ObservableSource<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i, boolean z) {
        this.f32712e = observableSourceArr;
        this.f32713f = iterable;
        this.f32714g = function;
        this.f32715h = i;
        this.f32716i = z;
    }

    /* renamed from: a */
    public void mo35836a(Observer<? super R> observer) {
        int i;
        ObservableSource<? extends T>[] observableSourceArr = this.f32712e;
        if (observableSourceArr == null) {
            observableSourceArr = new C12279e[8];
            i = 0;
            for (ObservableSource<? extends T> observableSource : this.f32713f) {
                if (i == observableSourceArr.length) {
                    ObservableSource<? extends T>[] observableSourceArr2 = new ObservableSource[((i >> 2) + i)];
                    System.arraycopy(observableSourceArr, 0, observableSourceArr2, 0, i);
                    observableSourceArr = observableSourceArr2;
                }
                int i2 = i + 1;
                observableSourceArr[i] = observableSource;
                i = i2;
            }
        } else {
            i = observableSourceArr.length;
        }
        int i3 = i;
        if (i3 == 0) {
            C12459c.m32982a(observer);
            return;
        }
        C12586b bVar = new C12586b(observer, this.f32714g, i3, this.f32715h, this.f32716i);
        bVar.mo36756a(observableSourceArr);
    }
}
