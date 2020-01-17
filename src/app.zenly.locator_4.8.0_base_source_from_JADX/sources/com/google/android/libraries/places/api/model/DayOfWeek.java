package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public enum DayOfWeek implements Parcelable {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
    
    public static final Creator<DayOfWeek> CREATOR = null;

    static {
        CREATOR = new zzba();
    }

    static DayOfWeek zza(Parcel parcel) {
        return valueOf(parcel.readString());
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
