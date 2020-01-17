package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.mapbox.geojson.AutoValue_FeatureCollection.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.util.Arrays;
import java.util.List;

public abstract class FeatureCollection implements GeoJson {
    private static final String TYPE = "FeatureCollection";

    public static FeatureCollection fromFeature(Feature feature) {
        return new AutoValue_FeatureCollection(TYPE, null, Arrays.asList(new Feature[]{feature}));
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr) {
        return new AutoValue_FeatureCollection(TYPE, null, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(Point.class, new PointDeserializer());
        eVar.mo32479a(Geometry.class, new GeometryDeserializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxDeserializer());
        return (FeatureCollection) eVar.mo32476a().mo32457a(str, FeatureCollection.class);
    }

    public static C11138i<FeatureCollection> typeAdapter(C11125d dVar) {
        return new GsonTypeAdapter(dVar);
    }

    public abstract BoundingBox bbox();

    public abstract List<Feature> features();

    public String toJson() {
        C11132e eVar = new C11132e();
        eVar.mo32479a(Point.class, new PointSerializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxSerializer());
        return eVar.mo32476a().mo32460a((Object) this);
    }

    public abstract String type();

    public static FeatureCollection fromFeatures(List<Feature> list) {
        return new AutoValue_FeatureCollection(TYPE, null, list);
    }

    public static FeatureCollection fromFeature(Feature feature, BoundingBox boundingBox) {
        return new AutoValue_FeatureCollection(TYPE, boundingBox, Arrays.asList(new Feature[]{feature}));
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr, BoundingBox boundingBox) {
        return new AutoValue_FeatureCollection(TYPE, boundingBox, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromFeatures(List<Feature> list, BoundingBox boundingBox) {
        return new AutoValue_FeatureCollection(TYPE, boundingBox, list);
    }
}
