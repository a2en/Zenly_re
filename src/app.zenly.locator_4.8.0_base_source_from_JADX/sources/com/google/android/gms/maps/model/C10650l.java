package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.l */
public final class C10650l implements Creator<Cap> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        IBinder iBinder = null;
        int i = 0;
        Float f = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 3) {
                iBinder = SafeParcelReader.m25567x(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                f = SafeParcelReader.m25566w(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new Cap(i, iBinder, f);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Cap[i];
    }
}
