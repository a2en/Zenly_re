package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.p */
public final class C10654p implements Creator<LatLng> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                d = SafeParcelReader.m25564u(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                d2 = SafeParcelReader.m25564u(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new LatLng(d, d2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LatLng[i];
    }
}
