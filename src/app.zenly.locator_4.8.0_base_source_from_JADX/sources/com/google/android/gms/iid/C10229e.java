package com.google.android.gms.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.util.C10174k;
import java.util.Iterator;
import p214e.p228e.C7571a;

/* renamed from: com.google.android.gms.iid.e */
public class C10229e {

    /* renamed from: a */
    private static String f26834a = null;

    static {
        C10230f.m25856a().mo27736a("gcm_iid_use_messenger_ipc", true);
    }

    public C10229e(Context context) {
        new C7571a();
    }

    /* renamed from: a */
    public static String m25853a(Context context) {
        boolean z;
        String str = f26834a;
        if (str != null) {
            return str;
        }
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        boolean z2 = true;
        if (!C10174k.m25686i()) {
            String str2 = "com.google.android.c2dm.intent.REGISTER";
            Iterator it = packageManager.queryIntentServices(new Intent(str2), 0).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m25855a(packageManager, ((ResolveInfo) it.next()).serviceInfo.packageName, str2)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                return f26834a;
            }
        }
        String str3 = "com.google.iid.TOKEN_REQUEST";
        Iterator it2 = packageManager.queryBroadcastReceivers(new Intent(str3), 0).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (m25855a(packageManager, ((ResolveInfo) it2.next()).activityInfo.packageName, str3)) {
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return f26834a;
        }
        String str4 = "InstanceID";
        Log.w(str4, "Failed to resolve IID implementation package, falling back");
        if (m25854a(packageManager, "com.google.android.gms")) {
            C10174k.m25686i();
            return f26834a;
        } else if (!C10174k.m25684g() && m25854a(packageManager, "com.google.android.gsf")) {
            return f26834a;
        } else {
            Log.w(str4, "Google Play services is missing, unable to get tokens");
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m25855a(PackageManager packageManager, String str, String str2) {
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str) == 0) {
            return m25854a(packageManager, str);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56 + String.valueOf(str2).length());
        sb.append("Possible malicious package ");
        sb.append(str);
        sb.append(" declares ");
        sb.append(str2);
        sb.append(" without permission");
        Log.w("InstanceID", sb.toString());
        return false;
    }

    /* renamed from: a */
    private static boolean m25854a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            f26834a = applicationInfo.packageName;
            int i = applicationInfo.uid;
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
