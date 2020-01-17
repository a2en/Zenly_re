package com.google.android.gms.internal.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.common.b */
public class C10448b implements IInterface {

    /* renamed from: a */
    private final IBinder f27372a;

    /* renamed from: b */
    private final String f27373b;

    protected C10448b(IBinder iBinder, String str) {
        this.f27372a = iBinder;
        this.f27373b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28273a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f27373b);
        return obtain;
    }

    public IBinder asBinder() {
        return this.f27372a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo28274a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f27372a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }
}
