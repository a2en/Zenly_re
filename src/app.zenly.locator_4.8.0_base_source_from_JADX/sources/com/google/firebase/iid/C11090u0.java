package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.u0 */
public final class C11090u0 implements C11086s0 {

    /* renamed from: a */
    private final IBinder f28766a;

    C11090u0(IBinder iBinder) {
        this.f28766a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f28766a;
    }

    public final void send(Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.f28766a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
