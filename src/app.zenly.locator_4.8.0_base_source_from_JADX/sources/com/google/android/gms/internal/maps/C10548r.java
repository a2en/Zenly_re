package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.r */
public abstract class C10548r extends C10538h implements zzt {
    /* renamed from: a */
    public static zzt m26954a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof zzt) {
            return (zzt) queryLocalInterface;
        }
        return new C10549s(iBinder);
    }
}
