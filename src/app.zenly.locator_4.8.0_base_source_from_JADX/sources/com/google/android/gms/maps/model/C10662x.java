package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.x */
public final class C10662x implements Creator<StreetViewPanoramaLink> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                str = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                f = SafeParcelReader.m25565v(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new StreetViewPanoramaLink(str, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StreetViewPanoramaLink[i];
    }
}
