package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback.C0001a;

public interface IPostMessageService extends IInterface {

    /* renamed from: android.support.customtabs.IPostMessageService$a */
    public static abstract class C0005a extends Binder implements IPostMessageService {
        public C0005a() {
            attachInterface(this, "android.support.customtabs.IPostMessageService");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle = null;
            String str = "android.support.customtabs.IPostMessageService";
            if (i == 2) {
                parcel.enforceInterface(str);
                ICustomTabsCallback a = C0001a.m1a(parcel.readStrongBinder());
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                onMessageChannelReady(a, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface(str);
                ICustomTabsCallback a2 = C0001a.m1a(parcel.readStrongBinder());
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                }
                onPostMessage(a2, readString, bundle);
                parcel2.writeNoException();
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(str);
                return true;
            }
        }
    }

    void onMessageChannelReady(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) throws RemoteException;

    void onPostMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) throws RemoteException;
}
