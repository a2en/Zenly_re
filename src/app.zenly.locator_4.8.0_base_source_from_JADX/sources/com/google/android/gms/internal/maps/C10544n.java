package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.n */
public abstract class C10544n extends C10538h implements zzk {
    /* renamed from: a */
    public static zzk m26952a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
        if (queryLocalInterface instanceof zzk) {
            return (zzk) queryLocalInterface;
        }
        return new C10545o(iBinder);
    }
}
