package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.q */
public final class C10590q implements Creator<zzaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 3) {
                j = SafeParcelReader.m25531A(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                j2 = SafeParcelReader.m25531A(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        zzaj zzaj = new zzaj(i, i2, j, j2);
        return zzaj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaj[i];
    }
}
