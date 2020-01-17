package com.evernote.android.job;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.evernote.android.job.gcm.C9448a;
import com.evernote.android.job.gcm.PlatformGcmService;
import com.evernote.android.job.util.C9469c;
import com.google.android.gms.common.C10067c;
import java.util.List;

/* renamed from: com.evernote.android.job.a */
final class C9434a {

    /* renamed from: a */
    private static final C9469c f24413a = new C9469c("GcmAvailableHelper");

    /* renamed from: b */
    private static final boolean f24414b;

    /* renamed from: c */
    private static int f24415c = -1;

    /* renamed from: d */
    private static boolean f24416d;

    static {
        boolean z;
        try {
            Class.forName("com.google.android.gms.gcm.a");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f24414b = z;
    }

    /* renamed from: a */
    public static boolean m22835a(Context context) {
        try {
            if (!f24416d) {
                f24416d = true;
                m22834a(context, f24414b);
            }
            if (f24414b && C10067c.m25293a().mo27284a(context) == 0 && m22837b(context) == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static int m22837b(Context context) {
        if (f24415c < 0) {
            synchronized (C9439c.class) {
                if (f24415c < 0) {
                    if (!m22836a(context.getPackageManager().queryIntentServices(new Intent(context, PlatformGcmService.class), 0))) {
                        f24415c = 1;
                        int i = f24415c;
                        return i;
                    }
                    Intent intent = new Intent("com.google.android.gms.gcm.ACTION_TASK_READY");
                    intent.setPackage(context.getPackageName());
                    if (!m22836a(context.getPackageManager().queryIntentServices(intent, 0))) {
                        f24415c = 1;
                        int i2 = f24415c;
                        return i2;
                    }
                    f24415c = 0;
                }
            }
        }
        return f24415c;
    }

    /* renamed from: a */
    private static boolean m22836a(List<ResolveInfo> list) {
        if (list != null && !list.isEmpty()) {
            for (ResolveInfo resolveInfo : list) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null) {
                    if ("com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE".equals(serviceInfo.permission) && resolveInfo.serviceInfo.exported) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m22834a(Context context, boolean z) {
        try {
            PackageManager packageManager = context.getPackageManager();
            StringBuilder sb = new StringBuilder();
            sb.append(C9448a.class.getPackage().getName());
            sb.append(".PlatformGcmService");
            ComponentName componentName = new ComponentName(context, sb.toString());
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            if (componentEnabledSetting != 0) {
                if (componentEnabledSetting != 1) {
                    if (componentEnabledSetting != 2) {
                        return;
                    }
                } else if (!z) {
                    packageManager.setComponentEnabledSetting(componentName, 2, 1);
                    f24413a.mo25415c("GCM service disabled");
                    return;
                } else {
                    return;
                }
            }
            if (z) {
                packageManager.setComponentEnabledSetting(componentName, 1, 1);
                f24413a.mo25415c("GCM service enabled");
            }
        } catch (Throwable unused) {
        }
    }
}
