package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mapbox.android.telemetry.a1 */
public class C11324a1 {

    /* renamed from: c */
    static final Map<C11327c, Boolean> f29405c = new C11325a();

    /* renamed from: d */
    private static final Map<String, C11327c> f29406d = new C11326b();

    /* renamed from: a */
    private boolean f29407a = true;

    /* renamed from: b */
    private C11327c f29408b = C11327c.ENABLED;

    /* renamed from: com.mapbox.android.telemetry.a1$a */
    static class C11325a extends HashMap<C11327c, Boolean> {
        C11325a() {
            put(C11327c.ENABLED, Boolean.valueOf(true));
            put(C11327c.DISABLED, Boolean.valueOf(false));
        }
    }

    /* renamed from: com.mapbox.android.telemetry.a1$b */
    static class C11326b extends HashMap<String, C11327c> {
        C11326b() {
            put(C11327c.ENABLED.name(), C11327c.ENABLED);
            put(C11327c.DISABLED.name(), C11327c.DISABLED);
        }
    }

    /* renamed from: com.mapbox.android.telemetry.a1$c */
    public enum C11327c {
        ENABLED,
        DISABLED
    }

    C11324a1(boolean z) {
        this.f29407a = z;
    }

    /* renamed from: a */
    public static C11327c m29161a(C11327c cVar) {
        Context context = C11354i0.f29434n;
        if (context == null) {
            return cVar;
        }
        Editor edit = C11330b1.m29179f(context).edit();
        edit.putString("mapboxTelemetryState", cVar.name());
        edit.apply();
        return cVar;
    }

    /* renamed from: b */
    public static C11327c m29163b() {
        Context context = C11354i0.f29434n;
        if (context == null) {
            return (C11327c) f29406d.get(C11327c.ENABLED.name());
        }
        return (C11327c) f29406d.get(C11330b1.m29179f(context).getString("mapboxTelemetryState", C11327c.ENABLED.name()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C11327c mo32969a() {
        if (this.f29407a) {
            return m29163b();
        }
        return this.f29408b;
    }

    /* renamed from: a */
    static boolean m29162a(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return applicationInfo.metaData.getBoolean("com.mapbox.EnableEvents", true);
            }
        } catch (NameNotFoundException e) {
            e.printStackTrace();
        }
        return true;
    }
}
