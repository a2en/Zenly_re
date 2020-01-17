package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.location.x */
public final class C10597x implements Creator<ActivityTransitionResult> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            if (SafeParcelReader.m25535a(a) != 1) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                arrayList = SafeParcelReader.m25546c(parcel, a, ActivityTransitionEvent.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new ActivityTransitionResult(arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
