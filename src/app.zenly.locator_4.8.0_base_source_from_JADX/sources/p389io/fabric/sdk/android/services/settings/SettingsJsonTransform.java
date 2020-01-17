package p389io.fabric.sdk.android.services.settings;

import org.json.JSONException;
import org.json.JSONObject;
import p389io.fabric.sdk.android.services.common.CurrentTimeProvider;

/* renamed from: io.fabric.sdk.android.services.settings.SettingsJsonTransform */
public interface SettingsJsonTransform {
    C12266r buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException;

    JSONObject toJson(C12266r rVar) throws JSONException;
}
