package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11132e;
import com.google.gson.C11138i;
import com.mapbox.geojson.AutoValue_MultiLineString.GsonTypeAdapter;
import com.mapbox.geojson.gson.BoundingBoxSerializer;
import com.mapbox.geojson.gson.GeoJsonAdapterFactory;
import com.mapbox.geojson.gson.PointDeserializer;
import com.mapbox.geojson.gson.PointSerializer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class MultiLineString implements CoordinateContainer<List<List<Point>>>, Serializable {
    private static final String TYPE = "MultiLineString";

    public static MultiLineString fromJson(String str) {
        C11132e eVar = new C11132e();
        eVar.mo32477a(GeoJsonAdapterFactory.create());
        eVar.mo32479a(Point.class, new PointDeserializer());
        return (MultiLineString) eVar.mo32476a().mo32457a(str, MultiLineString.class);
    }

    public static MultiLineString fromLineString(LineString lineString) {
        return new AutoValue_MultiLineString(TYPE, null, Arrays.asList(new List[]{lineString.coordinates()}));
    }

    public static MultiLineString fromLineStrings(List<LineString> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (LineString coordinates : list) {
            arrayList.add(coordinates.coordinates());
        }
        return new AutoValue_MultiLineString(TYPE, null, arrayList);
    }

    public static MultiLineString fromLngLats(List<List<Point>> list) {
        return new AutoValue_MultiLineString(TYPE, null, list);
    }

    public static C11138i<MultiLineString> typeAdapter(C11125d dVar) {
        return new GsonTypeAdapter(dVar);
    }

    public abstract BoundingBox bbox();

    public abstract List<List<Point>> coordinates();

    public List<LineString> lineStrings() {
        List<List> coordinates = coordinates();
        ArrayList arrayList = new ArrayList(coordinates.size());
        for (List fromLngLats : coordinates) {
            arrayList.add(LineString.fromLngLats(fromLngLats));
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

    public static MultiLineString fromLngLats(List<List<Point>> list, BoundingBox boundingBox) {
        return new AutoValue_MultiLineString(TYPE, boundingBox, list);
    }

    public static MultiLineString fromLineString(LineString lineString, BoundingBox boundingBox) {
        return new AutoValue_MultiLineString(TYPE, boundingBox, Arrays.asList(new List[]{lineString.coordinates()}));
    }

    static MultiLineString fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i = 0; i < dArr.length; i++) {
            ArrayList arrayList2 = new ArrayList(dArr[i].length);
            for (double[] fromLngLat : dArr[i]) {
                arrayList2.add(Point.fromLngLat(fromLngLat));
            }
            arrayList.add(arrayList2);
        }
        return new AutoValue_MultiLineString(TYPE, null, arrayList);
    }

    public static MultiLineString fromLineStrings(List<LineString> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        for (LineString coordinates : list) {
            arrayList.add(coordinates.coordinates());
        }
        return new AutoValue_MultiLineString(TYPE, boundingBox, arrayList);
    }
}
