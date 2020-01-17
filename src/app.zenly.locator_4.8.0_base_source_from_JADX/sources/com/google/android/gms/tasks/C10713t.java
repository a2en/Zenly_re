package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.t */
final class C10713t implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10693c f27824e;

    /* renamed from: f */
    private final /* synthetic */ C10712s f27825f;

    C10713t(C10712s sVar, C10693c cVar) {
        this.f27825f = sVar;
        this.f27824e = cVar;
    }

    public final void run() {
        synchronized (this.f27825f.f27822b) {
            if (this.f27825f.f27823c != null) {
                this.f27825f.f27823c.onSuccess(this.f27824e.mo29315b());
            }
        }
    }
}
