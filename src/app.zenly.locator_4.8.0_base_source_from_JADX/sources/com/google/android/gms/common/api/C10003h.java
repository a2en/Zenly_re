package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.api.h */
public final class C10003h implements Creator<Status> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i2 = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                str = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m25537a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 1000) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                i = SafeParcelReader.m25568y(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new Status(i, i2, str, pendingIntent);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
