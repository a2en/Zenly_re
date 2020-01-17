package com.google.android.libraries.places.api.model;

import android.util.Log;
import com.google.android.libraries.places.internal.zzgz;
import com.google.android.libraries.places.internal.zzha;
import com.google.android.libraries.places.internal.zzhb;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

final class zzbb {
    private static final zzha<Integer, DayOfWeek> zza = new zzgz().zza(Integer.valueOf(1), DayOfWeek.SUNDAY).zza(Integer.valueOf(2), DayOfWeek.MONDAY).zza(Integer.valueOf(3), DayOfWeek.TUESDAY).zza(Integer.valueOf(4), DayOfWeek.WEDNESDAY).zza(Integer.valueOf(5), DayOfWeek.THURSDAY).zza(Integer.valueOf(6), DayOfWeek.FRIDAY).zza(Integer.valueOf(7), DayOfWeek.SATURDAY).zza();
    private static final LocalTime zzb = LocalTime.newInstance(23, 59);

    static Boolean zza(Place place, long j) {
        TimeZone timeZone;
        if (place.getOpeningHours() == null || place.getUtcOffsetMinutes() == null) {
            return null;
        }
        List<Period> periods = place.getOpeningHours().getPeriods();
        if (periods.isEmpty()) {
            return Boolean.valueOf(false);
        }
        if (periods.size() == 1 && ((Period) periods.get(0)).getClose() == null && ((Period) periods.get(0)).getOpen().getDay() == DayOfWeek.SUNDAY && ((Period) periods.get(0)).getOpen().getTime().getHours() == 0 && ((Period) periods.get(0)).getOpen().getTime().getMinutes() == 0) {
            return Boolean.valueOf(true);
        }
        for (Period period : periods) {
            if (period.getOpen() != null) {
                if (period.getClose() == null) {
                }
            }
            return null;
        }
        int intValue = place.getUtcOffsetMinutes().intValue();
        String[] availableIDs = TimeZone.getAvailableIDs((int) TimeUnit.MINUTES.toMillis((long) intValue));
        if (availableIDs == null || availableIDs.length <= 0) {
            Log.w("Places", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", new Object[]{Integer.valueOf(intValue)}));
            timeZone = null;
        } else {
            timeZone = TimeZone.getTimeZone(availableIDs[0]);
        }
        if (timeZone == null) {
            return null;
        }
        Calendar instance = Calendar.getInstance(timeZone);
        instance.setTimeInMillis(j);
        DayOfWeek dayOfWeek = (DayOfWeek) zza.get(Integer.valueOf(instance.get(7)));
        LocalTime newInstance = LocalTime.newInstance(instance.get(11), instance.get(12));
        EnumMap enumMap = new EnumMap(DayOfWeek.class);
        if (!periods.isEmpty()) {
            Period period2 = (Period) periods.get(0);
            int i = 0;
            while (period2 != null) {
                TimeOfWeek open = period2.getOpen();
                TimeOfWeek close = period2.getClose();
                DayOfWeek day = open.getDay();
                LocalTime time = open.getTime();
                if (!(open.getDay() != close.getDay())) {
                    List list = (List) zza(enumMap, day, new ArrayList());
                    list.add(zzhb.zzb(time, close.getTime()));
                    enumMap.put(day, list);
                    i++;
                    period2 = i >= periods.size() ? null : (Period) periods.get(i);
                } else {
                    List list2 = (List) zza(enumMap, day, new ArrayList());
                    list2.add(zzhb.zza(time, zzb));
                    enumMap.put(day, list2);
                    period2 = Period.builder().setOpen(TimeOfWeek.newInstance(DayOfWeek.values()[(day.ordinal() + 1) % 7], LocalTime.newInstance(0, 0))).setClose(period2.getClose()).build();
                }
            }
        }
        List<zzhb> list3 = (List) enumMap.get(dayOfWeek);
        if (list3 == null) {
            return Boolean.valueOf(false);
        }
        for (zzhb zzb2 : list3) {
            if (zzb2.zzb(newInstance)) {
                return Boolean.valueOf(true);
            }
        }
        return Boolean.valueOf(false);
    }

    private static <K, V> V zza(Map<K, V> map, K k, V v) {
        return map.containsKey(k) ? map.get(k) : v;
    }
}
