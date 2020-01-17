package com.google.android.libraries.places.api.model;

import android.os.Parcelable;

public abstract class TimeOfWeek implements Parcelable {
    public static TimeOfWeek newInstance(DayOfWeek dayOfWeek, LocalTime localTime) {
        return new zzax(dayOfWeek, localTime);
    }

    public abstract DayOfWeek getDay();

    public abstract LocalTime getTime();
}
