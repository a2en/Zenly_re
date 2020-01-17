package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.maps.p */
public abstract class C10546p extends C10538h implements zzn {
    /* renamed from: a */
    public static zzn m26953a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
        if (queryLocalInterface instanceof zzn) {
            return (zzn) queryLocalInterface;
        }
        return new C10547q(iBinder);
    }
}
