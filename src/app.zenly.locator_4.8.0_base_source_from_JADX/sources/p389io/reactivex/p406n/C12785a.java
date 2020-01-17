package p389io.reactivex.p406n;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import p389io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import p389io.reactivex.internal.util.C12757g;
import p389io.reactivex.internal.util.C12760i;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.n.a */
public final class C12785a<T> extends C12798f<T> {

    /* renamed from: l */
    static final C12786a[] f33333l = new C12786a[0];

    /* renamed from: m */
    static final C12786a[] f33334m = new C12786a[0];

    /* renamed from: e */
    final AtomicReference<Object> f33335e;

    /* renamed from: f */
    final AtomicReference<C12786a<T>[]> f33336f;

    /* renamed from: g */
    final ReadWriteLock f33337g;

    /* renamed from: h */
    final Lock f33338h;

    /* renamed from: i */
    final Lock f33339i;

    /* renamed from: j */
    final AtomicReference<Throwable> f33340j;

    /* renamed from: k */
    long f33341k;

    /* renamed from: io.reactivex.n.a$a */
    static final class C12786a<T> implements Disposable, NonThrowingPredicate<Object> {

        /* renamed from: e */
        final Observer<? super T> f33342e;

        /* renamed from: f */
        final C12785a<T> f33343f;

        /* renamed from: g */
        boolean f33344g;

        /* renamed from: h */
        boolean f33345h;

        /* renamed from: i */
        AppendOnlyLinkedArrayList<Object> f33346i;

        /* renamed from: j */
        boolean f33347j;

        /* renamed from: k */
        volatile boolean f33348k;

        /* renamed from: l */
        long f33349l;

        C12786a(Observer<? super T> observer, C12785a<T> aVar) {
            this.f33342e = observer;
            this.f33343f = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
            if (r0 == null) goto L_0x003d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
            if (test(r0) == false) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
            mo36967b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36965a() {
            /*
                r4 = this;
                boolean r0 = r4.f33348k
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r4)
                boolean r0 = r4.f33348k     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x000c
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x000c:
                boolean r0 = r4.f33344g     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x0012
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                return
            L_0x0012:
                io.reactivex.n.a<T> r0 = r4.f33343f     // Catch:{ all -> 0x003e }
                java.util.concurrent.locks.Lock r1 = r0.f33338h     // Catch:{ all -> 0x003e }
                r1.lock()     // Catch:{ all -> 0x003e }
                long r2 = r0.f33341k     // Catch:{ all -> 0x003e }
                r4.f33349l = r2     // Catch:{ all -> 0x003e }
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.f33335e     // Catch:{ all -> 0x003e }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x003e }
                r1.unlock()     // Catch:{ all -> 0x003e }
                r1 = 1
                if (r0 == 0) goto L_0x002b
                r2 = 1
                goto L_0x002c
            L_0x002b:
                r2 = 0
            L_0x002c:
                r4.f33345h = r2     // Catch:{ all -> 0x003e }
                r4.f33344g = r1     // Catch:{ all -> 0x003e }
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                if (r0 == 0) goto L_0x003d
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L_0x003a
                return
            L_0x003a:
                r4.mo36967b()
            L_0x003d:
                return
            L_0x003e:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x003e }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p406n.C12785a.C12786a.mo36965a():void");
        }

        /* JADX INFO: used method not loaded: io.reactivex.internal.util.AppendOnlyLinkedArrayList.a(io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate):null, types can be incorrect */
        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            r0.mo36914a((p389io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate) r2);
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36967b() {
            /*
                r2 = this;
            L_0x0000:
                boolean r0 = r2.f33348k
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                monitor-enter(r2)
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.f33346i     // Catch:{ all -> 0x0017 }
                if (r0 != 0) goto L_0x000f
                r0 = 0
                r2.f33345h = r0     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                return
            L_0x000f:
                r1 = 0
                r2.f33346i = r1     // Catch:{ all -> 0x0017 }
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                r0.mo36914a(r2)
                goto L_0x0000
            L_0x0017:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0017 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p406n.C12785a.C12786a.mo36967b():void");
        }

        public void dispose() {
            if (!this.f33348k) {
                this.f33348k = true;
                this.f33343f.mo36960b(this);
            }
        }

        public boolean isDisposed() {
            return this.f33348k;
        }

        public boolean test(Object obj) {
            return this.f33348k || C12760i.m33366a(obj, this.f33342e);
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0031, code lost:
            r3.f33347j = true;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo36966a(java.lang.Object r4, long r5) {
            /*
                r3 = this;
                boolean r0 = r3.f33348k
                if (r0 == 0) goto L_0x0005
                return
            L_0x0005:
                boolean r0 = r3.f33347j
                if (r0 != 0) goto L_0x0037
                monitor-enter(r3)
                boolean r0 = r3.f33348k     // Catch:{ all -> 0x0034 }
                if (r0 == 0) goto L_0x0010
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0010:
                long r0 = r3.f33349l     // Catch:{ all -> 0x0034 }
                int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r2 != 0) goto L_0x0018
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x0018:
                boolean r5 = r3.f33345h     // Catch:{ all -> 0x0034 }
                if (r5 == 0) goto L_0x002d
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r5 = r3.f33346i     // Catch:{ all -> 0x0034 }
                if (r5 != 0) goto L_0x0028
                io.reactivex.internal.util.AppendOnlyLinkedArrayList r5 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x0034 }
                r6 = 4
                r5.<init>(r6)     // Catch:{ all -> 0x0034 }
                r3.f33346i = r5     // Catch:{ all -> 0x0034 }
            L_0x0028:
                r5.mo36915a(r4)     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                return
            L_0x002d:
                r5 = 1
                r3.f33344g = r5     // Catch:{ all -> 0x0034 }
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                r3.f33347j = r5
                goto L_0x0037
            L_0x0034:
                r4 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0034 }
                throw r4
            L_0x0037:
                r3.test(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p406n.C12785a.C12786a.mo36966a(java.lang.Object, long):void");
        }
    }

    C12785a() {
        this.f33337g = new ReentrantReadWriteLock();
        this.f33338h = this.f33337g.readLock();
        this.f33339i = this.f33337g.writeLock();
        this.f33336f = new AtomicReference<>(f33333l);
        this.f33335e = new AtomicReference<>();
        this.f33340j = new AtomicReference<>();
    }

    /* renamed from: h */
    public static <T> C12785a<T> m33446h(T t) {
        return new C12785a<>(t);
    }

    /* renamed from: u */
    public static <T> C12785a<T> m33447u() {
        return new C12785a<>();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        C12786a aVar = new C12786a(observer, this);
        observer.onSubscribe(aVar);
        if (!mo36959a(aVar)) {
            Throwable th = (Throwable) this.f33340j.get();
            if (th == C12757g.f33270a) {
                observer.onComplete();
            } else {
                observer.onError(th);
            }
        } else if (aVar.f33348k) {
            mo36960b(aVar);
        } else {
            aVar.mo36965a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo36960b(C12786a<T> aVar) {
        C12786a<T>[] aVarArr;
        C12786a[] aVarArr2;
        do {
            aVarArr = (C12786a[]) this.f33336f.get();
            int length = aVarArr.length;
            if (length != 0) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (aVarArr[i2] == aVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        aVarArr2 = f33333l;
                    } else {
                        C12786a[] aVarArr3 = new C12786a[(length - 1)];
                        System.arraycopy(aVarArr, 0, aVarArr3, 0, i);
                        System.arraycopy(aVarArr, i + 1, aVarArr3, i, (length - i) - 1);
                        aVarArr2 = aVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f33336f.compareAndSet(aVarArr, aVarArr2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo36961f(Object obj) {
        this.f33339i.lock();
        this.f33341k++;
        this.f33335e.lazySet(obj);
        this.f33339i.unlock();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public C12786a<T>[] mo36962g(Object obj) {
        C12786a<T>[] aVarArr = (C12786a[]) this.f33336f.getAndSet(f33334m);
        if (aVarArr != f33334m) {
            mo36961f(obj);
        }
        return aVarArr;
    }

    public void onComplete() {
        if (this.f33340j.compareAndSet(null, C12757g.f33270a)) {
            Object a = C12760i.m33361a();
            for (C12786a a2 : mo36962g(a)) {
                a2.mo36966a(a, this.f33341k);
            }
        }
    }

    public void onError(Throwable th) {
        C12324b.m32836a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f33340j.compareAndSet(null, th)) {
            C12768a.m33415b(th);
            return;
        }
        Object a = C12760i.m33363a(th);
        for (C12786a a2 : mo36962g(a)) {
            a2.mo36966a(a, this.f33341k);
        }
    }

    public void onNext(T t) {
        C12324b.m32836a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f33340j.get() == null) {
            C12760i.m33372e(t);
            mo36961f(t);
            for (C12786a a : (C12786a[]) this.f33336f.get()) {
                a.mo36966a(t, this.f33341k);
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (this.f33340j.get() != null) {
            disposable.dispose();
        }
    }

    /* renamed from: s */
    public T mo36963s() {
        T t = this.f33335e.get();
        if (C12760i.m33370c(t) || C12760i.m33371d(t)) {
            return null;
        }
        C12760i.m33368b(t);
        return t;
    }

    /* renamed from: t */
    public boolean mo36964t() {
        Object obj = this.f33335e.get();
        return obj != null && !C12760i.m33370c(obj) && !C12760i.m33371d(obj);
    }

    C12785a(T t) {
        this();
        AtomicReference<Object> atomicReference = this.f33335e;
        C12324b.m32836a(t, "defaultValue is null");
        atomicReference.lazySet(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36959a(C12786a<T> aVar) {
        C12786a[] aVarArr;
        C12786a[] aVarArr2;
        do {
            aVarArr = (C12786a[]) this.f33336f.get();
            if (aVarArr == f33334m) {
                return false;
            }
            int length = aVarArr.length;
            aVarArr2 = new C12786a[(length + 1)];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, length);
            aVarArr2[length] = aVar;
        } while (!this.f33336f.compareAndSet(aVarArr, aVarArr2));
        return true;
    }
}
