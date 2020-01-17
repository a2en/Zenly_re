package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import com.google.android.gms.internal.maps.C10531a;
import com.google.android.gms.internal.maps.C10539i;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: com.google.android.gms.maps.internal.c */
public final class C10614c extends C10531a implements ICameraUpdateFactoryDelegate {
    C10614c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    public final IObjectWrapper newCameraPosition(CameraPosition cameraPosition) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) cameraPosition);
        Parcel a2 = mo28412a(7, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper newLatLng(LatLng latLng) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        Parcel a2 = mo28412a(8, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper newLatLngBounds(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLngBounds);
        a.writeInt(i);
        Parcel a2 = mo28412a(10, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper newLatLngBoundsWithSize(LatLngBounds latLngBounds, int i, int i2, int i3) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLngBounds);
        a.writeInt(i);
        a.writeInt(i2);
        a.writeInt(i3);
        Parcel a2 = mo28412a(11, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper newLatLngZoom(LatLng latLng, float f) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        a.writeFloat(f);
        Parcel a2 = mo28412a(9, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper scrollBy(float f, float f2) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        a.writeFloat(f2);
        Parcel a2 = mo28412a(3, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zoomBy(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        Parcel a2 = mo28412a(5, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zoomByWithFocus(float f, int i, int i2) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        a.writeInt(i);
        a.writeInt(i2);
        Parcel a2 = mo28412a(6, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zoomIn() throws RemoteException {
        Parcel a = mo28412a(1, mo28411a());
        IObjectWrapper a2 = C10182a.m25696a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final IObjectWrapper zoomOut() throws RemoteException {
        Parcel a = mo28412a(2, mo28411a());
        IObjectWrapper a2 = C10182a.m25696a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final IObjectWrapper zoomTo(float f) throws RemoteException {
        Parcel a = mo28411a();
        a.writeFloat(f);
        Parcel a2 = mo28412a(4, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
