package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.libraries.places.internal.zzgg;
import com.google.android.libraries.places.internal.zzgv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class OpeningHours implements Parcelable {

    public static abstract class Builder {
        public OpeningHours build() {
            OpeningHours zza = zza();
            for (String isEmpty : zza.getWeekdayText()) {
                zzgg.zzb(!TextUtils.isEmpty(isEmpty), (Object) "WeekdayText must not contain null or empty values.");
            }
            setPeriods(zzgv.zza((Collection<? extends E>) zza.getPeriods()));
            setWeekdayText(zzgv.zza((Collection<? extends E>) zza.getWeekdayText()));
            return zza();
        }

        public abstract Builder setPeriods(List<Period> list);

        public abstract Builder setWeekdayText(List<String> list);

        /* access modifiers changed from: 0000 */
        public abstract OpeningHours zza();
    }

    public static Builder builder() {
        return new zzk().setPeriods(new ArrayList()).setWeekdayText(new ArrayList());
    }

    public abstract List<Period> getPeriods();

    public abstract List<String> getWeekdayText();
}
