package com.mapbox.turf;

import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.mapbox.turf.b */
public final class C11600b {
    /* renamed from: a */
    public static List<Point> m30397a(Point point) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(point);
        return arrayList;
    }

    /* renamed from: a */
    public static List<Point> m30393a(LineString lineString) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(lineString.coordinates());
        return arrayList;
    }

    /* renamed from: a */
    public static List<Point> m30395a(MultiPoint multiPoint) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(multiPoint.coordinates());
        return arrayList;
    }

    /* renamed from: a */
    public static List<Point> m30398a(Polygon polygon, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < polygon.coordinates().size(); i++) {
            for (int i2 = 0; i2 < ((List) polygon.coordinates().get(i)).size() - (z ? 1 : 0); i2++) {
                arrayList.add(((List) polygon.coordinates().get(i)).get(i2));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Point> m30394a(MultiLineString multiLineString) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < multiLineString.coordinates().size(); i++) {
            arrayList.addAll((Collection) multiLineString.coordinates().get(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List<Point> m30396a(MultiPolygon multiPolygon, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < multiPolygon.coordinates().size(); i++) {
            for (int i2 = 0; i2 < ((List) multiPolygon.coordinates().get(i)).size(); i2++) {
                for (int i3 = 0; i3 < ((List) ((List) multiPolygon.coordinates().get(i)).get(i2)).size() - (z ? 1 : 0); i3++) {
                    arrayList.add(((List) ((List) multiPolygon.coordinates().get(i)).get(i2)).get(i3));
                }
            }
        }
        return arrayList;
    }
}
