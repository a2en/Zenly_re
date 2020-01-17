package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.huawei.hms.pps.AdvertisingIdClient;

/* renamed from: com.appsflyer.internal.z */
public final class C8804z {
    C8804z() {
    }

    /* renamed from: ˊ */
    public static boolean m20780() {
        try {
            Class.forName("com.huawei.hms.pps.AdvertisingIdClient");
            return true;
        } catch (Throwable unused) {
            AFLogger.afDebugLog("OAID Jar not found.");
            return false;
        }
    }

    /* renamed from: ˋ */
    public static String m20781(Context context) {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
        } catch (Exception unused) {
            AFLogger.afDebugLog("Error collecting OAID.");
            return null;
        }
    }

    /* renamed from: ˎ */
    public static boolean m20782(Context context) {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(context).isLimitAdTrackingEnabled();
        } catch (Exception unused) {
            return false;
        }
    }
}
