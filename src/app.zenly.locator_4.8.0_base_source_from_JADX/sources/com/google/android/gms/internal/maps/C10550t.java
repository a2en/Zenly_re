package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.t */
public abstract class C10550t extends C10538h implements zzw {
    /* renamed from: a */
    public static zzw m26955a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (queryLocalInterface instanceof zzw) {
            return (zzw) queryLocalInterface;
        }
        return new C10551u(iBinder);
    }
}
