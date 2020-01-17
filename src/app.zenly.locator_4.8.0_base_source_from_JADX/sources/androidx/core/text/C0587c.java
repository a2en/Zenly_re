package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: androidx.core.text.c */
public final class C0587c {

    /* renamed from: a */
    private static Method f2701a;

    /* renamed from: b */
    private static Method f2702b;

    static {
        int i = VERSION.SDK_INT;
        String str = "addLikelySubtags";
        if (i < 21) {
            try {
                Class cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    f2701a = cls.getMethod("getScript", new Class[]{String.class});
                    f2702b = cls.getMethod(str, new Class[]{String.class});
                }
            } catch (Exception e) {
                f2701a = null;
                f2702b = null;
                Log.w("ICUCompat", e);
            }
        } else if (i < 24) {
            try {
                f2702b = Class.forName("libcore.icu.ICU").getMethod(str, new Class[]{Locale.class});
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    /* renamed from: a */
    private static String m2734a(String str) {
        String str2 = "ICUCompat";
        try {
            if (f2701a != null) {
                return (String) f2701a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w(str2, e);
        } catch (InvocationTargetException e2) {
            Log.w(str2, e2);
        }
        return null;
    }

    /* renamed from: b */
    public static String m2736b(Locale locale) {
        String str = "ICUCompat";
        int i = VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) f2702b.invoke(null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e) {
                Log.w(str, e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w(str, e2);
                return locale.getScript();
            }
        } else {
            String a = m2735a(locale);
            if (a != null) {
                return m2734a(a);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static String m2735a(Locale locale) {
        String str = "ICUCompat";
        String locale2 = locale.toString();
        try {
            if (f2702b != null) {
                return (String) f2702b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
            Log.w(str, e);
        } catch (InvocationTargetException e2) {
            Log.w(str, e2);
        }
        return locale2;
    }
}
