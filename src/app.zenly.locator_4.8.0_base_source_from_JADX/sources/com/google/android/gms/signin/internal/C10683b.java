package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.signin.internal.b */
public final class C10683b implements Creator<zab> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                intent = (Intent) SafeParcelReader.m25537a(parcel, a, Intent.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zab(i, i2, intent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zab[i];
    }
}
