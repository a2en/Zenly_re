package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.w */
public final class C10661w implements Creator<StreetViewPanoramaCamera> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                f = SafeParcelReader.m25565v(parcel, a);
            } else if (a2 == 3) {
                f2 = SafeParcelReader.m25565v(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                f3 = SafeParcelReader.m25565v(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new StreetViewPanoramaCamera(f, f2, f3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaCamera[i];
    }
}
