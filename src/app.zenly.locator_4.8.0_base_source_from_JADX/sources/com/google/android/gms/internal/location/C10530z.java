package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.z */
final class C10530z extends C10510n {

    /* renamed from: a */
    private BaseImplementation$ResultHolder<LocationSettingsResult> f27436a;

    public C10530z(BaseImplementation$ResultHolder<LocationSettingsResult> baseImplementation$ResultHolder) {
        C10123l.m25513a(baseImplementation$ResultHolder != null, (Object) "listener can't be null.");
        this.f27436a = baseImplementation$ResultHolder;
    }

    public final void zza(LocationSettingsResult locationSettingsResult) throws RemoteException {
        this.f27436a.setResult(locationSettingsResult);
        this.f27436a = null;
    }
}
