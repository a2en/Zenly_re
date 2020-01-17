package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.android.volley.c */
public class C8710c implements ResponseDelivery {

    /* renamed from: a */
    private final Executor f22443a;

    /* renamed from: com.android.volley.c$a */
    class C8711a implements Executor {

        /* renamed from: a */
        final /* synthetic */ Handler f22444a;

        C8711a(C8710c cVar, Handler handler) {
            this.f22444a = handler;
        }

        public void execute(Runnable runnable) {
            this.f22444a.post(runnable);
        }
    }

    /* renamed from: com.android.volley.c$b */
    private static class C8712b implements Runnable {

        /* renamed from: e */
        private final Request f22445e;

        /* renamed from: f */
        private final Response f22446f;

        /* renamed from: g */
        private final Runnable f22447g;

        public C8712b(Request request, Response response, Runnable runnable) {
            this.f22445e = request;
            this.f22446f = response;
            this.f22447g = runnable;
        }

        public void run() {
            if (this.f22445e.isCanceled()) {
                this.f22445e.finish("canceled-at-delivery");
                return;
            }
            if (this.f22446f.mo23554a()) {
                this.f22445e.deliverResponse(this.f22446f.f22423a);
            } else {
                this.f22445e.deliverError(this.f22446f.f22425c);
            }
            if (this.f22446f.f22426d) {
                this.f22445e.addMarker("intermediate-response");
            } else {
                this.f22445e.finish("done");
            }
            Runnable runnable = this.f22447g;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C8710c(Handler handler) {
        this.f22443a = new C8711a(this, handler);
    }

    public void postError(Request<?> request, VolleyError volleyError) {
        request.addMarker("post-error");
        this.f22443a.execute(new C8712b(request, Response.m20482a(volleyError), null));
    }

    public void postResponse(Request<?> request, Response<?> response) {
        postResponse(request, response, null);
    }

    public void postResponse(Request<?> request, Response<?> response, Runnable runnable) {
        request.markDelivered();
        request.addMarker("post-response");
        this.f22443a.execute(new C8712b(request, response, runnable));
    }
}
