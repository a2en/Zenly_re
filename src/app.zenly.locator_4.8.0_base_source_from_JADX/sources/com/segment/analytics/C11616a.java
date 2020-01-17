package com.segment.analytics;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.segment.analytics.integrations.C11657e;
import com.segment.analytics.p326t.C11692b;
import com.segment.analytics.p326t.C11692b.C11696d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.segment.analytics.a */
public class C11616a extends C11685r {

    /* renamed from: com.segment.analytics.a$a */
    public static class C11617a extends C11685r {
        C11617a() {
        }

        /* renamed from: b */
        public C11617a mo34265b(String str, Object obj) {
            super.mo34265b(str, obj);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo34272b(String str, boolean z) {
            if (z && !C11692b.m30721c((CharSequence) str)) {
                put("advertisingId", (Object) str);
            }
            put("adTrackingEnabled", (Object) Boolean.valueOf(z));
        }
    }

    C11616a(Map<String, Object> map) {
        super(map);
    }

    /* renamed from: a */
    static synchronized C11616a m30430a(Context context, C11683q qVar, boolean z) {
        C11616a aVar;
        synchronized (C11616a.class) {
            aVar = new C11616a(new C11696d());
            aVar.mo34260a(context);
            aVar.mo34263a(qVar);
            aVar.mo34262a(context, z);
            aVar.mo34267c();
            StringBuilder sb = new StringBuilder();
            sb.append(Locale.getDefault().getLanguage());
            sb.append("-");
            sb.append(Locale.getDefault().getCountry());
            aVar.put("locale", (Object) sb.toString());
            aVar.mo34266b(context);
            aVar.mo34269d();
            aVar.mo34268c(context);
            m30431a((Map<String, Object>) aVar, "userAgent", (CharSequence) System.getProperty("http.agent"));
            m30431a((Map<String, Object>) aVar, "timezone", (CharSequence) TimeZone.getDefault().getID());
        }
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo34267c() {
        Map a = C11692b.m30705a();
        a.put("name", "analytics-android");
        a.put("version", "4.3.1");
        put("library", (Object) a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo34269d() {
        Map a = C11692b.m30705a();
        a.put("name", "Android");
        a.put("version", VERSION.RELEASE);
        put("os", (Object) a);
    }

    /* renamed from: e */
    public C11683q mo34270e() {
        return (C11683q) mo34416a("traits", C11683q.class);
    }

    /* renamed from: f */
    public C11616a mo34271f() {
        return new C11616a(Collections.unmodifiableMap(new LinkedHashMap(this)));
    }

    /* renamed from: b */
    public C11616a mo34265b(String str, Object obj) {
        super.mo34265b(str, obj);
        return this;
    }

    /* renamed from: b */
    public C11617a mo34264b() {
        return (C11617a) mo34416a("device", C11617a.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo34266b(Context context) {
        Map a = C11692b.m30705a();
        if (C11692b.m30723e(context, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) C11692b.m30719c(context, "connectivity");
            if (connectivityManager != null) {
                boolean z = true;
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                a.put("wifi", Boolean.valueOf(networkInfo != null && networkInfo.isConnected()));
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(7);
                a.put("bluetooth", Boolean.valueOf(networkInfo2 != null && networkInfo2.isConnected()));
                NetworkInfo networkInfo3 = connectivityManager.getNetworkInfo(0);
                if (networkInfo3 == null || !networkInfo3.isConnected()) {
                    z = false;
                }
                a.put("cellular", Boolean.valueOf(z));
            }
        }
        TelephonyManager telephonyManager = (TelephonyManager) C11692b.m30719c(context, "phone");
        String str = "carrier";
        if (telephonyManager != null) {
            a.put(str, telephonyManager.getNetworkOperatorName());
        } else {
            a.put(str, "unknown");
        }
        put("network", (Object) a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo34268c(Context context) {
        Map a = C11692b.m30705a();
        Display defaultDisplay = ((WindowManager) C11692b.m30719c(context, "window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        a.put("density", Float.valueOf(displayMetrics.density));
        a.put("height", Integer.valueOf(displayMetrics.heightPixels));
        a.put("width", Integer.valueOf(displayMetrics.widthPixels));
        put("screen", (Object) a);
    }

    /* renamed from: a */
    static void m30431a(Map<String, Object> map, String str, CharSequence charSequence) {
        if (C11692b.m30721c(charSequence)) {
            map.put(str, "undefined");
        } else {
            map.put(str, charSequence);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34261a(Context context, CountDownLatch countDownLatch, C11657e eVar) {
        if (C11692b.m30711a("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            new C11632g(this, countDownLatch, eVar).execute(new Context[]{context});
            return;
        }
        eVar.mo34347a("Not collecting advertising ID because com.google.android.gms.ads.identifier.AdvertisingIdClient was not found on the classpath.", new Object[0]);
        countDownLatch.countDown();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34263a(C11683q qVar) {
        put("traits", (Object) qVar.mo34411f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34260a(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            Map a = C11692b.m30705a();
            m30431a(a, "name", packageInfo.applicationInfo.loadLabel(packageManager));
            m30431a(a, "version", (CharSequence) packageInfo.versionName);
            m30431a(a, "namespace", (CharSequence) packageInfo.packageName);
            a.put("build", Integer.valueOf(packageInfo.versionCode));
            put("app", (Object) a);
        } catch (NameNotFoundException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34262a(Context context, boolean z) {
        C11617a aVar = new C11617a();
        aVar.put("id", (Object) z ? C11692b.m30699a(context) : mo34270e().mo34406b());
        aVar.put("manufacturer", (Object) Build.MANUFACTURER);
        aVar.put("model", (Object) Build.MODEL);
        aVar.put("name", (Object) Build.DEVICE);
        put("device", (Object) aVar);
    }
}
