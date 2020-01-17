package com.android.volley;

import android.os.Process;
import com.android.volley.Cache.C8702a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.a */
public class C8706a extends Thread {

    /* renamed from: k */
    private static final boolean f22428k = C8716g.f22461b;

    /* renamed from: e */
    private final BlockingQueue<Request<?>> f22429e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final BlockingQueue<Request<?>> f22430f;

    /* renamed from: g */
    private final Cache f22431g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final ResponseDelivery f22432h;

    /* renamed from: i */
    private volatile boolean f22433i = false;

    /* renamed from: j */
    private final C8708b f22434j;

    /* renamed from: com.android.volley.a$a */
    class C8707a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Request f22435e;

        C8707a(Request request) {
            this.f22435e = request;
        }

        public void run() {
            try {
                C8706a.this.f22430f.put(this.f22435e);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: com.android.volley.a$b */
    private static class C8708b implements C8704b {

        /* renamed from: a */
        private final Map<String, List<Request<?>>> f22437a = new HashMap();

        /* renamed from: b */
        private final C8706a f22438b;

        C8708b(C8706a aVar) {
            this.f22438b = aVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
            return false;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean m20492b(com.android.volley.Request<?> r6) {
            /*
                r5 = this;
                monitor-enter(r5)
                java.lang.String r0 = r6.getCacheKey()     // Catch:{ all -> 0x0052 }
                java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r5.f22437a     // Catch:{ all -> 0x0052 }
                boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0052 }
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x003a
                java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r5.f22437a     // Catch:{ all -> 0x0052 }
                java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0052 }
                java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0052 }
                if (r1 != 0) goto L_0x001e
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0052 }
                r1.<init>()     // Catch:{ all -> 0x0052 }
            L_0x001e:
                java.lang.String r4 = "waiting-for-response"
                r6.addMarker(r4)     // Catch:{ all -> 0x0052 }
                r1.add(r6)     // Catch:{ all -> 0x0052 }
                java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r6 = r5.f22437a     // Catch:{ all -> 0x0052 }
                r6.put(r0, r1)     // Catch:{ all -> 0x0052 }
                boolean r6 = com.android.volley.C8716g.f22461b     // Catch:{ all -> 0x0052 }
                if (r6 == 0) goto L_0x0038
                java.lang.String r6 = "Request for cacheKey=%s is in flight, putting on hold."
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
                r1[r3] = r0     // Catch:{ all -> 0x0052 }
                com.android.volley.C8716g.m20507b(r6, r1)     // Catch:{ all -> 0x0052 }
            L_0x0038:
                monitor-exit(r5)
                return r2
            L_0x003a:
                java.util.Map<java.lang.String, java.util.List<com.android.volley.Request<?>>> r1 = r5.f22437a     // Catch:{ all -> 0x0052 }
                r4 = 0
                r1.put(r0, r4)     // Catch:{ all -> 0x0052 }
                r6.setNetworkRequestCompleteListener(r5)     // Catch:{ all -> 0x0052 }
                boolean r6 = com.android.volley.C8716g.f22461b     // Catch:{ all -> 0x0052 }
                if (r6 == 0) goto L_0x0050
                java.lang.String r6 = "new request, sending to network %s"
                java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x0052 }
                r1[r3] = r0     // Catch:{ all -> 0x0052 }
                com.android.volley.C8716g.m20507b(r6, r1)     // Catch:{ all -> 0x0052 }
            L_0x0050:
                monitor-exit(r5)
                return r3
            L_0x0052:
                r6 = move-exception
                monitor-exit(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.volley.C8706a.C8708b.m20492b(com.android.volley.Request):boolean");
        }

        /* renamed from: a */
        public void mo23546a(Request<?> request, Response<?> response) {
            List<Request> list;
            C8702a aVar = response.f22424b;
            if (aVar == null || aVar.mo23496a()) {
                mo23545a(request);
                return;
            }
            String cacheKey = request.getCacheKey();
            synchronized (this) {
                list = (List) this.f22437a.remove(cacheKey);
            }
            if (list != null) {
                if (C8716g.f22461b) {
                    C8716g.m20509d("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), cacheKey);
                }
                for (Request postResponse : list) {
                    this.f22438b.f22432h.postResponse(postResponse, response);
                }
            }
        }

        /* renamed from: a */
        public synchronized void mo23545a(Request<?> request) {
            String cacheKey = request.getCacheKey();
            List list = (List) this.f22437a.remove(cacheKey);
            if (list != null && !list.isEmpty()) {
                if (C8716g.f22461b) {
                    C8716g.m20509d("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), cacheKey);
                }
                Request request2 = (Request) list.remove(0);
                this.f22437a.put(cacheKey, list);
                request2.setNetworkRequestCompleteListener(this);
                try {
                    this.f22438b.f22430f.put(request2);
                } catch (InterruptedException e) {
                    C8716g.m20508c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.f22438b.mo23564a();
                }
            }
            return;
        }
    }

    public C8706a(BlockingQueue<Request<?>> blockingQueue, BlockingQueue<Request<?>> blockingQueue2, Cache cache, ResponseDelivery responseDelivery) {
        this.f22429e = blockingQueue;
        this.f22430f = blockingQueue2;
        this.f22431g = cache;
        this.f22432h = responseDelivery;
        this.f22434j = new C8708b(this);
    }

    public void run() {
        if (f22428k) {
            C8716g.m20509d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f22431g.initialize();
        while (true) {
            try {
                m20488b();
            } catch (InterruptedException unused) {
                if (this.f22433i) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    C8716g.m20508c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
                }
            }
        }
    }

    /* renamed from: b */
    private void m20488b() throws InterruptedException {
        mo23565a((Request) this.f22429e.take());
    }

    /* renamed from: a */
    public void mo23564a() {
        this.f22433i = true;
        interrupt();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23565a(Request<?> request) throws InterruptedException {
        request.addMarker("cache-queue-take");
        if (request.isCanceled()) {
            request.finish("cache-discard-canceled");
            return;
        }
        C8702a aVar = this.f22431g.get(request.getCacheKey());
        if (aVar == null) {
            request.addMarker("cache-miss");
            if (!this.f22434j.m20492b(request)) {
                this.f22430f.put(request);
            }
        } else if (aVar.mo23496a()) {
            request.addMarker("cache-hit-expired");
            request.setCacheEntry(aVar);
            if (!this.f22434j.m20492b(request)) {
                this.f22430f.put(request);
            }
        } else {
            request.addMarker("cache-hit");
            Response parseNetworkResponse = request.parseNetworkResponse(new C8715f(aVar.f22397a, aVar.f22403g));
            request.addMarker("cache-hit-parsed");
            if (!aVar.mo23497b()) {
                this.f22432h.postResponse(request, parseNetworkResponse);
            } else {
                request.addMarker("cache-hit-refresh-needed");
                request.setCacheEntry(aVar);
                parseNetworkResponse.f22426d = true;
                if (!this.f22434j.m20492b(request)) {
                    this.f22432h.postResponse(request, parseNetworkResponse, new C8707a(request));
                } else {
                    this.f22432h.postResponse(request, parseNetworkResponse);
                }
            }
        }
    }
}
