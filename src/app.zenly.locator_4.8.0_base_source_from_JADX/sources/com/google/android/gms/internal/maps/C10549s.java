package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: com.google.android.gms.internal.maps.s */
public final class C10549s extends C10531a implements zzt {
    C10549s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    public final float getAlpha() throws RemoteException {
        Parcel a = mo28412a(26, mo28411a());
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

    public final float getRotation() throws RemoteException {
        Parcel a = mo28412a(23, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final String getSnippet() throws RemoteException {
        Parcel a = mo28412a(8, mo28411a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final String getTitle() throws RemoteException {
        Parcel a = mo28412a(6, mo28411a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final float getZIndex() throws RemoteException {
        Parcel a = mo28412a(28, mo28411a());
        float readFloat = a.readFloat();
        a.recycle();
        return readFloat;
    }

    public final void hideInfoWindow() throws RemoteException {
        mo28414b(12, mo28411a());
    }

    public final boolean isDraggable() throws RemoteException {
        Parcel a = mo28412a(10, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isFlat() throws RemoteException {
        Parcel a = mo28412a(21, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isInfoWindowShown() throws RemoteException {
        Parcel a = mo28412a(13, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isVisible() throws RemoteException {
        Parcel a = mo28412a(15, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final void remove() throws RemoteException {
        mo28414b(1, mo28411a());
    }

    public final void setAlpha(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(25, a);
    }

    public final void setAnchor(float f, float f2) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        a.writeFloat(f2);
        mo28414b(19, a);
    }

    public final void setDraggable(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(9, a);
    }

    public final void setFlat(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(20, a);
    }

    public final void setInfoWindowAnchor(float f, float f2) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        a.writeFloat(f2);
        mo28414b(24, a);
    }

    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        mo28414b(3, a);
    }

    public final void setRotation(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(22, a);
    }

    public final void setSnippet(String str) throws RemoteException {
        Parcel a = mo28411a();
        a.writeString(str);
        mo28414b(7, a);
    }

    public final void setTitle(String str) throws RemoteException {
        Parcel a = mo28411a();
        a.writeString(str);
        mo28414b(5, a);
    }

    public final void setVisible(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(14, a);
    }

    public final void setZIndex(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        mo28414b(27, a);
    }

    public final void showInfoWindow() throws RemoteException {
        mo28414b(11, mo28411a());
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        mo28414b(29, a);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        mo28414b(18, a);
    }

    public final boolean zzj(zzt zzt) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzt);
        Parcel a2 = mo28412a(16, a);
        boolean a3 = C10539i.m26947a(a2);
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zzk() throws RemoteException {
        Parcel a = mo28412a(30, mo28411a());
        IObjectWrapper a2 = C10182a.m25696a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int zzj() throws RemoteException {
        Parcel a = mo28412a(17, mo28411a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
