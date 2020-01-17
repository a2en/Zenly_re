package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.util.Log;

/* renamed from: androidx.browser.customtabs.f */
public class C0308f {

    /* renamed from: a */
    final ICustomTabsCallback f1353a;

    /* renamed from: androidx.browser.customtabs.f$a */
    class C0309a extends C0295a {
        C0309a() {
        }

        /* renamed from: a */
        public void mo2133a(int i, Bundle bundle) {
            try {
                C0308f.this.f1353a.onNavigationEvent(i, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: b */
        public void mo2136b(String str, Bundle bundle) {
            try {
                C0308f.this.f1353a.onPostMessage(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: a */
        public void mo2135a(String str, Bundle bundle) {
            try {
                C0308f.this.f1353a.extraCallback(str, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: a */
        public void mo2134a(Bundle bundle) {
            try {
                C0308f.this.f1353a.onMessageChannelReady(bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }

        /* renamed from: a */
        public void mo2132a(int i, Uri uri, boolean z, Bundle bundle) {
            try {
                C0308f.this.f1353a.onRelationshipValidationResult(i, uri, z, bundle);
            } catch (RemoteException unused) {
                Log.e("CustomTabsSessionToken", "RemoteException during ICustomTabsCallback transaction");
            }
        }
    }

    C0308f(ICustomTabsCallback iCustomTabsCallback) {
        this.f1353a = iCustomTabsCallback;
        new C0309a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public IBinder mo2153a() {
        return this.f1353a.asBinder();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0308f)) {
            return false;
        }
        return ((C0308f) obj).mo2153a().equals(this.f1353a.asBinder());
    }

    public int hashCode() {
        return mo2153a().hashCode();
    }
}
