package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.firebase.messaging.h */
public final class C11109h implements Creator<RemoteMessage> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m25542b(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m25536a(parcel);
            if (SafeParcelReader.m25535a(a) != 2) {
                SafeParcelReader.m25534D(parcel, a);
            } else {
                bundle = SafeParcelReader.m25549f(parcel, a);
            }
        }
        SafeParcelReader.m25561r(parcel, b);
        return new RemoteMessage(bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
