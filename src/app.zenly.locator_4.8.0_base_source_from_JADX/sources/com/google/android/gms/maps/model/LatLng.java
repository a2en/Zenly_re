package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<LatLng> CREATOR = new C10654p();

    /* renamed from: e */
    public final double f27648e;

    /* renamed from: f */
    public final double f27649f;

    public LatLng(double d, double d2) {
        if (-180.0d > d2 || d2 >= 180.0d) {
            this.f27649f = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        } else {
            this.f27649f = d2;
        }
        this.f27648e = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f27648e) == Double.doubleToLongBits(latLng.f27648e) && Double.doubleToLongBits(this.f27649f) == Double.doubleToLongBits(latLng.f27649f);
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f27648e);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.f27649f);
        return (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        double d = this.f27648e;
        double d2 = this.f27649f;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25573a(parcel, 2, this.f27648e);
        C10134a.m25573a(parcel, 3, this.f27649f);
        C10134a.m25571a(parcel, a);
    }
}
