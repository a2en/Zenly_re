package com.google.android.gms.gcm;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.gcm.h */
final class C10217h implements Creator<OneoffTask> {
    C10217h() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OneoffTask(parcel, (C10217h) null);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OneoffTask[i];
    }
}
