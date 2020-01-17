package com.google.android.gms.internal.maps;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;

/* renamed from: com.google.android.gms.internal.maps.k */
public final class C10541k extends C10531a implements zze {
    C10541k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    public final IObjectWrapper zza(int i) throws RemoteException {
        Parcel a = mo28411a();
        a.writeInt(i);
        Parcel a2 = mo28412a(1, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel a = mo28411a();
        a.writeString(str);
        Parcel a2 = mo28412a(3, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zzc(String str) throws RemoteException {
        Parcel a = mo28411a();
        a.writeString(str);
        Parcel a2 = mo28412a(7, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        Parcel a = mo28412a(4, mo28411a());
        IObjectWrapper a2 = C10182a.m25696a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final IObjectWrapper zza(String str) throws RemoteException {
        Parcel a = mo28411a();
        a.writeString(str);
        Parcel a2 = mo28412a(2, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zza(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        Parcel a2 = mo28412a(5, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zza(Bitmap bitmap) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) bitmap);
        Parcel a2 = mo28412a(6, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
