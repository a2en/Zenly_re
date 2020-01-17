package com.bumptech.glide.load.engine;

import androidx.core.util.Pools$Pool;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.p301o.C9209e;
import com.bumptech.glide.p301o.C9216j;
import com.bumptech.glide.request.ResourceCallback;
import com.bumptech.glide.util.pool.C9248b;
import com.bumptech.glide.util.pool.FactoryPools.Poolable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bumptech.glide.load.engine.k */
class C8991k<R> implements C8969b<R>, Poolable {

    /* renamed from: C */
    private static final C8994c f23454C = new C8994c();

    /* renamed from: A */
    private C8967g<R> f23455A;

    /* renamed from: B */
    private volatile boolean f23456B;

    /* renamed from: e */
    final C8996e f23457e;

    /* renamed from: f */
    private final C9248b f23458f;

    /* renamed from: g */
    private final C9001a f23459g;

    /* renamed from: h */
    private final Pools$Pool<C8991k<?>> f23460h;

    /* renamed from: i */
    private final C8994c f23461i;

    /* renamed from: j */
    private final C8997l f23462j;

    /* renamed from: k */
    private final GlideExecutor f23463k;

    /* renamed from: l */
    private final GlideExecutor f23464l;

    /* renamed from: m */
    private final GlideExecutor f23465m;

    /* renamed from: n */
    private final GlideExecutor f23466n;

    /* renamed from: o */
    private final AtomicInteger f23467o;

    /* renamed from: p */
    private Key f23468p;

    /* renamed from: q */
    private boolean f23469q;

    /* renamed from: r */
    private boolean f23470r;

    /* renamed from: s */
    private boolean f23471s;

    /* renamed from: t */
    private boolean f23472t;

    /* renamed from: u */
    private Resource<?> f23473u;

    /* renamed from: v */
    C8882a f23474v;

    /* renamed from: w */
    private boolean f23475w;

    /* renamed from: x */
    GlideException f23476x;

    /* renamed from: y */
    private boolean f23477y;

    /* renamed from: z */
    C9000o<?> f23478z;

    /* renamed from: com.bumptech.glide.load.engine.k$a */
    private class C8992a implements Runnable {

        /* renamed from: e */
        private final ResourceCallback f23479e;

        C8992a(ResourceCallback resourceCallback) {
            this.f23479e = resourceCallback;
        }

        public void run() {
            synchronized (this.f23479e.getLock()) {
                synchronized (C8991k.this) {
                    if (C8991k.this.f23457e.mo24494a(this.f23479e)) {
                        C8991k.this.mo24478a(this.f23479e);
                    }
                    C8991k.this.mo24480b();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$b */
    private class C8993b implements Runnable {

        /* renamed from: e */
        private final ResourceCallback f23481e;

        C8993b(ResourceCallback resourceCallback) {
            this.f23481e = resourceCallback;
        }

        public void run() {
            synchronized (this.f23481e.getLock()) {
                synchronized (C8991k.this) {
                    if (C8991k.this.f23457e.mo24494a(this.f23481e)) {
                        C8991k.this.f23478z.mo24502a();
                        C8991k.this.mo24482b(this.f23481e);
                        C8991k.this.mo24484c(this.f23481e);
                    }
                    C8991k.this.mo24480b();
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$c */
    static class C8994c {
        C8994c() {
        }

        /* renamed from: a */
        public <R> C9000o<R> mo24489a(Resource<R> resource, boolean z, Key key, C9001a aVar) {
            C9000o oVar = new C9000o(resource, z, true, key, aVar);
            return oVar;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$d */
    static final class C8995d {

        /* renamed from: a */
        final ResourceCallback f23483a;

        /* renamed from: b */
        final Executor f23484b;

        C8995d(ResourceCallback resourceCallback, Executor executor) {
            this.f23483a = resourceCallback;
            this.f23484b = executor;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8995d)) {
                return false;
            }
            return this.f23483a.equals(((C8995d) obj).f23483a);
        }

        public int hashCode() {
            return this.f23483a.hashCode();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.k$e */
    static final class C8996e implements Iterable<C8995d> {

        /* renamed from: e */
        private final List<C8995d> f23485e;

        C8996e() {
            this(new ArrayList(2));
        }

        /* renamed from: c */
        private static C8995d m21642c(ResourceCallback resourceCallback) {
            return new C8995d(resourceCallback, C9209e.m22069a());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24493a(ResourceCallback resourceCallback, Executor executor) {
            this.f23485e.add(new C8995d(resourceCallback, executor));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo24495b(ResourceCallback resourceCallback) {
            this.f23485e.remove(m21642c(resourceCallback));
        }

        /* access modifiers changed from: 0000 */
        public void clear() {
            this.f23485e.clear();
        }

        /* access modifiers changed from: 0000 */
        public boolean isEmpty() {
            return this.f23485e.isEmpty();
        }

        public Iterator<C8995d> iterator() {
            return this.f23485e.iterator();
        }

        /* access modifiers changed from: 0000 */
        public int size() {
            return this.f23485e.size();
        }

        C8996e(List<C8995d> list) {
            this.f23485e = list;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo24494a(ResourceCallback resourceCallback) {
            return this.f23485e.contains(m21642c(resourceCallback));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8996e mo24492a() {
            return new C8996e(new ArrayList(this.f23485e));
        }
    }

    C8991k(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, C8997l lVar, C9001a aVar, Pools$Pool<C8991k<?>> pools$Pool) {
        this(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, lVar, aVar, pools$Pool, f23454C);
    }

    /* renamed from: f */
    private GlideExecutor m21625f() {
        if (this.f23470r) {
            return this.f23465m;
        }
        return this.f23471s ? this.f23466n : this.f23464l;
    }

    /* renamed from: g */
    private boolean m21626g() {
        return this.f23477y || this.f23475w || this.f23456B;
    }

    /* renamed from: h */
    private synchronized void m21627h() {
        if (this.f23468p != null) {
            this.f23457e.clear();
            this.f23468p = null;
            this.f23478z = null;
            this.f23473u = null;
            this.f23477y = false;
            this.f23456B = false;
            this.f23475w = false;
            this.f23455A.mo24444a(false);
            this.f23455A = null;
            this.f23476x = null;
            this.f23474v = null;
            this.f23460h.release(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized C8991k<R> mo24475a(Key key, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f23468p = key;
        this.f23469q = z;
        this.f23470r = z2;
        this.f23471s = z3;
        this.f23472t = z4;
        return this;
    }

    /* renamed from: b */
    public synchronized void mo24481b(C8967g<R> gVar) {
        this.f23455A = gVar;
        (gVar.mo24445b() ? this.f23463k : m21625f()).execute(gVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo24484c(ResourceCallback resourceCallback) {
        boolean z;
        this.f23458f.mo24932a();
        this.f23457e.mo24495b(resourceCallback);
        if (this.f23457e.isEmpty()) {
            mo24476a();
            if (!this.f23475w) {
                if (!this.f23477y) {
                    z = false;
                    if (z && this.f23467o.get() == 0) {
                        m21627h();
                    }
                }
            }
            z = true;
            m21627h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r5.f23462j.mo24471a(r5, r0, r2);
        r0 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r0.hasNext() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r1 = (com.bumptech.glide.load.engine.C8991k.C8995d) r0.next();
        r1.f23484b.execute(new com.bumptech.glide.load.engine.C8991k.C8993b(r5, r1.f23483a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        mo24480b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006b, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24485d() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.bumptech.glide.util.pool.b r0 = r5.f23458f     // Catch:{ all -> 0x007c }
            r0.mo24932a()     // Catch:{ all -> 0x007c }
            boolean r0 = r5.f23456B     // Catch:{ all -> 0x007c }
            if (r0 == 0) goto L_0x0014
            com.bumptech.glide.load.engine.Resource<?> r0 = r5.f23473u     // Catch:{ all -> 0x007c }
            r0.recycle()     // Catch:{ all -> 0x007c }
            r5.m21627h()     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            return
        L_0x0014:
            com.bumptech.glide.load.engine.k$e r0 = r5.f23457e     // Catch:{ all -> 0x007c }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x0074
            boolean r0 = r5.f23475w     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x006c
            com.bumptech.glide.load.engine.k$c r0 = r5.f23461i     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.Resource<?> r1 = r5.f23473u     // Catch:{ all -> 0x007c }
            boolean r2 = r5.f23469q     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.Key r3 = r5.f23468p     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o$a r4 = r5.f23459g     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o r0 = r0.mo24489a(r1, r2, r3, r4)     // Catch:{ all -> 0x007c }
            r5.f23478z = r0     // Catch:{ all -> 0x007c }
            r0 = 1
            r5.f23475w = r0     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.k$e r1 = r5.f23457e     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.k$e r1 = r1.mo24492a()     // Catch:{ all -> 0x007c }
            int r2 = r1.size()     // Catch:{ all -> 0x007c }
            int r2 = r2 + r0
            r5.mo24477a(r2)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.Key r0 = r5.f23468p     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.o<?> r2 = r5.f23478z     // Catch:{ all -> 0x007c }
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            com.bumptech.glide.load.engine.l r3 = r5.f23462j
            r3.mo24471a(r5, r0, r2)
            java.util.Iterator r0 = r1.iterator()
        L_0x004f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0068
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.C8991k.C8995d) r1
            java.util.concurrent.Executor r2 = r1.f23484b
            com.bumptech.glide.load.engine.k$b r3 = new com.bumptech.glide.load.engine.k$b
            com.bumptech.glide.request.ResourceCallback r1 = r1.f23483a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x004f
        L_0x0068:
            r5.mo24480b()
            return
        L_0x006c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Already have resource"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007c }
            java.lang.String r1 = "Received a resource without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x007c }
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x007c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C8991k.mo24485d():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo24486e() {
        return this.f23472t;
    }

    public C9248b getVerifier() {
        return this.f23458f;
    }

    public void onLoadFailed(GlideException glideException) {
        synchronized (this) {
            this.f23476x = glideException;
        }
        mo24483c();
    }

    public void onResourceReady(Resource<R> resource, C8882a aVar) {
        synchronized (this) {
            this.f23473u = resource;
            this.f23474v = aVar;
        }
        mo24485d();
    }

    C8991k(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, C8997l lVar, C9001a aVar, Pools$Pool<C8991k<?>> pools$Pool, C8994c cVar) {
        this.f23457e = new C8996e();
        this.f23458f = C9248b.m22265b();
        this.f23467o = new AtomicInteger();
        this.f23463k = glideExecutor;
        this.f23464l = glideExecutor2;
        this.f23465m = glideExecutor3;
        this.f23466n = glideExecutor4;
        this.f23462j = lVar;
        this.f23459g = aVar;
        this.f23460h = pools$Pool;
        this.f23461i = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo24482b(ResourceCallback resourceCallback) {
        try {
            resourceCallback.onResourceReady(this.f23478z, this.f23474v);
        } catch (Throwable th) {
            throw new C8918b(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo24479a(ResourceCallback resourceCallback, Executor executor) {
        this.f23458f.mo24932a();
        this.f23457e.mo24493a(resourceCallback, executor);
        boolean z = true;
        if (this.f23475w) {
            mo24477a(1);
            executor.execute(new C8993b(resourceCallback));
        } else if (this.f23477y) {
            mo24477a(1);
            executor.execute(new C8992a(resourceCallback));
        } else {
            if (this.f23456B) {
                z = false;
            }
            C9216j.m22087a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo24480b() {
        C9000o<?> oVar;
        synchronized (this) {
            this.f23458f.mo24932a();
            C9216j.m22087a(m21626g(), "Not yet complete!");
            int decrementAndGet = this.f23467o.decrementAndGet();
            C9216j.m22087a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                oVar = this.f23478z;
                m21627h();
            } else {
                oVar = null;
            }
        }
        if (oVar != null) {
            oVar.mo24505d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r4.f23462j.mo24471a(r4, r1, null);
        r0 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r0.hasNext() == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        r1 = (com.bumptech.glide.load.engine.C8991k.C8995d) r0.next();
        r1.f23484b.execute(new com.bumptech.glide.load.engine.C8991k.C8992a(r4, r1.f23483a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        mo24480b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24483c() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.util.pool.b r0 = r4.f23458f     // Catch:{ all -> 0x0066 }
            r0.mo24932a()     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.f23456B     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x000f
            r4.m21627h()     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            return
        L_0x000f:
            com.bumptech.glide.load.engine.k$e r0 = r4.f23457e     // Catch:{ all -> 0x0066 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x005e
            boolean r0 = r4.f23477y     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x0056
            r0 = 1
            r4.f23477y = r0     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.Key r1 = r4.f23468p     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r4.f23457e     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.k$e r2 = r2.mo24492a()     // Catch:{ all -> 0x0066 }
            int r3 = r2.size()     // Catch:{ all -> 0x0066 }
            int r3 = r3 + r0
            r4.mo24477a(r3)     // Catch:{ all -> 0x0066 }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            com.bumptech.glide.load.engine.l r0 = r4.f23462j
            r3 = 0
            r0.mo24471a(r4, r1, r3)
            java.util.Iterator r0 = r2.iterator()
        L_0x0039:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0052
            java.lang.Object r1 = r0.next()
            com.bumptech.glide.load.engine.k$d r1 = (com.bumptech.glide.load.engine.C8991k.C8995d) r1
            java.util.concurrent.Executor r2 = r1.f23484b
            com.bumptech.glide.load.engine.k$a r3 = new com.bumptech.glide.load.engine.k$a
            com.bumptech.glide.request.ResourceCallback r1 = r1.f23483a
            r3.<init>(r1)
            r2.execute(r3)
            goto L_0x0039
        L_0x0052:
            r4.mo24480b()
            return
        L_0x0056:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Already failed once"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x005e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Received an exception without any callbacks to notify"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C8991k.mo24483c():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24478a(ResourceCallback resourceCallback) {
        try {
            resourceCallback.onLoadFailed(this.f23476x);
        } catch (Throwable th) {
            throw new C8918b(th);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24476a() {
        if (!m21626g()) {
            this.f23456B = true;
            this.f23455A.mo24443a();
            this.f23462j.mo24470a(this, this.f23468p);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo24477a(int i) {
        C9216j.m22087a(m21626g(), "Not yet complete!");
        if (this.f23467o.getAndAdd(i) == 0 && this.f23478z != null) {
            this.f23478z.mo24502a();
        }
    }

    /* renamed from: a */
    public void mo24448a(C8967g<?> gVar) {
        m21625f().execute(gVar);
    }
}
