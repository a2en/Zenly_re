package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.signin.internal.f */
public final class C10687f implements Creator<zai> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        ResolveAccountRequest resolveAccountRequest = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 2) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                resolveAccountRequest = (ResolveAccountRequest) SafeParcelReader.m25537a(parcel, a, ResolveAccountRequest.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zai(i, resolveAccountRequest);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
