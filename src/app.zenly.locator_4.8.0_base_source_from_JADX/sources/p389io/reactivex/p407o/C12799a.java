package p389io.reactivex.p407o;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import p389io.reactivex.FlowableSubscriber;
import p389io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import p389io.reactivex.internal.util.C12760i;
import p389io.reactivex.p393i.p401d.C12456g;

/* renamed from: io.reactivex.o.a */
public final class C12799a<T> implements FlowableSubscriber<T>, Subscription {

    /* renamed from: e */
    final Subscriber<? super T> f33384e;

    /* renamed from: f */
    final boolean f33385f;

    /* renamed from: g */
    Subscription f33386g;

    /* renamed from: h */
    boolean f33387h;

    /* renamed from: i */
    AppendOnlyLinkedArrayList<Object> f33388i;

    /* renamed from: j */
    volatile boolean f33389j;

    public C12799a(Subscriber<? super T> subscriber) {
        this(subscriber, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo36987a() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.f33388i;
                if (appendOnlyLinkedArrayList == null) {
                    this.f33387h = false;
                    return;
                }
                this.f33388i = null;
            }
        } while (!appendOnlyLinkedArrayList.mo36917a(this.f33384e));
    }

    public void cancel() {
        this.f33386g.cancel();
    }

    public void onComplete() {
        if (!this.f33389j) {
            synchronized (this) {
                if (!this.f33389j) {
                    if (this.f33387h) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33388i;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33388i = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.mo36915a(C12760i.m33361a());
                        return;
                    }
                    this.f33389j = true;
                    this.f33387h = true;
                    this.f33384e.onComplete();
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
        r2.f33384e.onError(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(java.lang.Throwable r3) {
        /*
            r2 = this;
            boolean r0 = r2.f33389j
            if (r0 == 0) goto L_0x0008
            p389io.reactivex.p403k.C12768a.m33415b(r3)
            return
        L_0x0008:
            monitor-enter(r2)
            boolean r0 = r2.f33389j     // Catch:{ all -> 0x0044 }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0037
        L_0x000f:
            boolean r0 = r2.f33387h     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0032
            r2.f33389j = r1     // Catch:{ all -> 0x0044 }
            io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.f33388i     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x0021
            io.reactivex.internal.util.AppendOnlyLinkedArrayList r0 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch:{ all -> 0x0044 }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x0044 }
            r2.f33388i = r0     // Catch:{ all -> 0x0044 }
        L_0x0021:
            java.lang.Object r3 = p389io.reactivex.internal.util.C12760i.m33363a(r3)     // Catch:{ all -> 0x0044 }
            boolean r1 = r2.f33385f     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x002d
            r0.mo36915a(r3)     // Catch:{ all -> 0x0044 }
            goto L_0x0030
        L_0x002d:
            r0.mo36918b(r3)     // Catch:{ all -> 0x0044 }
        L_0x0030:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            return
        L_0x0032:
            r2.f33389j = r1     // Catch:{ all -> 0x0044 }
            r2.f33387h = r1     // Catch:{ all -> 0x0044 }
            r1 = 0
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x003e
            p389io.reactivex.p403k.C12768a.m33415b(r3)
            return
        L_0x003e:
            org.reactivestreams.Subscriber<? super T> r0 = r2.f33384e
            r0.onError(r3)
            return
        L_0x0044:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0044 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.p407o.C12799a.onError(java.lang.Throwable):void");
    }

    public void onNext(T t) {
        if (!this.f33389j) {
            if (t == null) {
                this.f33386g.cancel();
                onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
                return;
            }
            synchronized (this) {
                if (!this.f33389j) {
                    if (this.f33387h) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.f33388i;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.f33388i = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.mo36915a(C12760i.m33372e(t));
                        return;
                    }
                    this.f33387h = true;
                    this.f33384e.onNext(t);
                    mo36987a();
                }
            }
        }
    }

    public void onSubscribe(Subscription subscription) {
        if (C12456g.m32970a(this.f33386g, subscription)) {
            this.f33386g = subscription;
            this.f33384e.onSubscribe(this);
        }
    }

    public void request(long j) {
        this.f33386g.request(j);
    }

    public C12799a(Subscriber<? super T> subscriber, boolean z) {
        this.f33384e = subscriber;
        this.f33385f = z;
    }
}
