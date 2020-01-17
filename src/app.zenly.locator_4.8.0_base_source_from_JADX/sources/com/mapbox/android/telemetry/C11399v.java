package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Map.Entry;

/* renamed from: com.mapbox.android.telemetry.v */
class C11399v implements JsonSerializer<NavigationFasterRouteEvent> {
    C11399v() {
    }

    /* renamed from: b */
    private void m29342b(NavigationFasterRouteEvent navigationFasterRouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFasterRouteEvent.mo32905d()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }

    /* renamed from: c */
    private void m29343c(NavigationFasterRouteEvent navigationFasterRouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        jsonObject.add("step", jsonSerializationContext.serialize(navigationFasterRouteEvent.mo32907e()));
    }

    /* renamed from: a */
    public JsonElement serialize(NavigationFasterRouteEvent navigationFasterRouteEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("event", navigationFasterRouteEvent.mo32903b());
        m29341a(navigationFasterRouteEvent, jsonSerializationContext, jsonObject);
        m29342b(navigationFasterRouteEvent, jsonSerializationContext, jsonObject);
        m29343c(navigationFasterRouteEvent, jsonSerializationContext, jsonObject);
        return jsonObject;
    }

    /* renamed from: a */
    private void m29341a(NavigationFasterRouteEvent navigationFasterRouteEvent, JsonSerializationContext jsonSerializationContext, JsonObject jsonObject) {
        for (Entry entry : jsonSerializationContext.serialize(navigationFasterRouteEvent.mo32904c()).getAsJsonObject().entrySet()) {
            jsonObject.add((String) entry.getKey(), (JsonElement) entry.getValue());
        }
    }
}
