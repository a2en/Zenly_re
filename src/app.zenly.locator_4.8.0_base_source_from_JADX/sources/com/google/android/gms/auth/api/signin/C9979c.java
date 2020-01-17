package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.auth.api.signin.c */
public final class C9979c implements Creator<GoogleSignInOptions> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            switch (SafeParcelReader.m25535a(a)) {
                case 1:
                    i = SafeParcelReader.m25568y(parcel, a);
                    break;
                case 2:
                    arrayList = SafeParcelReader.m25546c(parcel, a, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m25537a(parcel, a, Account.CREATOR);
                    break;
                case 4:
                    z = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 5:
                    z2 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 6:
                    z3 = SafeParcelReader.m25562s(parcel, a);
                    break;
                case 7:
                    str = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 8:
                    str2 = SafeParcelReader.m25558o(parcel, a);
                    break;
                case 9:
                    arrayList2 = SafeParcelReader.m25546c(parcel, a, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case 10:
                    str3 = SafeParcelReader.m25558o(parcel, a);
                    break;
                default:
                    SafeParcelReader.m25534D(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
        return googleSignInOptions;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
