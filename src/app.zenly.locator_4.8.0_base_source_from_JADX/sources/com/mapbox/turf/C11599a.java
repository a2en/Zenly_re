package com.mapbox.turf;

import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.GeometryCollection;
import com.mapbox.geojson.LineString;
import com.mapbox.geojson.MultiLineString;
import com.mapbox.geojson.MultiPoint;
import com.mapbox.geojson.MultiPolygon;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.Polygon;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mapbox.turf.a */
public final class C11599a {
    /* renamed from: a */
    public static double[] m30390a(Point point) {
        return m30392a(C11600b.m30397a(point));
    }

    /* renamed from: a */
    public static double[] m30386a(LineString lineString) {
        return m30392a(C11600b.m30393a(lineString));
    }

    /* renamed from: a */
    public static double[] m30388a(MultiPoint multiPoint) {
        return m30392a(C11600b.m30395a(multiPoint));
    }

    /* renamed from: a */
    public static double[] m30391a(Polygon polygon) {
        return m30392a(C11600b.m30398a(polygon, false));
    }

    /* renamed from: a */
    public static double[] m30387a(MultiLineString multiLineString) {
        return m30392a(C11600b.m30394a(multiLineString));
    }

    /* renamed from: a */
    public static double[] m30389a(MultiPolygon multiPolygon) {
        return m30392a(C11600b.m30396a(multiPolygon, false));
    }

    /* renamed from: a */
    public static double[] m30385a(Geometry geometry) {
        if (geometry instanceof Point) {
            return m30390a((Point) geometry);
        }
        if (geometry instanceof MultiPoint) {
            return m30388a((MultiPoint) geometry);
        }
        if (geometry instanceof LineString) {
            return m30386a((LineString) geometry);
        }
        if (geometry instanceof MultiLineString) {
            return m30387a((MultiLineString) geometry);
        }
        if (geometry instanceof Polygon) {
            return m30391a((Polygon) geometry);
        }
        if (geometry instanceof MultiPolygon) {
            return m30389a((MultiPolygon) geometry);
        }
        if (geometry instanceof GeometryCollection) {
            ArrayList arrayList = new ArrayList();
            for (Geometry a : ((GeometryCollection) geometry).geometries()) {
                double[] a2 = m30385a(a);
                arrayList.add(Point.fromLngLat(a2[0], a2[1]));
                arrayList.add(Point.fromLngLat(a2[2], a2[1]));
                arrayList.add(Point.fromLngLat(a2[2], a2[3]));
                arrayList.add(Point.fromLngLat(a2[0], a2[3]));
            }
            return m30388a(MultiPoint.fromLngLats((List<Point>) arrayList));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown geometry class: ");
        sb.append(geometry.getClass());
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    private static double[] m30392a(List<Point> list) {
        double[] dArr = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        for (Point point : list) {
            if (dArr[0] > point.longitude()) {
                dArr[0] = point.longitude();
            }
            if (dArr[1] > point.latitude()) {
                dArr[1] = point.latitude();
            }
            if (dArr[2] < point.longitude()) {
                dArr[2] = point.longitude();
            }
            if (dArr[3] < point.latitude()) {
                dArr[3] = point.latitude();
            }
        }
        return dArr;
    }
}
