package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.server.response.e */
public final class C10161e implements Creator<SafeParcelResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        Parcel parcel2 = null;
        int i = 0;
        zaj zaj = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                parcel2 = SafeParcelReader.m25556m(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                zaj = (zaj) SafeParcelReader.m25537a(parcel, a, zaj.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new SafeParcelResponse(i, parcel2, zaj);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
