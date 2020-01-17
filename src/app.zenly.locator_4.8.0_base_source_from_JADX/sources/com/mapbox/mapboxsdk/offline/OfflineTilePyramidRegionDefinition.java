package com.mapbox.mapboxsdk.offline;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.geometry.LatLngBounds.C11457b;

public class OfflineTilePyramidRegionDefinition implements OfflineRegionDefinition {
    public static final Creator CREATOR = new C11585a();
    @Keep
    private LatLngBounds bounds;
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

    /* renamed from: com.mapbox.mapboxsdk.offline.OfflineTilePyramidRegionDefinition$a */
    static class C11585a implements Creator {
        C11585a() {
        }

        public OfflineTilePyramidRegionDefinition createFromParcel(Parcel parcel) {
            return new OfflineTilePyramidRegionDefinition(parcel);
        }

        public OfflineTilePyramidRegionDefinition[] newArray(int i) {
            return new OfflineTilePyramidRegionDefinition[i];
        }
    }

    @Keep
    public OfflineTilePyramidRegionDefinition(String str, LatLngBounds latLngBounds, double d, double d2, float f) {
        this(str, latLngBounds, d, d2, f, true);
    }

    public int describeContents() {
        return 0;
    }

    public LatLngBounds getBounds() {
        return this.bounds;
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
        return "tileregion";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.styleURL);
        parcel.writeDouble(this.bounds.mo33346a());
        parcel.writeDouble(this.bounds.mo33348c());
        parcel.writeDouble(this.bounds.mo33347b());
        parcel.writeDouble(this.bounds.mo33349d());
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeFloat(this.pixelRatio);
    }

    @Keep
    public OfflineTilePyramidRegionDefinition(String str, LatLngBounds latLngBounds, double d, double d2, float f, boolean z) {
        this.styleURL = str;
        this.bounds = latLngBounds;
        this.minZoom = d;
        this.maxZoom = d2;
        this.pixelRatio = f;
        this.includeIdeographs = z;
    }

    public OfflineTilePyramidRegionDefinition(Parcel parcel) {
        this.styleURL = parcel.readString();
        C11457b bVar = new C11457b();
        bVar.mo33357a(new LatLng(parcel.readDouble(), parcel.readDouble()));
        bVar.mo33357a(new LatLng(parcel.readDouble(), parcel.readDouble()));
        this.bounds = bVar.mo33358a();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.pixelRatio = parcel.readFloat();
    }
}
