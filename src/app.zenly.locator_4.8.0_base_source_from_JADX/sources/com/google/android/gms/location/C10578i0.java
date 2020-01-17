package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C10497g0;
import com.google.android.gms.internal.location.C10527w;

/* renamed from: com.google.android.gms.location.i0 */
public abstract class C10578i0 extends C10527w implements zzu {
    public C10578i0() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    /* renamed from: a */
    public static zzu m27025a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof zzu ? (zzu) queryLocalInterface : new C10580j0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28330a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            onLocationResult((LocationResult) C10497g0.m26877a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            onLocationAvailability((LocationAvailability) C10497g0.m26877a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
