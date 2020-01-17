package androidx.browser.customtabs;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsService;
import android.support.customtabs.ICustomTabsService.C0003a;

/* renamed from: androidx.browser.customtabs.d */
public abstract class C0305d implements ServiceConnection {

    /* renamed from: androidx.browser.customtabs.d$a */
    class C0306a extends C0296b {
        C0306a(C0305d dVar, ICustomTabsService iCustomTabsService, ComponentName componentName) {
            super(iCustomTabsService, componentName);
        }
    }

    /* renamed from: a */
    public abstract void mo2149a(ComponentName componentName, C0296b bVar);

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        mo2149a(componentName, new C0306a(this, C0003a.m2a(iBinder), componentName));
    }
}
