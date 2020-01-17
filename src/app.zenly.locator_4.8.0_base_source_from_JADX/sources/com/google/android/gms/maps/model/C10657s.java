package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.s */
public final class C10657s implements Creator<PatternItem> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                f = SafeParcelReader.m25566w(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new PatternItem(i, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PatternItem[i];
    }
}
