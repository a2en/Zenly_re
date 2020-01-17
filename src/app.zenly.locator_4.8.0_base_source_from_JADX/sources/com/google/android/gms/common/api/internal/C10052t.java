package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C10016d.C10017a;

/* renamed from: com.google.android.gms.common.api.internal.t */
final class C10052t implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ ConnectionResult f26427e;

    /* renamed from: f */
    private final /* synthetic */ C10017a f26428f;

    C10052t(C10017a aVar, ConnectionResult connectionResult) {
        this.f26428f = aVar;
        this.f26427e = connectionResult;
    }

    public final void run() {
        this.f26428f.onConnectionFailed(this.f26427e);
    }
}
