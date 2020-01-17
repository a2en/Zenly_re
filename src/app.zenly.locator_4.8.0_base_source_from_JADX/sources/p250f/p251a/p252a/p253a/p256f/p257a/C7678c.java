package p250f.p251a.p252a.p253a.p256f.p257a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.util.TypedValue;
import androidx.core.content.C0540a;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.a.f.a.c */
public final class C7678c {
    /* renamed from: a */
    private static final TypedValue m18703a(Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Failed to resolve attribute: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public static final ColorStateList m18704b(Context context, int i) {
        C12932j.m33818b(context, "$this$getColorStateListAttr");
        Theme theme = context.getTheme();
        C12932j.m33815a((Object) theme, "theme");
        TypedValue a = m18703a(theme, i);
        int i2 = a.type;
        if (i2 < 28 || i2 > 31) {
            return C0540a.m2543b(context, a.resourceId);
        }
        return ColorStateList.valueOf(a.data);
    }

    /* renamed from: c */
    public static final int m18705c(Context context, int i) {
        C12932j.m33818b(context, "$this$getReferenceAttr");
        Theme theme = context.getTheme();
        C12932j.m33815a((Object) theme, "theme");
        return m18703a(theme, i).resourceId;
    }

    /* renamed from: a */
    public static final int m18702a(Context context, int i) {
        C12932j.m33818b(context, "$this$getColorAttr");
        Theme theme = context.getTheme();
        C12932j.m33815a((Object) theme, "theme");
        TypedValue a = m18703a(theme, i);
        int i2 = a.type;
        if (i2 < 28 || i2 > 31) {
            return C0540a.m2536a(context, a.resourceId);
        }
        return a.data;
    }
}
