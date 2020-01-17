package p389io.fabric.sdk.android.services.settings;

import org.json.JSONException;
import org.json.JSONObject;
import p389io.fabric.sdk.android.services.common.CurrentTimeProvider;

/* renamed from: io.fabric.sdk.android.services.settings.k */
class C12259k implements SettingsJsonTransform {
    C12259k() {
    }

    /* renamed from: a */
    private C12250b m32481a(JSONObject jSONObject) {
        C12250b bVar = new C12250b(jSONObject.optString("url", "https://e.crashlytics.com/spi/v2/events"), jSONObject.optInt("flush_interval_secs", 600), jSONObject.optInt("max_byte_size_per_file", 8000), jSONObject.optInt("max_file_count_per_send", 1), jSONObject.optInt("max_pending_send_file_count", 100), jSONObject.optBoolean("forward_to_google_analytics", false), jSONObject.optBoolean("include_purchase_events_in_forwarded_events", false), jSONObject.optBoolean("track_custom_events", true), jSONObject.optBoolean("track_predefined_events", true), jSONObject.optInt("sampling_rate", 1), jSONObject.optBoolean("flush_on_background", true));
        return bVar;
    }

    /* renamed from: b */
    private C12253e m32489b(JSONObject jSONObject) throws JSONException {
        String str = "icon";
        C12253e eVar = new C12253e(jSONObject.getString("identifier"), jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false), (!jSONObject.has(str) || !jSONObject.getJSONObject(str).has("hash")) ? null : m32492e(jSONObject.getJSONObject(str)));
        return eVar;
    }

    /* renamed from: c */
    private C12255g m32490c(JSONObject jSONObject) throws JSONException {
        return new C12255g(jSONObject.optString("update_endpoint", C12267s.f31925a), jSONObject.optInt("update_suspend_duration", 3600));
    }

    /* renamed from: d */
    private C12261m m32491d(JSONObject jSONObject) {
        C12261m mVar = new C12261m(jSONObject.optBoolean("prompt_enabled", false), jSONObject.optBoolean("collect_logged_exceptions", true), jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_analytics", false), jSONObject.optBoolean("firebase_crashlytics_enabled", false));
        return mVar;
    }

    /* renamed from: e */
    private C12251c m32492e(JSONObject jSONObject) throws JSONException {
        return new C12251c(jSONObject.getString("hash"), jSONObject.getInt("width"), jSONObject.getInt("height"));
    }

    /* renamed from: f */
    private C12263o m32493f(JSONObject jSONObject) throws JSONException {
        C12263o oVar = new C12263o(jSONObject.optString("title", "Send Crash Report?"), jSONObject.optString("message", "Looks like we crashed! Please help us fix the problem by sending a crash report."), jSONObject.optString("send_button_title", "Send"), jSONObject.optBoolean("show_cancel_button", true), jSONObject.optString("cancel_button_title", "Don't Send"), jSONObject.optBoolean("show_always_send_button", true), jSONObject.optString("always_send_button_title", "Always Send"));
        return oVar;
    }

    /* renamed from: g */
    private C12264p m32494g(JSONObject jSONObject) throws JSONException {
        C12264p pVar = new C12264p(jSONObject.optInt("log_buffer_size", 64000), jSONObject.optInt("max_chained_exception_depth", 8), jSONObject.optInt("max_custom_exception_events", 64), jSONObject.optInt("max_custom_key_value_pairs", 64), jSONObject.optInt("identifier_mask", 255), jSONObject.optBoolean("send_session_without_crash", false), jSONObject.optInt("max_complete_sessions_count", 4));
        return pVar;
    }

    public C12266r buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        C12266r rVar = new C12266r(m32480a(currentTimeProvider, (long) optInt2, jSONObject), m32489b(jSONObject.getJSONObject("app")), m32494g(jSONObject.getJSONObject("session")), m32493f(jSONObject.getJSONObject("prompt")), m32491d(jSONObject.getJSONObject("features")), m32481a(jSONObject.getJSONObject("analytics")), m32490c(jSONObject.getJSONObject("beta")), optInt, optInt2);
        return rVar;
    }

    public JSONObject toJson(C12266r rVar) throws JSONException {
        return new JSONObject().put("expires_at", rVar.f31922g).put("cache_duration", rVar.f31924i).put("settings_version", rVar.f31923h).put("features", m32486a(rVar.f31919d)).put("analytics", m32482a(rVar.f31920e)).put("beta", m32485a(rVar.f31921f)).put("app", m32484a(rVar.f31916a)).put("session", m32488a(rVar.f31917b)).put("prompt", m32487a(rVar.f31918c));
    }

    /* renamed from: a */
    private long m32480a(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) throws JSONException {
        String str = "expires_at";
        if (jSONObject.has(str)) {
            return jSONObject.getLong(str);
        }
        return currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    /* renamed from: a */
    private JSONObject m32484a(C12253e eVar) throws JSONException {
        String str = "status";
        String str2 = "url";
        String str3 = "reports_url";
        String str4 = "ndk_reports_url";
        String str5 = "update_required";
        JSONObject put = new JSONObject().put("identifier", eVar.f31871a).put(str, eVar.f31872b).put(str2, eVar.f31873c).put(str3, eVar.f31874d).put(str4, eVar.f31875e).put(str5, eVar.f31876f);
        C12251c cVar = eVar.f31877g;
        if (cVar != null) {
            put.put("icon", m32483a(cVar));
        }
        return put;
    }

    /* renamed from: a */
    private JSONObject m32483a(C12251c cVar) throws JSONException {
        return new JSONObject().put("hash", cVar.f31857a).put("width", cVar.f31858b).put("height", cVar.f31859c);
    }

    /* renamed from: a */
    private JSONObject m32486a(C12261m mVar) throws JSONException {
        return new JSONObject().put("collect_logged_exceptions", mVar.f31890b).put("collect_reports", mVar.f31891c).put("collect_analytics", mVar.f31892d);
    }

    /* renamed from: a */
    private JSONObject m32488a(C12264p pVar) throws JSONException {
        return new JSONObject().put("log_buffer_size", pVar.f31905a).put("max_chained_exception_depth", pVar.f31906b).put("max_custom_exception_events", pVar.f31907c).put("max_custom_key_value_pairs", pVar.f31908d).put("identifier_mask", pVar.f31909e).put("send_session_without_crash", pVar.f31910f);
    }

    /* renamed from: a */
    private JSONObject m32482a(C12250b bVar) throws JSONException {
        return new JSONObject().put("url", bVar.f31846a).put("flush_interval_secs", bVar.f31847b).put("max_byte_size_per_file", bVar.f31848c).put("max_file_count_per_send", bVar.f31849d).put("max_pending_send_file_count", bVar.f31850e);
    }

    /* renamed from: a */
    private JSONObject m32485a(C12255g gVar) throws JSONException {
        return new JSONObject().put("update_endpoint", gVar.f31878a).put("update_suspend_duration", gVar.f31879b);
    }

    /* renamed from: a */
    private JSONObject m32487a(C12263o oVar) throws JSONException {
        return new JSONObject().put("title", oVar.f31898a).put("message", oVar.f31899b).put("send_button_title", oVar.f31900c).put("show_cancel_button", oVar.f31901d).put("cancel_button_title", oVar.f31902e).put("show_always_send_button", oVar.f31903f).put("always_send_button_title", oVar.f31904g);
    }
}
