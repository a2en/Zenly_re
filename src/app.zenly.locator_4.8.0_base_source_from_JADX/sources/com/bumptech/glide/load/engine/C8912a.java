package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.p301o.C9216j;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bumptech.glide.load.engine.a */
final class C8912a {

    /* renamed from: a */
    private final boolean f23233a;

    /* renamed from: b */
    final Map<Key, C8917d> f23234b;

    /* renamed from: c */
    private final ReferenceQueue<C9000o<?>> f23235c;

    /* renamed from: d */
    private C9001a f23236d;

    /* renamed from: e */
    private volatile boolean f23237e;

    /* renamed from: f */
    private volatile C8916c f23238f;

    /* renamed from: com.bumptech.glide.load.engine.a$a */
    class C8913a implements ThreadFactory {

        /* renamed from: com.bumptech.glide.load.engine.a$a$a */
        class C8914a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ Runnable f23239e;

            C8914a(C8913a aVar, Runnable runnable) {
                this.f23239e = runnable;
            }

            public void run() {
                Process.setThreadPriority(10);
                this.f23239e.run();
            }
        }

        C8913a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(new C8914a(this, runnable), "glide-active-resources");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$b */
    class C8915b implements Runnable {
        C8915b() {
        }

        public void run() {
            C8912a.this.mo24298a();
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a$c */
    interface C8916c {
        /* renamed from: a */
        void mo24307a();
    }

    /* renamed from: com.bumptech.glide.load.engine.a$d */
    static final class C8917d extends WeakReference<C9000o<?>> {

        /* renamed from: a */
        final Key f23241a;

        /* renamed from: b */
        final boolean f23242b;

        /* renamed from: c */
        Resource<?> f23243c;

        C8917d(Key key, C9000o<?> oVar, ReferenceQueue<? super C9000o<?>> referenceQueue, boolean z) {
            Resource<?> resource;
            super(oVar, referenceQueue);
            C9216j.m22083a(key);
            this.f23241a = key;
            if (!oVar.mo24504c() || !z) {
                resource = null;
            } else {
                Resource<?> b = oVar.mo24503b();
                C9216j.m22083a(b);
                resource = b;
            }
            this.f23243c = resource;
            this.f23242b = oVar.mo24504c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24308a() {
            this.f23243c = null;
            clear();
        }
    }

    C8912a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new C8913a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24302a(C9001a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f23236d = aVar;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.bumptech.glide.load.engine.C9000o<?> mo24303b(com.bumptech.glide.load.Key r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map<com.bumptech.glide.load.Key, com.bumptech.glide.load.engine.a$d> r0 = r1.f23234b     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.a$d r2 = (com.bumptech.glide.load.engine.C8912a.C8917d) r2     // Catch:{ all -> 0x001b }
            if (r2 != 0) goto L_0x000e
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x000e:
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            com.bumptech.glide.load.engine.o r0 = (com.bumptech.glide.load.engine.C9000o) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0019
            r1.mo24301a(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r1)
            return r0
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.C8912a.mo24303b(com.bumptech.glide.load.Key):com.bumptech.glide.load.engine.o");
    }

    C8912a(boolean z, Executor executor) {
        this.f23234b = new HashMap();
        this.f23235c = new ReferenceQueue<>();
        this.f23233a = z;
        executor.execute(new C8915b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo24300a(Key key, C9000o<?> oVar) {
        C8917d dVar = (C8917d) this.f23234b.put(key, new C8917d(key, oVar, this.f23235c, this.f23233a));
        if (dVar != null) {
            dVar.mo24308a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo24299a(Key key) {
        C8917d dVar = (C8917d) this.f23234b.remove(key);
        if (dVar != null) {
            dVar.mo24308a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24301a(C8917d dVar) {
        synchronized (this) {
            this.f23234b.remove(dVar.f23241a);
            if (dVar.f23242b) {
                if (dVar.f23243c != null) {
                    C9000o oVar = new C9000o(dVar.f23243c, true, false, dVar.f23241a, this.f23236d);
                    this.f23236d.mo24468a(dVar.f23241a, oVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo24298a() {
        while (!this.f23237e) {
            try {
                mo24301a((C8917d) this.f23235c.remove());
                C8916c cVar = this.f23238f;
                if (cVar != null) {
                    cVar.mo24307a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
