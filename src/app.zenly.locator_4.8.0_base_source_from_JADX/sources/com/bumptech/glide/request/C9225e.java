package com.bumptech.glide.request;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.C8856d;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.engine.C8984j;
import com.bumptech.glide.load.engine.C8984j.C8990d;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.p294h.p296e.C9021a;
import com.bumptech.glide.p301o.C9212f;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.TransitionFactory;
import com.bumptech.glide.util.pool.C9248b;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.request.e */
public final class C9225e<R> implements Request, SizeReadyCallback, ResourceCallback {

    /* renamed from: D */
    private static final boolean f23942D = Log.isLoggable("Request", 2);

    /* renamed from: A */
    private int f23943A;

    /* renamed from: B */
    private boolean f23944B;

    /* renamed from: C */
    private RuntimeException f23945C;

    /* renamed from: a */
    private final String f23946a;

    /* renamed from: b */
    private final C9248b f23947b;

    /* renamed from: c */
    private final Object f23948c;

    /* renamed from: d */
    private final RequestListener<R> f23949d;

    /* renamed from: e */
    private final RequestCoordinator f23950e;

    /* renamed from: f */
    private final Context f23951f;

    /* renamed from: g */
    private final C8856d f23952g;

    /* renamed from: h */
    private final Object f23953h;

    /* renamed from: i */
    private final Class<R> f23954i;

    /* renamed from: j */
    private final C9220a<?> f23955j;

    /* renamed from: k */
    private final int f23956k;

    /* renamed from: l */
    private final int f23957l;

    /* renamed from: m */
    private final C8859g f23958m;

    /* renamed from: n */
    private final Target<R> f23959n;

    /* renamed from: o */
    private final List<RequestListener<R>> f23960o;

    /* renamed from: p */
    private final TransitionFactory<? super R> f23961p;

    /* renamed from: q */
    private final Executor f23962q;

    /* renamed from: r */
    private Resource<R> f23963r;

    /* renamed from: s */
    private C8990d f23964s;

    /* renamed from: t */
    private long f23965t;

    /* renamed from: u */
    private volatile C8984j f23966u;

    /* renamed from: v */
    private C9226a f23967v;

    /* renamed from: w */
    private Drawable f23968w;

    /* renamed from: x */
    private Drawable f23969x;

    /* renamed from: y */
    private Drawable f23970y;

    /* renamed from: z */
    private int f23971z;

    /* renamed from: com.bumptech.glide.request.e$a */
    private enum C9226a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private C9225e(Context context, C8856d dVar, Object obj, Object obj2, Class<R> cls, C9220a<?> aVar, int i, int i2, C8859g gVar, Target<R> target, RequestListener<R> requestListener, List<RequestListener<R>> list, RequestCoordinator requestCoordinator, C8984j jVar, TransitionFactory<? super R> transitionFactory, Executor executor) {
        this.f23946a = f23942D ? String.valueOf(super.hashCode()) : null;
        this.f23947b = C9248b.m22265b();
        this.f23948c = obj;
        this.f23951f = context;
        this.f23952g = dVar;
        this.f23953h = obj2;
        this.f23954i = cls;
        this.f23955j = aVar;
        this.f23956k = i;
        this.f23957l = i2;
        this.f23958m = gVar;
        this.f23959n = target;
        this.f23949d = requestListener;
        this.f23960o = list;
        this.f23950e = requestCoordinator;
        this.f23966u = jVar;
        this.f23961p = transitionFactory;
        this.f23962q = executor;
        this.f23967v = C9226a.PENDING;
        if (this.f23945C == null && dVar.mo24133g()) {
            this.f23945C = new RuntimeException("Glide request origin trace");
        }
    }

    /* renamed from: a */
    public static <R> C9225e<R> m22190a(Context context, C8856d dVar, Object obj, Object obj2, Class<R> cls, C9220a<?> aVar, int i, int i2, C8859g gVar, Target<R> target, RequestListener<R> requestListener, List<RequestListener<R>> list, RequestCoordinator requestCoordinator, C8984j jVar, TransitionFactory<? super R> transitionFactory, Executor executor) {
        C9225e eVar = new C9225e(context, dVar, obj, obj2, cls, aVar, i, i2, gVar, target, requestListener, list, requestCoordinator, jVar, transitionFactory, executor);
        return eVar;
    }

    /* renamed from: b */
    private boolean m22195b() {
        RequestCoordinator requestCoordinator = this.f23950e;
        return requestCoordinator == null || requestCoordinator.canNotifyCleared(this);
    }

    /* renamed from: c */
    private boolean m22196c() {
        RequestCoordinator requestCoordinator = this.f23950e;
        return requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this);
    }

    /* renamed from: d */
    private boolean m22197d() {
        RequestCoordinator requestCoordinator = this.f23950e;
        return requestCoordinator == null || requestCoordinator.canSetImage(this);
    }

    /* renamed from: e */
    private void m22198e() {
        m22191a();
        this.f23947b.mo24932a();
        this.f23959n.removeCallback(this);
        C8990d dVar = this.f23964s;
        if (dVar != null) {
            dVar.mo24474a();
            this.f23964s = null;
        }
    }

    /* renamed from: f */
    private Drawable m22199f() {
        if (this.f23968w == null) {
            this.f23968w = this.f23955j.mo24873i();
            if (this.f23968w == null && this.f23955j.mo24871h() > 0) {
                this.f23968w = m22189a(this.f23955j.mo24871h());
            }
        }
        return this.f23968w;
    }

    /* renamed from: g */
    private Drawable m22200g() {
        if (this.f23970y == null) {
            this.f23970y = this.f23955j.mo24874j();
            if (this.f23970y == null && this.f23955j.mo24875k() > 0) {
                this.f23970y = m22189a(this.f23955j.mo24875k());
            }
        }
        return this.f23970y;
    }

    /* renamed from: h */
    private Drawable m22201h() {
        if (this.f23969x == null) {
            this.f23969x = this.f23955j.mo24880p();
            if (this.f23969x == null && this.f23955j.mo24881q() > 0) {
                this.f23969x = m22189a(this.f23955j.mo24881q());
            }
        }
        return this.f23969x;
    }

    /* renamed from: i */
    private boolean m22202i() {
        RequestCoordinator requestCoordinator = this.f23950e;
        return requestCoordinator == null || !requestCoordinator.isAnyResourceSet();
    }

    /* renamed from: j */
    private void m22203j() {
        RequestCoordinator requestCoordinator = this.f23950e;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestFailed(this);
        }
    }

    /* renamed from: k */
    private void m22204k() {
        RequestCoordinator requestCoordinator = this.f23950e;
        if (requestCoordinator != null) {
            requestCoordinator.onRequestSuccess(this);
        }
    }

    /* renamed from: l */
    private void m22205l() {
        if (m22196c()) {
            Drawable drawable = null;
            if (this.f23953h == null) {
                drawable = m22200g();
            }
            if (drawable == null) {
                drawable = m22199f();
            }
            if (drawable == null) {
                drawable = m22201h();
            }
            this.f23959n.onLoadFailed(drawable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void begin() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f23948c
            monitor-enter(r0)
            r4.m22191a()     // Catch:{ all -> 0x00af }
            com.bumptech.glide.util.pool.b r1 = r4.f23947b     // Catch:{ all -> 0x00af }
            r1.mo24932a()     // Catch:{ all -> 0x00af }
            long r1 = com.bumptech.glide.p301o.C9212f.m22072a()     // Catch:{ all -> 0x00af }
            r4.f23965t = r1     // Catch:{ all -> 0x00af }
            java.lang.Object r1 = r4.f23953h     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x003c
            int r1 = r4.f23956k     // Catch:{ all -> 0x00af }
            int r2 = r4.f23957l     // Catch:{ all -> 0x00af }
            boolean r1 = com.bumptech.glide.p301o.C9217k.m22104b(r1, r2)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0027
            int r1 = r4.f23956k     // Catch:{ all -> 0x00af }
            r4.f23971z = r1     // Catch:{ all -> 0x00af }
            int r1 = r4.f23957l     // Catch:{ all -> 0x00af }
            r4.f23943A = r1     // Catch:{ all -> 0x00af }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r4.m22200g()     // Catch:{ all -> 0x00af }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00af }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00af }
            r4.m22192a(r2, r1)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x003c:
            com.bumptech.glide.request.e$a r1 = r4.f23967v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.request.e$a r2 = com.bumptech.glide.request.C9225e.C9226a.RUNNING     // Catch:{ all -> 0x00af }
            if (r1 == r2) goto L_0x00a7
            com.bumptech.glide.request.e$a r1 = r4.f23967v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.request.e$a r2 = com.bumptech.glide.request.C9225e.C9226a.COMPLETE     // Catch:{ all -> 0x00af }
            if (r1 != r2) goto L_0x0051
            com.bumptech.glide.load.engine.Resource<R> r1 = r4.f23963r     // Catch:{ all -> 0x00af }
            com.bumptech.glide.load.a r2 = com.bumptech.glide.load.C8882a.MEMORY_CACHE     // Catch:{ all -> 0x00af }
            r4.onResourceReady(r1, r2)     // Catch:{ all -> 0x00af }
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x0051:
            com.bumptech.glide.request.e$a r1 = com.bumptech.glide.request.C9225e.C9226a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00af }
            r4.f23967v = r1     // Catch:{ all -> 0x00af }
            int r1 = r4.f23956k     // Catch:{ all -> 0x00af }
            int r2 = r4.f23957l     // Catch:{ all -> 0x00af }
            boolean r1 = com.bumptech.glide.p301o.C9217k.m22104b(r1, r2)     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0067
            int r1 = r4.f23956k     // Catch:{ all -> 0x00af }
            int r2 = r4.f23957l     // Catch:{ all -> 0x00af }
            r4.onSizeReady(r1, r2)     // Catch:{ all -> 0x00af }
            goto L_0x006c
        L_0x0067:
            com.bumptech.glide.request.target.Target<R> r1 = r4.f23959n     // Catch:{ all -> 0x00af }
            r1.getSize(r4)     // Catch:{ all -> 0x00af }
        L_0x006c:
            com.bumptech.glide.request.e$a r1 = r4.f23967v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.request.e$a r2 = com.bumptech.glide.request.C9225e.C9226a.RUNNING     // Catch:{ all -> 0x00af }
            if (r1 == r2) goto L_0x0078
            com.bumptech.glide.request.e$a r1 = r4.f23967v     // Catch:{ all -> 0x00af }
            com.bumptech.glide.request.e$a r2 = com.bumptech.glide.request.C9225e.C9226a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00af }
            if (r1 != r2) goto L_0x0087
        L_0x0078:
            boolean r1 = r4.m22196c()     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x0087
            com.bumptech.glide.request.target.Target<R> r1 = r4.f23959n     // Catch:{ all -> 0x00af }
            android.graphics.drawable.Drawable r2 = r4.m22201h()     // Catch:{ all -> 0x00af }
            r1.onLoadStarted(r2)     // Catch:{ all -> 0x00af }
        L_0x0087:
            boolean r1 = f23942D     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00a5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00af }
            r1.<init>()     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00af }
            long r2 = r4.f23965t     // Catch:{ all -> 0x00af }
            double r2 = com.bumptech.glide.p301o.C9212f.m22071a(r2)     // Catch:{ all -> 0x00af }
            r1.append(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00af }
            r4.m22194a(r1)     // Catch:{ all -> 0x00af }
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            return
        L_0x00a7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00af }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00af }
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00af }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C9225e.begin():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r1 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        r4.f23966u.mo24469a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f23948c
            monitor-enter(r0)
            r4.m22191a()     // Catch:{ all -> 0x003d }
            com.bumptech.glide.util.pool.b r1 = r4.f23947b     // Catch:{ all -> 0x003d }
            r1.mo24932a()     // Catch:{ all -> 0x003d }
            com.bumptech.glide.request.e$a r1 = r4.f23967v     // Catch:{ all -> 0x003d }
            com.bumptech.glide.request.e$a r2 = com.bumptech.glide.request.C9225e.C9226a.CLEARED     // Catch:{ all -> 0x003d }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return
        L_0x0013:
            r4.m22198e()     // Catch:{ all -> 0x003d }
            com.bumptech.glide.load.engine.Resource<R> r1 = r4.f23963r     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            com.bumptech.glide.load.engine.Resource<R> r1 = r4.f23963r     // Catch:{ all -> 0x003d }
            r4.f23963r = r2     // Catch:{ all -> 0x003d }
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            boolean r2 = r4.m22195b()     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0030
            com.bumptech.glide.request.target.Target<R> r2 = r4.f23959n     // Catch:{ all -> 0x003d }
            android.graphics.drawable.Drawable r3 = r4.m22201h()     // Catch:{ all -> 0x003d }
            r2.onLoadCleared(r3)     // Catch:{ all -> 0x003d }
        L_0x0030:
            com.bumptech.glide.request.e$a r2 = com.bumptech.glide.request.C9225e.C9226a.CLEARED     // Catch:{ all -> 0x003d }
            r4.f23967v = r2     // Catch:{ all -> 0x003d }
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x003c
            com.bumptech.glide.load.engine.j r0 = r4.f23966u
            r0.mo24469a(r1)
        L_0x003c:
            return
        L_0x003d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C9225e.clear():void");
    }

    public Object getLock() {
        this.f23947b.mo24932a();
        return this.f23948c;
    }

    public boolean isCleared() {
        boolean z;
        synchronized (this.f23948c) {
            z = this.f23967v == C9226a.CLEARED;
        }
        return z;
    }

    public boolean isComplete() {
        boolean z;
        synchronized (this.f23948c) {
            z = this.f23967v == C9226a.COMPLETE;
        }
        return z;
    }

    public boolean isEquivalentTo(Request request) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        C9220a<?> aVar;
        C8859g gVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        C9220a<?> aVar2;
        C8859g gVar2;
        int size2;
        Request request2 = request;
        if (!(request2 instanceof C9225e)) {
            return false;
        }
        synchronized (this.f23948c) {
            i = this.f23956k;
            i2 = this.f23957l;
            obj = this.f23953h;
            cls = this.f23954i;
            aVar = this.f23955j;
            gVar = this.f23958m;
            size = this.f23960o != null ? this.f23960o.size() : 0;
        }
        C9225e eVar = (C9225e) request2;
        synchronized (eVar.f23948c) {
            i3 = eVar.f23956k;
            i4 = eVar.f23957l;
            obj2 = eVar.f23953h;
            cls2 = eVar.f23954i;
            aVar2 = eVar.f23955j;
            gVar2 = eVar.f23958m;
            size2 = eVar.f23960o != null ? eVar.f23960o.size() : 0;
        }
        return i == i3 && i2 == i4 && C9217k.m22101a(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f23948c) {
            if (this.f23967v != C9226a.RUNNING) {
                if (this.f23967v != C9226a.WAITING_FOR_SIZE) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public void onLoadFailed(GlideException glideException) {
        m22192a(glideException, 5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        if (r6 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r5.f23966u.mo24469a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r6 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        r5.f23966u.mo24469a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResourceReady(com.bumptech.glide.load.engine.Resource<?> r6, com.bumptech.glide.load.C8882a r7) {
        /*
            r5 = this;
            com.bumptech.glide.util.pool.b r0 = r5.f23947b
            r0.mo24932a()
            r0 = 0
            java.lang.Object r1 = r5.f23948c     // Catch:{ all -> 0x00bc }
            monitor-enter(r1)     // Catch:{ all -> 0x00bc }
            r5.f23964s = r0     // Catch:{ all -> 0x00b2 }
            if (r6 != 0) goto L_0x002f
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.Class<R> r2 = r5.f23954i     // Catch:{ all -> 0x00b2 }
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r2 = " inside, but instead got null."
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00b2 }
            r6.<init>(r7)     // Catch:{ all -> 0x00b2 }
            r5.onLoadFailed(r6)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            return
        L_0x002f:
            java.lang.Object r2 = r6.get()     // Catch:{ all -> 0x00b2 }
            if (r2 == 0) goto L_0x005c
            java.lang.Class<R> r3 = r5.f23954i     // Catch:{ all -> 0x00b2 }
            java.lang.Class r4 = r2.getClass()     // Catch:{ all -> 0x00b2 }
            boolean r3 = r3.isAssignableFrom(r4)     // Catch:{ all -> 0x00b2 }
            if (r3 != 0) goto L_0x0042
            goto L_0x005c
        L_0x0042:
            boolean r3 = r5.m22197d()     // Catch:{ all -> 0x00b2 }
            if (r3 != 0) goto L_0x0057
            r5.f23963r = r0     // Catch:{ all -> 0x00ba }
            com.bumptech.glide.request.e$a r7 = com.bumptech.glide.request.C9225e.C9226a.COMPLETE     // Catch:{ all -> 0x00ba }
            r5.f23967v = r7     // Catch:{ all -> 0x00ba }
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            if (r6 == 0) goto L_0x0056
            com.bumptech.glide.load.engine.j r7 = r5.f23966u
            r7.mo24469a(r6)
        L_0x0056:
            return
        L_0x0057:
            r5.m22193a(r6, r2, r7)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b2 }
            return
        L_0x005c:
            r5.f23963r = r0     // Catch:{ all -> 0x00ba }
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r0.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "Expected to receive an object of "
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.Class<R> r3 = r5.f23954i     // Catch:{ all -> 0x00ba }
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = " but instead got "
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x007b
            java.lang.Class r3 = r2.getClass()     // Catch:{ all -> 0x00ba }
            goto L_0x007d
        L_0x007b:
            java.lang.String r3 = ""
        L_0x007d:
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "{"
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            r0.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "} inside Resource{"
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            r0.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = "}."
            r0.append(r3)     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x009a
            java.lang.String r2 = ""
            goto L_0x009c
        L_0x009a:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L_0x009c:
            r0.append(r2)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ba }
            r7.<init>(r0)     // Catch:{ all -> 0x00ba }
            r5.onLoadFailed(r7)     // Catch:{ all -> 0x00ba }
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            if (r6 == 0) goto L_0x00b1
            com.bumptech.glide.load.engine.j r7 = r5.f23966u
            r7.mo24469a(r6)
        L_0x00b1:
            return
        L_0x00b2:
            r6 = move-exception
            r7 = r6
            r6 = r0
        L_0x00b5:
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            throw r7     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r7 = move-exception
            r0 = r6
            goto L_0x00bd
        L_0x00ba:
            r7 = move-exception
            goto L_0x00b5
        L_0x00bc:
            r7 = move-exception
        L_0x00bd:
            if (r0 == 0) goto L_0x00c4
            com.bumptech.glide.load.engine.j r6 = r5.f23966u
            r6.mo24469a(r0)
        L_0x00c4:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C9225e.onResourceReady(com.bumptech.glide.load.engine.Resource, com.bumptech.glide.load.a):void");
    }

    public void onSizeReady(int i, int i2) {
        Object obj;
        this.f23947b.mo24932a();
        Object obj2 = this.f23948c;
        synchronized (obj2) {
            try {
                if (f23942D) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got onSizeReady in ");
                    sb.append(C9212f.m22071a(this.f23965t));
                    m22194a(sb.toString());
                }
                if (this.f23967v == C9226a.WAITING_FOR_SIZE) {
                    this.f23967v = C9226a.RUNNING;
                    float u = this.f23955j.mo24885u();
                    this.f23971z = m22188a(i, u);
                    this.f23943A = m22188a(i2, u);
                    if (f23942D) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("finished setup for calling load in ");
                        sb2.append(C9212f.m22071a(this.f23965t));
                        m22194a(sb2.toString());
                    }
                    obj = obj2;
                    try {
                        this.f23964s = this.f23966u.mo24467a(this.f23952g, this.f23953h, this.f23955j.mo24884t(), this.f23971z, this.f23943A, this.f23955j.mo24883s(), this.f23954i, this.f23958m, this.f23955j.mo24870g(), this.f23955j.mo24887w(), this.f23955j.mo24862F(), this.f23955j.mo24859C(), this.f23955j.mo24877m(), this.f23955j.mo24857A(), this.f23955j.mo24889y(), this.f23955j.mo24888x(), this.f23955j.mo24876l(), this, this.f23962q);
                        if (this.f23967v != C9226a.RUNNING) {
                            this.f23964s = null;
                        }
                        if (f23942D) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("finished onSizeReady in ");
                            sb3.append(C9212f.m22071a(this.f23965t));
                            m22194a(sb3.toString());
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                obj = obj2;
                throw th;
            }
        }
    }

    public void pause() {
        synchronized (this.f23948c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* renamed from: a */
    private void m22191a() {
        if (this.f23944B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* renamed from: a */
    private Drawable m22189a(int i) {
        return C9021a.m21681a((Context) this.f23952g, i, this.f23955j.mo24886v() != null ? this.f23955j.mo24886v() : this.f23951f.getTheme());
    }

    /* renamed from: a */
    private static int m22188a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * ((float) i));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ab A[Catch:{ all -> 0x00bc }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m22193a(com.bumptech.glide.load.engine.Resource<R> r11, R r12, com.bumptech.glide.load.C8882a r13) {
        /*
            r10 = this;
            boolean r6 = r10.m22202i()
            com.bumptech.glide.request.e$a r0 = com.bumptech.glide.request.C9225e.C9226a.COMPLETE
            r10.f23967v = r0
            r10.f23963r = r11
            com.bumptech.glide.d r11 = r10.f23952g
            int r11 = r11.mo24131e()
            r0 = 3
            if (r11 > r0) goto L_0x006a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Finished loading "
            r11.append(r0)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f23953h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.f23971z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.f23943A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.f23965t
            double r0 = com.bumptech.glide.p301o.C9212f.m22071a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x006a:
            r11 = 1
            r10.f23944B = r11
            r7 = 0
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r0 = r10.f23960o     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0092
            java.util.List<com.bumptech.glide.request.RequestListener<R>> r0 = r10.f23960o     // Catch:{ all -> 0x00bc }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00bc }
            r9 = 0
        L_0x0079:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.request.RequestListener r0 = (com.bumptech.glide.request.RequestListener) r0     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r10.f23953h     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.request.target.Target<R> r3 = r10.f23959n     // Catch:{ all -> 0x00bc }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            r9 = r9 | r0
            goto L_0x0079
        L_0x0092:
            r9 = 0
        L_0x0093:
            com.bumptech.glide.request.RequestListener<R> r0 = r10.f23949d     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a7
            com.bumptech.glide.request.RequestListener<R> r0 = r10.f23949d     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r10.f23953h     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.request.target.Target<R> r3 = r10.f23959n     // Catch:{ all -> 0x00bc }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.onResourceReady(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r11 = 0
        L_0x00a8:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b6
            com.bumptech.glide.request.transition.TransitionFactory<? super R> r11 = r10.f23961p     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.request.transition.Transition r11 = r11.build(r13, r6)     // Catch:{ all -> 0x00bc }
            com.bumptech.glide.request.target.Target<R> r13 = r10.f23959n     // Catch:{ all -> 0x00bc }
            r13.onResourceReady(r12, r11)     // Catch:{ all -> 0x00bc }
        L_0x00b6:
            r10.f23944B = r7
            r10.m22204k()
            return
        L_0x00bc:
            r11 = move-exception
            r10.f23944B = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C9225e.m22193a(com.bumptech.glide.load.engine.Resource, java.lang.Object, com.bumptech.glide.load.a):void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private void m22192a(GlideException glideException, int i) {
        boolean z;
        this.f23947b.mo24932a();
        synchronized (this.f23948c) {
            glideException.mo24282a((Exception) this.f23945C);
            int e = this.f23952g.mo24131e();
            if (e <= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Load failed for ");
                sb.append(this.f23953h);
                sb.append(" with size [");
                sb.append(this.f23971z);
                sb.append("x");
                sb.append(this.f23943A);
                sb.append("]");
                Log.w("Glide", sb.toString(), glideException);
                if (e <= 4) {
                    glideException.mo24283a("Glide");
                }
            }
            this.f23964s = null;
            this.f23967v = C9226a.FAILED;
            boolean z2 = true;
            this.f23944B = true;
            try {
                if (this.f23960o != null) {
                    z = false;
                    for (RequestListener onLoadFailed : this.f23960o) {
                        z |= onLoadFailed.onLoadFailed(glideException, this.f23953h, this.f23959n, m22202i());
                    }
                } else {
                    z = false;
                }
                if (this.f23949d == null || !this.f23949d.onLoadFailed(glideException, this.f23953h, this.f23959n, m22202i())) {
                    z2 = false;
                }
                if (!z && !z2) {
                    m22205l();
                }
                this.f23944B = false;
                m22203j();
            } catch (Throwable th) {
                this.f23944B = false;
                throw th;
            }
        }
    }

    /* renamed from: a */
    private void m22194a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f23946a);
        Log.v("Request", sb.toString());
    }
}
