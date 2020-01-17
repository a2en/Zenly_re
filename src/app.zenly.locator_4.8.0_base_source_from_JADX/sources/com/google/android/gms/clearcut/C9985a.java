package com.google.android.gms.clearcut;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.internal.clearcut.C10436y4;

/* renamed from: com.google.android.gms.clearcut.a */
final class C9985a extends C9990a<C10436y4, C9989a> {
    C9985a() {
    }

    /* renamed from: a */
    public final /* synthetic */ Client mo26974a(Context context, Looper looper, C10103d dVar, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        C10436y4 y4Var = new C10436y4(context, looper, dVar, connectionCallbacks, onConnectionFailedListener);
        return y4Var;
    }
}
