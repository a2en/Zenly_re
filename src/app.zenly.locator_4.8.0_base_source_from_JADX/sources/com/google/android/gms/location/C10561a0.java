package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.a0 */
public final class C10561a0 implements Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m25542b(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                z = SafeParcelReader.m25562s(parcel2, a);
            } else if (a2 == 2) {
                j = SafeParcelReader.m25531A(parcel2, a);
            } else if (a2 == 3) {
                f = SafeParcelReader.m25565v(parcel2, a);
            } else if (a2 == 4) {
                j2 = SafeParcelReader.m25531A(parcel2, a);
            } else if (a2 != 5) {
                SafeParcelReader.m25534D(parcel2, a);
            } else {
                i = SafeParcelReader.m25568y(parcel2, a);
            }
        }
        SafeParcelReader.m25561r(parcel2, b);
        zzj zzj = new zzj(z, j, f, j2, i);
        return zzj;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
