package zendesk.support.request;

import android.text.format.DateUtils;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

class UtilsDate {
    static Date getBeginOfDay(Date date) {
        Calendar calendar = getCalendar(date);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTime();
    }

    private static Calendar getCalendar(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getDefault(), Locale.getDefault());
        gregorianCalendar.setTime(date);
        return gregorianCalendar;
    }

    private static Date getYesterday() {
        Calendar calendar = getCalendar(new Date());
        calendar.add(5, -1);
        return calendar.getTime();
    }

    static boolean isSameDay(Date date, Date date2) {
        Calendar calendar = getCalendar(date);
        Calendar calendar2 = getCalendar(date2);
        boolean z = calendar.get(1) == calendar2.get(1);
        boolean z2 = calendar.get(2) == calendar2.get(2);
        boolean z3 = calendar.get(5) == calendar2.get(5);
        if (!z || !z2 || !z3) {
            return false;
        }
        return true;
    }

    static boolean isToday(Date date) {
        return DateUtils.isToday(date.getTime());
    }

    static boolean isYesterday(Date date) {
        return isSameDay(date, getYesterday());
    }
}
