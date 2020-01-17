package com.mapbox.geojson.gson;

import com.google.gson.C11132e;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.Point;

public class GeometryGeoJson {
    public static Geometry fromJson(String str) {
        Class<Geometry> cls = Geometry.class;
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(Point.class, new PointDeserializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxDeserializer());
        eVar.mo32479a(cls, new GeometryDeserializer());
        return (Geometry) eVar.mo32476a().mo32457a(str, cls);
    }
}
