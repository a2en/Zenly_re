package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.mapbox.geojson.AutoValue_Polygon.GsonTypeAdapter;
import com.mapbox.geojson.exception.GeoJsonException;
import com.mapbox.geojson.gson.BoundingBoxDeserializer;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.GeometryDeserializer;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Polygon implements CoordinateContainer<List<List<Point>>>, Serializable {
    private static final String TYPE = "Polygon";

    public static Polygon fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(Point.class, new PointDeserializer());
        eVar.mo32479a(Geometry.class, new GeometryDeserializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxDeserializer());
        return (Polygon) eVar.mo32476a().mo32457a(str, Polygon.class);
    }

    public static Polygon fromLngLats(List<List<Point>> list) {
        return new AutoValue_Polygon(TYPE, null, list);
    }

    public static Polygon fromOuterInner(LineString lineString, LineString... lineStringArr) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        String str = TYPE;
        if (lineStringArr == null) {
            return new AutoValue_Polygon(str, null, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            isLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new AutoValue_Polygon(str, null, arrayList);
    }

    private static boolean isLinearRing(LineString lineString) {
        if (lineString.coordinates().size() < 4) {
            throw new GeoJsonException("LinearRings need to be made up of 4 or more coordinates.");
        } else if (((Point) lineString.coordinates().get(0)).equals(lineString.coordinates().get(lineString.coordinates().size() - 1))) {
            return true;
        } else {
            throw new GeoJsonException("LinearRings require first and last coordinate to be identical.");
        }
    }

    public static C11138i<Polygon> typeAdapter(C11125d dVar) {
        return new GsonTypeAdapter(dVar);
    }

    public abstract BoundingBox bbox();

    public abstract List<List<Point>> coordinates();

    public List<LineString> inner() {
        List coordinates = coordinates();
        if (coordinates.size() <= 1) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(coordinates.size() - 1);
        for (List fromLngLats : coordinates.subList(1, coordinates.size())) {
            arrayList.add(LineString.fromLngLats(fromLngLats));
        }
        return arrayList;
    }

    public LineString outer() {
        return LineString.fromLngLats((List) coordinates().get(0));
    }

    public String toJson() {
        C11132e eVar = new C11132e();
        eVar.mo32479a(Point.class, new PointSerializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxSerializer());
        return eVar.mo32476a().mo32460a((Object) this);
    }

    public abstract String type();

    public static Polygon fromLngLats(List<List<Point>> list, BoundingBox boundingBox) {
        return new AutoValue_Polygon(TYPE, boundingBox, list);
    }

    static Polygon fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[][] dArr2 : dArr) {
            ArrayList arrayList2 = new ArrayList(dArr2.length);
            for (double[] fromLngLat : dArr2) {
                arrayList2.add(Point.fromLngLat(fromLngLat));
            }
            arrayList.add(arrayList2);
        }
        return new AutoValue_Polygon(TYPE, null, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, BoundingBox boundingBox, LineString... lineStringArr) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        String str = TYPE;
        if (lineStringArr == null) {
            return new AutoValue_Polygon(str, boundingBox, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            isLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new AutoValue_Polygon(str, boundingBox, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, List<LineString> list) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        String str = TYPE;
        if (list == null || list.isEmpty()) {
            return new AutoValue_Polygon(str, null, arrayList);
        }
        for (LineString lineString2 : list) {
            isLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new AutoValue_Polygon(str, null, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, BoundingBox boundingBox, List<LineString> list) {
        isLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        String str = TYPE;
        if (list == null) {
            return new AutoValue_Polygon(str, boundingBox, arrayList);
        }
        for (LineString lineString2 : list) {
            isLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new AutoValue_Polygon(str, boundingBox, arrayList);
    }
}
