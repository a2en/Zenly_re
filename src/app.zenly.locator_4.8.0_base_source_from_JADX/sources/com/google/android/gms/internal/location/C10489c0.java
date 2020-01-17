package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.c0 */
public final class C10489c0 implements Creator<zzbh> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m25542b(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 1:
                    str = SafeParcelReader.m25558o(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m25531A(parcel2, a);
                    break;
                case 3:
                    s = SafeParcelReader.m25532B(parcel2, a);
                    break;
                case 4:
                    d = SafeParcelReader.m25564u(parcel2, a);
                    break;
                case 5:
                    d2 = SafeParcelReader.m25564u(parcel2, a);
                    break;
                case 6:
                    f = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 7:
                    i = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 8:
                    i2 = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 9:
                    i3 = SafeParcelReader.m25568y(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel2, b);
        zzbh zzbh = new zzbh(str, i, s, d, d2, f, j, i2, i3);
        return zzbh;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
