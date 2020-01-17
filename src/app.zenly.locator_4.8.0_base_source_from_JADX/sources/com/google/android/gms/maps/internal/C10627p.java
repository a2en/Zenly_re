package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C10538h;

/* renamed from: com.google.android.gms.maps.internal.p */
public abstract class C10627p extends C10538h implements zzn {
    public C10627p() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28456a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onCameraIdle();
        parcel2.writeNoException();
        return true;
    }
}
