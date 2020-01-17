package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.p */
public final class C10588p implements Creator<LocationSettingsStates> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 1:
                    z = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 2:
                    z2 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 3:
                    z3 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 4:
                    z4 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 5:
                    z5 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 6:
                    z6 = SafeParcelReader.m25562s(parcel, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        LocationSettingsStates locationSettingsStates = new LocationSettingsStates(z, z2, z3, z4, z5, z6);
        return locationSettingsStates;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsStates[i];
    }
}
