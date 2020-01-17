package com.mapbox.geojson;

import java.util.List;

/* renamed from: com.mapbox.geojson.$AutoValue_GeometryCollection reason: invalid class name */
abstract class C$AutoValue_GeometryCollection extends GeometryCollection {
    private final BoundingBox bbox;
    private final List<Geometry> geometries;
    private final String type;

    C$AutoValue_GeometryCollection(String str, BoundingBox boundingBox, List<Geometry> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            if (list != null) {
                this.geometries = list;
                return;
            }
            throw new NullPointerException("Null geometries");
        }
        throw new NullPointerException("Null type");
    }

    public BoundingBox bbox() {
        return this.bbox;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4.geometries.equals(r5.geometries()) != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.mapbox.geojson.GeometryCollection
            r2 = 0
            if (r1 == 0) goto L_0x003b
            com.mapbox.geojson.GeometryCollection r5 = (com.mapbox.geojson.GeometryCollection) r5
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
            java.util.List<com.mapbox.geojson.Geometry> r1 = r4.geometries
            java.util.List r5 = r5.geometries()
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
        throw new UnsupportedOperationException("Method not decompiled: com.mapbox.geojson.C$AutoValue_GeometryCollection.equals(java.lang.Object):boolean");
    }

    public List<Geometry> geometries() {
        return this.geometries;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.geometries.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GeometryCollection{type=");
        sb.append(this.type);
        sb.append(", bbox=");
        sb.append(this.bbox);
        sb.append(", geometries=");
        sb.append(this.geometries);
        sb.append("}");
        return sb.toString();
    }

    public String type() {
        return this.type;
    }
}
