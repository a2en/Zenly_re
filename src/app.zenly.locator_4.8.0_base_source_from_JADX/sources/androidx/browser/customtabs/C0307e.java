package androidx.browser.customtabs;

import android.content.ComponentName;
import android.os.IBinder;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

/* renamed from: androidx.browser.customtabs.e */
public final class C0307e {

    /* renamed from: a */
    private final ICustomTabsCallback f1351a;

    /* renamed from: b */
    private final ComponentName f1352b;

    C0307e(ICustomTabsService iCustomTabsService, ICustomTabsCallback iCustomTabsCallback, ComponentName componentName) {
        this.f1351a = iCustomTabsCallback;
        this.f1352b = componentName;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public IBinder mo2151a() {
        return this.f1351a.asBinder();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public ComponentName mo2152b() {
        return this.f1352b;
    }
}
