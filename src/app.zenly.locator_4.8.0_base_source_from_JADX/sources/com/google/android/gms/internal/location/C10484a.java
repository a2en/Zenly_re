package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.location.a */
public class C10484a implements IInterface {

    /* renamed from: a */
    private final IBinder f27396a;

    /* renamed from: b */
    private final String f27397b;

    protected C10484a(IBinder iBinder, String str) {
        this.f27396a = iBinder;
        this.f27397b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28309a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27397b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28310a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f27396a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f27396a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo28312b(int i, Parcel parcel) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        try {
            this.f27396a.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo28313c(int i, Parcel parcel) throws RemoteException {
        try {
            this.f27396a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
