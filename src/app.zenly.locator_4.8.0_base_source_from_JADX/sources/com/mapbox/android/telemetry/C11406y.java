package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

/* renamed from: com.mapbox.android.telemetry.y */
class C11406y implements JsonSerializer<NavigationFeedbackEvent> {
    C11406y() {
    }

    /* renamed from: b */
    private void m29357b(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFeedbackEvent.mo32913d()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    /* renamed from: c */
    private void m29358c(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFeedbackEvent.mo32916f()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    /* renamed from: d */
    private void m29359d(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFeedbackEvent.mo32915e()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    /* renamed from: e */
    private void m29360e(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        jsonObject.add("step", jsonSerializationContext.serialize(navigationFeedbackEvent.mo32917g()));
    }

    /* renamed from: a */
    public JsonElement serialize(NavigationFeedbackEvent navigationFeedbackEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", navigationFeedbackEvent.mo32911b());
        m29359d(navigationFeedbackEvent, jsonSerializationContext, jsonObject);
        m29357b(navigationFeedbackEvent, jsonSerializationContext, jsonObject);
        m29358c(navigationFeedbackEvent, jsonSerializationContext, jsonObject);
        m29356a(navigationFeedbackEvent, jsonSerializationContext, jsonObject);
        m29360e(navigationFeedbackEvent, jsonSerializationContext, jsonObject);
        return jsonObject;
    }

    /* renamed from: a */
    private void m29356a(NavigationFeedbackEvent navigationFeedbackEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFeedbackEvent.mo32912c()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }
}
