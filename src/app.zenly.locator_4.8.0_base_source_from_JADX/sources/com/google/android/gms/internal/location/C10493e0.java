package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.location.C10568e.C10569a;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.e0 */
final class C10493e0 extends C10569a<LocationSettingsResult> {

    /* renamed from: o */
    private final /* synthetic */ LocationSettingsRequest f27400o;

    /* renamed from: p */
    private final /* synthetic */ String f27401p = null;

    C10493e0(C10491d0 d0Var, GoogleApiClient googleApiClient, LocationSettingsRequest locationSettingsRequest, String str) {
        this.f27400o = locationSettingsRequest;
        super(googleApiClient);
    }

    /* renamed from: a */
    public final /* synthetic */ Result mo27107a(Status status) {
        return new LocationSettingsResult(status);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28386a(this.f27400o, (BaseImplementation$ResultHolder<LocationSettingsResult>) this, this.f27401p);
    }
}
