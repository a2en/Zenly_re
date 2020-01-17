package com.google.android.gms.phenotype;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.internal.phenotype.C10555d;

/* renamed from: com.google.android.gms.phenotype.j */
final class C10675j extends C9990a<C10555d, C9989a> {
    C10675j() {
    }

    /* renamed from: a */
    public final /* synthetic */ Client mo26974a(Context context, Looper looper, C10103d dVar, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        C10555d dVar2 = new C10555d(context, looper, dVar, connectionCallbacks, onConnectionFailedListener);
        return dVar2;
    }
}
