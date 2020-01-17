package com.segment.analytics.p326t;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.segment.analytics.t.a */
final class C11691a {

    /* renamed from: a */
    static final TimeZone f30318a = TimeZone.getTimeZone("GMT");

    /* renamed from: a */
    public static String m30691a(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f30318a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(24);
        m30692a(sb, gregorianCalendar.get(1), 4);
        sb.append('-');
        m30692a(sb, gregorianCalendar.get(2) + 1, 2);
        sb.append('-');
        m30692a(sb, gregorianCalendar.get(5), 2);
        sb.append('T');
        m30692a(sb, gregorianCalendar.get(11), 2);
        sb.append(':');
        m30692a(sb, gregorianCalendar.get(12), 2);
        sb.append(':');
        m30692a(sb, gregorianCalendar.get(13), 2);
        sb.append('.');
        m30692a(sb, gregorianCalendar.get(14), 3);
        sb.append('Z');
        return sb.toString();
    }

    /* renamed from: a */
    private static void m30692a(StringBuilder sb, int i, int i2) {
        String num = Integer.toString(i);
        for (int length = i2 - num.length(); length > 0; length--) {
            sb.append('0');
        }
        sb.append(num);
    }
}
