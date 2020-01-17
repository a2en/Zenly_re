package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.mapbox.geojson.AutoValue_BoundingBox.GsonTypeAdapter;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import java.io.Serializable;
import java.lang.reflect.Type;

public abstract class BoundingBox implements Serializable {
    @Deprecated
    public static BoundingBox fromCoordinates(double d, double d2, double d3, double d4) {
        return fromLngLats(d, d2, d3, d4);
    }

    public static BoundingBox fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        return (BoundingBox) eVar.mo32476a().mo32457a(str, BoundingBox.class);
    }

    public static BoundingBox fromLngLats(double d, double d2, double d3, double d4) {
        return new AutoValue_BoundingBox(Point.fromLngLat(d, d2), Point.fromLngLat(d3, d4));
    }

    public static BoundingBox fromPoints(Point point, Point point2) {
        return new AutoValue_BoundingBox(point, point2);
    }

    public static C11138i<BoundingBox> typeAdapter(C11125d dVar) {
        return new GsonTypeAdapter(dVar);
    }

    public final double east() {
        return northeast().longitude();
    }

    public final double north() {
        return northeast().latitude();
    }

    public abstract Point northeast();

    public final double south() {
        return southwest().latitude();
    }

    public abstract Point southwest();

    public final String toJson() {
        C11132e eVar = new C11132e();
        eVar.mo32481b();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        return eVar.mo32476a().mo32461a((Object) this, (Type) BoundingBox.class);
    }

    public final double west() {
        return southwest().longitude();
    }

    @Deprecated
    public static BoundingBox fromCoordinates(double d, double d2, double d3, double d4, double d5, double d6) {
        return fromLngLats(d, d2, d3, d4, d5, d6);
    }

    public static BoundingBox fromLngLats(double d, double d2, double d3, double d4, double d5, double d6) {
        return new AutoValue_BoundingBox(Point.fromLngLat(d, d2, d3), Point.fromLngLat(d4, d5, d6));
    }
}
