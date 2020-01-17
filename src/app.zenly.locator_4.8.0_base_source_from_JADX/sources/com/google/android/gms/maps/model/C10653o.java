package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.o */
public final class C10653o implements Creator<LatLngBounds> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                latLng = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                latLng2 = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new LatLngBounds(latLng, latLng2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLngBounds[i];
    }
}
