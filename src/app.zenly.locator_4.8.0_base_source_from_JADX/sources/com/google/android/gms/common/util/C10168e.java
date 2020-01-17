package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.common.util.e */
public final class C10168e {
    static {
        new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};
    }

    /* renamed from: a */
    public static boolean m25662a(Context context, Throwable th) {
        return m25663a(context, th, 536870912);
    }

    /* renamed from: a */
    private static boolean m25663a(Context context, Throwable th, int i) {
        try {
            C10123l.m25505a(context);
            C10123l.m25505a(th);
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
