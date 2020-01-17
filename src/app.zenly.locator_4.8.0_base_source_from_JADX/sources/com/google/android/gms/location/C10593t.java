package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.t */
public final class C10593t implements Creator<ActivityTransition> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 2) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                i2 = SafeParcelReader.m25568y(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new ActivityTransition(i, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransition[i];
    }
}
