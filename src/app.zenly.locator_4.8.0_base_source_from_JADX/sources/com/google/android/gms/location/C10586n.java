package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.n */
public final class C10586n implements Creator<LocationSettingsRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        zzae zzae = null;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                arrayList = SafeParcelReader.m25546c(parcel, a, LocationRequest.CREATOR);
            } else if (a2 == 2) {
                z = SafeParcelReader.m25562s(parcel, a);
            } else if (a2 == 3) {
                z2 = SafeParcelReader.m25562s(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                zzae = (zzae) SafeParcelReader.m25537a(parcel, a, zzae.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new LocationSettingsRequest(arrayList, z, z2, zzae);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationSettingsRequest[i];
    }
}
