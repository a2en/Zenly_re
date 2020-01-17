package android.support.p001v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: android.support.v4.app.INotificationSideChannel */
public interface INotificationSideChannel extends IInterface {

    /* renamed from: android.support.v4.app.INotificationSideChannel$a */
    public static abstract class C0006a extends Binder implements INotificationSideChannel {

        /* renamed from: android.support.v4.app.INotificationSideChannel$a$a */
        private static class C0007a implements INotificationSideChannel {

            /* renamed from: a */
            private IBinder f2a;

            C0007a(IBinder iBinder) {
                this.f2a = iBinder;
            }

            public IBinder asBinder() {
                return this.f2a;
            }

            public void cancel(String str, int i, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    this.f2a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void cancelAll(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    this.f2a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2a.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C0006a() {
            attachInterface(this, "android.support.v4.app.INotificationSideChannel");
        }

        /* renamed from: a */
        public static INotificationSideChannel m3a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                return new C0007a(iBinder);
            }
            return (INotificationSideChannel) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = "android.support.v4.app.INotificationSideChannel";
            if (i == 1) {
                parcel.enforceInterface(str);
                notify(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface(str);
                cancel(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                cancelAll(parcel.readString());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    void cancel(String str, int i, String str2) throws RemoteException;

    void cancelAll(String str) throws RemoteException;

    void notify(String str, int i, String str2, Notification notification) throws RemoteException;
}
