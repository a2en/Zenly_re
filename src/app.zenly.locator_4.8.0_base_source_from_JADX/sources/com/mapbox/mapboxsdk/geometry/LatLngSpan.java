package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class LatLngSpan implements Parcelable {
    public static final Creator<LatLngSpan> CREATOR = new C11459a();

    /* renamed from: e */
    private double f29637e;

    /* renamed from: f */
    private double f29638f;

    /* renamed from: com.mapbox.mapboxsdk.geometry.LatLngSpan$a */
    static class C11459a implements Creator<LatLngSpan> {
        C11459a() {
        }

        public LatLngSpan createFromParcel(Parcel parcel) {
            return new LatLngSpan(parcel, null);
        }

        public LatLngSpan[] newArray(int i) {
            return new LatLngSpan[i];
        }
    }

    /* synthetic */ LatLngSpan(Parcel parcel, C11459a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public double mo33364a() {
        return this.f29637e;
    }

    /* renamed from: b */
    public double mo33365b() {
        return this.f29638f;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngSpan)) {
            return false;
        }
        LatLngSpan latLngSpan = (LatLngSpan) obj;
        if (!(this.f29638f == latLngSpan.mo33365b() && this.f29637e == latLngSpan.mo33364a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f29637e);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f29638f);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f29637e);
        parcel.writeDouble(this.f29638f);
    }

    private LatLngSpan(Parcel parcel) {
        this.f29637e = parcel.readDouble();
        this.f29638f = parcel.readDouble();
    }
}
