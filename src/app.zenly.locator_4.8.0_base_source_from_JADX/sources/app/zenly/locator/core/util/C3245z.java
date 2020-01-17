package app.zenly.locator.core.util;

import app.zenly.locator.p143s.p148l.C5447b;
import app.zenly.locator.p143s.p148l.C5448c;
import com.android.volley.toolbox.C8733j;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12938p;
import kotlin.jvm.internal.C12939q;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp.Builder;

/* renamed from: app.zenly.locator.core.util.z */
public final class C3245z {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f9025a;

    /* renamed from: b */
    private static final Lazy f9026b = C12896f.m33751a(C3246a.f9027f);

    /* renamed from: app.zenly.locator.core.util.z$a */
    static final class C3246a extends C12933k implements Function0<Timestamp> {

        /* renamed from: f */
        public static final C3246a f9027f = new C3246a();

        C3246a() {
            super(0);
        }

        public final Timestamp invoke() {
            return C3245z.m10282a(-62135596800L);
        }
    }

    static {
        C12939q qVar = new C12939q(C12946x.m33835a(C3245z.class, "app_storeRelease"), "DEFAULT_TIMESTAMP", "getDEFAULT_TIMESTAMP()Lco/znly/core/vendor/com/google/protobuf/Timestamp;");
        C12946x.m33838a((C12938p) qVar);
        f9025a = new KProperty[]{qVar};
    }

    /* renamed from: a */
    public static final Timestamp m10281a() {
        Lazy lazy = f9026b;
        KProperty kProperty = f9025a[0];
        return (Timestamp) lazy.getValue();
    }

    /* renamed from: a */
    public static final Timestamp m10282a(long j) {
        Builder newBuilder = Timestamp.newBuilder();
        C12932j.m33815a((Object) newBuilder, "ts");
        long j2 = (long) C8733j.DEFAULT_IMAGE_TIMEOUT_MS;
        newBuilder.setSeconds(j / j2);
        newBuilder.setNanos((int) ((j % j2) * ((long) 1000000)));
        GeneratedMessageLite build = newBuilder.build();
        C12932j.m33815a((Object) build, "ts.build()");
        return (Timestamp) build;
    }

    /* renamed from: b */
    public static final int m10283b(Timestamp timestamp) {
        C12932j.m33818b(timestamp, "$this$daysUntil");
        return -m10280a(timestamp);
    }

    /* renamed from: c */
    public static final int m10284c(Timestamp timestamp) {
        C12932j.m33818b(timestamp, "$this$hoursSince");
        if (m10286e(timestamp)) {
            return 0;
        }
        return C3222k.m10218b(m10288g(timestamp), C5447b.m15475b(C5448c.m15478a()));
    }

    /* renamed from: d */
    public static final int m10285d(Timestamp timestamp) {
        C12932j.m33818b(timestamp, "$this$hoursUntil");
        return -m10284c(timestamp);
    }

    /* renamed from: e */
    public static final boolean m10286e(Timestamp timestamp) {
        C12932j.m33818b(timestamp, "$this$isDefaultValue");
        return timestamp.getSeconds() == -62135596800L && timestamp.getNanos() == 0;
    }

    /* renamed from: f */
    public static final int m10287f(Timestamp timestamp) {
        C12932j.m33818b(timestamp, "$this$minutesSince");
        if (m10286e(timestamp)) {
            return 0;
        }
        return C3222k.m10220c(m10288g(timestamp), C5447b.m15475b(C5448c.m15478a()));
    }

    /* renamed from: g */
    public static final long m10288g(Timestamp timestamp) {
        C12932j.m33818b(timestamp, "$this$toTimeMillis");
        return (timestamp.getSeconds() * ((long) C8733j.DEFAULT_IMAGE_TIMEOUT_MS)) + ((long) (timestamp.getNanos() / 1000000));
    }

    /* renamed from: a */
    public static final int m10280a(Timestamp timestamp) {
        C12932j.m33818b(timestamp, "$this$daysSince");
        if (m10286e(timestamp)) {
            return 0;
        }
        return C3222k.m10214a(m10288g(timestamp), C5447b.m15475b(C5448c.m15478a()));
    }
}
