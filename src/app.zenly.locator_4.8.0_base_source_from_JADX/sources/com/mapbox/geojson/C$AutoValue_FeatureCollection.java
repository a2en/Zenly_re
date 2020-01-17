package com.mapbox.geojson;

import java.util.List;

/* renamed from: com.mapbox.geojson.$AutoValue_FeatureCollection reason: invalid class name */
abstract class C$AutoValue_FeatureCollection extends FeatureCollection {
    private final BoundingBox bbox;
    private final List<Feature> features;
    private final String type;

    C$AutoValue_FeatureCollection(String str, BoundingBox boundingBox, List<Feature> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            this.features = list;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureCollection)) {
            return false;
        }
        FeatureCollection featureCollection = (FeatureCollection) obj;
        if (this.type.equals(featureCollection.type())) {
            BoundingBox boundingBox = this.bbox;
            if (boundingBox != null ? boundingBox.equals(featureCollection.bbox()) : featureCollection.bbox() == null) {
                List<Feature> list = this.features;
                if (list != null) {
                }
            }
        }
        z = false;
        return z;
    }

    public List<Feature> features() {
        return this.features;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int i = 0;
        int hashCode2 = (hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        List<Feature> list = this.features;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FeatureCollection{type=");
        sb.append(this.type);
        sb.append(", bbox=");
        sb.append(this.bbox);
        sb.append(", features=");
        sb.append(this.features);
        sb.append("}");
        return sb.toString();
    }

    public String type() {
        return this.type;
    }
}
