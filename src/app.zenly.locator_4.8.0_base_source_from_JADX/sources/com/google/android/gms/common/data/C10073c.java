package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.data.c */
public final class C10073c implements Creator<DataHolder> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                strArr = SafeParcelReader.m25559p(parcel, a);
            } else if (a2 == 2) {
                cursorWindowArr = (CursorWindow[]) SafeParcelReader.m25543b(parcel, a, CursorWindow.CREATOR);
            } else if (a2 == 3) {
                i2 = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 4) {
                bundle = SafeParcelReader.m25549f(parcel, a);
            } else if (a2 != 1000) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                i = SafeParcelReader.m25568y(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        DataHolder dataHolder = new DataHolder(i, strArr, cursorWindowArr, i2, bundle);
        dataHolder.mo27317b();
        return dataHolder;
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
