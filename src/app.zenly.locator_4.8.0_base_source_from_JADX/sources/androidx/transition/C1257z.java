package androidx.transition;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.transition.z */
class C1257z extends C1224c0 {

    /* renamed from: a */
    private static Method f4670a;

    /* renamed from: b */
    private static boolean f4671b;

    /* renamed from: c */
    private static Method f4672c;

    /* renamed from: d */
    private static boolean f4673d;

    C1257z() {
    }

    /* renamed from: a */
    public void mo6069a(View view) {
    }

    /* renamed from: a */
    public void mo6070a(View view, float f) {
        m6025b();
        Method method = f4670a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public float mo6071b(View view) {
        m6024a();
        Method method = f4672c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return super.mo6071b(view);
    }

    /* renamed from: c */
    public void mo6072c(View view) {
    }

    /* renamed from: a */
    private void m6024a() {
        if (!f4673d) {
            try {
                f4672c = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f4672c.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e);
            }
            f4673d = true;
        }
    }

    /* renamed from: b */
    private void m6025b() {
        if (!f4671b) {
            try {
                f4670a = View.class.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f4670a.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e);
            }
            f4671b = true;
        }
    }
}
