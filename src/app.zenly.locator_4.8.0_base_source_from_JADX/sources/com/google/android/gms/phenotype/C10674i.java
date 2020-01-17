package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.phenotype.i */
public final class C10674i implements Creator<zzi> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        long j = 0;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 2:
                    str = SafeParcelReader.m25558o(parcel2, a);
                    break;
                case 3:
                    j = SafeParcelReader.m25531A(parcel2, a);
                    break;
                case 4:
                    z = SafeParcelReader.m25562s(parcel2, a);
                    break;
                case 5:
                    d = SafeParcelReader.m25564u(parcel2, a);
                    break;
                case 6:
                    str2 = SafeParcelReader.m25558o(parcel2, a);
                    break;
                case 7:
                    bArr = SafeParcelReader.m25550g(parcel2, a);
                    break;
                case 8:
                    i = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 9:
                    i2 = SafeParcelReader.m25568y(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel2, b);
        zzi zzi = new zzi(str, j, z, d, str2, bArr, i, i2);
        return zzi;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzi[i];
    }
}
