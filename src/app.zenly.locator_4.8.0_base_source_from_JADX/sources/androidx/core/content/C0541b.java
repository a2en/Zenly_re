package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.C0521c;

/* renamed from: androidx.core.content.b */
public final class C0541b {
    /* renamed from: a */
    public static int m2549a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0521c.m2464a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (C0521c.m2463a(context, a, str2) != 0) {
            return -2;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m2550b(Context context, String str) {
        return m2549a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m2548a(Context context, String str) {
        return m2549a(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }
}
