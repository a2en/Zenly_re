package com.mapbox.android.telemetry;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* renamed from: com.mapbox.android.telemetry.q */
class C11386q implements JsonSerializer<NavigationDepartEvent> {
    C11386q() {
    }

    /* renamed from: a */
    public JsonElement serialize(NavigationDepartEvent navigationDepartEvent, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject asJsonObject = jsonSerializationContext.serialize(navigationDepartEvent.mo32898c()).getAsJsonObject();
        asJsonObject.addProperty("event", navigationDepartEvent.mo32897b());
        return asJsonObject;
    }
}
