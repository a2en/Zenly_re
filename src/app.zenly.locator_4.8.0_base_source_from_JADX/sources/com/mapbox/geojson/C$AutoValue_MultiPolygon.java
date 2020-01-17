package com.mapbox.geojson;

import java.util.List;

/* renamed from: com.mapbox.geojson.$AutoValue_MultiPolygon reason: invalid class name */
abstract class C$AutoValue_MultiPolygon extends MultiPolygon {
    private final BoundingBox bbox;
    private final List<List<List<Point>>> coordinates;
    private final String type;

    C$AutoValue_MultiPolygon(String str, BoundingBox boundingBox, List<List<List<Point>>> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            if (list != null) {
                this.coordinates = list;
                return;
            }
            throw new NullPointerException("Null coordinates");
        }
        throw new NullPointerException("Null type");
    }

    public BoundingBox bbox() {
        return this.bbox;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4.coordinates.equals(r5.coordinates()) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.mapbox.geojson.MultiPolygon
            r2 = 0
            if (r1 == 0) goto L_0x003b
            com.mapbox.geojson.MultiPolygon r5 = (com.mapbox.geojson.MultiPolygon) r5
            java.lang.String r1 = r4.type
            java.lang.String r3 = r5.type()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0039
            com.mapbox.geojson.BoundingBox r1 = r4.bbox
            if (r1 != 0) goto L_0x0022
            com.mapbox.geojson.BoundingBox r1 = r5.bbox()
            if (r1 != 0) goto L_0x0039
            goto L_0x002c
        L_0x0022:
            com.mapbox.geojson.BoundingBox r3 = r5.bbox()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0039
        L_0x002c:
            java.util.List<java.util.List<java.util.List<com.mapbox.geojson.Point>>> r1 = r4.coordinates
            java.util.List r5 = r5.coordinates()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            return r0
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.geojson.C$AutoValue_MultiPolygon.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiPolygon{type=");
        sb.append(this.type);
        sb.append(", bbox=");
        sb.append(this.bbox);
        sb.append(", coordinates=");
        sb.append(this.coordinates);
        sb.append("}");
        return sb.toString();
    }

    public String type() {
        return this.type;
    }

    public List<List<List<Point>>> coordinates() {
        return this.coordinates;
    }
}
