package com.google.android.gms.internal.location;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.p0 */
final class C10515p0 extends C10488c {

    /* renamed from: o */
    private final /* synthetic */ Location f27419o;

    C10515p0(C10507l0 l0Var, GoogleApiClient googleApiClient, Location location) {
        this.f27419o = location;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28379a(this.f27419o);
        mo27108a(Status.f26273i);
    }
}
