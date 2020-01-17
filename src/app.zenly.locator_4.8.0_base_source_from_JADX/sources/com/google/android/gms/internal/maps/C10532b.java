package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.b */
public abstract class C10532b extends C10538h implements zzz {
    /* renamed from: a */
    public static zzz m26938a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        if (queryLocalInterface instanceof zzz) {
            return (zzz) queryLocalInterface;
        }
        return new C10533c(iBinder);
    }
}
