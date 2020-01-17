package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.gms.common.p309i.C10079b;

/* renamed from: com.google.android.gms.common.util.c */
public class C10166c {
    /* renamed from: a */
    public static int m25658a(Context context, String str) {
        PackageInfo b = m25659b(context, str);
        if (b != null) {
            ApplicationInfo applicationInfo = b.applicationInfo;
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null) {
                    return -1;
                }
                return bundle.getInt("com.google.android.gms.version", -1);
            }
        }
        return -1;
    }

    /* renamed from: b */
    private static PackageInfo m25659b(Context context, String str) {
        try {
            return C10079b.m25337a(context).mo27333b(str, 128);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m25660c(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C10079b.m25337a(context).mo27331a(str, 0).flags & 2097152) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }
}
