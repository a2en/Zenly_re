package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.places.a */
public final class C10589a implements Creator<PlaceReport> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                str = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 == 3) {
                str2 = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                str3 = SafeParcelReader.m25558o(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new PlaceReport(i, str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlaceReport[i];
    }
}
