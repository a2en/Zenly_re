package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.data.a */
public final class C10071a implements Creator<BitmapTeleporter> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) SafeParcelReader.m25537a(parcel, a, ParcelFileDescriptor.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                i2 = SafeParcelReader.m25568y(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
