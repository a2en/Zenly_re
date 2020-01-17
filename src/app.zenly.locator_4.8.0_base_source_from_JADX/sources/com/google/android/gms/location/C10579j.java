package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.j */
public final class C10579j implements Creator<LocationRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m25542b(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 1:
                    i = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 2:
                    j = SafeParcelReader.m25531A(parcel2, a);
                    break;
                case 3:
                    j2 = SafeParcelReader.m25531A(parcel2, a);
                    break;
                case 4:
                    z = SafeParcelReader.m25562s(parcel2, a);
                    break;
                case 5:
                    j3 = SafeParcelReader.m25531A(parcel2, a);
                    break;
                case 6:
                    i2 = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 7:
                    f = SafeParcelReader.m25565v(parcel2, a);
                    break;
                case 8:
                    j4 = SafeParcelReader.m25531A(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel2, b);
        LocationRequest locationRequest = new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        return locationRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
