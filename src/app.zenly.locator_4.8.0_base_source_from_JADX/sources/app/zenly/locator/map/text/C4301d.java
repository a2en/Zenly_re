package app.zenly.locator.map.text;

import android.content.Context;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.map.text.d */
public final class C4301d {

    /* renamed from: a */
    private static final long f11503a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b */
    private static final long f11504b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: c */
    private static final long f11505c = TimeUnit.HOURS.toMillis(1);

    /* renamed from: d */
    private static final long f11506d = TimeUnit.HOURS.toMillis(23);

    /* renamed from: e */
    private static final long f11507e = TimeUnit.DAYS.toMillis(1);

    /* renamed from: f */
    public static final C4301d f11508f = new C4301d();

    private C4301d() {
    }

    /* renamed from: b */
    private final String m12754b(Context context) {
        String string = context.getString(R.string.contextView_capsule_heading_arrival_timeFormatterLess, new Object[]{C5521c.m15669a(context, f11503a)});
        C12932j.m33815a((Object) string, "context.getString(R.stri…eFormatterLess, duration)");
        return string;
    }

    /* renamed from: c */
    private final String m12756c(Context context, long j) {
        long j2 = f11504b;
        String string = context.getString(R.string.contextView_capsule_heading_arrival_timeFormatterLess, new Object[]{C5521c.m15669a(context, ((j / j2) + 1) * j2)});
        C12932j.m33815a((Object) string, "context.getString(R.stri…eFormatterLess, duration)");
        return string;
    }

    /* renamed from: d */
    private final String m12757d(Context context, long j) {
        long j2 = f11507e;
        String string = context.getString(R.string.contextView_capsule_heading_arrival_timeFormatterGreater, new Object[]{C5521c.m15669a(context, (j / j2) * j2)});
        C12932j.m33815a((Object) string, "context.getString(R.stri…rmatterGreater, duration)");
        return string;
    }

    /* renamed from: a */
    public final String mo11334a(Context context, long j) {
        C12932j.m33818b(context, "context");
        if (j < f11503a) {
            return m12754b(context);
        }
        if (j < f11505c) {
            return m12755b(context, j);
        }
        if (j < f11506d) {
            return m12756c(context, j);
        }
        if (j < f11507e) {
            return m12753a(context);
        }
        return m12757d(context, j);
    }

    /* renamed from: b */
    private final String m12755b(Context context, long j) {
        return C5521c.m15669a(context, j);
    }

    /* renamed from: a */
    private final String m12753a(Context context) {
        String string = context.getString(R.string.contextView_capsule_heading_arrival_timeFormatterLess, new Object[]{C5521c.m15669a(context, f11507e)});
        C12932j.m33815a((Object) string, "context.getString(R.stri…eFormatterLess, duration)");
        return string;
    }
}
