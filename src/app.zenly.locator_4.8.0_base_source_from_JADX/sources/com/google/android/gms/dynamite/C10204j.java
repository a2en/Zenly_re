package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import com.google.android.gms.internal.common.C10448b;
import com.google.android.gms.internal.common.C10449c;

/* renamed from: com.google.android.gms.dynamite.j */
public final class C10204j extends C10448b implements zzl {
    C10204j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zza(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel a = mo28273a();
        C10449c.m26839a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        a.writeInt(i);
        C10449c.m26839a(a, (IInterface) iObjectWrapper2);
        Parcel a2 = mo28274a(2, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final IObjectWrapper zzb(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel a = mo28273a();
        C10449c.m26839a(a, (IInterface) iObjectWrapper);
        a.writeString(str);
        a.writeInt(i);
        C10449c.m26839a(a, (IInterface) iObjectWrapper2);
        Parcel a2 = mo28274a(3, a);
        IObjectWrapper a3 = C10182a.m25696a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
