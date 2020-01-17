package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.j */
public abstract class C10502j extends C10527w implements zzaj {
    public C10502j() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28330a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zza((zzad) C10497g0.m26877a(parcel, zzad.CREATOR));
        return true;
    }
}
