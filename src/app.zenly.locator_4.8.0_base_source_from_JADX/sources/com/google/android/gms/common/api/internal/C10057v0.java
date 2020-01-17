package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* renamed from: com.google.android.gms.common.api.internal.v0 */
final class C10057v0 extends C10064z {

    /* renamed from: a */
    private final /* synthetic */ Dialog f26435a;

    /* renamed from: b */
    private final /* synthetic */ C10053t0 f26436b;

    C10057v0(C10053t0 t0Var, Dialog dialog) {
        this.f26436b = t0Var;
        this.f26435a = dialog;
    }

    /* renamed from: a */
    public final void mo27236a() {
        this.f26436b.f26430f.mo27228g();
        if (this.f26435a.isShowing()) {
            this.f26435a.dismiss();
        }
    }
}
