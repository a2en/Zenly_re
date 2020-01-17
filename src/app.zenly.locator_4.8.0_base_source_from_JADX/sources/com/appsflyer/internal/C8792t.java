package com.appsflyer.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.appsflyer.internal.t */
public final class C8792t {

    /* renamed from: com.appsflyer.internal.t$b */
    static final class C8793b implements IInterface {

        /* renamed from: ˏ */
        private IBinder f22776;

        C8793b(IBinder iBinder) {
            this.f22776 = iBinder;
        }

        public final IBinder asBinder() {
            return this.f22776;
        }

        /* renamed from: ˋ */
        public final String mo23808() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f22776.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: ॱ */
        public final boolean mo23809() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z = true;
                obtain.writeInt(1);
                this.f22776.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z = false;
                }
                return z;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    /* renamed from: com.appsflyer.internal.t$c */
    static final class C8794c {

        /* renamed from: ˊ */
        final String f22777;

        /* renamed from: ˋ */
        final boolean f22778;

        C8794c(String str, boolean z) {
            this.f22777 = str;
            this.f22778 = z;
        }
    }

    /* renamed from: com.appsflyer.internal.t$d */
    static final class C8795d implements ServiceConnection {

        /* renamed from: ˊ */
        boolean f22779;

        /* renamed from: ˏ */
        final LinkedBlockingQueue<IBinder> f22780;

        private C8795d() {
            this.f22780 = new LinkedBlockingQueue<>(1);
            this.f22779 = false;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f22780.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        /* synthetic */ C8795d(byte b) {
            this();
        }
    }

    C8792t() {
    }

    /* renamed from: ˊ */
    static C8794c m20760(Context context) throws Exception {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                C8795d dVar = new C8795d(0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (!context.bindService(intent, dVar, 1)) {
                        if (context != null) {
                            context.unbindService(dVar);
                        }
                        throw new IOException("Google Play connection failed");
                    } else if (!dVar.f22779) {
                        dVar.f22779 = true;
                        C8793b bVar = new C8793b((IBinder) dVar.f22780.take());
                        C8794c cVar = new C8794c(bVar.mo23808(), bVar.mo23809());
                        if (context != null) {
                            context.unbindService(dVar);
                        }
                        return cVar;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    if (context != null) {
                        context.unbindService(dVar);
                    }
                    throw th;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }
}
