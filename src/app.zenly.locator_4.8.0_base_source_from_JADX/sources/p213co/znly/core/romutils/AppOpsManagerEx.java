package p213co.znly.core.romutils;

import android.app.AppOpsManager;
import java.lang.reflect.InvocationTargetException;

/* renamed from: co.znly.core.romutils.AppOpsManagerEx */
final class AppOpsManagerEx {
    private AppOpsManagerEx() {
    }

    static int checkOpNoThrow(AppOpsManager appOpsManager, int i, int i2, String str) {
        try {
            return ((Integer) appOpsManager.getClass().getDeclaredMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), str})).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 2;
        }
    }

    static Integer getOpByName(AppOpsManager appOpsManager, String str) {
        try {
            return Integer.valueOf(((Integer) appOpsManager.getClass().getDeclaredField(str).get(AppOpsManager.class)).intValue());
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return null;
        }
    }
}
