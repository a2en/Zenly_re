package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.clearcut.a */
public class C10264a implements IInterface {

    /* renamed from: a */
    private final IBinder f26876a;

    /* renamed from: b */
    private final String f26877b;

    protected C10264a(IBinder iBinder, String str) {
        this.f26876a = iBinder;
        this.f26877b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo27786a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26877b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27787a(int i, Parcel parcel) throws RemoteException {
        try {
            this.f26876a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f26876a;
    }
}
