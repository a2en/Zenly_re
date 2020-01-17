package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import com.google.android.gms.internal.maps.C10531a;
import com.google.android.gms.internal.maps.C10539i;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import com.google.android.gms.maps.model.StreetViewSource;

/* renamed from: com.google.android.gms.maps.internal.e */
public final class C10616e extends C10531a implements IStreetViewPanoramaDelegate {
    C10616e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    public final void animateTo(StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) streetViewPanoramaCamera);
        a.writeLong(j);
        mo28414b(9, a);
    }

    public final void enablePanning(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(2, a);
    }

    public final void enableStreetNames(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(4, a);
    }

    public final void enableUserNavigation(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(3, a);
    }

    public final void enableZoom(boolean z) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26946a(a, z);
        mo28414b(1, a);
    }

    public final StreetViewPanoramaCamera getPanoramaCamera() throws RemoteException {
        Parcel a = mo28412a(10, mo28411a());
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) C10539i.m26943a(a, StreetViewPanoramaCamera.CREATOR);
        a.recycle();
        return streetViewPanoramaCamera;
    }

    public final StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws RemoteException {
        Parcel a = mo28412a(14, mo28411a());
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) C10539i.m26943a(a, StreetViewPanoramaLocation.CREATOR);
        a.recycle();
        return streetViewPanoramaLocation;
    }

    public final boolean isPanningGesturesEnabled() throws RemoteException {
        Parcel a = mo28412a(6, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isStreetNamesEnabled() throws RemoteException {
        Parcel a = mo28412a(8, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isUserNavigationEnabled() throws RemoteException {
        Parcel a = mo28412a(7, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final boolean isZoomGesturesEnabled() throws RemoteException {
        Parcel a = mo28412a(5, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final IObjectWrapper orientationToPoint(StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) streetViewPanoramaOrientation);
        Parcel a2 = mo28412a(19, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final StreetViewPanoramaOrientation pointToOrientation(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        Parcel a2 = mo28412a(18, a);
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) C10539i.m26943a(a2, StreetViewPanoramaOrientation.CREATOR);
        a2.recycle();
        return streetViewPanoramaOrientation;
    }

    public final void setOnStreetViewPanoramaCameraChangeListener(zzbh zzbh) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbh);
        mo28414b(16, a);
    }

    public final void setOnStreetViewPanoramaChangeListener(zzbj zzbj) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbj);
        mo28414b(15, a);
    }

    public final void setOnStreetViewPanoramaClickListener(zzbl zzbl) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbl);
        mo28414b(17, a);
    }

    public final void setOnStreetViewPanoramaLongClickListener(zzbn zzbn) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbn);
        mo28414b(20, a);
    }

    public final void setPosition(LatLng latLng) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        mo28414b(12, a);
    }

    public final void setPositionWithID(String str) throws RemoteException {
        Parcel a = mo28411a();
        a.writeString(str);
        mo28414b(11, a);
    }

    public final void setPositionWithRadius(LatLng latLng, int i) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        a.writeInt(i);
        mo28414b(13, a);
    }

    public final void setPositionWithRadiusAndSource(LatLng latLng, int i, StreetViewSource streetViewSource) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        a.writeInt(i);
        C10539i.m26945a(a, (Parcelable) streetViewSource);
        mo28414b(22, a);
    }

    public final void setPositionWithSource(LatLng latLng, StreetViewSource streetViewSource) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        C10539i.m26945a(a, (Parcelable) streetViewSource);
        mo28414b(21, a);
    }
}
