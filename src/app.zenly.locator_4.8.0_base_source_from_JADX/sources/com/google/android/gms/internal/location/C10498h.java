package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.location.zzal;

/* renamed from: com.google.android.gms.internal.location.h */
final class C10498h extends C10500i {

    /* renamed from: o */
    private final /* synthetic */ zzal f27404o;

    C10498h(C10494f fVar, GoogleApiClient googleApiClient, zzal zzal) {
        this.f27404o = zzal;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28387a(this.f27404o, (BaseImplementation$ResultHolder<Status>) this);
    }
}
