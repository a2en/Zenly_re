package com.crashlytics.android.core;

/* renamed from: com.crashlytics.android.core.s0 */
class C9410s0 {

    /* renamed from: a */
    public final String f24369a;

    /* renamed from: b */
    public final String f24370b;

    /* renamed from: c */
    public final StackTraceElement[] f24371c;

    /* renamed from: d */
    public final C9410s0 f24372d;

    public C9410s0(Throwable th, C9408r0 r0Var) {
        this.f24369a = th.getLocalizedMessage();
        this.f24370b = th.getClass().getName();
        this.f24371c = r0Var.mo25067a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f24372d = cause != null ? new C9410s0(cause, r0Var) : null;
    }
}
