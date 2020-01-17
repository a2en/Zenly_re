package kotlin.ranges;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.ranges.k */
class C12972k extends C12971j {
    /* renamed from: a */
    public static ClosedFloatingPointRange<Double> m33882a(double d, double d2) {
        return new C12958a(d, d2);
    }

    /* renamed from: a */
    public static final void m33883a(boolean z, Number number) {
        C12932j.m33818b(number, "step");
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Step must be positive, was: ");
            sb.append(number);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
