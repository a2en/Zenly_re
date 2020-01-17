package app.zenly.locator.p143s.p160v.p161b;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MeasureFormat;
import android.icu.text.MeasureFormat.FormatWidth;
import android.icu.text.NumberFormat;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.os.Build.VERSION;
import app.zenly.android.base.util.C1300d;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3229p;
import java.util.Locale;
import java.util.Objects;
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

/* renamed from: app.zenly.locator.s.v.b.d */
public final class C5530d {

    /* renamed from: a */
    private static final C5537c f14175a;

    /* renamed from: app.zenly.locator.s.v.b.d$a */
    private static final class C5531a implements C5537c {

        /* renamed from: a */
        public static final C5531a f14176a = new C5531a();

        /* renamed from: app.zenly.locator.s.v.b.d$a$a */
        private static final class C5532a {

            /* renamed from: d */
            static final /* synthetic */ KProperty[] f14177d;
            /* access modifiers changed from: private */

            /* renamed from: e */
            public static C5532a f14178e;

            /* renamed from: f */
            public static final C5533a f14179f = new C5533a(null);

            /* renamed from: a */
            private final Lazy f14180a;

            /* renamed from: b */
            private final Lazy f14181b;

            /* renamed from: c */
            private final Locale f14182c;

            /* renamed from: app.zenly.locator.s.v.b.d$a$a$a */
            public static final class C5533a {
                private C5533a() {
                }

                /* renamed from: a */
                public final C5532a mo13159a(Locale locale) {
                    C5532a d;
                    C12932j.m33818b(locale, "locale");
                    synchronized (C12946x.m33834a(C5532a.class)) {
                        C5532a d2 = C5532a.f14178e;
                        d = C12932j.m33817a(d2 != null ? d2.mo13158c() : null, (Object) locale) ? C5532a.f14178e : null;
                        if (d == null) {
                            d = new C5532a(locale, null);
                            C5532a.f14178e = d;
                        }
                    }
                    return d;
                }

                public /* synthetic */ C5533a(C12928f fVar) {
                    this();
                }
            }

            /* renamed from: app.zenly.locator.s.v.b.d$a$a$b */
            static final class C5534b extends C12933k implements Function0<MeasureFormat> {

                /* renamed from: f */
                final /* synthetic */ C5532a f14183f;

                C5534b(C5532a aVar) {
                    this.f14183f = aVar;
                    super(0);
                }

                public final MeasureFormat invoke() {
                    Locale c = this.f14183f.mo13158c();
                    FormatWidth formatWidth = FormatWidth.SHORT;
                    NumberFormat numberInstance = NumberFormat.getNumberInstance(this.f14183f.mo13158c());
                    numberInstance.setMaximumFractionDigits(1);
                    return MeasureFormat.getInstance(c, formatWidth, numberInstance);
                }
            }

            /* renamed from: app.zenly.locator.s.v.b.d$a$a$c */
            static final class C5535c extends C12933k implements Function0<MeasureFormat> {

                /* renamed from: f */
                final /* synthetic */ C5532a f14184f;

                C5535c(C5532a aVar) {
                    this.f14184f = aVar;
                    super(0);
                }

                public final MeasureFormat invoke() {
                    return MeasureFormat.getInstance(this.f14184f.mo13158c(), FormatWidth.SHORT, NumberFormat.getIntegerInstance(this.f14184f.mo13158c()));
                }
            }

            static {
                Class<C5532a> cls = C5532a.class;
                C12941s sVar = new C12941s(C12946x.m33834a((Class) cls), "fraction", "getFraction()Landroid/icu/text/MeasureFormat;");
                C12946x.m33839a((C12940r) sVar);
                C12941s sVar2 = new C12941s(C12946x.m33834a((Class) cls), "integer", "getInteger()Landroid/icu/text/MeasureFormat;");
                C12946x.m33839a((C12940r) sVar2);
                f14177d = new KProperty[]{sVar, sVar2};
            }

            private C5532a(Locale locale) {
                this.f14182c = locale;
                this.f14180a = C12896f.m33751a(new C5534b(this));
                this.f14181b = C12896f.m33751a(new C5535c(this));
            }

            /* renamed from: a */
            public final MeasureFormat mo13156a() {
                Lazy lazy = this.f14180a;
                KProperty kProperty = f14177d[0];
                return (MeasureFormat) lazy.getValue();
            }

            /* renamed from: b */
            public final MeasureFormat mo13157b() {
                Lazy lazy = this.f14181b;
                KProperty kProperty = f14177d[1];
                return (MeasureFormat) lazy.getValue();
            }

            /* renamed from: c */
            public final Locale mo13158c() {
                return this.f14182c;
            }

            public /* synthetic */ C5532a(Locale locale, C12928f fVar) {
                this(locale);
            }
        }

        private C5531a() {
        }

        /* renamed from: a */
        public String mo13155a(Context context, double d) {
            Measure measure;
            MeasureFormat measureFormat;
            Measure measure2;
            MeasureFormat b;
            MeasureFormat b2;
            C12932j.m33818b(context, "context");
            C5532a a = C5532a.f14179f.mo13159a(C7713f.m18776a(context));
            int i = C5538e.f14188a[C3229p.f9009i.mo9649a(context).ordinal()];
            String str = "cache.fraction";
            String str2 = "cache.integer";
            if (i == 1 || i == 2) {
                double c = C1300d.METERS.mo6417c(d);
                if (c >= ((double) 1)) {
                    if (c < ((double) 10)) {
                        b2 = a.mo13156a();
                        C12932j.m33815a((Object) b2, str);
                    } else {
                        b2 = a.mo13157b();
                        C12932j.m33815a((Object) b2, str2);
                    }
                    measure = new Measure(Double.valueOf(c), MeasureUnit.MILE);
                    String format = measureFormat.format(measure);
                    C12932j.m33815a((Object) format, "measureFormat.format(measure)");
                    return format;
                }
                b = a.mo13157b();
                C12932j.m33815a((Object) b, str2);
                measure2 = new Measure(Double.valueOf(C1300d.METERS.mo6415a(d)), MeasureUnit.FOOT);
            } else if (i == 3) {
                double b3 = C1300d.METERS.mo6416b(d);
                if (b3 >= ((double) 1)) {
                    if (b3 < ((double) 10)) {
                        measureFormat = a.mo13156a();
                        C12932j.m33815a((Object) measureFormat, str);
                    } else {
                        measureFormat = a.mo13157b();
                        C12932j.m33815a((Object) measureFormat, str2);
                    }
                    measure = new Measure(Double.valueOf(b3), MeasureUnit.KILOMETER);
                    String format2 = measureFormat.format(measure);
                    C12932j.m33815a((Object) format2, "measureFormat.format(measure)");
                    return format2;
                }
                b = a.mo13157b();
                C12932j.m33815a((Object) b, str2);
                measure2 = new Measure(Double.valueOf(d), MeasureUnit.METER);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            measure = measure2;
            String format22 = measureFormat.format(measure);
            C12932j.m33815a((Object) format22, "measureFormat.format(measure)");
            return format22;
        }
    }

    /* renamed from: app.zenly.locator.s.v.b.d$b */
    private static final class C5536b implements C5537c {

        /* renamed from: a */
        private static Locale f14185a;

        /* renamed from: b */
        private static java.text.NumberFormat f14186b;

        /* renamed from: c */
        public static final C5536b f14187c = new C5536b();

        static {
            Locale locale = Locale.ROOT;
            C12932j.m33815a((Object) locale, "Locale.ROOT");
            f14185a = locale;
            java.text.NumberFormat numberInstance = java.text.NumberFormat.getNumberInstance(f14185a);
            C12932j.m33815a((Object) numberInstance, "NumberFormat.getNumberInstance(currentLocale)");
            f14186b = numberInstance;
        }

        private C5536b() {
        }

        /* renamed from: b */
        private final String m15719b(Locale locale, double d) {
            return m15718a(locale, 0, d);
        }

        /* renamed from: a */
        public String mo13155a(Context context, double d) {
            String str;
            String quantityString;
            String str2;
            String str3;
            C12932j.m33818b(context, "context");
            Resources resources = context.getResources();
            Locale a = C7713f.m18776a(context);
            int i = C5539f.f14189a[C3229p.f9009i.mo9649a(context).ordinal()];
            if (i == 1 || i == 2) {
                double c = C1300d.METERS.mo6417c(d);
                if (c >= ((double) 1)) {
                    if (c < ((double) 10)) {
                        str2 = m15717a(a, c);
                    } else {
                        str2 = m15719b(a, (double) Math.round(c));
                    }
                    quantityString = resources.getQuantityString(R.plurals.cldr_unit_length_mile_narrow, (int) c, new Object[]{str2});
                } else {
                    double a2 = C1300d.METERS.mo6415a(d);
                    quantityString = resources.getQuantityString(R.plurals.cldr_unit_length_foot_narrow, (int) a2, new Object[]{m15719b(a, (double) Math.round(a2))});
                }
                C12932j.m33815a((Object) str, "if (miles >= 1) {\n      …)))\n                    }");
            } else if (i == 3) {
                double b = C1300d.METERS.mo6416b(d);
                if (b >= ((double) 1)) {
                    if (b < ((double) 10)) {
                        str3 = m15717a(a, b);
                    } else {
                        str3 = m15719b(a, (double) Math.round(b));
                    }
                    str = resources.getQuantityString(R.plurals.cldr_unit_length_kilometer_narrow, (int) b, new Object[]{str3});
                } else {
                    str = resources.getQuantityString(R.plurals.cldr_unit_length_meter_narrow, (int) d, new Object[]{m15719b(a, (double) Math.round(d))});
                }
                C12932j.m33815a((Object) str, "if (kilometers >= 1) {\n …)))\n                    }");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return str;
        }

        /* renamed from: a */
        private final String m15717a(Locale locale, double d) {
            return m15718a(locale, 1, d);
        }

        /* renamed from: a */
        private final String m15718a(Locale locale, int i, double d) {
            String format;
            synchronized (C12946x.m33834a(C5536b.class)) {
                if (!Objects.equals(f14185a, locale)) {
                    f14185a = locale;
                    java.text.NumberFormat numberInstance = java.text.NumberFormat.getNumberInstance(locale);
                    C12932j.m33815a((Object) numberInstance, "NumberFormat.getNumberInstance(locale)");
                    f14186b = numberInstance;
                }
                f14186b.setMaximumFractionDigits(i);
                format = f14186b.format(d);
                C12932j.m33815a((Object) format, "numberFormat.format(distance)");
            }
            return format;
        }
    }

    /* renamed from: app.zenly.locator.s.v.b.d$c */
    private interface C5537c {
        /* renamed from: a */
        String mo13155a(Context context, double d);
    }

    static {
        C5537c cVar;
        new C5530d();
        if (VERSION.SDK_INT >= 24) {
            cVar = C5531a.f14176a;
        } else {
            cVar = C5536b.f14187c;
        }
        f14175a = cVar;
    }

    private C5530d() {
    }

    /* renamed from: a */
    public static final String m15709a(Context context, double d) {
        C12932j.m33818b(context, "context");
        return f14175a.mo13155a(context, d);
    }
}
