package com.mapbox.mapboxsdk.annotations;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class PolylineOptions implements Parcelable {
    public static final Creator<PolylineOptions> CREATOR = new C11422a();

    /* renamed from: e */
    private Polyline f29558e;

    /* renamed from: com.mapbox.mapboxsdk.annotations.PolylineOptions$a */
    static class C11422a implements Creator<PolylineOptions> {
        C11422a() {
        }

        public PolylineOptions createFromParcel(Parcel parcel) {
            return new PolylineOptions(parcel, null);
        }

        public PolylineOptions[] newArray(int i) {
            return new PolylineOptions[i];
        }
    }

    /* synthetic */ PolylineOptions(Parcel parcel, C11422a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public PolylineOptions mo33238a(LatLng latLng) {
        this.f29558e.mo33172a(latLng);
        return this;
    }

    /* renamed from: b */
    public int mo33240b() {
        return this.f29558e.mo33233g();
    }

    /* renamed from: c */
    public List<LatLng> mo33242c() {
        return this.f29558e.mo33175e();
    }

    /* renamed from: d */
    public Polyline mo33243d() {
        return this.f29558e;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public float mo33245e() {
        return this.f29558e.mo33234h();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || PolylineOptions.class != obj.getClass()) {
            return false;
        }
        PolylineOptions polylineOptions = (PolylineOptions) obj;
        if (Float.compare(polylineOptions.mo33235a(), mo33235a()) != 0 || mo33240b() != polylineOptions.mo33240b() || Float.compare(polylineOptions.mo33245e(), mo33245e()) != 0) {
            return false;
        }
        if (mo33242c() == null ? polylineOptions.mo33242c() != null : !mo33242c().equals(polylineOptions.mo33242c())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int floatToIntBits = ((((((mo33235a() != 0.0f ? Float.floatToIntBits(mo33235a()) : 0) + 31) * 31) + mo33240b()) * 31) + (mo33245e() != 0.0f ? Float.floatToIntBits(mo33245e()) : 0)) * 31;
        if (mo33242c() != null) {
            i = mo33242c().hashCode();
        }
        return floatToIntBits + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(mo33242c());
        parcel.writeFloat(mo33235a());
        parcel.writeInt(mo33240b());
        parcel.writeFloat(mo33245e());
    }

    private PolylineOptions(Parcel parcel) {
        this.f29558e = new Polyline();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, LatLng.class.getClassLoader());
        mo33239a((Iterable<LatLng>) arrayList);
        mo33236a(parcel.readFloat());
        mo33237a(parcel.readInt());
        mo33241b(parcel.readFloat());
    }

    /* renamed from: a */
    public PolylineOptions mo33239a(Iterable<LatLng> iterable) {
        for (LatLng a : iterable) {
            mo33238a(a);
        }
        return this;
    }

    /* renamed from: b */
    public PolylineOptions mo33241b(float f) {
        this.f29558e.mo33232b(f);
        return this;
    }

    /* renamed from: a */
    public PolylineOptions mo33236a(float f) {
        this.f29558e.mo33171a(f);
        return this;
    }

    /* renamed from: a */
    public float mo33235a() {
        return this.f29558e.mo33174d();
    }

    /* renamed from: a */
    public PolylineOptions mo33237a(int i) {
        this.f29558e.mo33231a(i);
        return this;
    }

    public PolylineOptions() {
        this.f29558e = new Polyline();
    }
}
