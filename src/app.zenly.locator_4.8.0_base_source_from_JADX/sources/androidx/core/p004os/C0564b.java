package androidx.core.p004os;

import android.content.res.Configuration;
import android.os.Build.VERSION;

/* renamed from: androidx.core.os.b */
public final class C0564b {
    /* renamed from: a */
    public static C0565c m2670a(Configuration configuration) {
        if (VERSION.SDK_INT >= 24) {
            return C0565c.m2671a(configuration.getLocales());
        }
        return C0565c.m2672a(configuration.locale);
    }
}
