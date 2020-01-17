package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Creator<StreetViewPanoramaLocation> CREATOR = new C10663y();

    /* renamed from: e */
    public final StreetViewPanoramaLink[] f27699e;

    /* renamed from: f */
    public final LatLng f27700f;

    /* renamed from: g */
    public final String f27701g;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.f27699e = streetViewPanoramaLinkArr;
        this.f27700f = latLng;
        this.f27701g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        return this.f27701g.equals(streetViewPanoramaLocation.f27701g) && this.f27700f.equals(streetViewPanoramaLocation.f27700f);
    }

    public int hashCode() {
        return C10120k.m25499a(this.f27700f, this.f27701g);
    }

    public String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("panoId", this.f27701g);
        a.mo27499a("position", this.f27700f.toString());
        return a.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25589a(parcel, 2, (T[]) this.f27699e, i, false);
        C10134a.m25580a(parcel, 3, (Parcelable) this.f27700f, i, false);
        C10134a.m25583a(parcel, 4, this.f27701g, false);
        C10134a.m25571a(parcel, a);
    }
}
