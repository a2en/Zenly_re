package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.r */
final class C10711r implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10693c f27819e;

    /* renamed from: f */
    private final /* synthetic */ C10710q f27820f;

    C10711r(C10710q qVar, C10693c cVar) {
        this.f27820f = qVar;
        this.f27819e = cVar;
    }

    public final void run() {
        synchronized (this.f27820f.f27817b) {
            if (this.f27820f.f27818c != null) {
                this.f27820f.f27818c.onFailure(this.f27819e.mo29309a());
            }
        }
    }
}
