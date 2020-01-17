package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.C10174k;
import com.google.android.gms.iid.C10237m;

@Deprecated
public class GcmReceiver extends WakefulBroadcastReceiver {

    /* renamed from: c */
    private static C10237m f26766c;

    /* renamed from: d */
    private static C10237m f26767d;

    /* renamed from: a */
    private final synchronized C10237m m25737a(Context context, String str) {
        if ("com.google.android.c2dm.intent.RECEIVE".equals(str)) {
            if (f26767d == null) {
                f26767d = new C10237m(context, str);
            }
            return f26767d;
        }
        if (f26766c == null) {
            f26766c = new C10237m(context, str);
        }
        return f26766c;
    }

    /* renamed from: b */
    private final int m25738b(Context context, Intent intent) {
        String str = "GcmReceiver";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Binding to service");
        }
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
        m25737a(context, intent.getAction()).mo27747a(intent, goAsync());
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf A[Catch:{ SecurityException -> 0x00ff, IllegalStateException -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c4 A[Catch:{ SecurityException -> 0x00ff, IllegalStateException -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cf A[Catch:{ SecurityException -> 0x00ff, IllegalStateException -> 0x00d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m25739c(android.content.Context r5, android.content.Intent r6) {
        /*
            r0 = 3
            java.lang.String r1 = "GcmReceiver"
            boolean r2 = android.util.Log.isLoggable(r1, r0)
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = "Starting service"
            android.util.Log.d(r1, r2)
        L_0x000e:
            android.content.pm.PackageManager r2 = r5.getPackageManager()
            r3 = 0
            android.content.pm.ResolveInfo r2 = r2.resolveService(r6, r3)
            if (r2 == 0) goto L_0x00b2
            android.content.pm.ServiceInfo r2 = r2.serviceInfo
            if (r2 != 0) goto L_0x001f
            goto L_0x00b2
        L_0x001f:
            java.lang.String r3 = r5.getPackageName()
            java.lang.String r4 = r2.packageName
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x007e
            java.lang.String r3 = r2.name
            if (r3 != 0) goto L_0x0030
            goto L_0x007e
        L_0x0030:
            java.lang.String r2 = r2.name
            java.lang.String r3 = "."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0056
            java.lang.String r3 = r5.getPackageName()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r4 = r2.length()
            if (r4 == 0) goto L_0x0051
            java.lang.String r2 = r3.concat(r2)
            goto L_0x0056
        L_0x0051:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
        L_0x0056:
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L_0x0076
            java.lang.String r0 = "Restricting intent to a specific service: "
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x006d
            java.lang.String r0 = r0.concat(r3)
            goto L_0x0073
        L_0x006d:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
            r0 = r3
        L_0x0073:
            android.util.Log.d(r1, r0)
        L_0x0076:
            java.lang.String r0 = r5.getPackageName()
            r6.setClassName(r0, r2)
            goto L_0x00b7
        L_0x007e:
            java.lang.String r0 = r2.packageName
            java.lang.String r2 = r2.name
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 94
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = "/"
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r1, r0)
            goto L_0x00b7
        L_0x00b2:
            java.lang.String r0 = "Failed to resolve target intent service, skipping classname enforcement"
            android.util.Log.e(r1, r0)
        L_0x00b7:
            java.lang.String r0 = "android.permission.WAKE_LOCK"
            int r0 = r5.checkCallingOrSelfPermission(r0)     // Catch:{ SecurityException -> 0x00ff, IllegalStateException -> 0x00d9 }
            if (r0 != 0) goto L_0x00c4
            android.content.ComponentName r5 = androidx.legacy.content.WakefulBroadcastReceiver.m3974a(r5, r6)     // Catch:{ SecurityException -> 0x00ff, IllegalStateException -> 0x00d9 }
            goto L_0x00cd
        L_0x00c4:
            android.content.ComponentName r5 = r5.startService(r6)     // Catch:{ SecurityException -> 0x00ff, IllegalStateException -> 0x00d9 }
            java.lang.String r6 = "Missing wake lock permission, service start may be delayed"
            android.util.Log.d(r1, r6)     // Catch:{ SecurityException -> 0x00ff, IllegalStateException -> 0x00d9 }
        L_0x00cd:
            if (r5 != 0) goto L_0x00d7
            java.lang.String r5 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r1, r5)     // Catch:{ SecurityException -> 0x00ff, IllegalStateException -> 0x00d9 }
            r5 = 404(0x194, float:5.66E-43)
            return r5
        L_0x00d7:
            r5 = -1
            return r5
        L_0x00d9:
            r5 = move-exception
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            int r6 = r6 + 45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.String r6 = "Failed to start service while in background: "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            android.util.Log.e(r1, r5)
            r5 = 402(0x192, float:5.63E-43)
            return r5
        L_0x00ff:
            r5 = move-exception
            java.lang.String r6 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r1, r6, r5)
            r5 = 401(0x191, float:5.62E-43)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmReceiver.m25739c(android.content.Context, android.content.Intent):int");
    }

    public void onReceive(Context context, Intent intent) {
        int i;
        int i2;
        String str = "GcmReceiver";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "received new intent");
        }
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        if ("google.com/iid".equals(intent.getStringExtra("from"))) {
            intent.setAction("com.google.android.gms.iid.InstanceID");
        }
        String str2 = "gcm.rawData64";
        String stringExtra = intent.getStringExtra(str2);
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(str2);
        }
        if (isOrderedBroadcast()) {
            setResultCode(500);
        }
        boolean z = true;
        boolean z2 = C10174k.m25686i() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) == 0) {
            z = false;
        }
        if (!z2 || z) {
            if ("com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
                i2 = m25739c(context, intent);
            } else {
                i2 = m25739c(context, intent);
            }
            if (!C10174k.m25686i() || i2 != 402) {
                i = i2;
            } else {
                m25738b(context, intent);
                i = 403;
            }
        } else {
            i = m25738b(context, intent);
        }
        if (isOrderedBroadcast()) {
            setResultCode(i);
        }
    }
}
