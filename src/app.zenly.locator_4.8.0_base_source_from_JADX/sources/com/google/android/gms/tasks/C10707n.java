package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.n */
final class C10707n implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10706m f27810e;

    C10707n(C10706m mVar) {
        this.f27810e = mVar;
    }

    public final void run() {
        synchronized (this.f27810e.f27808b) {
            if (this.f27810e.f27809c != null) {
                this.f27810e.f27809c.onCanceled();
            }
        }
    }
}
