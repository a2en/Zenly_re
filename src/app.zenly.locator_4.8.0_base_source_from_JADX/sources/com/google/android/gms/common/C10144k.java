package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.k */
public final class C10144k implements Creator<Feature> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 == 2) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                j = SafeParcelReader.m25531A(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new Feature(str, i, j);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
