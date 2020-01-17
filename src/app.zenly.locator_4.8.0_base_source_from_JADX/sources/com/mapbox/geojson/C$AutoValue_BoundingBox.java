package com.mapbox.geojson;

/* renamed from: com.mapbox.geojson.$AutoValue_BoundingBox reason: invalid class name */
abstract class C$AutoValue_BoundingBox extends BoundingBox {
    private final Point northeast;
    private final Point southwest;

    C$AutoValue_BoundingBox(Point point, Point point2) {
        if (point != null) {
            this.southwest = point;
            if (point2 != null) {
                this.northeast = point2;
                return;
            }
            throw new NullPointerException("Null northeast");
        }
        throw new NullPointerException("Null southwest");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BoundingBox)) {
            return false;
        }
        BoundingBox boundingBox = (BoundingBox) obj;
        if (!this.southwest.equals(boundingBox.southwest()) || !this.northeast.equals(boundingBox.northeast())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.southwest.hashCode() ^ 1000003) * 1000003) ^ this.northeast.hashCode();
    }

    public Point northeast() {
        return this.northeast;
    }

    public Point southwest() {
        return this.southwest;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BoundingBox{southwest=");
        sb.append(this.southwest);
        sb.append(", northeast=");
        sb.append(this.northeast);
        sb.append("}");
        return sb.toString();
    }
}
