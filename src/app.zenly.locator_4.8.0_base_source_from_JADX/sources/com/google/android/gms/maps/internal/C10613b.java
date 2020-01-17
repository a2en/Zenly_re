package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C10538h;

/* renamed from: com.google.android.gms.maps.internal.b */
public abstract class C10613b extends C10538h implements zzap {
    public C10613b() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo28456a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IGoogleMapDelegate iGoogleMapDelegate;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            iGoogleMapDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (queryLocalInterface instanceof IGoogleMapDelegate) {
                iGoogleMapDelegate = (IGoogleMapDelegate) queryLocalInterface;
            } else {
                iGoogleMapDelegate = new C10624m(readStrongBinder);
            }
        }
        zza(iGoogleMapDelegate);
        parcel2.writeNoException();
        return true;
    }
}
