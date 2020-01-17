package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;

/* renamed from: com.google.android.gms.common.util.g */
public final class C10170g {

    /* renamed from: a */
    private static Boolean f26725a;

    /* renamed from: b */
    private static Boolean f26726b;

    /* renamed from: c */
    private static Boolean f26727c;

    @TargetApi(21)
    /* renamed from: a */
    public static boolean m25666a(Context context) {
        return m25669d(context);
    }

    @TargetApi(20)
    /* renamed from: b */
    public static boolean m25667b(Context context) {
        if (f26725a == null) {
            f26725a = Boolean.valueOf(C10174k.m25683f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f26725a.booleanValue();
    }

    @TargetApi(26)
    /* renamed from: c */
    public static boolean m25668c(Context context) {
        return m25667b(context) && (!C10174k.m25685h() || (m25669d(context) && !C10174k.m25686i()));
    }

    @TargetApi(21)
    /* renamed from: d */
    private static boolean m25669d(Context context) {
        if (f26726b == null) {
            f26726b = Boolean.valueOf(C10174k.m25684g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f26726b.booleanValue();
    }

    /* renamed from: e */
    public static boolean m25670e(Context context) {
        if (f26727c == null) {
            f26727c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f26727c.booleanValue();
    }

    /* renamed from: a */
    public static boolean m25665a() {
        return "user".equals(Build.TYPE);
    }
}
