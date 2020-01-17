package p389io.reactivex.p406n;

import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import p389io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate;
import p389io.reactivex.internal.util.C12760i;

/* renamed from: io.reactivex.n.e */
final class C12797e<T> extends C12798f<T> implements NonThrowingPredicate<Object> {

    /* renamed from: e */
    final C12798f<T> f33380e;

    /* renamed from: f */
    boolean f33381f;

    /* renamed from: g */
    AppendOnlyLinkedArrayList<Object> f33382g;

    /* renamed from: h */
    volatile boolean f33383h;

    C12797e(C12798f<T> fVar) {
        this.f33380e = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super T> observer) {
        this.f33380e.subscribe(observer);
    }

    public void onComplete() {
        if (!this.f33383h) {
            synchronized (this) {
                if (!this.f33383h) {
                    this.f33383h = true;
                    if (this.f33381f) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33382g;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33382g = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.mo36915a(C12760i.m33361a());
                        return;
                    }
                    this.f33381f = true;
                    this.f33380e.onComplete();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        if (r0 == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        p389io.reactivex.p403k.C12768a.m33415b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0035, code lost:
        r2.f33380e.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f33383h
            if (r0 == 0) goto L_0x0008
            p389io.reactivex.p403k.C12768a.m33415b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f33383h     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f33383h = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f33381f     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.f33382g     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f33382g = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p389io.reactivex.internal.util.C12760i.m33363a(r3)     // Catch:{ all -> 0x003b }
            r0.mo36918b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f33381f = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p389io.reactivex.p403k.C12768a.m33415b(r3)
            return
        L_0x0035:
            io.reactivex.n.f<T> r0 = r2.f33380e
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p406n.C12797e.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f33383h) {
            synchronized (this) {
                if (!this.f33383h) {
                    if (this.f33381f) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33382g;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33382g = appendOnlyLinkedArrayList;
                        }
                        C12760i.m33372e(t);
                        appendOnlyLinkedArrayList.mo36915a(t);
                        return;
                    }
                    this.f33381f = true;
                    this.f33380e.onNext(t);
                    mo36985s();
                }
            }
        }
    }

    public void onSubscribe(Disposable disposable) {
        boolean z = true;
        if (!this.f33383h) {
            synchronized (this) {
                if (!this.f33383h) {
                    if (this.f33381f) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33382g;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33382g = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.mo36915a(C12760i.m33362a(disposable));
                        return;
                    }
                    this.f33381f = true;
                    z = false;
                }
            }
        }
        if (z) {
            disposable.dispose();
        } else {
            this.f33380e.onSubscribe(disposable);
            mo36985s();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo36985s() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f33382g;
                if (appendOnlyLinkedArrayList == null) {
                    this.f33381f = false;
                    return;
                }
                this.f33382g = null;
            }
            appendOnlyLinkedArrayList.mo36914a((NonThrowingPredicate<? super T>) this);
        }
        while (true) {
        }
    }

    public boolean test(Object obj) {
        return C12760i.m33369b(obj, this.f33380e);
    }
}
