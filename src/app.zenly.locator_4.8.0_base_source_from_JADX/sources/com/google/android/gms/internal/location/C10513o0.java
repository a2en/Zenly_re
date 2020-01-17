package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.location.o0 */
final class C10513o0 extends C10488c {

    /* renamed from: o */
    private final /* synthetic */ boolean f27417o;

    C10513o0(C10507l0 l0Var, GoogleApiClient googleApiClient, boolean z) {
        this.f27417o = z;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28388a(this.f27417o);
        mo27108a(Status.f26273i);
    }
}
