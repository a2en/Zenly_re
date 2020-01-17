package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class zzal extends zzn {
    public static final Creator<zzal> CREATOR = new zzao();

    zzal(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        super(timeOfWeek, timeOfWeek2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getOpen(), i);
        parcel.writeParcelable(getClose(), i);
    }
}
