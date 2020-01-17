package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.signin.internal.g */
public final class C10688g implements Creator<zak> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                connectionResult = (ConnectionResult) SafeParcelReader.m25537a(parcel, a, ConnectionResult.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) SafeParcelReader.m25537a(parcel, a, ResolveAccountResponse.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zak(i, connectionResult, resolveAccountResponse);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
