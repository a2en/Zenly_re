package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.n0 */
public final class C10128n0 implements Creator<zzs> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            if (SafeParcelReader.m25535a(a) != 1) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                i = SafeParcelReader.m25568y(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zzs(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
