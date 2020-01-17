package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

/* renamed from: com.mapbox.android.telemetry.c */
class C11332c implements JsonSerializer<NavigationArriveEvent> {
    C11332c() {
    }

    /* renamed from: a */
    public JsonElement serialize(NavigationArriveEvent navigationArriveEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", navigationArriveEvent.mo32880b());
        m29181a(navigationArriveEvent, jsonSerializationContext, jsonObject);
        return jsonObject;
    }

    /* renamed from: a */
    private void m29181a(NavigationArriveEvent navigationArriveEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationArriveEvent.mo32881c()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }
}
