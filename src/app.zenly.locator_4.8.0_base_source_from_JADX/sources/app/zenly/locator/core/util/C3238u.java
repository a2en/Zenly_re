package app.zenly.locator.core.util;

import java.util.Random;

/* renamed from: app.zenly.locator.core.util.u */
public final class C3238u {

    /* renamed from: a */
    private static final ThreadLocal<Random> f9019a = new C3239a();

    /* renamed from: app.zenly.locator.core.util.u$a */
    static class C3239a extends ThreadLocal<Random> {
        C3239a() {
        }

        /* access modifiers changed from: protected */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: a */
    public static float m10269a(float f, float f2) {
        return (((Random) f9019a.get()).nextFloat() * (f2 - f)) + f;
    }

    /* renamed from: a */
    public static int m10270a(int i, int i2) {
        return ((Random) f9019a.get()).nextInt(i2 - i) + i;
    }

    /* renamed from: a */
    public static double m10268a(double d, double d2) {
        return (((Random) f9019a.get()).nextDouble() * (d2 - d)) + d;
    }

    /* renamed from: a */
    public static long m10272a(long j, long j2) {
        return Math.round(m10268a((double) j, (double) j2));
    }

    /* renamed from: a */
    public static int m10271a(int[] iArr) {
        return iArr[m10270a(0, iArr.length)];
    }
}
