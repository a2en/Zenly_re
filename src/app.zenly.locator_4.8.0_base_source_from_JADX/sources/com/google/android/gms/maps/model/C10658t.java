package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.t */
public final class C10658t implements Creator<PointOfInterest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                latLng = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 3) {
                str = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                str2 = SafeParcelReader.m25558o(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new PointOfInterest(latLng, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PointOfInterest[i];
    }
}
