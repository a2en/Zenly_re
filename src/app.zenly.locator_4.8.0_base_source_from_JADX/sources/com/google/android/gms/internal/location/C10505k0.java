package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.k0 */
public final class C10505k0 implements Creator<zzo> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        zzm zzm = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i = 1;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                zzm = (zzm) SafeParcelReader.m25537a(parcel, a, zzm.CREATOR);
            } else if (a2 == 3) {
                iBinder = SafeParcelReader.m25567x(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                iBinder2 = SafeParcelReader.m25567x(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zzo(i, zzm, iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
