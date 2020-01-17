package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.maps.e */
public final class C10535e extends C10531a implements zzac {
    C10535e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    public final void clearTileCache() throws RemoteException {
        mo28414b(2, mo28411a());
    }

    public final boolean getFadeIn() throws RemoteException {
        Parcel a = mo28412a(11, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final String getId() throws RemoteException {
        Parcel a = mo28412a(3, mo28411a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final float getTransparency() throws RemoteException {
        Parcel a = mo28412a(13, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float getZIndex() throws RemoteException {
        Parcel a = mo28412a(5, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean isVisible() throws RemoteException {
        Parcel a = mo28412a(7, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final void remove() throws RemoteException {
        mo28414b(1, mo28411a());
    }

    public final void setFadeIn(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(10, a);
    }

    public final void setTransparency(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(12, a);
    }

    public final void setVisible(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(6, a);
    }

    public final void setZIndex(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(4, a);
    }

    public final boolean zza(zzac zzac) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzac);
        Parcel a2 = mo28412a(8, a);
        boolean a3 = C10539i.m26947a(a2);
        a2.recycle();
        return a3;
    }

    public final int zzj() throws RemoteException {
        Parcel a = mo28412a(9, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
