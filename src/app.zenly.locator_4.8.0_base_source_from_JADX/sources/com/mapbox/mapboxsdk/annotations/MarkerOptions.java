package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.mapbox.mapboxsdk.geometry.LatLng;

@Deprecated
public final class MarkerOptions extends BaseMarkerOptions<Marker, MarkerOptions> implements Parcelable {
    public static final Creator<MarkerOptions> CREATOR = new C11420a();

    /* renamed from: com.mapbox.mapboxsdk.annotations.MarkerOptions$a */
    static class C11420a implements Creator<MarkerOptions> {
        C11420a() {
        }

        public MarkerOptions createFromParcel(Parcel parcel) {
            return new MarkerOptions(parcel);
        }

        public MarkerOptions[] newArray(int i) {
            return new MarkerOptions[i];
        }
    }

    public MarkerOptions() {
    }

    /* renamed from: a */
    public MarkerOptions m29422a() {
        return this;
    }

    /* renamed from: b */
    public C11426d mo33197b() {
        return this.f29540h;
    }

    /* renamed from: c */
    public LatLng mo33198c() {
        return this.f29537e;
    }

    /* renamed from: d */
    public String mo33199d() {
        return this.f29538f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String mo33201e() {
        return this.f29539g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || MarkerOptions.class != obj.getClass()) {
            return false;
        }
        MarkerOptions markerOptions = (MarkerOptions) obj;
        if (mo33198c() == null ? markerOptions.mo33198c() != null : !mo33198c().equals(markerOptions.mo33198c())) {
            return false;
        }
        if (mo33199d() == null ? markerOptions.mo33199d() != null : !mo33199d().equals(markerOptions.mo33199d())) {
            return false;
        }
        if (mo33197b() == null ? markerOptions.mo33197b() != null : !mo33197b().equals(markerOptions.mo33197b())) {
            return false;
        }
        if (mo33201e() == null ? markerOptions.mo33201e() != null : !mo33201e().equals(markerOptions.mo33201e())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = 0;
        int hashCode = ((((((mo33198c() != null ? mo33198c().hashCode() : 0) + 31) * 31) + (mo33199d() != null ? mo33199d().hashCode() : 0)) * 31) + (mo33197b() != null ? mo33197b().hashCode() : 0)) * 31;
        if (mo33201e() != null) {
            i = mo33201e().hashCode();
        }
        return hashCode + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo33198c(), i);
        parcel.writeString(mo33199d());
        parcel.writeString(mo33201e());
        C11426d b = mo33197b();
        parcel.writeByte((byte) (b != null ? 1 : 0));
        if (b != null) {
            parcel.writeString(mo33197b().mo33270b());
            parcel.writeParcelable(mo33197b().mo33269a(), i);
        }
    }

    protected MarkerOptions(Parcel parcel) {
        mo33168a((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()));
        mo33169a(parcel.readString());
        mo33170b(parcel.readString());
        if (parcel.readByte() != 0) {
            mo33167a(new C11426d(parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader())));
        }
    }
}
