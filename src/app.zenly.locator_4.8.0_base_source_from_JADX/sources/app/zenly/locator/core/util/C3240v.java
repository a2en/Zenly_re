package app.zenly.locator.core.util;

import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12938p;
import kotlin.jvm.internal.C12939q;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.ranges.ClosedRange;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p259h.C7683c;

/* renamed from: app.zenly.locator.core.util.v */
public final class C3240v {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f9020a;

    /* renamed from: b */
    private static final ReadWriteProperty f9021b = C7683c.m18707a(C3241a.f9022f);

    /* renamed from: app.zenly.locator.core.util.v$a */
    static final class C3241a extends C12933k implements Function0<Random> {

        /* renamed from: f */
        public static final C3241a f9022f = new C3241a();

        C3241a() {
            super(0);
        }

        public final Random invoke() {
            return new Random();
        }
    }

    static {
        C12939q qVar = new C12939q(C12946x.m33835a(C3240v.class, "app_storeRelease"), "random", "getRandom()Ljava/util/Random;");
        C12946x.m33838a((C12938p) qVar);
        f9020a = new KProperty[]{qVar};
    }

    /* renamed from: a */
    public static final double m10273a(ClosedRange<Double> closedRange) {
        C12932j.m33818b(closedRange, "$this$random");
        return (m10276a().nextDouble() * (((Number) closedRange.getEndInclusive()).doubleValue() - ((Number) closedRange.getStart()).doubleValue())) + ((Number) closedRange.getStart()).doubleValue();
    }

    /* renamed from: a */
    private static final Random m10276a() {
        return (Random) f9021b.getValue(null, f9020a[0]);
    }

    /* renamed from: a */
    public static final float m10274a(ClosedRange<Float> closedRange) {
        C12932j.m33818b(closedRange, "$this$random");
        return (m10276a().nextFloat() * (((Number) closedRange.getEndInclusive()).floatValue() - ((Number) closedRange.getStart()).floatValue())) + ((Number) closedRange.getStart()).floatValue();
    }

    /* renamed from: a */
    public static final int m10275a(ClosedRange<Integer> closedRange) {
        C12932j.m33818b(closedRange, "$this$random");
        return m10276a().nextInt(((Number) closedRange.getEndInclusive()).intValue() - ((Number) closedRange.getStart()).intValue()) + ((Number) closedRange.getStart()).intValue();
    }
}
