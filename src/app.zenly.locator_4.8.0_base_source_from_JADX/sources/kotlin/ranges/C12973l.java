package kotlin.ranges;

import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12960c.C12961a;

/* renamed from: kotlin.ranges.l */
class C12973l extends C12972k {
    /* renamed from: a */
    public static int m33885a(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    /* renamed from: a */
    public static long m33887a(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    /* renamed from: a */
    public static C12960c m33888a(C12960c cVar, int i) {
        C12932j.m33818b(cVar, "$this$step");
        C12972k.m33883a(i > 0, (Number) Integer.valueOf(i));
        C12961a aVar = C12960c.f33548h;
        int first = cVar.getFirst();
        int last = cVar.getLast();
        if (cVar.mo37336a() <= 0) {
            i = -i;
        }
        return aVar.mo37344a(first, last, i);
    }

    /* renamed from: b */
    public static float m33889b(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    /* renamed from: b */
    public static int m33890b(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    /* renamed from: b */
    public static long m33891b(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    /* renamed from: c */
    public static float m33892c(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    /* renamed from: c */
    public static C12960c m33893c(int i, int i2) {
        return C12960c.f33548h.mo37344a(i, i2, -1);
    }

    /* renamed from: d */
    public static C12963e m33894d(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return C12963e.f33557j.mo37347a();
        }
        return new C12963e(i, i2 - 1);
    }

    /* renamed from: a */
    public static int m33886a(int i, int i2, int i3) {
        if (i2 > i3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(i3);
            sb.append(" is less than minimum ");
            sb.append(i2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (i < i2) {
            return i2;
        } else {
            return i > i3 ? i3 : i;
        }
    }

    /* renamed from: a */
    public static float m33884a(float f, float f2, float f3) {
        if (f2 > f3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(f3);
            sb.append(" is less than minimum ");
            sb.append(f2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        } else if (f < f2) {
            return f2;
        } else {
            return f > f3 ? f3 : f;
        }
    }
}
