package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C10484a;
import com.google.android.gms.internal.location.C10497g0;

/* renamed from: com.google.android.gms.location.l0 */
public final class C10584l0 extends C10484a implements zzx {
    C10584l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    public final void onLocationChanged(Location location) throws RemoteException {
        Parcel a = mo28309a();
        C10497g0.m26879a(a, (Parcelable) location);
        mo28313c(1, a);
    }
}
