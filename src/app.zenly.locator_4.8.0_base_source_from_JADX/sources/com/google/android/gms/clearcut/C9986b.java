package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.clearcut.b */
public final class C9986b implements Creator<zzc> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        long j = 0;
        long j2 = 0;
        boolean z = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                z = SafeParcelReader.m25562s(parcel, a);
            } else if (a2 == 2) {
                j2 = SafeParcelReader.m25531A(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                j = SafeParcelReader.m25531A(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        zzc zzc = new zzc(z, j, j2);
        return zzc;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
