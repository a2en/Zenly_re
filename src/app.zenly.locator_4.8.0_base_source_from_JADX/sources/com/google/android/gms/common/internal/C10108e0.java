package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.e0 */
public final class C10108e0 implements Creator<GetServiceRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        Feature[] featureArr = null;
        Feature[] featureArr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 1:
                    i = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 2:
                    i2 = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 3:
                    i3 = SafeParcelReader.m25568y(parcel2, a);
                    break;
                case 4:
                    str = SafeParcelReader.m25558o(parcel2, a);
                    break;
                case 5:
                    iBinder = SafeParcelReader.m25567x(parcel2, a);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.m25543b(parcel2, a, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.m25549f(parcel2, a);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.m25537a(parcel2, a, Account.CREATOR);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.m25543b(parcel2, a, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m25543b(parcel2, a, Feature.CREATOR);
                    break;
                case 12:
                    z = SafeParcelReader.m25562s(parcel2, a);
                    break;
                case 13:
                    i4 = SafeParcelReader.m25568y(parcel2, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel2, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel2, b);
        GetServiceRequest getServiceRequest = new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4);
        return getServiceRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
