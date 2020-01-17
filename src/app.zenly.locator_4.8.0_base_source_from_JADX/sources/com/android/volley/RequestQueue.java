package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class RequestQueue {

    /* renamed from: a */
    private final AtomicInteger f22413a;

    /* renamed from: b */
    private final Set<Request<?>> f22414b;

    /* renamed from: c */
    private final PriorityBlockingQueue<Request<?>> f22415c;

    /* renamed from: d */
    private final PriorityBlockingQueue<Request<?>> f22416d;

    /* renamed from: e */
    private final Cache f22417e;

    /* renamed from: f */
    private final Network f22418f;

    /* renamed from: g */
    private final ResponseDelivery f22419g;

    /* renamed from: h */
    private final C8714e[] f22420h;

    /* renamed from: i */
    private C8706a f22421i;

    /* renamed from: j */
    private final List<RequestFinishedListener> f22422j;

    public interface RequestFilter {
        boolean apply(Request<?> request);
    }

    public interface RequestFinishedListener<T> {
        void onRequestFinished(Request<T> request);
    }

    public RequestQueue(Cache cache, Network network, int i, ResponseDelivery responseDelivery) {
        this.f22413a = new AtomicInteger();
        this.f22414b = new HashSet();
        this.f22415c = new PriorityBlockingQueue<>();
        this.f22416d = new PriorityBlockingQueue<>();
        this.f22422j = new ArrayList();
        this.f22417e = cache;
        this.f22418f = network;
        this.f22420h = new C8714e[i];
        this.f22419g = responseDelivery;
    }

    /* renamed from: a */
    public int mo23547a() {
        return this.f22413a.incrementAndGet();
    }

    /* renamed from: b */
    public void mo23549b() {
        mo23551c();
        this.f22421i = new C8706a(this.f22415c, this.f22416d, this.f22417e, this.f22419g);
        this.f22421i.start();
        for (int i = 0; i < this.f22420h.length; i++) {
            C8714e eVar = new C8714e(this.f22416d, this.f22418f, this.f22417e, this.f22419g);
            this.f22420h[i] = eVar;
            eVar.start();
        }
    }

    /* renamed from: c */
    public void mo23551c() {
        C8714e[] eVarArr;
        C8706a aVar = this.f22421i;
        if (aVar != null) {
            aVar.mo23564a();
        }
        for (C8714e eVar : this.f22420h) {
            if (eVar != null) {
                eVar.mo23576a();
            }
        }
    }

    /* renamed from: a */
    public <T> Request<T> mo23548a(Request<T> request) {
        request.setRequestQueue(this);
        synchronized (this.f22414b) {
            this.f22414b.add(request);
        }
        request.setSequence(mo23547a());
        request.addMarker("add-to-queue");
        if (!request.shouldCache()) {
            this.f22416d.add(request);
            return request;
        }
        this.f22415c.add(request);
        return request;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <T> void mo23550b(Request<T> request) {
        synchronized (this.f22414b) {
            this.f22414b.remove(request);
        }
        synchronized (this.f22422j) {
            for (RequestFinishedListener onRequestFinished : this.f22422j) {
                onRequestFinished.onRequestFinished(request);
            }
        }
    }

    public RequestQueue(Cache cache, Network network, int i) {
        this(cache, network, i, new C8710c(new Handler(Looper.getMainLooper())));
    }

    public RequestQueue(Cache cache, Network network) {
        this(cache, network, 4);
    }
}
