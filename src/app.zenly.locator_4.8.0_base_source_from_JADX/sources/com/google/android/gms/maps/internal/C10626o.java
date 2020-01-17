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

/* renamed from: com.google.android.gms.maps.internal.o */
public final class C10626o extends C10531a implements IMapViewDelegate {
    C10626o(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    public final IGoogleMapDelegate getMap() throws RemoteException {
        IGoogleMapDelegate iGoogleMapDelegate;
        Parcel a = mo28412a(1, mo28411a());
        IBinder readStrongBinder = a.readStrongBinder();
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
        a.recycle();
        return iGoogleMapDelegate;
    }

    public final void getMapAsync(zzap zzap) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) zzap);
        mo28414b(9, a);
    }

    public final IObjectWrapper getView() throws RemoteException {
        Parcel a = mo28412a(8, mo28411a());
        IObjectWrapper a2 = C10182a.m25696a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void onCreate(Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) bundle);
        mo28414b(2, a);
    }

    public final void onDestroy() throws RemoteException {
        mo28414b(5, mo28411a());
    }

    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) bundle);
        mo28414b(10, a);
    }

    public final void onExitAmbient() throws RemoteException {
        mo28414b(11, mo28411a());
    }

    public final void onLowMemory() throws RemoteException {
        mo28414b(6, mo28411a());
    }

    public final void onPause() throws RemoteException {
        mo28414b(4, mo28411a());
    }

    public final void onResume() throws RemoteException {
        mo28414b(3, mo28411a());
    }

    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) bundle);
        Parcel a2 = mo28412a(7, a);
        if (a2.readInt() != 0) {
            bundle.readFromParcel(a2);
        }
        a2.recycle();
    }

    public final void onStart() throws RemoteException {
        mo28414b(12, mo28411a());
    }

    public final void onStop() throws RemoteException {
        mo28414b(13, mo28411a());
    }
}
