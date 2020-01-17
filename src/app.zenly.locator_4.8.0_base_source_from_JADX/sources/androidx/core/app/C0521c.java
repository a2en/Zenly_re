package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: androidx.core.app.c */
public final class C0521c {
    /* renamed from: a */
    public static String m2464a(String str) {
        if (VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }

    /* renamed from: a */
    public static int m2463a(Context context, String str, String str2) {
        if (VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }
}
