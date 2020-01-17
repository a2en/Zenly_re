package com.google.android.gms.maps.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import com.google.android.gms.internal.maps.C10531a;
import com.google.android.gms.internal.maps.C10539i;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: com.google.android.gms.maps.internal.f */
public final class C10617f extends C10531a implements IStreetViewPanoramaFragmentDelegate {
    C10617f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    public final IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException {
        IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate;
        Parcel a = mo28412a(1, mo28411a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            iStreetViewPanoramaDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (queryLocalInterface instanceof IStreetViewPanoramaDelegate) {
                iStreetViewPanoramaDelegate = (IStreetViewPanoramaDelegate) queryLocalInterface;
            } else {
                iStreetViewPanoramaDelegate = new C10616e(readStrongBinder);
            }
        }
        a.recycle();
        return iStreetViewPanoramaDelegate;
    }

    public final void getStreetViewPanoramaAsync(zzbp zzbp) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzbp);
        mo28414b(12, a);
    }

    public final boolean isReady() throws RemoteException {
        Parcel a = mo28412a(11, mo28411a());
        boolean a2 = C10539i.m26947a(a);
        a.recycle();
        return a2;
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) bundle);
        mo28414b(3, a);
    }

    public final IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        C10539i.m26944a(a, (IInterface) iObjectWrapper2);
        C10539i.m26945a(a, (Parcelable) bundle);
        Parcel a2 = mo28412a(4, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final void onDestroy() throws RemoteException {
        mo28414b(8, mo28411a());
    }

    public final void onDestroyView() throws RemoteException {
        mo28414b(7, mo28411a());
    }

    public final void onInflate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        C10539i.m26945a(a, (Parcelable) streetViewPanoramaOptions);
        C10539i.m26945a(a, (Parcelable) bundle);
        mo28414b(2, a);
    }

    public final void onLowMemory() throws RemoteException {
        mo28414b(9, mo28411a());
    }

    public final void onPause() throws RemoteException {
        mo28414b(6, mo28411a());
    }

    public final void onResume() throws RemoteException {
        mo28414b(5, mo28411a());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) bundle);
        Parcel a2 = mo28412a(10, a);
        if (a2.readInt() != 0) {
            bundle.readFromParcel(a2);
        }
        a2.recycle();
    }

    public final void onStart() throws RemoteException {
        mo28414b(13, mo28411a());
    }

    public final void onStop() throws RemoteException {
        mo28414b(14, mo28411a());
    }
}