package com.mapbox.android.telemetry;

import android.util.Log;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.mapbox.android.telemetry.u */
class C11394u {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C11329b0 f29491a;

    /* renamed from: b */
    private final C11379n<Event> f29492b;

    /* renamed from: c */
    private final ExecutorService f29493c;

    /* renamed from: com.mapbox.android.telemetry.u$a */
    class C11395a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ List f29494e;

        C11395a(List list) {
            this.f29494e = list;
        }

        public void run() {
            C11394u.this.f29491a.mo32973a(this.f29494e);
        }
    }

    C11394u(C11379n<Event> nVar, C11329b0 b0Var, ExecutorService executorService) {
        this.f29492b = nVar;
        this.f29491a = b0Var;
        this.f29493c = executorService;
    }

    /* renamed from: a */
    static synchronized C11394u m29337a(C11329b0 b0Var, ExecutorService executorService) {
        C11394u uVar;
        synchronized (C11394u.class) {
            if (b0Var == null || executorService == null) {
                throw new IllegalArgumentException("Callback or executor can't be null");
            }
            uVar = new C11394u(new C11379n(), b0Var, executorService);
        }
        return uVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33050a(Event event) {
        boolean a;
        synchronized (this) {
            if (this.f29492b.mo33028b() >= 180) {
                m29338a(this.f29492b.mo33026a());
            }
            a = this.f29492b.mo33027a(event);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<Event> mo33049a() {
        List<Event> a;
        synchronized (this) {
            a = this.f29492b.mo33026a();
        }
        return a;
    }

    /* renamed from: a */
    private void m29338a(List<Event> list) {
        try {
            this.f29493c.execute(new C11395a(list));
        } catch (RejectedExecutionException e) {
            Log.e("EventsQueue", e.toString());
        }
    }
}
