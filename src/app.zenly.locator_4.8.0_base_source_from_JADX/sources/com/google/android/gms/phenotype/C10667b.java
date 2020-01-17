package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.phenotype.b */
public final class C10667b implements Creator<Configuration> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        zzi[] zziArr = null;
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 3) {
                zziArr = (zzi[]) SafeParcelReader.m25543b(parcel, a, zzi.CREATOR);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                strArr = SafeParcelReader.m25559p(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new Configuration(i, zziArr, strArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Configuration[i];
    }
}
