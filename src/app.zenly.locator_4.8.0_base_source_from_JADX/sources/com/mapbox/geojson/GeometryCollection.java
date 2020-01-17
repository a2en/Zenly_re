package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.mapbox.geojson.AutoValue_GeometryCollection.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public abstract class GeometryCollection implements Geometry, Serializable {
    private static final String TYPE = "GeometryCollection";

    public static GeometryCollection fromGeometries(List<Geometry> list) {
        return new AutoValue_GeometryCollection(TYPE, null, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry) {
        return new AutoValue_GeometryCollection(TYPE, null, Arrays.asList(new Geometry[]{geometry}));
    }

    public static GeometryCollection fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(Point.class, new PointDeserializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxDeserializer());
        eVar.mo32479a(Geometry.class, new GeometryDeserializer());
        return (GeometryCollection) eVar.mo32476a().mo32457a(str, GeometryCollection.class);
    }

    public static C11138i<GeometryCollection> typeAdapter(C11125d dVar) {
        return new GsonTypeAdapter(dVar);
    }

    public abstract BoundingBox bbox();

    public abstract List<Geometry> geometries();

    public String toJson() {
        C11132e eVar = new C11132e();
        eVar.mo32479a(Point.class, new PointSerializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxSerializer());
        return eVar.mo32476a().mo32460a((Object) this);
    }

    public abstract String type();

    public static GeometryCollection fromGeometries(List<Geometry> list, BoundingBox boundingBox) {
        return new AutoValue_GeometryCollection(TYPE, boundingBox, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        return new AutoValue_GeometryCollection(TYPE, boundingBox, Arrays.asList(new Geometry[]{geometry}));
    }
}
