package com.google.android.gms.gcm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.iid.C10229e;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: com.google.android.gms.gcm.b */
public class C10211b {
    static {
        new AtomicInteger(1);
    }

    /* renamed from: a */
    public static int m25826a(Context context) {
        String a = C10229e.m25853a(context);
        if (a != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a, 0);
                if (packageInfo != null) {
                    return packageInfo.versionCode;
                }
            } catch (NameNotFoundException unused) {
            }
        }
        return -1;
    }
}
