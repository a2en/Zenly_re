package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.j */
public final class C10143j implements Creator<ConnectionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        int i = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                i = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 2) {
                i2 = SafeParcelReader.m25568y(parcel, a);
            } else if (a2 == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.m25537a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 4) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                str = SafeParcelReader.m25558o(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new ConnectionResult(i, i2, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
