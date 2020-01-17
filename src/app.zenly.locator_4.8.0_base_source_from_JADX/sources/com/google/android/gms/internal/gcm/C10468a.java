package com.google.android.gms.internal.gcm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.gcm.a */
public class C10468a implements IInterface {

    /* renamed from: a */
    private final IBinder f27384a;

    /* renamed from: b */
    private final String f27385b;

    protected C10468a(IBinder iBinder, String str) {
        this.f27384a = iBinder;
        this.f27385b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28295a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27385b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f27384a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28298b(int i, Parcel parcel) throws RemoteException {
        try {
            this.f27384a.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo28296a(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f27384a.transact(2, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
