package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.android.volley.toolbox.C8733j;

public class VisibleRegion implements Parcelable {
    public static final Creator<VisibleRegion> CREATOR = new C11461a();

    /* renamed from: e */
    public final LatLng f29641e;

    /* renamed from: f */
    public final LatLng f29642f;

    /* renamed from: g */
    public final LatLng f29643g;

    /* renamed from: h */
    public final LatLng f29644h;

    /* renamed from: i */
    public final LatLngBounds f29645i;

    /* renamed from: com.mapbox.mapboxsdk.geometry.VisibleRegion$a */
    static class C11461a implements Creator<VisibleRegion> {
        C11461a() {
        }

        public VisibleRegion createFromParcel(Parcel parcel) {
            return new VisibleRegion(parcel, null);
        }

        public VisibleRegion[] newArray(int i) {
            return new VisibleRegion[i];
        }
    }

    /* synthetic */ VisibleRegion(Parcel parcel, C11461a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        boolean z = true;
        if (obj == this) {
            return true;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (!this.f29641e.equals(visibleRegion.f29641e) || !this.f29642f.equals(visibleRegion.f29642f) || !this.f29643g.equals(visibleRegion.f29643g) || !this.f29644h.equals(visibleRegion.f29644h) || !this.f29645i.equals(visibleRegion.f29645i)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return this.f29641e.hashCode() + 90 + ((this.f29642f.hashCode() + 90) * C8733j.DEFAULT_IMAGE_TIMEOUT_MS) + ((this.f29643g.hashCode() + 180) * 1000000) + ((this.f29644h.hashCode() + 180) * 1000000000);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[farLeft [");
        sb.append(this.f29641e);
        sb.append("], farRight [");
        sb.append(this.f29642f);
        sb.append("], nearLeft [");
        sb.append(this.f29643g);
        sb.append("], nearRight [");
        sb.append(this.f29644h);
        sb.append("], latLngBounds [");
        sb.append(this.f29645i);
        sb.append("]]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f29641e, i);
        parcel.writeParcelable(this.f29642f, i);
        parcel.writeParcelable(this.f29643g, i);
        parcel.writeParcelable(this.f29644h, i);
        parcel.writeParcelable(this.f29645i, i);
    }

    private VisibleRegion(Parcel parcel) {
        this.f29641e = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f29642f = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f29643g = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f29644h = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f29645i = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
    }
}
