package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import okio.C13342c;

/* renamed from: com.mapbox.android.telemetry.b1 */
public class C11330b1 {

    /* renamed from: a */
    private static final SimpleDateFormat f29416a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b */
    private static final Locale f29417b = Locale.US;

    /* renamed from: c */
    private static final Map<Integer, String> f29418c = new C11331a();

    /* renamed from: com.mapbox.android.telemetry.b1$a */
    static class C11331a extends HashMap<Integer, String> {
        C11331a() {
            put(Integer.valueOf(7), "1xRTT");
            put(Integer.valueOf(4), "CDMA");
            put(Integer.valueOf(2), "EDGE");
            put(Integer.valueOf(14), "EHRPD");
            put(Integer.valueOf(5), "EVDO_0");
            put(Integer.valueOf(6), "EVDO_A");
            put(Integer.valueOf(12), "EVDO_B");
            put(Integer.valueOf(1), "GPRS");
            put(Integer.valueOf(8), "HSDPA");
            put(Integer.valueOf(10), "HSPA");
            put(Integer.valueOf(15), "HSPAP");
            put(Integer.valueOf(9), "HSUPA");
            put(Integer.valueOf(11), "IDEN");
            put(Integer.valueOf(13), "LTE");
            put(Integer.valueOf(3), "UMTS");
            put(Integer.valueOf(0), "Unknown");
        }
    }

    /* renamed from: a */
    static String m29167a() {
        return f29416a.format(new Date());
    }

    /* renamed from: b */
    public static String m29172b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                C13342c cVar = new C13342c();
                cVar.writeUtf8(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    cVar.writeUtf8CodePoint((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i += Character.charCount(codePointAt2);
                }
                return cVar.readUtf8();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: c */
    static String m29174c() {
        Context context = C11354i0.f29434n;
        if (context == null) {
            return m29177d();
        }
        String string = m29179f(context).getString("mapboxVendorId", "");
        if (m29170a(string)) {
            string = m29177d();
        }
        return string;
    }

    /* renamed from: d */
    static int m29176d(Context context) {
        Intent g = m29180g(context);
        if (g == null) {
            return -1;
        }
        return Math.round((((float) g.getIntExtra("level", -1)) / ((float) g.getIntExtra("scale", -1))) * 100.0f);
    }

    /* renamed from: e */
    static String m29178e(Context context) {
        return (String) f29418c.get(Integer.valueOf(((TelephonyManager) context.getSystemService("phone")).getNetworkType()));
    }

    /* renamed from: f */
    static SharedPreferences m29179f(Context context) {
        return context.getSharedPreferences("MapboxSharedPreferences", 0);
    }

    /* renamed from: g */
    private static Intent m29180g(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* renamed from: a */
    static String m29168a(String str, Context context) {
        String c = m29175c(context);
        return TextUtils.isEmpty(c) ? str : m29172b(String.format(f29417b, "%s %s", new Object[]{c, str}));
    }

    /* renamed from: a */
    static boolean m29170a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: d */
    private static String m29177d() {
        String b = m29171b();
        Context context = C11354i0.f29434n;
        if (context == null) {
            return b;
        }
        Editor edit = m29179f(context).edit();
        edit.putString("mapboxVendorId", b);
        edit.apply();
        return b;
    }

    /* renamed from: a */
    static boolean m29169a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData.getBoolean("com.mapbox.AdjustWakeUp", false);
            }
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    /* renamed from: c */
    private static String m29175c(Context context) {
        try {
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            return String.format(f29417b, "%s/%s/%s", new Object[]{packageName, packageInfo.versionName, Integer.valueOf(packageInfo.versionCode)});
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m29171b() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: b */
    static boolean m29173b(Context context) {
        Intent g = m29180g(context);
        boolean z = false;
        if (g == null) {
            return false;
        }
        int intExtra = g.getIntExtra("plugged", -1);
        boolean z2 = intExtra == 2;
        boolean z3 = intExtra == 1;
        if (z2 || z3) {
            z = true;
        }
        return z;
    }
}
