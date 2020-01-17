package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.l */
public abstract class C10542l extends C10538h implements zzh {
    /* renamed from: a */
    public static zzh m26951a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        if (queryLocalInterface instanceof zzh) {
            return (zzh) queryLocalInterface;
        }
        return new C10543m(iBinder);
    }
}
