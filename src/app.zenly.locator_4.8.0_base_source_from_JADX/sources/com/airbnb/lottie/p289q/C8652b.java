package com.airbnb.lottie.p289q;

/* renamed from: com.airbnb.lottie.q.b */
public class C8652b {
    /* renamed from: a */
    private static float m20150a(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: b */
    private static float m20152b(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: a */
    public static int m20151a(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float f3 = ((float) ((i >> 8) & 255)) / 255.0f;
        float f4 = ((float) (i & 255)) / 255.0f;
        float f5 = ((float) ((i2 >> 24) & 255)) / 255.0f;
        float f6 = ((float) ((i2 >> 16) & 255)) / 255.0f;
        float f7 = ((float) ((i2 >> 8) & 255)) / 255.0f;
        float f8 = ((float) (i2 & 255)) / 255.0f;
        float a = m20150a(((float) ((i >> 16) & 255)) / 255.0f);
        float a2 = m20150a(f3);
        float a3 = m20150a(f4);
        float a4 = m20150a(f6);
        float a5 = a2 + ((m20150a(f7) - a2) * f);
        float a6 = a3 + (f * (m20150a(f8) - a3));
        float f9 = (f2 + ((f5 - f2) * f)) * 255.0f;
        return (Math.round(m20152b(a + ((a4 - a) * f)) * 255.0f) << 16) | (Math.round(f9) << 24) | (Math.round(m20152b(a5) * 255.0f) << 8) | Math.round(m20152b(a6) * 255.0f);
    }
}
