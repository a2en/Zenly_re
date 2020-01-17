package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService.C9967a;
import java.util.List;
import p333g.p336b.p337a.p338a.C12024a;

/* renamed from: com.android.installreferrer.api.b */
class C8698b extends C8695a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f22389a = 0;

    /* renamed from: b */
    private final Context f22390b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IGetInstallReferrerService f22391c;

    /* renamed from: d */
    private ServiceConnection f22392d;

    /* renamed from: com.android.installreferrer.api.b$b */
    private final class C8700b implements ServiceConnection {

        /* renamed from: a */
        private final InstallReferrerStateListener f22393a;

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C12024a.m31676a("InstallReferrerClient", "Install Referrer service connected.");
            C8698b.this.f22391c = C9967a.m24972a(iBinder);
            C8698b.this.f22389a = 2;
            this.f22393a.onInstallReferrerSetupFinished(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C12024a.m31677b("InstallReferrerClient", "Install Referrer service disconnected.");
            C8698b.this.f22391c = null;
            C8698b.this.f22389a = 0;
            this.f22393a.onInstallReferrerServiceDisconnected();
        }

        private C8700b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f22393a = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public C8698b(Context context) {
        this.f22390b = context.getApplicationContext();
    }

    /* renamed from: d */
    private boolean m20465d() {
        try {
            if (this.f22390b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public C8701c mo23481b() throws RemoteException {
        if (mo23482c()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f22390b.getPackageName());
            try {
                return new C8701c(this.f22391c.getInstallReferrer(bundle));
            } catch (RemoteException e) {
                C12024a.m31677b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f22389a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    /* renamed from: c */
    public boolean mo23482c() {
        return (this.f22389a != 2 || this.f22391c == null || this.f22392d == null) ? false : true;
    }

    /* renamed from: a */
    public void mo23480a(InstallReferrerStateListener installReferrerStateListener) {
        String str = "InstallReferrerClient";
        if (mo23482c()) {
            C12024a.m31676a(str, "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.onInstallReferrerSetupFinished(0);
            return;
        }
        int i = this.f22389a;
        if (i == 1) {
            C12024a.m31677b(str, "Client is already in the process of connecting to the service.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else if (i == 3) {
            C12024a.m31677b(str, "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.onInstallReferrerSetupFinished(3);
        } else {
            C12024a.m31676a(str, "Starting install referrer service setup.");
            this.f22392d = new C8700b(installReferrerStateListener);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            String str2 = "com.android.vending";
            intent.setComponent(new ComponentName(str2, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List queryIntentServices = this.f22390b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    String str3 = serviceInfo.packageName;
                    String str4 = resolveInfo.serviceInfo.name;
                    if (!str2.equals(str3) || str4 == null || !m20465d()) {
                        C12024a.m31677b(str, "Play Store missing or incompatible. Version 8.3.73 or later required.");
                        this.f22389a = 0;
                        installReferrerStateListener.onInstallReferrerSetupFinished(2);
                        return;
                    }
                    if (this.f22390b.bindService(new Intent(intent), this.f22392d, 1)) {
                        C12024a.m31676a(str, "Service was bonded successfully.");
                        return;
                    }
                    C12024a.m31677b(str, "Connection to service is blocked.");
                    this.f22389a = 0;
                    installReferrerStateListener.onInstallReferrerSetupFinished(1);
                    return;
                }
            }
            this.f22389a = 0;
            C12024a.m31676a(str, "Install Referrer service unavailable on device.");
            installReferrerStateListener.onInstallReferrerSetupFinished(2);
        }
    }

    /* renamed from: a */
    public void mo23479a() {
        this.f22389a = 3;
        if (this.f22392d != null) {
            C12024a.m31676a("InstallReferrerClient", "Unbinding from service.");
            this.f22390b.unbindService(this.f22392d);
            this.f22392d = null;
        }
        this.f22391c = null;
    }
}
