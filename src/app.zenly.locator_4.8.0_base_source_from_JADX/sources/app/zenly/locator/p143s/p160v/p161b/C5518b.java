package app.zenly.locator.p143s.p160v.p161b;

import android.content.Context;
import android.text.format.DateFormat;
import android.util.SparseArray;
import app.zenly.locator.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p259h.C7683c;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;

/* renamed from: app.zenly.locator.s.v.b.b */
public final class C5518b {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f14154a;

    /* renamed from: b */
    private static final int[] f14155b = {R.string.cldr_dateTime_12Hour_HHmm, R.string.cldr_dateTime_12Hour_EEE, R.string.cldr_dateTime_12Hour_EEEE, R.string.cldr_dateTime_12Hour_EEEEHHmm, R.string.cldr_dateTime_12Hour_MMMd, R.string.cldr_dateTime_12Hour_MMMMd, R.string.cldr_dateTime_12Hour_MMMMdHHmm, R.string.cldr_dateTime_12Hour_MMMdyyyy, R.string.cldr_dateTime_12Hour_MMMMdyyyy, R.string.cldr_dateTime_12Hour_MMMMdyyyyHHmm, R.string.cldr_dateTime_24Hour_HHmm, R.string.cldr_dateTime_24Hour_EEE, R.string.cldr_dateTime_24Hour_EEEE, R.string.cldr_dateTime_24Hour_EEEEHHmm, R.string.cldr_dateTime_24Hour_MMMd, R.string.cldr_dateTime_24Hour_MMMMd, R.string.cldr_dateTime_24Hour_MMMMdHHmm, R.string.cldr_dateTime_24Hour_MMMdyyyy, R.string.cldr_dateTime_24Hour_MMMMdyyyy, R.string.cldr_dateTime_24Hour_MMMMdyyyyHHmm};

    /* renamed from: c */
    private static final ReadWriteProperty f14156c = C7683c.m18707a(C5520b.f14161f);

    /* renamed from: d */
    public static final C5518b f14157d = new C5518b();

    /* renamed from: app.zenly.locator.s.v.b.b$a */
    private static final class C5519a {

        /* renamed from: a */
        private Date f14158a = new Date();

        /* renamed from: b */
        private Locale f14159b;

        /* renamed from: c */
        private SparseArray<SimpleDateFormat> f14160c;

        public C5519a() {
            Locale locale = Locale.ROOT;
            C12932j.m33815a((Object) locale, "Locale.ROOT");
            this.f14159b = locale;
            this.f14160c = new SparseArray<>();
        }

        /* renamed from: a */
        public final Date mo13139a() {
            return this.f14158a;
        }

        /* renamed from: b */
        public final SparseArray<SimpleDateFormat> mo13141b() {
            return this.f14160c;
        }

        /* renamed from: c */
        public final Locale mo13142c() {
            return this.f14159b;
        }

        /* renamed from: a */
        public final void mo13140a(Locale locale) {
            C12932j.m33818b(locale, "<set-?>");
            this.f14159b = locale;
        }
    }

    /* renamed from: app.zenly.locator.s.v.b.b$b */
    static final class C5520b extends C12933k implements Function0<C5519a> {

        /* renamed from: f */
        public static final C5520b f14161f = new C5520b();

        C5520b() {
            super(0);
        }

        public final C5519a invoke() {
            return new C5519a();
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C5518b.class), "formatInfo", "getFormatInfo()Lapp/zenly/locator/core/text/format/DateTimeFormatter$FormatInfo;");
        C12946x.m33839a((C12940r) sVar);
        f14154a = new KProperty[]{sVar};
    }

    private C5518b() {
    }

    /* renamed from: a */
    private final C5519a m15643a() {
        return (C5519a) f14156c.getValue(this, f14154a[0]);
    }

    /* renamed from: a */
    public static final String m15645a(Context context, long j) {
        return m15648a(context, j, null, 4, null);
    }

    /* renamed from: a */
    public static /* synthetic */ String m15648a(Context context, long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 4) != 0) {
            timeZone = TimeZone.getDefault();
            C12932j.m33815a((Object) timeZone, "TimeZone.getDefault()");
        }
        return m15656c(context, j, timeZone);
    }

    /* renamed from: b */
    public static final String m15652b(Context context, long j, TimeZone timeZone) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(timeZone, "timezone");
        return f14157d.m15644a(context, 3, j, timeZone);
    }

    /* renamed from: c */
    public static final String m15656c(Context context, long j, TimeZone timeZone) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(timeZone, "timezone");
        return f14157d.m15644a(context, 0, j, timeZone);
    }

    /* renamed from: d */
    public static final String m15658d(Context context, long j, TimeZone timeZone) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(timeZone, "timezone");
        return f14157d.m15644a(context, 6, j, timeZone);
    }

    /* renamed from: e */
    public static final String m15660e(Context context, long j, TimeZone timeZone) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(timeZone, "timezone");
        return f14157d.m15644a(context, 9, j, timeZone);
    }

    /* renamed from: f */
    public static final String m15661f(Context context, long j, TimeZone timeZone) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(timeZone, "timezone");
        return f14157d.m15644a(context, 4, j, timeZone);
    }

    /* renamed from: g */
    public static final String m15662g(Context context, long j, TimeZone timeZone) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(timeZone, "timezone");
        return f14157d.m15644a(context, 7, j, timeZone);
    }

    /* renamed from: a */
    public static final String m15647a(Context context, long j, TimeZone timeZone) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(timeZone, "timezone");
        return f14157d.m15644a(context, 1, j, timeZone);
    }

    /* renamed from: b */
    public static /* synthetic */ String m15653b(Context context, long j, TimeZone timeZone, int i, Object obj) {
        if ((i & 4) != 0) {
            timeZone = TimeZone.getDefault();
            C12932j.m33815a((Object) timeZone, "TimeZone.getDefault()");
        }
        return m15662g(context, j, timeZone);
    }

    /* renamed from: c */
    public static final String m15655c(Context context, long j) {
        C12932j.m33818b(context, "context");
        long currentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        C12932j.m33815a((Object) timeZone, "TimeZone.getDefault()");
        return m15651b(context, j, currentTimeMillis, timeZone);
    }

    /* renamed from: d */
    private final boolean m15659d(Calendar calendar, Calendar calendar2) {
        if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m15646a(Context context, long j, long j2, TimeZone timeZone) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(timeZone, "timeZone");
        Calendar instance = Calendar.getInstance(timeZone);
        C12932j.m33815a((Object) instance, "baseCalendar");
        instance.setTimeInMillis(j2);
        Calendar instance2 = Calendar.getInstance(timeZone);
        C12932j.m33815a((Object) instance2, "calendar");
        instance2.setTimeInMillis(j);
        if (f14157d.m15657c(instance, instance2)) {
            return m15656c(context, j, timeZone);
        }
        if (f14157d.m15654b(instance, instance2)) {
            return m15647a(context, j, timeZone);
        }
        if (f14157d.m15649a(instance, instance2)) {
            return m15661f(context, j, timeZone);
        }
        return m15662g(context, j, timeZone);
    }

    /* renamed from: b */
    public static final String m15651b(Context context, long j, long j2, TimeZone timeZone) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(timeZone, "timeZone");
        Calendar instance = Calendar.getInstance(timeZone);
        C12932j.m33815a((Object) instance, "baseCalendar");
        instance.setTimeInMillis(j2);
        Calendar instance2 = Calendar.getInstance(timeZone);
        C12932j.m33815a((Object) instance2, "calendar");
        instance2.setTimeInMillis(j);
        if (f14157d.m15657c(instance, instance2)) {
            return m15656c(context, j, timeZone);
        }
        if (f14157d.m15654b(instance, instance2)) {
            return m15652b(context, j, timeZone);
        }
        if (f14157d.m15649a(instance, instance2)) {
            return m15658d(context, j, timeZone);
        }
        return m15660e(context, j, timeZone);
    }

    /* renamed from: c */
    private final boolean m15657c(Calendar calendar, Calendar calendar2) {
        return m15659d(calendar, calendar2) && calendar.get(5) == calendar2.get(5);
    }

    /* renamed from: a */
    private final String m15644a(Context context, int i, long j, TimeZone timeZone) {
        if (DateFormat.is24HourFormat(context)) {
            i += 10;
        }
        if (i < 0 || i >= f14155b.length) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown pattern: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        Locale a = C7713f.m18776a(context);
        if (!C12932j.m33817a((Object) m15643a().mo13142c(), (Object) a)) {
            m15643a().mo13140a(a);
            m15643a().mo13141b().clear();
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m15643a().mo13141b().get(i);
        if (simpleDateFormat == null) {
            simpleDateFormat = new SimpleDateFormat(context.getString(f14155b[i]), a);
            m15643a().mo13141b().put(i, simpleDateFormat);
        }
        simpleDateFormat.setTimeZone(timeZone);
        m15643a().mo13139a().setTime(j);
        String format = simpleDateFormat.format(m15643a().mo13139a());
        C12932j.m33815a((Object) format, "dateFormat.format(formatInfo.date)");
        return format;
    }

    /* renamed from: b */
    public static final String m15650b(Context context, long j) {
        C12932j.m33818b(context, "context");
        long currentTimeMillis = System.currentTimeMillis();
        TimeZone timeZone = TimeZone.getDefault();
        C12932j.m33815a((Object) timeZone, "TimeZone.getDefault()");
        return m15646a(context, j, currentTimeMillis, timeZone);
    }

    /* renamed from: b */
    private final boolean m15654b(Calendar calendar, Calendar calendar2) {
        boolean z = false;
        if (calendar.before(calendar2)) {
            return false;
        }
        Object clone = calendar2.clone();
        if (clone != null) {
            Calendar calendar3 = (Calendar) clone;
            int i = 0;
            while (!m15657c(calendar, calendar3) && i < 7) {
                calendar3.add(5, 1);
                i++;
            }
            if (i < 7) {
                z = true;
            }
            return z;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
    }

    /* renamed from: a */
    private final boolean m15649a(Calendar calendar, Calendar calendar2) {
        boolean z = false;
        if (calendar.before(calendar2)) {
            return false;
        }
        Object clone = calendar2.clone();
        if (clone != null) {
            Calendar calendar3 = (Calendar) clone;
            calendar3.set(5, 1);
            int i = 0;
            while (!m15659d(calendar, calendar3) && i < 12) {
                calendar3.add(2, 1);
                i++;
            }
            if (i < 12) {
                z = true;
            }
            return z;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.Calendar");
    }
}
