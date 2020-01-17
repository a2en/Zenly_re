package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.internal.location.e */
public final class C10492e implements Creator<zzad> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        Status status = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            if (SafeParcelReader.m25535a(a) != 1) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                status = (Status) SafeParcelReader.m25537a(parcel, a, Status.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zzad(status);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
