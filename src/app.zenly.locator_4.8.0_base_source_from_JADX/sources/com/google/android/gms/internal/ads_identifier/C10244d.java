package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads_identifier.d */
public abstract class C10244d extends C10242b implements zze {
    /* renamed from: a */
    public static zze m25878a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new C10245e(iBinder);
    }
}
