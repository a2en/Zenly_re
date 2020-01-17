package zendesk.commonui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import com.zendesk.logger.Logger;
import java.util.Locale;

/* renamed from: zendesk.commonui.m */
public class C13562m {
    /* renamed from: a */
    public static int m35899a(int i, Context context, int i2) {
        int i3;
        String str = "UiUtils";
        if (i == 0 || context == null || i2 == 0) {
            Logger.m31608a(str, "themeAttributeId, context, and fallbackColorId are required.", new Object[0]);
            return -16777216;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            Logger.m31610b(str, String.format(Locale.US, "Resource %d not found. Resource is either missing or you are using a non-ui context.", new Object[]{Integer.valueOf(i)}), new Object[0]);
            return m35898a(i2, context);
        }
        int i4 = typedValue.resourceId;
        if (i4 == 0) {
            i3 = typedValue.data;
        } else {
            i3 = m35898a(i4, context);
        }
        return i3;
    }

    /* renamed from: a */
    public static int m35898a(int i, Context context) {
        return C0540a.m2536a(context, i);
    }

    /* renamed from: a */
    public static void m35900a(int i, Drawable drawable, View view) {
        if (drawable == null) {
            Logger.m31610b("UiUtils", "Drawable is null, cannot apply a tint", new Object[0]);
            return;
        }
        C0559a.m2650b(C0559a.m2657i(drawable).mutate(), i);
        if (view != null) {
            view.invalidate();
        }
    }
}
