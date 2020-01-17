package com.mapbox.mapboxsdk.offline;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.turf.C11599a;

public class OfflineGeometryRegionDefinition implements OfflineRegionDefinition {
    public static final Creator CREATOR = new C11584a();
    @Keep
    private Geometry geometry;
    @Keep
    private boolean includeIdeographs;
    @Keep
    private double maxZoom;
    @Keep
    private double minZoom;
    @Keep
    private float pixelRatio;
    @Keep
    private String styleURL;

    /* renamed from: com.mapbox.mapboxsdk.offline.OfflineGeometryRegionDefinition$a */
    static class C11584a implements Creator {
        C11584a() {
        }

        public OfflineGeometryRegionDefinition createFromParcel(Parcel parcel) {
            return new OfflineGeometryRegionDefinition(parcel);
        }

        public OfflineGeometryRegionDefinition[] newArray(int i) {
            return new OfflineGeometryRegionDefinition[i];
        }
    }

    @Keep
    public OfflineGeometryRegionDefinition(String str, Geometry geometry2, double d, double d2, float f) {
        this(str, geometry2, d, d2, f, true);
    }

    public int describeContents() {
        return 0;
    }

    public LatLngBounds getBounds() {
        Geometry geometry2 = this.geometry;
        if (geometry2 == null) {
            return null;
        }
        double[] a = C11599a.m30385a(geometry2);
        return LatLngBounds.m29584b(a[3], a[2], a[1], a[0]);
    }

    public boolean getIncludeIdeographs() {
        return this.includeIdeographs;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public String getStyleURL() {
        return this.styleURL;
    }

    public String getType() {
        return "shaperegion";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.styleURL);
        parcel.writeString(Feature.fromGeometry(this.geometry).toJson());
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeFloat(this.pixelRatio);
    }

    @Keep
    public OfflineGeometryRegionDefinition(String str, Geometry geometry2, double d, double d2, float f, boolean z) {
        this.styleURL = str;
        this.geometry = geometry2;
        this.minZoom = d;
        this.maxZoom = d2;
        this.pixelRatio = f;
        this.includeIdeographs = z;
    }

    public OfflineGeometryRegionDefinition(Parcel parcel) {
        this.styleURL = parcel.readString();
        this.geometry = Feature.fromJson(parcel.readString()).geometry();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.pixelRatio = parcel.readFloat();
    }
}
