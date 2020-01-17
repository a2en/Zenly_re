package app.zenly.locator.p143s.p160v.p161b;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MeasureFormat;
import android.icu.text.MeasureFormat.FormatWidth;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import app.zenly.locator.R;
import com.android.volley.toolbox.C8733j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.jvm.internal.C12948z;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p260i.C7688d;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;

/* renamed from: app.zenly.locator.s.v.b.c */
public final class C5521c {

    /* renamed from: a */
    private static final C5529c f14162a;

    /* renamed from: app.zenly.locator.s.v.b.c$a */
    private static final class C5522a implements C5529c {

        /* renamed from: a */
        public static final C5522a f14163a = new C5522a();

        /* renamed from: app.zenly.locator.s.v.b.c$a$a */
        private static final class C5523a {

            /* renamed from: e */
            static final /* synthetic */ KProperty[] f14164e;
            /* access modifiers changed from: private */

            /* renamed from: f */
            public static C5523a f14165f;

            /* renamed from: g */
            public static final C5524a f14166g = new C5524a(null);

            /* renamed from: a */
            private final Lazy f14167a;

            /* renamed from: b */
            private final Lazy f14168b;

            /* renamed from: c */
            private final Lazy f14169c;

            /* renamed from: d */
            private final Locale f14170d;

            /* renamed from: app.zenly.locator.s.v.b.c$a$a$a */
            public static final class C5524a {
                private C5524a() {
                }

                /* renamed from: a */
                public final C5523a mo13153a(Locale locale) {
                    C5523a e;
                    C12932j.m33818b(locale, "locale");
                    synchronized (C12946x.m33834a(C5523a.class)) {
                        C5523a e2 = C5523a.f14165f;
                        e = C12932j.m33817a(e2 != null ? e2.mo13149a() : null, (Object) locale) ? C5523a.f14165f : null;
                        if (e == null) {
                            e = new C5523a(locale, null);
                            C5523a.f14165f = e;
                        }
                    }
                    return e;
                }

                public /* synthetic */ C5524a(C12928f fVar) {
                    this();
                }
            }

            /* renamed from: app.zenly.locator.s.v.b.c$a$a$b */
            static final class C5525b extends C12933k implements Function0<MeasureFormat> {

                /* renamed from: f */
                final /* synthetic */ C5523a f14171f;

                C5525b(C5523a aVar) {
                    this.f14171f = aVar;
                    super(0);
                }

                public final MeasureFormat invoke() {
                    return MeasureFormat.getInstance(this.f14171f.mo13149a(), FormatWidth.NARROW);
                }
            }

            /* renamed from: app.zenly.locator.s.v.b.c$a$a$c */
            static final class C5526c extends C12933k implements Function0<MeasureFormat> {

                /* renamed from: f */
                final /* synthetic */ C5523a f14172f;

                C5526c(C5523a aVar) {
                    this.f14172f = aVar;
                    super(0);
                }

                public final MeasureFormat invoke() {
                    return MeasureFormat.getInstance(this.f14172f.mo13149a(), FormatWidth.SHORT);
                }
            }

            /* renamed from: app.zenly.locator.s.v.b.c$a$a$d */
            static final class C5527d extends C12933k implements Function0<MeasureFormat> {

                /* renamed from: f */
                final /* synthetic */ C5523a f14173f;

                C5527d(C5523a aVar) {
                    this.f14173f = aVar;
                    super(0);
                }

                public final MeasureFormat invoke() {
                    return MeasureFormat.getInstance(this.f14173f.mo13149a(), FormatWidth.WIDE);
                }
            }

            static {
                Class<C5523a> cls = C5523a.class;
                C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "narrow", "getNarrow()Landroid/icu/text/MeasureFormat;");
                C12946x.m33839a((C12940r) sVar);
                C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "short", "getShort()Landroid/icu/text/MeasureFormat;");
                C12946x.m33839a((C12940r) sVar2);
                C12941s sVar3 = new C12941s(C12946x.m33834a((Class) cls), "wide", "getWide()Landroid/icu/text/MeasureFormat;");
                C12946x.m33839a((C12940r) sVar3);
                f14164e = new KProperty[]{sVar, sVar2, sVar3};
            }

            private C5523a(Locale locale) {
                this.f14170d = locale;
                this.f14167a = C12896f.m33751a(new C5525b(this));
                this.f14168b = C12896f.m33751a(new C5526c(this));
                this.f14169c = C12896f.m33751a(new C5527d(this));
            }

            /* renamed from: b */
            public final MeasureFormat mo13150b() {
                Lazy lazy = this.f14167a;
                KProperty kProperty = f14164e[0];
                return (MeasureFormat) lazy.getValue();
            }

            /* renamed from: c */
            public final MeasureFormat mo13151c() {
                Lazy lazy = this.f14168b;
                KProperty kProperty = f14164e[1];
                return (MeasureFormat) lazy.getValue();
            }

            /* renamed from: d */
            public final MeasureFormat mo13152d() {
                Lazy lazy = this.f14169c;
                KProperty kProperty = f14164e[2];
                return (MeasureFormat) lazy.getValue();
            }

            /* renamed from: a */
            public final Locale mo13149a() {
                return this.f14170d;
            }

            public /* synthetic */ C5523a(Locale locale, C12928f fVar) {
                this(locale);
            }
        }

        private C5522a() {
        }

        /* renamed from: a */
        public CharSequence mo13143a(Context context, long j, List<? extends CharacterStyle> list) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(list, "numberStyles");
            MeasureFormat c = C5523a.f14166g.mo13153a(C7713f.m18776a(context)).mo13151c();
            C12932j.m33815a((Object) c, "Cache.get(UIUtils.getDisplayLocale(context)).short");
            return m15674a(c, j, 2, list);
        }

        /* renamed from: b */
        public String mo13146b(Context context, long j) {
            C12932j.m33818b(context, "context");
            MeasureFormat b = C5523a.f14166g.mo13153a(C7713f.m18776a(context)).mo13150b();
            C12932j.m33815a((Object) b, "Cache.get(UIUtils.getDis…ayLocale(context)).narrow");
            return m15676a(this, b, j, 2, null, 8, null).toString();
        }

        /* renamed from: c */
        public String mo13147c(Context context, long j) {
            C12932j.m33818b(context, "context");
            MeasureFormat c = C5523a.f14166g.mo13153a(C7713f.m18776a(context)).mo13151c();
            C12932j.m33815a((Object) c, "Cache.get(UIUtils.getDisplayLocale(context)).short");
            return m15676a(this, c, j, 2, null, 8, null).toString();
        }

        /* renamed from: d */
        public String mo13148d(Context context, long j) {
            C12932j.m33818b(context, "context");
            MeasureFormat c = C5523a.f14166g.mo13153a(C7713f.m18776a(context)).mo13151c();
            C12932j.m33815a((Object) c, "Cache.get(UIUtils.getDisplayLocale(context)).short");
            return m15677a(this, c, j, null, 4, null).toString();
        }

        /* renamed from: a */
        public String mo13144a(Context context, long j) {
            C12932j.m33818b(context, "context");
            MeasureFormat d = C5523a.f14166g.mo13153a(C7713f.m18776a(context)).mo13152d();
            C12932j.m33815a((Object) d, "Cache.get(UIUtils.getDisplayLocale(context)).wide");
            return m15676a(this, d, j, 1, null, 8, null).toString();
        }

        /* renamed from: b */
        public CharSequence mo13145b(Context context, long j, List<? extends CharacterStyle> list) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(list, "numberStyles");
            MeasureFormat d = C5523a.f14166g.mo13153a(C7713f.m18776a(context)).mo13152d();
            C12932j.m33815a((Object) d, "Cache.get(UIUtils.getDisplayLocale(context)).wide");
            return m15675a(d, j, list);
        }

        /* renamed from: a */
        static /* synthetic */ CharSequence m15676a(C5522a aVar, MeasureFormat measureFormat, long j, int i, List list, int i2, Object obj) {
            if ((i2 & 8) != 0) {
                list = null;
            }
            return aVar.m15674a(measureFormat, j, i, list);
        }

        /* renamed from: b */
        private final Measure m15680b(long j) {
            return new Measure(Integer.valueOf((int) (j / ((long) 3600000))), MeasureUnit.HOUR);
        }

        /* renamed from: a */
        private final CharSequence m15674a(MeasureFormat measureFormat, long j, int i, List<? extends CharacterStyle> list) {
            boolean z = j < 0;
            Object[] array = C12857w.m33675c((Iterable) m15679a(Math.abs(j)), i).toArray(new Measure[0]);
            if (array != null) {
                Measure[] measureArr = (Measure[]) array;
                String formatMeasures = measureFormat.formatMeasures((Measure[]) Arrays.copyOf(measureArr, measureArr.length));
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('-');
                    sb.append(formatMeasures);
                    formatMeasures = sb.toString();
                }
                C12932j.m33815a((Object) formatMeasures, "unstyled");
                return list == null ? formatMeasures : m15678a(formatMeasures, measureFormat, measureArr, list);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* renamed from: a */
        static /* synthetic */ CharSequence m15677a(C5522a aVar, MeasureFormat measureFormat, long j, List list, int i, Object obj) {
            if ((i & 4) != 0) {
                list = null;
            }
            return aVar.m15675a(measureFormat, j, list);
        }

        /* renamed from: a */
        private final CharSequence m15675a(MeasureFormat measureFormat, long j, List<? extends CharacterStyle> list) {
            boolean z = j < 0;
            Measure b = m15680b(Math.abs(j));
            String formatMeasures = measureFormat.formatMeasures(new Measure[]{b});
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append('-');
                sb.append(formatMeasures);
                formatMeasures = sb.toString();
            }
            C12932j.m33815a((Object) formatMeasures, "unstyled");
            if (list == null) {
                return formatMeasures;
            }
            return m15678a(formatMeasures, measureFormat, new Measure[]{b}, list);
        }

        /* renamed from: a */
        private final List<Measure> m15679a(long j) {
            ArrayList arrayList = new ArrayList();
            long j2 = (long) 86400000;
            if (j >= j2) {
                int i = (int) ((j % j2) / ((long) 3600000));
                arrayList.add(new Measure(Integer.valueOf((int) (j / j2)), MeasureUnit.DAY));
                if (i > 0) {
                    arrayList.add(new Measure(Integer.valueOf(i), MeasureUnit.HOUR));
                }
            } else {
                long j3 = (long) 3600000;
                if (j >= j3) {
                    int i2 = (int) ((j % j3) / ((long) 60000));
                    arrayList.add(new Measure(Integer.valueOf((int) (j / j3)), MeasureUnit.HOUR));
                    if (i2 > 0) {
                        arrayList.add(new Measure(Integer.valueOf(i2), MeasureUnit.MINUTE));
                    }
                } else {
                    arrayList.add(new Measure(Integer.valueOf((int) ((j % j3) / ((long) 60000))), MeasureUnit.MINUTE));
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private final CharSequence m15678a(String str, MeasureFormat measureFormat, Measure[] measureArr, List<? extends CharacterStyle> list) {
            SpannableString spannableString = new SpannableString(str);
            ArrayList<String> arrayList = new ArrayList<>(measureArr.length);
            for (Measure number : measureArr) {
                arrayList.add(measureFormat.getNumberFormat().format(number.getNumber()));
            }
            for (String str2 : arrayList) {
                C12932j.m33815a((Object) str2, "number");
                for (int a = C13029r.m34009a((CharSequence) spannableString, str2, 0, false, 6, (Object) null); a >= 0; a = C13029r.m34009a((CharSequence) spannableString, str2, a + 1, false, 4, (Object) null)) {
                    int length = str2.length() + a;
                    for (CharacterStyle wrap : list) {
                        spannableString.setSpan(CharacterStyle.wrap(wrap), a, length, 17);
                    }
                }
            }
            return spannableString;
        }
    }

    /* renamed from: app.zenly.locator.s.v.b.c$b */
    private static final class C5528b implements C5529c {

        /* renamed from: a */
        public static final C5528b f14174a = new C5528b();

        private C5528b() {
        }

        /* renamed from: a */
        public CharSequence mo13143a(Context context, long j, List<? extends CharacterStyle> list) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(list, "numberStyles");
            return mo13147c(context, j);
        }

        /* renamed from: b */
        public String mo13146b(Context context, long j) {
            C12932j.m33818b(context, "context");
            boolean z = j < 0;
            String a = C7688d.m18723a(m15695a(context, Math.abs(j), R.plurals.cldr_unit_duration_day_narrow, R.plurals.cldr_unit_duration_hour_narrow, R.plurals.cldr_unit_duration_minute_narrow), context);
            if (!z) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('-');
            sb.append(a);
            return sb.toString();
        }

        /* renamed from: c */
        public String mo13147c(Context context, long j) {
            C12932j.m33818b(context, "context");
            boolean z = j < 0;
            String b = C7688d.m18724b(m15695a(context, Math.abs(j), R.plurals.cldr_unit_duration_day_short, R.plurals.cldr_unit_duration_hour_short, R.plurals.cldr_unit_duration_minute_short), context);
            if (!z) {
                return b;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('-');
            sb.append(b);
            return sb.toString();
        }

        /* renamed from: d */
        public String mo13148d(Context context, long j) {
            C12932j.m33818b(context, "context");
            boolean z = j < 0;
            String a = m15694a(context, Math.abs(j), (int) R.plurals.cldr_unit_duration_hour_short);
            if (!z) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('-');
            sb.append(a);
            return sb.toString();
        }

        /* renamed from: e */
        public String mo13154e(Context context, long j) {
            C12932j.m33818b(context, "context");
            boolean z = j < 0;
            String a = m15694a(context, Math.abs(j), (int) R.plurals.cldr_unit_duration_hour_long);
            if (!z) {
                return a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('-');
            sb.append(a);
            return sb.toString();
        }

        /* renamed from: a */
        public String mo13144a(Context context, long j) {
            C12932j.m33818b(context, "context");
            String str = (String) C12857w.m33682f(m15695a(context, Math.abs(j), R.plurals.cldr_unit_duration_day_long, R.plurals.cldr_unit_duration_hour_long, R.plurals.cldr_unit_duration_minute_long));
            if (!(j < 0)) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append('-');
            sb.append(str);
            return sb.toString();
        }

        /* renamed from: b */
        public CharSequence mo13145b(Context context, long j, List<? extends CharacterStyle> list) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(list, "numberStyles");
            return mo13154e(context, j);
        }

        /* renamed from: a */
        private final List<String> m15695a(Context context, long j, int i, int i2, int i3) {
            Resources resources = context.getResources();
            ArrayList arrayList = new ArrayList();
            long j2 = (long) 86400000;
            if (j >= j2) {
                int i4 = (int) (j / j2);
                int i5 = (int) ((j % j2) / ((long) 3600000));
                arrayList.add(resources.getQuantityString(i, i4, new Object[]{Integer.valueOf(i4)}));
                if (i5 > 0) {
                    arrayList.add(resources.getQuantityString(i2, i5, new Object[]{Integer.valueOf(i5)}));
                }
            } else {
                long j3 = (long) 3600000;
                if (j >= j3) {
                    int i6 = (int) (j / j3);
                    int i7 = (int) ((j % j3) / ((long) 60000));
                    arrayList.add(resources.getQuantityString(i2, i6, new Object[]{Integer.valueOf(i6)}));
                    if (i7 > 0) {
                        arrayList.add(resources.getQuantityString(i3, i7, new Object[]{Integer.valueOf(i7)}));
                    }
                } else {
                    int i8 = (int) ((j % j3) / ((long) 60000));
                    arrayList.add(resources.getQuantityString(i3, i8, new Object[]{Integer.valueOf(i8)}));
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private final String m15694a(Context context, long j, int i) {
            int i2 = (int) (j / ((long) 3600000));
            String quantityString = context.getResources().getQuantityString(i, i2, new Object[]{Integer.valueOf(i2)});
            C12932j.m33815a((Object) quantityString, "res.getQuantityString(pluralHour, hours, hours)");
            return quantityString;
        }
    }

    /* renamed from: app.zenly.locator.s.v.b.c$c */
    private interface C5529c {
        /* renamed from: a */
        CharSequence mo13143a(Context context, long j, List<? extends CharacterStyle> list);

        /* renamed from: a */
        String mo13144a(Context context, long j);

        /* renamed from: b */
        CharSequence mo13145b(Context context, long j, List<? extends CharacterStyle> list);

        /* renamed from: b */
        String mo13146b(Context context, long j);

        /* renamed from: c */
        String mo13147c(Context context, long j);

        /* renamed from: d */
        String mo13148d(Context context, long j);
    }

    static {
        C5529c cVar;
        new C5521c();
        if (VERSION.SDK_INT >= 24) {
            cVar = C5522a.f14163a;
        } else {
            cVar = C5528b.f14174a;
        }
        f14162a = cVar;
    }

    private C5521c() {
    }

    /* renamed from: a */
    public static final String m15669a(Context context, long j) {
        C12932j.m33818b(context, "context");
        return f14162a.mo13147c(context, j);
    }

    /* renamed from: b */
    public static final String m15671b(Context context, long j) {
        C12932j.m33818b(context, "context");
        return f14162a.mo13148d(context, j);
    }

    /* renamed from: c */
    public static final String m15672c(Context context, long j) {
        C12932j.m33818b(context, "context");
        return f14162a.mo13144a(context, j);
    }

    /* renamed from: d */
    public static final String m15673d(Context context, long j) {
        C12932j.m33818b(context, "context");
        return f14162a.mo13146b(context, j);
    }

    /* renamed from: a */
    public static final CharSequence m15667a(Context context, long j, List<? extends CharacterStyle> list) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(list, "numberStyles");
        return f14162a.mo13143a(context, j, list);
    }

    /* renamed from: b */
    public static final CharSequence m15670b(Context context, long j, List<? extends CharacterStyle> list) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(list, "numberStyles");
        return f14162a.mo13145b(context, j, list);
    }

    /* renamed from: a */
    public static final String m15668a(long j, boolean z) {
        boolean z2 = j < 0;
        long abs = Math.abs(j / ((long) C8733j.DEFAULT_IMAGE_TIMEOUT_MS));
        long j2 = (long) 3600;
        long j3 = abs / j2;
        long j4 = abs - (j2 * j3);
        long j5 = (long) 60;
        long j6 = j4 / j5;
        long j7 = j4 - (j5 * j6);
        StringBuilder sb = new StringBuilder();
        if (j3 > 0 || z) {
            sb.append("%1$d:");
        }
        sb.append("%2$02d:%3$02d");
        C12948z zVar = C12948z.f33530a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z2 ? "-" : "");
        sb2.append(sb);
        Object[] objArr = {Long.valueOf(j3), Long.valueOf(j6), Long.valueOf(j7)};
        String format = String.format(sb2.toString(), Arrays.copyOf(objArr, objArr.length));
        C12932j.m33815a((Object) format, "java.lang.String.format(format, *args)");
        return format;
    }
}
