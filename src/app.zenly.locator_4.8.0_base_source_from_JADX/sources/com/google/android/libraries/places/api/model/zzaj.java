package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

final class zzaj extends zzl {
    public static final Creator<zzaj> CREATOR = new zzam();

    zzaj(List<Period> list, List<String> list2) {
        super(list, list2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(getPeriods());
        parcel.writeList(getWeekdayText());
    }
}
