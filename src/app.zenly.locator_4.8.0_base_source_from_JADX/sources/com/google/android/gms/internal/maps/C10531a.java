package com.google.android.gms.internal.maps;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.maps.a */
public class C10531a implements IInterface {

    /* renamed from: a */
    private final IBinder f27470a;

    /* renamed from: b */
    private final String f27471b;

    protected C10531a(IBinder iBinder, String str) {
        this.f27470a = iBinder;
        this.f27471b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28411a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27471b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f27470a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28414b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f27470a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28412a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f27470a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
