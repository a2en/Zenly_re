package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.android.volley.e */
public class C8714e extends Thread {

    /* renamed from: e */
    private final BlockingQueue<Request<?>> f22450e;

    /* renamed from: f */
    private final Network f22451f;

    /* renamed from: g */
    private final Cache f22452g;

    /* renamed from: h */
    private final ResponseDelivery f22453h;

    /* renamed from: i */
    private volatile boolean f22454i = false;

    public C8714e(BlockingQueue<Request<?>> blockingQueue, Network network, Cache cache, ResponseDelivery responseDelivery) {
        this.f22450e = blockingQueue;
        this.f22451f = network;
        this.f22452g = cache;
        this.f22453h = responseDelivery;
    }

    @TargetApi(14)
    /* renamed from: b */
    private void m20500b(Request<?> request) {
        if (VERSION.SDK_INT >= 14) {
            TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
        }
    }

    /* renamed from: a */
    public void mo23576a() {
        this.f22454i = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m20499b();
            } catch (InterruptedException unused) {
                if (this.f22454i) {
                    Thread.currentThread().interrupt();
                    return;
                } else {
                    C8716g.m20508c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
                }
            }
        }
    }

    /* renamed from: b */
    private void m20499b() throws InterruptedException {
        mo23577a((Request) this.f22450e.take());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23577a(Request<?> request) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            request.addMarker("network-queue-take");
            if (request.isCanceled()) {
                request.finish("network-discard-cancelled");
                request.notifyListenerResponseNotUsable();
                return;
            }
            m20500b(request);
            C8715f performRequest = this.f22451f.performRequest(request);
            request.addMarker("network-http-complete");
            if (!performRequest.f22459e || !request.hasHadResponseDelivered()) {
                Response parseNetworkResponse = request.parseNetworkResponse(performRequest);
                request.addMarker("network-parse-complete");
                if (request.shouldCache() && parseNetworkResponse.f22424b != null) {
                    this.f22452g.put(request.getCacheKey(), parseNetworkResponse.f22424b);
                    request.addMarker("network-cache-written");
                }
                request.markDelivered();
                this.f22453h.postResponse(request, parseNetworkResponse);
                request.notifyListenerResponseReceived(parseNetworkResponse);
                return;
            }
            request.finish("not-modified");
            request.notifyListenerResponseNotUsable();
        } catch (VolleyError e) {
            e.mo23563a(SystemClock.elapsedRealtime() - elapsedRealtime);
            m20498a(request, e);
            request.notifyListenerResponseNotUsable();
        } catch (Exception e2) {
            C8716g.m20506a(e2, "Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError((Throwable) e2);
            volleyError.mo23563a(SystemClock.elapsedRealtime() - elapsedRealtime);
            this.f22453h.postError(request, volleyError);
            request.notifyListenerResponseNotUsable();
        }
    }

    /* renamed from: a */
    private void m20498a(Request<?> request, VolleyError volleyError) {
        this.f22453h.postError(request, request.parseNetworkError(volleyError));
    }
}
