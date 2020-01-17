package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.maps.internal.C10613b;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;

/* renamed from: com.google.android.gms.maps.f */
final class C10608f extends C10613b {

    /* renamed from: a */
    private final /* synthetic */ OnMapReadyCallback f27605a;

    C10608f(C10601a aVar, OnMapReadyCallback onMapReadyCallback) {
        this.f27605a = onMapReadyCallback;
    }

    public final void zza(IGoogleMapDelegate iGoogleMapDelegate) throws RemoteException {
        this.f27605a.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}
