package com.google.android.gms.maps.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C10538h;

/* renamed from: com.google.android.gms.maps.internal.k */
public abstract class C10622k extends C10538h implements zzc {
    public C10622k() {
        super("com.google.android.gms.maps.internal.ICancelableCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28456a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onFinish();
        } else if (i != 2) {
            return false;
        } else {
            onCancel();
        }
        parcel2.writeNoException();
        return true;
    }
}
