package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;

public class ProjectedMeters implements Parcelable {
    public static final Creator<ProjectedMeters> CREATOR = new C11460a();

    /* renamed from: e */
    private double f29639e;

    /* renamed from: f */
    private double f29640f;

    /* renamed from: com.mapbox.mapboxsdk.geometry.ProjectedMeters$a */
    static class C11460a implements Creator<ProjectedMeters> {
        C11460a() {
        }

        public ProjectedMeters createFromParcel(Parcel parcel) {
            return new ProjectedMeters(parcel, (C11460a) null);
        }

        public ProjectedMeters[] newArray(int i) {
            return new ProjectedMeters[i];
        }
    }

    /* synthetic */ ProjectedMeters(Parcel parcel, C11460a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || ProjectedMeters.class != obj.getClass()) {
            return false;
        }
        ProjectedMeters projectedMeters = (ProjectedMeters) obj;
        if (!(Double.compare(projectedMeters.f29640f, this.f29640f) == 0 && Double.compare(projectedMeters.f29639e, this.f29639e) == 0)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f29640f);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f29639e);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProjectedMeters [northing=");
        sb.append(this.f29639e);
        sb.append(", easting=");
        sb.append(this.f29640f);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f29639e);
        parcel.writeDouble(this.f29640f);
    }

    @Keep
    public ProjectedMeters(double d, double d2) {
        this.f29639e = d;
        this.f29640f = d2;
    }

    private ProjectedMeters(Parcel parcel) {
        this.f29639e = parcel.readDouble();
        this.f29640f = parcel.readDouble();
    }
}
