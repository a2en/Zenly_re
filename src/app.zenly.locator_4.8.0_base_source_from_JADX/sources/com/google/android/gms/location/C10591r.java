package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.r */
public final class C10591r implements Creator<zzal> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        ArrayList arrayList = null;
        String str = "";
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                arrayList = SafeParcelReader.m25560q(parcel, a);
            } else if (a2 == 2) {
                pendingIntent = (PendingIntent) SafeParcelReader.m25537a(parcel, a, PendingIntent.CREATOR);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                str = SafeParcelReader.m25558o(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new zzal(arrayList, pendingIntent, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
