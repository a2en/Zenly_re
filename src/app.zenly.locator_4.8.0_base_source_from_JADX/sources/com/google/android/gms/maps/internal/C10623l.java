package com.google.android.gms.maps.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.C10531a;
import com.google.android.gms.internal.maps.C10539i;
import com.google.android.gms.internal.maps.C10540j;
import com.google.android.gms.internal.maps.zze;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

/* renamed from: com.google.android.gms.maps.internal.l */
public final class C10623l extends C10531a implements zze {
    C10623l(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    public final IMapViewDelegate zza(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) throws RemoteException {
        IMapViewDelegate iMapViewDelegate;
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        C10539i.m26945a(a, (Parcelable) googleMapOptions);
        Parcel a2 = mo28412a(3, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            iMapViewDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof IMapViewDelegate) {
                iMapViewDelegate = (IMapViewDelegate) queryLocalInterface;
            } else {
                iMapViewDelegate = new C10626o(readStrongBinder);
            }
        }
        a2.recycle();
        return iMapViewDelegate;
    }

    public final IMapFragmentDelegate zzc(IObjectWrapper iObjectWrapper) throws RemoteException {
        IMapFragmentDelegate iMapFragmentDelegate;
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        Parcel a2 = mo28412a(2, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            iMapFragmentDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (queryLocalInterface instanceof IMapFragmentDelegate) {
                iMapFragmentDelegate = (IMapFragmentDelegate) queryLocalInterface;
            } else {
                iMapFragmentDelegate = new C10625n(readStrongBinder);
            }
        }
        a2.recycle();
        return iMapFragmentDelegate;
    }

    public final IStreetViewPanoramaFragmentDelegate zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate;
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        Parcel a2 = mo28412a(8, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            iStreetViewPanoramaFragmentDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (queryLocalInterface instanceof IStreetViewPanoramaFragmentDelegate) {
                iStreetViewPanoramaFragmentDelegate = (IStreetViewPanoramaFragmentDelegate) queryLocalInterface;
            } else {
                iStreetViewPanoramaFragmentDelegate = new C10617f(readStrongBinder);
            }
        }
        a2.recycle();
        return iStreetViewPanoramaFragmentDelegate;
    }

    public final ICameraUpdateFactoryDelegate zze() throws RemoteException {
        ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate;
        Parcel a = mo28412a(4, mo28411a());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            iCameraUpdateFactoryDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof ICameraUpdateFactoryDelegate) {
                iCameraUpdateFactoryDelegate = (ICameraUpdateFactoryDelegate) queryLocalInterface;
            } else {
                iCameraUpdateFactoryDelegate = new C10614c(readStrongBinder);
            }
        }
        a.recycle();
        return iCameraUpdateFactoryDelegate;
    }

    public final zze zzf() throws RemoteException {
        Parcel a = mo28412a(5, mo28411a());
        zze a2 = C10540j.m26950a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void zza(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        a.writeInt(i);
        mo28414b(6, a);
    }

    public final IStreetViewPanoramaViewDelegate zza(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException {
        IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate;
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        C10539i.m26945a(a, (Parcelable) streetViewPanoramaOptions);
        Parcel a2 = mo28412a(7, a);
        IBinder readStrongBinder = a2.readStrongBinder();
        if (readStrongBinder == null) {
            iStreetViewPanoramaViewDelegate = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            if (queryLocalInterface instanceof IStreetViewPanoramaViewDelegate) {
                iStreetViewPanoramaViewDelegate = (IStreetViewPanoramaViewDelegate) queryLocalInterface;
            } else {
                iStreetViewPanoramaViewDelegate = new C10618g(readStrongBinder);
            }
        }
        a2.recycle();
        return iStreetViewPanoramaViewDelegate;
    }
}
