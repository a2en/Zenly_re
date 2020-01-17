package app.zenly.locator.core.util;

import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p259h.C7683c;

/* renamed from: app.zenly.locator.core.util.k */
public final class C3222k {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f8994a;

    /* renamed from: b */
    private static final List<String> f8995b = C12848o.m33643b((Object[]) new String[]{"dmy", "mdy", "ymd"});

    /* renamed from: c */
    private static final ReadWriteProperty f8996c = C7683c.m18707a(C3223a.f8998f);

    /* renamed from: d */
    public static final C3222k f8997d = new C3222k();

    /* renamed from: app.zenly.locator.core.util.k$a */
    static final class C3223a extends C12933k implements Function0<Calendar> {

        /* renamed from: f */
        public static final C3223a f8998f = new C3223a();

        C3223a() {
            super(0);
        }

        public final Calendar invoke() {
            return Calendar.getInstance();
        }
    }

    /* JADX INFO: used method not loaded: kotlin.collections.o.b(java.lang.Object[]):null, types can be incorrect */
    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3222k.class), "calendar", "getCalendar()Ljava/util/Calendar;");
        C12946x.m33839a((C12940r) sVar);
        f8994a = new KProperty[]{sVar};
    }

    private C3222k() {
    }

    /* renamed from: a */
    public static final int m10214a(long j, long j2) {
        return (int) TimeUnit.MILLISECONDS.toDays(f8997d.m10215a(j2) - f8997d.m10215a(j));
    }

    /* renamed from: a */
    private final Calendar m10217a() {
        return (Calendar) f8996c.getValue(this, f8994a[0]);
    }

    /* renamed from: b */
    public static final int m10218b(long j, long j2) {
        return (int) TimeUnit.MILLISECONDS.toHours(f8997d.m10219b(j2) - f8997d.m10219b(j));
    }

    /* renamed from: c */
    public static final int m10220c(long j, long j2) {
        return (int) TimeUnit.MILLISECONDS.toMinutes(f8997d.m10221c(j2) - f8997d.m10221c(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r0.equals("yyyy/mm/dd") != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r0.equals("yyyy-mm-dd") != false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        return "ymd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r0.equals("dd-mm-yyyy") != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r0.equals("mm-dd-yyyy") != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        if (r0.equals("dd/mm/yyyy") != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (r0.equals("mm/dd/yyyy") != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        return "mdy";
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m10216a(android.content.Context r5) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C12932j.m33818b(r5, r0)
            android.content.ContentResolver r0 = r5.getContentResolver()
            java.lang.String r1 = "date_format"
            java.lang.String r0 = android.provider.Settings.System.getString(r0, r1)
            if (r0 == 0) goto L_0x001a
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r1 = 0
            goto L_0x001b
        L_0x001a:
            r1 = 1
        L_0x001b:
            java.lang.String r2 = "dmy"
            java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
            java.lang.String r4 = "Locale.ROOT"
            if (r1 != 0) goto L_0x007b
            java.util.Locale r1 = java.util.Locale.ROOT
            kotlin.jvm.internal.C12932j.m33815a(r1, r4)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = r0.toLowerCase(r1)
            kotlin.jvm.internal.C12932j.m33815a(r0, r3)
            int r1 = r0.hashCode()
            switch(r1) {
                case -1910336256: goto L_0x0068;
                case -1399232832: goto L_0x005f;
                case -1102836672: goto L_0x0056;
                case -591733248: goto L_0x004d;
                case -129270272: goto L_0x0042;
                case -72010048: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x007b
        L_0x0039:
            java.lang.String r1 = "yyyy/mm/dd"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            goto L_0x004a
        L_0x0042:
            java.lang.String r1 = "yyyy-mm-dd"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
        L_0x004a:
            java.lang.String r5 = "ymd"
            return r5
        L_0x004d:
            java.lang.String r1 = "dd-mm-yyyy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            goto L_0x0067
        L_0x0056:
            java.lang.String r1 = "mm-dd-yyyy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
            goto L_0x0070
        L_0x005f:
            java.lang.String r1 = "dd/mm/yyyy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
        L_0x0067:
            return r2
        L_0x0068:
            java.lang.String r1 = "mm/dd/yyyy"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x007b
        L_0x0070:
            java.lang.String r5 = "mdy"
            return r5
        L_0x0073:
            kotlin.TypeCastException r5 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r5.<init>(r0)
            throw r5
        L_0x007b:
            char[] r5 = android.text.format.DateFormat.getDateFormatOrder(r5)     // Catch:{ Exception -> 0x009b }
            if (r5 == 0) goto L_0x009b
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x009b }
            r0.<init>(r5)     // Catch:{ Exception -> 0x009b }
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch:{ Exception -> 0x009b }
            kotlin.jvm.internal.C12932j.m33815a(r5, r4)     // Catch:{ Exception -> 0x009b }
            java.lang.String r5 = r0.toLowerCase(r5)     // Catch:{ Exception -> 0x009b }
            kotlin.jvm.internal.C12932j.m33815a(r5, r3)     // Catch:{ Exception -> 0x009b }
            java.util.List<java.lang.String> r0 = f8995b     // Catch:{ Exception -> 0x009b }
            boolean r0 = r0.contains(r5)     // Catch:{ Exception -> 0x009b }
            if (r0 == 0) goto L_0x009b
            return r5
        L_0x009b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.util.C3222k.m10216a(android.content.Context):java.lang.String");
    }

    /* renamed from: b */
    private final long m10219b(long j) {
        Calendar a = m10217a();
        a.setTimeInMillis(j);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        Calendar a2 = m10217a();
        C12932j.m33815a((Object) a2, "calendar");
        return a2.getTimeInMillis();
    }

    /* renamed from: c */
    private final long m10221c(long j) {
        Calendar a = m10217a();
        a.setTimeInMillis(j);
        a.set(13, 0);
        a.set(14, 0);
        Calendar a2 = m10217a();
        C12932j.m33815a((Object) a2, "calendar");
        return a2.getTimeInMillis();
    }

    /* renamed from: a */
    private final long m10215a(long j) {
        Calendar a = m10217a();
        a.setTimeInMillis(j);
        a.set(11, 0);
        a.set(12, 0);
        a.set(13, 0);
        a.set(14, 0);
        Calendar a2 = m10217a();
        C12932j.m33815a((Object) a2, "calendar");
        return a2.getTimeInMillis();
    }
}
