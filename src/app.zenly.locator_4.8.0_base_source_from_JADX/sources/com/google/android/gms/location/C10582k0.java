package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.location.C10497g0;
import com.google.android.gms.internal.location.C10527w;

/* renamed from: com.google.android.gms.location.k0 */
public abstract class C10582k0 extends C10527w implements zzx {
    public C10582k0() {
        super("com.google.android.gms.location.ILocationListener");
    }

    /* renamed from: a */
    public static zzx m27027a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof zzx ? (zzx) queryLocalInterface : new C10584l0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28330a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        onLocationChanged((Location) C10497g0.m26877a(parcel, Location.CREATOR));
        return true;
    }
}
