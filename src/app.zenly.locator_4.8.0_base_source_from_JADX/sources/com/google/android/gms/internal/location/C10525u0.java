package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.C10023f;
import com.google.android.gms.location.LocationListener;

/* renamed from: com.google.android.gms.internal.location.u0 */
final class C10525u0 extends C10488c {

    /* renamed from: o */
    private final /* synthetic */ LocationListener f27432o;

    C10525u0(C10507l0 l0Var, GoogleApiClient googleApiClient, LocationListener locationListener) {
        this.f27432o = locationListener;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28380a(C10023f.m25201a(this.f27432o, LocationListener.class.getSimpleName()), (zzaj) new C10490d(this));
    }
}
