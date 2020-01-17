package com.mapbox.geojson.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.mapbox.geojson.Point;
import java.lang.reflect.Type;

public class PointDeserializer implements JsonDeserializer<Point> {
    public Point deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        double asDouble = asJsonArray.get(0).getAsDouble();
        double asDouble2 = asJsonArray.get(1).getAsDouble();
        if (asJsonArray.size() > 2) {
            return Point.fromLngLat(asDouble, asDouble2, asJsonArray.get(2).getAsDouble());
        }
        return Point.fromLngLat(asDouble, asDouble2);
    }
}
