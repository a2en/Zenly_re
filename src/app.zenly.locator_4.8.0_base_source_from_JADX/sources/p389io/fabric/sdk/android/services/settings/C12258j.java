package p389io.fabric.sdk.android.services.settings;

import android.annotation.SuppressLint;
import android.content.SharedPreferences.Editor;
import org.json.JSONException;
import org.json.JSONObject;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;
import p389io.fabric.sdk.android.services.common.C12180h;
import p389io.fabric.sdk.android.services.common.C12186j;
import p389io.fabric.sdk.android.services.common.CurrentTimeProvider;
import p389io.fabric.sdk.android.services.persistence.C12246b;
import p389io.fabric.sdk.android.services.persistence.PreferenceStore;

/* renamed from: io.fabric.sdk.android.services.settings.j */
class C12258j implements SettingsController {

    /* renamed from: a */
    private final C12268t f31881a;

    /* renamed from: b */
    private final SettingsJsonTransform f31882b;

    /* renamed from: c */
    private final CurrentTimeProvider f31883c;

    /* renamed from: d */
    private final CachedSettingsIo f31884d;

    /* renamed from: e */
    private final SettingsSpiCall f31885e;

    /* renamed from: f */
    private final C12161g f31886f;

    /* renamed from: g */
    private final PreferenceStore f31887g = new C12246b(this.f31886f);

    /* renamed from: h */
    private final C12186j f31888h;

    public C12258j(C12161g gVar, C12268t tVar, CurrentTimeProvider currentTimeProvider, SettingsJsonTransform settingsJsonTransform, CachedSettingsIo cachedSettingsIo, SettingsSpiCall settingsSpiCall, C12186j jVar) {
        this.f31886f = gVar;
        this.f31881a = tVar;
        this.f31883c = currentTimeProvider;
        this.f31882b = settingsJsonTransform;
        this.f31884d = cachedSettingsIo;
        this.f31885e = settingsSpiCall;
        this.f31888h = jVar;
    }

    /* renamed from: a */
    private C12266r m32474a(C12265q qVar) {
        String str = "Fabric";
        C12266r rVar = null;
        try {
            if (C12265q.SKIP_CACHE_LOOKUP.equals(qVar)) {
                return null;
            }
            JSONObject readCachedSettings = this.f31884d.readCachedSettings();
            if (readCachedSettings != null) {
                C12266r buildFromJson = this.f31882b.buildFromJson(this.f31883c, readCachedSettings);
                if (buildFromJson != null) {
                    m32475a(readCachedSettings, "Loaded cached settings: ");
                    long currentTimeMillis = this.f31883c.getCurrentTimeMillis();
                    if (!C12265q.IGNORE_CACHE_EXPIRATION.equals(qVar)) {
                        if (buildFromJson.mo36274a(currentTimeMillis)) {
                            C12154c.m32113f().mo35954d(str, "Cached settings have expired.");
                            return null;
                        }
                    }
                    try {
                        C12154c.m32113f().mo35954d(str, "Returning cached settings.");
                        return buildFromJson;
                    } catch (Exception e) {
                        e = e;
                        rVar = buildFromJson;
                        C12154c.m32113f().mo35957e(str, "Failed to get cached settings", e);
                        return rVar;
                    }
                } else {
                    C12154c.m32113f().mo35957e(str, "Failed to transform cached settings data.", null);
                    return null;
                }
            } else {
                C12154c.m32113f().mo35954d(str, "No cached settings data found.");
                return null;
            }
        } catch (Exception e2) {
            e = e2;
            C12154c.m32113f().mo35957e(str, "Failed to get cached settings", e);
            return rVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo36270b() {
        return C12180h.m32250a(C12180h.m32280n(this.f31886f.mo36008b()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo36271c() {
        return this.f31887g.get().getString("existing_instance_identifier", "");
    }

    public C12266r loadSettingsData() {
        return loadSettingsData(C12265q.USE_CACHE);
    }

    public C12266r loadSettingsData(C12265q qVar) {
        String str = "Fabric";
        C12266r rVar = null;
        if (!this.f31888h.mo36071a()) {
            C12154c.m32113f().mo35954d(str, "Not fetching settings, because data collection is disabled by Firebase.");
            return null;
        }
        try {
            if (!C12154c.m32115h() && !mo36268a()) {
                rVar = m32474a(qVar);
            }
            if (rVar == null) {
                JSONObject invoke = this.f31885e.invoke(this.f31881a);
                if (invoke != null) {
                    rVar = this.f31882b.buildFromJson(this.f31883c, invoke);
                    this.f31884d.writeCachedSettings(rVar.f31922g, invoke);
                    m32475a(invoke, "Loaded settings: ");
                    mo36269a(mo36270b());
                }
            }
            if (rVar == null) {
                rVar = m32474a(C12265q.IGNORE_CACHE_EXPIRATION);
            }
        } catch (Exception e) {
            C12154c.m32113f().mo35957e(str, "Unknown error while loading Crashlytics settings. Crashes will be cached until settings can be retrieved.", e);
        }
        return rVar;
    }

    /* renamed from: a */
    private void m32475a(JSONObject jSONObject, String str) throws JSONException {
        Logger f = C12154c.m32113f();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(jSONObject.toString());
        f.mo35954d("Fabric", sb.toString());
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    public boolean mo36269a(String str) {
        Editor edit = this.f31887g.edit();
        edit.putString("existing_instance_identifier", str);
        return this.f31887g.save(edit);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36268a() {
        return !mo36271c().equals(mo36270b());
    }
}
