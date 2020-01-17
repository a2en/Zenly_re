package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

/* renamed from: com.mapbox.android.telemetry.n0 */
class C11380n0 implements JsonSerializer<NavigationRerouteEvent> {
    C11380n0() {
    }

    /* renamed from: b */
    private void m29308b(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationRerouteEvent.mo32935d()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    /* renamed from: c */
    private void m29309c(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationRerouteEvent.mo32937e()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    /* renamed from: d */
    private void m29310d(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationRerouteEvent.mo32938f()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    /* renamed from: e */
    private void m29311e(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        jsonObject.add("step", jsonSerializationContext.serialize(navigationRerouteEvent.mo32939g()));
    }

    /* renamed from: a */
    public JsonElement serialize(NavigationRerouteEvent navigationRerouteEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", navigationRerouteEvent.mo32933b());
        m29309c(navigationRerouteEvent, jsonSerializationContext, jsonObject);
        m29310d(navigationRerouteEvent, jsonSerializationContext, jsonObject);
        m29308b(navigationRerouteEvent, jsonSerializationContext, jsonObject);
        m29307a(navigationRerouteEvent, jsonSerializationContext, jsonObject);
        m29311e(navigationRerouteEvent, jsonSerializationContext, jsonObject);
        return jsonObject;
    }

    /* renamed from: a */
    private void m29307a(NavigationRerouteEvent navigationRerouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationRerouteEvent.mo32934c()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }
}
