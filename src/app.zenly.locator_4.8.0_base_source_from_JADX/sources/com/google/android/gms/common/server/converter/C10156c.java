package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.StringToIntConverter.zaa;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.converter.c */
public final class C10156c implements Creator<StringToIntConverter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 2) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                arrayList = SafeParcelReader.m25546c(parcel, a, zaa.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new StringToIntConverter(i, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
