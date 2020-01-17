package p389io.reactivex.p404l;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import p389io.reactivex.internal.util.C12760i;

/* renamed from: io.reactivex.l.b */
final class C12770b<T> extends C12769a<T> {

    /* renamed from: f */
    final C12769a<T> f33304f;

    /* renamed from: g */
    boolean f33305g;

    /* renamed from: h */
    AppendOnlyLinkedArrayList<Object> f33306h;

    /* renamed from: i */
    volatile boolean f33307i;

    C12770b(C12769a<T> aVar) {
        this.f33304f = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo36365a(Subscriber<? super T> subscriber) {
        this.f33304f.subscribe(subscriber);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo36949j() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f33306h;
                if (appendOnlyLinkedArrayList == null) {
                    this.f33305g = false;
                    return;
                }
                this.f33306h = null;
            }
            appendOnlyLinkedArrayList.mo36917a((Subscriber<? super U>) this.f33304f);
        }
        while (true) {
        }
    }

    public void onComplete() {
        if (!this.f33307i) {
            synchronized (this) {
                if (!this.f33307i) {
                    this.f33307i = true;
                    if (this.f33305g) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33306h;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33306h = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.mo36915a(C12760i.m33361a());
                        return;
                    }
                    this.f33305g = true;
                    this.f33304f.onComplete();
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
        r2.f33304f.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f33307i
            if (r0 == 0) goto L_0x0008
            p389io.reactivex.p403k.C12768a.m33415b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f33307i     // Catch:{ all -> 0x003b }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x002e
        L_0x0010:
            r2.f33307i = r1     // Catch:{ all -> 0x003b }
            boolean r0 = r2.f33305g     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x002b
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.f33306h     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0022
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x003b }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.f33306h = r0     // Catch:{ all -> 0x003b }
        L_0x0022:
            java.lang.Object r3 = p389io.reactivex.internal.util.C12760i.m33363a(r3)     // Catch:{ all -> 0x003b }
            r0.mo36918b(r3)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            r0 = 0
            r2.f33305g = r1     // Catch:{ all -> 0x003b }
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0035
            p389io.reactivex.p403k.C12768a.m33415b(r3)
            return
        L_0x0035:
            io.reactivex.l.a<T> r0 = r2.f33304f
            r0.onError(r3)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p404l.C12770b.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f33307i) {
            synchronized (this) {
                if (!this.f33307i) {
                    if (this.f33305g) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33306h;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33306h = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.mo36915a(C12760i.m33372e(t));
                        return;
                    }
                    this.f33305g = true;
                    this.f33304f.onNext(t);
                    mo36949j();
                }
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        boolean z = true;
        if (!this.f33307i) {
            synchronized (this) {
                if (!this.f33307i) {
                    if (this.f33305g) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33306h;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33306h = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.mo36915a(C12760i.m33364a(subscription));
                        return;
                    }
                    this.f33305g = true;
                    z = false;
                }
            }
        }
        if (z) {
            subscription.cancel();
        } else {
            this.f33304f.onSubscribe(subscription);
            mo36949j();
        }
    }
}
