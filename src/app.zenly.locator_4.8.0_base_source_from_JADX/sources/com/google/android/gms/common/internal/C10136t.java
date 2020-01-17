package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks;

/* renamed from: com.google.android.gms.common.internal.t */
final class C10136t implements BaseConnectionCallbacks {

    /* renamed from: a */
    private final /* synthetic */ ConnectionCallbacks f26651a;

    C10136t(ConnectionCallbacks connectionCallbacks) {
        this.f26651a = connectionCallbacks;
    }

    public final void onConnected(Bundle bundle) {
        this.f26651a.onConnected(bundle);
    }

    public final void onConnectionSuspended(int i) {
        this.f26651a.onConnectionSuspended(i);
    }
}
