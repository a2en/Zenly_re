package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.k */
public final class C10504k extends C10484a implements zzaj {
    C10504k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    public final void zza(zzad zzad) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) zzad);
        mo28313c(1, a);
    }
}
