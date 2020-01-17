package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.clearcut.e5 */
public final class C10303e5 implements Creator<zzr> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 2:
                    str = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 3:
                    i = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 4:
                    i2 = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 5:
                    str2 = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 6:
                    str3 = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 7:
                    z = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 8:
                    str4 = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 9:
                    z2 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 10:
                    i3 = SafeParcelReader.m25568y(parcel, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        zzr zzr = new zzr(str, i, i2, str2, str3, z, str4, z2, i3);
        return zzr;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzr[i];
    }
}
