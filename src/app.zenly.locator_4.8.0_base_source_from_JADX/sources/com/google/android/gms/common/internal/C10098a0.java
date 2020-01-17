package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.a0 */
public final class C10098a0 implements Creator<ResolveAccountResponse> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        IBinder iBinder = null;
        ConnectionResult connectionResult = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                iBinder = SafeParcelReader.m25567x(parcel, a);
            } else if (a2 == 3) {
                connectionResult = (ConnectionResult) SafeParcelReader.m25537a(parcel, a, ConnectionResult.CREATOR);
            } else if (a2 == 4) {
                z = SafeParcelReader.m25562s(parcel, a);
            } else if (a2 != 5) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                z2 = SafeParcelReader.m25562s(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        ResolveAccountResponse resolveAccountResponse = new ResolveAccountResponse(i, iBinder, connectionResult, z, z2);
        return resolveAccountResponse;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountResponse[i];
    }
}
