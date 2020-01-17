package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mapbox.geojson.AutoValue_Feature.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;

public abstract class Feature implements GeoJson {
    private static final String TYPE = "Feature";

    public static Feature fromGeometry(Geometry geometry) {
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature(TYPE, null, null, geometry, new JsonObject());
        return autoValue_Feature;
    }

    public static Feature fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(Point.class, new PointDeserializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxDeserializer());
        eVar.mo32479a(Geometry.class, new GeometryDeserializer());
        Feature feature = (Feature) eVar.mo32476a().mo32457a(str, Feature.class);
        if (feature.properties() != null) {
            return feature;
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature(TYPE, feature.bbox(), feature.mo33084id(), feature.geometry(), new JsonObject());
        return autoValue_Feature;
    }

    public static C11138i<Feature> typeAdapter(C11125d dVar) {
        return new GsonTypeAdapter(dVar);
    }

    public void addBooleanProperty(String str, Boolean bool) {
        properties().addProperty(str, bool);
    }

    public void addCharacterProperty(String str, Character ch) {
        properties().addProperty(str, ch);
    }

    public void addNumberProperty(String str, Number number) {
        properties().addProperty(str, number);
    }

    public void addProperty(String str, JsonElement jsonElement) {
        properties().add(str, jsonElement);
    }

    public void addStringProperty(String str, String str2) {
        properties().addProperty(str, str2);
    }

    public abstract BoundingBox bbox();

    public abstract Geometry geometry();

    public Boolean getBooleanProperty(String str) {
        return Boolean.valueOf(properties().get(str).getAsBoolean());
    }

    public Character getCharacterProperty(String str) {
        return Character.valueOf(properties().get(str).getAsCharacter());
    }

    public Number getNumberProperty(String str) {
        return properties().get(str).getAsNumber();
    }

    public JsonElement getProperty(String str) {
        return properties().get(str);
    }

    public String getStringProperty(String str) {
        return properties().get(str).getAsString();
    }

    public boolean hasNonNullValueForProperty(String str) {
        return hasProperty(str) && !getProperty(str).isJsonNull();
    }

    public boolean hasProperty(String str) {
        return properties().has(str);
    }

    /* renamed from: id */
    public abstract String mo33084id();

    public abstract JsonObject properties();

    public JsonElement removeProperty(String str) {
        return properties().remove(str);
    }

    public String toJson() {
        AutoValue_Feature autoValue_Feature;
        C11132e eVar = new C11132e();
        eVar.mo32479a(Point.class, new PointSerializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxSerializer());
        if (properties().size() == 0) {
            AutoValue_Feature autoValue_Feature2 = new AutoValue_Feature(TYPE, bbox(), mo33084id(), geometry(), null);
            autoValue_Feature = autoValue_Feature2;
        } else {
            autoValue_Feature = this;
        }
        return eVar.mo32476a().mo32460a(autoValue_Feature);
    }

    public abstract String type();

    public static Feature fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature(TYPE, boundingBox, null, geometry, new JsonObject());
        return autoValue_Feature;
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature(TYPE, null, null, geometry, jsonObject);
        return autoValue_Feature;
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature(TYPE, boundingBox, null, geometry, jsonObject);
        return autoValue_Feature;
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, String str) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature(TYPE, null, str, geometry, jsonObject);
        return autoValue_Feature;
    }

    public static Feature fromGeometry(Geometry geometry, JsonObject jsonObject, String str, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        AutoValue_Feature autoValue_Feature = new AutoValue_Feature(TYPE, boundingBox, str, geometry, jsonObject);
        return autoValue_Feature;
    }
}
