package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.google.gson.p316k.C11261a;
import com.mapbox.geojson.AutoValue_Point.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.CoordinateTypeAdapter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import java.io.Serializable;
import java.util.List;

public abstract class Point implements CoordinateContainer<List<Double>>, Serializable {
    private static final String TYPE = "Point";

    public static Point fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(new C11261a<List<Double>>() {
        }.getType(), new CoordinateTypeAdapter());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxDeserializer());
        return (Point) eVar.mo32476a().mo32457a(str, Point.class);
    }

    public static Point fromLngLat(double d, double d2) {
        return new AutoValue_Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d, d2));
    }

    public static C11138i<Point> typeAdapter(C11125d dVar) {
        return new GsonTypeAdapter(dVar);
    }

    public double altitude() {
        if (coordinates().size() < 3) {
            return Double.NaN;
        }
        return ((Double) coordinates().get(2)).doubleValue();
    }

    public abstract BoundingBox bbox();

    public abstract List<Double> coordinates();

    public boolean hasAltitude() {
        return !Double.isNaN(altitude());
    }

    public double latitude() {
        return ((Double) coordinates().get(1)).doubleValue();
    }

    public double longitude() {
        return ((Double) coordinates().get(0)).doubleValue();
    }

    public String toJson() {
        C11132e eVar = new C11132e();
        eVar.mo32479a(new C11261a<List<Double>>() {
        }.getType(), new CoordinateTypeAdapter());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxSerializer());
        return eVar.mo32476a().mo32460a((Object) this);
    }

    public abstract String type();

    public static Point fromLngLat(double d, double d2, BoundingBox boundingBox) {
        return new AutoValue_Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d, d2));
    }

    public static Point fromLngLat(double d, double d2, double d3) {
        return new AutoValue_Point(TYPE, null, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d, d2, d3));
    }

    public static Point fromLngLat(double d, double d2, double d3, BoundingBox boundingBox) {
        return new AutoValue_Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d, d2, d3));
    }

    static Point fromLngLat(double[] dArr) {
        if (dArr.length == 2) {
            return fromLngLat(dArr[0], dArr[1]);
        }
        if (dArr.length > 2) {
            return fromLngLat(dArr[0], dArr[1], dArr[2]);
        }
        return null;
    }
}
