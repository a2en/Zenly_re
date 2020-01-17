package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.maps.q */
public final class C10547q extends C10531a implements zzn {
    C10547q(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    public final int getActiveLevelIndex() throws RemoteException {
        Parcel a = mo28412a(1, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int getDefaultLevelIndex() throws RemoteException {
        Parcel a = mo28412a(2, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final List<IBinder> getLevels() throws RemoteException {
        Parcel a = mo28412a(3, mo28411a());
        ArrayList createBinderArrayList = a.createBinderArrayList();
        a.recycle();
        return createBinderArrayList;
    }

    public final boolean isUnderground() throws RemoteException {
        Parcel a = mo28412a(4, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean zzb(zzn zzn) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzn);
        Parcel a2 = mo28412a(5, a);
        boolean a3 = C10539i.m26947a(a2);
        a2.recycle();
        return a3;
    }

    public final int zzj() throws RemoteException {
        Parcel a = mo28412a(6, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
