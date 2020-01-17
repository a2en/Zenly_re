package androidx.browser.customtabs;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.C0522d;

/* renamed from: androidx.browser.customtabs.g */
public class C0310g {
    /* renamed from: a */
    public static void m1249a(Context context, C0303c cVar, Uri uri) {
        if (C0522d.m2465a(cVar.f1344a.getExtras(), "android.support.customtabs.extra.SESSION") != null) {
            cVar.f1344a.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
            cVar.mo2143a(context, uri);
            return;
        }
        throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
    }
}
