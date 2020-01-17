package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzao implements Creator<zzal> {
    zzao() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzal((TimeOfWeek) parcel.readParcelable(TimeOfWeek.class.getClassLoader()), (TimeOfWeek) parcel.readParcelable(TimeOfWeek.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
