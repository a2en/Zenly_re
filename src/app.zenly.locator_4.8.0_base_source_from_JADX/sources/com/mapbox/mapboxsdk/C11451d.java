package com.mapbox.mapboxsdk;

import android.annotation.SuppressLint;
import android.content.Context;
import com.mapbox.mapboxsdk.exceptions.MapboxConfigurationException;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.TelemetryDefinition;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import com.mapbox.mapboxsdk.p317m.C11493a;
import com.mapbox.mapboxsdk.storage.FileSource;
import com.mapbox.mapboxsdk.utils.C11598e;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: com.mapbox.mapboxsdk.d */
public final class C11451d {

    /* renamed from: d */
    private static ModuleProvider f29630d;

    /* renamed from: e */
    private static C11451d f29631e;

    /* renamed from: a */
    private Context f29632a;

    /* renamed from: b */
    private String f29633b;

    /* renamed from: c */
    private TelemetryDefinition f29634c;

    C11451d(Context context, String str) {
        this.f29632a = context;
        this.f29633b = str;
    }

    /* renamed from: a */
    public static synchronized C11451d m29564a(Context context, String str) {
        C11451d dVar;
        synchronized (C11451d.class) {
            C11598e.m30384a("Mapbox");
            if (f29631e == null) {
                Context applicationContext = context.getApplicationContext();
                FileSource.m30350g(applicationContext);
                f29631e = new C11451d(applicationContext, str);
                if (m29566a(str)) {
                    m29570e();
                }
                ConnectivityReceiver.m30311a(applicationContext);
            }
            dVar = f29631e;
        }
        return dVar;
    }

    /* renamed from: b */
    public static Context m29567b() {
        m29572g();
        return f29631e.f29632a;
    }

    /* renamed from: c */
    public static ModuleProvider m29568c() {
        if (f29630d == null) {
            f29630d = new C11452e();
        }
        return f29630d;
    }

    /* renamed from: d */
    public static TelemetryDefinition m29569d() {
        return f29631e.f29634c;
    }

    /* renamed from: e */
    private static void m29570e() {
        try {
            f29631e.f29634c = m29568c().obtainTelemetry();
        } catch (Exception e) {
            String str = "Error occurred while initializing telemetry";
            Logger.m29681e("Mbgl-Mapbox", str, e);
            C11445b.m29551a(str, e);
        }
    }

    /* renamed from: f */
    public static synchronized Boolean m29571f() {
        Boolean valueOf;
        synchronized (C11451d.class) {
            m29572g();
            valueOf = Boolean.valueOf(ConnectivityReceiver.m30311a(f29631e.f29632a).mo34040c());
        }
        return valueOf;
    }

    /* renamed from: g */
    private static void m29572g() {
        if (f29631e == null) {
            throw new MapboxConfigurationException();
        }
    }

    /* renamed from: a */
    public static String m29565a() {
        m29572g();
        return f29631e.f29633b;
    }

    /* renamed from: a */
    static boolean m29566a(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        String lowerCase = str.trim().toLowerCase(C11493a.f29721a);
        if (lowerCase.length() != 0 && (lowerCase.startsWith("pk.") || lowerCase.startsWith("sk."))) {
            z = true;
        }
        return z;
    }
}
