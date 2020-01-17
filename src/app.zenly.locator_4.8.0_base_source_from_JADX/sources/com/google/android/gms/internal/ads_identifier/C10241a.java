package com.google.android.gms.internal.ads_identifier;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads_identifier.a */
public class C10241a implements IInterface {

    /* renamed from: a */
    private final IBinder f26862a;

    /* renamed from: b */
    private final String f26863b;

    protected C10241a(IBinder iBinder, String str) {
        this.f26862a = iBinder;
        this.f26863b = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo27755a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f26863b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Parcel mo27756a(int i, Parcel parcel) throws RemoteException {
        parcel = Parcel.obtain();
        try {
            this.f26862a.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
        }
    }

    public IBinder asBinder() {
        return this.f26862a;
    }
}
