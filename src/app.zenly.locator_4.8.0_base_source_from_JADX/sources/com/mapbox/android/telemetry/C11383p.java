package com.mapbox.android.telemetry;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.C13167a0;
import okhttp3.C13170b0;
import okhttp3.C13319s;
import okhttp3.C13319s.C13320a;
import okhttp3.C13325v;
import okhttp3.C13331y.C13332a;
import okhttp3.Call;
import okhttp3.Callback;

/* renamed from: com.mapbox.android.telemetry.p */
class C11383p implements Callback {

    /* renamed from: f */
    private static final Map<C11388r, String> f29474f = new C11384a();

    /* renamed from: a */
    private final Context f29475a;

    /* renamed from: b */
    private final String f29476b;

    /* renamed from: c */
    private final String f29477c;

    /* renamed from: d */
    private final C13325v f29478d;

    /* renamed from: e */
    private final List<C11381o> f29479e = new CopyOnWriteArrayList();

    /* renamed from: com.mapbox.android.telemetry.p$a */
    static class C11384a extends HashMap<C11388r, String> {
        C11384a() {
            String str = "api.mapbox.com";
            put(C11388r.COM, str);
            put(C11388r.STAGING, str);
            put(C11388r.CHINA, "api.mapbox.cn");
        }
    }

    C11383p(Context context, String str, String str2, C13325v vVar) {
        this.f29475a = context;
        this.f29476b = str;
        this.f29477c = str2;
        this.f29478d = vVar;
    }

    /* renamed from: c */
    private void m29317c() {
        Editor edit = C11330b1.m29179f(this.f29475a).edit();
        edit.putLong("mapboxConfigSyncTimestamp", System.currentTimeMillis());
        edit.apply();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo33030a(C11381o oVar) {
        this.f29479e.add(oVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33032b() {
        C13319s a = m29316a(this.f29475a, this.f29477c);
        C13332a aVar = new C13332a();
        aVar.mo38398a(a);
        aVar.mo38403b("User-Agent", this.f29476b);
        this.f29478d.newCall(aVar.mo38400a()).enqueue(this);
    }

    public void onFailure(Call call, IOException iOException) {
        m29317c();
    }

    public void onResponse(Call call, C13167a0 a0Var) throws IOException {
        m29317c();
        if (a0Var != null) {
            C13170b0 a = a0Var.mo37789a();
            if (a != null) {
                for (C11381o oVar : this.f29479e) {
                    if (oVar != null) {
                        oVar.mo32984a(a.mo37830g());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo33031a() {
        return System.currentTimeMillis() - C11330b1.m29179f(this.f29475a).getLong("mapboxConfigSyncTimestamp", 0) >= 86400000;
    }

    /* renamed from: a */
    private static C13319s m29316a(Context context, String str) {
        C13320a aVar = new C13320a();
        aVar.mo38311e("https");
        aVar.mo38309c(m29315a(context));
        aVar.mo38301a("events-config");
        aVar.mo38307b("access_token", str);
        return aVar.mo38304a();
    }

    /* renamed from: a */
    private static String m29315a(Context context) {
        C11392t a = new C11390s().mo33047a();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                return (String) f29474f.get(a.mo33010a(applicationInfo.metaData).mo33044b());
            }
        } catch (NameNotFoundException e) {
            Log.e("ConfigurationClient", e.getMessage());
        }
        return "api.mapbox.com";
    }
}
