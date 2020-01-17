package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzaz implements Creator<zzax> {
    zzaz() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzax((DayOfWeek) parcel.readParcelable(DayOfWeek.class.getClassLoader()), (LocalTime) parcel.readParcelable(LocalTime.class.getClassLoader()));
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzax[i];
    }
}
