package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

/* renamed from: com.google.android.gms.common.server.response.b */
public final class C10158b implements Creator<zal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        int i = 0;
        Field field = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                str = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                field = (Field) SafeParcelReader.m25537a(parcel, a, (Creator<T>) Field.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zal(i, str, field);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zal[i];
    }
}
