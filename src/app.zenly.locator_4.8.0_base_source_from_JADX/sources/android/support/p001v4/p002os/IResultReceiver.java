package android.support.p001v4.p002os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.os.IResultReceiver */
public interface IResultReceiver extends IInterface {

    /* renamed from: android.support.v4.os.IResultReceiver$a */
    public static abstract class C0077a extends Binder implements IResultReceiver {

        /* renamed from: android.support.v4.os.IResultReceiver$a$a */
        private static class C0078a implements IResultReceiver {

            /* renamed from: a */
            private IBinder f119a;

            C0078a(IBinder iBinder) {
                this.f119a = iBinder;
            }

            public IBinder asBinder() {
                return this.f119a;
            }

            public void send(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.os.IResultReceiver");
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f119a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0077a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        /* renamed from: a */
        public static IResultReceiver m171a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IResultReceiver)) {
                return new C0078a(iBinder);
            }
            return (IResultReceiver) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "android.support.v4.os.IResultReceiver";
            if (i == 1) {
                parcel.enforceInterface(str);
                send(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    void send(int i, Bundle bundle) throws RemoteException;
}
