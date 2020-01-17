package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C10134a;

public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Creator<PointOfInterest> CREATOR = new C10658t();

    /* renamed from: e */
    public final LatLng f27669e;

    /* renamed from: f */
    public final String f27670f;

    /* renamed from: g */
    public final String f27671g;

    public PointOfInterest(LatLng latLng, String str, String str2) {
        this.f27669e = latLng;
        this.f27670f = str;
        this.f27671g = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C10134a.m25570a(parcel);
        C10134a.m25580a(parcel, 2, (Parcelable) this.f27669e, i, false);
        C10134a.m25583a(parcel, 3, this.f27670f, false);
        C10134a.m25583a(parcel, 4, this.f27671g, false);
        C10134a.m25571a(parcel, a);
    }
}
