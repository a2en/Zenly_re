package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.C10075f;
import com.google.android.gms.common.p309i.C10079b;

/* renamed from: com.google.android.gms.common.util.n */
public final class C10177n {
    /* renamed from: a */
    public static boolean m25691a(Context context, int i) {
        String str = "com.google.android.gms";
        if (!m25692a(context, i, str)) {
            return false;
        }
        try {
            return C10075f.m25325a(context).mo27329a(context.getPackageManager().getPackageInfo(str, 64));
        } catch (NameNotFoundException unused) {
            String str2 = "UidVerifier";
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Package manager can't find google play services package, defaulting to false");
            }
            return false;
        }
    }

    @TargetApi(19)
    /* renamed from: a */
    public static boolean m25692a(Context context, int i, String str) {
        return C10079b.m25337a(context).mo27332a(i, str);
    }
}
