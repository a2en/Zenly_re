package app.zenly.locator.p143s.p160v.p161b;

import android.content.Context;
import android.content.res.Resources;
import android.icu.text.MeasureFormat;
import android.icu.text.MeasureFormat.FormatWidth;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.os.Build.VERSION;
import app.zenly.android.base.util.C1302f;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3229p;
import java.text.NumberFormat;
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

/* renamed from: app.zenly.locator.s.v.b.j */
public final class C5544j {

    /* renamed from: a */
    private static final C5550c f14193a;

    /* renamed from: app.zenly.locator.s.v.b.j$a */
    private static final class C5545a implements C5550c {

        /* renamed from: a */
        public static final C5545a f14194a = new C5545a();

        /* renamed from: app.zenly.locator.s.v.b.j$a$a */
        private static final class C5546a {

            /* renamed from: c */
            static final /* synthetic */ KProperty[] f14195c;
            /* access modifiers changed from: private */

            /* renamed from: d */
            public static C5546a f14196d;

            /* renamed from: e */
            public static final C5547a f14197e = new C5547a(null);

            /* renamed from: a */
            private final Lazy f14198a;

            /* renamed from: b */
            private final Locale f14199b;

            /* renamed from: app.zenly.locator.s.v.b.j$a$a$a */
            public static final class C5547a {
                private C5547a() {
                }

                /* renamed from: a */
                public final C5546a mo13165a(Locale locale) {
                    C5546a c;
                    C12932j.m33818b(locale, "locale");
                    synchronized (C12946x.m33834a(C5546a.class)) {
                        C5546a c2 = C5546a.f14196d;
                        c = C12932j.m33817a(c2 != null ? c2.mo13164b() : null, (Object) locale) ? C5546a.f14196d : null;
                        if (c == null) {
                            c = new C5546a(locale, null);
                            C5546a.f14196d = c;
                        }
                    }
                    return c;
                }

                public /* synthetic */ C5547a(C12928f fVar) {
                    this();
                }
            }

            /* renamed from: app.zenly.locator.s.v.b.j$a$a$b */
            static final class C5548b extends C12933k implements Function0<MeasureFormat> {

                /* renamed from: f */
                final /* synthetic */ C5546a f14200f;

                C5548b(C5546a aVar) {
                    this.f14200f = aVar;
                    super(0);
                }

                public final MeasureFormat invoke() {
                    return MeasureFormat.getInstance(this.f14200f.mo13164b(), FormatWidth.NARROW);
                }
            }

            static {
                C12941s sVar = new C12941s(C12946x.m33834a(C5546a.class), "format", "getFormat()Landroid/icu/text/MeasureFormat;");
                C12946x.m33839a((C12940r) sVar);
                f14195c = new KProperty[]{sVar};
            }

            private C5546a(Locale locale) {
                this.f14199b = locale;
                this.f14198a = C12896f.m33751a(new C5548b(this));
            }

            /* renamed from: a */
            public final MeasureFormat mo13163a() {
                Lazy lazy = this.f14198a;
                KProperty kProperty = f14195c[0];
                return (MeasureFormat) lazy.getValue();
            }

            /* renamed from: b */
            public final Locale mo13164b() {
                return this.f14199b;
            }

            public /* synthetic */ C5546a(Locale locale, C12928f fVar) {
                this(locale);
            }
        }

        private C5545a() {
        }

        /* renamed from: a */
        public String mo13162a(Context context, double d) {
            Measure measure;
            C12932j.m33818b(context, "context");
            int i = C5551k.f14204a[C3229p.f9009i.mo9649a(context).ordinal()];
            if (i == 1 || i == 2) {
                measure = new Measure(Long.valueOf(Math.round(C1302f.METERS_PER_SECOND.mo6420c(d))), MeasureUnit.MILE_PER_HOUR);
            } else if (i == 3) {
                measure = new Measure(Long.valueOf(Math.round(C1302f.METERS_PER_SECOND.mo6418a(d))), MeasureUnit.KILOMETER_PER_HOUR);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            String formatMeasures = C5546a.f14197e.mo13165a(C7713f.m18776a(context)).mo13163a().formatMeasures(new Measure[]{measure});
            C12932j.m33815a((Object) formatMeasures, "Cache.get(UIUtils.getDis…t.formatMeasures(measure)");
            return formatMeasures;
        }
    }

    /* renamed from: app.zenly.locator.s.v.b.j$b */
    private static final class C5549b implements C5550c {

        /* renamed from: a */
        private static Locale f14201a;

        /* renamed from: b */
        private static NumberFormat f14202b;

        /* renamed from: c */
        public static final C5549b f14203c = new C5549b();

        static {
            Locale locale = Locale.ROOT;
            C12932j.m33815a((Object) locale, "Locale.ROOT");
            f14201a = locale;
            NumberFormat numberInstance = NumberFormat.getNumberInstance(f14201a);
            C12932j.m33815a((Object) numberInstance, "NumberFormat.getNumberInstance(currentLocale)");
            f14202b = numberInstance;
        }

        private C5549b() {
        }

        /* renamed from: a */
        public String mo13162a(Context context, double d) {
            C12932j.m33818b(context, "context");
            Resources resources = context.getResources();
            Locale a = C7713f.m18776a(context);
            int i = C5552l.f14205a[C3229p.f9009i.mo9649a(context).ordinal()];
            if (i == 1 || i == 2) {
                double c = C1302f.METERS_PER_SECOND.mo6420c(d);
                String quantityString = resources.getQuantityString(R.plurals.cldr_unit_speed_milePerHour_narrow, (int) c, new Object[]{m15736a(a, (double) Math.round(c))});
                C12932j.m33815a((Object) quantityString, "res.getQuantityString(R.…, round(mph).toDouble()))");
                return quantityString;
            } else if (i == 3) {
                double a2 = C1302f.METERS_PER_SECOND.mo6418a(d);
                String quantityString2 = resources.getQuantityString(R.plurals.cldr_unit_speed_kilometerPerHour_narrow, (int) a2, new Object[]{m15736a(a, (double) Math.round(a2))});
                C12932j.m33815a((Object) quantityString2, "res.getQuantityString(R.…, round(kmh).toDouble()))");
                return quantityString2;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        /* renamed from: a */
        private final String m15736a(Locale locale, double d) {
            String format;
            synchronized (C12946x.m33834a(C5549b.class)) {
                if (!C12932j.m33817a((Object) f14201a, (Object) locale)) {
                    f14201a = locale;
                    NumberFormat numberInstance = NumberFormat.getNumberInstance(locale);
                    C12932j.m33815a((Object) numberInstance, "NumberFormat.getNumberInstance(locale)");
                    f14202b = numberInstance;
                    f14202b.setMaximumFractionDigits(0);
                }
                format = f14202b.format(d);
                C12932j.m33815a((Object) format, "numberFormat.format(distance)");
            }
            return format;
        }
    }

    /* renamed from: app.zenly.locator.s.v.b.j$c */
    private interface C5550c {
        /* renamed from: a */
        String mo13162a(Context context, double d);
    }

    static {
        C5550c cVar;
        new C5544j();
        if (VERSION.SDK_INT >= 24) {
            cVar = C5545a.f14194a;
        } else {
            cVar = C5549b.f14203c;
        }
        f14193a = cVar;
    }

    private C5544j() {
    }

    /* renamed from: a */
    public static final String m15729a(Context context, double d) {
        C12932j.m33818b(context, "context");
        return f14193a.mo13162a(context, d);
    }
}
