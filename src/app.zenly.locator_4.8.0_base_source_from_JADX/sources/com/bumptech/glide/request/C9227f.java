package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator.C9219a;

/* renamed from: com.bumptech.glide.request.f */
public class C9227f implements RequestCoordinator, Request {

    /* renamed from: a */
    private final RequestCoordinator f23979a;

    /* renamed from: b */
    private final Object f23980b;

    /* renamed from: c */
    private volatile Request f23981c;

    /* renamed from: d */
    private volatile Request f23982d;

    /* renamed from: e */
    private C9219a f23983e;

    /* renamed from: f */
    private C9219a f23984f;

    /* renamed from: g */
    private boolean f23985g;

    public C9227f(Object obj, RequestCoordinator requestCoordinator) {
        C9219a aVar = C9219a.CLEARED;
        this.f23983e = aVar;
        this.f23984f = aVar;
        this.f23980b = obj;
        this.f23979a = requestCoordinator;
    }

    /* renamed from: b */
    private boolean m22207b() {
        RequestCoordinator requestCoordinator = this.f23979a;
        return requestCoordinator == null || requestCoordinator.canNotifyCleared(this);
    }

    /* renamed from: c */
    private boolean m22208c() {
        RequestCoordinator requestCoordinator = this.f23979a;
        return requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this);
    }

    /* renamed from: d */
    private boolean m22209d() {
        RequestCoordinator requestCoordinator = this.f23979a;
        return requestCoordinator == null || requestCoordinator.canSetImage(this);
    }

    /* renamed from: e */
    private boolean m22210e() {
        RequestCoordinator requestCoordinator = this.f23979a;
        return requestCoordinator != null && requestCoordinator.isAnyResourceSet();
    }

    /* renamed from: a */
    public void mo24904a(Request request, Request request2) {
        this.f23981c = request;
        this.f23982d = request2;
    }

    public void begin() {
        synchronized (this.f23980b) {
            this.f23985g = true;
            try {
                if (!(this.f23983e == C9219a.SUCCESS || this.f23984f == C9219a.RUNNING)) {
                    this.f23984f = C9219a.RUNNING;
                    this.f23982d.begin();
                }
                if (this.f23985g && this.f23983e != C9219a.RUNNING) {
                    this.f23983e = C9219a.RUNNING;
                    this.f23981c.begin();
                }
            } finally {
                this.f23985g = false;
            }
        }
    }

    public boolean canNotifyCleared(Request request) {
        boolean z;
        synchronized (this.f23980b) {
            z = m22207b() && request.equals(this.f23981c) && this.f23983e != C9219a.PAUSED;
        }
        return z;
    }

    public boolean canNotifyStatusChanged(Request request) {
        boolean z;
        synchronized (this.f23980b) {
            z = m22208c() && request.equals(this.f23981c) && !m22206a();
        }
        return z;
    }

    public boolean canSetImage(Request request) {
        boolean z;
        synchronized (this.f23980b) {
            z = m22209d() && (request.equals(this.f23981c) || this.f23983e != C9219a.SUCCESS);
        }
        return z;
    }

    public void clear() {
        synchronized (this.f23980b) {
            this.f23985g = false;
            this.f23983e = C9219a.CLEARED;
            this.f23984f = C9219a.CLEARED;
            this.f23982d.clear();
            this.f23981c.clear();
        }
    }

    public boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.f23980b) {
            if (!m22210e()) {
                if (!m22206a()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean isCleared() {
        boolean z;
        synchronized (this.f23980b) {
            z = this.f23983e == C9219a.CLEARED;
        }
        return z;
    }

    public boolean isComplete() {
        boolean z;
        synchronized (this.f23980b) {
            z = this.f23983e == C9219a.SUCCESS;
        }
        return z;
    }

    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof C9227f)) {
            return false;
        }
        C9227f fVar = (C9227f) request;
        if (this.f23981c == null) {
            if (fVar.f23981c != null) {
                return false;
            }
        } else if (!this.f23981c.isEquivalentTo(fVar.f23981c)) {
            return false;
        }
        if (this.f23982d == null) {
            if (fVar.f23982d != null) {
                return false;
            }
        } else if (!this.f23982d.isEquivalentTo(fVar.f23982d)) {
            return false;
        }
        return true;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f23980b) {
            z = this.f23983e == C9219a.RUNNING;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestFailed(com.bumptech.glide.request.Request r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f23980b
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.f23981c     // Catch:{ all -> 0x0020 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0020 }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$a r3 = com.bumptech.glide.request.RequestCoordinator.C9219a.FAILED     // Catch:{ all -> 0x0020 }
            r2.f23984f = r3     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$a r3 = com.bumptech.glide.request.RequestCoordinator.C9219a.FAILED     // Catch:{ all -> 0x0020 }
            r2.f23983e = r3     // Catch:{ all -> 0x0020 }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f23979a     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f23979a     // Catch:{ all -> 0x0020 }
            r3.onRequestFailed(r2)     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C9227f.onRequestFailed(com.bumptech.glide.request.Request):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestSuccess(com.bumptech.glide.request.Request r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f23980b
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.f23982d     // Catch:{ all -> 0x002d }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.request.RequestCoordinator$a r3 = com.bumptech.glide.request.RequestCoordinator.C9219a.SUCCESS     // Catch:{ all -> 0x002d }
            r2.f23984f = r3     // Catch:{ all -> 0x002d }
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x0011:
            com.bumptech.glide.request.RequestCoordinator$a r3 = com.bumptech.glide.request.RequestCoordinator.C9219a.SUCCESS     // Catch:{ all -> 0x002d }
            r2.f23983e = r3     // Catch:{ all -> 0x002d }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f23979a     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f23979a     // Catch:{ all -> 0x002d }
            r3.onRequestSuccess(r2)     // Catch:{ all -> 0x002d }
        L_0x001e:
            com.bumptech.glide.request.RequestCoordinator$a r3 = r2.f23984f     // Catch:{ all -> 0x002d }
            boolean r3 = r3.mo24853a()     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002b
            com.bumptech.glide.request.Request r3 = r2.f23982d     // Catch:{ all -> 0x002d }
            r3.clear()     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            return
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C9227f.onRequestSuccess(com.bumptech.glide.request.Request):void");
    }

    public void pause() {
        synchronized (this.f23980b) {
            if (!this.f23984f.mo24853a()) {
                this.f23984f = C9219a.PAUSED;
                this.f23982d.pause();
            }
            if (!this.f23983e.mo24853a()) {
                this.f23983e = C9219a.PAUSED;
                this.f23981c.pause();
            }
        }
    }

    /* renamed from: a */
    private boolean m22206a() {
        boolean z;
        synchronized (this.f23980b) {
            if (this.f23983e != C9219a.SUCCESS) {
                if (this.f23984f != C9219a.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }
}
