package com.google.android.finsky.externalreferrer;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IGetInstallReferrerService extends IInterface {

    /* renamed from: com.google.android.finsky.externalreferrer.IGetInstallReferrerService$a */
    public static abstract class C9967a extends Binder implements IGetInstallReferrerService {

        /* renamed from: com.google.android.finsky.externalreferrer.IGetInstallReferrerService$a$a */
        private static class C9968a implements IGetInstallReferrerService {

            /* renamed from: a */
            private IBinder f26165a;

            C9968a(IBinder iBinder) {
                this.f26165a = iBinder;
            }

            public IBinder asBinder() {
                return this.f26165a;
            }

            public Bundle getInstallReferrer(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f26165a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: a */
        public static IGetInstallReferrerService m24972a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IGetInstallReferrerService)) {
                return new C9968a(iBinder);
            }
            return (IGetInstallReferrerService) queryLocalInterface;
        }
    }

    Bundle getInstallReferrer(Bundle bundle) throws RemoteException;
}
