package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.j */
public abstract class C10540j extends C10538h implements zze {
    /* renamed from: a */
    public static zze m26950a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof zze) {
            return (zze) queryLocalInterface;
        }
        return new C10541k(iBinder);
    }
}
