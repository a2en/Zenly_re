package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.base.b */
public class C10260b implements IInterface {

    /* renamed from: a */
    private final IBinder f26874a;

    /* renamed from: b */
    private final String f26875b;

    protected C10260b(IBinder iBinder, String str) {
        this.f26874a = iBinder;
        this.f26875b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo27780a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26875b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f26874a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo27781a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f26874a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
