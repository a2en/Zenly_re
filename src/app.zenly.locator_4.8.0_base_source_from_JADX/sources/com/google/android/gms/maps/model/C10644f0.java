package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.f0 */
public final class C10644f0 implements Creator<VisibleRegion> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        LatLng latLng = null;
        LatLng latLng2 = null;
        LatLng latLng3 = null;
        LatLng latLng4 = null;
        LatLngBounds latLngBounds = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                latLng = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 3) {
                latLng2 = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 4) {
                latLng3 = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 5) {
                latLng4 = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
            } else if (a2 != 6) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                latLngBounds = (LatLngBounds) SafeParcelReader.m25537a(parcel, a, LatLngBounds.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        VisibleRegion visibleRegion = new VisibleRegion(latLng, latLng2, latLng3, latLng4, latLngBounds);
        return visibleRegion;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new VisibleRegion[i];
    }
}
