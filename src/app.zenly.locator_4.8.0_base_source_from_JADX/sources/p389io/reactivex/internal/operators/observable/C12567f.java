package p389io.reactivex.internal.operators.observable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p389io.reactivex.C12286f;
import p389io.reactivex.C12286f.C12289c;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.exceptions.C12285a;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.disposables.C12459c;
import p389io.reactivex.internal.observers.C12475n;
import p389io.reactivex.internal.util.C12766l;
import p389io.reactivex.observers.C12800a;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p393i.p400c.C12446a;

/* renamed from: io.reactivex.internal.operators.observable.f */
public final class C12567f<T, U extends Collection<? super T>> extends C12538a<T, U> {

    /* renamed from: f */
    final long f32629f;

    /* renamed from: g */
    final long f32630g;

    /* renamed from: h */
    final TimeUnit f32631h;

    /* renamed from: i */
    final C12286f f32632i;

    /* renamed from: j */
    final Callable<U> f32633j;

    /* renamed from: k */
    final int f32634k;

    /* renamed from: l */
    final boolean f32635l;

    /* renamed from: io.reactivex.internal.operators.observable.f$a */
    static final class C12568a<T, U extends Collection<? super T>> extends C12475n<T, U, U> implements Runnable, Disposable {

        /* renamed from: k */
        final Callable<U> f32636k;

        /* renamed from: l */
        final long f32637l;

        /* renamed from: m */
        final TimeUnit f32638m;

        /* renamed from: n */
        final int f32639n;

        /* renamed from: o */
        final boolean f32640o;

        /* renamed from: p */
        final C12289c f32641p;

        /* renamed from: q */
        U f32642q;

        /* renamed from: r */
        Disposable f32643r;

        /* renamed from: s */
        Disposable f32644s;

        /* renamed from: t */
        long f32645t;

        /* renamed from: u */
        long f32646u;

        C12568a(Observer<? super U> observer, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, C12289c cVar) {
            super(observer, new C12446a());
            this.f32636k = callable;
            this.f32637l = j;
            this.f32638m = timeUnit;
            this.f32639n = i;
            this.f32640o = z;
            this.f32641p = cVar;
        }

        /* renamed from: a */
        public void accept(Observer<? super U> observer, U u) {
            observer.onNext(u);
        }

        public void dispose() {
            if (!this.f32349h) {
                this.f32349h = true;
                this.f32644s.dispose();
                this.f32641p.dispose();
                synchronized (this) {
                    this.f32642q = null;
                }
            }
        }

        public boolean isDisposed() {
            return this.f32349h;
        }

        public void onComplete() {
            U u;
            this.f32641p.dispose();
            synchronized (this) {
                u = this.f32642q;
                this.f32642q = null;
            }
            if (u != null) {
                this.f32348g.offer(u);
                this.f32350i = true;
                if (enter()) {
                    C12766l.m33380a(this.f32348g, this.f32347f, false, this, this);
                }
            }
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.f32642q = null;
            }
            this.f32347f.onError(th);
            this.f32641p.dispose();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r7.f32640o == false) goto L_0x0028;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            r7.f32643r.dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
            mo36680b(r0, false, r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r8 = r7.f32636k.call();
            p389io.reactivex.p393i.p394a.C12324b.m32836a(r8, "The buffer supplied is null");
            r8 = (java.util.Collection) r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r7.f32642q = r8;
            r7.f32646u++;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
            if (r7.f32640o == false) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
            r0 = r7.f32641p;
            r4 = r7.f32637l;
            r7.f32643r = r0.mo6575a(r7, r4, r4, r7.f32638m);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
            r8 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0059, code lost:
            p389io.reactivex.exceptions.C12285a.m32748b(r8);
            r7.f32347f.onError(r8);
            dispose();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0064, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r8) {
            /*
                r7 = this;
                monitor-enter(r7)
                U r0 = r7.f32642q     // Catch:{ all -> 0x0065 }
                if (r0 != 0) goto L_0x0007
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                return
            L_0x0007:
                r0.add(r8)     // Catch:{ all -> 0x0065 }
                int r8 = r0.size()     // Catch:{ all -> 0x0065 }
                int r1 = r7.f32639n     // Catch:{ all -> 0x0065 }
                if (r8 >= r1) goto L_0x0014
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                return
            L_0x0014:
                r8 = 0
                r7.f32642q = r8     // Catch:{ all -> 0x0065 }
                long r1 = r7.f32645t     // Catch:{ all -> 0x0065 }
                r3 = 1
                long r1 = r1 + r3
                r7.f32645t = r1     // Catch:{ all -> 0x0065 }
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                boolean r8 = r7.f32640o
                if (r8 == 0) goto L_0x0028
                io.reactivex.disposables.Disposable r8 = r7.f32643r
                r8.dispose()
            L_0x0028:
                r8 = 0
                r7.mo36680b(r0, r8, r7)
                java.util.concurrent.Callable<U> r8 = r7.f32636k     // Catch:{ all -> 0x0058 }
                java.lang.Object r8 = r8.call()     // Catch:{ all -> 0x0058 }
                java.lang.String r0 = "The buffer supplied is null"
                p389io.reactivex.p393i.p394a.C12324b.m32836a(r8, r0)     // Catch:{ all -> 0x0058 }
                java.util.Collection r8 = (java.util.Collection) r8     // Catch:{ all -> 0x0058 }
                monitor-enter(r7)
                r7.f32642q = r8     // Catch:{ all -> 0x0055 }
                long r0 = r7.f32646u     // Catch:{ all -> 0x0055 }
                long r0 = r0 + r3
                r7.f32646u = r0     // Catch:{ all -> 0x0055 }
                monitor-exit(r7)     // Catch:{ all -> 0x0055 }
                boolean r8 = r7.f32640o
                if (r8 == 0) goto L_0x0054
                io.reactivex.f$c r0 = r7.f32641p
                long r4 = r7.f32637l
                java.util.concurrent.TimeUnit r6 = r7.f32638m
                r1 = r7
                r2 = r4
                io.reactivex.disposables.Disposable r8 = r0.mo6575a(r1, r2, r4, r6)
                r7.f32643r = r8
            L_0x0054:
                return
            L_0x0055:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0055 }
                throw r8
            L_0x0058:
                r8 = move-exception
                p389io.reactivex.exceptions.C12285a.m32748b(r8)
                io.reactivex.Observer<? super V> r0 = r7.f32347f
                r0.onError(r8)
                r7.dispose()
                return
            L_0x0065:
                r8 = move-exception
                monitor-exit(r7)     // Catch:{ all -> 0x0065 }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.internal.operators.observable.C12567f.C12568a.onNext(java.lang.Object):void");
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32644s, disposable)) {
                this.f32644s = disposable;
                try {
                    U call = this.f32636k.call();
                    C12324b.m32836a(call, "The buffer supplied is null");
                    this.f32642q = (Collection) call;
                    this.f32347f.onSubscribe(this);
                    C12289c cVar = this.f32641p;
                    long j = this.f32637l;
                    this.f32643r = cVar.mo6575a(this, j, j, this.f32638m);
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    disposable.dispose();
                    C12459c.m32985a(th, this.f32347f);
                    this.f32641p.dispose();
                }
            }
        }

        public void run() {
            try {
                U call = this.f32636k.call();
                C12324b.m32836a(call, "The bufferSupplier returned a null buffer");
                U u = (Collection) call;
                synchronized (this) {
                    U u2 = this.f32642q;
                    if (u2 != null) {
                        if (this.f32645t == this.f32646u) {
                            this.f32642q = u;
                            mo36680b(u2, false, this);
                        }
                    }
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                dispose();
                this.f32347f.onError(th);
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.f$b */
    static final class C12569b<T, U extends Collection<? super T>> extends C12475n<T, U, U> implements Runnable, Disposable {

        /* renamed from: k */
        final Callable<U> f32647k;

        /* renamed from: l */
        final long f32648l;

        /* renamed from: m */
        final TimeUnit f32649m;

        /* renamed from: n */
        final C12286f f32650n;

        /* renamed from: o */
        Disposable f32651o;

        /* renamed from: p */
        U f32652p;

        /* renamed from: q */
        final AtomicReference<Disposable> f32653q = new AtomicReference<>();

        C12569b(Observer<? super U> observer, Callable<U> callable, long j, TimeUnit timeUnit, C12286f fVar) {
            super(observer, new C12446a());
            this.f32647k = callable;
            this.f32648l = j;
            this.f32649m = timeUnit;
            this.f32650n = fVar;
        }

        /* renamed from: a */
        public void accept(Observer<? super U> observer, U u) {
            this.f32347f.onNext(u);
        }

        public void dispose() {
            C12458b.m32975a(this.f32653q);
            this.f32651o.dispose();
        }

        public boolean isDisposed() {
            return this.f32653q.get() == C12458b.DISPOSED;
        }

        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f32652p;
                this.f32652p = null;
            }
            if (u != null) {
                this.f32348g.offer(u);
                this.f32350i = true;
                if (enter()) {
                    C12766l.m33380a(this.f32348g, this.f32347f, false, null, this);
                }
            }
            C12458b.m32975a(this.f32653q);
        }

        public void onError(Throwable th) {
            synchronized (this) {
                this.f32652p = null;
            }
            this.f32347f.onError(th);
            C12458b.m32975a(this.f32653q);
        }

        public void onNext(T t) {
            synchronized (this) {
                U u = this.f32652p;
                if (u != null) {
                    u.add(t);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32651o, disposable)) {
                this.f32651o = disposable;
                try {
                    U call = this.f32647k.call();
                    C12324b.m32836a(call, "The buffer supplied is null");
                    this.f32652p = (Collection) call;
                    this.f32347f.onSubscribe(this);
                    if (!this.f32349h) {
                        C12286f fVar = this.f32650n;
                        long j = this.f32648l;
                        Disposable a = fVar.mo6571a(this, j, j, this.f32649m);
                        if (!this.f32653q.compareAndSet(null, a)) {
                            a.dispose();
                        }
                    }
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    dispose();
                    C12459c.m32985a(th, this.f32347f);
                }
            }
        }

        public void run() {
            U u;
            try {
                U call = this.f32647k.call();
                C12324b.m32836a(call, "The bufferSupplier returned a null buffer");
                U u2 = (Collection) call;
                synchronized (this) {
                    u = this.f32652p;
                    if (u != null) {
                        this.f32652p = u2;
                    }
                }
                if (u == null) {
                    C12458b.m32975a(this.f32653q);
                } else {
                    mo36678a(u, false, this);
                }
            } catch (Throwable th) {
                C12285a.m32748b(th);
                this.f32347f.onError(th);
                dispose();
            }
        }
    }

    /* renamed from: io.reactivex.internal.operators.observable.f$c */
    static final class C12570c<T, U extends Collection<? super T>> extends C12475n<T, U, U> implements Runnable, Disposable {

        /* renamed from: k */
        final Callable<U> f32654k;

        /* renamed from: l */
        final long f32655l;

        /* renamed from: m */
        final long f32656m;

        /* renamed from: n */
        final TimeUnit f32657n;

        /* renamed from: o */
        final C12289c f32658o;

        /* renamed from: p */
        final List<U> f32659p = new LinkedList();

        /* renamed from: q */
        Disposable f32660q;

        /* renamed from: io.reactivex.internal.operators.observable.f$c$a */
        final class C12571a implements Runnable {

            /* renamed from: e */
            private final U f32661e;

            C12571a(U u) {
                this.f32661e = u;
            }

            public void run() {
                synchronized (C12570c.this) {
                    C12570c.this.f32659p.remove(this.f32661e);
                }
                C12570c cVar = C12570c.this;
                cVar.mo36680b(this.f32661e, false, cVar.f32658o);
            }
        }

        /* renamed from: io.reactivex.internal.operators.observable.f$c$b */
        final class C12572b implements Runnable {

            /* renamed from: e */
            private final U f32663e;

            C12572b(U u) {
                this.f32663e = u;
            }

            public void run() {
                synchronized (C12570c.this) {
                    C12570c.this.f32659p.remove(this.f32663e);
                }
                C12570c cVar = C12570c.this;
                cVar.mo36680b(this.f32663e, false, cVar.f32658o);
            }
        }

        C12570c(Observer<? super U> observer, Callable<U> callable, long j, long j2, TimeUnit timeUnit, C12289c cVar) {
            super(observer, new C12446a());
            this.f32654k = callable;
            this.f32655l = j;
            this.f32656m = j2;
            this.f32657n = timeUnit;
            this.f32658o = cVar;
        }

        public void dispose() {
            if (!this.f32349h) {
                this.f32349h = true;
                mo36738a();
                this.f32660q.dispose();
                this.f32658o.dispose();
            }
        }

        public boolean isDisposed() {
            return this.f32349h;
        }

        public void onComplete() {
            ArrayList<Collection> arrayList;
            synchronized (this) {
                arrayList = new ArrayList<>(this.f32659p);
                this.f32659p.clear();
            }
            for (Collection offer : arrayList) {
                this.f32348g.offer(offer);
            }
            this.f32350i = true;
            if (enter()) {
                C12766l.m33380a(this.f32348g, this.f32347f, false, this.f32658o, this);
            }
        }

        public void onError(Throwable th) {
            this.f32350i = true;
            mo36738a();
            this.f32347f.onError(th);
            this.f32658o.dispose();
        }

        public void onNext(T t) {
            synchronized (this) {
                for (U add : this.f32659p) {
                    add.add(t);
                }
            }
        }

        public void onSubscribe(Disposable disposable) {
            if (C12458b.m32974a(this.f32660q, disposable)) {
                this.f32660q = disposable;
                try {
                    Object call = this.f32654k.call();
                    C12324b.m32836a(call, "The buffer supplied is null");
                    Collection collection = (Collection) call;
                    this.f32659p.add(collection);
                    this.f32347f.onSubscribe(this);
                    C12289c cVar = this.f32658o;
                    long j = this.f32656m;
                    cVar.mo6575a(this, j, j, this.f32657n);
                    this.f32658o.mo6576a(new C12572b(collection), this.f32655l, this.f32657n);
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    disposable.dispose();
                    C12459c.m32985a(th, this.f32347f);
                    this.f32658o.dispose();
                }
            }
        }

        public void run() {
            if (!this.f32349h) {
                try {
                    Object call = this.f32654k.call();
                    C12324b.m32836a(call, "The bufferSupplier returned a null buffer");
                    Collection collection = (Collection) call;
                    synchronized (this) {
                        if (!this.f32349h) {
                            this.f32659p.add(collection);
                            this.f32658o.mo6576a(new C12571a(collection), this.f32655l, this.f32657n);
                        }
                    }
                } catch (Throwable th) {
                    C12285a.m32748b(th);
                    this.f32347f.onError(th);
                    dispose();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36738a() {
            synchronized (this) {
                this.f32659p.clear();
            }
        }

        /* renamed from: a */
        public void accept(Observer<? super U> observer, U u) {
            observer.onNext(u);
        }
    }

    public C12567f(ObservableSource<T> observableSource, long j, long j2, TimeUnit timeUnit, C12286f fVar, Callable<U> callable, int i, boolean z) {
        super(observableSource);
        this.f32629f = j;
        this.f32630g = j2;
        this.f32631h = timeUnit;
        this.f32632i = fVar;
        this.f32633j = callable;
        this.f32634k = i;
        this.f32635l = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super U> observer) {
        if (this.f32629f == this.f32630g && this.f32634k == Integer.MAX_VALUE) {
            ObservableSource<T> observableSource = this.f32549e;
            C12569b bVar = new C12569b(new C12800a(observer), this.f32633j, this.f32629f, this.f32631h, this.f32632i);
            observableSource.subscribe(bVar);
            return;
        }
        C12289c a = this.f32632i.mo6573a();
        if (this.f32629f == this.f32630g) {
            ObservableSource<T> observableSource2 = this.f32549e;
            C12568a aVar = new C12568a(new C12800a(observer), this.f32633j, this.f32629f, this.f32631h, this.f32634k, this.f32635l, a);
            observableSource2.subscribe(aVar);
            return;
        }
        ObservableSource<T> observableSource3 = this.f32549e;
        C12570c cVar = new C12570c(new C12800a(observer), this.f32633j, this.f32629f, this.f32630g, this.f32631h, a);
        observableSource3.subscribe(cVar);
    }
}
