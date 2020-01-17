package app.zenly.locator.core.util;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: app.zenly.locator.core.util.l */
public final class C3224l {
    /* renamed from: a */
    public static String m10222a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Android SDK: ");
        sb.append(VERSION.SDK_INT);
        sb.append(" (");
        sb.append(VERSION.RELEASE);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m10223a(Context context) {
        return C3196c0.m10167a(context, context.getPackageName());
    }

    /* renamed from: a */
    public static void m10224a(Object obj, StringBuilder sb) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
