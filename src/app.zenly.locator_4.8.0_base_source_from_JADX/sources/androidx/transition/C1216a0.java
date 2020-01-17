package androidx.transition;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.a0 */
class C1216a0 extends C1257z {

    /* renamed from: e */
    private static Method f4600e;

    /* renamed from: f */
    private static boolean f4601f;

    /* renamed from: g */
    private static Method f4602g;

    /* renamed from: h */
    private static boolean f4603h;

    C1216a0() {
    }

    /* renamed from: a */
    public void mo6066a(View view, Matrix matrix) {
        m5913a();
        Method method = f4600e;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: b */
    public void mo6067b(View view, Matrix matrix) {
        m5914b();
        Method method = f4602g;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    /* renamed from: a */
    private void m5913a() {
        if (!f4601f) {
            try {
                f4600e = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f4600e.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e);
            }
            f4601f = true;
        }
    }

    /* renamed from: b */
    private void m5914b() {
        if (!f4603h) {
            try {
                f4602g = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                f4602g.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e);
            }
            f4603h = true;
        }
    }
}
