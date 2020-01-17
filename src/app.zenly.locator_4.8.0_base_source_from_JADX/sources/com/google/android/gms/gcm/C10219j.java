package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.gcm.j */
final class C10219j implements Creator<PeriodicTask> {
    C10219j() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PeriodicTask(parcel, (C10219j) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PeriodicTask[i];
    }
}
