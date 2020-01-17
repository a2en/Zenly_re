package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.datasource.a */
public abstract class C9561a<T> implements DataSource<T> {

    /* renamed from: a */
    private C9564c f24769a = C9564c.IN_PROGRESS;

    /* renamed from: b */
    private boolean f24770b = false;

    /* renamed from: c */
    private T f24771c = null;

    /* renamed from: d */
    private Throwable f24772d = null;

    /* renamed from: e */
    private float f24773e = 0.0f;

    /* renamed from: f */
    private final ConcurrentLinkedQueue<Pair<DataSubscriber<T>, Executor>> f24774f = new ConcurrentLinkedQueue<>();

    /* renamed from: com.facebook.datasource.a$a */
    class C9562a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ boolean f24775e;

        /* renamed from: f */
        final /* synthetic */ DataSubscriber f24776f;

        /* renamed from: g */
        final /* synthetic */ boolean f24777g;

        C9562a(boolean z, DataSubscriber dataSubscriber, boolean z2) {
            this.f24775e = z;
            this.f24776f = dataSubscriber;
            this.f24777g = z2;
        }

        public void run() {
            if (this.f24775e) {
                this.f24776f.onFailure(C9561a.this);
            } else if (this.f24777g) {
                this.f24776f.onCancellation(C9561a.this);
            } else {
                this.f24776f.onNewResult(C9561a.this);
            }
        }
    }

    /* renamed from: com.facebook.datasource.a$b */
    class C9563b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ DataSubscriber f24779e;

        C9563b(DataSubscriber dataSubscriber) {
            this.f24779e = dataSubscriber;
        }

        public void run() {
            this.f24779e.onProgressUpdate(C9561a.this);
        }
    }

    /* renamed from: com.facebook.datasource.a$c */
    private enum C9564c {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    protected C9561a() {
    }

    /* renamed from: a */
    private void m23406a(DataSubscriber<T> dataSubscriber, Executor executor, boolean z, boolean z2) {
        executor.execute(new C9562a(z, dataSubscriber, z2));
    }

    /* renamed from: b */
    private void m23407b() {
        boolean hasFailed = hasFailed();
        boolean c = m23411c();
        Iterator it = this.f24774f.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            m23406a((DataSubscriber) pair.first, (Executor) pair.second, hasFailed, c);
        }
    }

    /* renamed from: c */
    private synchronized boolean m23411c() {
        return isClosed() && !isFinished();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25766a(T t) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        mo25766a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (isFinished() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        m23407b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f24774f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean close() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f24770b     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r0 = 1
            r3.f24770b = r0     // Catch:{ all -> 0x002a }
            T r1 = r3.f24771c     // Catch:{ all -> 0x002a }
            r2 = 0
            r3.f24771c = r2     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.mo25766a((T) r1)
        L_0x0016:
            boolean r1 = r3.isFinished()
            if (r1 != 0) goto L_0x001f
            r3.m23407b()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.DataSubscriber<T>, java.util.concurrent.Executor>> r1 = r3.f24774f     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C9561a.close():boolean");
    }

    public synchronized Throwable getFailureCause() {
        return this.f24772d;
    }

    public synchronized float getProgress() {
        return this.f24773e;
    }

    public synchronized T getResult() {
        return this.f24771c;
    }

    public synchronized boolean hasFailed() {
        return this.f24769a == C9564c.FAILURE;
    }

    public boolean hasMultipleResults() {
        return false;
    }

    public synchronized boolean hasResult() {
        return this.f24771c != null;
    }

    public synchronized boolean isClosed() {
        return this.f24770b;
    }

    public synchronized boolean isFinished() {
        return this.f24769a != C9564c.IN_PROGRESS;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        m23406a(r3, r4, hasFailed(), m23411c());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void subscribe(com.facebook.datasource.DataSubscriber<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.internal.C9536j.m23271a(r3)
            com.facebook.common.internal.C9536j.m23271a(r4)
            monitor-enter(r2)
            boolean r0 = r2.f24770b     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            com.facebook.datasource.a$c r0 = r2.f24769a     // Catch:{ all -> 0x0041 }
            com.facebook.datasource.a$c r1 = com.facebook.datasource.C9561a.C9564c.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r0 != r1) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.DataSubscriber<T>, java.util.concurrent.Executor>> r0 = r2.f24774f     // Catch:{ all -> 0x0041 }
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r0.add(r1)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.hasResult()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.isFinished()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.m23411c()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.hasFailed()
            boolean r1 = r2.m23411c()
            r2.m23406a(r3, r4, r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C9561a.subscribe(com.facebook.datasource.DataSubscriber, java.util.concurrent.Executor):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25768a(T t, boolean z) {
        boolean b = m23409b(t, z);
        if (b) {
            m23407b();
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25769a(Throwable th) {
        boolean b = m23410b(th);
        if (b) {
            m23407b();
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0027, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0029, code lost:
        mo25766a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0034, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m23409b(T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            boolean r1 = r3.f24770b     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x002d
            com.facebook.datasource.a$c r1 = r3.f24769a     // Catch:{ all -> 0x0039 }
            com.facebook.datasource.a$c r2 = com.facebook.datasource.C9561a.C9564c.IN_PROGRESS     // Catch:{ all -> 0x0039 }
            if (r1 == r2) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            com.facebook.datasource.a$c r5 = com.facebook.datasource.C9561a.C9564c.SUCCESS     // Catch:{ all -> 0x0039 }
            r3.f24769a = r5     // Catch:{ all -> 0x0039 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f24773e = r5     // Catch:{ all -> 0x0039 }
        L_0x0017:
            T r5 = r3.f24771c     // Catch:{ all -> 0x0039 }
            if (r5 == r4) goto L_0x0024
            T r5 = r3.f24771c     // Catch:{ all -> 0x0039 }
            r3.f24771c = r4     // Catch:{ all -> 0x0021 }
            r4 = r5
            goto L_0x0025
        L_0x0021:
            r4 = move-exception
            r0 = r5
            goto L_0x003a
        L_0x0024:
            r4 = r0
        L_0x0025:
            r5 = 1
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002c
            r3.mo25766a((T) r4)
        L_0x002c:
            return r5
        L_0x002d:
            r5 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0034
            r3.mo25766a((T) r4)
        L_0x0034:
            return r5
        L_0x0035:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x003a
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r4 = move-exception
            if (r0 == 0) goto L_0x0042
            r3.mo25766a((T) r0)
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C9561a.m23409b(java.lang.Object, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo25767a(float f) {
        boolean b = m23408b(f);
        if (b) {
            mo25765a();
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25765a() {
        Iterator it = this.f24774f.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new C9563b((DataSubscriber) pair.first));
        }
    }

    /* renamed from: b */
    private synchronized boolean m23410b(Throwable th) {
        if (!this.f24770b) {
            if (this.f24769a == C9564c.IN_PROGRESS) {
                this.f24769a = C9564c.FAILURE;
                this.f24772d = th;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001b, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m23408b(float r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f24770b     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 != 0) goto L_0x001a
            com.facebook.datasource.a$c r0 = r3.f24769a     // Catch:{ all -> 0x001c }
            com.facebook.datasource.a$c r2 = com.facebook.datasource.C9561a.C9564c.IN_PROGRESS     // Catch:{ all -> 0x001c }
            if (r0 == r2) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            float r0 = r3.f24773e     // Catch:{ all -> 0x001c }
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            r3.f24773e = r4     // Catch:{ all -> 0x001c }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.C9561a.m23408b(float):boolean");
    }
}
