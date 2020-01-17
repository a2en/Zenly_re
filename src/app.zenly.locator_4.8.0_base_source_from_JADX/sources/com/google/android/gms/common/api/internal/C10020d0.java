package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.api.internal.d0 */
final class C10020d0 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ C10022e0 f26377e;

    C10020d0(C10022e0 e0Var) {
        this.f26377e = e0Var;
    }

    public final void run() {
        this.f26377e.f26386g.zag(new ConnectionResult(4));
    }
}
