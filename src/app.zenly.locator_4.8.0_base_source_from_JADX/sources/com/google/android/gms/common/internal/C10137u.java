package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener;

/* renamed from: com.google.android.gms.common.internal.u */
final class C10137u implements BaseOnConnectionFailedListener {

    /* renamed from: a */
    private final /* synthetic */ OnConnectionFailedListener f26652a;

    C10137u(OnConnectionFailedListener onConnectionFailedListener) {
        this.f26652a = onConnectionFailedListener;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.f26652a.onConnectionFailed(connectionResult);
    }
}
