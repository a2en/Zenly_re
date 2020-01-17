package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;

/* renamed from: com.google.android.gms.internal.location.b */
final class C10486b extends C10488c {

    /* renamed from: o */
    private final /* synthetic */ PendingIntent f27398o;

    C10486b(C10507l0 l0Var, GoogleApiClient googleApiClient, PendingIntent pendingIntent) {
        this.f27398o = pendingIntent;
        super(googleApiClient);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ void mo27150a(AnyClient anyClient) throws RemoteException {
        ((C10526v) anyClient).mo28378a(this.f27398o, (zzaj) new C10490d(this));
    }
}
