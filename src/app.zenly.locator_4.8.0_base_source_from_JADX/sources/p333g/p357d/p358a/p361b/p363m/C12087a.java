package p333g.p357d.p358a.p361b.p363m;

/* renamed from: g.d.a.b.m.a */
public final class C12087a {
    /* renamed from: a */
    public static float m31899a(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    /* renamed from: a */
    public static float m31900a(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f3 - f), (double) (f4 - f2));
    }

    /* renamed from: b */
    private static float m31902b(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    /* renamed from: a */
    public static float m31901a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m31902b(m31900a(f, f2, f3, f4), m31900a(f, f2, f5, f4), m31900a(f, f2, f5, f6), m31900a(f, f2, f3, f6));
    }
}
