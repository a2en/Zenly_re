package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C10527w;

/* renamed from: com.google.android.gms.location.g0 */
public class C10574g0 extends C10527w implements zzr {
    /* renamed from: a */
    public static zzr m27022a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new C10576h0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28330a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        throw new NoSuchMethodError();
    }
}
