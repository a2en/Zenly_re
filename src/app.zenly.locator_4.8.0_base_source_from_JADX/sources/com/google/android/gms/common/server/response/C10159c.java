package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.c */
public final class C10159c implements Creator<zam> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String str = null;
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                str = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                arrayList = SafeParcelReader.m25546c(parcel, a, zal.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zam(i, str, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
