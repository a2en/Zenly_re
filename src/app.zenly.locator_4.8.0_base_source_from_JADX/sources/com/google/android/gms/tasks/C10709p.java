package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.p */
final class C10709p implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10693c f27814e;

    /* renamed from: f */
    private final /* synthetic */ C10708o f27815f;

    C10709p(C10708o oVar, C10693c cVar) {
        this.f27815f = oVar;
        this.f27814e = cVar;
    }

    public final void run() {
        synchronized (this.f27815f.f27812b) {
            if (this.f27815f.f27813c != null) {
                this.f27815f.f27813c.onComplete(this.f27814e);
            }
        }
    }
}
