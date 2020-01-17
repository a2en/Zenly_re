package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import com.google.android.gms.internal.common.C10448b;

/* renamed from: com.google.android.gms.common.internal.j0 */
public final class C10119j0 extends C10448b implements zzi {
    C10119j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final IObjectWrapper zzb() throws RemoteException {
        Parcel a = mo28274a(1, mo28273a());
        IObjectWrapper a2 = C10182a.m25696a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int zzc() throws RemoteException {
        Parcel a = mo28274a(2, mo28273a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
