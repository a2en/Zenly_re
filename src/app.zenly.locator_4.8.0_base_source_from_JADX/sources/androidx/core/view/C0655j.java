package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.j */
public final class C0655j {

    /* renamed from: a */
    private static Method f2827a;

    static {
        if (VERSION.SDK_INT == 25) {
            try {
                f2827a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    private static float m3052a(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 25) {
            Method method = f2827a;
            if (method != null) {
                try {
                    return (float) ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
                } catch (Exception unused) {
                    Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
                }
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m3054b(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return m3052a(viewConfiguration, context);
    }

    /* renamed from: c */
    public static float m3055c(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return m3052a(viewConfiguration, context);
    }

    /* renamed from: d */
    public static boolean m3056d(ViewConfiguration viewConfiguration, Context context) {
        if (VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }

    /* renamed from: a */
    public static int m3053a(ViewConfiguration viewConfiguration) {
        if (VERSION.SDK_INT >= 28) {
            return viewConfiguration.getScaledHoverSlop();
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }
}
