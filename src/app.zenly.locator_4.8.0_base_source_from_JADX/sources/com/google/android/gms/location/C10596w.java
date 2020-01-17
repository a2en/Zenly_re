package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.location.w */
public final class C10596w implements Creator<ActivityTransitionRequest> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        ArrayList arrayList = null;
        String str = null;
        List list = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            int a2 = SafeParcelReader.m25535a(a);
            if (a2 == 1) {
                arrayList = SafeParcelReader.m25546c(parcel, a, ActivityTransition.CREATOR);
            } else if (a2 == 2) {
                str = SafeParcelReader.m25558o(parcel, a);
            } else if (a2 != 3) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                list = SafeParcelReader.m25546c(parcel, a, ClientIdentity.CREATOR);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new ActivityTransitionRequest(arrayList, str, list);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
