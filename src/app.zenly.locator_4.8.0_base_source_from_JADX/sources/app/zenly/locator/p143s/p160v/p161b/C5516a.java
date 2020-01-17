package app.zenly.locator.p143s.p160v.p161b;

import android.content.Context;
import app.zenly.locator.R;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.TreeMap;
import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;

/* renamed from: app.zenly.locator.s.v.b.a */
public final class C5516a {

    /* renamed from: a */
    private static final TreeMap<Long, Integer> f14148a;

    /* renamed from: b */
    private static Locale f14149b;

    /* renamed from: c */
    private static NumberFormat f14150c;

    /* renamed from: d */
    private static NumberFormat f14151d;

    /* renamed from: e */
    public static final C5516a f14152e = new C5516a();

    /* renamed from: app.zenly.locator.s.v.b.a$a */
    private static final class C5517a {

        /* renamed from: a */
        public static final C5517a f14153a = new C5517a();

        private C5517a() {
        }
    }

    static {
        TreeMap<Long, Integer> treeMap = new TreeMap<>();
        treeMap.put(Long.valueOf(1000), Integer.valueOf(R.string.cldr_numbers_compactDecimalFormatting_thousand_short));
        treeMap.put(Long.valueOf(1000000), Integer.valueOf(R.string.cldr_numbers_compactDecimalFormatting_million_short));
        treeMap.put(Long.valueOf(1000000000), Integer.valueOf(R.string.cldr_numbers_compactDecimalFormatting_billion_short));
        treeMap.put(Long.valueOf(1000000000000L), Integer.valueOf(R.string.cldr_numbers_compactDecimalFormatting_trillion_short));
        f14148a = treeMap;
        Locale locale = Locale.ROOT;
        C12932j.m33815a((Object) locale, "Locale.ROOT");
        f14149b = locale;
    }

    private C5516a() {
    }

    /* renamed from: a */
    public static final String m15639a(Context context, long j) {
        C12932j.m33818b(context, "context");
        if (j >= 0) {
            Locale a = C7713f.m18776a(context);
            if (j < 1000) {
                return f14152e.m15640a(a, j);
            }
            Entry floorEntry = f14148a.floorEntry(Long.valueOf(j));
            Object key = floorEntry.getKey();
            if (key != null) {
                long longValue = ((Number) key).longValue();
                Integer num = (Integer) floorEntry.getValue();
                C12932j.m33815a((Object) num, "stringResId");
                String string = context.getString(num.intValue(), new Object[]{f14152e.m15641a(a, j, longValue)});
                C12932j.m33815a((Object) string, "context.getString(string…locale, value, divideBy))");
                return string;
            }
            C12932j.m33814a();
            throw null;
        }
        throw new IllegalArgumentException("value can't be negative".toString());
    }

    /* renamed from: a */
    private final String m15640a(Locale locale, long j) {
        String format;
        synchronized (C5517a.f14153a) {
            f14152e.m15642a(locale);
            NumberFormat numberFormat = f14150c;
            if (numberFormat == null) {
                numberFormat = NumberFormat.getNumberInstance(locale);
                f14150c = numberFormat;
            }
            format = numberFormat.format(j);
            C12932j.m33815a((Object) format, "formatter.format(value)");
        }
        return format;
    }

    /* renamed from: a */
    private final String m15641a(Locale locale, long j, long j2) {
        String format;
        synchronized (C5517a.f14153a) {
            f14152e.m15642a(locale);
            NumberFormat numberFormat = f14151d;
            if (numberFormat == null) {
                numberFormat = NumberFormat.getNumberInstance(locale);
                f14151d = numberFormat;
            }
            double d = ((double) j) / ((double) j2);
            int log10 = ((int) Math.log10(d)) + 1;
            numberFormat.setMinimumIntegerDigits(log10);
            numberFormat.setMaximumIntegerDigits(log10);
            int i = 3 - log10;
            numberFormat.setMinimumFractionDigits(i);
            numberFormat.setMaximumFractionDigits(i);
            format = numberFormat.format(d);
            C12932j.m33815a((Object) format, "formatter.format(truncated)");
        }
        return format;
    }

    /* renamed from: a */
    private final void m15642a(Locale locale) {
        synchronized (C5517a.f14153a) {
            if (!C12932j.m33817a((Object) f14149b, (Object) locale)) {
                f14149b = locale;
                f14150c = null;
                f14151d = null;
            }
            C12956q qVar = C12956q.f33541a;
        }
    }
}
