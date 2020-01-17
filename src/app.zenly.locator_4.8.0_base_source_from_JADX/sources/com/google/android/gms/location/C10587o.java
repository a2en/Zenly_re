package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.location.o */
public final class C10587o implements Creator<LocationSettingsResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        Status status = null;
        LocationSettingsStates locationSettingsStates = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                status = (Status) SafeParcelReader.m25537a(parcel, a, Status.CREATOR);
            } else if (a2 != 2) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                locationSettingsStates = (LocationSettingsStates) SafeParcelReader.m25537a(parcel, a, LocationSettingsStates.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new LocationSettingsResult(status, locationSettingsStates);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsResult[i];
    }
}
