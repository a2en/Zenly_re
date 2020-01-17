package androidx.transition;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.b0 */
class C1222b0 extends C1216a0 {

    /* renamed from: i */
    private static Method f4615i;

    /* renamed from: j */
    private static boolean f4616j;

    C1222b0() {
    }

    /* renamed from: a */
    public void mo6068a(View view, int i, int i2, int i3, int i4) {
        m5936a();
        Method method = f4615i;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private void m5936a() {
        if (!f4616j) {
            try {
                f4615i = View.class.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                f4615i.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e);
            }
            f4616j = true;
        }
    }
}
