package com.google.android.gms.common.api.internal;

/* renamed from: com.google.android.gms.common.api.internal.a1 */
final class C10010a1 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ LifecycleCallback f26326e;

    /* renamed from: f */
    private final /* synthetic */ String f26327f;

    /* renamed from: g */
    private final /* synthetic */ C10013b1 f26328g;

    C10010a1(C10013b1 b1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f26328g = b1Var;
        this.f26326e = lifecycleCallback;
        this.f26327f = str;
    }

    public final void run() {
        if (this.f26328g.f26337f > 0) {
            this.f26326e.mo27120a(this.f26328g.f26338g != null ? this.f26328g.f26338g.getBundle(this.f26327f) : null);
        }
        if (this.f26328g.f26337f >= 2) {
            this.f26326e.mo27125d();
        }
        if (this.f26328g.f26337f >= 3) {
            this.f26326e.mo27124c();
        }
        if (this.f26328g.f26337f >= 4) {
            this.f26326e.mo27126e();
        }
        if (this.f26328g.f26337f >= 5) {
            this.f26326e.mo27122b();
        }
    }
}
