package com.mapbox.geojson.gson;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.p316k.C11261a;
import com.mapbox.geojson.BoundingBox;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.GeometryCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;

public final class AutoValueGson_GeoJsonAdapterFactory extends GeoJsonAdapterFactory {
    public <T> C11138i<T> create(C11125d dVar, C11261a<T> aVar) {
        Class rawType = aVar.getRawType();
        if (BoundingBox.class.isAssignableFrom(rawType)) {
            return BoundingBox.typeAdapter(dVar);
        }
        if (Feature.class.isAssignableFrom(rawType)) {
            return Feature.typeAdapter(dVar);
        }
        if (FeatureCollection.class.isAssignableFrom(rawType)) {
            return FeatureCollection.typeAdapter(dVar);
        }
        if (GeometryCollection.class.isAssignableFrom(rawType)) {
            return GeometryCollection.typeAdapter(dVar);
        }
        if (LineString.class.isAssignableFrom(rawType)) {
            return LineString.typeAdapter(dVar);
        }
        if (MultiLineString.class.isAssignableFrom(rawType)) {
            return MultiLineString.typeAdapter(dVar);
        }
        if (MultiPoint.class.isAssignableFrom(rawType)) {
            return MultiPoint.typeAdapter(dVar);
        }
        if (MultiPolygon.class.isAssignableFrom(rawType)) {
            return MultiPolygon.typeAdapter(dVar);
        }
        if (Point.class.isAssignableFrom(rawType)) {
            return Point.typeAdapter(dVar);
        }
        if (Polygon.class.isAssignableFrom(rawType)) {
            return Polygon.typeAdapter(dVar);
        }
        return null;
    }
}
