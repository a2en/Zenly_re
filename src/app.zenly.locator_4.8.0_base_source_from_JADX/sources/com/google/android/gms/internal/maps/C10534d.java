package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.d */
public abstract class C10534d extends C10538h implements zzac {
    /* renamed from: a */
    public static zzac m26939a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        if (queryLocalInterface instanceof zzac) {
            return (zzac) queryLocalInterface;
        }
        return new C10535e(iBinder);
    }
}
