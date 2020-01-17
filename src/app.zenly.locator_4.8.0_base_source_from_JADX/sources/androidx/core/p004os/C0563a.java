package androidx.core.p004os;

import android.os.Build.VERSION;

/* renamed from: androidx.core.os.a */
public class C0563a {
    /* renamed from: a */
    public static boolean m2669a() {
        if (VERSION.CODENAME.length() != 1 || VERSION.CODENAME.charAt(0) < 'Q' || VERSION.CODENAME.charAt(0) > 'Z') {
            return false;
        }
        return true;
    }
}
