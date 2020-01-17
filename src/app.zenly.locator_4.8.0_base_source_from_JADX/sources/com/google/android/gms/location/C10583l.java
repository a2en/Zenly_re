package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.internal.location.C10526v;

/* renamed from: com.google.android.gms.location.l */
final class C10583l extends C9990a<C10526v, C9989a> {
    C10583l() {
    }

    /* renamed from: a */
    public final /* synthetic */ Client mo26974a(Context context, Looper looper, C10103d dVar, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        C10526v vVar = new C10526v(context, looper, connectionCallbacks, onConnectionFailedListener, "locationServices", dVar);
        return vVar;
    }
}
