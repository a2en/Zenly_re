package zendesk.support;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Html;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import com.zendesk.logger.Logger;
import java.util.Locale;

public class UiUtils {
    private static UiUtils IMPL = new UiUtils();

    private UiUtils() {
    }

    public static CharSequence decodeHtmlEntities(String str) {
        if (VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 0);
        }
        return Html.fromHtml(str);
    }

    public static void dismissKeyboard(Activity activity) {
        IMPL.internalDismissKeyboard(activity);
    }

    public static int resolveColor(int i, Context context) {
        return IMPL.internalResolveColor(i, context);
    }

    public static void setTint(int i, Drawable drawable, View view) {
        IMPL.internalSetTint(i, drawable, view);
    }

    public static void setVisibility(View view, int i) {
        if (view == null) {
            Logger.m31614d("UiUtils", "View is null and can't change visibility", new Object[0]);
            return;
        }
        view.setVisibility(i);
    }

    public static int themeAttributeToColor(int i, Context context, int i2) {
        return IMPL.internalThemeAttributeToColor(i, context, i2);
    }

    public void internalDismissKeyboard(Activity activity) {
        String str = "UiUtils";
        if (activity == null) {
            Logger.m31614d(str, "Cannot dismiss the keyboard when fragment is detached or the activity is null.", new Object[0]);
            return;
        }
        Object systemService = activity.getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } else {
                Logger.m31614d(str, "Cannot hide soft input because window token could not be obtained", new Object[0]);
            }
        } else {
            Logger.m31614d(str, "Cannot hide soft input because we could not get the InputMethodManager", new Object[0]);
        }
    }

    public int internalResolveColor(int i, Context context) {
        return C0540a.m2536a(context, i);
    }

    public void internalSetTint(int i, Drawable drawable, View view) {
        if (drawable == null) {
            Logger.m31610b("UiUtils", "Drawable is null, cannot apply a tint", new Object[0]);
            return;
        }
        C0559a.m2650b(C0559a.m2657i(drawable).mutate(), i);
        if (view != null) {
            view.invalidate();
        }
    }

    public int internalThemeAttributeToColor(int i, Context context, int i2) {
        int i3;
        String str = "UiUtils";
        if (i == 0 || context == null || i2 == 0) {
            Logger.m31608a(str, "themeAttributeId, context, and fallbackColorId are required.", new Object[0]);
            return -16777216;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            Logger.m31610b(str, String.format(Locale.US, "Resource %d not found. Resource is either missing or you are using a non-ui context.", new Object[]{Integer.valueOf(i)}), new Object[0]);
            return resolveColor(i2, context);
        }
        int i4 = typedValue.resourceId;
        if (i4 == 0) {
            i3 = typedValue.data;
        } else {
            i3 = resolveColor(i4, context);
        }
        return i3;
    }

    public static void dismissKeyboard(View view) {
        IMPL.internalDismissKeyboard(view);
    }

    public void internalDismissKeyboard(View view) {
        String str = "UiUtils";
        if (view == null) {
            Logger.m31614d(str, "Cannot hide soft input because window token could not be obtained", new Object[0]);
            return;
        }
        Object systemService = view.getContext().getSystemService("input_method");
        if (systemService instanceof InputMethodManager) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } else {
            Logger.m31614d(str, "Cannot hide soft input because we could not get the InputMethodManager", new Object[0]);
        }
    }
}
