package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.k */
public final class C10649k implements Creator<CameraPosition> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                latLng = (LatLng) SafeParcelReader.m25537a(parcel, a, LatLng.CREATOR);
            } else if (a2 == 3) {
                f = SafeParcelReader.m25565v(parcel, a);
            } else if (a2 == 4) {
                f2 = SafeParcelReader.m25565v(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                f3 = SafeParcelReader.m25565v(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new CameraPosition(latLng, f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new CameraPosition[i];
    }
}
