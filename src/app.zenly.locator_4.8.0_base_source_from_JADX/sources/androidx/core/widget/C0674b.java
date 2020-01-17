package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: androidx.core.widget.b */
public final class C0674b {

    /* renamed from: a */
    private static Field f2904a;

    /* renamed from: b */
    private static boolean f2905b;

    /* renamed from: a */
    public static void m3160a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof TintableCompoundButton) {
            ((TintableCompoundButton) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m3161a(CompoundButton compoundButton, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof TintableCompoundButton) {
            ((TintableCompoundButton) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    /* renamed from: a */
    public static Drawable m3159a(CompoundButton compoundButton) {
        if (VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        String str = "CompoundButtonCompat";
        if (!f2905b) {
            try {
                f2904a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2904a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(str, "Failed to retrieve mButtonDrawable field", e);
            }
            f2905b = true;
        }
        Field field = f2904a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i(str, "Failed to get button drawable via reflection", e2);
                f2904a = null;
            }
        }
        return null;
    }
}
