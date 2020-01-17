package androidx.core.text;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: androidx.core.text.f */
public final class C0598f {

    /* renamed from: a */
    private static final Locale f2724a;

    static {
        String str = "";
        f2724a = new Locale(str, str);
    }

    /* renamed from: a */
    private static int m2757a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m2758b(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f2724a)) {
            String b = C0587c.m2736b(locale);
            if (b == null) {
                return m2757a(locale);
            }
            if (b.equalsIgnoreCase("Arab") || b.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
