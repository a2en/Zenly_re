package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: com.google.android.gms.maps.b */
public final class C10604b {

    /* renamed from: a */
    private static ICameraUpdateFactoryDelegate f27602a;

    /* renamed from: a */
    private static ICameraUpdateFactoryDelegate m27076a() {
        ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate = f27602a;
        C10123l.m25506a(iCameraUpdateFactoryDelegate, (Object) "CameraUpdateFactory is not initialized");
        return iCameraUpdateFactoryDelegate;
    }

    /* renamed from: a */
    public static void m27077a(ICameraUpdateFactoryDelegate iCameraUpdateFactoryDelegate) {
        C10123l.m25505a(iCameraUpdateFactoryDelegate);
        f27602a = iCameraUpdateFactoryDelegate;
    }

    /* renamed from: a */
    public static C10603a m27073a(CameraPosition cameraPosition) {
        try {
            return new C10603a(m27076a().newCameraPosition(cameraPosition));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C10603a m27074a(LatLng latLng) {
        try {
            return new C10603a(m27076a().newLatLng(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* renamed from: a */
    public static C10603a m27075a(LatLng latLng, float f) {
        try {
            return new C10603a(m27076a().newLatLngZoom(latLng, f));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
