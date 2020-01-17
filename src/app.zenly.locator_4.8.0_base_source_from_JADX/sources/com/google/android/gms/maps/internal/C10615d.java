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
import com.google.android.gms.maps.model.VisibleRegion;

/* renamed from: com.google.android.gms.maps.internal.d */
public final class C10615d extends C10531a implements IProjectionDelegate {
    C10615d(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    public final LatLng fromScreenLocation(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26944a(a, (IInterface) iObjectWrapper);
        Parcel a2 = mo28412a(1, a);
        LatLng latLng = (LatLng) C10539i.m26943a(a2, LatLng.CREATOR);
        a2.recycle();
        return latLng;
    }

    public final VisibleRegion getVisibleRegion() throws RemoteException {
        Parcel a = mo28412a(3, mo28411a());
        VisibleRegion visibleRegion = (VisibleRegion) C10539i.m26943a(a, VisibleRegion.CREATOR);
        a.recycle();
        return visibleRegion;
    }

    public final IObjectWrapper toScreenLocation(LatLng latLng) throws RemoteException {
        Parcel a = mo28411a();
        C10539i.m26945a(a, (Parcelable) latLng);
        Parcel a2 = mo28412a(2, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
