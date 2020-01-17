package com.mapbox.mapboxsdk.annotations;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.ArrayList;
import java.util.List;

@Deprecated
public final class PolygonOptions implements Parcelable {
    public static final Creator<PolygonOptions> CREATOR = new C11421a();

    /* renamed from: e */
    private Polygon f29557e;

    /* renamed from: com.mapbox.mapboxsdk.annotations.PolygonOptions$a */
    static class C11421a implements Creator<PolygonOptions> {
        C11421a() {
        }

        public PolygonOptions createFromParcel(Parcel parcel) {
            return new PolygonOptions(parcel, null);
        }

        public PolygonOptions[] newArray(int i) {
            return new PolygonOptions[i];
        }
    }

    /* synthetic */ PolygonOptions(Parcel parcel, C11421a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    public PolygonOptions mo33216a(LatLng latLng) {
        this.f29557e.mo33172a(latLng);
        return this;
    }

    /* renamed from: b */
    public PolygonOptions mo33221b(Iterable<List<LatLng>> iterable) {
        for (List a : iterable) {
            mo33218a(a);
        }
        return this;
    }

    /* renamed from: c */
    public List<List<LatLng>> mo33222c() {
        return this.f29557e.mo33211h();
    }

    /* renamed from: d */
    public List<LatLng> mo33223d() {
        return this.f29557e.mo33175e();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo33225e() {
        return this.f29557e.mo33212i();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || PolygonOptions.class != obj.getClass()) {
            return false;
        }
        PolygonOptions polygonOptions = (PolygonOptions) obj;
        if (Float.compare(polygonOptions.mo33213a(), mo33213a()) != 0 || mo33219b() != polygonOptions.mo33219b() || mo33225e() != polygonOptions.mo33225e()) {
            return false;
        }
        if (mo33223d() == null ? polygonOptions.mo33223d() != null : !mo33223d().equals(polygonOptions.mo33223d())) {
            return false;
        }
        if (mo33222c() == null ? polygonOptions.mo33222c() != null : !mo33222c().equals(polygonOptions.mo33222c())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int floatToIntBits = ((((((((mo33213a() != 0.0f ? Float.floatToIntBits(mo33213a()) : 0) + 31) * 31) + mo33219b()) * 31) + mo33225e()) * 31) + (mo33223d() != null ? mo33223d().hashCode() : 0)) * 31;
        if (mo33222c() != null) {
            i = mo33222c().hashCode();
        }
        return floatToIntBits + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(mo33223d());
        parcel.writeList(mo33222c());
        parcel.writeFloat(mo33213a());
        parcel.writeInt(mo33219b());
        parcel.writeInt(mo33225e());
    }

    private PolygonOptions(Parcel parcel) {
        this.f29557e = new Polygon();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, LatLng.class.getClassLoader());
        mo33217a((Iterable<LatLng>) arrayList);
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, LatLng.class.getClassLoader());
        mo33221b((Iterable<List<LatLng>>) arrayList2);
        mo33214a(parcel.readFloat());
        mo33215a(parcel.readInt());
        mo33220b(parcel.readInt());
    }

    /* renamed from: a */
    public PolygonOptions mo33217a(Iterable<LatLng> iterable) {
        for (LatLng a : iterable) {
            mo33216a(a);
        }
        return this;
    }

    /* renamed from: b */
    public int mo33219b() {
        return this.f29557e.mo33210g();
    }

    /* renamed from: a */
    public PolygonOptions mo33218a(List<LatLng> list) {
        this.f29557e.mo33209b(list);
        return this;
    }

    /* renamed from: b */
    public PolygonOptions mo33220b(int i) {
        this.f29557e.mo33208b(i);
        return this;
    }

    /* renamed from: a */
    public PolygonOptions mo33214a(float f) {
        this.f29557e.mo33171a(f);
        return this;
    }

    /* renamed from: a */
    public float mo33213a() {
        return this.f29557e.mo33174d();
    }

    /* renamed from: a */
    public PolygonOptions mo33215a(int i) {
        this.f29557e.mo33207a(i);
        return this;
    }

    public PolygonOptions() {
        this.f29557e = new Polygon();
    }
}
