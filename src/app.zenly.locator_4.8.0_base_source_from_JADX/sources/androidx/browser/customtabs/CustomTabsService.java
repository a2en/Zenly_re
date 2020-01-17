package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService.C0003a;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p214e.p228e.C7571a;

public abstract class CustomTabsService extends Service {

    /* renamed from: e */
    final Map<IBinder, DeathRecipient> f1318e = new C7571a();

    /* renamed from: f */
    private C0003a f1319f = new C0292a();

    /* renamed from: androidx.browser.customtabs.CustomTabsService$a */
    class C0292a extends C0003a {

        /* renamed from: androidx.browser.customtabs.CustomTabsService$a$a */
        class C0293a implements DeathRecipient {

            /* renamed from: a */
            final /* synthetic */ C0308f f1321a;

            C0293a(C0308f fVar) {
                this.f1321a = fVar;
            }

            public void binderDied() {
                CustomTabsService.this.mo2123a(this.f1321a);
            }
        }

        C0292a() {
        }

        public Bundle extraCommand(String str, Bundle bundle) {
            return CustomTabsService.this.mo2121a(str, bundle);
        }

        public boolean mayLaunchUrl(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, List<Bundle> list) {
            return CustomTabsService.this.mo2126a(new C0308f(iCustomTabsCallback), uri, bundle, list);
        }

        public boolean newSession(ICustomTabsCallback iCustomTabsCallback) {
            C0308f fVar = new C0308f(iCustomTabsCallback);
            try {
                C0293a aVar = new C0293a(fVar);
                synchronized (CustomTabsService.this.f1318e) {
                    iCustomTabsCallback.asBinder().linkToDeath(aVar, 0);
                    CustomTabsService.this.f1318e.put(iCustomTabsCallback.asBinder(), aVar);
                }
                return CustomTabsService.this.mo2128b(fVar);
            } catch (RemoteException unused) {
                return false;
            }
        }

        public int postMessage(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return CustomTabsService.this.mo2120a(new C0308f(iCustomTabsCallback), str, bundle);
        }

        public boolean requestPostMessageChannel(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return CustomTabsService.this.mo2125a(new C0308f(iCustomTabsCallback), uri);
        }

        public boolean updateVisuals(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return CustomTabsService.this.mo2127a(new C0308f(iCustomTabsCallback), bundle);
        }

        public boolean validateRelationship(ICustomTabsCallback iCustomTabsCallback, int i, Uri uri, Bundle bundle) {
            return CustomTabsService.this.mo2124a(new C0308f(iCustomTabsCallback), i, uri, bundle);
        }

        public boolean warmup(long j) {
            return CustomTabsService.this.mo2122a(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo2120a(C0308f fVar, String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bundle mo2121a(String str, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo2122a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo2123a(C0308f fVar) {
        try {
            synchronized (this.f1318e) {
                IBinder a = fVar.mo2153a();
                a.unlinkToDeath((DeathRecipient) this.f1318e.get(a), 0);
                this.f1318e.remove(a);
            }
            return true;
        } catch (NoSuchElementException unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo2124a(C0308f fVar, int i, Uri uri, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo2125a(C0308f fVar, Uri uri);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo2126a(C0308f fVar, Uri uri, Bundle bundle, List<Bundle> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo2127a(C0308f fVar, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo2128b(C0308f fVar);

    public IBinder onBind(Intent intent) {
        return this.f1319f;
    }
}
