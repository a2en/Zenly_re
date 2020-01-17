package com.mapbox.geojson.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mapbox.geojson.Geometry;
import java.lang.reflect.Type;

public class GeometryDeserializer implements JsonDeserializer<Geometry> {
    public Geometry deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        String str;
        String str2 = "type";
        if (jsonElement.isJsonObject()) {
            str = jsonElement.getAsJsonObject().get(str2).getAsString();
        } else {
            str = jsonElement.getAsJsonArray().get(0).getAsJsonObject().get(str2).getAsString();
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("com.mapbox.geojson.AutoValue_");
            sb.append(str);
            return (Geometry) jsonDeserializationContext.deserialize(jsonElement, Class.forName(sb.toString()));
        } catch (ClassNotFoundException e) {
            throw new JsonParseException((Throwable) e);
        }
    }
}
