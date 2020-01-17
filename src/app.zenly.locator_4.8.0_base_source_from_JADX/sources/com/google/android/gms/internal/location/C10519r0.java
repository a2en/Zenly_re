package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.C10023f;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.r0 */
final class C10519r0 extends C10488c {

    /* renamed from: o */
    private final /* synthetic */ LocationRequest f27422o;

    /* renamed from: p */
    private final /* synthetic */ LocationListener f27423p;

    /* renamed from: q */
    private final /* synthetic */ Looper f27424q;

    C10519r0(C10507l0 l0Var, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        this.f27422o = locationRequest;
        this.f27423p = locationListener;
        this.f27424q = looper;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28385a(this.f27422o, C10023f.m25202a(this.f27423p, C10495f0.m26875a(this.f27424q), LocationListener.class.getSimpleName()), (zzaj) new C10490d(this));
    }
}
