package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.response.d */
public final class C10160d implements Creator<zaj> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        ArrayList arrayList = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                arrayList = SafeParcelReader.m25546c(parcel, a, zam.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                str = SafeParcelReader.m25558o(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zaj(i, arrayList, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zaj[i];
    }
}
