package androidx.core.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.core.app.d */
public final class C0522d {

    /* renamed from: androidx.core.app.d$a */
    static class C0523a {

        /* renamed from: a */
        private static Method f2513a;

        /* renamed from: b */
        private static boolean f2514b;

        /* renamed from: c */
        private static Method f2515c;

        /* renamed from: d */
        private static boolean f2516d;

        /* renamed from: a */
        public static IBinder m2467a(Bundle bundle, String str) {
            String str2 = "BundleCompatBaseImpl";
            if (!f2514b) {
                try {
                    f2513a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    f2513a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str2, "Failed to retrieve getIBinder method", e);
                }
                f2514b = true;
            }
            Method method = f2513a;
            if (method != null) {
                try {
                    return (IBinder) method.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(str2, "Failed to invoke getIBinder via reflection", e2);
                    f2513a = null;
                }
            }
            return null;
        }

        /* renamed from: a */
        public static void m2468a(Bundle bundle, String str, IBinder iBinder) {
            String str2 = "BundleCompatBaseImpl";
            if (!f2516d) {
                try {
                    f2515c = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    f2515c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str2, "Failed to retrieve putIBinder method", e);
                }
                f2516d = true;
            }
            Method method = f2515c;
            if (method != null) {
                try {
                    method.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(str2, "Failed to invoke putIBinder via reflection", e2);
                    f2515c = null;
                }
            }
        }
    }

    /* renamed from: a */
    public static IBinder m2465a(Bundle bundle, String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return C0523a.m2467a(bundle, str);
    }

    /* renamed from: a */
    public static void m2466a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            C0523a.m2468a(bundle, str, iBinder);
        }
    }
}
