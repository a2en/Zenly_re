package com.mapbox.geojson;

import com.google.gson.JsonObject;

/* renamed from: com.mapbox.geojson.$AutoValue_Feature reason: invalid class name */
abstract class C$AutoValue_Feature extends Feature {
    private final BoundingBox bbox;
    private final Geometry geometry;

    /* renamed from: id */
    private final String f29533id;
    private final JsonObject properties;
    private final String type;

    C$AutoValue_Feature(String str, BoundingBox boundingBox, String str2, Geometry geometry2, JsonObject jsonObject) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            this.f29533id = str2;
            this.geometry = geometry2;
            this.properties = jsonObject;
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
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (this.type.equals(feature.type())) {
            BoundingBox boundingBox = this.bbox;
            if (boundingBox != null ? boundingBox.equals(feature.bbox()) : feature.bbox() == null) {
                String str = this.f29533id;
                if (str != null ? str.equals(feature.mo33084id()) : feature.mo33084id() == null) {
                    Geometry geometry2 = this.geometry;
                    if (geometry2 != null ? geometry2.equals(feature.geometry()) : feature.geometry() == null) {
                        JsonObject jsonObject = this.properties;
                        if (jsonObject != null) {
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public Geometry geometry() {
        return this.geometry;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int i = 0;
        int hashCode2 = (hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        String str = this.f29533id;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Geometry geometry2 = this.geometry;
        int hashCode4 = (hashCode3 ^ (geometry2 == null ? 0 : geometry2.hashCode())) * 1000003;
        JsonObject jsonObject = this.properties;
        if (jsonObject != null) {
            i = jsonObject.hashCode();
        }
        return hashCode4 ^ i;
    }

    /* renamed from: id */
    public String mo33084id() {
        return this.f29533id;
    }

    public JsonObject properties() {
        return this.properties;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Feature{type=");
        sb.append(this.type);
        sb.append(", bbox=");
        sb.append(this.bbox);
        sb.append(", id=");
        sb.append(this.f29533id);
        sb.append(", geometry=");
        sb.append(this.geometry);
        sb.append(", properties=");
        sb.append(this.properties);
        sb.append("}");
        return sb.toString();
    }

    public String type() {
        return this.type;
    }
}
