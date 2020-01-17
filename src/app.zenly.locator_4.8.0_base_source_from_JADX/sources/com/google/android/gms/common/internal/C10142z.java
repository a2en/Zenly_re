package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.z */
public final class C10142z implements Creator<ResolveAccountRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        Account account = null;
        int i = 0;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                account = (Account) SafeParcelReader.m25537a(parcel, a, Account.CREATOR);
            } else if (a2 == 3) {
                i2 = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m25537a(parcel, a, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new ResolveAccountRequest(i, account, i2, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ResolveAccountRequest[i];
    }
}
