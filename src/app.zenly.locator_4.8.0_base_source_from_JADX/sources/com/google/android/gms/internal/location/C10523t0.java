package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.t0 */
final class C10523t0 extends C10488c {

    /* renamed from: o */
    private final /* synthetic */ LocationRequest f27429o;

    /* renamed from: p */
    private final /* synthetic */ PendingIntent f27430p;

    C10523t0(C10507l0 l0Var, GoogleApiClient googleApiClient, LocationRequest locationRequest, PendingIntent pendingIntent) {
        this.f27429o = locationRequest;
        this.f27430p = pendingIntent;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28384a(this.f27429o, this.f27430p, (zzaj) new C10490d(this));
    }
}
