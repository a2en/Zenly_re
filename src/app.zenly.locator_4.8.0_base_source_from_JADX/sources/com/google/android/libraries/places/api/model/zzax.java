package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzax extends zzw {
    public static final Creator<zzax> CREATOR = new zzaz();

    zzax(DayOfWeek dayOfWeek, LocalTime localTime) {
        super(dayOfWeek, localTime);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDay(), i);
        parcel.writeParcelable(getTime(), i);
    }
}
