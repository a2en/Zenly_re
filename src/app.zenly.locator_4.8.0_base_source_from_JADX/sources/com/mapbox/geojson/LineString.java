package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.mapbox.geojson.AutoValue_LineString.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import com.mapbox.geojson.utils.PolylineUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class LineString implements CoordinateContainer<List<Point>>, Serializable {
    private static final String TYPE = "LineString";

    public static LineString fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(Point.class, new PointDeserializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxDeserializer());
        return (LineString) eVar.mo32476a().mo32457a(str, LineString.class);
    }

    public static LineString fromLngLats(MultiPoint multiPoint) {
        return new AutoValue_LineString(TYPE, null, multiPoint.coordinates());
    }

    public static LineString fromPolyline(String str, int i) {
        return fromLngLats(PolylineUtils.decode(str, i), (BoundingBox) null);
    }

    public static C11138i<LineString> typeAdapter(C11125d dVar) {
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

    public String toPolyline(int i) {
        return PolylineUtils.encode(coordinates(), i);
    }

    public abstract String type();

    public static LineString fromLngLats(List<Point> list) {
        return new AutoValue_LineString(TYPE, null, list);
    }

    public static LineString fromLngLats(List<Point> list, BoundingBox boundingBox) {
        return new AutoValue_LineString(TYPE, boundingBox, list);
    }

    public static LineString fromLngLats(MultiPoint multiPoint, BoundingBox boundingBox) {
        return new AutoValue_LineString(TYPE, boundingBox, multiPoint.coordinates());
    }

    static LineString fromLngLats(double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] fromLngLat : dArr) {
            arrayList.add(Point.fromLngLat(fromLngLat));
        }
        return fromLngLats((List<Point>) arrayList);
    }
}
