package com.google.android.gms.auth.api.phone;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.C10103d;
import com.google.android.gms.internal.auth-api-phone.C10254i;

/* renamed from: com.google.android.gms.auth.api.phone.c */
final class C9975c extends C9990a<C10254i, C9989a> {
    C9975c() {
    }

    /* renamed from: a */
    public final /* synthetic */ Client mo26925a(Context context, Looper looper, C10103d dVar, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        C9989a aVar = (C9989a) obj;
        C10254i iVar = new C10254i(context, looper, dVar, connectionCallbacks, onConnectionFailedListener);
        return iVar;
    }
}
