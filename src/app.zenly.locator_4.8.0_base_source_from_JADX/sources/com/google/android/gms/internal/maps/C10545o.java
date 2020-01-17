package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.internal.maps.o */
public final class C10545o extends C10531a implements zzk {
    C10545o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    public final float getBearing() throws RemoteException {
        Parcel a = mo28412a(12, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final LatLngBounds getBounds() throws RemoteException {
        Parcel a = mo28412a(10, mo28411a());
        LatLngBounds latLngBounds = (LatLngBounds) C10539i.m26943a(a, LatLngBounds.CREATOR);
        a.recycle();
        return latLngBounds;
    }

    public final float getHeight() throws RemoteException {
        Parcel a = mo28412a(8, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final String getId() throws RemoteException {
        Parcel a = mo28412a(2, mo28411a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final LatLng getPosition() throws RemoteException {
        Parcel a = mo28412a(4, mo28411a());
        LatLng latLng = (LatLng) C10539i.m26943a(a, LatLng.CREATOR);
        a.recycle();
        return latLng;
    }

    public final float getTransparency() throws RemoteException {
        Parcel a = mo28412a(18, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float getWidth() throws RemoteException {
        Parcel a = mo28412a(7, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final float getZIndex() throws RemoteException {
        Parcel a = mo28412a(14, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final boolean isClickable() throws RemoteException {
        Parcel a = mo28412a(23, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isVisible() throws RemoteException {
        Parcel a = mo28412a(16, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final void remove() throws RemoteException {
        mo28414b(1, mo28411a());
    }

    public final void setBearing(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(11, a);
    }

    public final void setClickable(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(22, a);
    }

    public final void setDimensions(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(5, a);
    }

    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        mo28414b(3, a);
    }

    public final void setPositionFromBounds(LatLngBounds latLngBounds) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLngBounds);
        mo28414b(9, a);
    }

    public final void setTransparency(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(17, a);
    }

    public final void setVisible(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(15, a);
    }

    public final void setZIndex(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(13, a);
    }

    public final void zza(float f, float f2) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        a.writeFloat(f2);
        mo28414b(6, a);
    }

    public final boolean zzb(zzk zzk) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzk);
        Parcel a2 = mo28412a(19, a);
        boolean a3 = C10539i.m26947a(a2);
        a2.recycle();
        return a3;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        mo28414b(24, a);
    }

    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        mo28414b(21, a);
    }

    public final int zzj() throws RemoteException {
        Parcel a = mo28412a(20, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel a = mo28412a(25, mo28411a());
        IObjectWrapper a2 = C10182a.m25696a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
