package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzgg;
import com.google.android.libraries.places.internal.zzhb;

public abstract class LocalTime implements Parcelable, Comparable<LocalTime> {

    static abstract class zza {
        zza() {
        }

        /* access modifiers changed from: 0000 */
        public abstract zza zza(int i);

        /* access modifiers changed from: 0000 */
        public abstract LocalTime zza();

        /* access modifiers changed from: 0000 */
        public abstract zza zzb(int i);
    }

    public static LocalTime newInstance(int i, int i2) {
        try {
            LocalTime zza2 = new zzi().zza(i).zzb(i2).zza();
            int hours = zza2.getHours();
            zzgg.zza(zzhb.zza(Integer.valueOf(0), Integer.valueOf(23)).zzb(Integer.valueOf(hours)), "Hours must not be out-of-range: 0 to 23, but was: %s.", hours);
            int minutes = zza2.getMinutes();
            zzgg.zza(zzhb.zza(Integer.valueOf(0), Integer.valueOf(59)).zzb(Integer.valueOf(minutes)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", minutes);
            return zza2;
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public int compareTo(LocalTime localTime) {
        int hours;
        int hours2;
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }

    public abstract int getHours();

    public abstract int getMinutes();
}
