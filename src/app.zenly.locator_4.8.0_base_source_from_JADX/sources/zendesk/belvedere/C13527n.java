package zendesk.belvedere;

import android.content.Context;
import androidx.core.content.C0540a;

/* renamed from: zendesk.belvedere.n */
class C13527n {
    /* renamed from: a */
    static boolean m35833a(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String equals : strArr) {
                    if (equals.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b */
    static boolean m35834b(Context context, String str) {
        return C0540a.m2537a(context, str) == 0;
    }
}
