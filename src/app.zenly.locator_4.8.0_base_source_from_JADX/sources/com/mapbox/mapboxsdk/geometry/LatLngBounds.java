package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Keep;
import com.mapbox.mapboxsdk.exceptions.InvalidLatLngBoundsException;
import java.util.ArrayList;
import java.util.List;

public class LatLngBounds implements Parcelable {
    public static final Creator<LatLngBounds> CREATOR = new C11456a();
    @Keep
    private final double latitudeNorth;
    @Keep
    private final double latitudeSouth;
    @Keep
    private final double longitudeEast;
    @Keep
    private final double longitudeWest;

    /* renamed from: com.mapbox.mapboxsdk.geometry.LatLngBounds$a */
    static class C11456a implements Creator<LatLngBounds> {
        C11456a() {
        }

        public LatLngBounds createFromParcel(Parcel parcel) {
            return LatLngBounds.m29585b(parcel);
        }

        public LatLngBounds[] newArray(int i) {
            return new LatLngBounds[i];
        }
    }

    /* renamed from: com.mapbox.mapboxsdk.geometry.LatLngBounds$b */
    public static final class C11457b {

        /* renamed from: a */
        private final List<LatLng> f29636a = new ArrayList();

        /* renamed from: a */
        public LatLngBounds mo33358a() {
            if (this.f29636a.size() >= 2) {
                return LatLngBounds.m29581a(this.f29636a);
            }
            throw new InvalidLatLngBoundsException(this.f29636a.size());
        }

        /* renamed from: a */
        public C11457b mo33357a(LatLng latLng) {
            this.f29636a.add(latLng);
            return this;
        }
    }

    @Keep
    LatLngBounds(double d, double d2, double d3, double d4) {
        this.latitudeNorth = d;
        this.longitudeEast = d2;
        this.latitudeSouth = d3;
        this.longitudeWest = d4;
    }

    /* renamed from: b */
    public double mo33347b() {
        return this.latitudeSouth;
    }

    /* renamed from: c */
    public double mo33348c() {
        return this.longitudeEast;
    }

    /* renamed from: d */
    public double mo33349d() {
        return this.longitudeWest;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (!(this.latitudeNorth == latLngBounds.mo33346a() && this.latitudeSouth == latLngBounds.mo33347b() && this.longitudeEast == latLngBounds.mo33348c() && this.longitudeWest == latLngBounds.mo33349d())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return (int) (this.latitudeNorth + 90.0d + ((this.latitudeSouth + 90.0d) * 1000.0d) + ((this.longitudeEast + 180.0d) * 1000000.0d) + ((this.longitudeWest + 180.0d) * 1.0E9d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("N:");
        sb.append(this.latitudeNorth);
        sb.append("; E:");
        sb.append(this.longitudeEast);
        sb.append("; S:");
        sb.append(this.latitudeSouth);
        sb.append("; W:");
        sb.append(this.longitudeWest);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitudeNorth);
        parcel.writeDouble(this.longitudeEast);
        parcel.writeDouble(this.latitudeSouth);
        parcel.writeDouble(this.longitudeWest);
    }

    /* renamed from: b */
    public static LatLngBounds m29584b(double d, double d2, double d3, double d4) {
        m29582a(d, d2, d3, d4);
        LatLngBounds latLngBounds = new LatLngBounds(d, d2, d3, d4);
        return latLngBounds;
    }

    /* renamed from: a */
    public double mo33346a() {
        return this.latitudeNorth;
    }

    /* renamed from: a */
    static LatLngBounds m29581a(List<? extends LatLng> list) {
        double d = Double.MAX_VALUE;
        double d2 = 90.0d;
        double d3 = -90.0d;
        double d4 = -1.7976931348623157E308d;
        for (LatLng latLng : list) {
            double a = latLng.mo33334a();
            double b = latLng.mo33336b();
            d2 = Math.min(d2, a);
            d = Math.min(d, b);
            d3 = Math.max(d3, a);
            d4 = Math.max(d4, b);
        }
        LatLngBounds latLngBounds = new LatLngBounds(d3, d4, d2, d);
        return latLngBounds;
    }

    /* renamed from: b */
    private static double m29583b(int i, int i2) {
        return ((((double) i2) / Math.pow(2.0d, (double) i)) * 360.0d) - 180.0d;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static LatLngBounds m29585b(Parcel parcel) {
        LatLngBounds latLngBounds = new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        return latLngBounds;
    }

    /* renamed from: a */
    private static void m29582a(double d, double d2, double d3, double d4) {
        if (Double.isNaN(d) || Double.isNaN(d3)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        } else if (Double.isNaN(d2) || Double.isNaN(d4)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        } else if (Double.isInfinite(d2) || Double.isInfinite(d4)) {
            throw new IllegalArgumentException("longitude must not be infinite");
        } else if (d > 90.0d || d < -90.0d || d3 > 90.0d || d3 < -90.0d) {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        } else if (d < d3) {
            throw new IllegalArgumentException("latNorth cannot be less than latSouth");
        } else if (d2 < d4) {
            throw new IllegalArgumentException("lonEast cannot be less than lonWest");
        }
    }

    /* renamed from: a */
    private static double m29578a(int i, int i2) {
        double pow = 3.141592653589793d - ((((double) i2) * 6.283185307179586d) / Math.pow(2.0d, (double) i));
        return Math.toDegrees(Math.atan((Math.exp(pow) - Math.exp(-pow)) * 0.5d));
    }

    /* renamed from: a */
    public static LatLngBounds m29579a(int i, int i2, int i3) {
        LatLngBounds latLngBounds = new LatLngBounds(m29578a(i, i3), m29583b(i, i2 + 1), m29578a(i, i3 + 1), m29583b(i, i2));
        return latLngBounds;
    }
}
