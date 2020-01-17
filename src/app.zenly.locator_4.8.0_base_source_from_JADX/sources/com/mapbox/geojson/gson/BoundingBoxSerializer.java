package com.mapbox.geojson.gson;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import com.mapbox.geojson.utils.GeoJsonUtils;
import java.lang.reflect.Type;
import java.util.List;

public class BoundingBoxSerializer implements JsonSerializer<BoundingBox> {
    public JsonElement serialize(BoundingBox boundingBox, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonArray jsonArray = new JsonArray();
        Point southwest = boundingBox.southwest();
        List unshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(southwest);
        jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(GeoJsonUtils.trim(((Double) unshiftPoint.get(0)).doubleValue()))));
        jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(GeoJsonUtils.trim(((Double) unshiftPoint.get(1)).doubleValue()))));
        if (southwest.hasAltitude()) {
            jsonArray.add((JsonElement) new JsonPrimitive((Number) unshiftPoint.get(2)));
        }
        Point northeast = boundingBox.northeast();
        List unshiftPoint2 = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(northeast);
        jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(GeoJsonUtils.trim(((Double) unshiftPoint2.get(0)).doubleValue()))));
        jsonArray.add((JsonElement) new JsonPrimitive((Number) Double.valueOf(GeoJsonUtils.trim(((Double) unshiftPoint2.get(1)).doubleValue()))));
        if (northeast.hasAltitude()) {
            jsonArray.add((JsonElement) new JsonPrimitive((Number) unshiftPoint2.get(2)));
        }
        return jsonArray;
    }
}
