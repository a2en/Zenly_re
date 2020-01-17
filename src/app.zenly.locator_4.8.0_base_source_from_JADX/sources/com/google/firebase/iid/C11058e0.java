package com.google.firebase.iid;

import android.util.Log;

/* renamed from: com.google.firebase.iid.e0 */
final class C11058e0 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C11056d0 f28696e;

    /* renamed from: f */
    private final /* synthetic */ C11060f0 f28697f;

    C11058e0(C11060f0 f0Var, C11056d0 d0Var) {
        this.f28697f = f0Var;
        this.f28696e = d0Var;
    }

    public final void run() {
        String str = "EnhancedIntentService";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "bg processing of the intent starting now");
        }
        this.f28697f.f28699a.zzd(this.f28696e.f28692a);
        this.f28696e.mo32280a();
    }
}
