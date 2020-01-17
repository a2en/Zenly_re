package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.maps.model.b0 */
public final class C10636b0 implements Creator<Tile> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        byte[] bArr = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 2) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 3) {
                i2 = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                bArr = SafeParcelReader.m25550g(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new Tile(i, i2, bArr);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Tile[i];
    }
}
