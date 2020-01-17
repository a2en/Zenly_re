package kotlin.p411u;

/* renamed from: kotlin.u.c */
public final class C13039c {
    /* renamed from: a */
    private static final int m34040a(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: b */
    public static final int m34044b(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            return i2 - m34041a(i2, i, i3);
        } else if (i3 < 0) {
            return i <= i2 ? i2 : i2 + m34041a(i, i2, -i3);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    /* renamed from: a */
    private static final long m34042a(long j, long j2) {
        long j3 = j % j2;
        return j3 >= 0 ? j3 : j3 + j2;
    }

    /* renamed from: a */
    private static final int m34041a(int i, int i2, int i3) {
        return m34040a(m34040a(i, i3) - m34040a(i2, i3), i3);
    }

    /* renamed from: a */
    private static final long m34043a(long j, long j2, long j3) {
        return m34042a(m34042a(j, j3) - m34042a(j2, j3), j3);
    }

    /* renamed from: b */
    public static final long m34045b(long j, long j2, long j3) {
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i > 0) {
            if (j >= j2) {
                return j2;
            }
            return j2 - m34043a(j2, j, j3);
        } else if (i >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (j <= j2) {
            return j2;
        } else {
            return j2 + m34043a(j, j2, -j3);
        }
    }
}
