package androidx.core.widget;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.view.C0641c;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: androidx.core.widget.g */
public final class C0679g {

    /* renamed from: a */
    private static Method f2907a;

    /* renamed from: b */
    private static boolean f2908b;

    /* renamed from: c */
    private static Field f2909c;

    /* renamed from: d */
    private static boolean f2910d;

    /* renamed from: a */
    public static void m3173a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        if (VERSION.SDK_INT >= 19) {
            popupWindow.showAsDropDown(view, i, i2, i3);
            return;
        }
        if ((C0641c.m3002a(i3, ViewCompat.m2862o(view)) & 7) == 5) {
            i -= popupWindow.getWidth() - view.getWidth();
        }
        popupWindow.showAsDropDown(view, i, i2);
    }

    /* renamed from: a */
    public static void m3174a(PopupWindow popupWindow, boolean z) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            popupWindow.setOverlapAnchor(z);
        } else if (i >= 21) {
            String str = "PopupWindowCompatApi21";
            if (!f2910d) {
                try {
                    f2909c = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                    f2909c.setAccessible(true);
                } catch (NoSuchFieldException e) {
                    Log.i(str, "Could not fetch mOverlapAnchor field from PopupWindow", e);
                }
                f2910d = true;
            }
            Field field = f2909c;
            if (field != null) {
                try {
                    field.set(popupWindow, Boolean.valueOf(z));
                } catch (IllegalAccessException e2) {
                    Log.i(str, "Could not set overlap anchor field in PopupWindow", e2);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3172a(PopupWindow popupWindow, int i) {
        if (VERSION.SDK_INT >= 23) {
            popupWindow.setWindowLayoutType(i);
            return;
        }
        if (!f2908b) {
            try {
                f2907a = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", new Class[]{Integer.TYPE});
                f2907a.setAccessible(true);
            } catch (Exception unused) {
            }
            f2908b = true;
        }
        Method method = f2907a;
        if (method != null) {
            try {
                method.invoke(popupWindow, new Object[]{Integer.valueOf(i)});
            } catch (Exception unused2) {
            }
        }
    }
}
