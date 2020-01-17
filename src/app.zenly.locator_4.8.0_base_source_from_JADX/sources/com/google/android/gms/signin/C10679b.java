package com.google.android.gms.signin;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.signin.internal.C10682a;

/* renamed from: com.google.android.gms.signin.b */
final class C10679b extends C9990a<C10682a, C10677a> {
    C10679b() {
    }

    /* renamed from: a */
    public final /* synthetic */ Client mo26974a(Context context, Looper looper, C10103d dVar, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        C10677a aVar = (C10677a) obj;
        if (aVar == null) {
            aVar = C10677a.f27755n;
        }
        C10682a aVar2 = new C10682a(context, looper, true, dVar, aVar, connectionCallbacks, onConnectionFailedListener);
        return aVar2;
    }
}
