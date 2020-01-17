package p389io.fabric.sdk.android.services.common;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p389io.fabric.sdk.android.C12154c;

/* renamed from: io.fabric.sdk.android.services.common.e */
class C12174e implements AdvertisingInfoStrategy {

    /* renamed from: a */
    private final Context f31656a;

    /* renamed from: io.fabric.sdk.android.services.common.e$b */
    private static final class C12176b implements ServiceConnection {

        /* renamed from: a */
        private boolean f31657a;

        /* renamed from: b */
        private final LinkedBlockingQueue<IBinder> f31658b;

        private C12176b() {
            this.f31657a = false;
            this.f31658b = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder mo36054a() {
            if (this.f31657a) {
                C12154c.m32113f().mo35956e("Fabric", "getBinder already called");
            }
            this.f31657a = true;
            try {
                return (IBinder) this.f31658b.poll(200, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f31658b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f31658b.clear();
        }
    }

    /* renamed from: io.fabric.sdk.android.services.common.e$c */
    private static final class C12177c implements IInterface {

        /* renamed from: a */
        private final IBinder f31659a;

        public C12177c(IBinder iBinder) {
            this.f31659a = iBinder;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            p389io.fabric.sdk.android.C12154c.m32113f().mo35954d("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking");
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo36057a() throws android.os.RemoteException {
            /*
                r6 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                r2 = 0
                java.lang.String r3 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r3)     // Catch:{ Exception -> 0x0025 }
                r3 = 1
                r0.writeInt(r3)     // Catch:{ Exception -> 0x0025 }
                android.os.IBinder r4 = r6.f31659a     // Catch:{ Exception -> 0x0025 }
                r5 = 2
                r4.transact(r5, r0, r1, r2)     // Catch:{ Exception -> 0x0025 }
                r1.readException()     // Catch:{ Exception -> 0x0025 }
                int r4 = r1.readInt()     // Catch:{ Exception -> 0x0025 }
                if (r4 == 0) goto L_0x0030
                r2 = 1
                goto L_0x0030
            L_0x0023:
                r2 = move-exception
                goto L_0x0037
            L_0x0025:
                io.fabric.sdk.android.Logger r3 = p389io.fabric.sdk.android.C12154c.m32113f()     // Catch:{ all -> 0x0023 }
                java.lang.String r4 = "Fabric"
                java.lang.String r5 = "Could not get parcel from Google Play Service to capture Advertising limitAdTracking"
                r3.mo35954d(r4, r5)     // Catch:{ all -> 0x0023 }
            L_0x0030:
                r1.recycle()
                r0.recycle()
                return r2
            L_0x0037:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.fabric.sdk.android.services.common.C12174e.C12177c.mo36057a():boolean");
        }

        public IBinder asBinder() {
            return this.f31659a;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Can't wrap try/catch for region: R(4:5|6|7|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0022, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
            p389io.fabric.sdk.android.C12154c.m32113f().mo35954d("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x003d, code lost:
            throw r2;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0024 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String getId() throws android.os.RemoteException {
            /*
                r5 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                java.lang.String r2 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r2)     // Catch:{ Exception -> 0x0024 }
                android.os.IBinder r2 = r5.f31659a     // Catch:{ Exception -> 0x0024 }
                r3 = 1
                r4 = 0
                r2.transact(r3, r0, r1, r4)     // Catch:{ Exception -> 0x0024 }
                r1.readException()     // Catch:{ Exception -> 0x0024 }
                java.lang.String r2 = r1.readString()     // Catch:{ Exception -> 0x0024 }
                r1.recycle()
                r0.recycle()
                goto L_0x0036
            L_0x0022:
                r2 = move-exception
                goto L_0x0037
            L_0x0024:
                io.fabric.sdk.android.Logger r2 = p389io.fabric.sdk.android.C12154c.m32113f()     // Catch:{ all -> 0x0022 }
                java.lang.String r3 = "Fabric"
                java.lang.String r4 = "Could not get parcel from Google Play Service to capture AdvertisingId"
                r2.mo35954d(r3, r4)     // Catch:{ all -> 0x0022 }
                r1.recycle()
                r0.recycle()
                r2 = 0
            L_0x0036:
                return r2
            L_0x0037:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p389io.fabric.sdk.android.services.common.C12174e.C12177c.getId():java.lang.String");
        }
    }

    public C12174e(Context context) {
        this.f31656a = context.getApplicationContext();
    }

    public C12170b getAdvertisingInfo() {
        String str = "Could not bind to Google Play Service to capture AdvertisingId";
        String str2 = "Fabric";
        if (Looper.myLooper() == Looper.getMainLooper()) {
            C12154c.m32113f().mo35954d(str2, "AdvertisingInfoServiceStrategy cannot be called on the main thread");
            return null;
        }
        try {
            this.f31656a.getPackageManager().getPackageInfo("com.android.vending", 0);
            C12176b bVar = new C12176b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (this.f31656a.bindService(intent, bVar, 1)) {
                    try {
                        C12177c cVar = new C12177c(bVar.mo36054a());
                        C12170b bVar2 = new C12170b(cVar.getId(), cVar.mo36057a());
                        this.f31656a.unbindService(bVar);
                        return bVar2;
                    } catch (Exception e) {
                        C12154c.m32113f().mo35968w(str2, "Exception in binding to Google Play Service to capture AdvertisingId", e);
                        this.f31656a.unbindService(bVar);
                    }
                } else {
                    C12154c.m32113f().mo35954d(str2, str);
                    return null;
                }
            } catch (Throwable th) {
                C12154c.m32113f().mo35955d(str2, str, th);
            }
        } catch (NameNotFoundException unused) {
            C12154c.m32113f().mo35954d(str2, "Unable to find Google Play Services package name");
            return null;
        } catch (Exception e2) {
            C12154c.m32113f().mo35955d(str2, "Unable to determine if Google Play Services is available", e2);
            return null;
        }
    }
}
