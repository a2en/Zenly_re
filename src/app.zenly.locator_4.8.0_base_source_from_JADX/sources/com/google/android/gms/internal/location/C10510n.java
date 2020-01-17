package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.n */
public abstract class C10510n extends C10527w implements zzaq {
    public C10510n() {
        super("com.google.android.gms.location.internal.ISettingsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28330a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        zza((LocationSettingsResult) C10497g0.m26877a(parcel, LocationSettingsResult.CREATOR));
        return true;
    }
}
