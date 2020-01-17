package app.zenly.locator.core.models;

import android.content.Context;
import app.zenly.locator.core.util.C3221j;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C12954o;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: app.zenly.locator.core.models.g */
public final class C2885g {

    /* renamed from: d */
    public static final C2885g f8168d = new C2885g(0, 1, 1);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Map<String, Integer> f8169e;

    /* renamed from: f */
    public static final C2886a f8170f = new C2886a(null);

    /* renamed from: a */
    private final Calendar f8171a;

    /* renamed from: b */
    private final long f8172b;

    /* renamed from: c */
    private final int f8173c;

    /* renamed from: app.zenly.locator.core.models.g$a */
    public static final class C2886a {
        private C2886a() {
        }

        public /* synthetic */ C2886a(C12928f fVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final int m9365a(int i) {
            if (i >= 100) {
                return i;
            }
            int i2 = GregorianCalendar.getInstance().get(1) % 100;
            int i3 = GregorianCalendar.getInstance().get(1) - i2;
            if (i > i2) {
                i3 -= 100;
            }
            return i + i3;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final int m9368a(Calendar calendar) {
            Calendar instance = GregorianCalendar.getInstance();
            int i = instance.get(2);
            int i2 = calendar.get(2);
            int i3 = instance.get(5);
            int i4 = instance.get(1) - calendar.get(1);
            return (i2 > i || (i2 == i && calendar.get(5) > i3)) ? i4 - 1 : i4;
        }

        /* renamed from: a */
        public final int mo8960a(Context context) {
            C12932j.m33818b(context, "ctx");
            Integer num = (Integer) C2885g.f8169e.get(C3221j.m10213a(context));
            if (num != null) {
                return num.intValue();
            }
            return 13;
        }
    }

    static {
        Integer valueOf = Integer.valueOf(14);
        Integer valueOf2 = Integer.valueOf(13);
        Integer valueOf3 = Integer.valueOf(15);
        Integer valueOf4 = Integer.valueOf(16);
        f8169e = C12835h0.m33548a(C12954o.m33853a("AT", valueOf), C12954o.m33853a("BE", valueOf2), C12954o.m33853a("BG", valueOf), C12954o.m33853a("BL", valueOf3), C12954o.m33853a("CY", valueOf), C12954o.m33853a("CZ", valueOf3), C12954o.m33853a("DE", valueOf4), C12954o.m33853a("DK", valueOf2), C12954o.m33853a("EE", valueOf2), C12954o.m33853a("ES", valueOf2), C12954o.m33853a("FI", valueOf2), C12954o.m33853a("FR", valueOf3), C12954o.m33853a("GB", valueOf2), C12954o.m33853a("GF", valueOf3), C12954o.m33853a("GP", valueOf3), C12954o.m33853a("GR", valueOf3), C12954o.m33853a("HR", valueOf4), C12954o.m33853a("HU", valueOf4), C12954o.m33853a("IE", valueOf4), C12954o.m33853a("IT", valueOf), C12954o.m33853a("LT", valueOf4), C12954o.m33853a("LU", valueOf4), C12954o.m33853a("LV", valueOf2), C12954o.m33853a("MQ", valueOf3), C12954o.m33853a("MT", valueOf4), C12954o.m33853a("NC", valueOf3), C12954o.m33853a("NL", valueOf4), C12954o.m33853a("NO", valueOf2), C12954o.m33853a("PF", valueOf3), C12954o.m33853a("PL", valueOf2), C12954o.m33853a("PM", valueOf3), C12954o.m33853a("PT", valueOf2), C12954o.m33853a("RE", valueOf3), C12954o.m33853a("RO", valueOf4), C12954o.m33853a("SE", valueOf2), C12954o.m33853a("SI", valueOf3), C12954o.m33853a("SK", valueOf4), C12954o.m33853a("WF", valueOf3), C12954o.m33853a("YT", valueOf3));
    }

    public C2885g(int i, int i2, int i3) {
        this.f8171a = new GregorianCalendar(f8170f.m9365a(i), i2 - 1, i3);
        if (i2 < this.f8171a.getActualMinimum(2) + 1 || i2 > this.f8171a.getActualMaximum(2) + 1 || i3 < this.f8171a.getActualMinimum(5) || i3 > this.f8171a.getActualMaximum(5)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.f8172b = TimeUnit.MILLISECONDS.toSeconds(this.f8171a.getTimeInMillis());
        this.f8173c = f8170f.m9368a(this.f8171a);
    }

    /* renamed from: b */
    public static final int m9359b(Context context) {
        return f8170f.mo8960a(context);
    }

    /* renamed from: a */
    public final int mo8956a() {
        return this.f8173c;
    }

    /* renamed from: b */
    public final Calendar mo8958b() {
        return this.f8171a;
    }

    /* renamed from: c */
    public final long mo8959c() {
        return this.f8172b;
    }

    /* renamed from: a */
    public final C2869a mo8957a(Context context) {
        C12932j.m33818b(context, "ctx");
        int i = this.f8173c;
        if (i < 0) {
            return C2869a.AGE_NEGATIVE;
        }
        if (i > 130) {
            return C2869a.AGE_INVALID;
        }
        if (i < f8170f.mo8960a(context)) {
            return C2869a.AGE_TOO_YOUNG;
        }
        return C2869a.AGE_VALID;
    }

    public C2885g(Timestamp timestamp) {
        C12932j.m33818b(timestamp, "ts");
        this(0, 1, 1);
        this.f8171a.setTimeInMillis(TimeUnit.SECONDS.toMillis(timestamp.getSeconds()));
    }
}
