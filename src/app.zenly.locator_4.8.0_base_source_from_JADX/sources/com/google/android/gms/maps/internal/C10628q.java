package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C10538h;

/* renamed from: com.google.android.gms.maps.internal.q */
public abstract class C10628q extends C10538h implements zzp {
    public C10628q() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28456a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onCameraMoveCanceled();
        parcel2.writeNoException();
        return true;
    }
}
