package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C10120k;
import com.google.android.gms.common.internal.C10120k.C10121a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Creator<VisibleRegion> CREATOR = new C10644f0();

    /* renamed from: e */
    public final LatLng f27718e;

    /* renamed from: f */
    public final LatLng f27719f;

    /* renamed from: g */
    public final LatLng f27720g;

    /* renamed from: h */
    public final LatLng f27721h;

    /* renamed from: i */
    public final LatLngBounds f27722i;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f27718e = latLng;
        this.f27719f = latLng2;
        this.f27720g = latLng3;
        this.f27721h = latLng4;
        this.f27722i = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        return this.f27718e.equals(visibleRegion.f27718e) && this.f27719f.equals(visibleRegion.f27719f) && this.f27720g.equals(visibleRegion.f27720g) && this.f27721h.equals(visibleRegion.f27721h) && this.f27722i.equals(visibleRegion.f27722i);
    }

    public final int hashCode() {
        return C10120k.m25499a(this.f27718e, this.f27719f, this.f27720g, this.f27721h, this.f27722i);
    }

    public final String toString() {
        C10121a a = C10120k.m25500a((Object) this);
        a.mo27499a("nearLeft", this.f27718e);
        a.mo27499a("nearRight", this.f27719f);
        a.mo27499a("farLeft", this.f27720g);
        a.mo27499a("farRight", this.f27721h);
        a.mo27499a("latLngBounds", this.f27722i);
        return a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f27718e, i, false);
        C10134a.m25580a(parcel, 3, (Parcelable) this.f27719f, i, false);
        C10134a.m25580a(parcel, 4, (Parcelable) this.f27720g, i, false);
        C10134a.m25580a(parcel, 5, (Parcelable) this.f27721h, i, false);
        C10134a.m25580a(parcel, 6, (Parcelable) this.f27722i, i, false);
        C10134a.m25571a(parcel, a);
    }
}
