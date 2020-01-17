package com.google.android.gms.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C10484a;
import com.google.android.gms.internal.location.C10497g0;

/* renamed from: com.google.android.gms.location.j0 */
public final class C10580j0 extends C10484a implements zzu {
    C10580j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    public final void onLocationAvailability(LocationAvailability locationAvailability) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) locationAvailability);
        mo28313c(2, a);
    }

    public final void onLocationResult(LocationResult locationResult) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) locationResult);
        mo28313c(1, a);
    }
}
