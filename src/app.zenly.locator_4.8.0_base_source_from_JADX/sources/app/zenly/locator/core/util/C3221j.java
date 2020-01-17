package app.zenly.locator.core.util;

import android.content.Context;
import android.content.res.Resources;
import android.telephony.TelephonyManager;
import java.util.Locale;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.core.util.j */
public final class C3221j {
    static {
        new C3221j();
    }

    private C3221j() {
    }

    /* renamed from: a */
    public static final int m10212a(Context context, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "region");
        if (str.length() == 0) {
            return C7674a.f19294a;
        }
        Resources resources = context.getResources();
        StringBuilder sb = new StringBuilder();
        sb.append("flag_");
        Locale locale = Locale.US;
        C12932j.m33815a((Object) locale, "Locale.US");
        String lowerCase = str.toLowerCase(locale);
        C12932j.m33815a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        return resources.getIdentifier(sb.toString(), "drawable", context.getPackageName());
    }

    /* renamed from: a */
    public static final String m10213a(Context context) {
        C12932j.m33818b(context, "context");
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String simCountryIso = telephonyManager != null ? telephonyManager.getSimCountryIso() : null;
        if (simCountryIso == null || simCountryIso.length() == 0) {
            Locale locale = Locale.getDefault();
            C12932j.m33815a((Object) locale, "Locale.getDefault()");
            simCountryIso = locale.getCountry();
            if (simCountryIso == null) {
                simCountryIso = "";
            }
        }
        Locale locale2 = Locale.US;
        C12932j.m33815a((Object) locale2, "Locale.US");
        if (simCountryIso != null) {
            String upperCase = simCountryIso.toUpperCase(locale2);
            C12932j.m33815a((Object) upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return upperCase;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }
}
