package app.zenly.locator.core.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.util.c0 */
public final class C3196c0 {
    static {
        new C3196c0();
    }

    private C3196c0() {
    }

    /* renamed from: a */
    public static final String m10167a(Context context, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "packageName");
        try {
            String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            C12932j.m33815a((Object) str2, "context.packageManager.g…ckageName, 0).versionName");
            return str2;
        } catch (NameNotFoundException unused) {
            return "";
        }
    }
}
