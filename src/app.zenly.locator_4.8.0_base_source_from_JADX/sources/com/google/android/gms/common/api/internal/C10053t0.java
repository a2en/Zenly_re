package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.content.DialogInterface.OnCancelListener;
import com.google.android.gms.common.C10067c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: com.google.android.gms.common.api.internal.t0 */
final class C10053t0 implements Runnable {

    /* renamed from: e */
    private final C10055u0 f26429e;

    /* renamed from: f */
    final /* synthetic */ C10051s0 f26430f;

    C10053t0(C10051s0 s0Var, C10055u0 u0Var) {
        this.f26430f = s0Var;
        this.f26429e = u0Var;
    }

    public final void run() {
        if (this.f26430f.f26423f) {
            ConnectionResult a = this.f26429e.mo27233a();
            if (a.hasResolution()) {
                C10051s0 s0Var = this.f26430f;
                s0Var.f26316e.startActivityForResult(GoogleApiActivity.m25043a(s0Var.mo27118a(), a.getResolution(), this.f26429e.mo27234b(), false), 1);
            } else if (this.f26430f.f26426i.mo27296b(a.getErrorCode())) {
                C10051s0 s0Var2 = this.f26430f;
                s0Var2.f26426i.mo27292a(s0Var2.mo27118a(), this.f26430f.f26316e, a.getErrorCode(), 2, this.f26430f);
            } else if (a.getErrorCode() == 18) {
                Dialog a2 = C10067c.m25291a(this.f26430f.mo27118a(), (OnCancelListener) this.f26430f);
                C10051s0 s0Var3 = this.f26430f;
                s0Var3.f26426i.mo27290a(s0Var3.mo27118a().getApplicationContext(), (C10064z) new C10057v0(this, a2));
            } else {
                this.f26430f.mo27216a(a, this.f26429e.mo27234b());
            }
        }
    }
}
