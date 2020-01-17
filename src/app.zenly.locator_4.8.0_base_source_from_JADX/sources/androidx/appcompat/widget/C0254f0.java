package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import androidx.core.view.ViewCompat;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.f0 */
public class C0254f0 {

    /* renamed from: a */
    private static Method f1157a;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f1157a = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
                if (!f1157a.isAccessible()) {
                    f1157a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }

    /* renamed from: a */
    public static boolean m992a(View view) {
        return ViewCompat.m2862o(view) == 1;
    }

    /* renamed from: b */
    public static void m993b(View view) {
        String str = "Could not invoke makeOptionalFitsSystemWindows";
        String str2 = "ViewUtils";
        if (VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d(str2, "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            } catch (InvocationTargetException e) {
                Log.d(str2, str, e);
            } catch (IllegalAccessException e2) {
                Log.d(str2, str, e2);
            }
        }
    }

    /* renamed from: a */
    public static void m991a(View view, Rect rect, Rect rect2) {
        Method method = f1157a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
            }
        }
    }
}
