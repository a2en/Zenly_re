package com.crashlytics.android.core;

import android.content.Context;
import p389io.fabric.sdk.android.services.common.C12180h;

/* renamed from: com.crashlytics.android.core.n0 */
class C9398n0 implements C9413t0 {

    /* renamed from: a */
    private final Context f24351a;

    /* renamed from: b */
    private final C9413t0 f24352b;

    /* renamed from: c */
    private boolean f24353c = false;

    /* renamed from: d */
    private String f24354d;

    public C9398n0(Context context, C9413t0 t0Var) {
        this.f24351a = context;
        this.f24352b = t0Var;
    }

    /* renamed from: a */
    public String mo25217a() {
        if (!this.f24353c) {
            this.f24354d = C12180h.m32281o(this.f24351a);
            this.f24353c = true;
        }
        String str = this.f24354d;
        if (str != null) {
            return str;
        }
        C9413t0 t0Var = this.f24352b;
        if (t0Var != null) {
            return t0Var.mo25217a();
        }
        return null;
    }
}
