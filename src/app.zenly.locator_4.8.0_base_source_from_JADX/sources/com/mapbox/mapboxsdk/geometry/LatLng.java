package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;

public class LatLng implements Parcelable {
    public static final Creator<LatLng> CREATOR = new C11455a();

    /* renamed from: e */
    private double f29635e;
    @Keep
    private double latitude;
    @Keep
    private double longitude;

    /* renamed from: com.mapbox.mapboxsdk.geometry.LatLng$a */
    static class C11455a implements Creator<LatLng> {
        C11455a() {
        }

        public LatLng createFromParcel(Parcel parcel) {
            return new LatLng(parcel);
        }

        public LatLng[] newArray(int i) {
            return new LatLng[i];
        }
    }

    public LatLng() {
        this.f29635e = 0.0d;
        this.latitude = 0.0d;
        this.longitude = 0.0d;
    }

    /* renamed from: a */
    public double mo33334a() {
        return this.latitude;
    }

    /* renamed from: b */
    public void mo33337b(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        } else if (Math.abs(d) <= 90.0d) {
            this.latitude = d;
        } else {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
    }

    /* renamed from: c */
    public void mo33338c(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        } else if (!Double.isInfinite(d)) {
            this.longitude = d;
        } else {
            throw new IllegalArgumentException("longitude must not be infinite");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || LatLng.class != obj.getClass()) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (!(Double.compare(latLng.f29635e, this.f29635e) == 0 && Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f29635e);
        return (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LatLng [latitude=");
        sb.append(this.latitude);
        sb.append(", longitude=");
        sb.append(this.longitude);
        sb.append(", altitude=");
        sb.append(this.f29635e);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.f29635e);
    }

    /* renamed from: a */
    public void mo33335a(double d) {
        this.f29635e = d;
    }

    @Keep
    public LatLng(double d, double d2) {
        this.f29635e = 0.0d;
        mo33337b(d);
        mo33338c(d2);
    }

    /* renamed from: b */
    public double mo33336b() {
        return this.longitude;
    }

    protected LatLng(Parcel parcel) {
        this.f29635e = 0.0d;
        mo33337b(parcel.readDouble());
        mo33338c(parcel.readDouble());
        mo33335a(parcel.readDouble());
    }
}
