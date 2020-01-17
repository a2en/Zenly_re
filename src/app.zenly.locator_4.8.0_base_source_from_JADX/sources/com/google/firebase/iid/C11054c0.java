package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.firebase.iid.c0 */
final /* synthetic */ class C11054c0 implements Runnable {

    /* renamed from: e */
    private final C11056d0 f28684e;

    /* renamed from: f */
    private final Intent f28685f;

    C11054c0(C11056d0 d0Var, Intent intent) {
        this.f28684e = d0Var;
        this.f28685f = intent;
    }

    public final void run() {
        C11056d0 d0Var = this.f28684e;
        String action = this.f28685f.getAction();
        StringBuilder sb = new StringBuilder(String.valueOf(action).length() + 61);
        sb.append("Service took too long to process intent: ");
        sb.append(action);
        sb.append(" App may get closed.");
        Log.w("EnhancedIntentService", sb.toString());
        d0Var.mo32280a();
    }
}
