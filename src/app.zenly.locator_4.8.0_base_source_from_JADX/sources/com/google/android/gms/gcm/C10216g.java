package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gcm.C10468a;

/* renamed from: com.google.android.gms.gcm.g */
public final class C10216g extends C10468a implements zzg {
    C10216g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    public final void zzf(int i) throws RemoteException {
        Parcel a = mo28295a();
        a.writeInt(i);
        mo28296a(2, a);
    }
}
