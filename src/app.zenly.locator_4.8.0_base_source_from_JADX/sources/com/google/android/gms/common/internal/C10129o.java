package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.o */
public final class C10129o implements Creator<AuthAccountRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 1:
                    i = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 2:
                    iBinder = SafeParcelReader.m25567x(parcel, a);
                    break;
                case 3:
                    scopeArr = (Scope[]) SafeParcelReader.m25543b(parcel, a, Scope.CREATOR);
                    break;
                case 4:
                    num = SafeParcelReader.m25569z(parcel, a);
                    break;
                case 5:
                    num2 = SafeParcelReader.m25569z(parcel, a);
                    break;
                case 6:
                    account = (Account) SafeParcelReader.m25537a(parcel, a, Account.CREATOR);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        AuthAccountRequest authAccountRequest = new AuthAccountRequest(i, iBinder, scopeArr, num, num2, account);
        return authAccountRequest;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }
}
