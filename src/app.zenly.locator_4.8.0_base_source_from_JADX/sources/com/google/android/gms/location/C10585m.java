package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.m */
public final class C10585m implements Creator<zzae> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                str2 = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 == 2) {
                str3 = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                str = SafeParcelReader.m25558o(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zzae(str, str2, str3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
