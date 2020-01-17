package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.android.volley.toolbox.C8733j;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.i */
public final class C10577i implements Creator<LocationAvailability> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        long j = 0;
        zzaj[] zzajArr = null;
        int i = C8733j.DEFAULT_IMAGE_TIMEOUT_MS;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i2 = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                i3 = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 3) {
                j = SafeParcelReader.m25531A(parcel, a);
            } else if (a2 == 4) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                zzajArr = (zzaj[]) SafeParcelReader.m25543b(parcel, a, zzaj.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        LocationAvailability locationAvailability = new LocationAvailability(i, i2, i3, j, zzajArr);
        return locationAvailability;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
