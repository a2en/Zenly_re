package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.internal.location.zzbh;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.f0 */
public final class C10572f0 implements Creator<GeofencingRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        ArrayList arrayList = null;
        int i = 0;
        String str = "";
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                arrayList = SafeParcelReader.m25546c(parcel, a, zzbh.CREATOR);
            } else if (a2 == 2) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                str = SafeParcelReader.m25558o(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new GeofencingRequest(arrayList, i, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GeofencingRequest[i];
    }
}
