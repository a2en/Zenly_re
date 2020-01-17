package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p301o.C9217k;
import com.bumptech.glide.request.target.SizeReadyCallback;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.request.c */
public class C9222c<R> implements FutureTarget<R>, RequestListener<R> {

    /* renamed from: o */
    private static final C9223a f23929o = new C9223a();

    /* renamed from: e */
    private final int f23930e;

    /* renamed from: f */
    private final int f23931f;

    /* renamed from: g */
    private final boolean f23932g;

    /* renamed from: h */
    private final C9223a f23933h;

    /* renamed from: i */
    private R f23934i;

    /* renamed from: j */
    private Request f23935j;

    /* renamed from: k */
    private boolean f23936k;

    /* renamed from: l */
    private boolean f23937l;

    /* renamed from: m */
    private boolean f23938m;

    /* renamed from: n */
    private GlideException f23939n;

    /* renamed from: com.bumptech.glide.request.c$a */
    static class C9223a {
        C9223a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24903a(Object obj, long j) throws InterruptedException {
            obj.wait(j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo24902a(Object obj) {
            obj.notifyAll();
        }
    }

    public C9222c(int i, int i2) {
        this(i, i2, true, f23929o);
    }

    /* renamed from: a */
    private synchronized R m22180a(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (this.f23932g && !isDone()) {
            C9217k.m22100a();
        }
        if (this.f23936k) {
            throw new CancellationException();
        } else if (this.f23938m) {
            throw new ExecutionException(this.f23939n);
        } else if (this.f23937l) {
            return this.f23934i;
        } else {
            if (l == null) {
                this.f23933h.mo24903a(this, 0);
            } else if (l.longValue() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long longValue = l.longValue() + currentTimeMillis;
                while (!isDone() && currentTimeMillis < longValue) {
                    this.f23933h.mo24903a(this, longValue - currentTimeMillis);
                    currentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            } else if (this.f23938m) {
                throw new ExecutionException(this.f23939n);
            } else if (this.f23936k) {
                throw new CancellationException();
            } else if (this.f23937l) {
                return this.f23934i;
            } else {
                throw new TimeoutException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        if (r3 == null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        r3.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean cancel(boolean r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isDone()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x000a
            r3 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            return r3
        L_0x000a:
            r0 = 1
            r2.f23936k = r0     // Catch:{ all -> 0x0022 }
            com.bumptech.glide.request.c$a r1 = r2.f23933h     // Catch:{ all -> 0x0022 }
            r1.mo24902a(r2)     // Catch:{ all -> 0x0022 }
            r1 = 0
            if (r3 == 0) goto L_0x001a
            com.bumptech.glide.request.Request r3 = r2.f23935j     // Catch:{ all -> 0x0022 }
            r2.f23935j = r1     // Catch:{ all -> 0x0022 }
            goto L_0x001b
        L_0x001a:
            r3 = r1
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            if (r3 == 0) goto L_0x0021
            r3.clear()
        L_0x0021:
            return r0
        L_0x0022:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0022 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.request.C9222c.cancel(boolean):boolean");
    }

    public R get() throws InterruptedException, ExecutionException {
        try {
            return m22180a(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public synchronized Request getRequest() {
        return this.f23935j;
    }

    public void getSize(SizeReadyCallback sizeReadyCallback) {
        sizeReadyCallback.onSizeReady(this.f23930e, this.f23931f);
    }

    public synchronized boolean isCancelled() {
        return this.f23936k;
    }

    public synchronized boolean isDone() {
        return this.f23936k || this.f23937l || this.f23938m;
    }

    public void onDestroy() {
    }

    public void onLoadCleared(Drawable drawable) {
    }

    public synchronized void onLoadFailed(Drawable drawable) {
    }

    public void onLoadStarted(Drawable drawable) {
    }

    public synchronized void onResourceReady(R r, Transition<? super R> transition) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void removeCallback(SizeReadyCallback sizeReadyCallback) {
    }

    public synchronized void setRequest(Request request) {
        this.f23935j = request;
    }

    C9222c(int i, int i2, boolean z, C9223a aVar) {
        this.f23930e = i;
        this.f23931f = i2;
        this.f23932g = z;
        this.f23933h = aVar;
    }

    public synchronized boolean onLoadFailed(GlideException glideException, Object obj, Target<R> target, boolean z) {
        this.f23938m = true;
        this.f23939n = glideException;
        this.f23933h.mo24902a(this);
        return false;
    }

    public synchronized boolean onResourceReady(R r, Object obj, Target<R> target, C8882a aVar, boolean z) {
        this.f23937l = true;
        this.f23934i = r;
        this.f23933h.mo24902a(this);
        return false;
    }

    public R get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return m22180a(Long.valueOf(timeUnit.toMillis(j)));
    }
}
