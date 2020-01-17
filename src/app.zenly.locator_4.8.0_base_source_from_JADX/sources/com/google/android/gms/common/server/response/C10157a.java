package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.zab;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;

/* renamed from: com.google.android.gms.common.server.response.a */
public final class C10157a implements Creator<Field> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        String str2 = null;
        zab zab = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 1:
                    i = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 2:
                    i2 = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 3:
                    z = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 4:
                    i3 = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 6:
                    str = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 7:
                    i4 = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 8:
                    str2 = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 9:
                    zab = (zab) SafeParcelReader.m25537a(parcel, a, zab.CREATOR);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        Field field = new Field(i, i2, z, i3, z2, str, i4, str2, zab);
        return field;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Field[i];
    }
}
