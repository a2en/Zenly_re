package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.y */
public final class C10663y implements Creator<StreetViewPanoramaLocation> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        StreetViewPanoramaLink[] streetViewPanoramaLinkArr = null;
        LatLng latLng = null;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                streetViewPanoramaLinkArr = (StreetViewPanoramaLink[]) SafeParcelReader.m25543b(parcel, a, StreetViewPanoramaLink.CREATOR);
            } else if (a2 == 3) {
                latLng = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                str = SafeParcelReader.m25558o(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new StreetViewPanoramaLocation(streetViewPanoramaLinkArr, latLng, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLocation[i];
    }
}
