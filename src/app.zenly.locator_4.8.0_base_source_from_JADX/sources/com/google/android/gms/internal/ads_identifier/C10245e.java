package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads_identifier.e */
public final class C10245e extends C10241a implements zze {
    C10245e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    public final String getId() throws RemoteException {
        Parcel a = mo27756a(1, mo27755a());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final boolean zzb(boolean z) throws RemoteException {
        Parcel a = mo27755a();
        C10243c.m25876a(a, true);
        Parcel a2 = mo27756a(2, a);
        boolean a3 = C10243c.m25877a(a2);
        a2.recycle();
        return a3;
    }

    public final boolean zzc() throws RemoteException {
        Parcel a = mo27756a(6, mo27755a());
        boolean a2 = C10243c.m25877a(a);
        a.recycle();
        return a2;
    }
}
