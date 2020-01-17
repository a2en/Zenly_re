package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C10447a;
import com.google.android.gms.internal.common.C10449c;

public interface IGmsCallbacks extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.IGmsCallbacks$a */
    public static abstract class C10096a extends C10447a implements IGmsCallbacks {
        public C10096a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo27419a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C10449c.m26838a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                zza(parcel.readInt(), (Bundle) C10449c.m26838a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                zza(parcel.readInt(), parcel.readStrongBinder(), (zza) C10449c.m26838a(parcel, zza.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    void zza(int i, Bundle bundle) throws RemoteException;

    void zza(int i, IBinder iBinder, zza zza) throws RemoteException;
}
