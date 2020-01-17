package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.List;

/* renamed from: com.google.android.gms.location.k */
public final class C10581k implements Creator<LocationResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        List<Location> list = LocationResult.f27512f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            if (SafeParcelReader.m25535a(a) != 1) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                list = SafeParcelReader.m25546c(parcel, a, Location.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new LocationResult(list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationResult[i];
    }
}
