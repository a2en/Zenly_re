package androidx.browser.customtabs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.C0514a;
import androidx.core.app.C0522d;
import androidx.core.content.C0540a;
import java.util.ArrayList;

/* renamed from: androidx.browser.customtabs.c */
public final class C0303c {

    /* renamed from: a */
    public final Intent f1344a;

    /* renamed from: b */
    public final Bundle f1345b;

    /* renamed from: androidx.browser.customtabs.c$a */
    public static final class C0304a {

        /* renamed from: a */
        private final Intent f1346a;

        /* renamed from: b */
        private ArrayList<Bundle> f1347b;

        /* renamed from: c */
        private Bundle f1348c;

        /* renamed from: d */
        private ArrayList<Bundle> f1349d;

        /* renamed from: e */
        private boolean f1350e;

        public C0304a() {
            this(null);
        }

        /* renamed from: a */
        public C0304a mo2144a(int i) {
            this.f1346a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
            return this;
        }

        /* renamed from: b */
        public C0304a mo2148b(Context context, int i, int i2) {
            this.f1348c = C0514a.m2451a(context, i, i2).mo3028a();
            return this;
        }

        public C0304a(C0307e eVar) {
            this.f1346a = new Intent("android.intent.action.VIEW");
            IBinder iBinder = null;
            this.f1347b = null;
            this.f1348c = null;
            this.f1349d = null;
            this.f1350e = true;
            if (eVar != null) {
                this.f1346a.setPackage(eVar.mo2152b().getPackageName());
            }
            Bundle bundle = new Bundle();
            if (eVar != null) {
                iBinder = eVar.mo2151a();
            }
            C0522d.m2466a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            this.f1346a.putExtras(bundle);
        }

        /* renamed from: a */
        public C0304a mo2146a(boolean z) {
            this.f1346a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        /* renamed from: a */
        public C0304a mo2145a(Context context, int i, int i2) {
            this.f1346a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C0514a.m2451a(context, i, i2).mo3028a());
            return this;
        }

        /* renamed from: a */
        public C0303c mo2147a() {
            ArrayList<Bundle> arrayList = this.f1347b;
            if (arrayList != null) {
                this.f1346a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f1349d;
            if (arrayList2 != null) {
                this.f1346a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f1346a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f1350e);
            return new C0303c(this.f1346a, this.f1348c);
        }
    }

    C0303c(Intent intent, Bundle bundle) {
        this.f1344a = intent;
        this.f1345b = bundle;
    }

    /* renamed from: a */
    public void mo2143a(Context context, Uri uri) {
        this.f1344a.setData(uri);
        C0540a.m2540a(context, this.f1344a, this.f1345b);
    }
}
