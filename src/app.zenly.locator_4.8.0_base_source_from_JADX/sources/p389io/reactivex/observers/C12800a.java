package p389io.reactivex.observers;

import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.disposables.C12458b;
import p389io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import p389io.reactivex.internal.util.C12760i;

/* renamed from: io.reactivex.observers.a */
public final class C12800a<T> implements Observer<T>, Disposable {

    /* renamed from: e */
    final Observer<? super T> f33390e;

    /* renamed from: f */
    final boolean f33391f;

    /* renamed from: g */
    Disposable f33392g;

    /* renamed from: h */
    boolean f33393h;

    /* renamed from: i */
    AppendOnlyLinkedArrayList<Object> f33394i;

    /* renamed from: j */
    volatile boolean f33395j;

    public C12800a(Observer<? super T> observer) {
        this(observer, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36988a() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f33394i;
                if (appendOnlyLinkedArrayList == null) {
                    this.f33393h = false;
                    return;
                }
                this.f33394i = null;
            }
        } while (!appendOnlyLinkedArrayList.mo36916a(this.f33390e));
    }

    public void dispose() {
        this.f33392g.dispose();
    }

    public boolean isDisposed() {
        return this.f33392g.isDisposed();
    }

    public void onComplete() {
        if (!this.f33395j) {
            synchronized (this) {
                if (!this.f33395j) {
                    if (this.f33393h) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33394i;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33394i = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.mo36915a(C12760i.m33361a());
                        return;
                    }
                    this.f33395j = true;
                    this.f33393h = true;
                    this.f33390e.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        p389io.reactivex.p403k.C12768a.m33415b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2.f33390e.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f33395j
            if (r0 == 0) goto L_0x0008
            p389io.reactivex.p403k.C12768a.m33415b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f33395j     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f33393h     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f33395j = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.f33394i     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f33394i = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p389io.reactivex.internal.util.C12760i.m33363a(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f33391f     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo36915a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo36918b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f33395j = r1     // Catch:{ all -> 0x0044 }
            r2.f33393h = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p389io.reactivex.p403k.C12768a.m33415b(r3)
            return
        L_0x003e:
            io.reactivex.Observer<? super T> r0 = r2.f33390e
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.observers.C12800a.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f33395j) {
            if (t == null) {
                this.f33392g.dispose();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f33395j) {
                    if (this.f33393h) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33394i;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33394i = appendOnlyLinkedArrayList;
                        }
                        C12760i.m33372e(t);
                        appendOnlyLinkedArrayList.mo36915a(t);
                        return;
                    }
                    this.f33393h = true;
                    this.f33390e.onNext(t);
                    mo36988a();
                }
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        if (C12458b.m32974a(this.f33392g, disposable)) {
            this.f33392g = disposable;
            this.f33390e.onSubscribe(this);
        }
    }

    public C12800a(Observer<? super T> observer, boolean z) {
        this.f33390e = observer;
        this.f33391f = z;
    }
}
