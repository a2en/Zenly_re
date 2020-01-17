package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.C10023f;
import com.google.android.gms.location.C10566d;

/* renamed from: com.google.android.gms.internal.location.n0 */
final class C10511n0 extends C10488c {

    /* renamed from: o */
    private final /* synthetic */ C10566d f27410o;

    C10511n0(C10507l0 l0Var, GoogleApiClient googleApiClient, C10566d dVar) {
        this.f27410o = dVar;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28389b(C10023f.m25201a(this.f27410o, C10566d.class.getSimpleName()), new C10490d(this));
    }
}
