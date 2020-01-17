package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

/* renamed from: com.mapbox.android.telemetry.f */
class C11339f implements JsonSerializer<NavigationCancelEvent> {
    C11339f() {
    }

    /* renamed from: b */
    private void m29191b(NavigationCancelEvent navigationCancelEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationCancelEvent.mo32892d()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    /* renamed from: a */
    public JsonElement serialize(NavigationCancelEvent navigationCancelEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", navigationCancelEvent.mo32891c());
        m29190a(navigationCancelEvent, jsonSerializationContext, jsonObject);
        m29191b(navigationCancelEvent, jsonSerializationContext, jsonObject);
        return jsonObject;
    }

    /* renamed from: a */
    private void m29190a(NavigationCancelEvent navigationCancelEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationCancelEvent.mo32890b()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }
}
