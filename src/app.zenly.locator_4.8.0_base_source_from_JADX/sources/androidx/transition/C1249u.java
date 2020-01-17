package androidx.transition;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.u */
class C1249u {

    /* renamed from: a */
    private static Method f4658a;

    /* renamed from: b */
    private static boolean f4659b;

    /* renamed from: a */
    static void m5994a(ViewGroup viewGroup, boolean z) {
        String str = "ViewUtilsApi18";
        m5993a();
        Method method = f4658a;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e) {
                Log.i(str, "Failed to invoke suppressLayout method", e);
            } catch (InvocationTargetException e2) {
                Log.i(str, "Error invoking suppressLayout method", e2);
            }
        }
    }

    /* renamed from: a */
    private static void m5993a() {
        if (!f4659b) {
            try {
                f4658a = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f4658a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            f4659b = true;
        }
    }
}
