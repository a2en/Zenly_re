package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.mapbox.geojson.AutoValue_MultiPoint.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class MultiPoint implements CoordinateContainer<List<Point>>, Serializable {
    private static final String TYPE = "MultiPoint";

    public static MultiPoint fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(Point.class, new PointDeserializer());
        return (MultiPoint) eVar.mo32476a().mo32457a(str, MultiPoint.class);
    }

    public static MultiPoint fromLngLats(List<Point> list) {
        return new AutoValue_MultiPoint(TYPE, null, list);
    }

    public static C11138i<MultiPoint> typeAdapter(C11125d dVar) {
        return new GsonTypeAdapter(dVar);
    }

    public abstract BoundingBox bbox();

    public abstract List<Point> coordinates();

    public String toJson() {
        C11132e eVar = new C11132e();
        eVar.mo32479a(Point.class, new PointSerializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxSerializer());
        return eVar.mo32476a().mo32460a((Object) this);
    }

    public abstract String type();

    public static MultiPoint fromLngLats(List<Point> list, BoundingBox boundingBox) {
        return new AutoValue_MultiPoint(TYPE, boundingBox, list);
    }

    static MultiPoint fromLngLats(double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] fromLngLat : dArr) {
            arrayList.add(Point.fromLngLat(fromLngLat));
        }
        return new AutoValue_MultiPoint(TYPE, null, arrayList);
    }
}
