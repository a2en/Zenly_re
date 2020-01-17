package p389io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.ResettableConnectable;
import p389io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import p389io.reactivex.internal.util.C12760i;
import p389io.reactivex.p402j.C12767a;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.operators.observable.w0 */
public final class C12689w0<T> extends C12767a<T> implements HasUpstreamObservableSource<T>, ResettableConnectable {

    /* renamed from: i */
    static final C12691b f33057i = new C12699j();

    /* renamed from: e */
    final ObservableSource<T> f33058e;

    /* renamed from: f */
    final AtomicReference<C12696g<T>> f33059f;

    /* renamed from: g */
    final C12691b<T> f33060g;

    /* renamed from: h */
    final ObservableSource<T> f33061h;

    /* renamed from: io.reactivex.internal.operators.observable.w0$a */
    static abstract class C12690a<T> extends AtomicReference<C12693d> implements C12694e<T> {
        private static final long serialVersionUID = 2346567790059478686L;

        /* renamed from: e */
        C12693d f33062e;

        /* renamed from: f */
        int f33063f;

        C12690a() {
            C12693d dVar = new C12693d(null);
            this.f33062e = dVar;
            set(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo36816a(C12693d dVar) {
            this.f33062e.set(dVar);
            this.f33062e = dVar;
            this.f33063f++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public Object mo36819b(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo36820b() {
            C12693d dVar = (C12693d) ((C12693d) get()).get();
            this.f33063f--;
            mo36821b(dVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public Object mo36822c(Object obj) {
            return obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo36823c() {
            C12693d dVar = (C12693d) get();
            if (dVar.f33068e != null) {
                C12693d dVar2 = new C12693d(null);
                dVar2.lazySet(dVar.get());
                set(dVar2);
            }
        }

        public final void complete() {
            Object a = C12760i.m33361a();
            mo36819b(a);
            mo36816a(new C12693d(a));
            mo36826e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public abstract void mo36825d();

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo36826e() {
            mo36823c();
        }

        /* renamed from: a */
        public final void mo36817a(T t) {
            C12760i.m33372e(t);
            mo36819b((Object) t);
            mo36816a(new C12693d(t));
            mo36825d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo36821b(C12693d dVar) {
            set(dVar);
        }

        /* renamed from: a */
        public final void mo36818a(Throwable th) {
            Object a = C12760i.m33363a(th);
            mo36819b(a);
            mo36816a(new C12693d(a));
            mo36826e();
        }

        /* renamed from: a */
        public final void mo36815a(C12692c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                int i = 1;
                do {
                    C12693d dVar = (C12693d) cVar.mo36828a();
                    if (dVar == null) {
                        dVar = mo36814a();
                        cVar.f33066g = dVar;
                    }
                    while (!cVar.isDisposed()) {
                        C12693d dVar2 = (C12693d) dVar.get();
                        if (dVar2 != null) {
                            Object obj = dVar2.f33068e;
                            mo36822c(obj);
                            if (C12760i.m33366a(obj, cVar.f33065f)) {
                                cVar.f33066g = null;
                                return;
                            }
                            dVar = dVar2;
                        } else {
                            cVar.f33066g = dVar;
                            i = cVar.addAndGet(-i);
                        }
                    }
                    cVar.f33066g = null;
                    return;
                } while (i != 0);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C12693d mo36814a() {
            return (C12693d) get();
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$b */
    interface C12691b<T> {
        C12694e<T> call();
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$c */
    static final class C12692c<T> extends AtomicInteger implements Disposable {
        private static final long serialVersionUID = 2728361546769921047L;

        /* renamed from: e */
        final C12696g<T> f33064e;

        /* renamed from: f */
        final Observer<? super T> f33065f;

        /* renamed from: g */
        Object f33066g;

        /* renamed from: h */
        volatile boolean f33067h;

        C12692c(C12696g<T> gVar, Observer<? super T> observer) {
            this.f33064e = gVar;
            this.f33065f = observer;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <U> U mo36828a() {
            return this.f33066g;
        }

        public void dispose() {
            if (!this.f33067h) {
                this.f33067h = true;
                this.f33064e.mo36832b(this);
                this.f33066g = null;
            }
        }

        public boolean isDisposed() {
            return this.f33067h;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$d */
    static final class C12693d extends AtomicReference<C12693d> {
        private static final long serialVersionUID = 245354315435971818L;

        /* renamed from: e */
        final Object f33068e;

        C12693d(Object obj) {
            this.f33068e = obj;
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$e */
    interface C12694e<T> {
        /* renamed from: a */
        void mo36815a(C12692c<T> cVar);

        /* renamed from: a */
        void mo36817a(T t);

        /* renamed from: a */
        void mo36818a(Throwable th);

        void complete();
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$f */
    static final class C12695f<T> implements C12691b<T> {

        /* renamed from: a */
        private final int f33069a;

        C12695f(int i) {
            this.f33069a = i;
        }

        public C12694e<T> call() {
            return new C12698i(this.f33069a);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$g */
    static final class C12696g<T> extends AtomicReference<Disposable> implements Observer<T>, Disposable {

        /* renamed from: i */
        static final C12692c[] f33070i = new C12692c[0];

        /* renamed from: j */
        static final C12692c[] f33071j = new C12692c[0];
        private static final long serialVersionUID = -533785617179540163L;

        /* renamed from: e */
        final C12694e<T> f33072e;

        /* renamed from: f */
        boolean f33073f;

        /* renamed from: g */
        final AtomicReference<C12692c[]> f33074g = new AtomicReference<>(f33070i);

        /* renamed from: h */
        final AtomicBoolean f33075h = new AtomicBoolean();

        C12696g(C12694e<T> eVar) {
            this.f33072e = eVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo36830a(C12692c<T> cVar) {
            C12692c[] cVarArr;
            C12692c[] cVarArr2;
            do {
                cVarArr = (C12692c[]) this.f33074g.get();
                if (cVarArr == f33071j) {
                    return false;
                }
                int length = cVarArr.length;
                cVarArr2 = new C12692c[(length + 1)];
                System.arraycopy(cVarArr, 0, cVarArr2, 0, length);
                cVarArr2[length] = cVar;
            } while (!this.f33074g.compareAndSet(cVarArr, cVarArr2));
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36832b(C12692c<T> cVar) {
            C12692c[] cVarArr;
            C12692c[] cVarArr2;
            do {
                cVarArr = (C12692c[]) this.f33074g.get();
                int length = cVarArr.length;
                if (length != 0) {
                    int i = -1;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        } else if (cVarArr[i2].equals(cVar)) {
                            i = i2;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i >= 0) {
                        if (length == 1) {
                            cVarArr2 = f33070i;
                        } else {
                            C12692c[] cVarArr3 = new C12692c[(length - 1)];
                            System.arraycopy(cVarArr, 0, cVarArr3, 0, i);
                            System.arraycopy(cVarArr, i + 1, cVarArr3, i, (length - i) - 1);
                            cVarArr2 = cVarArr3;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } while (!this.f33074g.compareAndSet(cVarArr, cVarArr2));
        }

        public void dispose() {
            this.f33074g.set(f33071j);
            C12458b.m32975a((AtomicReference<Disposable>) this);
        }

        public boolean isDisposed() {
            return this.f33074g.get() == f33071j;
        }

        public void onComplete() {
            if (!this.f33073f) {
                this.f33073f = true;
                this.f33072e.complete();
                mo36831b();
            }
        }

        public void onError(Throwable th) {
            if (!this.f33073f) {
                this.f33073f = true;
                this.f33072e.mo36818a(th);
                mo36831b();
                return;
            }
            C12768a.m33415b(th);
        }

        public void onNext(T t) {
            if (!this.f33073f) {
                this.f33072e.mo36817a(t);
                mo36829a();
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32978c(this, disposable)) {
                mo36829a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36829a() {
            for (C12692c a : (C12692c[]) this.f33074g.get()) {
                this.f33072e.mo36815a(a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo36831b() {
            for (C12692c a : (C12692c[]) this.f33074g.getAndSet(f33071j)) {
                this.f33072e.mo36815a(a);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$h */
    static final class C12697h<T> implements ObservableSource<T> {

        /* renamed from: e */
        private final AtomicReference<C12696g<T>> f33076e;

        /* renamed from: f */
        private final C12691b<T> f33077f;

        C12697h(AtomicReference<C12696g<T>> atomicReference, C12691b<T> bVar) {
            this.f33076e = atomicReference;
            this.f33077f = bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void subscribe(p389io.reactivex.Observer<? super T> r4) {
            /*
                r3 = this;
            L_0x0000:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.w0$g<T>> r0 = r3.f33076e
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.observable.w0$g r0 = (p389io.reactivex.internal.operators.observable.C12689w0.C12696g) r0
                if (r0 != 0) goto L_0x0020
                io.reactivex.internal.operators.observable.w0$b<T> r0 = r3.f33077f
                io.reactivex.internal.operators.observable.w0$e r0 = r0.call()
                io.reactivex.internal.operators.observable.w0$g r1 = new io.reactivex.internal.operators.observable.w0$g
                r1.<init>(r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.w0$g<T>> r0 = r3.f33076e
                r2 = 0
                boolean r0 = r0.compareAndSet(r2, r1)
                if (r0 != 0) goto L_0x001f
                goto L_0x0000
            L_0x001f:
                r0 = r1
            L_0x0020:
                io.reactivex.internal.operators.observable.w0$c r1 = new io.reactivex.internal.operators.observable.w0$c
                r1.<init>(r0, r4)
                r4.onSubscribe(r1)
                r0.mo36830a(r1)
                boolean r4 = r1.isDisposed()
                if (r4 == 0) goto L_0x0035
                r0.mo36832b(r1)
                return
            L_0x0035:
                io.reactivex.internal.operators.observable.w0$e<T> r4 = r0.f33072e
                r4.mo36815a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12689w0.C12697h.subscribe(io.reactivex.Observer):void");
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$i */
    static final class C12698i<T> extends C12690a<T> {
        private static final long serialVersionUID = -5898283885385201806L;

        /* renamed from: g */
        final int f33078g;

        C12698i(int i) {
            this.f33078g = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo36825d() {
            if (this.f33063f > this.f33078g) {
                mo36820b();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$j */
    static final class C12699j implements C12691b<Object> {
        C12699j() {
        }

        public C12694e<Object> call() {
            return new C12700k(16);
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.w0$k */
    static final class C12700k<T> extends ArrayList<Object> implements C12694e<T> {
        private static final long serialVersionUID = 7063189396499112664L;

        /* renamed from: e */
        volatile int f33079e;

        C12700k(int i) {
            super(i);
        }

        /* renamed from: a */
        public void mo36817a(T t) {
            C12760i.m33372e(t);
            add(t);
            this.f33079e++;
        }

        public void complete() {
            add(C12760i.m33361a());
            this.f33079e++;
        }

        /* renamed from: a */
        public void mo36818a(Throwable th) {
            add(C12760i.m33363a(th));
            this.f33079e++;
        }

        /* renamed from: a */
        public void mo36815a(C12692c<T> cVar) {
            if (cVar.getAndIncrement() == 0) {
                Observer<? super T> observer = cVar.f33065f;
                int i = 1;
                while (!cVar.isDisposed()) {
                    int i2 = this.f33079e;
                    Integer num = (Integer) cVar.mo36828a();
                    int intValue = num != null ? num.intValue() : 0;
                    while (intValue < i2) {
                        if (!C12760i.m33366a(get(intValue), observer) && !cVar.isDisposed()) {
                            intValue++;
                        } else {
                            return;
                        }
                    }
                    cVar.f33066g = Integer.valueOf(intValue);
                    i = cVar.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
            }
        }
    }

    private C12689w0(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<C12696g<T>> atomicReference, C12691b<T> bVar) {
        this.f33061h = observableSource;
        this.f33058e = observableSource2;
        this.f33059f = atomicReference;
        this.f33060g = bVar;
    }

    /* renamed from: a */
    static <T> C12767a<T> m33213a(ObservableSource<T> observableSource, C12691b<T> bVar) {
        AtomicReference atomicReference = new AtomicReference();
        return C12768a.m33402a((C12767a<T>) new C12689w0<T>(new C12697h(atomicReference, bVar), observableSource, atomicReference, bVar));
    }

    /* renamed from: b */
    public static <T> C12767a<T> m33214b(ObservableSource<T> observableSource, int i) {
        if (i == Integer.MAX_VALUE) {
            return m33215i(observableSource);
        }
        return m33213a(observableSource, new C12695f(i));
    }

    /* renamed from: i */
    public static <T> C12767a<T> m33215i(ObservableSource<? extends T> observableSource) {
        return m33213a(observableSource, f33057i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo36790e(p389io.reactivex.functions.Consumer<? super p389io.reactivex.disposables.Disposable> r5) {
        /*
            r4 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.w0$g<T>> r0 = r4.f33059f
            java.lang.Object r0 = r0.get()
            io.reactivex.internal.operators.observable.w0$g r0 = (p389io.reactivex.internal.operators.observable.C12689w0.C12696g) r0
            if (r0 == 0) goto L_0x0010
            boolean r1 = r0.isDisposed()
            if (r1 == 0) goto L_0x0025
        L_0x0010:
            io.reactivex.internal.operators.observable.w0$b<T> r1 = r4.f33060g
            io.reactivex.internal.operators.observable.w0$e r1 = r1.call()
            io.reactivex.internal.operators.observable.w0$g r2 = new io.reactivex.internal.operators.observable.w0$g
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.w0$g<T>> r1 = r4.f33059f
            boolean r0 = r1.compareAndSet(r0, r2)
            if (r0 != 0) goto L_0x0024
            goto L_0x0000
        L_0x0024:
            r0 = r2
        L_0x0025:
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f33075h
            boolean r1 = r1.get()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0039
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.f33075h
            boolean r1 = r1.compareAndSet(r3, r2)
            if (r1 == 0) goto L_0x0039
            r1 = 1
            goto L_0x003a
        L_0x0039:
            r1 = 0
        L_0x003a:
            r5.accept(r0)     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x0044
            io.reactivex.ObservableSource<T> r5 = r4.f33058e
            r5.subscribe(r0)
        L_0x0044:
            return
        L_0x0045:
            r5 = move-exception
            if (r1 == 0) goto L_0x004d
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f33075h
            r0.compareAndSet(r2, r3)
        L_0x004d:
            p389io.reactivex.exceptions.C12285a.m32748b(r5)
            java.lang.RuntimeException r5 = p389io.reactivex.internal.util.C12757g.m33354b(r5)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12689w0.mo36790e(io.reactivex.functions.Consumer):void");
    }

    public void resetIf(Disposable disposable) {
        this.f33059f.compareAndSet((C12696g) disposable, null);
    }

    public ObservableSource<T> source() {
        return this.f33058e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f33061h.subscribe(observer);
    }
}
