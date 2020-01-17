package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.mapbox.geojson.AutoValue_MultiPolygon.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class MultiPolygon implements CoordinateContainer<List<List<List<Point>>>>, Serializable {
    private static final String TYPE = "MultiPolygon";

    public static MultiPolygon fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(Point.class, new PointDeserializer());
        return (MultiPolygon) eVar.mo32476a().mo32457a(str, MultiPolygon.class);
    }

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list) {
        return new AutoValue_MultiPolygon(TYPE, null, list);
    }

    public static MultiPolygon fromPolygon(Polygon polygon) {
        return new AutoValue_MultiPolygon(TYPE, null, Arrays.asList(new List[]{polygon.coordinates()}));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Polygon coordinates : list) {
            arrayList.add(coordinates.coordinates());
        }
        return new AutoValue_MultiPolygon(TYPE, null, arrayList);
    }

    public static C11138i<MultiPolygon> typeAdapter(C11125d dVar) {
        return new GsonTypeAdapter(dVar);
    }

    public abstract BoundingBox bbox();

    public abstract List<List<List<Point>>> coordinates();

    public List<Polygon> polygons() {
        List<List> coordinates = coordinates();
        ArrayList arrayList = new ArrayList(coordinates.size());
        for (List fromLngLats : coordinates) {
            arrayList.add(Polygon.fromLngLats(fromLngLats));
        }
        return arrayList;
    }

    public String toJson() {
        C11132e eVar = new C11132e();
        eVar.mo32479a(Point.class, new PointSerializer());
        eVar.mo32479a(BoundingBox.class, new BoundingBoxSerializer());
        return eVar.mo32476a().mo32460a((Object) this);
    }

    public abstract String type();

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list, BoundingBox boundingBox) {
        return new AutoValue_MultiPolygon(TYPE, boundingBox, list);
    }

    static MultiPolygon fromLngLats(double[][][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            ArrayList arrayList2 = new ArrayList(dArr[i].length);
            for (int i2 = 0; i2 < dArr[i].length; i2++) {
                ArrayList arrayList3 = new ArrayList(dArr[i][i2].length);
                for (double[] fromLngLat : dArr[i][i2]) {
                    arrayList3.add(Point.fromLngLat(fromLngLat));
                }
                arrayList2.add(arrayList3);
            }
            arrayList.add(arrayList2);
        }
        return new AutoValue_MultiPolygon(TYPE, null, arrayList);
    }

    public static MultiPolygon fromPolygon(Polygon polygon, BoundingBox boundingBox) {
        return new AutoValue_MultiPolygon(TYPE, boundingBox, Arrays.asList(new List[]{polygon.coordinates()}));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Polygon coordinates : list) {
            arrayList.add(coordinates.coordinates());
        }
        return new AutoValue_MultiPolygon(TYPE, boundingBox, arrayList);
    }
}
