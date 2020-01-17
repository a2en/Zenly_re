package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator.C9219a;

/* renamed from: com.bumptech.glide.request.b */
public final class C9221b implements RequestCoordinator, Request {

    /* renamed from: a */
    private final Object f23923a;

    /* renamed from: b */
    private final RequestCoordinator f23924b;

    /* renamed from: c */
    private volatile Request f23925c;

    /* renamed from: d */
    private volatile Request f23926d;

    /* renamed from: e */
    private C9219a f23927e;

    /* renamed from: f */
    private C9219a f23928f;

    public C9221b(Object obj, RequestCoordinator requestCoordinator) {
        C9219a aVar = C9219a.CLEARED;
        this.f23927e = aVar;
        this.f23928f = aVar;
        this.f23923a = obj;
        this.f23924b = requestCoordinator;
    }

    /* renamed from: b */
    private boolean m22176b() {
        RequestCoordinator requestCoordinator = this.f23924b;
        return requestCoordinator == null || requestCoordinator.canNotifyStatusChanged(this);
    }

    /* renamed from: c */
    private boolean m22177c() {
        RequestCoordinator requestCoordinator = this.f23924b;
        return requestCoordinator == null || requestCoordinator.canSetImage(this);
    }

    /* renamed from: d */
    private boolean m22178d() {
        RequestCoordinator requestCoordinator = this.f23924b;
        return requestCoordinator != null && requestCoordinator.isAnyResourceSet();
    }

    /* renamed from: a */
    public void mo24891a(Request request, Request request2) {
        this.f23925c = request;
        this.f23926d = request2;
    }

    public void begin() {
        synchronized (this.f23923a) {
            if (this.f23927e != C9219a.RUNNING) {
                this.f23927e = C9219a.RUNNING;
                this.f23925c.begin();
            }
        }
    }

    public boolean canNotifyCleared(Request request) {
        boolean z;
        synchronized (this.f23923a) {
            z = m22174a() && m22175a(request);
        }
        return z;
    }

    public boolean canNotifyStatusChanged(Request request) {
        boolean z;
        synchronized (this.f23923a) {
            z = m22176b() && m22175a(request);
        }
        return z;
    }

    public boolean canSetImage(Request request) {
        boolean z;
        synchronized (this.f23923a) {
            z = m22177c() && m22175a(request);
        }
        return z;
    }

    public void clear() {
        synchronized (this.f23923a) {
            this.f23927e = C9219a.CLEARED;
            this.f23925c.clear();
            if (this.f23928f != C9219a.CLEARED) {
                this.f23928f = C9219a.CLEARED;
                this.f23926d.clear();
            }
        }
    }

    public boolean isAnyResourceSet() {
        boolean z;
        synchronized (this.f23923a) {
            if (!m22178d()) {
                if (!isComplete()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean isCleared() {
        boolean z;
        synchronized (this.f23923a) {
            z = this.f23927e == C9219a.CLEARED && this.f23928f == C9219a.CLEARED;
        }
        return z;
    }

    public boolean isComplete() {
        boolean z;
        synchronized (this.f23923a) {
            if (this.f23927e != C9219a.SUCCESS) {
                if (this.f23928f != C9219a.SUCCESS) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    public boolean isEquivalentTo(Request request) {
        if (!(request instanceof C9221b)) {
            return false;
        }
        C9221b bVar = (C9221b) request;
        if (!this.f23925c.isEquivalentTo(bVar.f23925c) || !this.f23926d.isEquivalentTo(bVar.f23926d)) {
            return false;
        }
        return true;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.f23923a) {
            if (this.f23927e != C9219a.RUNNING) {
                if (this.f23928f != C9219a.RUNNING) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestFailed(com.bumptech.glide.request.Request r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f23923a
            monitor-enter(r0)
            com.bumptech.glide.request.Request r1 = r2.f23926d     // Catch:{ all -> 0x002f }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002f }
            if (r3 != 0) goto L_0x0020
            com.bumptech.glide.request.RequestCoordinator$a r3 = com.bumptech.glide.request.RequestCoordinator.C9219a.FAILED     // Catch:{ all -> 0x002f }
            r2.f23927e = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.request.RequestCoordinator$a r3 = r2.f23928f     // Catch:{ all -> 0x002f }
            com.bumptech.glide.request.RequestCoordinator$a r1 = com.bumptech.glide.request.RequestCoordinator.C9219a.RUNNING     // Catch:{ all -> 0x002f }
            if (r3 == r1) goto L_0x001e
            com.bumptech.glide.request.RequestCoordinator$a r3 = com.bumptech.glide.request.RequestCoordinator.C9219a.RUNNING     // Catch:{ all -> 0x002f }
            r2.f23928f = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.request.Request r3 = r2.f23926d     // Catch:{ all -> 0x002f }
            r3.begin()     // Catch:{ all -> 0x002f }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0020:
            com.bumptech.glide.request.RequestCoordinator$a r3 = com.bumptech.glide.request.RequestCoordinator.C9219a.FAILED     // Catch:{ all -> 0x002f }
            r2.f23928f = r3     // Catch:{ all -> 0x002f }
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f23924b     // Catch:{ all -> 0x002f }
            if (r3 == 0) goto L_0x002d
            com.bumptech.glide.request.RequestCoordinator r3 = r2.f23924b     // Catch:{ all -> 0x002f }
            r3.onRequestFailed(r2)     // Catch:{ all -> 0x002f }
        L_0x002d:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x002f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C9221b.onRequestFailed(com.bumptech.glide.request.Request):void");
    }

    public void onRequestSuccess(Request request) {
        synchronized (this.f23923a) {
            if (request.equals(this.f23925c)) {
                this.f23927e = C9219a.SUCCESS;
            } else if (request.equals(this.f23926d)) {
                this.f23928f = C9219a.SUCCESS;
            }
            if (this.f23924b != null) {
                this.f23924b.onRequestSuccess(this);
            }
        }
    }

    public void pause() {
        synchronized (this.f23923a) {
            if (this.f23927e == C9219a.RUNNING) {
                this.f23927e = C9219a.PAUSED;
                this.f23925c.pause();
            }
            if (this.f23928f == C9219a.RUNNING) {
                this.f23928f = C9219a.PAUSED;
                this.f23926d.pause();
            }
        }
    }

    /* renamed from: a */
    private boolean m22174a() {
        RequestCoordinator requestCoordinator = this.f23924b;
        return requestCoordinator == null || requestCoordinator.canNotifyCleared(this);
    }

    /* renamed from: a */
    private boolean m22175a(Request request) {
        return request.equals(this.f23925c) || (this.f23927e == C9219a.FAILED && request.equals(this.f23926d));
    }
}
