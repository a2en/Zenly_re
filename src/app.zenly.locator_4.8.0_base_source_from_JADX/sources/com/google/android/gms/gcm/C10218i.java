package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.gcm.i */
final class C10218i implements Creator<PendingCallback> {
    C10218i() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PendingCallback(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PendingCallback[i];
    }
}
