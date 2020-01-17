package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.C10531a;
import com.google.android.gms.internal.maps.C10539i;

/* renamed from: com.google.android.gms.maps.internal.h */
public final class C10619h extends C10531a implements IUiSettingsDelegate {
    C10619h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    public final boolean isCompassEnabled() throws RemoteException {
        Parcel a = mo28412a(10, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isIndoorLevelPickerEnabled() throws RemoteException {
        Parcel a = mo28412a(17, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isMapToolbarEnabled() throws RemoteException {
        Parcel a = mo28412a(19, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isMyLocationButtonEnabled() throws RemoteException {
        Parcel a = mo28412a(11, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isRotateGesturesEnabled() throws RemoteException {
        Parcel a = mo28412a(15, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isScrollGesturesEnabled() throws RemoteException {
        Parcel a = mo28412a(12, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isScrollGesturesEnabledDuringRotateOrZoom() throws RemoteException {
        Parcel a = mo28412a(21, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isTiltGesturesEnabled() throws RemoteException {
        Parcel a = mo28412a(14, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isZoomControlsEnabled() throws RemoteException {
        Parcel a = mo28412a(9, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isZoomGesturesEnabled() throws RemoteException {
        Parcel a = mo28412a(13, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final void setAllGesturesEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(8, a);
    }

    public final void setCompassEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(2, a);
    }

    public final void setIndoorLevelPickerEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(16, a);
    }

    public final void setMapToolbarEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(18, a);
    }

    public final void setMyLocationButtonEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(3, a);
    }

    public final void setRotateGesturesEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(7, a);
    }

    public final void setScrollGesturesEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(4, a);
    }

    public final void setScrollGesturesEnabledDuringRotateOrZoom(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(20, a);
    }

    public final void setTiltGesturesEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(6, a);
    }

    public final void setZoomControlsEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(1, a);
    }

    public final void setZoomGesturesEnabled(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(5, a);
    }
}
