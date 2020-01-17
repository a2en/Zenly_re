package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.gcm.C10468a;
import com.google.android.gms.internal.gcm.C10469b;

/* renamed from: com.google.android.gms.iid.n */
public final class C10238n extends C10468a implements zzl {
    C10238n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.iid.IMessengerCompat");
    }

    public final void send(Message message) throws RemoteException {
        Parcel a = mo28295a();
        C10469b.m26855a(a, message);
        mo28298b(1, a);
    }
}
