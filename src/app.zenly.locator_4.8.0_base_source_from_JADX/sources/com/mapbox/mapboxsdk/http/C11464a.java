package com.mapbox.mapboxsdk.http;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.mapbox.mapboxsdk.C11445b;
import com.mapbox.mapboxsdk.C11451d;

/* renamed from: com.mapbox.mapboxsdk.http.a */
public class C11464a {
    /* renamed from: a */
    public static String m29600a() {
        return m29601a(C11451d.m29567b());
    }

    /* renamed from: a */
    private static String m29601a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return String.format("%s/%s (%s)", new Object[]{context.getPackageName(), packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
        } catch (Exception e) {
            C11445b.m29552a((Throwable) e);
            return "";
        }
    }
}
