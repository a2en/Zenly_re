package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.C10260b;
import com.google.android.gms.internal.base.C10261c;

/* renamed from: com.google.android.gms.signin.internal.e */
public final class C10686e extends C10260b implements zae {
    C10686e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zaa(IAccountAccessor iAccountAccessor, int i, boolean z) throws RemoteException {
        Parcel a = mo27780a();
        C10261c.m25897a(a, (IInterface) iAccountAccessor);
        a.writeInt(i);
        C10261c.m25899a(a, z);
        mo27781a(9, a);
    }

    public final void zam(int i) throws RemoteException {
        Parcel a = mo27780a();
        a.writeInt(i);
        mo27781a(7, a);
    }

    public final void zaa(zai zai, zac zac) throws RemoteException {
        Parcel a = mo27780a();
        C10261c.m25898a(a, (Parcelable) zai);
        C10261c.m25897a(a, (IInterface) zac);
        mo27781a(12, a);
    }
}
