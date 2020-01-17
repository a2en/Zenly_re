package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.C10447a;
import com.google.android.gms.internal.common.C10449c;

/* renamed from: com.google.android.gms.common.internal.k0 */
public abstract class C10122k0 extends C10447a implements zzi {
    public C10122k0() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: a */
    public static zzi m25503a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof zzi) {
            return (zzi) queryLocalInterface;
        }
        return new C10119j0(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo27419a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper zzb = zzb();
            parcel2.writeNoException();
            C10449c.m26839a(parcel2, (IInterface) zzb);
        } else if (i != 2) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
