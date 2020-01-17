package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.s */
public final class C10152s implements Creator<zzj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                str = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 == 2) {
                iBinder = SafeParcelReader.m25567x(parcel, a);
            } else if (a2 == 3) {
                z = SafeParcelReader.m25562s(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                z2 = SafeParcelReader.m25562s(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zzj(str, iBinder, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
