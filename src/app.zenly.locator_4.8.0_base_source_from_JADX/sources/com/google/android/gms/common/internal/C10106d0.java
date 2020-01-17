package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.d0 */
public final class C10106d0 implements Creator<zza> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        Bundle bundle = null;
        Feature[] featureArr = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                bundle = SafeParcelReader.m25549f(parcel, a);
            } else if (a2 == 2) {
                featureArr = (Feature[]) SafeParcelReader.m25543b(parcel, a, Feature.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                i = SafeParcelReader.m25568y(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zza(bundle, featureArr, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zza[i];
    }
}
