package app.zenly.locator.p143s.p160v.p161b;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MeasureFormat;
import android.icu.text.MeasureFormat.FormatWidth;
import android.icu.text.NumberFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.os.Build.VERSION;
import app.zenly.android.base.util.C1303g;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3229p;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p263b.p264a.p272j.C7713f;

/* renamed from: app.zenly.locator.s.v.b.m */
public final class C5553m {

    /* renamed from: a */
    private static final C5559c f14206a;

    /* renamed from: app.zenly.locator.s.v.b.m$a */
    private static final class C5554a implements C5559c {

        /* renamed from: a */
        public static final C5554a f14207a = new C5554a();

        /* renamed from: app.zenly.locator.s.v.b.m$a$a */
        private static final class C5555a {

            /* renamed from: c */
            static final /* synthetic */ KProperty[] f14208c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public static C5555a f14209d;

            /* renamed from: e */
            public static final C5556a f14210e = new C5556a(null);

            /* renamed from: a */
            private final Lazy f14211a;

            /* renamed from: b */
            private final Locale f14212b;

            /* renamed from: app.zenly.locator.s.v.b.m$a$a$a */
            public static final class C5556a {
                private C5556a() {
                }

                /* renamed from: a */
                public final C5555a mo13169a(Locale locale) {
                    C5555a c;
                    C12932j.m33818b(locale, "locale");
                    synchronized (C12946x.m33834a(C5555a.class)) {
                        C5555a c2 = C5555a.f14209d;
                        c = C12932j.m33817a(c2 != null ? c2.mo13168b() : null, (Object) locale) ? C5555a.f14209d : null;
                        if (c == null) {
                            c = new C5555a(locale, null);
                            C5555a.f14209d = c;
                        }
                    }
                    return c;
                }

                public /* synthetic */ C5556a(C12928f fVar) {
                    this();
                }
            }

            /* renamed from: app.zenly.locator.s.v.b.m$a$a$b */
            static final class C5557b extends C12933k implements Function0<MeasureFormat> {

                /* renamed from: f */
                final /* synthetic */ C5555a f14213f;

                C5557b(C5555a aVar) {
                    this.f14213f = aVar;
                    super(0);
                }

                public final MeasureFormat invoke() {
                    return MeasureFormat.getInstance(this.f14213f.mo13168b(), FormatWidth.SHORT, NumberFormat.getIntegerInstance(this.f14213f.mo13168b()));
                }
            }

            static {
                C12941s sVar = new C12941s(C12946x.m33834a(C5555a.class), "format", "getFormat()Landroid/icu/text/MeasureFormat;");
                C12946x.m33839a((C12940r) sVar);
                f14208c = new KProperty[]{sVar};
            }

            private C5555a(Locale locale) {
                this.f14212b = locale;
                this.f14211a = C12896f.m33751a(new C5557b(this));
            }

            /* renamed from: a */
            public final MeasureFormat mo13167a() {
                Lazy lazy = this.f14211a;
                KProperty kProperty = f14208c[0];
                return (MeasureFormat) lazy.getValue();
            }

            /* renamed from: b */
            public final Locale mo13168b() {
                return this.f14212b;
            }

            public /* synthetic */ C5555a(Locale locale, C12928f fVar) {
                this(locale);
            }
        }

        private C5554a() {
        }

        /* renamed from: a */
        public String mo13166a(Context context, double d) {
            Measure measure;
            C12932j.m33818b(context, "context");
            int i = C5560n.f14217a[C3229p.f9009i.mo9649a(context).ordinal()];
            if (i == 1) {
                measure = new Measure(Double.valueOf(C1303g.KELVIN.mo6422b(d)), MeasureUnit.FAHRENHEIT);
            } else if (i == 2 || i == 3) {
                measure = new Measure(Double.valueOf(C1303g.KELVIN.mo6421a(d)), MeasureUnit.CELSIUS);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String formatMeasures = C5555a.f14210e.mo13169a(C7713f.m18776a(context)).mo13167a().formatMeasures(new Measure[]{measure});
            C12932j.m33815a((Object) formatMeasures, "Cache.get(UIUtils.getDis…t.formatMeasures(measure)");
            return formatMeasures;
        }
    }

    /* renamed from: app.zenly.locator.s.v.b.m$b */
    private static final class C5558b implements C5559c {

        /* renamed from: a */
        private static Locale f14214a;

        /* renamed from: b */
        private static java.text.NumberFormat f14215b;

        /* renamed from: c */
        public static final C5558b f14216c = new C5558b();

        static {
            Locale locale = Locale.ROOT;
            C12932j.m33815a((Object) locale, "Locale.ROOT");
            f14214a = locale;
            java.text.NumberFormat integerInstance = java.text.NumberFormat.getIntegerInstance(Locale.ROOT);
            C12932j.m33815a((Object) integerInstance, "NumberFormat.getIntegerInstance(Locale.ROOT)");
            f14215b = integerInstance;
        }

        private C5558b() {
        }

        /* renamed from: a */
        public String mo13166a(Context context, double d) {
            C12932j.m33818b(context, "context");
            Resources resources = context.getResources();
            Locale a = C7713f.m18776a(context);
            int i = C5561o.f14218a[C3229p.f9009i.mo9649a(context).ordinal()];
            if (i == 1) {
                int round = (int) Math.round(C1303g.KELVIN.mo6422b(d));
                String quantityString = resources.getQuantityString(R.plurals.cldr_unit_weather_fahrenheit_short, round, new Object[]{m15746a(a, round)});
                C12932j.m33815a((Object) quantityString, "res.getQuantityString(R.…mber(locale, fahrenheit))");
                return quantityString;
            } else if (i == 2 || i == 3) {
                int round2 = (int) Math.round(C1303g.KELVIN.mo6421a(d));
                String quantityString2 = resources.getQuantityString(R.plurals.cldr_unit_weather_celsius_short, round2, new Object[]{m15746a(a, round2)});
                C12932j.m33815a((Object) quantityString2, "res.getQuantityString(R.…tNumber(locale, celsius))");
                return quantityString2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        /* renamed from: a */
        private final String m15746a(Locale locale, int i) {
            String format;
            synchronized (C12946x.m33834a(C5558b.class)) {
                if (!C12932j.m33817a((Object) f14214a, (Object) locale)) {
                    f14214a = locale;
                    java.text.NumberFormat integerInstance = java.text.NumberFormat.getIntegerInstance(locale);
                    C12932j.m33815a((Object) integerInstance, "NumberFormat.getIntegerInstance(locale)");
                    f14215b = integerInstance;
                }
                format = f14215b.format((long) i);
                C12932j.m33815a((Object) format, "integerFormat.format(temperature.toLong())");
            }
            return format;
        }
    }

    /* renamed from: app.zenly.locator.s.v.b.m$c */
    private interface C5559c {
        /* renamed from: a */
        String mo13166a(Context context, double d);
    }

    static {
        C5559c cVar;
        new C5553m();
        if (VERSION.SDK_INT >= 24) {
            cVar = C5554a.f14207a;
        } else {
            cVar = C5558b.f14216c;
        }
        f14206a = cVar;
    }

    private C5553m() {
    }

    /* renamed from: a */
    public static final String m15739a(Context context, double d) {
        C12932j.m33818b(context, "context");
        return f14206a.mo13166a(context, d);
    }
}
