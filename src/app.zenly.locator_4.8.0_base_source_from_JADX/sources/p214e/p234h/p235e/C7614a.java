package p214e.p234h.p235e;

import android.graphics.Color;

/* renamed from: e.h.e.a */
public final class C7614a {
    static {
        new ThreadLocal();
    }

    /* renamed from: a */
    private static int m18490a(int i, int i2) {
        return 255 - (((255 - i2) * (255 - i)) / 255);
    }

    /* renamed from: b */
    public static int m18492b(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int a = m18490a(alpha2, alpha);
        return Color.argb(a, m18491a(Color.red(i), alpha2, Color.red(i2), alpha, a), m18491a(Color.green(i), alpha2, Color.green(i2), alpha, a), m18491a(Color.blue(i), alpha2, Color.blue(i2), alpha, a));
    }

    /* renamed from: c */
    public static int m18493c(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* renamed from: a */
    private static int m18491a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * 255) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * 255);
    }
}
