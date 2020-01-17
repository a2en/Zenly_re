package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.C10023f;
import com.google.android.gms.location.C10566d;
import com.google.android.gms.location.LocationRequest;

/* renamed from: com.google.android.gms.internal.location.s0 */
final class C10521s0 extends C10488c {

    /* renamed from: o */
    private final /* synthetic */ LocationRequest f27425o;

    /* renamed from: p */
    private final /* synthetic */ C10566d f27426p;

    /* renamed from: q */
    private final /* synthetic */ Looper f27427q;

    C10521s0(C10507l0 l0Var, GoogleApiClient googleApiClient, LocationRequest locationRequest, C10566d dVar, Looper looper) {
        this.f27425o = locationRequest;
        this.f27426p = dVar;
        this.f27427q = looper;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28382a(zzbd.m26931a(this.f27425o), C10023f.m25202a(this.f27426p, C10495f0.m26875a(this.f27427q), C10566d.class.getSimpleName()), (zzaj) new C10490d(this));
    }
}
