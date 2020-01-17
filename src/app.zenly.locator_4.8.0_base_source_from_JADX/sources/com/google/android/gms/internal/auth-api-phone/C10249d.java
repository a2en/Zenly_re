package com.google.android.gms.internal.auth-api-phone;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.auth-api-phone.d */
public class C10249d implements IInterface {

    /* renamed from: a */
    private final IBinder f26868a;

    /* renamed from: b */
    private final String f26869b;

    protected C10249d(IBinder iBinder, String str) {
        this.f26868a = iBinder;
        this.f26869b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo27766a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26869b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f26868a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27767a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f26868a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
