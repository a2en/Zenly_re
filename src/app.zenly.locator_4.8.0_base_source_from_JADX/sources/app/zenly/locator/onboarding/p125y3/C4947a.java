package app.zenly.locator.onboarding.p125y3;

import java.util.Calendar;
import java.util.GregorianCalendar;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp.Builder;

/* renamed from: app.zenly.locator.onboarding.y3.a */
public class C4947a {
    /* renamed from: a */
    public static Calendar m14275a(Timestamp timestamp) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(timestamp.getSeconds() * 1000);
        return gregorianCalendar;
    }

    /* renamed from: b */
    public static int m14276b(Calendar calendar) {
        return m14273a(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
    }

    /* renamed from: a */
    public static Timestamp m14274a(Calendar calendar) {
        Builder newBuilder = Timestamp.newBuilder();
        newBuilder.setSeconds(calendar.getTimeInMillis() / 1000);
        return (Timestamp) newBuilder.build();
    }

    /* renamed from: a */
    public static int m14273a(int i, int i2, int i3) {
        Calendar instance = GregorianCalendar.getInstance();
        int i4 = instance.get(2) + 1;
        int i5 = instance.get(5);
        int i6 = instance.get(1) - i;
        return ((i2 != i4 || i3 <= i5) && i2 <= i4) ? i6 : i6 - 1;
    }
}
