package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.C10023f;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.m0 */
final class C10509m0 extends C10488c {

    /* renamed from: o */
    private final /* synthetic */ LocationRequest f27408o;

    /* renamed from: p */
    private final /* synthetic */ LocationListener f27409p;

    C10509m0(C10507l0 l0Var, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        this.f27408o = locationRequest;
        this.f27409p = locationListener;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28385a(this.f27408o, C10023f.m25202a(this.f27409p, C10495f0.m26874a(), LocationListener.class.getSimpleName()), (zzaj) new C10490d(this));
    }
}
