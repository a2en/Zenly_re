package app.zenly.locator.onboarding.p125y3;

import java.util.Locale;

/* renamed from: app.zenly.locator.onboarding.y3.b */
public final class C4948b {
    /* renamed from: a */
    public static boolean m14277a(String str) {
        return str.toLowerCase(Locale.ROOT).contains("deadline exceeded") || str.toLowerCase(Locale.ROOT).contains("unavailable");
    }

    /* renamed from: b */
    public static boolean m14278b(String str) {
        return str.toLowerCase(Locale.ROOT).contains("unable to coerce phone number");
    }

    /* renamed from: c */
    public static boolean m14279c(String str) {
        return str.toLowerCase(Locale.ROOT).contains("too many tries");
    }

    /* renamed from: d */
    public static boolean m14280d(String str) {
        return str.toLowerCase(Locale.ROOT).contains("wrong code");
    }
}
