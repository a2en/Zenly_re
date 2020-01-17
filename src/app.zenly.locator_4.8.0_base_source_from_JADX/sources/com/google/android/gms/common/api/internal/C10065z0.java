package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.z0 */
final class C10065z0 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ LifecycleCallback f26447e;

    /* renamed from: f */
    private final /* synthetic */ String f26448f;

    /* renamed from: g */
    private final /* synthetic */ C10063y0 f26449g;

    C10065z0(C10063y0 y0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f26449g = y0Var;
        this.f26447e = lifecycleCallback;
        this.f26448f = str;
    }

    public final void run() {
        if (this.f26449g.f26445f > 0) {
            this.f26447e.mo27120a(this.f26449g.f26446g != null ? this.f26449g.f26446g.getBundle(this.f26448f) : null);
        }
        if (this.f26449g.f26445f >= 2) {
            this.f26447e.mo27125d();
        }
        if (this.f26449g.f26445f >= 3) {
            this.f26447e.mo27124c();
        }
        if (this.f26449g.f26445f >= 4) {
            this.f26447e.mo27126e();
        }
        if (this.f26449g.f26445f >= 5) {
            this.f26447e.mo27122b();
        }
    }
}
