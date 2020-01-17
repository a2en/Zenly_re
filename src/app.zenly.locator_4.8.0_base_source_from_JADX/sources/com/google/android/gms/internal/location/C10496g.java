package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.location.GeofencingRequest;

/* renamed from: com.google.android.gms.internal.location.g */
final class C10496g extends C10500i {

    /* renamed from: o */
    private final /* synthetic */ GeofencingRequest f27402o;

    /* renamed from: p */
    private final /* synthetic */ PendingIntent f27403p;

    C10496g(C10494f fVar, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        this.f27402o = geofencingRequest;
        this.f27403p = pendingIntent;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28383a(this.f27402o, this.f27403p, (BaseImplementation$ResultHolder<Status>) this);
    }
}
