package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.clearcut.zze;

/* renamed from: com.google.android.gms.internal.clearcut.b5 */
public final class C10282b5 extends C10264a implements zzn {
    C10282b5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void zza(zzl zzl, zze zze) throws RemoteException {
        Parcel a = mo27786a();
        C10414v0.m26557a(a, (IInterface) zzl);
        C10414v0.m26558a(a, (Parcelable) zze);
        mo27787a(1, a);
    }
}
