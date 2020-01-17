package com.google.android.gms.internal.auth-api-phone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;

/* renamed from: com.google.android.gms.internal.auth-api-phone.f */
public final class C10251f extends C10249d implements zzj {
    C10251f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    public final void zza(zzl zzl) throws RemoteException {
        Parcel a = mo27766a();
        C10250e.m25886a(a, (IInterface) zzl);
        mo27767a(1, a);
    }

    public final void zza(String str, zzl zzl) throws RemoteException {
        Parcel a = mo27766a();
        a.writeString(str);
        C10250e.m25886a(a, (IInterface) zzl);
        mo27767a(2, a);
    }

    public final void zza(IStatusCallback iStatusCallback) throws RemoteException {
        Parcel a = mo27766a();
        C10250e.m25886a(a, (IInterface) iStatusCallback);
        mo27767a(3, a);
    }

    public final void zza(zzf zzf) throws RemoteException {
        Parcel a = mo27766a();
        C10250e.m25886a(a, (IInterface) zzf);
        mo27767a(4, a);
    }

    public final void zza(String str, zzh zzh) throws RemoteException {
        Parcel a = mo27766a();
        a.writeString(str);
        C10250e.m25886a(a, (IInterface) zzh);
        mo27767a(5, a);
    }
}
