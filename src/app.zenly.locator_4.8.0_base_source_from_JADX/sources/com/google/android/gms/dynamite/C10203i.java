package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import com.google.android.gms.internal.common.C10448b;
import com.google.android.gms.internal.common.C10449c;

/* renamed from: com.google.android.gms.dynamite.i */
public final class C10203i extends C10448b implements zzj {
    C10203i(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel a = mo28273a();
        C10449c.m26839a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        a.writeInt(i);
        Parcel a2 = mo28274a(2, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final int zzak() throws RemoteException {
        Parcel a = mo28274a(6, mo28273a());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, String str, int i) throws RemoteException {
        Parcel a = mo28273a();
        C10449c.m26839a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        a.writeInt(i);
        Parcel a2 = mo28274a(4, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final int zza(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel a = mo28273a();
        C10449c.m26839a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        C10449c.m26840a(a, z);
        Parcel a2 = mo28274a(3, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    public final int zzb(IObjectWrapper iObjectWrapper, String str, boolean z) throws RemoteException {
        Parcel a = mo28273a();
        C10449c.m26839a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        C10449c.m26840a(a, z);
        Parcel a2 = mo28274a(5, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }
}
